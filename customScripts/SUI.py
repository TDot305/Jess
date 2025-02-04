#!/usr/bin/env python3
import os
import pygraphviz as pgv
import ntpath
import time

from octopus.server.DBInterface import DBInterface
from joern.shelltool.PlotConfiguration import PlotConfiguration
from joern.shelltool.PlotResult import NodeResult, EdgeResult

###################### Configuration options for input format ######################
console = False

################# Configuration options for entry point handling (only affecting string/identifier/feature and not id) #################
includeBackwardSlice = True #Recommended: True. Classical syntax preserving backward slice, includes all statements that appear previously in the control flow and are reachable either via dataflow or are structural (AST) parents.
includeParentBlocks = False # Recommended: False. Preserve syntactical structure, e.g. ifStatements around the entry point. Does not add the parent function to analysis (if existing). Also adds local declares. Potentially the smallest number of entry points, but also not complete (no data dependencies taken into account)
includeLocalDataflows = False # Recommended: False.  Makes the slice bigger, but (potentially) not so much as the option underneath. Recursively includes all statements inside the function of an entry point that have a dataflow connection (read/write).
includeParentFunction = False # Recommended: False. Makes the slice bigger, not recommended for fine-grained slicing. Most complete, but potentially overfitting.

################# Configuration options for Semantic Unit identification #################
includeEnclosedCode = True # Recommended: True.
connectIfWithElse = True # Recommended: True.
followDataflows = False # Recommended: False.
searchDirsRecursively = False # Recommended: False.
includeOtherFeatures = False # Recommended: False.
lookForAllFunctionCalls = False # Recommended: False.
lookForAllMacroUsages = False # Recommended: False.

############### Further options to refine the Semantic Unit after analysis ###############
# --- SU's files ---
addAllFilesIncludedBySUFilesRecursively = True # Recommended: True. Has an effect on the addition of all analyses that are based on SU files (as this extension happens before the other analyses)
# --- Includes ---
addAllExternalLibraryIncludes = False # Recommended: False.
addExternalLibraryIncludesOnlyForSUFiles = True # Recommended: True. Has no effect if addAllExternalLibraryIncludes is true
addAllInternalFileIncludes = False # Recommended: False.
addInternalFileIncludesOnlyForSUFiles = True # Recommended: True. Has no effect if addAllInternalFileIncludes is true
# --- Global datatype/variable declarations
addOnlyProbablyUsedGlobalDeclarationsOfVariables = False # Recommended: False. Works good for simple declares, but misses content of e.g. structs or enums
addAllGoblaDelcarationsOfVariablesForSUFiles = True # Recommended: True. Has no effect if the addOnlyProbablyUsedGlobalDeclarationsOfVariables is true     
addAllGoblaDelcarationsOfVariables = False # Recommended: False. Has no effect if the addOnlyProbablyUsedGlobalDeclarationsOfVariables is true. Potentially very big overhead. Needs addAllExternalFileIncludes and addAllInternalFileIncludes, as the include statements are not checked again.
# --- Defines ---
addOnlyProbablyUsedNonFunctionLikeDefines = False # Recommended: False. Overwrites the other two options.
addNonFunctionLikeDefinesForSUFiles = True # Recommended: True. Has no effect if addOnlyProbablyUsedNonFunctionLikeDefines is true   
addAllNonFunctionLikeDefines = False # Recommended: False. Has no effect if addOnlyProbablyUsedNonFunctionLikeDefines or addNonFunctionLikeDefinesForSUFiles is true. Potentially very big overhead. Needs addAllExternalFileIncludes and addAllInternalFileIncludes
# --- These happen at the end ---
addVariabilityInformation = True 
addAssociatedComments = True  

######################### Configuration options for graph output #########################
generateOnlyAST = False
generateOnlyVisibleCode = True
showOnlyStructuralEdges = True
plotGraph = True

#################### Configuration options for debug output (console) ####################
DEBUG = False
showStatistics = True

##########################################################################################

# Work with sets, as they are way faster and allow only unique elements 
# Ids of entry point vertice, or name of entry feature (configuration option), or identifier of any code fragment, or any generic occurance of a string
# You can select all four, if you want additional entry points. Empty sets should be declared as set() and not {}
# The id should be of a node that can appear directly in the code (e.g. FunctionDef and not its Identifier)
# # Set the project DB and entry points manually here has only an effect if consoleInput is deactivated # #
projectName = 'DonorProject'
entryPointIds = list()
entryFeatureNames = list()
entryIdentifiers = list()
entryStrings = ['kwset']

# List with statement types that appear directly in the code (including CompoundStatement for structural reasons)
visibleStatementTypes = ['CustomNode', 'DeclByType', 'FunctionDef', 'CompoundStatement', 'Statement', 'DeclStmt', 'StructUnionEnum', 'FunctionPointerDeclare', 'IfStatement', 'ElseStatement', 'SwitchStatement', 'ForStatement', 'DoStatement', 'WhileStatement', 'BreakStatement', 'ContinueStatement', 'GotoStatement', 'Label', 'ReturnStatement', 'ExpressionStatement', 'IdentifierDeclStatement', 'PreIfStatement', 'PreElIfStatement', 'PreElseStatement', 'PreEndIfStatement', 'PreDefine', 'PreUndef', 'PreDiagnostic', 'PreOther', 'PreInclude', 'PreIncludeNext', 'PreLine', 'PrePragma', 'UsingDirective', 'BlockCloser', 'Comment', 'File', 'Directory']

# Initialize the needed variables and runs the desired process (interactive console, predefined evaluation mode via workflow.py, or automated process with predefined db and entry points)
def initializeSUI(EVALUATION, entryPointType, pathOrNameOrIdentifierOrString, statementLine, statementType):
    global db, start_time, semanticUnit, checkedVertices, analysisList, externalFunctionsSet, externalMacrosSet, SUFilesSet, alreadyCheckedIdentifierDict, alreadyCheckedMacroIdentifierDict
    
    # For time measurements
    start_time = time.time()
    # Initialize DB interface
    db = DBInterface()
    # Initialize empty Semantic Unit (result) set
    semanticUnit = set()
    # Initialize empty set of checked vertices (because we only need to check the vertices once)
    checkedVertices = set()
    # Initialize empty list (needs to be iterable) of vertices that will be checked
    analysisList = list()
    # Collect all external functions, as we do not need to look for their declaration more than once
    externalFunctionsSet = set()
    # Collect all external macros, as we do not need to look for their declaration more than once
    externalMacrosSet = set()
    # Collect all files that are part of the SU, so we can reuse this information instead of querying multiple times
    SUFilesSet = set()
    # Collect all identifiers (value as list) for a file (key), as we do not need to look for file-identifier pair declaration more than once 
    alreadyCheckedIdentifierDict = dict()
    # Same list as above, but for macroCalls 
    alreadyCheckedMacroIdentifierDict = dict()

    # Input of entry points
    if (EVALUATION):
        workflowInput(entryPointType, pathOrNameOrIdentifierOrString, statementLine, statementType)         
    elif (console):
        consoleInput()    
    else: 
        # projectName must be set manually
        print("* * * Please set project name and entry point manually (or set console to 'True') in the SUI.py * * * ")
        db.connectToDatabase(projectName)
        print("Project is set to: "+projectName)

    # Start identification process    
    identifySemanticUnits() 



# Main function 
def identifySemanticUnits ():
    global db
    
    # Check if a feature is selected as entry point
    if (len(entryFeatureNames) > 0):        
        result = getNodeParents(entryFeatureNames, "feature")
        if (len(result) > 0):
            print("Found feature as entry point, updated entry points: "+str(result)+"\n") 
            entryPointIds.extend(result)
        
    # Check if any identifier is selected as entry point
    if (len(entryIdentifiers) > 0):        
        result = getNodeParents(entryIdentifiers, "identifier")
        if (len(result) > 0):
            print("Found generic identifier as entry point, updated entry points: "+str(result)+"\n") 
            entryPointIds.extend(result)        

    # Check if any generic string is selected as entry point
    if (len(entryStrings) > 0):        
        result = getNodeParents(entryStrings, "string")
        if (len(result) > 0):
            print("Found generic string as entry point, updated entry points: "+str(result)+"\n") 
            entryPointIds.extend(result) 
            
        
    # Add the initial list of nodes to the analysis set
    analysisList.extend(entryPointIds)
    
    
    print("Starting analysis...")
    print("--------------------------------------------------------------------------------- \n")
    
    # For elements that change?
    for node in analysisList:
        # Check nodes only once
        if ((not node in checkedVertices) and node != ""):         
            analyzeNode(node)
            checkedVertices.add(node)
            semanticUnit.add(node)
            
        # Remove node after the analysis
        # analysisList.remove(node)          
      
     
    if (len(semanticUnit) > 1):
        # Adapt results for syntactical correctness       
        # Add the function definition 
        semanticUnit.update(addParentFunctions(list(semanticUnit)))
                
        #Collect the file nodes of the SU
        getSUsFileNodes()
        
        # Extend SU files by all included files outgoing from the original SU
        if (addAllFilesIncludedBySUFilesRecursively):
            addFilesIncludedBySUFilesRecursively()
        
        # Add all includes (internal + external) from the whole project
        if(addAllExternalLibraryIncludes and addAllInternalFileIncludes):
            addAllIncludes()
        else: 
                
            # Add includes of (external) libraries from the whole project
            if(addAllExternalLibraryIncludes):
                addAllExternalIncludes()
            # Add includes of external libraries only for files that are part of the SU
            elif(addExternalLibraryIncludesOnlyForSUFiles):
                addExternalIncludesForSUFiles() 

            # Add includes of (interal) files from the whole project
            if(addAllInternalFileIncludes):
                addAllInteralIncludes()
            # Add includes of interal files only for files that are part of the SU
            elif(addInternalFileIncludesOnlyForSUFiles):
                addInteralIncludesForSUFiles()

                   
        # Include only those declarations, for which there is an identifier in the SU (indicates usage, but no guarantee, as we do not analyze the scope) 
        if(addOnlyProbablyUsedGlobalDeclarationsOfVariables):
            addUsedGlobalDeclares()             
        # Include all global declarations from files of the SU 
        elif (addAllGoblaDelcarationsOfVariablesForSUFiles):        
            addGlobalDeclaresForSUFiles() 
        # Include all global declarations of variables   
        elif (addAllGoblaDelcarationsOfVariables):        
            addGlobalDeclares() 

                    
        # Check for includes of non-function-like #defines whose identifier appears inside the SU (indicates a "usage")  
        if(addOnlyProbablyUsedNonFunctionLikeDefines):
            addProbablyUsedDefines() 
        # Check for includes of non-function-like #defines in files that are part of the SU
        elif(addNonFunctionLikeDefinesForSUFiles):
            addDefinesForSUFiles()
        # Check for includes of non-function-like #defines
        elif(addAllNonFunctionLikeDefines):
            addDefines()

                               
        #Check for variability information
        if(addVariabilityInformation):
            addVariability()
        
        #Check for comments
        if(addAssociatedComments):
            addComments()       
 
        #Print names of all functions that need external libraries (or that we failed to find a declaration for)
        print("The following functions/macros have a declaration outside of the project's code (e.g. in used libraries): ")
        if (not externalFunctionsSet):
            print("None")
        else:
            print(str(externalFunctionsSet))
        
        # Get the #ifndef #def and #endif for header files? Currently, we get that when addVariability is true
        
        print("Analysis finished successfull!")
        print ("Analysis took", time.time() - start_time, "seconds to run")
        print("--------------------------------------------------------------------------------- \n")
        
        
        if (showStatistics):
            #Count number of nodes
            countNodes()

        if (plotGraph):
            print("Making graph...")
            # Plot resulting graph
            plotResults()

        # Write resulting Ids to file
        fileOutput()
            
        # Output resulting Ids on console
        #for x in semanticUnit: print(x)

        # Print code results
        #codeOutput()

        # Print node results
        #nodeOutput()
    else:
        print("SemanticUnit is empty!")
        
    # Finally close db connection and release the shell
    db.runGremlinQuery("quit")   


####################################### Rules ###############################################   


# Decides based on the vertice type, which functions are called 
def analyzeNode (currentNode):
    global DEBUG
    # Reset current result
    result = ""       
    
    # Get type of current vertice 
    query = """g.V(%s).values('type')""" % (currentNode)
    type = db.runGremlinQuery(query)   

    if (DEBUG) : print("Check current node: "+str(currentNode)+" with type: "+str(type))    
    
    # Inform the user if a node id does not exist
    if(len(type)< 1):
        print("################################################################################################")
        print("No vertice with the given id \""+str(currentNode)+"\" found. Please check your database for an existing vertice id.")
        print("################################################################################################")
        return

################################ No analysis ########################################################################################
################# No meaningful connections, no direct appearence in the code, already contained in other analyses ##################

    if (type[0] in ['CompoundStatement','IncDec','UnaryOperator','AdditiveExpression','PrimaryExpression','UnaryOperationExpression', 'ArrayIndexing', 'RelationalExpression', 'Sizeof', 'SizeofOperand', 'ReturnType','CFGEntryNode','CFGExitNode','PreMacroParameters','BreakStatement', 'ContinueStatement','Symbol','IdentifierDeclType','IdentifierDecl','ParameterType','RelationalExpression','Decl', 'DeclByType', 'StructUnionEnum', 'FunctionPointerDeclare', 'Label', 'PreInclude', 'PreIncludeNext', 'Statement', 'Comment', 'CustomNode']):
        #There are no rules for these node types, so just skip them
        return

################################ Structural relations ###################################################################
    # Get all included files if current vertice is a Directory
    if (type[0] == "Directory"):
        # Add only the contained files
        if (searchDirsRecursively == False):
            result = set(getIncludedFiles(currentNode))
        else:
            result = set(getIncludedFilesAndDirectories(currentNode))
        
        # For every enclosed file, get related elements
        analysisList.extend(result)
        # Print result
        if (DEBUG): print("Result structural relation: "+str(result)+"\n")
        
        #Early return because we have no other rules for this node type
        return
        
    # Get all enclosed lines of code if current vertice is a File
    if (type[0] == "File"):
        result = set(getEnclosedCodeOfFile(currentNode))
        # For every enclosed code line, get related elements
        analysisList.extend(result)
        # Print result
        if (DEBUG): print("Result structural relation: "+str(result)+"\n")
        
        #Early return because we have no other rules for this node type
        return        
        
    # Get enclosed vertices if current vertice is a function declaration
    if ((type[0] == "FunctionDef") and (includeEnclosedCode == True)):
        result = set(getASTChildren(currentNode))           
        # For each enclosed vertice, add to the Semantic Unit and get related elements
        analysisList.extend(result)         
         # Print result
        if (DEBUG): print("Result structural relation: "+str(result)+"\n")
        
    # Get enclosed vertices if current vertice is a for-, while- or if-statement
    if (type[0] in ["IfStatement","ForStatement","WhileStatement","DoStatement","SwitchStatement"]) and (includeEnclosedCode == True):             
        result = set(getASTChildren(currentNode))
        # For each enclosed vertice, add to the Semantic Unit and get related elements
        analysisList.extend(result) 
         # Print result
        if (DEBUG): print("Result structural relation: "+str(result)+"\n")

    # Get only the Syntax Elements of the selected statement     
    elif (type[0] in ["IfStatement","ForStatement","WhileStatement"]):       
        # Get corresponding else-statement only if the configuration is selected
        if ((type[0] == "IfStatement") and (connectIfWithElse == True)):
            result = set(getElse(currentNode))           
            
            if(result in semanticUnit):
                print("Already contained in SU!")
                                   
            # Just add, no further analysis
            semanticUnit.update(result)                        
                            
        result = set(getInitAndCondition(currentNode))
        # For each enclosed vertice, add to the Semantic Unit and get related elements
        analysisList.extend(result)         
         # Print result
        if (DEBUG): print("Result structural relation: "+str(result)+"\n")
                   
    # Get the corresponding if, if current vertice is an else-statement
    if (type[0] == "ElseStatement"):            
        result = set(getIfStatement(currentNode))
        if (includeEnclosedCode):
            result.update(set(getASTChildren(currentNode)))
        # Get related elements of the if/else-statement
        analysisList.extend(result)         
         # Print result
        if (DEBUG): print("Result structural relation: "+str(result)+"\n")

    # Get the AST children if current vertice is an expression, IdentifierDeclStatement, condition, statement or PreDefine (they could contain Callees)
    if (type[0] in ["ExpressionStatement", "Condition", "IdentifierDeclStatement", "PreDefine", "PreDiagnostic", "PreOther"]):                       
        result = set(getASTChildren(currentNode))
        # Get related elements of the AST children
        analysisList.extend(result)          
         # Print result
        if (DEBUG): print("Result structural relation: "+str(result)+"\n")
               
        
##################################################################################################################           
################################### Call relations ############################################################### 
       
    # Get called function or function-like macro if current vertice is a callee
    if (type[0] == "Callee"): 
        # Do not look at CallExpression, one query is enough. Sometimes, we even do not have a CallExpression, just a Callee                  
        result = set(getCalledFunctionDefOrMacro(currentNode, type[0]))                
        # Get related elements of the called function
        analysisList.extend(result)
         # Print result
        if (DEBUG): print("Result call relation for a Callee: "+str(result)+"\n")       
        
        #Early return because we have no other rules for this node type
        return        
  
    # Get "called" function-like macro if current vertice is a macroCall (e.g. funcCall without ;)
    if (type[0] == "MacroCall"):     
        result = set(getCalledMacroDef(currentNode, type[0]))                
        # Get related elements of the called function
        analysisList.extend(result)
         # Print result
        if (DEBUG): print("Result call relation for a macroCall: "+str(result)+"\n")   
         
        #Early return because we have no other rules for this node type
        return        
        
    #These nodes can contain calls to macros or functions (TDB 'preprocessor_fragment', prePragma? )    
    if (type[0] in ('PreIfCondition', 'PreMacro')):
        result = set(getCalledFunctionDefOrMacro(currentNode, type[0]))  
        # Add FunctionDef to the Semantic Unit and get related elements
        analysisList.extend(result)
         # Print result
        if (DEBUG): print("Result call relation for a Callee in PreIfCondition or PreMacro: "+str(result)+"\n")          
        
    # For a given function name, return all possible callees    
    if ((type[0] == "FunctionDef") and (lookForAllFunctionCalls == True)): 
        result = set(getCallsToFunction(currentNode))
        analysisList.extend(result)
         # Print result
        if (DEBUG): print("Result call relation for a FunctionDef: "+str(result)+"\n")
    
    # Get macro identifier    
    if (type[0] in ["PreUndef","PreDefine"]) and (lookForAllMacroUsages == True):    
        result = set(getMacroIdentifier(currentNode))
        analysisList.extend(result)
         # Print result
        if (DEBUG): print("Result call relation for a PreDefine: "+str(result)+"\n")       

    # Get all statements (limited to preprocessor and function-like macro calls) connected to the PreMacroIdentifier     
    if (type[0] == "PreMacroIdentifier") and (lookForAllMacroUsages == True):  
        result = set(getRelationsToMacro(currentNode))
        analysisList.extend(result)
         # Print result
        if (DEBUG): print("Result call relation for a PreDefine: "+str(result)+"\n")

        
##################################################################################################################
################################## Define relations ##############################################################
        
    # Get function definition vertice if current vertice is a function 
    if (type[0] == "Function"):
        result = set(getFunctionDefOut(currentNode))           
        # Add FunctionDef to the Semantic Unit and get related elements
        analysisList.extend(result)
         # Print result
        if (DEBUG): print("Result define relation Function: "+str(result)+"\n")
         
        #Early return because we have no other rules for this node type
        return        
         
    # Get the declaration of the function in its header file (if existing)
    if (type[0] == "FunctionDef"):
        result = set(getFunctionDeclInHeader(currentNode))
        # Just add, no further analysis (we do not need to look at the decl again, this is done for Decl and CallExpression)
        semanticUnit.update(result) 
         # Print result
        if (DEBUG): print("Result define relation FunctionDef: "+str(result)+"\n")
        
    # Get the definition of the function in its c file (if existing) and the include statement
    if (type[0] == "DeclStmt"):
        result = set(getFunctionDefinCFile(currentNode))
        # Add FunctionDef to the Semantic Unit and get related elements
        analysisList.extend(result)
         # Print result
        if (DEBUG): print("Result define relation DeclStmt: "+str(result)+"\n")        
         
        #Early return because we have no other rules for this node type
        return        
     
    # Get definition of the element that contains the condition or parameter
    # We need this for identification of statements that are connected to a #define       
    if (type[0] in ('Condition', 'PreIfCondition', 'Parameter', 'ParameterList')):
        result = set(getParent(currentNode))
        # Add FunctionDef to the Semantic Unit and get related elements
        analysisList.extend(result)
         # Print result
        if (DEBUG): print("Result define relation Condition or Parameter: "+str(result)+"\n")
                
    # Get referenced function or variable if current vertice contains an unary address of operator
    if (type[0] == "AddressOfExpression"):          
        result = set(getCalledFunctionDefOrMacro(currentNode, type[0]))                
        # Get related elements of the referenced function or variable
        analysisList.extend(result)
         # Print result
        if (DEBUG): print("Result call relation for an AddressOfExpression: "+str(result)+"\n")
        
        #Early return because we have no other rules for this node type
        return        
     
        
##################################################################################################################
##################################### Data Flow ##################################################################   

    # Get all statements that are connected via used and defined relations
    if (followDataflows == True and type[0] in ["ForInit", "IdentifierDeclStatement", "Parameter", "AssignmentExpression", "ExpressionStatement", "Argument", "ArgumentList", "Condition", "UnaryExpression", "ReturnStatement"]):
        # Maybe some types are missing, needs further testing
        result = set(getDefinesAndUses(currentNode))
        # Get related elements of the called function
        analysisList.extend(result)
        # Print result
        if (DEBUG): print("Result data flow relation: "+str(result)+"\n")
        
##################################################################################################################
##################################### Control Flow ###############################################################       

       
    # Get enclosed vertices if current vertice is a GotoStatement 
    if (type[0] == "GotoStatement"): 
        # Get all labels that were refered by this goto
        result = set(getLabels(currentNode))  
        # Just add, no further analysis (we do not need to look at the labels again, as they will result in the used gotos)
        # ToDo: We should follow all flows to edges until the next label
        semanticUnit.update(result) 
        # Print result
        if (DEBUG): print("Result control flow relation: "+str(result)+"\n")
        
        #Early return because we have no other rules for this node type
        return        
     
        
####################################################################################################################
#################################### Variability ###################################################################          
         
    # Get enclosed vertices if current vertice is a pre-if-statement
    if (type[0] == "PreIfStatement"):                       
        #get variable statements
        result = set(getVariableStatements(currentNode))
        
        if (connectIfWithElse == False): 
            # Only get #endif and the condition
            result.update(set(getEndIf(currentNode)))   
            result.update(set(getPreIfCondition(currentNode)))                      
        else:
           # Otherwise get all AST children (condition and one #else/#elif/#endif)     
           result.update(set(getASTChildren(currentNode)))           
                 
        # For each enclosed vertice, add to the Semantic Unit and get related elements
        analysisList.extend(result)
        # Print result
        if (DEBUG): print("Result variability relation: "+str(result)+"\n")
                             
    #Get enclosed vertices if current vertice is a pre-elif-statement       
    if (type[0] == "PreElIfStatement"):        
        # Get variable statements
        result = set(getVariableStatements(currentNode))
        # Get the starting #if
        result.update(set(getPreIf(currentNode)))  
        
        if (connectIfWithElse == False): 
            # Only get the condition  
            result.update(set(getPreIfCondition(currentNode)))                      
        else:
           # Otherwise get all AST children (condition and all #else/#elif/#endif)     
           result.update(set(getASTChildren(currentNode)))  
        
        # For each enclosed vertice, add to the Semantic Unit and get related elements
        analysisList.extend(result)
        # Print result
        if (DEBUG): print("Result variability relation: "+str(result)+"\n")
      
    #Get enclosed vertices if current vertice is a pre-else-statement     
    if (type[0] == "PreElseStatement"):
        # Get variable statements
        result = set(getVariableStatements(currentNode))
        # Get the starting #if
        result.update(set(getPreIf(currentNode)))                        
        # For each enclosed vertice, add to the Semantic Unit and get related elements
        analysisList.extend(result)
        # Print result
        if (DEBUG): print("Result variability relation: "+str(result)+"\n")
       
    #Get enclosed vertices if current vertice is a pre-endif-statement     
    if (type[0] == "PreEndIfStatement"):
        # Get the starting #if and add it to the semanticUnit
        analysisList.extend(set(getPreIf(currentNode)))    
        # Print result
        if (DEBUG): print("Result variability relation: "+str(result)+"\n")


                
#####################################################################################################################
#################################### End of rules  ##################################################################                     

    
   


################################ Definition of helper functions ########################################################     
        
# Return all vertices of type file that belong to the given directory (not recursive)        
def getIncludedFiles (verticeId):
    query = """g.V(%s).out().has('type', 'File').dedup().id()""" % (verticeId)
    return db.runGremlinQuery(query)
    
# Return all vertices of type file and directory that belong to the given directory (recursive)        
def getIncludedFilesAndDirectories (verticeId):
    query = """g.V(%s).out().has('type', within('File', 'Directory')).dedup().id()""" % (verticeId)
    return db.runGremlinQuery(query)    
       
# Return all AST vertices and their children that belong to the given file 
def getEnclosedCodeOfFile (verticeId):
    query = """g.V(%s).emit().repeat(__.out('IS_AST_PARENT','VARIABILITY','IS_FILE_OF','IS_FUNCTION_OF_AST')).dedup().id()""" % (verticeId)
    return db.runGremlinQuery(query)   
           
# Return function definition vertice of a given function
def getFunctionDefOut (verticeId):
    query = """g.V(%s).out().has('type', 'FunctionDef').dedup().id()""" % (verticeId)
    return db.runGremlinQuery(query)  

# Return function decl in the belonging header file (if existing) ###############
def getFunctionDeclInHeader (verticeId):
    # Get the name
    query = """g.V(%s).out(AST_EDGE).has('type', 'Identifier').values('code')""" % (verticeId)
    fName = db.runGremlinQuery(query)
    
    if(len(fName)>0):
        # Go to parent file
        # Follow IS_HEADER_OF
        # Look in AST children for decl with same functionName
        query = """g.V(%s)
            .until(has('type', 'File')).repeat(__.in('IS_AST_PARENT','IS_FILE_OF','IS_FUNCTION_OF_AST'))
            .in('IS_HEADER_OF').out('IS_FILE_OF').has('type', 'DeclStmt').has('code', textContains('%s')).dedup().id()
        """ % (verticeId, fName[0])        
        
        return db.runGremlinQuery(query)    
    else:
        return ""

# Return function def in the belonging C file (if existing) and the belonging include statement  
def getFunctionDefinCFile (verticeId):
    # Get the name of function and header file
    query = """g.V(%s).union(
        __.out('DECLARES'),
        __.in('IS_FILE_OF')
    ).values('code')""" % (verticeId)
    # 0 is function name, 1 is header file name
    names = db.runGremlinQuery(query)
  
    if(len(names) > 1):
        # Do this only for function declares that contain a '('
        fName = names[0].rpartition("(")[0]  
        if(len(fName) > 0):       
            # Go to parent file
            # Follow IS_HEADER_OF
            # 1. Look in AST children for decl with same functionName  
            # 2. Look in AST children for include of header file
            query = """g.V(%s).in('IS_FILE_OF').out('IS_HEADER_OF').union(
                __.out('IS_FILE_OF').has('type', 'Function').has('code', textContains('%s')).out('IS_FUNCTION_OF_AST'),
                __.out('IS_FILE_OF').has('type', 'PreInclude').has('code', textContains('%s'))
            ).dedup().id()""" % (verticeId, fName, names[1])        
            
            return db.runGremlinQuery(query)

    # Return nothing if we do not get the desired result
    return ""


# Return all Labels and the connected code that were refered by the given GotoStatement
def getLabels (verticeId):
    # Get code of the referenced label
    query = """g.V(%s).out('IS_AST_PARENT').values('code')""" % (verticeId) 
    name = db.runGremlinQuery(query)
    if DEBUG: print("Got label: "+str(name))

    # Go to parent functionDef
    # Look in all children for the referenced label
    query = """g.V(%s)
        .until(has('type', 'FunctionDef'))
        .repeat(__.in('IS_AST_PARENT'))
        .until(has('type', 'Label').out('IS_AST_PARENT').has('code', '%s'))
        .repeat(__.out('IS_AST_PARENT')).dedup().id()
    """ % (verticeId, name[0]) 
    return db.runGremlinQuery(query)
 
 
# Return all AST children vertice ids of the given vertice
def getASTChildren (verticeId):
    query = """g.V(%s).emit().repeat(__.out('IS_AST_PARENT')).unfold().dedup().id()""" % (verticeId)
    return db.runGremlinQuery(query)   


# Return the id of the declaration of the called macro, including needed include statements
def getCalledMacroDef (verticeId, type):
    #Collects the results to return them in bulk
    collectedDefs = []

    # Get the name of the called macro. Note: Here the PreMacroIdentifier only contains the identifier and no brackets. This is due to the macroCall rule
    query = """g.V(%s).out().has('type', 'PreMacroIdentifier').valueMap('code', 'path')""" % (verticeId)
    calledMacros = db.runGremlinQuery(query)
    
    if(len(calledMacros) < 1): 
        print("Warning: Cannot get names and paths of macro: "+str(verticeId))
        return ""
    
    # Some statements can contain several calls
    for call in calledMacros:
        if call['code'][0] in externalMacrosSet:
            if DEBUG: print("Already checked macro and found no declaration: "+str(call['code'][0])+" - Skipping...")
            continue
        
        # Check if we encounter this file for the first time    
        if str(call['path'][0]) in alreadyCheckedMacroIdentifierDict:
            # If we already visited this file, check if we also already have checked this identifier
            if str(call['code'][0]) in alreadyCheckedMacroIdentifierDict[str(call['path'][0])]:
                # Skip the rest of the function, as we do not need to seach for a declaration multiple times
                if DEBUG: print("Already checked macro and found its declaration: "+str(call['code'][0])+" - Skipping...")
                continue 
            # If we haven't check this identifier yet    
            else:
                # Add the identifier as additional value to the dict at the corresponding key and continue with the function
                alreadyCheckedMacroIdentifierDict[str(call['path'][0])].add(str(call['code'][0]))
                if DEBUG: print("Checking new macro in known file: "+str(call['code'][0]))
            
        # If it's a new file, add the path as new key to our dict    
        else:
            # Add the path as new key and the name as new value (as part of a set)
            alreadyCheckedMacroIdentifierDict[str(call['path'][0])] = {str(call['code'][0])}
            if DEBUG: print("Checking new macro in new file: "+str(call['code'][0]))

                                
        # Get the parent file of the current node (MacroCall)
        query = """g.V(%s).until(has('type', 'File')).repeat(__.in('IS_AST_PARENT','IS_FILE_OF','IS_FUNCTION_OF_AST')).id()""" % (verticeId)  
        parentFileId = db.runGremlinQuery(query)       
        
        # Look in its AST children for a macro with the given name (take care that the result is a visible statement)
        query = """g.V(%s).out().has('type', 'PreDefine').where(out().has('type', 'PreMacroIdentifier').out().has('type', 'Identifier').has('code', '%s')).id()""" % (parentFileId[0], call['code'][0])    
        # Run the query         
        sameFileDef = db.runGremlinQuery(query)
        
    #TODO: Do not stop if declaration is variable!
        
        # Stop here if we already found the definition
        if (len(sameFileDef) > 0):
            if DEBUG: print("Found def in same file: "+str(sameFileDef))
            collectedDefs.extend(sameFileDef)
            continue
        # If there is no macro definition in the current file, check included files
        else:        
            # List that contains lists, 
            # where the first element of the inner list is the file id and all following elements are ids of needed include statements
            fileList = [[parentFileId[0]]]
                    
            for file in fileList:   
                if DEBUG: print("File: "+str(file))           
                # Look for functiondef/decl/macro in included file
                query = """g.V(%s).out().has('type', 'PreDefine').where(out().has('type', 'PreMacroIdentifier').out().has('type', 'Identifier').has('code', '%s')).id()""" % (file[0], call['code'][0])  
                # Run the query            
                declResult = db.runGremlinQuery(query)   

    #TODO: Do not stop if declaration is variable!            
                 
                # If we found a declaration/definition    
                if len(declResult) > 0:
                    if DEBUG: print("Found declaration: "+str(declResult))                      
                    # Add decl to SU (here we replace the file id, as we also need the include statements that lead to the declaration)
                    file[0] = declResult[0]
                    # Stop looking, as we found the desired decl
                    collectedDefs.extend(file)  
                    # Stop the inner loop, no need to continue here
                    break

                # Look for include statements in the current file and add them to the fileList
                searchIncludesRecursively (file[0], file, fileList)                
            
            # If we iterated through all files but couldn't find a definition for the current macro
            if len(declResult) == 0:
                # Collect names of all macros for which we do not find a declaration inside the project, to prevent checking them several times
                if DEBUG: print("Could not find decl of: "+call['code'][0]+" with id: "+str(verticeId)+" inside the project's code")
                externalMacrosSet.add(call['code'][0])
                
    #Finally, return all collected defs          
    return collectedDefs

    
# Return the id of the declaration of the called function, including needed include statements
def getCalledFunctionDefOrMacro (verticeId, type):
    #Collects the results to return them in bulk
    collectedDefs = []
    
    # Get the name of the called function
    query = """g.V(%s).out().has('type', 'Identifier').valueMap('code', 'path')""" % (verticeId)
    functionNames = db.runGremlinQuery(query)
    
    #Check here for arguments that could lead to a function?
   
    if(len(functionNames) < 1): 
        if(type == 'Callee' or type == 'AddressOfExpression'):
            #Only problematic for callee or addressOf nodes
            print("Warning: Cannot get name or path of function: "+str(verticeId))
        return ""
         

    # Some statements can contain several calls
    for functionName in functionNames:    
    
        if functionName['code'][0] in externalFunctionsSet:
            if DEBUG: print("Already checked function and found no declaration: "+str(functionName['code'][0])+" - Skipping...")
            continue
    
        # Check if we encounter this file for the first time    
        if str(functionName['path'][0]) in alreadyCheckedIdentifierDict:
            # If we already visited this file, check if we also already have checked this identifier
            if str(functionName['code'][0]) in alreadyCheckedIdentifierDict[str(functionName['path'][0])]:
                # Skip the rest of the function, as we do not need to seach for a declaration multiple times
                if DEBUG: print("Already checked function/macro and found its declaration: "+str(functionName['code'][0])+" - Skipping...")
                continue 
            # If we haven't check this identifier yet    
            else:
                # Add the identifier as additional value to the dict at the corresponding key and continue with the function
                alreadyCheckedIdentifierDict[str(functionName['path'][0])].add(str(functionName['code'][0]))
                if DEBUG: print("Checking new function/macro in known file: "+str(functionName['code'][0]))
            
        # If it's a new file, add the path as new key to our dict    
        else:
            # Add the path as new key and the name as new value (as part of a set)
            alreadyCheckedIdentifierDict[str(functionName['path'][0])] = {str(functionName['code'][0])}
            if DEBUG: print("Checking new function/macro in new file: "+str(functionName['code'][0]))

                            
        # Get the parent file of the current node (Callee)
        query = """g.V(%s).until(has('type', 'File')).repeat(__.in('IS_AST_PARENT','IS_FILE_OF','IS_FUNCTION_OF_AST')).id()""" % (verticeId)  
        parentFileId = db.runGremlinQuery(query)
         
        #Check if parent file is not empty (which is normally impossible)?
    
        # For real function/macro calls
        if (type == 'Callee' or type == 'PreIfCondition' or type == 'PreMacro'):
            # Look in its AST children for a functionDef or macro with the given name (take care that the result is a visible statement)
            # TODO: Check if we really need the next part
            # ,__.out().has('type', 'Function').out().out().has('type', 'PreDefine').out().has('type', 'PreMacroIdentifier').out().has('type', 'Identifier').has('code', '%s').in().in()    functionName['code'][0],
            query = """g.V(%s).union(
                __.out().has('type', 'Function').has('code', '%s').out(),
                __.out().has('type', 'PreDefine').where(out().has('type', 'PreMacroIdentifier').out().has('type', 'Identifier').has('code', '%s'))            
            ).dedup().id()""" % (parentFileId[0], functionName['code'][0], functionName['code'][0])
                 
        # For addressOf references
        else:     
            # Look in its AST children for a functionDef or global variable declaration with the given name (take care that the result is a visible statement)
            query = """g.V(%s).union(
                __.out().has('type', 'Function').has('code', '%s').out(),
                __.out().has('type', 'DeclStmt').where(out().has('identifier', '%s')),  
                __.out().has('type', 'StructUnionEnum').where(out().has('type', 'Identifier').has('code', '%s')),     
                __.out().has('type', 'FunctionPointerDeclare').where(out().has('type', 'Identifier').has('code', '%s'))             
            ).dedup().id()""" % (parentFileId[0], functionName['code'][0], functionName['code'][0], functionName['code'][0], functionName['code'][0])
                                
        
        # Run the query         
        sameFileDef = db.runGremlinQuery(query)
       
    #TODO: Do not stop if declaration is variable!   
    
        # Stop here if we already found the definition
        if (len(sameFileDef) > 0):
            if DEBUG: print("Found def in same file: "+str(sameFileDef))
            collectedDefs.extend(sameFileDef)
            continue
        # If there is no function definition in the current file, check included files
        else:        
            # List that contains lists, 
            # where the first element of the inner list is the file id and all following elements are ids of needed include statements
            fileList = [[parentFileId[0]]]
                    
            for file in fileList:   
                if DEBUG: print("File: "+str(file))
                
                # For real function/macro calls
                if (type == 'Callee' or type == 'PreIfCondition' or type == 'PreMacro'):
                    # Look for functiondef/decl/macro in included file
                    # __.out().has('type', 'Function').out().out().has('type', 'PreDefine').out().has('type', 'PreMacroIdentifier').out().has('type', 'Identifier').has('code', '%s').in().in()  functionName['code'][0],
                    # TODO: See above query
                    query = """g.V(%s).union(
                        __.out().has('type', 'DeclStmt').where(out().has('identifier', '%s')),
                        __.out().has('type', 'PreDefine').where(out().has('type', 'PreMacroIdentifier').out().has('type', 'Identifier').has('code', '%s')),  
                        __.out().has('type', 'Function').has('code', '%s').out()                                
                    ).dedup().id()""" % (file[0], functionName['code'][0], functionName['code'][0], functionName['code'][0]) 
                # For addressOf references
                else:            
                    # Look for a functionDef or variable declaration in included file                    
                    query = """g.V(%s).union(
                        __.out().has('type', 'Function').has('code', '%s').out(),
                        __.out().has('type', 'DeclStmt').where(out().has('identifier', '%s')),  
                        __.out().has('type', 'StructUnionEnum').where(out().has('type', 'Identifier').has('code', '%s')),     
                        __.out().has('type', 'FunctionPointerDeclare').where(out().has('type', 'Identifier').has('code', '%s'))             
                    ).dedup().id()""" % (file[0], functionName['code'][0], functionName['code'][0], functionName['code'][0], functionName['code'][0])

                # Run the query            
                declResult = db.runGremlinQuery(query)        
     
        #TODO: Do not stop if declaration is variable!
     
                # If we found a declaration/definition    
                if len(declResult) > 0:
                    if DEBUG: print("Found declaration: "+str(declResult))                      
                    # Add decl to SU (here we replace the file id, as we also need the include statements that lead to the declaration)
                    file[0] = declResult[0]
                    # Stop looking, as we found the desired decl
                    collectedDefs.extend(file)  
                    # Stop the inner loop, no need to continue here
                    break        
                      
                # Look for include statements in the current file and add them to the fileList
                searchIncludesRecursively (file[0], file, fileList)
                
            # If we iterated through all files but couldn't find a definition for the current macro/function
            if len(declResult) == 0:            
                # Collect names of all functions for which we do not find a declaration inside the project, to prevent checking them several times
                if DEBUG: print("Could not find decl of: "+functionName['code'][0]+" with id: "+str(verticeId)+" inside the project's code")
                externalFunctionsSet.add(functionName['code'][0])
            
    #Finally, return all collected defs    
    return collectedDefs        


# Helper function to find something in a file that is reached via includes and collect the needed include statements
def searchIncludesRecursively (rootFileID, currentIncludeChain, fileList):
    if DEBUG: print("Searching for included files of root file: "+str(rootFileID)) 
    # Get the include statements of a file that have PreIncludeLocalFile nodes as children
    query = """g.V(%s).out('IS_FILE_OF').has('type', 'PreInclude').where(out().has('type', 'PreIncludeLocalFile')).id()""" % (str(rootFileID))
    includes = db.runGremlinQuery(query)    
    
    if DEBUG: print("Found the following includes: "+str(includes))
    
    # Get the included file for each include statement
    for include in includes:   
        query = """g.V(%s).out().out('INCLUDES').id()""" % (str(include))
        fileID = db.runGremlinQuery(query)
        
        if len(fileID) > 0:
            if DEBUG: print("Found included file: "+str(fileID))
            
            # Check that we do not add a file twice
            fileAlreadyChecked = False
            for entry in fileList:
                if entry[0] == fileID[0]:
                    if DEBUG: print("Already checked "+str(fileID[0]))
                    fileAlreadyChecked = True
 
            if not fileAlreadyChecked:
                # Build the content of the fileList entry by adding the file id first and then the include statement, that includes this file
                fileListContent = [fileID[0], include]           
                
                # Then add content of currentIncludeChain (all includes up to the rootFile) without root file itself
                skipfirst = True
                for entry in currentIncludeChain:
                    if not skipfirst:
                        fileListContent.append(entry)
                    else: 
                        skipfirst = False                
                                                                 
                #Finally, add the new file with its include chain to the file list
                fileList.append(fileListContent)

  
    
# Return the ids of all callees for this function
def getCallsToFunction (verticeId):      
    # First: Get the name of the called function
    query = """g.V(%s).out().has('type', 'Identifier').values('code')""" % (verticeId)
    functionName = db.runGremlinQuery(query)
     
    # Go to the parent file of the current function node
    # Branch 1: Search in all children of this file for callees of the function
    # Branch 2: Look for include connections. Go from include to parent. Look in children for callee. If callee found, also add the include statement. 
    # Branch 3: Look for IS_HEADER_OF connections. Look for declares and store them.
    # Branch 3.2: Then follow includes. Go from include to parent. Look in children for callee. If callee found, also add the include and the declares statement.
    query = """g.V(%s).until(has('type', 'File'))
            .repeat(__.in('IS_AST_PARENT','IS_FILE_OF','IS_FUNCTION_OF_AST')).as('parentFileNode').
            union(
                until(has('type', 'Callee').has('code', '%s'))
                    .repeat(__.out('IS_AST_PARENT','IS_FILE_OF','IS_FUNCTION_OF_AST'))
                    .in('IS_AST_PARENT').in('IS_AST_PARENT').dedup().id().as('sameFileResult')
                ,__.in('INCLUDES').in('IS_AST_PARENT').as('result').in('IS_FILE_OF')
                    .until(has('type', 'Callee').has('code', '%s'))                        
                    .repeat(__.out('IS_AST_PARENT','IS_FILE_OF','IS_FUNCTION_OF_AST'))
                    .in('IS_AST_PARENT').in('IS_AST_PARENT').as('result').select('result').unfold().dedup().dedup().id()
                ,__.in('IS_HEADER_OF').as('hFile').out('IS_FILE_OF').has('type', 'DeclStmt').has('code', textContains('%s')).as('result')
                    .select('hFile').in('INCLUDES').in('IS_AST_PARENT').as('result').in('IS_FILE_OF')
                    .until(has('type', 'Callee').has('code', '%s'))                        
                    .repeat(__.out('IS_AST_PARENT','IS_FILE_OF','IS_FUNCTION_OF_AST'))
                    .in('IS_AST_PARENT').in('IS_AST_PARENT').as('result').select('result').unfold().dedup().dedup().id()       
            )         
            """ % (verticeId, functionName[0], functionName[0], functionName[0], functionName[0])  
            
    return db.runGremlinQuery(query)


# Get all statements that are connected via used and defined relations       
def getDefinesAndUses (verticeId):
    # USE edges and DEF edges
    # Here we can get results that do not appear in the code (e.g. Argument or Parameter nodes)
    query = """g.V(%s).both('USE','DEF').both('USE','DEF').simplePath().dedup().id()"""   % (verticeId)
    return db.runGremlinQuery(query)     
    

# Return all AST children except the CompoundStatement and the ElseStatement and their children  
def getInitAndCondition (verticeId):
    query = """g.V(%s).out('IS_AST_PARENT').has('type', without('CompoundStatement', 'ElseStatement')).emit().repeat(out('IS_AST_PARENT')).dedup().id()""" % (verticeId)
    return db.runGremlinQuery(query) 
    
# Return the If of an else statement    
def getIfStatement (verticeId):
    query = """g.V(%s).in('IS_AST_PARENT').has('type','IfStatement').dedup().id()""" % (verticeId)
    return db.runGremlinQuery(query)  

# Return the corresponding else-statement of an if-statement    
def getElse (verticeId):
    query = """g.V(%s).out('IS_AST_PARENT').has('type', 'ElseStatement').dedup().id()""" % (verticeId)
    return db.runGremlinQuery(query)    

# Return the corresponding #endif-statement of an #if-statement 
def getEndIf (verticeId):
    # Find the #endif
    query = """g.V(%s).until(has('type', 'PreEndIfStatement')).repeat(out('IS_AST_PARENT')).has('type', 'PreEndIfStatement').dedup().id()""" % (verticeId)   
    return db.runGremlinQuery(query)     
    
# Return the corresponding the condition of an #if/#elif-statement    
def getPreIfCondition (verticeId):
    # Get all AST childs that belong to the condition
    query = """g.V(%s).out('IS_AST_PARENT').has('type', 'PreIfCondition').emit().repeat(out('IS_AST_PARENT')).dedup().id()""" % (verticeId) 
    return db.runGremlinQuery(query) 

# Return the corresponding macro identifier of an #define/#undefine statement
def getMacroIdentifier (verticeId):
    query = """g.V(%s).out('IS_AST_PARENT').has('type', 'PreMacroIdentifier').dedup().id()""" % (verticeId) 
    return db.runGremlinQuery(query) 

# Return all statements that are connected to a macro identifier (uses and defines)    
def getRelationsToMacro (verticeId):
    # Get name result[0] and path result[1] of the macro
    query = """g.V(%s).out().has('type', 'Identifier').values('code','path')""" % (verticeId)
    tempResult = db.runGremlinQuery(query)    
       
    # Go to the parent file: 
    # if there is an include edge: follow all include edges, then look inside all children of the including files for nodes with the given code (get all nodes in other files that include the macro definition)
    # if this result is not empty: also add the include statements to the result (solely the ones where the macro is used)
    # else (not include egdes): look in all children of the file for nodes with the given code (get all nodes in the current file)
    query = """g.V(%s).until(has('type', 'File')).repeat(inE('IS_AST_PARENT','IS_FILE_OF','IS_FUNCTION_OF_AST').outV())
        .bothE().choose(hasLabel('INCLUDES'), 
            outV().in('IS_AST_PARENT').as("includes")
                .until(has('type', 'File')).repeat(inE('IS_AST_PARENT','IS_FILE_OF','IS_FUNCTION_OF_AST').outV())
                .repeat(outE('IS_AST_PARENT','IS_FILE_OF','IS_FUNCTION_OF_AST').inV()).emit().has('code', textContains('%s')).as("result")
                    .choose(count().is(gt(0)),
                    local(__.select("includes").as("result")),
                    id()    
                    )           
            , 
            inV().has('type', 'File')
                .repeat(outE('IS_AST_PARENT','IS_FILE_OF','IS_FUNCTION_OF_AST').inV()).emit().dedup().has('code', textContains('%s')).as("result")
            )
            .select("result").unfold().dedup().dedup().id()
            """ % (verticeId, tempResult[0], tempResult[0])  
   
    return db.runGremlinQuery(query)     

  
######################################### Parent Nodes #################################################################

# Return all parents of identifiers that contain the specified string, this is done once in the beginning if the entry point is a generic identifier    
def getNodeParents (nodes, type):
    #Empty set
    result = set()
        
    # For each entry point
    for currentNode in nodes:   
        query = ""
       
        if (type == "identifier"):
            # Find the visible parent nodes of an identifier that matches the given string
            query = """g.V().has('type', 'Identifier').has('code', '%s').repeat(__.in('IS_AST_PARENT').dedup()).until(has('type', within(%s))).dedup().id()""" % (currentNode, visibleStatementTypes)  
        elif (type == "string"):
            # Find the visible parent nodes of a node that contains the given string
            query = """g.V().has('code', textRegex('(.|\\n|\\r)*(%s)(.|\\n|\\r)*')).until(has('type', within(%s))).repeat(__.in('IS_AST_PARENT').dedup()).dedup().id()""" % (currentNode, visibleStatementTypes)
        elif (type == "feature"):
            # Find all #if/#elfif and PreFragment nodes that contain the name of the feature and all nodes that belong to the variability blocks
            query = """g.V().union(
                    has('type', 'PreFragment').has('code', textRegex('(.|\\n|\\r)*(%s)(.|\\n|\\r)*')).until(has('type', within(%s))).repeat(__.in('IS_AST_PARENT').dedup()).id()
                    , has('type', within('PreIfStatement','PreElIfStatement')).has('code', textRegex('(.|\\n|\\r)*(%s)(.|\\n|\\r)*')).union(id(),out('VARIABILITY').id())
                    )"""  % (currentNode,visibleStatementTypes,currentNode) 
                
        
        # Save nodes for the next query
        nodes = db.runGremlinQuery(query)
        #Add the result
        result.update(set(nodes))        
        
        # Check if we got any results
        if (len(result) == 0):
            print("##### Warning! No nodes found containing the string: "+currentNode+" #### \n") 
      
    
    # If we have found all initial nodes, pre-analyze them and add the results to the initial analysis set   
    if (len(result) > 0):    
        # Get the parent function if existing and the configuration option is true  
        if (includeParentFunction):       
            result.update(set(addParentFunctions(list(result)))) 
            
        # Get the parent blockstarters if existing and the configuration option is true  
        if (includeParentBlocks):       
            result.update(set(addParentBlocks(list(result)))) 
            
        # Get all via dataflow related statements if existing and the configuration option is true    
        if (includeLocalDataflows):       
            result.update(set(addLocalDataflows(list(result))))   

        # Get all via dataflow related statements if existing and the configuration option is true    
        if (includeBackwardSlice):       
            result.update(set(addLocalBackwardSlice(result)))            
            
        # For all entry points, add declaration of local variables if existing and if we wont get them otherways 
        if (not includeLocalDataflows) and (not followDataflows) and (not includeParentFunction) and (not includeBackwardSlice):  
            result.update(set(addLocalDeclares(list(result)))) 
         
          
    return result 


# Return AST parent of a given node (can be empty)
def getParent (verticeId):
    query = """g.V(%s).in('IS_AST_PARENT').dedup().id()""" % (verticeId)
    return db.runGremlinQuery(query)                 


# Return parent function of a given set of node ids (can be empty)
def addParentFunctions (nodes):
    global SemanticUnit   
    
    #Empty set for collecting return statements and their dependencies
    returnResults = set()    
    
    if (DEBUG) : print("Checking for parent functionDefs ...")    

    # Find the parent function (if existing), its CompoundStatement and its BlockCloser (with union, so that we also get results if one of the branches is empty)
    query = """idListToNodes(%s).union(
    __.repeat(__.in('IS_AST_PARENT').dedup()).until(has('type', 'FunctionDef')).dedup(),
    __.repeat(__.in('IS_AST_PARENT').dedup()).until(has('type', 'FunctionDef')).dedup().out('IS_AST_PARENT').has('type', 'CompoundStatement').dedup(),
    __.repeat(__.in('IS_AST_PARENT').dedup()).until(has('type', 'FunctionDef')).dedup().out('IS_AST_PARENT').has('type', 'CompoundStatement').dedup().out('IS_AST_PARENT').has('type','BlockCloser').dedup()
    ).dedup().id()"""  % (nodes)                
           
    result = set(db.runGremlinQuery(query))       
    
    if (DEBUG) : print("Found additional parent functionDef nodes: "+str(result)+"\n")
    
    #Add return statements (if existing) for newly added functionDefs to preserve syntactical correctness
    for node in result:
        if node not in semanticUnit:
            print("Adding return statements for newly added FunctionDef: "+str(node))
            #Get returns and data related statements
            query = """g.V(%s).has('type', 'FunctionDef').until(has('type', 'ReturnStatement')).repeat(out('IS_AST_PARENT')).dedup().out('USE').in('USE','DEF').id()""" % (node)
            returnResults.update(set(db.runGremlinQuery(query)))   
            print("New: "+str(returnResults))    
    
    print("Found additional return statements: "+str(returnResults)+"\n")
    #Add the newly found return statements
    result.update(set(returnResults))  
    
    return result 


# Return parent blocks of a given set of node ids (can be empty)
def addParentBlocks (nodes):
    global SemanticUnit
    
    if (DEBUG) : print("Looking for parent blocks...")    

    # Find the parent blocks (if existing and without dupes)
    blockStarter = ['SwitchStatement', 'IfStatement', 'ElseStatement', 'ForStatement', 'WhileStatement', 'DoStatement']

    query = """idListToNodes(%s).repeat(__.in('IS_AST_PARENT')).emit().has('type', within(%s)).dedup().as('result').out('IS_AST_PARENT').has('type', 'CompoundStatement').as('result').out('IS_AST_PARENT').has('type','BlockCloser').as('result').select('result').unfold().dedup().id()"""  % (nodes, blockStarter)                
    result = db.runGremlinQuery(query)       
    
    if (DEBUG) : print("Found additional parent block nodes: "+str(result)+"\n")
    
    return result  


######################################### Local Declares (Pre-Analysis) #################################################################

# Return parent blocks of a given set of node ids (can be empty)
def addLocalDeclares (nodes):
    global SemanticUnit
    
    if (DEBUG) : print("Looking for local declares...")       

    # Find the declaration of all identifiers inside the same function and before the current statement (if existing and without dupes and cycles)
    query = """idListToNodes(%s).repeat(__.in('FLOWS_TO').simplePath().dedup()).emit().has('type', 'IdentifierDeclStatement').dedup().id()"""  % (nodes)                
    
    return db.runGremlinQuery(query)


######################################### Local Data Flows (Pre-Analysis) #################################################################    
    
# Return parent blocks of a given set of node ids (can be empty)
def addLocalDataflows (nodes):
    global SemanticUnit
    
    if (DEBUG) : print("Looking for local dataflows...")        

    # Follow all dataflows inside a function and add the involved statements (if existing and without dupes)
    query = """idListToNodes(%s).repeat(__.out('USE','DEF').dedup().in('USE','DEF').simplePath()).emit().id()"""  % (nodes)                
    
    return db.runGremlinQuery(query)
   
   
######################################### Local Control- and Data Flows (Pre-Analysis) #################################################################    
    
# Return the classical backward slice of a given set of node ids (can be empty)
def addLocalBackwardSlice (nodes):
    global SemanticUnit
    
    if (DEBUG) : print("Looking for local backward slice...") 
    result = set()    

    for node in nodes:
        if (DEBUG) : print("Look at node: "+str(node))  

        #ToDo: Caution, this analysis does not handly doWhile statements correctly (as they are missing their USE/DEF and FLOWS_TO edges)

        #Get all nodes that appear previously in the control flow 
        #If the starting node has a condition, follow its control flow instead. if the resulting node is a condition, get its parent (bc control flows follow condition, not their visible parent statements)
        #Choose: if, then, else
        query = """g.V(%s)
            .choose(__.out('IS_AST_PARENT').has('type','Condition'),__.out('IS_AST_PARENT').has('type','Condition'),identity())
            .repeat(__.in('FLOWS_TO').simplePath().dedup()).emit()
            .choose(has('type','Condition'),__.in('IS_AST_PARENT'),identity())
            .id()""" % (node)
        controlFlow = set(db.runGremlinQuery(query))
        if (DEBUG) : print("Got control flow: "+str(controlFlow))
        
        
        #Only check for data flow if we have nodes that could influence the entry point
        if (len(controlFlow) > 0):        
            #Get all nodes that are connected via DEF/USE or (real or, not xor) AST parent edges to the initial node (no FunctionDefs, as this can lead to inclusion of the whole function content)
            query = """g.V(%s).repeat(__.union(
                __.out('USE','DEF').dedup().in('USE','DEF').simplePath().dedup(),
                __.in('IS_AST_PARENT').not(has('type','FunctionDef')).simplePath().dedup()
                ).dedup()
            ).emit().has('type', within(%s)).id()""" % (node, visibleStatementTypes)
            dataFlow = set(db.runGremlinQuery(query))    
            if (DEBUG) : print("Got data flow: "+str(dataFlow))   
        
            #Get all nodes that appear in both queries (previous control flow node and direct or indirect data flow connection) -> All nodes that can have an impact to the entry point
            result.update(controlFlow.intersection(dataFlow))    
            if (DEBUG) : print("Updated result: "+str(result))      
    
    return result
   
        
######################################### Variability Checking #################################################################

# Return parent variability information for each statement in the SemanticUnit (without further analysis)
def addVariability ():
    if (DEBUG) : print("Checking for variability information...")    

    global semanticUnit
    # Get the parent variability nodes, add them (and all connected AST elements) to the SemanticUnit (without dupes) 
    query = """idListToNodes(%s)
    .repeat(__.in('VARIABILITY').simplePath()).emit().dedup().as('result')
    .repeat(__.both('IS_AST_PARENT').simplePath().has('type', within('PreIfStatement','PreElIfStatement','PreElseStatement','PreEndIfStatement'))).emit().dedup().as('result')
    .select('result').unfold().dedup().id()""" % (list(semanticUnit))   
   
    result = db.runGremlinQuery(query)       
    
    if (DEBUG) : print("Found additional variability nodes (#ifdef etc): "+str(result)+"\n")
    
    semanticUnit.update(result)
 

# Return the blockstarter #if
def getPreIf (verticeId):
    # We need the __. before in, so Groovy doesn't confuse it with its own keyword in
    query = """g.V(%s).until(has('type', 'PreIfStatement')).repeat(__.in('IS_AST_PARENT')).dedup().id()""" % (verticeId)
    return db.runGremlinQuery(query) 
 
 
# Return all variable statements of the current node   
def getVariableStatements (verticeId):
    query = """g.V(%s).out('VARIABILITY').dedup().id()""" % (verticeId)
    return db.runGremlinQuery(query)         
    
   
######################################### Comment Checking #################################################################

# Return parent comment for each statement in the SemanticUnit (without further analysis)
def addComments ():
    if (DEBUG) : print("Checking for comments...")    

    global semanticUnit
    # Get the parent comment nodes, add them to the SemanticUnit (without dupes)
    query = """idListToNodes(%s).in('COMMENTS').dedup().id()""" % (list(semanticUnit))   
   
    result = db.runGremlinQuery(query)       
    
    if (DEBUG) : print("Found additional comment nodes: "+str(result)+"\n")
    
    semanticUnit.update(result)

######################################### External Libraries Checking #################################################################

# Saves the ids of all file nodes that have children who are part of the SU (as the filenodes itself are normally not part of the SU)
def getSUsFileNodes ():
    if (DEBUG) : print("Checking for SU's files...")    

    global semanticUnit, SUFilesSet
    # Go to the parent file nodes of all functionDefs or declares
    query = """idListToNodes(%s).union(
        has('type', 'FunctionDef').in(),
        has('type', 'StructUnionEnum'),
        has('type', 'FunctionPointerDeclare'),
        has('type', 'DeclStmt'),
        has('type', 'PreDefine'),
        has('type', 'PreUndef'),
        has('type', 'PreIfStatement'),
        has('type', 'PreInclude')
        ).in().has('type', 'File').dedup().id()""" % (list(semanticUnit))   
   
    result = db.runGremlinQuery(query)       
    
    if (DEBUG) : print("Found files of SU: "+str(result)+"\n")
    
    SUFilesSet.update(result)


# Adds all files to the SU that were included by SU's files recursively
def addFilesIncludedBySUFilesRecursively ():
    if (DEBUG) : print("Checking for files included by SU's files (recursively) ...")    
    print("Checking for files included by SU's files (recursively) ...")  
    
    global semanticUnit, SUFilesSet
    
    # Initialize the list with all files that are part of the SU
    fileList = list(SUFilesSet)
    
    # For each file node, follow internal includes and add the included file node (recursive but not cyclic)
    for file in fileList:
        # Get the include statements of a file that have PreIncludeLocalFile nodes as children
        # Info: We do not add the corresponding .c file for a .h file, as this is only necessary for functions, which we already checked earlier
        query = """g.V(%s).out('IS_FILE_OF').has('type', 'PreInclude').out().has('type', 'PreIncludeLocalFile').out('INCLUDES').id()""" % (str(file))
        fileIDs = db.runGremlinQuery(query)   
           
        # Proceed only if the current file includes other files    
        if len(fileIDs) > 0:
            if DEBUG: print("Found included files: "+str(fileIDs)+" of file "+str(file))
            
            # Add the included files to the fileList
            for entry in fileIDs:
                # Check that we do not add a file twice
                if entry not in fileList:
                    if DEBUG: print("Found new file: "+str(entry))
                    fileList.append(entry)
 

    # At the end, add the new files to the SUFilesSet (we do not care about duplicates, as it's a set)     
    SUFilesSet.update(fileList)
    
    print("Updates files that are part of the SU (with included files): "+str(SUFilesSet))
 



# Return all include statements that includes external libraries
def addAllExternalIncludes ():
    if (DEBUG) : print("Checking for all external includes...")    

    global semanticUnit
    # Get all includes that include libraries (nodes who don't have an AST child ) and add them to the SU
    query = """g.V().has('type', 'PreInclude').where(not(out('IS_AST_PARENT'))).id()"""   
   
    result = db.runGremlinQuery(query)       
    
    if (DEBUG) : print("Found additional includes of libraries: "+str(result)+"\n")
    
    semanticUnit.update(result)


# Return all include statements for each file of the SU that includes external libraries
def addExternalIncludesForSUFiles ():
    if (DEBUG) : print("Checking for external includes of SU's files...")    

    global semanticUnit, SUFilesSet
    # Go to all file nodes that belong to the SU, then get all includes that include libraries (nodes who don't have an AST child ) and add them to the SU
    query = """idListToNodes(%s).out('IS_FILE_OF').has('type', 'PreInclude').where(not(out('IS_AST_PARENT'))).id()""" % (list(SUFilesSet))   
   
    result = db.runGremlinQuery(query)       
    
    if (DEBUG) : print("Found additional includes of libraries: "+str(result)+"\n")
    
    semanticUnit.update(result)


# Return all include statements that includes interal files
def addAllInteralIncludes ():
    if (DEBUG) : print("Checking for all interal includes...")    

    global semanticUnit
    # Get all includes that include interal files (nodes who have an AST child ) and add them to the SU
    query = """g.V().has('type', 'PreInclude').where(out('IS_AST_PARENT')).id()"""   
   
    result = db.runGremlinQuery(query)       
    
    if (DEBUG) : print("Found additional includes of interal files: "+str(result)+"\n")
    
    semanticUnit.update(result)


# Return all include statements for each file of the SU that includes interal files
def addInteralIncludesForSUFiles ():
    if (DEBUG) : print("Checking for interal includes of SU's files...")    

    global semanticUnit, SUFilesSet
    # Go to all file nodes that belong to the SU, then get all includes that include interal files (nodes who have an AST child) and add them to the SU
    query = """idListToNodes(%s).out('IS_FILE_OF').has('type', 'PreInclude').where(out('IS_AST_PARENT')).id()""" % (list(SUFilesSet))   
   
    result = db.runGremlinQuery(query)       
    
    if (DEBUG) : print("Found additional includes of internal files: "+str(result)+"\n")
    
    semanticUnit.update(result)

    
# Return all include statements (internal and external) for the whole project
def addAllIncludes ():
    if (DEBUG) : print("Checking for all includes...")    

    global semanticUnit
    # Get all include statements
    query = """g.V().has('type', 'PreInclude').id()""" % (list(SUFilesSet))   
   
    result = db.runGremlinQuery(query)       
    
    if (DEBUG) : print("Found additional includes: "+str(result)+"\n")
    
    semanticUnit.update(result)    

######################################### Global Variable Declarations Checking #################################################################  

# Add global declarations of variables that are declared in files that are part of the SU and used and least only once inside the SU (probably)   
# This is not exact. The result may contain more declarations than necessary, as we only look for any identifier match inside the SU (regardless of scope)
# Furthermore, newly added declarations are not checked again. This could result in missing dependencies, e.g. when a declaration makes use of a typedef that is never used elsewhere.
def addUsedGlobalDeclares():  
    if (DEBUG): print("Checking for potentially used global variable declarations...")     
    
    # Collect ids of declarations and their declared identifier 
    declIdAndNameList = dict()
    # Collect names of identifiers from the SU
    identifierCodeList = set()

    global semanticUnit, SUFilesSet
    # For all files that are part of the SU, get declarations of global variables
    
    
    # Currently, this should be false, as we cannot check the content of StructUnionEnums reliably
    if (False):
        print("Caution, checkGlobalStructUnionEnums should be false")
        # First all StructUnionEnum, as they are easy to get. 
######## Caution: This will only return all StructUnionEnums that have an indentifier, this means there are some missing that need an extra query! ######       
        query = """idListToNodes(%s).out().has('type', 'StructUnionEnum').as('V')
        .id().as('id')
        .select('V').out().has('type', 'Identifier').values('code').as('name')
        .select('id','name')""" % (list(SUFilesSet))  
        aResult = db.runGremlinQuery(query)  
   
        # Add the results to the declIdAndNameList 
        for line in aResult: 
            declIdAndNameList[line['id']] = line['name'] 
    else:
        # Return all StructUnionEnum, as they are easy to get and we cannot currently check their usage reliably       
        query = """idListToNodes(%s).out().has('type', 'StructUnionEnum').id()""" % (list(SUFilesSet))  
        aResult = db.runGremlinQuery(query)  
        
        # Add the results directly to the SU (without checking for their usage, as this does not reliably work) 
        semanticUnit.update(aResult)
        
        if (DEBUG): print("Found StructUnionEnums: "+str(aResult))

#ToDo handle FunctionPointerDeclares    
   
    # Then we look for all other variable declarations. As the text filters do not really work, we first get all other declStmts
    query = """idListToNodes(%s).out().has('type', 'DeclStmt').as('V')
    .id().as('id')
    .select('V').out().values('completeType').as('ct')
    .select('V').out().values('identifier').as('name')
    .select('id','ct', 'name')""" % (list(SUFilesSet))  
    bResult = db.runGremlinQuery(query)
    # Here we filter out all nodes whose completeType contains a bracket (or should we filter out nodes that end with a closing bracket?)  
    for line in bResult:            
        if not "(" in line['ct']:
            # Add the id and name of the declaration
            declIdAndNameList[line['id']] = line['name'] 
   
    # We look for uses of the declared variables in the selected visible statements. These exclude no real uses, e.g. by comments
    checkedStatementTypes = ['CustomNode', 'FunctionDef', 'Statement', 'DeclStmt', 'StructUnionEnum', 'IfStatement', 'SwitchStatement', 'ForStatement', 'WhileStatement',  'GotoStatement', 'Label', 'ReturnStatement', 'ExpressionStatement', 'IdentifierDeclStatement', 'PreDefine', 'MacroCall', 'UsingDirective']

    #Get the code of all identifier nodes of the SU
    query = """idListToNodes(%s).has('type', within(%s)).values('code').dedup()""" % (list(semanticUnit), checkedStatementTypes)  
    cResult = db.runGremlinQuery(query)    
    identifierCodeList.update(cResult)    
       
  
    # Compare the identifier of each declStmt with the code of each relevant statement that is part of the SU
    for key in declIdAndNameList:
        for code in identifierCodeList:
            # If the current identifier appears in the code (a hint that we may have a usage here)
            if declIdAndNameList[key] in code:
                if (DEBUG): print("Found usage of variable: "+str(declIdAndNameList[key])+" with id: "+str(key))
                # Add key to SU
                semanticUnit.update([key])       

                #ToDo we should also check if the declaration uses another declaration. Is this possible for simple datastructures? 
                
                # Go on with next key
                break

  
# Add all global declarations of variables that are declared in files that are part of the SU        
def addGlobalDeclaresForSUFiles(): 
    if (DEBUG) : print("Checking for global variable declarations in files that are part of the SU...")    

    global semanticUnit, SUFilesSet
    # For all files that are part of the SU, get declarations of global variables
    
    # First all NullExpressions (appear as DeclStmt), StructUnionEnums and FunctionPointerDeclares, as they are easy to get
    query = """idListToNodes(%s).out().union(
        has('type', within('StructUnionEnum','FunctionPointerDeclare')),
        has('type', 'DeclStmt').has('code',';')
        ).id()""" % (list(SUFilesSet))  
    aResult = db.runGremlinQuery(query)   
    semanticUnit.update(aResult) 
    
    if (DEBUG) : print("Found additional global StructUnionEnum and FunctionPointerDeclare declarations: "+str(aResult))
    
    # Then we look for all other variable declarations. As the text filters do not really work, we first get all other declStmts
    query = """idListToNodes(%s).out().has('type', 'DeclStmt').as('V').id().as('id').select('V').out().values('completeType').as('ct').select('id','ct')""" % (list(SUFilesSet))  
    bResult = db.runGremlinQuery(query)
    # Here we filter out all nodes whose completeType contains a bracket (or should we filter out nodes that end with a closing bracket?)  
    for line in bResult: 
        if not "(" in line['ct']:
            # Add the whole id, not the digits one by one
            semanticUnit.update([line['id']]) 
            if (DEBUG) : print("Found additional global variable declaration: "+str(line['id']))


# Add all global declarations of variables (potentially very big overhead if the SU is small compared to the whole project)       
def addGlobalDeclares(): 
    if (DEBUG) : print("Checking for all global variable declarations...")    

    global semanticUnit
    
    # First all global StructUnionEnum and FunctionPointerDeclares, as they are easy to get
    query = """g.V().has('type', 'File').out().union(
        has('type', within('StructUnionEnum','FunctionPointerDeclare')),
        has('type', 'DeclStmt').has('code',';')
        ).id()"""  
    aResult = db.runGremlinQuery(query)   
    semanticUnit.update(aResult) 
    
    if (DEBUG) : print("Found additional global StructUnionEnum and FunctionPointerDeclare declarations: "+str(aResult))
    
    # Then we look for all other variable declarations. As the text filters do not really work, we first get all other declStmts
    query = """g.V().has('type', 'File').out().has('type', 'DeclStmt').as('V').id().as('id').select('V').out().values('completeType').as('ct').select('id','ct')"""  
    bResult = db.runGremlinQuery(query)
    # Here we filter out all nodes whose completeType contains a bracket (or should we filter out nodes that end with a closing bracket?)  
    for line in bResult: 
        if not "(" in line['ct']:
            # Add the whole id, not the digits one by one
            semanticUnit.update([line['id']]) 
            if (DEBUG) : print("Found additional global variable declaration: "+str(line['id']))

###################################### Non-function-like #defines (they are always global) ############################################################### 

# Add all declarations of #defines        
def addDefines(): 
    if (DEBUG) : print("Checking for non-function-like #defines...")    

    global semanticUnit

    # We look for all #defines that do not have brackets in their identifier (precisely: do not end with a bracket), known as non-function-like #defines
    query = """g.V().has('type', 'PreDefine').as('v').id().as('id').select('v').out().has('type', 'PreMacroIdentifier').values('code').as('name').select('id', 'name')""" 
    result = db.runGremlinQuery(query)
    # Here we filter out all nodes whose identifier ends with a bracket, indicating a function-like macro 
    for line in result: 
        if not line['name'].endswith(")"):
            # Add the whole id, not the digits one by one
            semanticUnit.update([line['id']]) 
            if (DEBUG) : print("Found additional non-function-like #define: "+str(line['name']))


# Add all declarations of #defines that are declared in files that are part of the SU        
def addDefinesForSUFiles(): 
    if (DEBUG) : print("Checking for non-function-like #defines in SU's files...")    

    global semanticUnit, SUFilesSet

    # We look for all #defines that do not have brackets in their identifier (precisely: do not end with a bracket), known as non-function-like #defines
    query = """idListToNodes(%s).out().has('type', 'PreDefine').as('v').id().as('id').select('v').out().has('type', 'PreMacroIdentifier').values('code').as('name').select('id', 'name')""" % (list(SUFilesSet))  
    result = db.runGremlinQuery(query)
    # Here we filter out all nodes whose identifier ends with a bracket, indicating a function-like macro 
    for line in result: 
        if not line['name'].endswith(")"):
            # Add the whole id, not the digits one by one
            semanticUnit.update([line['id']]) 
            if (DEBUG) : print("Found additional non-function-like #define: "+str(line['name']))


# Add all declarations of #defines that are declared in files that are part of the SU and are probably "used" at least once      
# This may contain #defines that are not used, as we do not check for the order of the statements (=it may contain more #defines than necessary)  
def addProbablyUsedDefines(): 
    if (DEBUG) : print("Checking for probably used non-function-like #defines...")        

    global semanticUnit, SUFilesSet

    # We look for all #defines that do not have brackets in their PreMacroIdentifier (precisely: do not end with a bracket), known as non-function-like #defines
    query = """idListToNodes(%s).out().has('type', 'PreDefine').as('v').id().as('id').select('v').out().has('type', 'PreMacroIdentifier').values('code').as('name').select('id', 'name')""" % (list(SUFilesSet))  
    aResult = db.runGremlinQuery(query)
    
    # Here we filter out all nodes whose PreMacroIdentifier ends with a bracket, indicating a function-like macro 
    for line in aResult: 
        if not line['name'].endswith(")"):
            # Check if it's only a definition without content (e.g. #define feature)
            query = """g.V(%s).out().has('type', 'PreMacro').values('code')""" % (line['id'])
            hasMacroContent = db.runGremlinQuery(query)
            
            # If so, just add it to the SU, as a pure define can has no "usage"
            # We also check for /* as same-line comments can be falsely labeled as macro content
            if len(hasMacroContent) == 0 or str(hasMacroContent).startswith("/*"):
                # Add the whole id, not the digits one by one
                semanticUnit.update([line['id']]) 
                if (DEBUG) : print("Found additional non-function-like #define without macro content: "+str(line['name'])) 
            # Otherwise    
            else:
                # Check if identifier appears somewhere in the visible statements of the SU 
                # Note: As textContains is very unprecise, we get more results than needed (e.g. "H_SIZE" is true for "size")
                query = """idListToNodes(%s).has('type', within(%s)).has('code', textContains('%s')).values('code')""" % (list(semanticUnit), visibleStatementTypes, line['name'])  
                result = db.runGremlinQuery(query)
                # If so, add it to the su (we check here again, due to the unpreciseness mentioned above)
                if line['name'] in str(result):
                    # Add the whole id, not the digits one by one
                    semanticUnit.update([line['id']]) 
                    if (DEBUG) : print("Found additional probably used non-function-like #define: "+str(line['name'])) 


              
    
###################################### Statistics ############################################################### 

def countNodes():
    # Count nodes of whole project
    query = "g.V().count()"
    statResult = db.runGremlinQuery(query) 
    print("The whole project has "+str(statResult[0])+" nodes.")
    # Write to file
    with open("Evaluation/EvaluationStatistics/sizes.txt", "a") as file:
        file.write("\nStatistics based on graph nodes: \n")
        file.write("The whole project has "+str(statResult[0])+" nodes.\n")
        
    # Count nodes of whole project that are visible (query is a little more complex because some nodes have visible types but are contained in other visible parent nodes)
    query = """g.V().has('type', within(%s))
    .not(__.repeat(__.in(AST_EDGE)).emit().has('type', within('ForInit','StructUnionEnum')))
    .dedup().count()""" % (visibleStatementTypes) 
    statResult = db.runGremlinQuery(query) 
    print(str(statResult[0])+" of them are visible and directly appear as lines of code (top nodes).")
    
    # Write to file
    with open("Evaluation/EvaluationStatistics/sizes.txt", "a") as file:
        file.write(str(statResult[0])+" of them are visible and directly appear as lines of code (top nodes).\n")
        
    # Count nodes of SU
    print("The SU has "+str(len(semanticUnit))+" nodes.")
    
    # Count nodes of SU that are visible
    query = """idListToNodes(%s).has('type', within(%s))
    .not(__.repeat(__.in(AST_EDGE)).emit().has('type', within('ForInit','StructUnionEnum')))
    .dedup().count()""" % (list(semanticUnit), visibleStatementTypes) 
    statResult = db.runGremlinQuery(query) 
    print(str(statResult[0])+" of them are visible and directly appear as lines of code (top nodes).")
    print("--------------------------------------------------------------------------------- \n")    
    
    # Write last results to file
    with open("Evaluation/EvaluationStatistics/sizes.txt", "a") as file:
        file.write("The SU has "+str(len(semanticUnit))+" nodes.\n")
        file.write(str(statResult[0])+" of them are visible and directly appear as lines of code (top nodes).\n")
        file.write("*********************************************************************************** \n")
        file.write("The configuration was: \n")
        file.write(" includeEnclosedCode = "+str(includeEnclosedCode)+
        " \n connectIfWithElse = "+str(connectIfWithElse)+
        " \n followDataflows = "+str(followDataflows)+
        " \n searchDirsRecursively = "+str(searchDirsRecursively)+
        " \n includeOtherFeatures = "+str(includeOtherFeatures)+
        " \n lookForAllFunctionCalls = "+str(lookForAllFunctionCalls)+
        " \n lookForAllMacroUsages = "+str(lookForAllMacroUsages)+
        " \n includeBackwardSlice = "+str(includeBackwardSlice)+
        " \n includeParentBlocks = "+str(includeParentBlocks)+
        " \n includeLocalDataflows = "+str(includeLocalDataflows)+
        " \n includeParentFunction = "+str(includeParentFunction)+       
        " \n addAllFilesIncludedBySUFilesRecursively = "+str(addAllFilesIncludedBySUFilesRecursively)+
        " \n addAllExternalLibraryIncludes = "+str(addAllExternalLibraryIncludes)+
        " \n addExternalLibraryIncludesOnlyForSUFiles = "+str(addExternalLibraryIncludesOnlyForSUFiles)+
        " \n addAllInternalFileIncludes = "+str(addAllInternalFileIncludes)+
        " \n addInternalFileIncludesOnlyForSUFiles = "+str(addInternalFileIncludesOnlyForSUFiles)+
        " \n addOnlyProbablyUsedGlobalDeclarationsOfVariables = "+str(addOnlyProbablyUsedGlobalDeclarationsOfVariables)+
        " \n addAllGoblaDelcarationsOfVariablesForSUFiles = "+str(addAllGoblaDelcarationsOfVariablesForSUFiles)+
        " \n addAllGoblaDelcarationsOfVariables = "+str(addAllGoblaDelcarationsOfVariables)+
        " \n addOnlyProbablyUsedNonFunctionLikeDefines = "+str(addOnlyProbablyUsedNonFunctionLikeDefines)+
        " \n addNonFunctionLikeDefinesForSUFiles = "+str(addNonFunctionLikeDefinesForSUFiles)+
        " \n addAllNonFunctionLikeDefines = "+str(addAllNonFunctionLikeDefines)+
        " \n addVariabilityInformation = "+str(addVariabilityInformation)+
        " \n addComments = "+str(addAssociatedComments)+" \n")
        file.write("*********************************************************************************** \n")

   
###################################### Input ###############################################################    

# Input options for evaluation mode of workflow.py
def workflowInput(entryPointType, pathOrNameOrIdentifierOrString, statementLine, statementType):
    global entryFeatureNames, entryPointIds, entryIdentifiers, entryStrings, projectName
    
    print("--------------------------------------------------------------------------------- \n")
    print("Workflow evaluation mode activated")
    
    # Project name
    db.connectToDatabase("DonorProject")
    
    # Adapt behavior based on selected entry point type
    if (entryPointType == "Feature"):
        entryFeatureNames = list(pathOrNameOrIdentifierOrString)
        print("Set entry point feature to: "+str(entryFeatureNames)) 
        entryIdentifiers = list()
        entryPointIds = list()
        entryStrings = list()
        
    elif (entryPointType == "Identifier"):     
        entryIdentifiers = list(pathOrNameOrIdentifierOrString)
        print("Set entry point identifier to: "+str(entryIdentifiers)) 
        entryPointIds = list()
        entryFeatureNames = list()
        entryStrings = list()
        
    elif (entryPointType == "String"):    
        entryStrings = list(pathOrNameOrIdentifierOrString)
        print("Set entry point string to: "+str(entryStrings)) 
        entryIdentifiers = list()
        entryPointIds = list()
        entryFeatureNames = list()
        
    elif (entryPointType == "Location"):     
        # Set path of desired entry point    
        statementPath = pathOrNameOrIdentifierOrString[0]
   
        # Get results for nodes at statementPath and statementLine with statementType
        query = """g.V().has('path', textContains('%s')).has('line', '%s').has('type', '%s').id()""" % (statementPath, statementLine, statementType) 
        result = db.runGremlinQuery(query)
                                
        # If there is a statement at that path and line            
        if(len(result) > 0):
            # Set the entry point id      
            entryPointIds = list()    
            entryPointIds.append(int(result[0]))      
            print("Set entry point id to: "+str(entryPointIds))   
            entryIdentifiers = list() 
            entryFeatureNames = list()  
            entryStrings = list()    
        else:
            print(" ! ! ! Error recieving input node id from file: \""+statementPath+"\" at line: \""+statementLine+"\" with type: \""+statementType+"\" in evaluation mode ! ! ! ")
            quit()
    
    else :
        print(" ! ! ! Error in entry point type, no matching type found for: "+entryPointType+" ! ! ! ")
        quit()

                                

# Let the user interactively set the project and entry points via console inputs
def consoleInput():
    global entryFeatureNames, entryPointIds, entryIdentifiers, entryStrings, projectName
    
    print("--------------------------------------------------------------------------------- \n")
    print("Starting with project selection...")    
    
    currentDirname = os.getcwd()
    dataDirname = currentDirname.replace("/customScripts","/projects/octopus/data/projects")
    
    while True:

        # r=root, d=directories, f = files (only output the top level folder names)
        for r, d, f in os.walk(dataDirname):
            print("The following projects are currently in the database:")
            projectNames = d
            print(projectNames)
            break
            
        selectedProject = input("\nPlease type in the name of the project you would like to analyze  \n")
        
        # Only allow existing projects
        if (len(selectedProject) > 0 and selectedProject in projectNames):
            print("Current project is set to \""+selectedProject+"\"\n")
            projectName = selectedProject
            #Connect to DB
            db.connectToDatabase(projectName)
            break
        else:
            print("Please type in a valid project name \n")
    
    print("--------------------------------------------------------------------------------- \n")
    print("Starting with entry point selection...")
    
    # Feature or statement as entry point?
    while True:
        selection = input("Do you want to start with a feature/configuration option (1), a generic identifier (2), a generic string (3), or a specific line of code (4) ? \n")   
        # Initialize all different types    
        entryFeatureNames = list()
        entryIdentifiers = list()
        entryStrings = list()
        entryPointIds = list()
        
        # Feature
        if (selection == "1" or selection == "(1)" or selection == "feature" or selection == "configuration option"):           
            print("Please type in the name(s) of the feature/configuration option(s), one name per line")
            feature = input("Please type in the first name (required) \n")
            print("You selected \""+feature+"\" as entry point \n")
            entryFeatureNames.append(feature)
            
            #Add optional additional entry points
            while True:            
                feature = input("Do you want to add more names as entry points? If not, leave the input empty. \n")
                if len(feature) > 0:
                    print("You selected \""+feature+"\" as additional entry point \n")
                    entryFeatureNames.append(feature)
                else:
                    #Stop the input loop for additional entry points
                    break
                    
            #Stop the input loop for setting the entry point(s)
            break
        
        # Generic identifier
        elif (selection == "2" or selection == "(2)" or selection == "generic identifier" or selection == "identifier"):
            print("Please type in the desired identifier(s), one name per line")
            identifier = input("Please type in the first identifier (required) \n")
            print("You selected \""+identifier+"\" as entry point \n")
            entryIdentifiers.append(identifier)

            #Add optional additional entry points
            while True:            
                identifier = input("Do you want to add more identifiers as entry points? If not, leave the input empty. \n")
                if len(identifier) > 0:
                    print("You selected \""+identifier+"\" as additional entry point \n")
                    entryIdentifiers.append(identifier)
                else:
                    #Stop the input loop for additional entry points
                    break

            #Stop the input loop for setting the entry point(s)
            break   

        # Generic string
        elif (selection == "3" or selection == "(3)" or selection == "generic string" or selection == "string"):
            print("Please type in the desired string(s), one name per line")
            eString = input("Please type in the first string (required) \n")           
            print("You selected \""+eString+"\" as entry point \n")
            entryStrings.append(eString)
            
            #Add optional additional entry points
            while True:            
                eString = input("Do you want to add more strings as entry points? If not, leave the input empty. \n")
                if len(eString) > 0:
                    print("You selected \""+eString+"\" as additional entry point \n")
                    entryStrings.append(eString)
                else:
                    #Stop the input loop for additional entry points
                    break            
            
            #Stop the input loop for setting the entry point(s)
            break             
            
        # Statement input loop
        elif (selection == "4" or selection == "(4)" or selection == "code" or selection == "line of code" or selection == "specific line of code"):
            while True:
                statementPath = input("Please type in the path to the file containing the statement you would like to analyze relative to the project root \""+selectedProject+"\" e.g., \"/src/functions/FileContainingEntryPoint.c\"\n")
                statementLine = input("Please type in the line number of your statement \n")
                query = """g.V().has('path', textContains('%s')).has('line', '%s').or(
                __.has('isCFGNode'),
                __.in().has('type', 'File'),
                __.has('type', within('PreElIfStatement','PreElseStatement','PreEndIfStatement','FunctionDef'))
                ).union(values('path', 'code', 'type').fold(), id())""" % (statementPath, statementLine) 
                result = db.runGremlinQuery(query)
                                
                
                if(len(result) > 0):
                    print("The following statement(s) match(es) your request: \n")
                    print("##########################################################")
                    # Print the statement properties together with their id (the strange loop is due to the result structure)
                    for index, item in enumerate(result):
                        if ((index < len(result)-1) and (index % 2 == 0)):
                            print("Statement: "+str(item)+" with id: "+str(result[index+1]))     
                    print("########################################################## \n")   
                    
                    # Id input loop
                    while True:
                        selectedID = input("Please type in the id of the statement you would like to analyze \n")   
                        if( selectedID.isdigit()):  
                            #Check if the id exists    
                            query = """g.V(%s)""" % (selectedID) 
                            result = db.runGremlinQuery(query)
                            if (len(result) > 0):
                                # If so, set it as entry point
                                print("You selected \""+selectedID+"\" as entry point \n")
                                entryPointIds.append(selectedID)   
                                # Stop the id input loop if we get valid results        
                                break
                            else:    
                                print(selectedID+" is not a valid existing ID. Please try again.")                          
                        else:
                            print("Please insert a valid number")
                        
                    # Stop the statement input loop if we get valid results        
                    break
                else:
                    print(" ### No results found. Please try again ### \n")

            # Break for the first while (feature or statement)   
            break
            
        # Wrong entry
        else:
            print("Please select option (1) or (2)")
    
    print("--------------------------------------------------------------------------------- \n")
    

###################################### Output ###############################################################


# Output of the code of the Semantic Unit        
def codeOutput ():
    code = ['']
    for verticeId in semanticUnit: 
        query = """g.V(%s).values('code')""" % (verticeId)
        code.append(db.runGremlinQuery(query)) 
    
    for x in code: print(x)
    
# Output of the vertices of the Semantic Unit        
def nodeOutput ():
    code = ['']
    for verticeId in semanticUnit: 
        query = """g.V(%s)""" % (verticeId)
        code.append(db.runGremlinQuery(query)) 
    
    for x in code: print(x)
    
def fileOutput ():    
    #Get visible node ids of semanticUnit 
    if(generateOnlyVisibleCode):
        print("Get visible AST nodes")
        nodes = getVisibleASTNodes()      
    else:
        print("Code output is only available if --generateOnlyVisibleCode-- is selected")
   
        
    with open('Results/result.txt', 'w') as file_handler:
        file_handler.write(projectName+"\n")
        for item in semanticUnit:
            file_handler.write("{}\n".format(item))
   
####################################### Plotting ###############################################    
 
# Plots the results    
def plotResults ():
    # Get plot configuration
    plot_configuration = PlotConfiguration()
    #Config is read from plotconfig.cfg in same folder as SUI.py
    f = open((os.path.join(os.path.dirname(__file__), 'plotconfig.cfg')) , "r")
    plot_configuration.parse(f)
    labels = ["IS_AST_PARENT"] 
    
    #Get nodes of semanticUnit (either as AST or full property graph)
    if(generateOnlyVisibleCode):
        if (DEBUG) : print("Get visible AST nodes")
        nodes = getVisibleASTNodes()    
    elif (generateOnlyAST):
        if (DEBUG) : print("Get AST nodes")
        nodes = getASTNodes()        
    else:
        if (DEBUG) : print("Get nodes")
        nodes = getNodes()    

    #Get edges of semanticUnit (either only structural or all)
    if(showOnlyStructuralEdges):
        if (DEBUG) : print("Get structural edges")
        edges = getASTEdges()   
    else:    
        if (DEBUG) : print("Get edges")
        edges = getEdges()

    #Make the graph
    if (DEBUG) : print("Make graph")
    G = pgv.AGraph(directed=True, strict=False)
    if (DEBUG) : print("_addNodes")
    addNodes(plot_configuration, G, nodes)
    if (DEBUG) : print("_addEdges")
    if (len(edges) > 0):
        addEdges(plot_configuration, G, edges)
    #Output result
    output(G)  

# Returns all AST vertices of the SemanticUnit    
def getASTNodes():
    global semanticUnit 
    # Remove unneeded nodes
    query = """idListToNodes(%s).not(has('type', within('Symbol','CFGExitNode','CFGEntryNode'))).dedup().id()""" % (list(semanticUnit))  
    result = db.runGremlinQuery(query)
    # Update SU so that only the ids of the relevant nodes are inside (needed for fileOutput)
    semanticUnit = result
    # Get the whole nodes, not only the ids
    query = """idListToNodes(%s)""" % (list(result))  
    result = db.runGremlinQuery(query)
    return result    
    
# Returns all AST vertices of the SemanticUnit that directly appear in the code (CFG nodes or direct children of file nodes)    
def getVisibleASTNodes():
    global semanticUnit 
    # Remove unneeded nodes
    query = """idListToNodes(%s).has('type', within(%s))
        .not(__.repeat(__.in(AST_EDGE)).emit().has('type', within('ForInit','StructUnionEnum')))
        .dedup().id()""" % (list(semanticUnit), visibleStatementTypes)  
    result = db.runGremlinQuery(query)
    # Update SU so that only the ids of the relevant nodes are inside (needed for getEdges and fileOutput)
    semanticUnit = result
    # Get the whole nodes, not only the ids
    query = """idListToNodes(%s)""" % (list(result))  
    result = db.runGremlinQuery(query)
    return result    

# Returns all vertices of the SemanticUnit    
def getNodes():
    query = """idListToNodes(%s)""" % (list(semanticUnit))  
    return db.runGremlinQuery(query)
           
# Returns all AST edges of the Semantic Unit    
def getASTEdges():
    # Get all incoming edges that are part of the AST  
    query = """idListToNodes(%s).inE('IS_AST_PARENT','IS_FILE_OF','IS_FUNCTION_OF_AST','IS_PARENT_DIR_OF','VARIABILITY', 'DECLARES', 'INCLUDES', 'IS_HEADER_OF', 'COMMENTS')""" % (list(semanticUnit))   
    return db.runGremlinQuery(query)
    
# Returns all edges of the Semantic Unit    
def getEdges():
    # Get all incoming edges 
    query = """idListToNodes(%s).inE()""" % (list(semanticUnit))    
    return db.runGremlinQuery(query)       

# Adds nodes to the graph G    
def addNodes(plot_configuration, G, nodes):
    for v in nodes:
        nr = NodeResult(v)

        label = createGraphElementLabel(plot_configuration.getElementDisplayItems(nr))
        plot_properties = plot_configuration.getElementLayout(nr)
        if label:
            plot_properties['label'] = label
        G.add_node(nr.getId(), **plot_properties)
        
# Adds edges to the graph G 
def addEdges(plot_configuration, G, edges):
    for e in edges:
        er = EdgeResult(e)
        label = createGraphElementLabel(plot_configuration.getElementDisplayItems(er))
        plot_properties = plot_configuration.getElementLayout(er)
        plot_properties['label'] = label
        G.add_edge(er.getSrc(), er.getDest(), er.getId(), **plot_properties)

# Creates the labels for the graph        
def createGraphElementLabel(labeldata):
    return "\n".join([":".join([str(escape(e)) for e in d]) for d in labeldata])
    
# Formatting
def escape(label):
    return str(label).replace("\\", "\\\\")

# Writes output as .dot and .png in a folder named SemanticUnit                    
def output(G):
    #Formatting
    outputString = '// SemanticUnit \n'
    outputString += str(G) + '\n'
    outputString += '//###' + '\n'

    #Create folder with name of project (if its not already there)
    if not os.path.exists("SemanticUnit"):
        os.makedirs("SemanticUnit")
    #Filename contains the project name, the current function name and the graph type
    filename = 'SemanticUnit.dot'
    
    #Write to file
    print("Making of graph finished, creating "+filename+" ...")
    print("--------------------------------------------------------------------------------- \n")

    file = open("SemanticUnit/SemanticUnit.dot", 'w')
    file.write(outputString)
    file.close()
    
    # Use terminal output to convert .dot to .png
    os.system("dot -Tpng 'SemanticUnit/SemanticUnit.dot' -o 'SemanticUnit/SemanticUnit.png'")
    #Print status update
    print("Creation of plot was successfull!")    
    
    
################################################### Start of program #################################################################


# Un-comment to run the script via console
# Evaluation mode? (if False: the other parameters have no effect), "entryPointType", "pathOrNameOrIdentifierOrString", "statementLine", "statementType"
#initializeSUI(False, "Location", ["src/dfa.c"],"3602","FunctionDef")    

