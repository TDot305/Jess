// Generated from ..\java\antlr\Module.g4 by ANTLR 4.5.3

	package antlr;


  import java.util.Stack;
  import java.util.EmptyStackException;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ModuleParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, T__50=51, T__51=52, 
		T__52=53, T__53=54, T__54=55, T__55=56, T__56=57, IF=58, ELSE=59, FOR=60, 
		WHILE=61, BREAK=62, CASE=63, CONTINUE=64, SWITCH=65, DO=66, GOTO=67, RETURN=68, 
		TYPEDEF=69, STATIC=70, VOID=71, UNSIGNED=72, SIGNED=73, LONG=74, CV_QUALIFIER=75, 
		VIRTUAL=76, TRY=77, CATCH=78, THROW=79, USING=80, NAMESPACE=81, AUTO=82, 
		REGISTER=83, SPECIAL_DATA=84, PRE_IF=85, PRE_ELIF=86, PRE_ELSE=87, PRE_ENDIF=88, 
		PRE_DEFINE=89, PRE_UNDEF=90, PRE_DIAGNOSTIC=91, PRE_OTHER=92, PRE_INCLUDE=93, 
		PRE_INCLUDE_NEXT=94, PRE_LINE=95, PRE_PRAGMA=96, PRE_GCC=97, PRE_PRAGMA_KEYWORDS=98, 
		PRE_STR=99, OPERATOR=100, TEMPLATE=101, NEW=102, CLASS_KEY=103, ALPHA_NUMERIC=104, 
		OPENING_CURLY=105, CLOSING_CURLY=106, HEX_LITERAL=107, DECIMAL_LITERAL=108, 
		OCTAL_LITERAL=109, FLOATING_POINT_LITERAL=110, COMMENT=111, CHAR=112, 
		STRING=113, NEWLINE=114, ESCAPE=115, WHITESPACE=116, ELLIPSIS=117, OTHER=118;
	public static final int
		RULE_code = 0, RULE_using_directive = 1, RULE_pre_statement = 2, RULE_pre_blockstarter = 3, 
		RULE_pre_if_statement = 4, RULE_pre_elif_statement = 5, RULE_pre_else_statement = 6, 
		RULE_pre_endif_statement = 7, RULE_pre_if_condition = 8, RULE_condition = 9, 
		RULE_pre_command = 10, RULE_pre_define = 11, RULE_pre_undef = 12, RULE_pre_macro_identifier = 13, 
		RULE_pre_macro_parameters = 14, RULE_pre_macro = 15, RULE_pre_diagnostic = 16, 
		RULE_pre_other = 17, RULE_pre_include = 18, RULE_pre_include_next = 19, 
		RULE_pre_include_system_header = 20, RULE_pre_include_local_file = 21, 
		RULE_pre_include_filename = 22, RULE_pre_line = 23, RULE_pre_pragma = 24, 
		RULE_custom = 25, RULE_asciiTab = 26, RULE_externC = 27, RULE_macroFunctionPointer = 28, 
		RULE_expr = 29, RULE_assign_expr = 30, RULE_conditional_expression = 31, 
		RULE_or_expression = 32, RULE_and_expression = 33, RULE_inclusive_or_expression = 34, 
		RULE_exclusive_or_expression = 35, RULE_bit_and_expression = 36, RULE_equality_expression = 37, 
		RULE_relational_expression = 38, RULE_shift_expression = 39, RULE_additive_expression = 40, 
		RULE_multiplicative_expression = 41, RULE_cast_expression = 42, RULE_cast_target = 43, 
		RULE_unary_expression = 44, RULE_new_expression = 45, RULE_unary_op_and_cast_expr = 46, 
		RULE_sizeof_expression = 47, RULE_sizeof = 48, RULE_defined_expression = 49, 
		RULE_sizeof_operand = 50, RULE_sizeof_operand2 = 51, RULE_inc_dec = 52, 
		RULE_postfix_expression = 53, RULE_macroCall = 54, RULE_function_argument_list = 55, 
		RULE_function_argument = 56, RULE_primary_expression = 57, RULE_comment = 58, 
		RULE_newline = 59, RULE_unary_operator = 60, RULE_relational_operator = 61, 
		RULE_constant = 62, RULE_function_decl_specifiers = 63, RULE_ptr_operator = 64, 
		RULE_access_specifier = 65, RULE_operator = 66, RULE_assignment_operator = 67, 
		RULE_equality_operator = 68, RULE_template_decl_start = 69, RULE_template_param_list = 70, 
		RULE_no_brackets = 71, RULE_no_brackets_curlies_or_squares = 72, RULE_no_brackets_or_semicolon = 73, 
		RULE_no_angle_brackets_or_brackets = 74, RULE_no_curlies = 75, RULE_no_squares = 76, 
		RULE_no_squares_or_semicolon = 77, RULE_no_comma_or_semicolon = 78, RULE_assign_water = 79, 
		RULE_assign_water_l2 = 80, RULE_water = 81, RULE_function_def = 82, RULE_return_type = 83, 
		RULE_function_param_list = 84, RULE_parameter_decl_clause = 85, RULE_parameter_decl = 86, 
		RULE_parameter_id = 87, RULE_compound_statement = 88, RULE_ctor_list = 89, 
		RULE_ctor_initializer = 90, RULE_initializer_id = 91, RULE_ctor_expr = 92, 
		RULE_function_name = 93, RULE_exception_specification = 94, RULE_type_id_list = 95, 
		RULE_init_declarator = 96, RULE_declarator = 97, RULE_callingConvetion = 98, 
		RULE_type_suffix = 99, RULE_assign_expr_w_ = 100, RULE_assign_expr_w__l2 = 101, 
		RULE_constant_expr_w_ = 102, RULE_simple_decl = 103, RULE_var_decl = 104, 
		RULE_special_datatype = 105, RULE_init_declarator_list = 106, RULE_initializer = 107, 
		RULE_initializer_list = 108, RULE_class_def = 109, RULE_class_name = 110, 
		RULE_base_classes = 111, RULE_base_class = 112, RULE_type_name = 113, 
		RULE_base_type = 114, RULE_param_decl_specifiers = 115, RULE_parameter_name = 116, 
		RULE_param_type_list = 117, RULE_param_type = 118, RULE_param_type_id = 119, 
		RULE_identifier = 120, RULE_number = 121, RULE_ptrs = 122, RULE_func_ptrs = 123;
	public static final String[] ruleNames = {
		"code", "using_directive", "pre_statement", "pre_blockstarter", "pre_if_statement", 
		"pre_elif_statement", "pre_else_statement", "pre_endif_statement", "pre_if_condition", 
		"condition", "pre_command", "pre_define", "pre_undef", "pre_macro_identifier", 
		"pre_macro_parameters", "pre_macro", "pre_diagnostic", "pre_other", "pre_include", 
		"pre_include_next", "pre_include_system_header", "pre_include_local_file", 
		"pre_include_filename", "pre_line", "pre_pragma", "custom", "asciiTab", 
		"externC", "macroFunctionPointer", "expr", "assign_expr", "conditional_expression", 
		"or_expression", "and_expression", "inclusive_or_expression", "exclusive_or_expression", 
		"bit_and_expression", "equality_expression", "relational_expression", 
		"shift_expression", "additive_expression", "multiplicative_expression", 
		"cast_expression", "cast_target", "unary_expression", "new_expression", 
		"unary_op_and_cast_expr", "sizeof_expression", "sizeof", "defined_expression", 
		"sizeof_operand", "sizeof_operand2", "inc_dec", "postfix_expression", 
		"macroCall", "function_argument_list", "function_argument", "primary_expression", 
		"comment", "newline", "unary_operator", "relational_operator", "constant", 
		"function_decl_specifiers", "ptr_operator", "access_specifier", "operator", 
		"assignment_operator", "equality_operator", "template_decl_start", "template_param_list", 
		"no_brackets", "no_brackets_curlies_or_squares", "no_brackets_or_semicolon", 
		"no_angle_brackets_or_brackets", "no_curlies", "no_squares", "no_squares_or_semicolon", 
		"no_comma_or_semicolon", "assign_water", "assign_water_l2", "water", "function_def", 
		"return_type", "function_param_list", "parameter_decl_clause", "parameter_decl", 
		"parameter_id", "compound_statement", "ctor_list", "ctor_initializer", 
		"initializer_id", "ctor_expr", "function_name", "exception_specification", 
		"type_id_list", "init_declarator", "declarator", "callingConvetion", "type_suffix", 
		"assign_expr_w_", "assign_expr_w__l2", "constant_expr_w_", "simple_decl", 
		"var_decl", "special_datatype", "init_declarator_list", "initializer", 
		"initializer_list", "class_def", "class_name", "base_classes", "base_class", 
		"type_name", "base_type", "param_decl_specifiers", "parameter_name", "param_type_list", 
		"param_type", "param_type_id", "identifier", "number", "ptrs", "func_ptrs"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "'('", "')'", "'='", "','", "'<'", "'>'", "'.'", "'-'", "'/'", 
		"'extern'", "'\"C\"'", "'?'", "':'", "'||'", "'&&'", "'|'", "'^'", "'&'", 
		"'<<'", "'>>'", "'+'", "'*'", "'%'", "'::'", "'['", "']'", "'sizeof'", 
		"'defined'", "'--'", "'++'", "'->'", "'~'", "'!'", "'<='", "'>='", "'inline'", 
		"'explicit'", "'friend'", "'public'", "'private'", "'protected'", "'delete'", 
		"'+='", "'-='", "'*='", "'/='", "'%='", "'^='", "'&='", "'|='", "'>>='", 
		"'<<='", "'=='", "'!='", "'->*'", "'restrict'", "'if'", "'else'", "'for'", 
		"'while'", "'break'", "'case'", "'continue'", "'switch'", "'do'", "'goto'", 
		"'return'", "'typedef'", "'static'", "'void'", "'unsigned'", "'signed'", 
		"'long'", null, "'virtual'", "'try'", "'catch'", "'throw'", "'using'", 
		"'namespace'", "'auto'", "'register'", null, null, null, null, null, null, 
		null, null, null, null, null, null, null, "'GCC'", null, null, "'operator'", 
		"'template'", "'new'", "'class'", null, "'{'", "'}'", null, null, null, 
		null, null, null, null, null, "'\\'", null, "'...'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, "IF", "ELSE", 
		"FOR", "WHILE", "BREAK", "CASE", "CONTINUE", "SWITCH", "DO", "GOTO", "RETURN", 
		"TYPEDEF", "STATIC", "VOID", "UNSIGNED", "SIGNED", "LONG", "CV_QUALIFIER", 
		"VIRTUAL", "TRY", "CATCH", "THROW", "USING", "NAMESPACE", "AUTO", "REGISTER", 
		"SPECIAL_DATA", "PRE_IF", "PRE_ELIF", "PRE_ELSE", "PRE_ENDIF", "PRE_DEFINE", 
		"PRE_UNDEF", "PRE_DIAGNOSTIC", "PRE_OTHER", "PRE_INCLUDE", "PRE_INCLUDE_NEXT", 
		"PRE_LINE", "PRE_PRAGMA", "PRE_GCC", "PRE_PRAGMA_KEYWORDS", "PRE_STR", 
		"OPERATOR", "TEMPLATE", "NEW", "CLASS_KEY", "ALPHA_NUMERIC", "OPENING_CURLY", 
		"CLOSING_CURLY", "HEX_LITERAL", "DECIMAL_LITERAL", "OCTAL_LITERAL", "FLOATING_POINT_LITERAL", 
		"COMMENT", "CHAR", "STRING", "NEWLINE", "ESCAPE", "WHITESPACE", "ELLIPSIS", 
		"OTHER"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Module.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


		// Find the closing bracket to the opening bracket (and then return true), skip
		// everything that is in between
		public boolean skipToEndOfObject() {
			// Stack of curly brackets
			Stack<Object> CurlyStack = new Stack<Object>();
			// Object for the brackets
			Object o = new Object();
			// returns the value of the current symbol in the stream (which is the next
			// symbol to be consumed)
			int t = _input.LA(1);

			// Find the closing bracket to the opening bracket, skip everything that is in
			// between
			while (t != EOF && !(CurlyStack.empty() && t == CLOSING_CURLY)) {

				// If there is an #else inside a method or class
				if (t == PRE_ELSE || t == PRE_ELIF) {
					// Stack for collecting #ifs
					Stack<Object> ifdefStack = new Stack<Object>();
					// Return and parse #else, skip to next input
					consume();
					t = _input.LA(1);

					// Find the closing #endif to the opening #else, skip everything that is in
					// between (#else/#endif included)
					while (t != EOF && !(ifdefStack.empty() && (t == PRE_ENDIF))) {
						// Collect all found opening #ifs. If a #endif is found, remove one #if/#else
						// from stack
						if (t == PRE_IF)
							ifdefStack.push(o);
						else if (t == PRE_ENDIF)
							ifdefStack.pop();

						// Return and parse current t, skip to next input
						consume();
						t = _input.LA(1);
					}
				}

				// Collect all found opening brackets. If a closing bracket is found, remove one
				// opening bracket from stack
				if (t == OPENING_CURLY)
					CurlyStack.push(o);
				else if (t == CLOSING_CURLY)
					CurlyStack.pop();

				// Consume and return the current symbol, move cursor to next symbol, the
				// consumed symbol is added to the parse tree
				consume();
				t = _input.LA(1);
			}

			if (t != EOF) {
				// Return the closing bracket (if there is one)
				consume();
			}

			return true;
		}
	            
	       // this should go into FunctionGrammar but ANTLR fails
	       // to join the parser::members-section on inclusion
	       
	       //Find the closing #endif to the opening #if (and then return true), skip everything that is in between
	       public boolean preProcSkipToEnd()  {
	       		//Stack for collecting #ifs
	            Stack<Object> PreprocessorStack = new Stack<Object>();
	            //Object for the  #ifs
	            Object o = new Object();
	            //returns the value of the current symbol in the stream (which is the next symbol to be consumed)
	            int t = _input.LA(1);

					//Look for the closing #endif to the first opening #if
	                while(t != EOF && !(PreprocessorStack.empty() && t == PRE_ENDIF)){
	                        //Collect all found opening #ifs. If a #endif is found, remove one #if from stack                    
	                        if(t == PRE_IF)
	                            PreprocessorStack.push(o);
	                        else if(t == PRE_ENDIF)
	                            PreprocessorStack.pop();
	                            
	                        //Consume and return the current symbol, move cursor to next symbol, the consumed symbol is added to the parse tree 
	                        consume();
	                        t = _input.LA(1);
	                }
	                //Return and parse the closing #endif (if there is one)
	                if(t != EOF)
	 					consume();
	                return true;
	       }
	       
	      //Find the end of a preprocessor macro
	     public boolean preProcFindMacroEnd()  {
	          //Stack for backslashes
	          Stack<Object> slashStack = new Stack<Object>();
	          //Object for the  slashes
	          Object o = new Object();
	          //returns the value of the current symbol in the stream (which is the next symbol to be consumed)
	          int t = _input.LA(1);

	            //Look for end of the macro where a newline appears without a previous backslash
	            while(t != EOF && !(slashStack.empty() && t == NEWLINE)){
	                
	                   //Count escape and newline characters, but dont parse them                    
	                  if(t == ESCAPE){
	                        slashStack.push(o);
	                        t = WHITESPACE; 
	                  } else if(t == NEWLINE) {
	                        slashStack.pop();
	                        t = WHITESPACE;
	                  }
	                                   
	                  //Consume and return the current symbol, move cursor to next symbol, the consumed symbol is added to the parse tree 
	                  consume();
	                  t = _input.LA(1);
	             }                                             
	   	return true;
		}
		
		 //Find the end of a preprocessor macro
	     public boolean preProcFindConditionEnd()  {
	         int t = _input.LA(1);
	         //System.out.println("Scan: "+t); 
	         
	         //Look for end of the macro where a newline appears without a previous backslash
	         while(!(t == EOF || t == NEWLINE || t == COMMENT)){

	             
	             //Consume and return the current symbol, move cursor to next symbol, the consumed symbol is added to the parse tree 
	             consume();
	             t = _input.LA(1); 
	//             System.out.println("New t: "+t);                 
	         }   
	         
	         //The newline or the EOF belong to the PreIfStatement's code   
	         if(t == NEWLINE || t == EOF ){
	                //System.out.println("Newline found");
	                consume();
	          } 
	          
	          //The comment does not belong to the PreIfStatement's code 
	          if(t == COMMENT){
	                //System.out.println("Comment found");
	                //exitRule();
	               // createTerminalNode(parent,t);
	              // t = EOF;
	          }              
	         
	         //Look for / \n or begin of a comment
	         return true;
	     }
	     
	         //Find the end of a preprocessor macro
	     public boolean skipComments()  {
	         int t = _input.LA(1);
	         System.out.println("Scan: "+t);          
	          
	          //The comment does not belong to the PreIfStatement's code 
	          if(t == COMMENT){
	              //Look for newline or EOF          
	              for(int i = 1; !(t == NEWLINE || t == EOF); i++){
	                  t = _input.LA(1+i); 
	              }
	              consume();
	              System.out.println("Consumed");
	                //exitRule();
	               // createTerminalNode(parent,t);
	              // t = EOF;
	          }              
	         
	         //Look for / \n or begin of a comment
	         return true;
	     }


	public ModuleParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class CodeContext extends ParserRuleContext {
		public List<Pre_statementContext> pre_statement() {
			return getRuleContexts(Pre_statementContext.class);
		}
		public Pre_statementContext pre_statement(int i) {
			return getRuleContext(Pre_statementContext.class,i);
		}
		public List<Function_defContext> function_def() {
			return getRuleContexts(Function_defContext.class);
		}
		public Function_defContext function_def(int i) {
			return getRuleContext(Function_defContext.class,i);
		}
		public List<Simple_declContext> simple_decl() {
			return getRuleContexts(Simple_declContext.class);
		}
		public Simple_declContext simple_decl(int i) {
			return getRuleContext(Simple_declContext.class,i);
		}
		public List<Using_directiveContext> using_directive() {
			return getRuleContexts(Using_directiveContext.class);
		}
		public Using_directiveContext using_directive(int i) {
			return getRuleContext(Using_directiveContext.class,i);
		}
		public List<CommentContext> comment() {
			return getRuleContexts(CommentContext.class);
		}
		public CommentContext comment(int i) {
			return getRuleContext(CommentContext.class,i);
		}
		public List<CustomContext> custom() {
			return getRuleContexts(CustomContext.class);
		}
		public CustomContext custom(int i) {
			return getRuleContext(CustomContext.class,i);
		}
		public List<WaterContext> water() {
			return getRuleContexts(WaterContext.class);
		}
		public WaterContext water(int i) {
			return getRuleContext(WaterContext.class,i);
		}
		public CodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_code; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterCode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitCode(this);
		}
	}

	public final CodeContext code() throws RecognitionException {
		CodeContext _localctx = new CodeContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_code);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(257);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << IF) | (1L << ELSE) | (1L << FOR) | (1L << WHILE) | (1L << BREAK) | (1L << CASE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (CONTINUE - 64)) | (1L << (SWITCH - 64)) | (1L << (DO - 64)) | (1L << (GOTO - 64)) | (1L << (RETURN - 64)) | (1L << (TYPEDEF - 64)) | (1L << (STATIC - 64)) | (1L << (VOID - 64)) | (1L << (UNSIGNED - 64)) | (1L << (SIGNED - 64)) | (1L << (LONG - 64)) | (1L << (CV_QUALIFIER - 64)) | (1L << (VIRTUAL - 64)) | (1L << (TRY - 64)) | (1L << (CATCH - 64)) | (1L << (THROW - 64)) | (1L << (USING - 64)) | (1L << (NAMESPACE - 64)) | (1L << (AUTO - 64)) | (1L << (REGISTER - 64)) | (1L << (SPECIAL_DATA - 64)) | (1L << (PRE_IF - 64)) | (1L << (PRE_ELIF - 64)) | (1L << (PRE_ELSE - 64)) | (1L << (PRE_ENDIF - 64)) | (1L << (PRE_DEFINE - 64)) | (1L << (PRE_UNDEF - 64)) | (1L << (PRE_DIAGNOSTIC - 64)) | (1L << (PRE_OTHER - 64)) | (1L << (PRE_INCLUDE - 64)) | (1L << (PRE_INCLUDE_NEXT - 64)) | (1L << (PRE_LINE - 64)) | (1L << (PRE_PRAGMA - 64)) | (1L << (PRE_GCC - 64)) | (1L << (PRE_PRAGMA_KEYWORDS - 64)) | (1L << (PRE_STR - 64)) | (1L << (OPERATOR - 64)) | (1L << (TEMPLATE - 64)) | (1L << (NEW - 64)) | (1L << (CLASS_KEY - 64)) | (1L << (ALPHA_NUMERIC - 64)) | (1L << (OPENING_CURLY - 64)) | (1L << (CLOSING_CURLY - 64)) | (1L << (HEX_LITERAL - 64)) | (1L << (DECIMAL_LITERAL - 64)) | (1L << (OCTAL_LITERAL - 64)) | (1L << (FLOATING_POINT_LITERAL - 64)) | (1L << (COMMENT - 64)) | (1L << (CHAR - 64)) | (1L << (STRING - 64)) | (1L << (NEWLINE - 64)) | (1L << (ESCAPE - 64)) | (1L << (WHITESPACE - 64)) | (1L << (ELLIPSIS - 64)) | (1L << (OTHER - 64)))) != 0)) {
				{
				setState(255);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(248);
					pre_statement();
					}
					break;
				case 2:
					{
					setState(249);
					function_def();
					}
					break;
				case 3:
					{
					setState(250);
					simple_decl();
					}
					break;
				case 4:
					{
					setState(251);
					using_directive();
					}
					break;
				case 5:
					{
					setState(252);
					comment();
					}
					break;
				case 6:
					{
					setState(253);
					custom();
					}
					break;
				case 7:
					{
					setState(254);
					water();
					}
					break;
				}
				}
				setState(259);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Using_directiveContext extends ParserRuleContext {
		public TerminalNode USING() { return getToken(ModuleParser.USING, 0); }
		public TerminalNode NAMESPACE() { return getToken(ModuleParser.NAMESPACE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Using_directiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_using_directive; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterUsing_directive(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitUsing_directive(this);
		}
	}

	public final Using_directiveContext using_directive() throws RecognitionException {
		Using_directiveContext _localctx = new Using_directiveContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_using_directive);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
			match(USING);
			setState(261);
			match(NAMESPACE);
			setState(262);
			identifier();
			setState(263);
			match(T__0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Pre_statementContext extends ParserRuleContext {
		public Pre_blockstarterContext pre_blockstarter() {
			return getRuleContext(Pre_blockstarterContext.class,0);
		}
		public Pre_commandContext pre_command() {
			return getRuleContext(Pre_commandContext.class,0);
		}
		public Pre_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pre_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterPre_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitPre_statement(this);
		}
	}

	public final Pre_statementContext pre_statement() throws RecognitionException {
		Pre_statementContext _localctx = new Pre_statementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_pre_statement);
		try {
			setState(267);
			switch (_input.LA(1)) {
			case PRE_IF:
			case PRE_ELIF:
			case PRE_ELSE:
			case PRE_ENDIF:
				enterOuterAlt(_localctx, 1);
				{
				setState(265);
				pre_blockstarter();
				}
				break;
			case PRE_DEFINE:
			case PRE_UNDEF:
			case PRE_DIAGNOSTIC:
			case PRE_OTHER:
			case PRE_INCLUDE:
			case PRE_INCLUDE_NEXT:
			case PRE_LINE:
			case PRE_PRAGMA:
				enterOuterAlt(_localctx, 2);
				{
				setState(266);
				pre_command();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Pre_blockstarterContext extends ParserRuleContext {
		public Pre_if_statementContext pre_if_statement() {
			return getRuleContext(Pre_if_statementContext.class,0);
		}
		public Pre_elif_statementContext pre_elif_statement() {
			return getRuleContext(Pre_elif_statementContext.class,0);
		}
		public Pre_else_statementContext pre_else_statement() {
			return getRuleContext(Pre_else_statementContext.class,0);
		}
		public Pre_endif_statementContext pre_endif_statement() {
			return getRuleContext(Pre_endif_statementContext.class,0);
		}
		public Pre_blockstarterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pre_blockstarter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterPre_blockstarter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitPre_blockstarter(this);
		}
	}

	public final Pre_blockstarterContext pre_blockstarter() throws RecognitionException {
		Pre_blockstarterContext _localctx = new Pre_blockstarterContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_pre_blockstarter);
		try {
			setState(273);
			switch (_input.LA(1)) {
			case PRE_IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(269);
				pre_if_statement();
				}
				break;
			case PRE_ELIF:
				enterOuterAlt(_localctx, 2);
				{
				setState(270);
				pre_elif_statement();
				}
				break;
			case PRE_ELSE:
				enterOuterAlt(_localctx, 3);
				{
				setState(271);
				pre_else_statement();
				}
				break;
			case PRE_ENDIF:
				enterOuterAlt(_localctx, 4);
				{
				setState(272);
				pre_endif_statement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Pre_if_statementContext extends ParserRuleContext {
		public TerminalNode PRE_IF() { return getToken(ModuleParser.PRE_IF, 0); }
		public Pre_if_conditionContext pre_if_condition() {
			return getRuleContext(Pre_if_conditionContext.class,0);
		}
		public Pre_if_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pre_if_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterPre_if_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitPre_if_statement(this);
		}
	}

	public final Pre_if_statementContext pre_if_statement() throws RecognitionException {
		Pre_if_statementContext _localctx = new Pre_if_statementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_pre_if_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
			match(PRE_IF);
			setState(276);
			pre_if_condition();
			 preProcFindConditionEnd(); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Pre_elif_statementContext extends ParserRuleContext {
		public TerminalNode PRE_ELIF() { return getToken(ModuleParser.PRE_ELIF, 0); }
		public Pre_if_conditionContext pre_if_condition() {
			return getRuleContext(Pre_if_conditionContext.class,0);
		}
		public Pre_elif_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pre_elif_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterPre_elif_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitPre_elif_statement(this);
		}
	}

	public final Pre_elif_statementContext pre_elif_statement() throws RecognitionException {
		Pre_elif_statementContext _localctx = new Pre_elif_statementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_pre_elif_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
			match(PRE_ELIF);
			setState(280);
			pre_if_condition();
			 preProcFindConditionEnd(); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Pre_else_statementContext extends ParserRuleContext {
		public TerminalNode PRE_ELSE() { return getToken(ModuleParser.PRE_ELSE, 0); }
		public Pre_else_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pre_else_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterPre_else_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitPre_else_statement(this);
		}
	}

	public final Pre_else_statementContext pre_else_statement() throws RecognitionException {
		Pre_else_statementContext _localctx = new Pre_else_statementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_pre_else_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(283);
			match(PRE_ELSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Pre_endif_statementContext extends ParserRuleContext {
		public TerminalNode PRE_ENDIF() { return getToken(ModuleParser.PRE_ENDIF, 0); }
		public Pre_endif_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pre_endif_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterPre_endif_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitPre_endif_statement(this);
		}
	}

	public final Pre_endif_statementContext pre_endif_statement() throws RecognitionException {
		Pre_endif_statementContext _localctx = new Pre_endif_statementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_pre_endif_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
			match(PRE_ENDIF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Pre_if_conditionContext extends ParserRuleContext {
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public Pre_if_conditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pre_if_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterPre_if_condition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitPre_if_condition(this);
		}
	}

	public final Pre_if_conditionContext pre_if_condition() throws RecognitionException {
		Pre_if_conditionContext _localctx = new Pre_if_conditionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_pre_if_condition);
		try {
			setState(292);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(287);
				condition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(288);
				match(T__1);
				setState(289);
				condition();
				setState(290);
				match(T__2);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Type_nameContext type_name() {
			return getRuleContext(Type_nameContext.class,0);
		}
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public Assign_exprContext assign_expr() {
			return getRuleContext(Assign_exprContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(ModuleParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(ModuleParser.NEWLINE, i);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitCondition(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_condition);
		int _la;
		try {
			setState(312);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(294);
				expr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(295);
				type_name();
				setState(296);
				declarator();
				setState(300);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(297);
					match(NEWLINE);
					}
					}
					setState(302);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(303);
				match(T__3);
				setState(307);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(304);
					match(NEWLINE);
					}
					}
					setState(309);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(310);
				assign_expr();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Pre_commandContext extends ParserRuleContext {
		public Pre_defineContext pre_define() {
			return getRuleContext(Pre_defineContext.class,0);
		}
		public Pre_undefContext pre_undef() {
			return getRuleContext(Pre_undefContext.class,0);
		}
		public Pre_diagnosticContext pre_diagnostic() {
			return getRuleContext(Pre_diagnosticContext.class,0);
		}
		public Pre_otherContext pre_other() {
			return getRuleContext(Pre_otherContext.class,0);
		}
		public Pre_includeContext pre_include() {
			return getRuleContext(Pre_includeContext.class,0);
		}
		public Pre_include_nextContext pre_include_next() {
			return getRuleContext(Pre_include_nextContext.class,0);
		}
		public Pre_lineContext pre_line() {
			return getRuleContext(Pre_lineContext.class,0);
		}
		public Pre_pragmaContext pre_pragma() {
			return getRuleContext(Pre_pragmaContext.class,0);
		}
		public Pre_commandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pre_command; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterPre_command(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitPre_command(this);
		}
	}

	public final Pre_commandContext pre_command() throws RecognitionException {
		Pre_commandContext _localctx = new Pre_commandContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_pre_command);
		try {
			setState(322);
			switch (_input.LA(1)) {
			case PRE_DEFINE:
				enterOuterAlt(_localctx, 1);
				{
				setState(314);
				pre_define();
				}
				break;
			case PRE_UNDEF:
				enterOuterAlt(_localctx, 2);
				{
				setState(315);
				pre_undef();
				}
				break;
			case PRE_DIAGNOSTIC:
				enterOuterAlt(_localctx, 3);
				{
				setState(316);
				pre_diagnostic();
				}
				break;
			case PRE_OTHER:
				enterOuterAlt(_localctx, 4);
				{
				setState(317);
				pre_other();
				}
				break;
			case PRE_INCLUDE:
				enterOuterAlt(_localctx, 5);
				{
				setState(318);
				pre_include();
				}
				break;
			case PRE_INCLUDE_NEXT:
				enterOuterAlt(_localctx, 6);
				{
				setState(319);
				pre_include_next();
				}
				break;
			case PRE_LINE:
				enterOuterAlt(_localctx, 7);
				{
				setState(320);
				pre_line();
				}
				break;
			case PRE_PRAGMA:
				enterOuterAlt(_localctx, 8);
				{
				setState(321);
				pre_pragma();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Pre_defineContext extends ParserRuleContext {
		public TerminalNode PRE_DEFINE() { return getToken(ModuleParser.PRE_DEFINE, 0); }
		public Pre_macro_identifierContext pre_macro_identifier() {
			return getRuleContext(Pre_macro_identifierContext.class,0);
		}
		public Pre_macro_parametersContext pre_macro_parameters() {
			return getRuleContext(Pre_macro_parametersContext.class,0);
		}
		public Pre_macroContext pre_macro() {
			return getRuleContext(Pre_macroContext.class,0);
		}
		public Pre_defineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pre_define; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterPre_define(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitPre_define(this);
		}
	}

	public final Pre_defineContext pre_define() throws RecognitionException {
		Pre_defineContext _localctx = new Pre_defineContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_pre_define);
		try {
			setState(337);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(324);
				match(PRE_DEFINE);
				setState(325);
				pre_macro_identifier();
				setState(326);
				match(T__1);
				setState(327);
				pre_macro_parameters();
				setState(328);
				match(T__2);
				setState(329);
				pre_macro();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(331);
				match(PRE_DEFINE);
				setState(332);
				pre_macro_identifier();
				setState(333);
				pre_macro();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(335);
				match(PRE_DEFINE);
				setState(336);
				pre_macro_identifier();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Pre_undefContext extends ParserRuleContext {
		public TerminalNode PRE_UNDEF() { return getToken(ModuleParser.PRE_UNDEF, 0); }
		public Pre_macro_identifierContext pre_macro_identifier() {
			return getRuleContext(Pre_macro_identifierContext.class,0);
		}
		public Pre_undefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pre_undef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterPre_undef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitPre_undef(this);
		}
	}

	public final Pre_undefContext pre_undef() throws RecognitionException {
		Pre_undefContext _localctx = new Pre_undefContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_pre_undef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(339);
			match(PRE_UNDEF);
			setState(340);
			pre_macro_identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Pre_macro_identifierContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Pre_macro_identifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pre_macro_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterPre_macro_identifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitPre_macro_identifier(this);
		}
	}

	public final Pre_macro_identifierContext pre_macro_identifier() throws RecognitionException {
		Pre_macro_identifierContext _localctx = new Pre_macro_identifierContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_pre_macro_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(342);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Pre_macro_parametersContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> ELLIPSIS() { return getTokens(ModuleParser.ELLIPSIS); }
		public TerminalNode ELLIPSIS(int i) {
			return getToken(ModuleParser.ELLIPSIS, i);
		}
		public Pre_macro_parametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pre_macro_parameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterPre_macro_parameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitPre_macro_parameters(this);
		}
	}

	public final Pre_macro_parametersContext pre_macro_parameters() throws RecognitionException {
		Pre_macro_parametersContext _localctx = new Pre_macro_parametersContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_pre_macro_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(346);
			switch (_input.LA(1)) {
			case T__39:
			case T__40:
			case T__41:
			case ALPHA_NUMERIC:
				{
				setState(344);
				identifier();
				}
				break;
			case ELLIPSIS:
				{
				setState(345);
				match(ELLIPSIS);
				}
				break;
			case T__2:
			case T__4:
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(355);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(348);
				match(T__4);
				setState(351);
				switch (_input.LA(1)) {
				case T__39:
				case T__40:
				case T__41:
				case ALPHA_NUMERIC:
					{
					setState(349);
					identifier();
					}
					break;
				case ELLIPSIS:
					{
					setState(350);
					match(ELLIPSIS);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(357);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Pre_macroContext extends ParserRuleContext {
		public Pre_macroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pre_macro; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterPre_macro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitPre_macro(this);
		}
	}

	public final Pre_macroContext pre_macro() throws RecognitionException {
		Pre_macroContext _localctx = new Pre_macroContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_pre_macro);
		try {
			enterOuterAlt(_localctx, 1);
			{
			 preProcFindMacroEnd(); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Pre_diagnosticContext extends ParserRuleContext {
		public TerminalNode PRE_DIAGNOSTIC() { return getToken(ModuleParser.PRE_DIAGNOSTIC, 0); }
		public TerminalNode STRING() { return getToken(ModuleParser.STRING, 0); }
		public Pre_diagnosticContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pre_diagnostic; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterPre_diagnostic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitPre_diagnostic(this);
		}
	}

	public final Pre_diagnosticContext pre_diagnostic() throws RecognitionException {
		Pre_diagnosticContext _localctx = new Pre_diagnosticContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_pre_diagnostic);
		try {
			setState(363);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(360);
				match(PRE_DIAGNOSTIC);
				setState(361);
				match(STRING);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(362);
				match(PRE_DIAGNOSTIC);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Pre_otherContext extends ParserRuleContext {
		public TerminalNode PRE_OTHER() { return getToken(ModuleParser.PRE_OTHER, 0); }
		public TerminalNode STRING() { return getToken(ModuleParser.STRING, 0); }
		public Pre_otherContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pre_other; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterPre_other(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitPre_other(this);
		}
	}

	public final Pre_otherContext pre_other() throws RecognitionException {
		Pre_otherContext _localctx = new Pre_otherContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_pre_other);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(365);
			match(PRE_OTHER);
			setState(367);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(366);
				match(STRING);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Pre_includeContext extends ParserRuleContext {
		public TerminalNode PRE_INCLUDE() { return getToken(ModuleParser.PRE_INCLUDE, 0); }
		public Pre_include_system_headerContext pre_include_system_header() {
			return getRuleContext(Pre_include_system_headerContext.class,0);
		}
		public Pre_macro_identifierContext pre_macro_identifier() {
			return getRuleContext(Pre_macro_identifierContext.class,0);
		}
		public Pre_include_local_fileContext pre_include_local_file() {
			return getRuleContext(Pre_include_local_fileContext.class,0);
		}
		public Pre_includeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pre_include; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterPre_include(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitPre_include(this);
		}
	}

	public final Pre_includeContext pre_include() throws RecognitionException {
		Pre_includeContext _localctx = new Pre_includeContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_pre_include);
		try {
			setState(375);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(369);
				match(PRE_INCLUDE);
				setState(370);
				pre_include_system_header();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(371);
				match(PRE_INCLUDE);
				setState(372);
				pre_macro_identifier();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(373);
				match(PRE_INCLUDE);
				setState(374);
				pre_include_local_file();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Pre_include_nextContext extends ParserRuleContext {
		public TerminalNode PRE_INCLUDE_NEXT() { return getToken(ModuleParser.PRE_INCLUDE_NEXT, 0); }
		public Pre_include_system_headerContext pre_include_system_header() {
			return getRuleContext(Pre_include_system_headerContext.class,0);
		}
		public Pre_macro_identifierContext pre_macro_identifier() {
			return getRuleContext(Pre_macro_identifierContext.class,0);
		}
		public Pre_include_local_fileContext pre_include_local_file() {
			return getRuleContext(Pre_include_local_fileContext.class,0);
		}
		public Pre_include_nextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pre_include_next; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterPre_include_next(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitPre_include_next(this);
		}
	}

	public final Pre_include_nextContext pre_include_next() throws RecognitionException {
		Pre_include_nextContext _localctx = new Pre_include_nextContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_pre_include_next);
		try {
			setState(383);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(377);
				match(PRE_INCLUDE_NEXT);
				setState(378);
				pre_include_system_header();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(379);
				match(PRE_INCLUDE_NEXT);
				setState(380);
				pre_macro_identifier();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(381);
				match(PRE_INCLUDE_NEXT);
				setState(382);
				pre_include_local_file();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Pre_include_system_headerContext extends ParserRuleContext {
		public Pre_include_filenameContext pre_include_filename() {
			return getRuleContext(Pre_include_filenameContext.class,0);
		}
		public Pre_include_system_headerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pre_include_system_header; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterPre_include_system_header(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitPre_include_system_header(this);
		}
	}

	public final Pre_include_system_headerContext pre_include_system_header() throws RecognitionException {
		Pre_include_system_headerContext _localctx = new Pre_include_system_headerContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_pre_include_system_header);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(385);
			match(T__5);
			setState(386);
			pre_include_filename();
			setState(387);
			match(T__6);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Pre_include_local_fileContext extends ParserRuleContext {
		public Pre_include_filenameContext pre_include_filename() {
			return getRuleContext(Pre_include_filenameContext.class,0);
		}
		public Pre_include_local_fileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pre_include_local_file; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterPre_include_local_file(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitPre_include_local_file(this);
		}
	}

	public final Pre_include_local_fileContext pre_include_local_file() throws RecognitionException {
		Pre_include_local_fileContext _localctx = new Pre_include_local_fileContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_pre_include_local_file);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(389);
			pre_include_filename();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Pre_include_filenameContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(ModuleParser.STRING, 0); }
		public List<TerminalNode> ALPHA_NUMERIC() { return getTokens(ModuleParser.ALPHA_NUMERIC); }
		public TerminalNode ALPHA_NUMERIC(int i) {
			return getToken(ModuleParser.ALPHA_NUMERIC, i);
		}
		public Pre_include_filenameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pre_include_filename; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterPre_include_filename(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitPre_include_filename(this);
		}
	}

	public final Pre_include_filenameContext pre_include_filename() throws RecognitionException {
		Pre_include_filenameContext _localctx = new Pre_include_filenameContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_pre_include_filename);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(397);
			switch (_input.LA(1)) {
			case STRING:
				{
				setState(391);
				match(STRING);
				}
				break;
			case T__7:
			case T__8:
			case T__9:
			case ALPHA_NUMERIC:
				{
				setState(393); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(392);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__8) | (1L << T__9))) != 0) || _la==ALPHA_NUMERIC) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(395); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Pre_lineContext extends ParserRuleContext {
		public TerminalNode PRE_LINE() { return getToken(ModuleParser.PRE_LINE, 0); }
		public TerminalNode DECIMAL_LITERAL() { return getToken(ModuleParser.DECIMAL_LITERAL, 0); }
		public TerminalNode STRING() { return getToken(ModuleParser.STRING, 0); }
		public Pre_macro_identifierContext pre_macro_identifier() {
			return getRuleContext(Pre_macro_identifierContext.class,0);
		}
		public Pre_lineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pre_line; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterPre_line(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitPre_line(this);
		}
	}

	public final Pre_lineContext pre_line() throws RecognitionException {
		Pre_lineContext _localctx = new Pre_lineContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_pre_line);
		try {
			setState(413);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(399);
				match(PRE_LINE);
				setState(400);
				match(DECIMAL_LITERAL);
				setState(401);
				match(STRING);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(402);
				match(PRE_LINE);
				setState(403);
				match(DECIMAL_LITERAL);
				setState(404);
				pre_macro_identifier();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(405);
				match(PRE_LINE);
				setState(406);
				pre_macro_identifier();
				setState(407);
				match(STRING);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(409);
				match(PRE_LINE);
				setState(410);
				pre_macro_identifier();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(411);
				match(PRE_LINE);
				setState(412);
				match(DECIMAL_LITERAL);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Pre_pragmaContext extends ParserRuleContext {
		public TerminalNode PRE_PRAGMA() { return getToken(ModuleParser.PRE_PRAGMA, 0); }
		public TerminalNode PRE_PRAGMA_KEYWORDS() { return getToken(ModuleParser.PRE_PRAGMA_KEYWORDS, 0); }
		public TerminalNode STRING() { return getToken(ModuleParser.STRING, 0); }
		public TerminalNode PRE_GCC() { return getToken(ModuleParser.PRE_GCC, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public Pre_pragmaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pre_pragma; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterPre_pragma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitPre_pragma(this);
		}
	}

	public final Pre_pragmaContext pre_pragma() throws RecognitionException {
		Pre_pragmaContext _localctx = new Pre_pragmaContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_pre_pragma);
		int _la;
		try {
			int _alt;
			setState(439);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(415);
				match(PRE_PRAGMA);
				setState(417);
				_la = _input.LA(1);
				if (_la==PRE_GCC) {
					{
					setState(416);
					match(PRE_GCC);
					}
				}

				setState(419);
				match(PRE_PRAGMA_KEYWORDS);
				setState(420);
				match(STRING);
				 preProcFindMacroEnd(); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(422);
				match(PRE_PRAGMA);
				setState(424);
				_la = _input.LA(1);
				if (_la==PRE_GCC) {
					{
					setState(423);
					match(PRE_GCC);
					}
				}

				setState(426);
				match(PRE_PRAGMA_KEYWORDS);
				setState(428); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(427);
						identifier();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(430); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(432);
				match(PRE_PRAGMA);
				setState(434);
				_la = _input.LA(1);
				if (_la==PRE_GCC) {
					{
					setState(433);
					match(PRE_GCC);
					}
				}

				setState(436);
				match(PRE_PRAGMA_KEYWORDS);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(437);
				match(PRE_PRAGMA);
				 preProcFindMacroEnd(); 
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CustomContext extends ParserRuleContext {
		public AsciiTabContext asciiTab() {
			return getRuleContext(AsciiTabContext.class,0);
		}
		public ExternCContext externC() {
			return getRuleContext(ExternCContext.class,0);
		}
		public MacroFunctionPointerContext macroFunctionPointer() {
			return getRuleContext(MacroFunctionPointerContext.class,0);
		}
		public CustomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_custom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterCustom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitCustom(this);
		}
	}

	public final CustomContext custom() throws RecognitionException {
		CustomContext _localctx = new CustomContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_custom);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(444);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				setState(441);
				asciiTab();
				}
				break;
			case 2:
				{
				setState(442);
				externC();
				}
				break;
			case 3:
				{
				setState(443);
				macroFunctionPointer();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AsciiTabContext extends ParserRuleContext {
		public List<Pre_macro_identifierContext> pre_macro_identifier() {
			return getRuleContexts(Pre_macro_identifierContext.class);
		}
		public Pre_macro_identifierContext pre_macro_identifier(int i) {
			return getRuleContext(Pre_macro_identifierContext.class,i);
		}
		public AsciiTabContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asciiTab; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterAsciiTab(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitAsciiTab(this);
		}
	}

	public final AsciiTabContext asciiTab() throws RecognitionException {
		AsciiTabContext _localctx = new AsciiTabContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_asciiTab);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(449); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(446);
					pre_macro_identifier();
					setState(447);
					match(T__4);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(451); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExternCContext extends ParserRuleContext {
		public TerminalNode OPENING_CURLY() { return getToken(ModuleParser.OPENING_CURLY, 0); }
		public ExternCContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_externC; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterExternC(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitExternC(this);
		}
	}

	public final ExternCContext externC() throws RecognitionException {
		ExternCContext _localctx = new ExternCContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_externC);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(453);
			match(T__10);
			setState(454);
			match(T__11);
			setState(456);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(455);
				match(OPENING_CURLY);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MacroFunctionPointerContext extends ParserRuleContext {
		public List<MacroCallContext> macroCall() {
			return getRuleContexts(MacroCallContext.class);
		}
		public MacroCallContext macroCall(int i) {
			return getRuleContext(MacroCallContext.class,i);
		}
		public Init_declarator_listContext init_declarator_list() {
			return getRuleContext(Init_declarator_listContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(ModuleParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(ModuleParser.NEWLINE, i);
		}
		public Pre_macro_identifierContext pre_macro_identifier() {
			return getRuleContext(Pre_macro_identifierContext.class,0);
		}
		public MacroFunctionPointerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_macroFunctionPointer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterMacroFunctionPointer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitMacroFunctionPointer(this);
		}
	}

	public final MacroFunctionPointerContext macroFunctionPointer() throws RecognitionException {
		MacroFunctionPointerContext _localctx = new MacroFunctionPointerContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_macroFunctionPointer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(458);
			macroCall();
			setState(460);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				setState(459);
				match(NEWLINE);
				}
				break;
			}
			setState(463);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				{
				setState(462);
				pre_macro_identifier();
				}
				break;
			}
			setState(466);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(465);
				match(NEWLINE);
				}
			}

			setState(468);
			macroCall();
			setState(470);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(469);
				match(NEWLINE);
				}
			}

			setState(472);
			init_declarator_list();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public Assign_exprContext assign_expr() {
			return getRuleContext(Assign_exprContext.class,0);
		}
		public List<TerminalNode> ESCAPE() { return getTokens(ModuleParser.ESCAPE); }
		public TerminalNode ESCAPE(int i) {
			return getToken(ModuleParser.ESCAPE, i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(ModuleParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(ModuleParser.NEWLINE, i);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_expr);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(474);
			assign_expr();
			setState(479);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(475);
					match(ESCAPE);
					setState(476);
					match(NEWLINE);
					}
					} 
				}
				setState(481);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			}
			setState(496);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				{
				setState(485);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(482);
					match(NEWLINE);
					}
					}
					setState(487);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(488);
				match(T__4);
				setState(492);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(489);
					match(NEWLINE);
					}
					}
					setState(494);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(495);
				expr();
				}
				break;
			}
			setState(502);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(498);
					match(ESCAPE);
					setState(499);
					match(NEWLINE);
					}
					} 
				}
				setState(504);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Assign_exprContext extends ParserRuleContext {
		public Conditional_expressionContext conditional_expression() {
			return getRuleContext(Conditional_expressionContext.class,0);
		}
		public Assignment_operatorContext assignment_operator() {
			return getRuleContext(Assignment_operatorContext.class,0);
		}
		public Assign_exprContext assign_expr() {
			return getRuleContext(Assign_exprContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(ModuleParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(ModuleParser.NEWLINE, i);
		}
		public Assign_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterAssign_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitAssign_expr(this);
		}
	}

	public final Assign_exprContext assign_expr() throws RecognitionException {
		Assign_exprContext _localctx = new Assign_exprContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_assign_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(505);
			conditional_expression();
			setState(521);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				{
				setState(509);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(506);
					match(NEWLINE);
					}
					}
					setState(511);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(512);
				assignment_operator();
				setState(516);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(513);
					match(NEWLINE);
					}
					}
					setState(518);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(519);
				assign_expr();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Conditional_expressionContext extends ParserRuleContext {
		public Conditional_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional_expression; }
	 
		public Conditional_expressionContext() { }
		public void copyFrom(Conditional_expressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NormOrContext extends Conditional_expressionContext {
		public Or_expressionContext or_expression() {
			return getRuleContext(Or_expressionContext.class,0);
		}
		public NormOrContext(Conditional_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterNormOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitNormOr(this);
		}
	}
	public static class CndExprContext extends Conditional_expressionContext {
		public Or_expressionContext or_expression() {
			return getRuleContext(Or_expressionContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Conditional_expressionContext conditional_expression() {
			return getRuleContext(Conditional_expressionContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(ModuleParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(ModuleParser.NEWLINE, i);
		}
		public CndExprContext(Conditional_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterCndExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitCndExpr(this);
		}
	}

	public final Conditional_expressionContext conditional_expression() throws RecognitionException {
		Conditional_expressionContext _localctx = new Conditional_expressionContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_conditional_expression);
		int _la;
		try {
			setState(554);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				_localctx = new NormOrContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(523);
				or_expression();
				}
				break;
			case 2:
				_localctx = new CndExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(524);
				or_expression();
				{
				setState(528);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(525);
					match(NEWLINE);
					}
					}
					setState(530);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(531);
				match(T__12);
				setState(535);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(532);
					match(NEWLINE);
					}
					}
					setState(537);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(538);
				expr();
				setState(542);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(539);
					match(NEWLINE);
					}
					}
					setState(544);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(545);
				match(T__13);
				setState(549);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(546);
					match(NEWLINE);
					}
					}
					setState(551);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(552);
				conditional_expression();
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Or_expressionContext extends ParserRuleContext {
		public And_expressionContext and_expression() {
			return getRuleContext(And_expressionContext.class,0);
		}
		public Or_expressionContext or_expression() {
			return getRuleContext(Or_expressionContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(ModuleParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(ModuleParser.NEWLINE, i);
		}
		public Or_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_or_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterOr_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitOr_expression(this);
		}
	}

	public final Or_expressionContext or_expression() throws RecognitionException {
		Or_expressionContext _localctx = new Or_expressionContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_or_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(556);
			and_expression();
			setState(571);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				{
				setState(560);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(557);
					match(NEWLINE);
					}
					}
					setState(562);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(563);
				match(T__14);
				setState(567);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(564);
					match(NEWLINE);
					}
					}
					setState(569);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(570);
				or_expression();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class And_expressionContext extends ParserRuleContext {
		public Inclusive_or_expressionContext inclusive_or_expression() {
			return getRuleContext(Inclusive_or_expressionContext.class,0);
		}
		public And_expressionContext and_expression() {
			return getRuleContext(And_expressionContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(ModuleParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(ModuleParser.NEWLINE, i);
		}
		public And_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_and_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterAnd_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitAnd_expression(this);
		}
	}

	public final And_expressionContext and_expression() throws RecognitionException {
		And_expressionContext _localctx = new And_expressionContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_and_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(573);
			inclusive_or_expression();
			setState(588);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				{
				setState(577);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(574);
					match(NEWLINE);
					}
					}
					setState(579);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(580);
				match(T__15);
				setState(584);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(581);
					match(NEWLINE);
					}
					}
					setState(586);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(587);
				and_expression();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Inclusive_or_expressionContext extends ParserRuleContext {
		public Exclusive_or_expressionContext exclusive_or_expression() {
			return getRuleContext(Exclusive_or_expressionContext.class,0);
		}
		public Inclusive_or_expressionContext inclusive_or_expression() {
			return getRuleContext(Inclusive_or_expressionContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(ModuleParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(ModuleParser.NEWLINE, i);
		}
		public Inclusive_or_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inclusive_or_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterInclusive_or_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitInclusive_or_expression(this);
		}
	}

	public final Inclusive_or_expressionContext inclusive_or_expression() throws RecognitionException {
		Inclusive_or_expressionContext _localctx = new Inclusive_or_expressionContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_inclusive_or_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(590);
			exclusive_or_expression();
			setState(605);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				{
				setState(594);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(591);
					match(NEWLINE);
					}
					}
					setState(596);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(597);
				match(T__16);
				setState(601);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(598);
					match(NEWLINE);
					}
					}
					setState(603);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(604);
				inclusive_or_expression();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Exclusive_or_expressionContext extends ParserRuleContext {
		public Bit_and_expressionContext bit_and_expression() {
			return getRuleContext(Bit_and_expressionContext.class,0);
		}
		public Exclusive_or_expressionContext exclusive_or_expression() {
			return getRuleContext(Exclusive_or_expressionContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(ModuleParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(ModuleParser.NEWLINE, i);
		}
		public Exclusive_or_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exclusive_or_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterExclusive_or_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitExclusive_or_expression(this);
		}
	}

	public final Exclusive_or_expressionContext exclusive_or_expression() throws RecognitionException {
		Exclusive_or_expressionContext _localctx = new Exclusive_or_expressionContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_exclusive_or_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(607);
			bit_and_expression();
			setState(622);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				{
				setState(611);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(608);
					match(NEWLINE);
					}
					}
					setState(613);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(614);
				match(T__17);
				setState(618);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(615);
					match(NEWLINE);
					}
					}
					setState(620);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(621);
				exclusive_or_expression();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Bit_and_expressionContext extends ParserRuleContext {
		public Equality_expressionContext equality_expression() {
			return getRuleContext(Equality_expressionContext.class,0);
		}
		public Bit_and_expressionContext bit_and_expression() {
			return getRuleContext(Bit_and_expressionContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(ModuleParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(ModuleParser.NEWLINE, i);
		}
		public Bit_and_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bit_and_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterBit_and_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitBit_and_expression(this);
		}
	}

	public final Bit_and_expressionContext bit_and_expression() throws RecognitionException {
		Bit_and_expressionContext _localctx = new Bit_and_expressionContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_bit_and_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(624);
			equality_expression();
			setState(639);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
			case 1:
				{
				setState(628);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(625);
					match(NEWLINE);
					}
					}
					setState(630);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(631);
				match(T__18);
				setState(635);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(632);
					match(NEWLINE);
					}
					}
					setState(637);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(638);
				bit_and_expression();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Equality_expressionContext extends ParserRuleContext {
		public Relational_expressionContext relational_expression() {
			return getRuleContext(Relational_expressionContext.class,0);
		}
		public Equality_operatorContext equality_operator() {
			return getRuleContext(Equality_operatorContext.class,0);
		}
		public Equality_expressionContext equality_expression() {
			return getRuleContext(Equality_expressionContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(ModuleParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(ModuleParser.NEWLINE, i);
		}
		public Equality_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equality_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterEquality_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitEquality_expression(this);
		}
	}

	public final Equality_expressionContext equality_expression() throws RecognitionException {
		Equality_expressionContext _localctx = new Equality_expressionContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_equality_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(641);
			relational_expression();
			setState(657);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				{
				setState(645);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(642);
					match(NEWLINE);
					}
					}
					setState(647);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(648);
				equality_operator();
				setState(652);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(649);
					match(NEWLINE);
					}
					}
					setState(654);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(655);
				equality_expression();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Relational_expressionContext extends ParserRuleContext {
		public Shift_expressionContext shift_expression() {
			return getRuleContext(Shift_expressionContext.class,0);
		}
		public Relational_operatorContext relational_operator() {
			return getRuleContext(Relational_operatorContext.class,0);
		}
		public Relational_expressionContext relational_expression() {
			return getRuleContext(Relational_expressionContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(ModuleParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(ModuleParser.NEWLINE, i);
		}
		public Relational_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relational_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterRelational_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitRelational_expression(this);
		}
	}

	public final Relational_expressionContext relational_expression() throws RecognitionException {
		Relational_expressionContext _localctx = new Relational_expressionContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_relational_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(659);
			shift_expression();
			setState(675);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
			case 1:
				{
				setState(663);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(660);
					match(NEWLINE);
					}
					}
					setState(665);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(666);
				relational_operator();
				setState(670);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(667);
					match(NEWLINE);
					}
					}
					setState(672);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(673);
				relational_expression();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Shift_expressionContext extends ParserRuleContext {
		public Additive_expressionContext additive_expression() {
			return getRuleContext(Additive_expressionContext.class,0);
		}
		public Shift_expressionContext shift_expression() {
			return getRuleContext(Shift_expressionContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(ModuleParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(ModuleParser.NEWLINE, i);
		}
		public Shift_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shift_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterShift_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitShift_expression(this);
		}
	}

	public final Shift_expressionContext shift_expression() throws RecognitionException {
		Shift_expressionContext _localctx = new Shift_expressionContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_shift_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(677);
			additive_expression();
			setState(692);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
			case 1:
				{
				setState(681);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(678);
					match(NEWLINE);
					}
					}
					setState(683);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(684);
				_la = _input.LA(1);
				if ( !(_la==T__19 || _la==T__20) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(688);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(685);
					match(NEWLINE);
					}
					}
					setState(690);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(691);
				shift_expression();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Additive_expressionContext extends ParserRuleContext {
		public Multiplicative_expressionContext multiplicative_expression() {
			return getRuleContext(Multiplicative_expressionContext.class,0);
		}
		public Additive_expressionContext additive_expression() {
			return getRuleContext(Additive_expressionContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(ModuleParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(ModuleParser.NEWLINE, i);
		}
		public Additive_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additive_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterAdditive_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitAdditive_expression(this);
		}
	}

	public final Additive_expressionContext additive_expression() throws RecognitionException {
		Additive_expressionContext _localctx = new Additive_expressionContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_additive_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(694);
			multiplicative_expression();
			setState(709);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
			case 1:
				{
				setState(698);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(695);
					match(NEWLINE);
					}
					}
					setState(700);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(701);
				_la = _input.LA(1);
				if ( !(_la==T__8 || _la==T__21) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(705);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(702);
					match(NEWLINE);
					}
					}
					setState(707);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(708);
				additive_expression();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Multiplicative_expressionContext extends ParserRuleContext {
		public Cast_expressionContext cast_expression() {
			return getRuleContext(Cast_expressionContext.class,0);
		}
		public Multiplicative_expressionContext multiplicative_expression() {
			return getRuleContext(Multiplicative_expressionContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(ModuleParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(ModuleParser.NEWLINE, i);
		}
		public Multiplicative_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicative_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterMultiplicative_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitMultiplicative_expression(this);
		}
	}

	public final Multiplicative_expressionContext multiplicative_expression() throws RecognitionException {
		Multiplicative_expressionContext _localctx = new Multiplicative_expressionContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_multiplicative_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(711);
			cast_expression();
			setState(726);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
			case 1:
				{
				setState(715);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(712);
					match(NEWLINE);
					}
					}
					setState(717);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(718);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__22) | (1L << T__23))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(722);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(719);
					match(NEWLINE);
					}
					}
					setState(724);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(725);
				multiplicative_expression();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cast_expressionContext extends ParserRuleContext {
		public Cast_targetContext cast_target() {
			return getRuleContext(Cast_targetContext.class,0);
		}
		public Cast_expressionContext cast_expression() {
			return getRuleContext(Cast_expressionContext.class,0);
		}
		public Unary_expressionContext unary_expression() {
			return getRuleContext(Unary_expressionContext.class,0);
		}
		public Cast_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cast_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterCast_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitCast_expression(this);
		}
	}

	public final Cast_expressionContext cast_expression() throws RecognitionException {
		Cast_expressionContext _localctx = new Cast_expressionContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_cast_expression);
		try {
			setState(734);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(728);
				match(T__1);
				setState(729);
				cast_target();
				setState(730);
				match(T__2);
				setState(731);
				cast_expression();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(733);
				unary_expression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cast_targetContext extends ParserRuleContext {
		public Type_nameContext type_name() {
			return getRuleContext(Type_nameContext.class,0);
		}
		public List<Ptr_operatorContext> ptr_operator() {
			return getRuleContexts(Ptr_operatorContext.class);
		}
		public Ptr_operatorContext ptr_operator(int i) {
			return getRuleContext(Ptr_operatorContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(ModuleParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(ModuleParser.NEWLINE, i);
		}
		public Cast_targetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cast_target; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterCast_target(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitCast_target(this);
		}
	}

	public final Cast_targetContext cast_target() throws RecognitionException {
		Cast_targetContext _localctx = new Cast_targetContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_cast_target);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(736);
			type_name();
			setState(746);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__18 || _la==T__22 || _la==NEWLINE) {
				{
				{
				setState(740);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(737);
					match(NEWLINE);
					}
					}
					setState(742);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(743);
				ptr_operator();
				}
				}
				setState(748);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Unary_expressionContext extends ParserRuleContext {
		public Unary_op_and_cast_exprContext unary_op_and_cast_expr() {
			return getRuleContext(Unary_op_and_cast_exprContext.class,0);
		}
		public Sizeof_expressionContext sizeof_expression() {
			return getRuleContext(Sizeof_expressionContext.class,0);
		}
		public New_expressionContext new_expression() {
			return getRuleContext(New_expressionContext.class,0);
		}
		public Postfix_expressionContext postfix_expression() {
			return getRuleContext(Postfix_expressionContext.class,0);
		}
		public Defined_expressionContext defined_expression() {
			return getRuleContext(Defined_expressionContext.class,0);
		}
		public Unary_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterUnary_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitUnary_expression(this);
		}
	}

	public final Unary_expressionContext unary_expression() throws RecognitionException {
		Unary_expressionContext _localctx = new Unary_expressionContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_unary_expression);
		try {
			setState(754);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(749);
				unary_op_and_cast_expr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(750);
				sizeof_expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(751);
				new_expression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(752);
				postfix_expression(0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(753);
				defined_expression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class New_expressionContext extends ParserRuleContext {
		public TerminalNode NEW() { return getToken(ModuleParser.NEW, 0); }
		public Type_nameContext type_name() {
			return getRuleContext(Type_nameContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(ModuleParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(ModuleParser.NEWLINE, i);
		}
		public Conditional_expressionContext conditional_expression() {
			return getRuleContext(Conditional_expressionContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public New_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_new_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterNew_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitNew_expression(this);
		}
	}

	public final New_expressionContext new_expression() throws RecognitionException {
		New_expressionContext _localctx = new New_expressionContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_new_expression);
		int _la;
		try {
			setState(802);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(757);
				_la = _input.LA(1);
				if (_la==T__24) {
					{
					setState(756);
					match(T__24);
					}
				}

				setState(759);
				match(NEW);
				setState(763);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(760);
					match(NEWLINE);
					}
					}
					setState(765);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(766);
				type_name();
				setState(770);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(767);
					match(NEWLINE);
					}
					}
					setState(772);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(773);
				match(T__25);
				setState(775);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__8) | (1L << T__18) | (1L << T__21) | (1L << T__22) | (1L << T__24) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__32) | (1L << T__33) | (1L << T__39) | (1L << T__40) | (1L << T__41))) != 0) || ((((_la - 102)) & ~0x3f) == 0 && ((1L << (_la - 102)) & ((1L << (NEW - 102)) | (1L << (ALPHA_NUMERIC - 102)) | (1L << (HEX_LITERAL - 102)) | (1L << (DECIMAL_LITERAL - 102)) | (1L << (OCTAL_LITERAL - 102)) | (1L << (FLOATING_POINT_LITERAL - 102)) | (1L << (CHAR - 102)) | (1L << (STRING - 102)))) != 0)) {
					{
					setState(774);
					conditional_expression();
					}
				}

				setState(777);
				match(T__26);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(780);
				_la = _input.LA(1);
				if (_la==T__24) {
					{
					setState(779);
					match(T__24);
					}
				}

				setState(782);
				match(NEW);
				setState(786);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(783);
					match(NEWLINE);
					}
					}
					setState(788);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(789);
				type_name();
				setState(793);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(790);
					match(NEWLINE);
					}
					}
					setState(795);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(796);
				match(T__1);
				setState(798);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__8) | (1L << T__18) | (1L << T__21) | (1L << T__22) | (1L << T__24) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__32) | (1L << T__33) | (1L << T__39) | (1L << T__40) | (1L << T__41))) != 0) || ((((_la - 102)) & ~0x3f) == 0 && ((1L << (_la - 102)) & ((1L << (NEW - 102)) | (1L << (ALPHA_NUMERIC - 102)) | (1L << (HEX_LITERAL - 102)) | (1L << (DECIMAL_LITERAL - 102)) | (1L << (OCTAL_LITERAL - 102)) | (1L << (FLOATING_POINT_LITERAL - 102)) | (1L << (CHAR - 102)) | (1L << (STRING - 102)))) != 0)) {
					{
					setState(797);
					expr();
					}
				}

				setState(800);
				match(T__2);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Unary_op_and_cast_exprContext extends ParserRuleContext {
		public Unary_operatorContext unary_operator() {
			return getRuleContext(Unary_operatorContext.class,0);
		}
		public Cast_expressionContext cast_expression() {
			return getRuleContext(Cast_expressionContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(ModuleParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(ModuleParser.NEWLINE, i);
		}
		public Unary_op_and_cast_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary_op_and_cast_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterUnary_op_and_cast_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitUnary_op_and_cast_expr(this);
		}
	}

	public final Unary_op_and_cast_exprContext unary_op_and_cast_expr() throws RecognitionException {
		Unary_op_and_cast_exprContext _localctx = new Unary_op_and_cast_exprContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_unary_op_and_cast_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(804);
			unary_operator();
			setState(808);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(805);
				match(NEWLINE);
				}
				}
				setState(810);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(811);
			cast_expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Sizeof_expressionContext extends ParserRuleContext {
		public SizeofContext sizeof() {
			return getRuleContext(SizeofContext.class,0);
		}
		public Sizeof_operandContext sizeof_operand() {
			return getRuleContext(Sizeof_operandContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(ModuleParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(ModuleParser.NEWLINE, i);
		}
		public Sizeof_operand2Context sizeof_operand2() {
			return getRuleContext(Sizeof_operand2Context.class,0);
		}
		public Sizeof_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sizeof_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterSizeof_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitSizeof_expression(this);
		}
	}

	public final Sizeof_expressionContext sizeof_expression() throws RecognitionException {
		Sizeof_expressionContext _localctx = new Sizeof_expressionContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_sizeof_expression);
		int _la;
		try {
			setState(833);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(813);
				sizeof();
				setState(817);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(814);
					match(NEWLINE);
					}
					}
					setState(819);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(820);
				match(T__1);
				setState(821);
				sizeof_operand();
				setState(822);
				match(T__2);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(824);
				sizeof();
				setState(828);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(825);
					match(NEWLINE);
					}
					}
					setState(830);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(831);
				sizeof_operand2();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SizeofContext extends ParserRuleContext {
		public SizeofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sizeof; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterSizeof(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitSizeof(this);
		}
	}

	public final SizeofContext sizeof() throws RecognitionException {
		SizeofContext _localctx = new SizeofContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_sizeof);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(835);
			match(T__27);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Defined_expressionContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(ModuleParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(ModuleParser.NEWLINE, i);
		}
		public Defined_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defined_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterDefined_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitDefined_expression(this);
		}
	}

	public final Defined_expressionContext defined_expression() throws RecognitionException {
		Defined_expressionContext _localctx = new Defined_expressionContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_defined_expression);
		int _la;
		try {
			setState(856);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,94,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(837);
				match(T__28);
				setState(841);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(838);
					match(NEWLINE);
					}
					}
					setState(843);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(844);
				match(T__1);
				setState(845);
				expr();
				setState(846);
				match(T__2);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(848);
				match(T__28);
				setState(852);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(849);
					match(NEWLINE);
					}
					}
					setState(854);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(855);
				expr();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Sizeof_operandContext extends ParserRuleContext {
		public Type_nameContext type_name() {
			return getRuleContext(Type_nameContext.class,0);
		}
		public List<Ptr_operatorContext> ptr_operator() {
			return getRuleContexts(Ptr_operatorContext.class);
		}
		public Ptr_operatorContext ptr_operator(int i) {
			return getRuleContext(Ptr_operatorContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(ModuleParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(ModuleParser.NEWLINE, i);
		}
		public Sizeof_operandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sizeof_operand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterSizeof_operand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitSizeof_operand(this);
		}
	}

	public final Sizeof_operandContext sizeof_operand() throws RecognitionException {
		Sizeof_operandContext _localctx = new Sizeof_operandContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_sizeof_operand);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(858);
			type_name();
			setState(868);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__18 || _la==T__22 || _la==NEWLINE) {
				{
				{
				setState(862);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(859);
					match(NEWLINE);
					}
					}
					setState(864);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(865);
				ptr_operator();
				}
				}
				setState(870);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Sizeof_operand2Context extends ParserRuleContext {
		public Unary_expressionContext unary_expression() {
			return getRuleContext(Unary_expressionContext.class,0);
		}
		public Sizeof_operand2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sizeof_operand2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterSizeof_operand2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitSizeof_operand2(this);
		}
	}

	public final Sizeof_operand2Context sizeof_operand2() throws RecognitionException {
		Sizeof_operand2Context _localctx = new Sizeof_operand2Context(_ctx, getState());
		enterRule(_localctx, 102, RULE_sizeof_operand2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(871);
			unary_expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Inc_decContext extends ParserRuleContext {
		public Inc_decContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inc_dec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterInc_dec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitInc_dec(this);
		}
	}

	public final Inc_decContext inc_dec() throws RecognitionException {
		Inc_decContext _localctx = new Inc_decContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_inc_dec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(873);
			_la = _input.LA(1);
			if ( !(_la==T__29 || _la==T__30) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Postfix_expressionContext extends ParserRuleContext {
		public Postfix_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfix_expression; }
	 
		public Postfix_expressionContext() { }
		public void copyFrom(Postfix_expressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MemberAccessContext extends Postfix_expressionContext {
		public Postfix_expressionContext postfix_expression() {
			return getRuleContext(Postfix_expressionContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(ModuleParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(ModuleParser.NEWLINE, i);
		}
		public TerminalNode TEMPLATE() { return getToken(ModuleParser.TEMPLATE, 0); }
		public MemberAccessContext(Postfix_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterMemberAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitMemberAccess(this);
		}
	}
	public static class IncDecOpContext extends Postfix_expressionContext {
		public Inc_decContext inc_dec() {
			return getRuleContext(Inc_decContext.class,0);
		}
		public Primary_expressionContext primary_expression() {
			return getRuleContext(Primary_expressionContext.class,0);
		}
		public List<Ptr_operatorContext> ptr_operator() {
			return getRuleContexts(Ptr_operatorContext.class);
		}
		public Ptr_operatorContext ptr_operator(int i) {
			return getRuleContext(Ptr_operatorContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(ModuleParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(ModuleParser.NEWLINE, i);
		}
		public Postfix_expressionContext postfix_expression() {
			return getRuleContext(Postfix_expressionContext.class,0);
		}
		public IncDecOpContext(Postfix_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterIncDecOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitIncDecOp(this);
		}
	}
	public static class PrimaryOnlyContext extends Postfix_expressionContext {
		public Primary_expressionContext primary_expression() {
			return getRuleContext(Primary_expressionContext.class,0);
		}
		public PrimaryOnlyContext(Postfix_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterPrimaryOnly(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitPrimaryOnly(this);
		}
	}
	public static class FuncCallContext extends Postfix_expressionContext {
		public Postfix_expressionContext postfix_expression() {
			return getRuleContext(Postfix_expressionContext.class,0);
		}
		public Function_argument_listContext function_argument_list() {
			return getRuleContext(Function_argument_listContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(ModuleParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(ModuleParser.NEWLINE, i);
		}
		public FuncCallContext(Postfix_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterFuncCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitFuncCall(this);
		}
	}
	public static class ArrayIndexingContext extends Postfix_expressionContext {
		public Postfix_expressionContext postfix_expression() {
			return getRuleContext(Postfix_expressionContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(ModuleParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(ModuleParser.NEWLINE, i);
		}
		public ArrayIndexingContext(Postfix_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterArrayIndexing(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitArrayIndexing(this);
		}
	}
	public static class PtrMemberAccessContext extends Postfix_expressionContext {
		public Postfix_expressionContext postfix_expression() {
			return getRuleContext(Postfix_expressionContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(ModuleParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(ModuleParser.NEWLINE, i);
		}
		public TerminalNode TEMPLATE() { return getToken(ModuleParser.TEMPLATE, 0); }
		public PtrMemberAccessContext(Postfix_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterPtrMemberAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitPtrMemberAccess(this);
		}
	}

	public final Postfix_expressionContext postfix_expression() throws RecognitionException {
		return postfix_expression(0);
	}

	private Postfix_expressionContext postfix_expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Postfix_expressionContext _localctx = new Postfix_expressionContext(_ctx, _parentState);
		Postfix_expressionContext _prevctx = _localctx;
		int _startState = 106;
		enterRecursionRule(_localctx, 106, RULE_postfix_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(892);
			switch (_input.LA(1)) {
			case T__1:
			case T__39:
			case T__40:
			case T__41:
			case ALPHA_NUMERIC:
			case HEX_LITERAL:
			case DECIMAL_LITERAL:
			case OCTAL_LITERAL:
			case FLOATING_POINT_LITERAL:
			case CHAR:
			case STRING:
				{
				_localctx = new PrimaryOnlyContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(876);
				primary_expression();
				}
				break;
			case T__18:
			case T__22:
			case T__29:
			case T__30:
				{
				_localctx = new IncDecOpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(878);
				_la = _input.LA(1);
				if (_la==T__18 || _la==T__22) {
					{
					setState(877);
					ptr_operator();
					}
				}

				setState(880);
				inc_dec();
				setState(884);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(881);
					match(NEWLINE);
					}
					}
					setState(886);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(888);
				_la = _input.LA(1);
				if (_la==T__18 || _la==T__22) {
					{
					setState(887);
					ptr_operator();
					}
				}

				setState(890);
				primary_expression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(950);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,109,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(948);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,108,_ctx) ) {
					case 1:
						{
						_localctx = new ArrayIndexingContext(new Postfix_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_expression);
						setState(894);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(898);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==NEWLINE) {
							{
							{
							setState(895);
							match(NEWLINE);
							}
							}
							setState(900);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(901);
						match(T__25);
						setState(902);
						expr();
						setState(903);
						match(T__26);
						}
						break;
					case 2:
						{
						_localctx = new FuncCallContext(new Postfix_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_expression);
						setState(905);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(909);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==NEWLINE) {
							{
							{
							setState(906);
							match(NEWLINE);
							}
							}
							setState(911);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(912);
						match(T__1);
						setState(913);
						function_argument_list();
						setState(914);
						match(T__2);
						}
						break;
					case 3:
						{
						_localctx = new MemberAccessContext(new Postfix_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_expression);
						setState(916);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(917);
						match(T__7);
						setState(921);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==NEWLINE) {
							{
							{
							setState(918);
							match(NEWLINE);
							}
							}
							setState(923);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(925);
						_la = _input.LA(1);
						if (_la==TEMPLATE) {
							{
							setState(924);
							match(TEMPLATE);
							}
						}

						{
						setState(927);
						identifier();
						}
						}
						break;
					case 4:
						{
						_localctx = new PtrMemberAccessContext(new Postfix_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_expression);
						setState(928);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(929);
						match(T__31);
						setState(933);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==NEWLINE) {
							{
							{
							setState(930);
							match(NEWLINE);
							}
							}
							setState(935);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(937);
						_la = _input.LA(1);
						if (_la==TEMPLATE) {
							{
							setState(936);
							match(TEMPLATE);
							}
						}

						{
						setState(939);
						identifier();
						}
						}
						break;
					case 5:
						{
						_localctx = new IncDecOpContext(new Postfix_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_expression);
						setState(940);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(944);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==NEWLINE) {
							{
							{
							setState(941);
							match(NEWLINE);
							}
							}
							setState(946);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(947);
						inc_dec();
						}
						break;
					}
					} 
				}
				setState(952);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,109,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class MacroCallContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public TerminalNode VOID() { return getToken(ModuleParser.VOID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<TerminalNode> CV_QUALIFIER() { return getTokens(ModuleParser.CV_QUALIFIER); }
		public TerminalNode CV_QUALIFIER(int i) {
			return getToken(ModuleParser.CV_QUALIFIER, i);
		}
		public List<Type_nameContext> type_name() {
			return getRuleContexts(Type_nameContext.class);
		}
		public Type_nameContext type_name(int i) {
			return getRuleContext(Type_nameContext.class,i);
		}
		public MacroCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_macroCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterMacroCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitMacroCall(this);
		}
	}

	public final MacroCallContext macroCall() throws RecognitionException {
		MacroCallContext _localctx = new MacroCallContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_macroCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(955);
			switch (_input.LA(1)) {
			case T__39:
			case T__40:
			case T__41:
			case ALPHA_NUMERIC:
				{
				setState(953);
				identifier();
				}
				break;
			case HEX_LITERAL:
			case DECIMAL_LITERAL:
			case OCTAL_LITERAL:
			case FLOATING_POINT_LITERAL:
			case CHAR:
			case STRING:
				{
				setState(954);
				constant();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(957);
			match(T__1);
			setState(974);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,115,_ctx) ) {
			case 1:
				{
				setState(968); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(959);
					_la = _input.LA(1);
					if (_la==T__4) {
						{
						setState(958);
						match(T__4);
						}
					}

					setState(962);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,112,_ctx) ) {
					case 1:
						{
						setState(961);
						match(CV_QUALIFIER);
						}
						break;
					}
					setState(965);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,113,_ctx) ) {
					case 1:
						{
						setState(964);
						type_name();
						}
						break;
					}
					setState(967);
					identifier();
					}
					}
					setState(970); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__39) | (1L << T__40) | (1L << T__41))) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (VOID - 71)) | (1L << (UNSIGNED - 71)) | (1L << (SIGNED - 71)) | (1L << (LONG - 71)) | (1L << (CV_QUALIFIER - 71)) | (1L << (SPECIAL_DATA - 71)) | (1L << (CLASS_KEY - 71)) | (1L << (ALPHA_NUMERIC - 71)) | (1L << (HEX_LITERAL - 71)) | (1L << (DECIMAL_LITERAL - 71)) | (1L << (OCTAL_LITERAL - 71)) | (1L << (FLOATING_POINT_LITERAL - 71)) | (1L << (CHAR - 71)) | (1L << (STRING - 71)))) != 0) );
				}
				break;
			case 2:
				{
				setState(972);
				match(VOID);
				}
				break;
			case 3:
				{
				setState(973);
				expr();
				}
				break;
			}
			setState(977);
			_la = _input.LA(1);
			if (_la==T__22) {
				{
				setState(976);
				match(T__22);
				}
			}

			setState(979);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_argument_listContext extends ParserRuleContext {
		public List<Function_argumentContext> function_argument() {
			return getRuleContexts(Function_argumentContext.class);
		}
		public Function_argumentContext function_argument(int i) {
			return getRuleContext(Function_argumentContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(ModuleParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(ModuleParser.NEWLINE, i);
		}
		public Function_argument_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_argument_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterFunction_argument_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitFunction_argument_list(this);
		}
	}

	public final Function_argument_listContext function_argument_list() throws RecognitionException {
		Function_argument_listContext _localctx = new Function_argument_listContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_function_argument_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1003);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__8) | (1L << T__18) | (1L << T__21) | (1L << T__22) | (1L << T__24) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__32) | (1L << T__33) | (1L << T__39) | (1L << T__40) | (1L << T__41))) != 0) || ((((_la - 102)) & ~0x3f) == 0 && ((1L << (_la - 102)) & ((1L << (NEW - 102)) | (1L << (ALPHA_NUMERIC - 102)) | (1L << (HEX_LITERAL - 102)) | (1L << (DECIMAL_LITERAL - 102)) | (1L << (OCTAL_LITERAL - 102)) | (1L << (FLOATING_POINT_LITERAL - 102)) | (1L << (CHAR - 102)) | (1L << (STRING - 102)))) != 0)) {
				{
				setState(982); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(981);
					function_argument();
					}
					}
					setState(984); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__8) | (1L << T__18) | (1L << T__21) | (1L << T__22) | (1L << T__24) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__32) | (1L << T__33) | (1L << T__39) | (1L << T__40) | (1L << T__41))) != 0) || ((((_la - 102)) & ~0x3f) == 0 && ((1L << (_la - 102)) & ((1L << (NEW - 102)) | (1L << (ALPHA_NUMERIC - 102)) | (1L << (HEX_LITERAL - 102)) | (1L << (DECIMAL_LITERAL - 102)) | (1L << (OCTAL_LITERAL - 102)) | (1L << (FLOATING_POINT_LITERAL - 102)) | (1L << (CHAR - 102)) | (1L << (STRING - 102)))) != 0) );
				setState(1000);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(986);
					match(T__4);
					setState(990);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NEWLINE) {
						{
						{
						setState(987);
						match(NEWLINE);
						}
						}
						setState(992);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(994); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(993);
						function_argument();
						}
						}
						setState(996); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__8) | (1L << T__18) | (1L << T__21) | (1L << T__22) | (1L << T__24) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__32) | (1L << T__33) | (1L << T__39) | (1L << T__40) | (1L << T__41))) != 0) || ((((_la - 102)) & ~0x3f) == 0 && ((1L << (_la - 102)) & ((1L << (NEW - 102)) | (1L << (ALPHA_NUMERIC - 102)) | (1L << (HEX_LITERAL - 102)) | (1L << (DECIMAL_LITERAL - 102)) | (1L << (OCTAL_LITERAL - 102)) | (1L << (FLOATING_POINT_LITERAL - 102)) | (1L << (CHAR - 102)) | (1L << (STRING - 102)))) != 0) );
					}
					}
					setState(1002);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_argumentContext extends ParserRuleContext {
		public Assign_exprContext assign_expr() {
			return getRuleContext(Assign_exprContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(ModuleParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(ModuleParser.NEWLINE, i);
		}
		public Function_argumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_argument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterFunction_argument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitFunction_argument(this);
		}
	}

	public final Function_argumentContext function_argument() throws RecognitionException {
		Function_argumentContext _localctx = new Function_argumentContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_function_argument);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1005);
			assign_expr();
			setState(1009);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(1006);
				match(NEWLINE);
				}
				}
				setState(1011);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Primary_expressionContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Primary_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterPrimary_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitPrimary_expression(this);
		}
	}

	public final Primary_expressionContext primary_expression() throws RecognitionException {
		Primary_expressionContext _localctx = new Primary_expressionContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_primary_expression);
		try {
			setState(1018);
			switch (_input.LA(1)) {
			case T__39:
			case T__40:
			case T__41:
			case ALPHA_NUMERIC:
				enterOuterAlt(_localctx, 1);
				{
				setState(1012);
				identifier();
				}
				break;
			case HEX_LITERAL:
			case DECIMAL_LITERAL:
			case OCTAL_LITERAL:
			case FLOATING_POINT_LITERAL:
			case CHAR:
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(1013);
				constant();
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 3);
				{
				setState(1014);
				match(T__1);
				setState(1015);
				expr();
				setState(1016);
				match(T__2);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CommentContext extends ParserRuleContext {
		public TerminalNode COMMENT() { return getToken(ModuleParser.COMMENT, 0); }
		public CommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitComment(this);
		}
	}

	public final CommentContext comment() throws RecognitionException {
		CommentContext _localctx = new CommentContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_comment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1020);
			match(COMMENT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NewlineContext extends ParserRuleContext {
		public TerminalNode NEWLINE() { return getToken(ModuleParser.NEWLINE, 0); }
		public NewlineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newline; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterNewline(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitNewline(this);
		}
	}

	public final NewlineContext newline() throws RecognitionException {
		NewlineContext _localctx = new NewlineContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_newline);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1022);
			match(NEWLINE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Unary_operatorContext extends ParserRuleContext {
		public Unary_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterUnary_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitUnary_operator(this);
		}
	}

	public final Unary_operatorContext unary_operator() throws RecognitionException {
		Unary_operatorContext _localctx = new Unary_operatorContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_unary_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1024);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__18) | (1L << T__21) | (1L << T__22) | (1L << T__32) | (1L << T__33))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Relational_operatorContext extends ParserRuleContext {
		public Relational_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relational_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterRelational_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitRelational_operator(this);
		}
	}

	public final Relational_operatorContext relational_operator() throws RecognitionException {
		Relational_operatorContext _localctx = new Relational_operatorContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_relational_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1026);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__34) | (1L << T__35))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantContext extends ParserRuleContext {
		public TerminalNode HEX_LITERAL() { return getToken(ModuleParser.HEX_LITERAL, 0); }
		public TerminalNode OCTAL_LITERAL() { return getToken(ModuleParser.OCTAL_LITERAL, 0); }
		public TerminalNode DECIMAL_LITERAL() { return getToken(ModuleParser.DECIMAL_LITERAL, 0); }
		public TerminalNode STRING() { return getToken(ModuleParser.STRING, 0); }
		public TerminalNode CHAR() { return getToken(ModuleParser.CHAR, 0); }
		public TerminalNode FLOATING_POINT_LITERAL() { return getToken(ModuleParser.FLOATING_POINT_LITERAL, 0); }
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitConstant(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_constant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1028);
			_la = _input.LA(1);
			if ( !(((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (HEX_LITERAL - 107)) | (1L << (DECIMAL_LITERAL - 107)) | (1L << (OCTAL_LITERAL - 107)) | (1L << (FLOATING_POINT_LITERAL - 107)) | (1L << (CHAR - 107)) | (1L << (STRING - 107)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_decl_specifiersContext extends ParserRuleContext {
		public Function_decl_specifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_decl_specifiers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterFunction_decl_specifiers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitFunction_decl_specifiers(this);
		}
	}

	public final Function_decl_specifiersContext function_decl_specifiers() throws RecognitionException {
		Function_decl_specifiersContext _localctx = new Function_decl_specifiersContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_function_decl_specifiers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1030);
			_la = _input.LA(1);
			if ( !(((((_la - 37)) & ~0x3f) == 0 && ((1L << (_la - 37)) & ((1L << (T__36 - 37)) | (1L << (T__37 - 37)) | (1L << (T__38 - 37)) | (1L << (STATIC - 37)) | (1L << (VIRTUAL - 37)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Ptr_operatorContext extends ParserRuleContext {
		public Ptr_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ptr_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterPtr_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitPtr_operator(this);
		}
	}

	public final Ptr_operatorContext ptr_operator() throws RecognitionException {
		Ptr_operatorContext _localctx = new Ptr_operatorContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_ptr_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1032);
			_la = _input.LA(1);
			if ( !(_la==T__18 || _la==T__22) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Access_specifierContext extends ParserRuleContext {
		public Access_specifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_access_specifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterAccess_specifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitAccess_specifier(this);
		}
	}

	public final Access_specifierContext access_specifier() throws RecognitionException {
		Access_specifierContext _localctx = new Access_specifierContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_access_specifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1034);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__39) | (1L << T__40) | (1L << T__41))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OperatorContext extends ParserRuleContext {
		public OperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitOperator(this);
		}
	}

	public final OperatorContext operator() throws RecognitionException {
		OperatorContext _localctx = new OperatorContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_operator);
		int _la;
		try {
			setState(1081);
			switch (_input.LA(1)) {
			case T__42:
			case NEW:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(1036);
				_la = _input.LA(1);
				if ( !(_la==T__42 || _la==NEW) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(1039);
				_la = _input.LA(1);
				if (_la==T__25) {
					{
					setState(1037);
					match(T__25);
					setState(1038);
					match(T__26);
					}
				}

				}
				}
				break;
			case T__21:
				enterOuterAlt(_localctx, 2);
				{
				setState(1041);
				match(T__21);
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 3);
				{
				setState(1042);
				match(T__8);
				}
				break;
			case T__22:
				enterOuterAlt(_localctx, 4);
				{
				setState(1043);
				match(T__22);
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 5);
				{
				setState(1044);
				match(T__9);
				}
				break;
			case T__23:
				enterOuterAlt(_localctx, 6);
				{
				setState(1045);
				match(T__23);
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 7);
				{
				setState(1046);
				match(T__17);
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 8);
				{
				setState(1047);
				match(T__18);
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 9);
				{
				setState(1048);
				match(T__16);
				}
				break;
			case T__32:
				enterOuterAlt(_localctx, 10);
				{
				setState(1049);
				match(T__32);
				}
				break;
			case T__33:
				enterOuterAlt(_localctx, 11);
				{
				setState(1050);
				match(T__33);
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 12);
				{
				setState(1051);
				match(T__3);
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 13);
				{
				setState(1052);
				match(T__5);
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 14);
				{
				setState(1053);
				match(T__6);
				}
				break;
			case T__43:
				enterOuterAlt(_localctx, 15);
				{
				setState(1054);
				match(T__43);
				}
				break;
			case T__44:
				enterOuterAlt(_localctx, 16);
				{
				setState(1055);
				match(T__44);
				}
				break;
			case T__45:
				enterOuterAlt(_localctx, 17);
				{
				setState(1056);
				match(T__45);
				}
				break;
			case T__46:
				enterOuterAlt(_localctx, 18);
				{
				setState(1057);
				match(T__46);
				}
				break;
			case T__47:
				enterOuterAlt(_localctx, 19);
				{
				setState(1058);
				match(T__47);
				}
				break;
			case T__48:
				enterOuterAlt(_localctx, 20);
				{
				setState(1059);
				match(T__48);
				}
				break;
			case T__49:
				enterOuterAlt(_localctx, 21);
				{
				setState(1060);
				match(T__49);
				}
				break;
			case T__50:
				enterOuterAlt(_localctx, 22);
				{
				setState(1061);
				match(T__50);
				}
				break;
			case T__20:
				enterOuterAlt(_localctx, 23);
				{
				setState(1062);
				match(T__20);
				}
				break;
			case T__19:
				enterOuterAlt(_localctx, 24);
				{
				setState(1063);
				match(T__19);
				}
				break;
			case T__51:
				enterOuterAlt(_localctx, 25);
				{
				setState(1064);
				match(T__51);
				}
				break;
			case T__52:
				enterOuterAlt(_localctx, 26);
				{
				setState(1065);
				match(T__52);
				}
				break;
			case T__53:
				enterOuterAlt(_localctx, 27);
				{
				setState(1066);
				match(T__53);
				}
				break;
			case T__54:
				enterOuterAlt(_localctx, 28);
				{
				setState(1067);
				match(T__54);
				}
				break;
			case T__34:
				enterOuterAlt(_localctx, 29);
				{
				setState(1068);
				match(T__34);
				}
				break;
			case T__35:
				enterOuterAlt(_localctx, 30);
				{
				setState(1069);
				match(T__35);
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 31);
				{
				setState(1070);
				match(T__15);
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 32);
				{
				setState(1071);
				match(T__14);
				}
				break;
			case T__30:
				enterOuterAlt(_localctx, 33);
				{
				setState(1072);
				match(T__30);
				}
				break;
			case T__29:
				enterOuterAlt(_localctx, 34);
				{
				setState(1073);
				match(T__29);
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 35);
				{
				setState(1074);
				match(T__4);
				}
				break;
			case T__55:
				enterOuterAlt(_localctx, 36);
				{
				setState(1075);
				match(T__55);
				}
				break;
			case T__31:
				enterOuterAlt(_localctx, 37);
				{
				setState(1076);
				match(T__31);
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 38);
				{
				setState(1077);
				match(T__1);
				setState(1078);
				match(T__2);
				}
				break;
			case T__25:
				enterOuterAlt(_localctx, 39);
				{
				setState(1079);
				match(T__25);
				setState(1080);
				match(T__26);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Assignment_operatorContext extends ParserRuleContext {
		public Assignment_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterAssignment_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitAssignment_operator(this);
		}
	}

	public final Assignment_operatorContext assignment_operator() throws RecognitionException {
		Assignment_operatorContext _localctx = new Assignment_operatorContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_assignment_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1083);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Equality_operatorContext extends ParserRuleContext {
		public Equality_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equality_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterEquality_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitEquality_operator(this);
		}
	}

	public final Equality_operatorContext equality_operator() throws RecognitionException {
		Equality_operatorContext _localctx = new Equality_operatorContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_equality_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1085);
			_la = _input.LA(1);
			if ( !(_la==T__53 || _la==T__54) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Template_decl_startContext extends ParserRuleContext {
		public TerminalNode TEMPLATE() { return getToken(ModuleParser.TEMPLATE, 0); }
		public Template_param_listContext template_param_list() {
			return getRuleContext(Template_param_listContext.class,0);
		}
		public Template_decl_startContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_template_decl_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterTemplate_decl_start(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitTemplate_decl_start(this);
		}
	}

	public final Template_decl_startContext template_decl_start() throws RecognitionException {
		Template_decl_startContext _localctx = new Template_decl_startContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_template_decl_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1087);
			match(TEMPLATE);
			setState(1088);
			match(T__5);
			setState(1089);
			template_param_list();
			setState(1090);
			match(T__6);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Template_param_listContext extends ParserRuleContext {
		public List<No_angle_brackets_or_bracketsContext> no_angle_brackets_or_brackets() {
			return getRuleContexts(No_angle_brackets_or_bracketsContext.class);
		}
		public No_angle_brackets_or_bracketsContext no_angle_brackets_or_brackets(int i) {
			return getRuleContext(No_angle_brackets_or_bracketsContext.class,i);
		}
		public List<Template_param_listContext> template_param_list() {
			return getRuleContexts(Template_param_listContext.class);
		}
		public Template_param_listContext template_param_list(int i) {
			return getRuleContext(Template_param_listContext.class,i);
		}
		public Template_param_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_template_param_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterTemplate_param_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitTemplate_param_list(this);
		}
	}

	public final Template_param_listContext template_param_list() throws RecognitionException {
		Template_param_listContext _localctx = new Template_param_listContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_template_param_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1101); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(1101);
				switch (_input.LA(1)) {
				case T__5:
					{
					{
					setState(1092);
					match(T__5);
					setState(1093);
					template_param_list();
					setState(1094);
					match(T__6);
					}
					}
					break;
				case T__1:
					{
					{
					setState(1096);
					match(T__1);
					setState(1097);
					template_param_list();
					setState(1098);
					match(T__2);
					}
					}
					break;
				case T__0:
				case T__3:
				case T__4:
				case T__7:
				case T__8:
				case T__9:
				case T__10:
				case T__11:
				case T__12:
				case T__13:
				case T__14:
				case T__15:
				case T__16:
				case T__17:
				case T__18:
				case T__19:
				case T__20:
				case T__21:
				case T__22:
				case T__23:
				case T__24:
				case T__25:
				case T__26:
				case T__27:
				case T__28:
				case T__29:
				case T__30:
				case T__31:
				case T__32:
				case T__33:
				case T__34:
				case T__35:
				case T__36:
				case T__37:
				case T__38:
				case T__39:
				case T__40:
				case T__41:
				case T__42:
				case T__43:
				case T__44:
				case T__45:
				case T__46:
				case T__47:
				case T__48:
				case T__49:
				case T__50:
				case T__51:
				case T__52:
				case T__53:
				case T__54:
				case T__55:
				case T__56:
				case IF:
				case ELSE:
				case FOR:
				case WHILE:
				case BREAK:
				case CASE:
				case CONTINUE:
				case SWITCH:
				case DO:
				case GOTO:
				case RETURN:
				case TYPEDEF:
				case STATIC:
				case VOID:
				case UNSIGNED:
				case SIGNED:
				case LONG:
				case CV_QUALIFIER:
				case VIRTUAL:
				case TRY:
				case CATCH:
				case THROW:
				case USING:
				case NAMESPACE:
				case AUTO:
				case REGISTER:
				case SPECIAL_DATA:
				case PRE_IF:
				case PRE_ELIF:
				case PRE_ELSE:
				case PRE_ENDIF:
				case PRE_DEFINE:
				case PRE_UNDEF:
				case PRE_DIAGNOSTIC:
				case PRE_OTHER:
				case PRE_INCLUDE:
				case PRE_INCLUDE_NEXT:
				case PRE_LINE:
				case PRE_PRAGMA:
				case PRE_GCC:
				case PRE_PRAGMA_KEYWORDS:
				case PRE_STR:
				case OPERATOR:
				case TEMPLATE:
				case NEW:
				case CLASS_KEY:
				case ALPHA_NUMERIC:
				case OPENING_CURLY:
				case CLOSING_CURLY:
				case HEX_LITERAL:
				case DECIMAL_LITERAL:
				case OCTAL_LITERAL:
				case FLOATING_POINT_LITERAL:
				case COMMENT:
				case CHAR:
				case STRING:
				case NEWLINE:
				case ESCAPE:
				case WHITESPACE:
				case ELLIPSIS:
				case OTHER:
					{
					setState(1100);
					no_angle_brackets_or_brackets();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(1103); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << IF) | (1L << ELSE) | (1L << FOR) | (1L << WHILE) | (1L << BREAK) | (1L << CASE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (CONTINUE - 64)) | (1L << (SWITCH - 64)) | (1L << (DO - 64)) | (1L << (GOTO - 64)) | (1L << (RETURN - 64)) | (1L << (TYPEDEF - 64)) | (1L << (STATIC - 64)) | (1L << (VOID - 64)) | (1L << (UNSIGNED - 64)) | (1L << (SIGNED - 64)) | (1L << (LONG - 64)) | (1L << (CV_QUALIFIER - 64)) | (1L << (VIRTUAL - 64)) | (1L << (TRY - 64)) | (1L << (CATCH - 64)) | (1L << (THROW - 64)) | (1L << (USING - 64)) | (1L << (NAMESPACE - 64)) | (1L << (AUTO - 64)) | (1L << (REGISTER - 64)) | (1L << (SPECIAL_DATA - 64)) | (1L << (PRE_IF - 64)) | (1L << (PRE_ELIF - 64)) | (1L << (PRE_ELSE - 64)) | (1L << (PRE_ENDIF - 64)) | (1L << (PRE_DEFINE - 64)) | (1L << (PRE_UNDEF - 64)) | (1L << (PRE_DIAGNOSTIC - 64)) | (1L << (PRE_OTHER - 64)) | (1L << (PRE_INCLUDE - 64)) | (1L << (PRE_INCLUDE_NEXT - 64)) | (1L << (PRE_LINE - 64)) | (1L << (PRE_PRAGMA - 64)) | (1L << (PRE_GCC - 64)) | (1L << (PRE_PRAGMA_KEYWORDS - 64)) | (1L << (PRE_STR - 64)) | (1L << (OPERATOR - 64)) | (1L << (TEMPLATE - 64)) | (1L << (NEW - 64)) | (1L << (CLASS_KEY - 64)) | (1L << (ALPHA_NUMERIC - 64)) | (1L << (OPENING_CURLY - 64)) | (1L << (CLOSING_CURLY - 64)) | (1L << (HEX_LITERAL - 64)) | (1L << (DECIMAL_LITERAL - 64)) | (1L << (OCTAL_LITERAL - 64)) | (1L << (FLOATING_POINT_LITERAL - 64)) | (1L << (COMMENT - 64)) | (1L << (CHAR - 64)) | (1L << (STRING - 64)) | (1L << (NEWLINE - 64)) | (1L << (ESCAPE - 64)) | (1L << (WHITESPACE - 64)) | (1L << (ELLIPSIS - 64)) | (1L << (OTHER - 64)))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class No_bracketsContext extends ParserRuleContext {
		public No_bracketsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_no_brackets; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterNo_brackets(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitNo_brackets(this);
		}
	}

	public final No_bracketsContext no_brackets() throws RecognitionException {
		No_bracketsContext _localctx = new No_bracketsContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_no_brackets);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1105);
			_la = _input.LA(1);
			if ( _la <= 0 || (_la==T__1 || _la==T__2) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class No_brackets_curlies_or_squaresContext extends ParserRuleContext {
		public No_brackets_curlies_or_squaresContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_no_brackets_curlies_or_squares; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterNo_brackets_curlies_or_squares(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitNo_brackets_curlies_or_squares(this);
		}
	}

	public final No_brackets_curlies_or_squaresContext no_brackets_curlies_or_squares() throws RecognitionException {
		No_brackets_curlies_or_squaresContext _localctx = new No_brackets_curlies_or_squaresContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_no_brackets_curlies_or_squares);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1107);
			_la = _input.LA(1);
			if ( _la <= 0 || ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__25) | (1L << T__26))) != 0) || _la==OPENING_CURLY || _la==CLOSING_CURLY) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class No_brackets_or_semicolonContext extends ParserRuleContext {
		public No_brackets_or_semicolonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_no_brackets_or_semicolon; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterNo_brackets_or_semicolon(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitNo_brackets_or_semicolon(this);
		}
	}

	public final No_brackets_or_semicolonContext no_brackets_or_semicolon() throws RecognitionException {
		No_brackets_or_semicolonContext _localctx = new No_brackets_or_semicolonContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_no_brackets_or_semicolon);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1109);
			_la = _input.LA(1);
			if ( _la <= 0 || ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class No_angle_brackets_or_bracketsContext extends ParserRuleContext {
		public No_angle_brackets_or_bracketsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_no_angle_brackets_or_brackets; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterNo_angle_brackets_or_brackets(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitNo_angle_brackets_or_brackets(this);
		}
	}

	public final No_angle_brackets_or_bracketsContext no_angle_brackets_or_brackets() throws RecognitionException {
		No_angle_brackets_or_bracketsContext _localctx = new No_angle_brackets_or_bracketsContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_no_angle_brackets_or_brackets);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1111);
			_la = _input.LA(1);
			if ( _la <= 0 || ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__5) | (1L << T__6))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class No_curliesContext extends ParserRuleContext {
		public No_curliesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_no_curlies; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterNo_curlies(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitNo_curlies(this);
		}
	}

	public final No_curliesContext no_curlies() throws RecognitionException {
		No_curliesContext _localctx = new No_curliesContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_no_curlies);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1113);
			_la = _input.LA(1);
			if ( _la <= 0 || (_la==OPENING_CURLY || _la==CLOSING_CURLY) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class No_squaresContext extends ParserRuleContext {
		public No_squaresContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_no_squares; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterNo_squares(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitNo_squares(this);
		}
	}

	public final No_squaresContext no_squares() throws RecognitionException {
		No_squaresContext _localctx = new No_squaresContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_no_squares);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1115);
			_la = _input.LA(1);
			if ( _la <= 0 || (_la==T__25 || _la==T__26) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class No_squares_or_semicolonContext extends ParserRuleContext {
		public No_squares_or_semicolonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_no_squares_or_semicolon; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterNo_squares_or_semicolon(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitNo_squares_or_semicolon(this);
		}
	}

	public final No_squares_or_semicolonContext no_squares_or_semicolon() throws RecognitionException {
		No_squares_or_semicolonContext _localctx = new No_squares_or_semicolonContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_no_squares_or_semicolon);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1117);
			_la = _input.LA(1);
			if ( _la <= 0 || ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__25) | (1L << T__26))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class No_comma_or_semicolonContext extends ParserRuleContext {
		public No_comma_or_semicolonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_no_comma_or_semicolon; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterNo_comma_or_semicolon(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitNo_comma_or_semicolon(this);
		}
	}

	public final No_comma_or_semicolonContext no_comma_or_semicolon() throws RecognitionException {
		No_comma_or_semicolonContext _localctx = new No_comma_or_semicolonContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_no_comma_or_semicolon);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1119);
			_la = _input.LA(1);
			if ( _la <= 0 || (_la==T__0 || _la==T__4) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Assign_waterContext extends ParserRuleContext {
		public Assign_waterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_water; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterAssign_water(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitAssign_water(this);
		}
	}

	public final Assign_waterContext assign_water() throws RecognitionException {
		Assign_waterContext _localctx = new Assign_waterContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_assign_water);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1121);
			_la = _input.LA(1);
			if ( _la <= 0 || ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__4) | (1L << T__25) | (1L << T__26))) != 0) || _la==OPENING_CURLY || _la==CLOSING_CURLY) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Assign_water_l2Context extends ParserRuleContext {
		public Assign_water_l2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_water_l2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterAssign_water_l2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitAssign_water_l2(this);
		}
	}

	public final Assign_water_l2Context assign_water_l2() throws RecognitionException {
		Assign_water_l2Context _localctx = new Assign_water_l2Context(_ctx, getState());
		enterRule(_localctx, 160, RULE_assign_water_l2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1123);
			_la = _input.LA(1);
			if ( _la <= 0 || ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__25) | (1L << T__26))) != 0) || _la==OPENING_CURLY || _la==CLOSING_CURLY) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WaterContext extends ParserRuleContext {
		public WaterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_water; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterWater(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitWater(this);
		}
	}

	public final WaterContext water() throws RecognitionException {
		WaterContext _localctx = new WaterContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_water);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1125);
			matchWildcard();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_defContext extends ParserRuleContext {
		public Function_nameContext function_name() {
			return getRuleContext(Function_nameContext.class,0);
		}
		public Function_param_listContext function_param_list() {
			return getRuleContext(Function_param_listContext.class,0);
		}
		public Compound_statementContext compound_statement() {
			return getRuleContext(Compound_statementContext.class,0);
		}
		public Template_decl_startContext template_decl_start() {
			return getRuleContext(Template_decl_startContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(ModuleParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(ModuleParser.NEWLINE, i);
		}
		public Return_typeContext return_type() {
			return getRuleContext(Return_typeContext.class,0);
		}
		public Ctor_listContext ctor_list() {
			return getRuleContext(Ctor_listContext.class,0);
		}
		public Function_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterFunction_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitFunction_def(this);
		}
	}

	public final Function_defContext function_def() throws RecognitionException {
		Function_defContext _localctx = new Function_defContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_function_def);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1128);
			_la = _input.LA(1);
			if (_la==TEMPLATE) {
				{
				setState(1127);
				template_decl_start();
				}
			}

			setState(1133);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,129,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1130);
					match(NEWLINE);
					}
					} 
				}
				setState(1135);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,129,_ctx);
			}
			setState(1137);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,130,_ctx) ) {
			case 1:
				{
				setState(1136);
				return_type();
				}
				break;
			}
			setState(1142);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(1139);
				match(NEWLINE);
				}
				}
				setState(1144);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1145);
			function_name();
			setState(1149);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(1146);
				match(NEWLINE);
				}
				}
				setState(1151);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1152);
			function_param_list();
			setState(1154);
			_la = _input.LA(1);
			if (_la==T__13) {
				{
				setState(1153);
				ctor_list();
				}
			}

			setState(1156);
			compound_statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Return_typeContext extends ParserRuleContext {
		public Type_nameContext type_name() {
			return getRuleContext(Type_nameContext.class,0);
		}
		public List<Ptr_operatorContext> ptr_operator() {
			return getRuleContexts(Ptr_operatorContext.class);
		}
		public Ptr_operatorContext ptr_operator(int i) {
			return getRuleContext(Ptr_operatorContext.class,i);
		}
		public List<Function_decl_specifiersContext> function_decl_specifiers() {
			return getRuleContexts(Function_decl_specifiersContext.class);
		}
		public Function_decl_specifiersContext function_decl_specifiers(int i) {
			return getRuleContext(Function_decl_specifiersContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(ModuleParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(ModuleParser.NEWLINE, i);
		}
		public MacroCallContext macroCall() {
			return getRuleContext(MacroCallContext.class,0);
		}
		public Return_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterReturn_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitReturn_type(this);
		}
	}

	public final Return_typeContext return_type() throws RecognitionException {
		Return_typeContext _localctx = new Return_typeContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_return_type);
		int _la;
		try {
			setState(1179);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,137,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(1161);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 37)) & ~0x3f) == 0 && ((1L << (_la - 37)) & ((1L << (T__36 - 37)) | (1L << (T__37 - 37)) | (1L << (T__38 - 37)) | (1L << (STATIC - 37)) | (1L << (VIRTUAL - 37)))) != 0)) {
					{
					{
					setState(1158);
					function_decl_specifiers();
					}
					}
					setState(1163);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1167);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(1164);
					match(NEWLINE);
					}
					}
					setState(1169);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1170);
				type_name();
				}
				setState(1175);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__18 || _la==T__22) {
					{
					{
					setState(1172);
					ptr_operator();
					}
					}
					setState(1177);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1178);
				macroCall();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_param_listContext extends ParserRuleContext {
		public Parameter_decl_clauseContext parameter_decl_clause() {
			return getRuleContext(Parameter_decl_clauseContext.class,0);
		}
		public List<TerminalNode> CV_QUALIFIER() { return getTokens(ModuleParser.CV_QUALIFIER); }
		public TerminalNode CV_QUALIFIER(int i) {
			return getToken(ModuleParser.CV_QUALIFIER, i);
		}
		public Exception_specificationContext exception_specification() {
			return getRuleContext(Exception_specificationContext.class,0);
		}
		public Function_param_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_param_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterFunction_param_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitFunction_param_list(this);
		}
	}

	public final Function_param_listContext function_param_list() throws RecognitionException {
		Function_param_listContext _localctx = new Function_param_listContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_function_param_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1181);
			match(T__1);
			setState(1183);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__39) | (1L << T__40) | (1L << T__41))) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (VOID - 71)) | (1L << (UNSIGNED - 71)) | (1L << (SIGNED - 71)) | (1L << (LONG - 71)) | (1L << (CV_QUALIFIER - 71)) | (1L << (AUTO - 71)) | (1L << (REGISTER - 71)) | (1L << (SPECIAL_DATA - 71)) | (1L << (CLASS_KEY - 71)) | (1L << (ALPHA_NUMERIC - 71)) | (1L << (HEX_LITERAL - 71)) | (1L << (DECIMAL_LITERAL - 71)) | (1L << (OCTAL_LITERAL - 71)) | (1L << (FLOATING_POINT_LITERAL - 71)) | (1L << (CHAR - 71)) | (1L << (STRING - 71)))) != 0)) {
				{
				setState(1182);
				parameter_decl_clause();
				}
			}

			setState(1185);
			match(T__2);
			setState(1189);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CV_QUALIFIER) {
				{
				{
				setState(1186);
				match(CV_QUALIFIER);
				}
				}
				setState(1191);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1193);
			_la = _input.LA(1);
			if (_la==THROW) {
				{
				setState(1192);
				exception_specification();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Parameter_decl_clauseContext extends ParserRuleContext {
		public List<Parameter_declContext> parameter_decl() {
			return getRuleContexts(Parameter_declContext.class);
		}
		public Parameter_declContext parameter_decl(int i) {
			return getRuleContext(Parameter_declContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(ModuleParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(ModuleParser.NEWLINE, i);
		}
		public Parameter_decl_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter_decl_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterParameter_decl_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitParameter_decl_clause(this);
		}
	}

	public final Parameter_decl_clauseContext parameter_decl_clause() throws RecognitionException {
		Parameter_decl_clauseContext _localctx = new Parameter_decl_clauseContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_parameter_decl_clause);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1195);
			parameter_decl();
			setState(1206);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,142,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1196);
					match(T__4);
					setState(1200);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NEWLINE) {
						{
						{
						setState(1197);
						match(NEWLINE);
						}
						}
						setState(1202);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1203);
					parameter_decl();
					}
					} 
				}
				setState(1208);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,142,_ctx);
			}
			}
			setState(1217);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(1209);
				match(T__4);
				setState(1213);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(1210);
					match(NEWLINE);
					}
					}
					setState(1215);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1216);
				match(ELLIPSIS);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Parameter_declContext extends ParserRuleContext {
		public TerminalNode VOID() { return getToken(ModuleParser.VOID, 0); }
		public Param_decl_specifiersContext param_decl_specifiers() {
			return getRuleContext(Param_decl_specifiersContext.class,0);
		}
		public Parameter_idContext parameter_id() {
			return getRuleContext(Parameter_idContext.class,0);
		}
		public Parameter_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterParameter_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitParameter_decl(this);
		}
	}

	public final Parameter_declContext parameter_decl() throws RecognitionException {
		Parameter_declContext _localctx = new Parameter_declContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_parameter_decl);
		try {
			setState(1223);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,145,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1219);
				match(VOID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1220);
				param_decl_specifiers();
				setState(1221);
				parameter_id();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Parameter_idContext extends ParserRuleContext {
		public Parameter_idContext parameter_id() {
			return getRuleContext(Parameter_idContext.class,0);
		}
		public Parameter_nameContext parameter_name() {
			return getRuleContext(Parameter_nameContext.class,0);
		}
		public PtrsContext ptrs() {
			return getRuleContext(PtrsContext.class,0);
		}
		public Type_suffixContext type_suffix() {
			return getRuleContext(Type_suffixContext.class,0);
		}
		public Parameter_idContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterParameter_id(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitParameter_id(this);
		}
	}

	public final Parameter_idContext parameter_id() throws RecognitionException {
		Parameter_idContext _localctx = new Parameter_idContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_parameter_id);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1226);
			_la = _input.LA(1);
			if (_la==T__18 || _la==T__22) {
				{
				setState(1225);
				ptrs();
				}
			}

			setState(1233);
			switch (_input.LA(1)) {
			case T__1:
				{
				setState(1228);
				match(T__1);
				setState(1229);
				parameter_id();
				setState(1230);
				match(T__2);
				}
				break;
			case T__39:
			case T__40:
			case T__41:
			case ALPHA_NUMERIC:
				{
				setState(1232);
				parameter_name();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1236);
			_la = _input.LA(1);
			if (_la==T__1 || _la==T__25) {
				{
				setState(1235);
				type_suffix();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Compound_statementContext extends ParserRuleContext {
		public TerminalNode OPENING_CURLY() { return getToken(ModuleParser.OPENING_CURLY, 0); }
		public Compound_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compound_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterCompound_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitCompound_statement(this);
		}
	}

	public final Compound_statementContext compound_statement() throws RecognitionException {
		Compound_statementContext _localctx = new Compound_statementContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_compound_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1238);
			match(OPENING_CURLY);
			 skipToEndOfObject(); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Ctor_listContext extends ParserRuleContext {
		public List<Ctor_initializerContext> ctor_initializer() {
			return getRuleContexts(Ctor_initializerContext.class);
		}
		public Ctor_initializerContext ctor_initializer(int i) {
			return getRuleContext(Ctor_initializerContext.class,i);
		}
		public Ctor_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ctor_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterCtor_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitCtor_list(this);
		}
	}

	public final Ctor_listContext ctor_list() throws RecognitionException {
		Ctor_listContext _localctx = new Ctor_listContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_ctor_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1241);
			match(T__13);
			setState(1242);
			ctor_initializer();
			setState(1247);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(1243);
				match(T__4);
				setState(1244);
				ctor_initializer();
				}
				}
				setState(1249);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Ctor_initializerContext extends ParserRuleContext {
		public Initializer_idContext initializer_id() {
			return getRuleContext(Initializer_idContext.class,0);
		}
		public Ctor_exprContext ctor_expr() {
			return getRuleContext(Ctor_exprContext.class,0);
		}
		public Ctor_initializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ctor_initializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterCtor_initializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitCtor_initializer(this);
		}
	}

	public final Ctor_initializerContext ctor_initializer() throws RecognitionException {
		Ctor_initializerContext _localctx = new Ctor_initializerContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_ctor_initializer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1250);
			initializer_id();
			setState(1251);
			ctor_expr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Initializer_idContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Initializer_idContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializer_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterInitializer_id(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitInitializer_id(this);
		}
	}

	public final Initializer_idContext initializer_id() throws RecognitionException {
		Initializer_idContext _localctx = new Initializer_idContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_initializer_id);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1254);
			_la = _input.LA(1);
			if (_la==T__24) {
				{
				setState(1253);
				match(T__24);
				}
			}

			setState(1256);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Ctor_exprContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Ctor_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ctor_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterCtor_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitCtor_expr(this);
		}
	}

	public final Ctor_exprContext ctor_expr() throws RecognitionException {
		Ctor_exprContext _localctx = new Ctor_exprContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_ctor_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1258);
			match(T__1);
			setState(1260);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__8) | (1L << T__18) | (1L << T__21) | (1L << T__22) | (1L << T__24) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__32) | (1L << T__33) | (1L << T__39) | (1L << T__40) | (1L << T__41))) != 0) || ((((_la - 102)) & ~0x3f) == 0 && ((1L << (_la - 102)) & ((1L << (NEW - 102)) | (1L << (ALPHA_NUMERIC - 102)) | (1L << (HEX_LITERAL - 102)) | (1L << (DECIMAL_LITERAL - 102)) | (1L << (OCTAL_LITERAL - 102)) | (1L << (FLOATING_POINT_LITERAL - 102)) | (1L << (CHAR - 102)) | (1L << (STRING - 102)))) != 0)) {
				{
				setState(1259);
				expr();
				}
			}

			setState(1262);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_nameContext extends ParserRuleContext {
		public Function_nameContext function_name() {
			return getRuleContext(Function_nameContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode OPERATOR() { return getToken(ModuleParser.OPERATOR, 0); }
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public Function_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterFunction_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitFunction_name(this);
		}
	}

	public final Function_nameContext function_name() throws RecognitionException {
		Function_nameContext _localctx = new Function_nameContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_function_name);
		try {
			setState(1271);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1264);
				match(T__1);
				setState(1265);
				function_name();
				setState(1266);
				match(T__2);
				}
				break;
			case T__39:
			case T__40:
			case T__41:
			case ALPHA_NUMERIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(1268);
				identifier();
				}
				break;
			case OPERATOR:
				enterOuterAlt(_localctx, 3);
				{
				setState(1269);
				match(OPERATOR);
				setState(1270);
				operator();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Exception_specificationContext extends ParserRuleContext {
		public TerminalNode THROW() { return getToken(ModuleParser.THROW, 0); }
		public Type_id_listContext type_id_list() {
			return getRuleContext(Type_id_listContext.class,0);
		}
		public Exception_specificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exception_specification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterException_specification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitException_specification(this);
		}
	}

	public final Exception_specificationContext exception_specification() throws RecognitionException {
		Exception_specificationContext _localctx = new Exception_specificationContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_exception_specification);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1273);
			match(THROW);
			setState(1274);
			match(T__1);
			setState(1275);
			type_id_list();
			setState(1276);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Type_id_listContext extends ParserRuleContext {
		public List<No_bracketsContext> no_brackets() {
			return getRuleContexts(No_bracketsContext.class);
		}
		public No_bracketsContext no_brackets(int i) {
			return getRuleContext(No_bracketsContext.class,i);
		}
		public List<Type_id_listContext> type_id_list() {
			return getRuleContexts(Type_id_listContext.class);
		}
		public Type_id_listContext type_id_list(int i) {
			return getRuleContext(Type_id_listContext.class,i);
		}
		public Type_id_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_id_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterType_id_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitType_id_list(this);
		}
	}

	public final Type_id_listContext type_id_list() throws RecognitionException {
		Type_id_listContext _localctx = new Type_id_listContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_type_id_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1281);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << IF) | (1L << ELSE) | (1L << FOR) | (1L << WHILE) | (1L << BREAK) | (1L << CASE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (CONTINUE - 64)) | (1L << (SWITCH - 64)) | (1L << (DO - 64)) | (1L << (GOTO - 64)) | (1L << (RETURN - 64)) | (1L << (TYPEDEF - 64)) | (1L << (STATIC - 64)) | (1L << (VOID - 64)) | (1L << (UNSIGNED - 64)) | (1L << (SIGNED - 64)) | (1L << (LONG - 64)) | (1L << (CV_QUALIFIER - 64)) | (1L << (VIRTUAL - 64)) | (1L << (TRY - 64)) | (1L << (CATCH - 64)) | (1L << (THROW - 64)) | (1L << (USING - 64)) | (1L << (NAMESPACE - 64)) | (1L << (AUTO - 64)) | (1L << (REGISTER - 64)) | (1L << (SPECIAL_DATA - 64)) | (1L << (PRE_IF - 64)) | (1L << (PRE_ELIF - 64)) | (1L << (PRE_ELSE - 64)) | (1L << (PRE_ENDIF - 64)) | (1L << (PRE_DEFINE - 64)) | (1L << (PRE_UNDEF - 64)) | (1L << (PRE_DIAGNOSTIC - 64)) | (1L << (PRE_OTHER - 64)) | (1L << (PRE_INCLUDE - 64)) | (1L << (PRE_INCLUDE_NEXT - 64)) | (1L << (PRE_LINE - 64)) | (1L << (PRE_PRAGMA - 64)) | (1L << (PRE_GCC - 64)) | (1L << (PRE_PRAGMA_KEYWORDS - 64)) | (1L << (PRE_STR - 64)) | (1L << (OPERATOR - 64)) | (1L << (TEMPLATE - 64)) | (1L << (NEW - 64)) | (1L << (CLASS_KEY - 64)) | (1L << (ALPHA_NUMERIC - 64)) | (1L << (OPENING_CURLY - 64)) | (1L << (CLOSING_CURLY - 64)) | (1L << (HEX_LITERAL - 64)) | (1L << (DECIMAL_LITERAL - 64)) | (1L << (OCTAL_LITERAL - 64)) | (1L << (FLOATING_POINT_LITERAL - 64)) | (1L << (COMMENT - 64)) | (1L << (CHAR - 64)) | (1L << (STRING - 64)) | (1L << (NEWLINE - 64)) | (1L << (ESCAPE - 64)) | (1L << (WHITESPACE - 64)) | (1L << (ELLIPSIS - 64)) | (1L << (OTHER - 64)))) != 0)) {
				{
				{
				setState(1278);
				no_brackets();
				}
				}
				setState(1283);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1295);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(1284);
				match(T__1);
				setState(1285);
				type_id_list();
				setState(1286);
				match(T__2);
				setState(1290);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << IF) | (1L << ELSE) | (1L << FOR) | (1L << WHILE) | (1L << BREAK) | (1L << CASE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (CONTINUE - 64)) | (1L << (SWITCH - 64)) | (1L << (DO - 64)) | (1L << (GOTO - 64)) | (1L << (RETURN - 64)) | (1L << (TYPEDEF - 64)) | (1L << (STATIC - 64)) | (1L << (VOID - 64)) | (1L << (UNSIGNED - 64)) | (1L << (SIGNED - 64)) | (1L << (LONG - 64)) | (1L << (CV_QUALIFIER - 64)) | (1L << (VIRTUAL - 64)) | (1L << (TRY - 64)) | (1L << (CATCH - 64)) | (1L << (THROW - 64)) | (1L << (USING - 64)) | (1L << (NAMESPACE - 64)) | (1L << (AUTO - 64)) | (1L << (REGISTER - 64)) | (1L << (SPECIAL_DATA - 64)) | (1L << (PRE_IF - 64)) | (1L << (PRE_ELIF - 64)) | (1L << (PRE_ELSE - 64)) | (1L << (PRE_ENDIF - 64)) | (1L << (PRE_DEFINE - 64)) | (1L << (PRE_UNDEF - 64)) | (1L << (PRE_DIAGNOSTIC - 64)) | (1L << (PRE_OTHER - 64)) | (1L << (PRE_INCLUDE - 64)) | (1L << (PRE_INCLUDE_NEXT - 64)) | (1L << (PRE_LINE - 64)) | (1L << (PRE_PRAGMA - 64)) | (1L << (PRE_GCC - 64)) | (1L << (PRE_PRAGMA_KEYWORDS - 64)) | (1L << (PRE_STR - 64)) | (1L << (OPERATOR - 64)) | (1L << (TEMPLATE - 64)) | (1L << (NEW - 64)) | (1L << (CLASS_KEY - 64)) | (1L << (ALPHA_NUMERIC - 64)) | (1L << (OPENING_CURLY - 64)) | (1L << (CLOSING_CURLY - 64)) | (1L << (HEX_LITERAL - 64)) | (1L << (DECIMAL_LITERAL - 64)) | (1L << (OCTAL_LITERAL - 64)) | (1L << (FLOATING_POINT_LITERAL - 64)) | (1L << (COMMENT - 64)) | (1L << (CHAR - 64)) | (1L << (STRING - 64)) | (1L << (NEWLINE - 64)) | (1L << (ESCAPE - 64)) | (1L << (WHITESPACE - 64)) | (1L << (ELLIPSIS - 64)) | (1L << (OTHER - 64)))) != 0)) {
					{
					{
					setState(1287);
					no_brackets();
					}
					}
					setState(1292);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(1297);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Init_declaratorContext extends ParserRuleContext {
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public Assign_expr_w_Context assign_expr_w_() {
			return getRuleContext(Assign_expr_w_Context.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Init_declaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_init_declarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterInit_declarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitInit_declarator(this);
		}
	}

	public final Init_declaratorContext init_declarator() throws RecognitionException {
		Init_declaratorContext _localctx = new Init_declaratorContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_init_declarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1298);
			declarator();
			setState(1306);
			switch (_input.LA(1)) {
			case T__1:
				{
				{
				setState(1299);
				match(T__1);
				setState(1301);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__8) | (1L << T__18) | (1L << T__21) | (1L << T__22) | (1L << T__24) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__32) | (1L << T__33) | (1L << T__39) | (1L << T__40) | (1L << T__41))) != 0) || ((((_la - 102)) & ~0x3f) == 0 && ((1L << (_la - 102)) & ((1L << (NEW - 102)) | (1L << (ALPHA_NUMERIC - 102)) | (1L << (HEX_LITERAL - 102)) | (1L << (DECIMAL_LITERAL - 102)) | (1L << (OCTAL_LITERAL - 102)) | (1L << (FLOATING_POINT_LITERAL - 102)) | (1L << (CHAR - 102)) | (1L << (STRING - 102)))) != 0)) {
					{
					setState(1300);
					expr();
					}
				}

				setState(1303);
				match(T__2);
				}
				}
				break;
			case T__3:
				{
				{
				setState(1304);
				match(T__3);
				setState(1305);
				assign_expr_w_();
				}
				}
				break;
			case T__0:
			case T__4:
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclaratorContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public PtrsContext ptrs() {
			return getRuleContext(PtrsContext.class,0);
		}
		public Type_suffixContext type_suffix() {
			return getRuleContext(Type_suffixContext.class,0);
		}
		public Func_ptrsContext func_ptrs() {
			return getRuleContext(Func_ptrsContext.class,0);
		}
		public CallingConvetionContext callingConvetion() {
			return getRuleContext(CallingConvetionContext.class,0);
		}
		public DeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitDeclarator(this);
		}
	}

	public final DeclaratorContext declarator() throws RecognitionException {
		DeclaratorContext _localctx = new DeclaratorContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_declarator);
		int _la;
		try {
			setState(1327);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,162,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1309);
				_la = _input.LA(1);
				if (_la==T__18 || _la==T__22) {
					{
					setState(1308);
					ptrs();
					}
				}

				setState(1311);
				identifier();
				setState(1313);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,159,_ctx) ) {
				case 1:
					{
					setState(1312);
					type_suffix();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1316);
				_la = _input.LA(1);
				if (_la==T__18 || _la==T__22) {
					{
					setState(1315);
					ptrs();
					}
				}

				setState(1318);
				match(T__1);
				setState(1320);
				_la = _input.LA(1);
				if (_la==ALPHA_NUMERIC) {
					{
					setState(1319);
					callingConvetion();
					}
				}

				setState(1322);
				func_ptrs();
				setState(1323);
				identifier();
				setState(1324);
				match(T__2);
				setState(1325);
				type_suffix();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CallingConvetionContext extends ParserRuleContext {
		public List<TerminalNode> ALPHA_NUMERIC() { return getTokens(ModuleParser.ALPHA_NUMERIC); }
		public TerminalNode ALPHA_NUMERIC(int i) {
			return getToken(ModuleParser.ALPHA_NUMERIC, i);
		}
		public CallingConvetionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callingConvetion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterCallingConvetion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitCallingConvetion(this);
		}
	}

	public final CallingConvetionContext callingConvetion() throws RecognitionException {
		CallingConvetionContext _localctx = new CallingConvetionContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_callingConvetion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1330); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1329);
				match(ALPHA_NUMERIC);
				}
				}
				setState(1332); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ALPHA_NUMERIC );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Type_suffixContext extends ParserRuleContext {
		public Constant_expr_w_Context constant_expr_w_() {
			return getRuleContext(Constant_expr_w_Context.class,0);
		}
		public Param_type_listContext param_type_list() {
			return getRuleContext(Param_type_listContext.class,0);
		}
		public Type_suffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_suffix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterType_suffix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitType_suffix(this);
		}
	}

	public final Type_suffixContext type_suffix() throws RecognitionException {
		Type_suffixContext _localctx = new Type_suffixContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_type_suffix);
		try {
			setState(1339);
			switch (_input.LA(1)) {
			case T__25:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(1334);
				match(T__25);
				setState(1335);
				constant_expr_w_();
				setState(1336);
				match(T__26);
				}
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				setState(1338);
				param_type_list();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Assign_expr_w_Context extends ParserRuleContext {
		public List<Assign_waterContext> assign_water() {
			return getRuleContexts(Assign_waterContext.class);
		}
		public Assign_waterContext assign_water(int i) {
			return getRuleContext(Assign_waterContext.class,i);
		}
		public List<Assign_expr_w__l2Context> assign_expr_w__l2() {
			return getRuleContexts(Assign_expr_w__l2Context.class);
		}
		public Assign_expr_w__l2Context assign_expr_w__l2(int i) {
			return getRuleContext(Assign_expr_w__l2Context.class,i);
		}
		public Assign_expr_w_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_expr_w_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterAssign_expr_w_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitAssign_expr_w_(this);
		}
	}

	public final Assign_expr_w_Context assign_expr_w_() throws RecognitionException {
		Assign_expr_w_Context _localctx = new Assign_expr_w_Context(_ctx, getState());
		enterRule(_localctx, 200, RULE_assign_expr_w_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1344);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << IF) | (1L << ELSE) | (1L << FOR) | (1L << WHILE) | (1L << BREAK) | (1L << CASE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (CONTINUE - 64)) | (1L << (SWITCH - 64)) | (1L << (DO - 64)) | (1L << (GOTO - 64)) | (1L << (RETURN - 64)) | (1L << (TYPEDEF - 64)) | (1L << (STATIC - 64)) | (1L << (VOID - 64)) | (1L << (UNSIGNED - 64)) | (1L << (SIGNED - 64)) | (1L << (LONG - 64)) | (1L << (CV_QUALIFIER - 64)) | (1L << (VIRTUAL - 64)) | (1L << (TRY - 64)) | (1L << (CATCH - 64)) | (1L << (THROW - 64)) | (1L << (USING - 64)) | (1L << (NAMESPACE - 64)) | (1L << (AUTO - 64)) | (1L << (REGISTER - 64)) | (1L << (SPECIAL_DATA - 64)) | (1L << (PRE_IF - 64)) | (1L << (PRE_ELIF - 64)) | (1L << (PRE_ELSE - 64)) | (1L << (PRE_ENDIF - 64)) | (1L << (PRE_DEFINE - 64)) | (1L << (PRE_UNDEF - 64)) | (1L << (PRE_DIAGNOSTIC - 64)) | (1L << (PRE_OTHER - 64)) | (1L << (PRE_INCLUDE - 64)) | (1L << (PRE_INCLUDE_NEXT - 64)) | (1L << (PRE_LINE - 64)) | (1L << (PRE_PRAGMA - 64)) | (1L << (PRE_GCC - 64)) | (1L << (PRE_PRAGMA_KEYWORDS - 64)) | (1L << (PRE_STR - 64)) | (1L << (OPERATOR - 64)) | (1L << (TEMPLATE - 64)) | (1L << (NEW - 64)) | (1L << (CLASS_KEY - 64)) | (1L << (ALPHA_NUMERIC - 64)) | (1L << (HEX_LITERAL - 64)) | (1L << (DECIMAL_LITERAL - 64)) | (1L << (OCTAL_LITERAL - 64)) | (1L << (FLOATING_POINT_LITERAL - 64)) | (1L << (COMMENT - 64)) | (1L << (CHAR - 64)) | (1L << (STRING - 64)) | (1L << (NEWLINE - 64)) | (1L << (ESCAPE - 64)) | (1L << (WHITESPACE - 64)) | (1L << (ELLIPSIS - 64)) | (1L << (OTHER - 64)))) != 0)) {
				{
				{
				setState(1341);
				assign_water();
				}
				}
				setState(1346);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1369);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1 || _la==T__25 || _la==OPENING_CURLY) {
				{
				{
				setState(1359);
				switch (_input.LA(1)) {
				case OPENING_CURLY:
					{
					setState(1347);
					match(OPENING_CURLY);
					setState(1348);
					assign_expr_w__l2();
					setState(1349);
					match(CLOSING_CURLY);
					}
					break;
				case T__1:
					{
					setState(1351);
					match(T__1);
					setState(1352);
					assign_expr_w__l2();
					setState(1353);
					match(T__2);
					}
					break;
				case T__25:
					{
					setState(1355);
					match(T__25);
					setState(1356);
					assign_expr_w__l2();
					setState(1357);
					match(T__26);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1364);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << IF) | (1L << ELSE) | (1L << FOR) | (1L << WHILE) | (1L << BREAK) | (1L << CASE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (CONTINUE - 64)) | (1L << (SWITCH - 64)) | (1L << (DO - 64)) | (1L << (GOTO - 64)) | (1L << (RETURN - 64)) | (1L << (TYPEDEF - 64)) | (1L << (STATIC - 64)) | (1L << (VOID - 64)) | (1L << (UNSIGNED - 64)) | (1L << (SIGNED - 64)) | (1L << (LONG - 64)) | (1L << (CV_QUALIFIER - 64)) | (1L << (VIRTUAL - 64)) | (1L << (TRY - 64)) | (1L << (CATCH - 64)) | (1L << (THROW - 64)) | (1L << (USING - 64)) | (1L << (NAMESPACE - 64)) | (1L << (AUTO - 64)) | (1L << (REGISTER - 64)) | (1L << (SPECIAL_DATA - 64)) | (1L << (PRE_IF - 64)) | (1L << (PRE_ELIF - 64)) | (1L << (PRE_ELSE - 64)) | (1L << (PRE_ENDIF - 64)) | (1L << (PRE_DEFINE - 64)) | (1L << (PRE_UNDEF - 64)) | (1L << (PRE_DIAGNOSTIC - 64)) | (1L << (PRE_OTHER - 64)) | (1L << (PRE_INCLUDE - 64)) | (1L << (PRE_INCLUDE_NEXT - 64)) | (1L << (PRE_LINE - 64)) | (1L << (PRE_PRAGMA - 64)) | (1L << (PRE_GCC - 64)) | (1L << (PRE_PRAGMA_KEYWORDS - 64)) | (1L << (PRE_STR - 64)) | (1L << (OPERATOR - 64)) | (1L << (TEMPLATE - 64)) | (1L << (NEW - 64)) | (1L << (CLASS_KEY - 64)) | (1L << (ALPHA_NUMERIC - 64)) | (1L << (HEX_LITERAL - 64)) | (1L << (DECIMAL_LITERAL - 64)) | (1L << (OCTAL_LITERAL - 64)) | (1L << (FLOATING_POINT_LITERAL - 64)) | (1L << (COMMENT - 64)) | (1L << (CHAR - 64)) | (1L << (STRING - 64)) | (1L << (NEWLINE - 64)) | (1L << (ESCAPE - 64)) | (1L << (WHITESPACE - 64)) | (1L << (ELLIPSIS - 64)) | (1L << (OTHER - 64)))) != 0)) {
					{
					{
					setState(1361);
					assign_water();
					}
					}
					setState(1366);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(1371);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Assign_expr_w__l2Context extends ParserRuleContext {
		public List<Assign_water_l2Context> assign_water_l2() {
			return getRuleContexts(Assign_water_l2Context.class);
		}
		public Assign_water_l2Context assign_water_l2(int i) {
			return getRuleContext(Assign_water_l2Context.class,i);
		}
		public List<Assign_expr_w__l2Context> assign_expr_w__l2() {
			return getRuleContexts(Assign_expr_w__l2Context.class);
		}
		public Assign_expr_w__l2Context assign_expr_w__l2(int i) {
			return getRuleContext(Assign_expr_w__l2Context.class,i);
		}
		public Assign_expr_w__l2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_expr_w__l2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterAssign_expr_w__l2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitAssign_expr_w__l2(this);
		}
	}

	public final Assign_expr_w__l2Context assign_expr_w__l2() throws RecognitionException {
		Assign_expr_w__l2Context _localctx = new Assign_expr_w__l2Context(_ctx, getState());
		enterRule(_localctx, 202, RULE_assign_expr_w__l2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1375);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << IF) | (1L << ELSE) | (1L << FOR) | (1L << WHILE) | (1L << BREAK) | (1L << CASE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (CONTINUE - 64)) | (1L << (SWITCH - 64)) | (1L << (DO - 64)) | (1L << (GOTO - 64)) | (1L << (RETURN - 64)) | (1L << (TYPEDEF - 64)) | (1L << (STATIC - 64)) | (1L << (VOID - 64)) | (1L << (UNSIGNED - 64)) | (1L << (SIGNED - 64)) | (1L << (LONG - 64)) | (1L << (CV_QUALIFIER - 64)) | (1L << (VIRTUAL - 64)) | (1L << (TRY - 64)) | (1L << (CATCH - 64)) | (1L << (THROW - 64)) | (1L << (USING - 64)) | (1L << (NAMESPACE - 64)) | (1L << (AUTO - 64)) | (1L << (REGISTER - 64)) | (1L << (SPECIAL_DATA - 64)) | (1L << (PRE_IF - 64)) | (1L << (PRE_ELIF - 64)) | (1L << (PRE_ELSE - 64)) | (1L << (PRE_ENDIF - 64)) | (1L << (PRE_DEFINE - 64)) | (1L << (PRE_UNDEF - 64)) | (1L << (PRE_DIAGNOSTIC - 64)) | (1L << (PRE_OTHER - 64)) | (1L << (PRE_INCLUDE - 64)) | (1L << (PRE_INCLUDE_NEXT - 64)) | (1L << (PRE_LINE - 64)) | (1L << (PRE_PRAGMA - 64)) | (1L << (PRE_GCC - 64)) | (1L << (PRE_PRAGMA_KEYWORDS - 64)) | (1L << (PRE_STR - 64)) | (1L << (OPERATOR - 64)) | (1L << (TEMPLATE - 64)) | (1L << (NEW - 64)) | (1L << (CLASS_KEY - 64)) | (1L << (ALPHA_NUMERIC - 64)) | (1L << (HEX_LITERAL - 64)) | (1L << (DECIMAL_LITERAL - 64)) | (1L << (OCTAL_LITERAL - 64)) | (1L << (FLOATING_POINT_LITERAL - 64)) | (1L << (COMMENT - 64)) | (1L << (CHAR - 64)) | (1L << (STRING - 64)) | (1L << (NEWLINE - 64)) | (1L << (ESCAPE - 64)) | (1L << (WHITESPACE - 64)) | (1L << (ELLIPSIS - 64)) | (1L << (OTHER - 64)))) != 0)) {
				{
				{
				setState(1372);
				assign_water_l2();
				}
				}
				setState(1377);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1400);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1 || _la==T__25 || _la==OPENING_CURLY) {
				{
				{
				setState(1390);
				switch (_input.LA(1)) {
				case OPENING_CURLY:
					{
					setState(1378);
					match(OPENING_CURLY);
					setState(1379);
					assign_expr_w__l2();
					setState(1380);
					match(CLOSING_CURLY);
					}
					break;
				case T__1:
					{
					setState(1382);
					match(T__1);
					setState(1383);
					assign_expr_w__l2();
					setState(1384);
					match(T__2);
					}
					break;
				case T__25:
					{
					setState(1386);
					match(T__25);
					setState(1387);
					assign_expr_w__l2();
					setState(1388);
					match(T__26);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1395);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << IF) | (1L << ELSE) | (1L << FOR) | (1L << WHILE) | (1L << BREAK) | (1L << CASE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (CONTINUE - 64)) | (1L << (SWITCH - 64)) | (1L << (DO - 64)) | (1L << (GOTO - 64)) | (1L << (RETURN - 64)) | (1L << (TYPEDEF - 64)) | (1L << (STATIC - 64)) | (1L << (VOID - 64)) | (1L << (UNSIGNED - 64)) | (1L << (SIGNED - 64)) | (1L << (LONG - 64)) | (1L << (CV_QUALIFIER - 64)) | (1L << (VIRTUAL - 64)) | (1L << (TRY - 64)) | (1L << (CATCH - 64)) | (1L << (THROW - 64)) | (1L << (USING - 64)) | (1L << (NAMESPACE - 64)) | (1L << (AUTO - 64)) | (1L << (REGISTER - 64)) | (1L << (SPECIAL_DATA - 64)) | (1L << (PRE_IF - 64)) | (1L << (PRE_ELIF - 64)) | (1L << (PRE_ELSE - 64)) | (1L << (PRE_ENDIF - 64)) | (1L << (PRE_DEFINE - 64)) | (1L << (PRE_UNDEF - 64)) | (1L << (PRE_DIAGNOSTIC - 64)) | (1L << (PRE_OTHER - 64)) | (1L << (PRE_INCLUDE - 64)) | (1L << (PRE_INCLUDE_NEXT - 64)) | (1L << (PRE_LINE - 64)) | (1L << (PRE_PRAGMA - 64)) | (1L << (PRE_GCC - 64)) | (1L << (PRE_PRAGMA_KEYWORDS - 64)) | (1L << (PRE_STR - 64)) | (1L << (OPERATOR - 64)) | (1L << (TEMPLATE - 64)) | (1L << (NEW - 64)) | (1L << (CLASS_KEY - 64)) | (1L << (ALPHA_NUMERIC - 64)) | (1L << (HEX_LITERAL - 64)) | (1L << (DECIMAL_LITERAL - 64)) | (1L << (OCTAL_LITERAL - 64)) | (1L << (FLOATING_POINT_LITERAL - 64)) | (1L << (COMMENT - 64)) | (1L << (CHAR - 64)) | (1L << (STRING - 64)) | (1L << (NEWLINE - 64)) | (1L << (ESCAPE - 64)) | (1L << (WHITESPACE - 64)) | (1L << (ELLIPSIS - 64)) | (1L << (OTHER - 64)))) != 0)) {
					{
					{
					setState(1392);
					assign_water_l2();
					}
					}
					setState(1397);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(1402);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Constant_expr_w_Context extends ParserRuleContext {
		public List<No_squaresContext> no_squares() {
			return getRuleContexts(No_squaresContext.class);
		}
		public No_squaresContext no_squares(int i) {
			return getRuleContext(No_squaresContext.class,i);
		}
		public List<Constant_expr_w_Context> constant_expr_w_() {
			return getRuleContexts(Constant_expr_w_Context.class);
		}
		public Constant_expr_w_Context constant_expr_w_(int i) {
			return getRuleContext(Constant_expr_w_Context.class,i);
		}
		public Constant_expr_w_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant_expr_w_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterConstant_expr_w_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitConstant_expr_w_(this);
		}
	}

	public final Constant_expr_w_Context constant_expr_w_() throws RecognitionException {
		Constant_expr_w_Context _localctx = new Constant_expr_w_Context(_ctx, getState());
		enterRule(_localctx, 204, RULE_constant_expr_w_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1406);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << IF) | (1L << ELSE) | (1L << FOR) | (1L << WHILE) | (1L << BREAK) | (1L << CASE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (CONTINUE - 64)) | (1L << (SWITCH - 64)) | (1L << (DO - 64)) | (1L << (GOTO - 64)) | (1L << (RETURN - 64)) | (1L << (TYPEDEF - 64)) | (1L << (STATIC - 64)) | (1L << (VOID - 64)) | (1L << (UNSIGNED - 64)) | (1L << (SIGNED - 64)) | (1L << (LONG - 64)) | (1L << (CV_QUALIFIER - 64)) | (1L << (VIRTUAL - 64)) | (1L << (TRY - 64)) | (1L << (CATCH - 64)) | (1L << (THROW - 64)) | (1L << (USING - 64)) | (1L << (NAMESPACE - 64)) | (1L << (AUTO - 64)) | (1L << (REGISTER - 64)) | (1L << (SPECIAL_DATA - 64)) | (1L << (PRE_IF - 64)) | (1L << (PRE_ELIF - 64)) | (1L << (PRE_ELSE - 64)) | (1L << (PRE_ENDIF - 64)) | (1L << (PRE_DEFINE - 64)) | (1L << (PRE_UNDEF - 64)) | (1L << (PRE_DIAGNOSTIC - 64)) | (1L << (PRE_OTHER - 64)) | (1L << (PRE_INCLUDE - 64)) | (1L << (PRE_INCLUDE_NEXT - 64)) | (1L << (PRE_LINE - 64)) | (1L << (PRE_PRAGMA - 64)) | (1L << (PRE_GCC - 64)) | (1L << (PRE_PRAGMA_KEYWORDS - 64)) | (1L << (PRE_STR - 64)) | (1L << (OPERATOR - 64)) | (1L << (TEMPLATE - 64)) | (1L << (NEW - 64)) | (1L << (CLASS_KEY - 64)) | (1L << (ALPHA_NUMERIC - 64)) | (1L << (OPENING_CURLY - 64)) | (1L << (CLOSING_CURLY - 64)) | (1L << (HEX_LITERAL - 64)) | (1L << (DECIMAL_LITERAL - 64)) | (1L << (OCTAL_LITERAL - 64)) | (1L << (FLOATING_POINT_LITERAL - 64)) | (1L << (COMMENT - 64)) | (1L << (CHAR - 64)) | (1L << (STRING - 64)) | (1L << (NEWLINE - 64)) | (1L << (ESCAPE - 64)) | (1L << (WHITESPACE - 64)) | (1L << (ELLIPSIS - 64)) | (1L << (OTHER - 64)))) != 0)) {
				{
				{
				setState(1403);
				no_squares();
				}
				}
				setState(1408);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1420);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__25) {
				{
				{
				setState(1409);
				match(T__25);
				setState(1410);
				constant_expr_w_();
				setState(1411);
				match(T__26);
				setState(1415);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << IF) | (1L << ELSE) | (1L << FOR) | (1L << WHILE) | (1L << BREAK) | (1L << CASE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (CONTINUE - 64)) | (1L << (SWITCH - 64)) | (1L << (DO - 64)) | (1L << (GOTO - 64)) | (1L << (RETURN - 64)) | (1L << (TYPEDEF - 64)) | (1L << (STATIC - 64)) | (1L << (VOID - 64)) | (1L << (UNSIGNED - 64)) | (1L << (SIGNED - 64)) | (1L << (LONG - 64)) | (1L << (CV_QUALIFIER - 64)) | (1L << (VIRTUAL - 64)) | (1L << (TRY - 64)) | (1L << (CATCH - 64)) | (1L << (THROW - 64)) | (1L << (USING - 64)) | (1L << (NAMESPACE - 64)) | (1L << (AUTO - 64)) | (1L << (REGISTER - 64)) | (1L << (SPECIAL_DATA - 64)) | (1L << (PRE_IF - 64)) | (1L << (PRE_ELIF - 64)) | (1L << (PRE_ELSE - 64)) | (1L << (PRE_ENDIF - 64)) | (1L << (PRE_DEFINE - 64)) | (1L << (PRE_UNDEF - 64)) | (1L << (PRE_DIAGNOSTIC - 64)) | (1L << (PRE_OTHER - 64)) | (1L << (PRE_INCLUDE - 64)) | (1L << (PRE_INCLUDE_NEXT - 64)) | (1L << (PRE_LINE - 64)) | (1L << (PRE_PRAGMA - 64)) | (1L << (PRE_GCC - 64)) | (1L << (PRE_PRAGMA_KEYWORDS - 64)) | (1L << (PRE_STR - 64)) | (1L << (OPERATOR - 64)) | (1L << (TEMPLATE - 64)) | (1L << (NEW - 64)) | (1L << (CLASS_KEY - 64)) | (1L << (ALPHA_NUMERIC - 64)) | (1L << (OPENING_CURLY - 64)) | (1L << (CLOSING_CURLY - 64)) | (1L << (HEX_LITERAL - 64)) | (1L << (DECIMAL_LITERAL - 64)) | (1L << (OCTAL_LITERAL - 64)) | (1L << (FLOATING_POINT_LITERAL - 64)) | (1L << (COMMENT - 64)) | (1L << (CHAR - 64)) | (1L << (STRING - 64)) | (1L << (NEWLINE - 64)) | (1L << (ESCAPE - 64)) | (1L << (WHITESPACE - 64)) | (1L << (ELLIPSIS - 64)) | (1L << (OTHER - 64)))) != 0)) {
					{
					{
					setState(1412);
					no_squares();
					}
					}
					setState(1417);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(1422);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Simple_declContext extends ParserRuleContext {
		public Var_declContext var_decl() {
			return getRuleContext(Var_declContext.class,0);
		}
		public Simple_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterSimple_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitSimple_decl(this);
		}
	}

	public final Simple_declContext simple_decl() throws RecognitionException {
		Simple_declContext _localctx = new Simple_declContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_simple_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1423);
			var_decl();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Var_declContext extends ParserRuleContext {
		public Var_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_decl; }
	 
		public Var_declContext() { }
		public void copyFrom(Var_declContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DeclByClassContext extends Var_declContext {
		public Class_defContext class_def() {
			return getRuleContext(Class_defContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(ModuleParser.NEWLINE, 0); }
		public Init_declarator_listContext init_declarator_list() {
			return getRuleContext(Init_declarator_listContext.class,0);
		}
		public TerminalNode TYPEDEF() { return getToken(ModuleParser.TYPEDEF, 0); }
		public Template_decl_startContext template_decl_start() {
			return getRuleContext(Template_decl_startContext.class,0);
		}
		public DeclByClassContext(Var_declContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterDeclByClass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitDeclByClass(this);
		}
	}
	public static class DeclByTypeContext extends Var_declContext {
		public Type_nameContext type_name() {
			return getRuleContext(Type_nameContext.class,0);
		}
		public Init_declarator_listContext init_declarator_list() {
			return getRuleContext(Init_declarator_listContext.class,0);
		}
		public TerminalNode STATIC() { return getToken(ModuleParser.STATIC, 0); }
		public TerminalNode NEWLINE() { return getToken(ModuleParser.NEWLINE, 0); }
		public TerminalNode TYPEDEF() { return getToken(ModuleParser.TYPEDEF, 0); }
		public Template_decl_startContext template_decl_start() {
			return getRuleContext(Template_decl_startContext.class,0);
		}
		public DeclByTypeContext(Var_declContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterDeclByType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitDeclByType(this);
		}
	}
	public static class StructUnionEnumContext extends Var_declContext {
		public Special_datatypeContext special_datatype() {
			return getRuleContext(Special_datatypeContext.class,0);
		}
		public TerminalNode TYPEDEF() { return getToken(ModuleParser.TYPEDEF, 0); }
		public TerminalNode NEWLINE() { return getToken(ModuleParser.NEWLINE, 0); }
		public Init_declarator_listContext init_declarator_list() {
			return getRuleContext(Init_declarator_listContext.class,0);
		}
		public StructUnionEnumContext(Var_declContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterStructUnionEnum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitStructUnionEnum(this);
		}
	}

	public final Var_declContext var_decl() throws RecognitionException {
		Var_declContext _localctx = new Var_declContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_var_decl);
		int _la;
		try {
			setState(1466);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,188,_ctx) ) {
			case 1:
				_localctx = new DeclByClassContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(1426);
				_la = _input.LA(1);
				if (_la==TYPEDEF) {
					{
					setState(1425);
					match(TYPEDEF);
					}
				}

				setState(1429);
				_la = _input.LA(1);
				if (_la==TEMPLATE) {
					{
					setState(1428);
					template_decl_start();
					}
				}

				}
				setState(1431);
				class_def();
				setState(1433);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,178,_ctx) ) {
				case 1:
					{
					setState(1432);
					match(NEWLINE);
					}
					break;
				}
				setState(1436);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,179,_ctx) ) {
				case 1:
					{
					setState(1435);
					init_declarator_list();
					}
					break;
				}
				}
				break;
			case 2:
				_localctx = new DeclByTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(1439);
				_la = _input.LA(1);
				if (_la==TYPEDEF) {
					{
					setState(1438);
					match(TYPEDEF);
					}
				}

				setState(1442);
				_la = _input.LA(1);
				if (_la==TEMPLATE) {
					{
					setState(1441);
					template_decl_start();
					}
				}

				}
				setState(1445);
				_la = _input.LA(1);
				if (_la==STATIC) {
					{
					setState(1444);
					match(STATIC);
					}
				}

				setState(1447);
				type_name();
				setState(1449);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1448);
					match(NEWLINE);
					}
				}

				setState(1451);
				init_declarator_list();
				}
				break;
			case 3:
				_localctx = new StructUnionEnumContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1454);
				_la = _input.LA(1);
				if (_la==TYPEDEF) {
					{
					setState(1453);
					match(TYPEDEF);
					}
				}

				setState(1456);
				special_datatype();
				setState(1458);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,185,_ctx) ) {
				case 1:
					{
					setState(1457);
					match(NEWLINE);
					}
					break;
				}
				setState(1461);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,186,_ctx) ) {
				case 1:
					{
					setState(1460);
					init_declarator_list();
					}
					break;
				}
				setState(1464);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,187,_ctx) ) {
				case 1:
					{
					setState(1463);
					match(T__0);
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Special_datatypeContext extends ParserRuleContext {
		public TerminalNode SPECIAL_DATA() { return getToken(ModuleParser.SPECIAL_DATA, 0); }
		public TerminalNode OPENING_CURLY() { return getToken(ModuleParser.OPENING_CURLY, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Special_datatypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_special_datatype; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterSpecial_datatype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitSpecial_datatype(this);
		}
	}

	public final Special_datatypeContext special_datatype() throws RecognitionException {
		Special_datatypeContext _localctx = new Special_datatypeContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_special_datatype);
		int _la;
		try {
			setState(1476);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,190,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1468);
				match(SPECIAL_DATA);
				setState(1470);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__39) | (1L << T__40) | (1L << T__41))) != 0) || _la==ALPHA_NUMERIC) {
					{
					setState(1469);
					identifier();
					}
				}

				setState(1472);
				match(OPENING_CURLY);
				skipToEndOfObject(); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1474);
				match(SPECIAL_DATA);
				setState(1475);
				identifier();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Init_declarator_listContext extends ParserRuleContext {
		public List<Init_declaratorContext> init_declarator() {
			return getRuleContexts(Init_declaratorContext.class);
		}
		public Init_declaratorContext init_declarator(int i) {
			return getRuleContext(Init_declaratorContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(ModuleParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(ModuleParser.NEWLINE, i);
		}
		public Init_declarator_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_init_declarator_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterInit_declarator_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitInit_declarator_list(this);
		}
	}

	public final Init_declarator_listContext init_declarator_list() throws RecognitionException {
		Init_declarator_listContext _localctx = new Init_declarator_listContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_init_declarator_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1478);
			init_declarator();
			setState(1486);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(1479);
				match(T__4);
				setState(1481);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1480);
					match(NEWLINE);
					}
				}

				setState(1483);
				init_declarator();
				}
				}
				setState(1488);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1489);
			match(T__0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InitializerContext extends ParserRuleContext {
		public Assign_exprContext assign_expr() {
			return getRuleContext(Assign_exprContext.class,0);
		}
		public Initializer_listContext initializer_list() {
			return getRuleContext(Initializer_listContext.class,0);
		}
		public InitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitInitializer(this);
		}
	}

	public final InitializerContext initializer() throws RecognitionException {
		InitializerContext _localctx = new InitializerContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_initializer);
		try {
			setState(1498);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,193,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1491);
				assign_expr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1492);
				match(OPENING_CURLY);
				setState(1493);
				initializer_list();
				setState(1494);
				match(CLOSING_CURLY);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1496);
				match(OPENING_CURLY);
				setState(1497);
				match(CLOSING_CURLY);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Initializer_listContext extends ParserRuleContext {
		public List<InitializerContext> initializer() {
			return getRuleContexts(InitializerContext.class);
		}
		public InitializerContext initializer(int i) {
			return getRuleContext(InitializerContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(ModuleParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(ModuleParser.NEWLINE, i);
		}
		public Initializer_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializer_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterInitializer_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitInitializer_list(this);
		}
	}

	public final Initializer_listContext initializer_list() throws RecognitionException {
		Initializer_listContext _localctx = new Initializer_listContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_initializer_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1500);
			initializer();
			setState(1508);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(1501);
				match(T__4);
				setState(1503);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1502);
					match(NEWLINE);
					}
				}

				setState(1505);
				initializer();
				}
				}
				setState(1510);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Class_defContext extends ParserRuleContext {
		public TerminalNode CLASS_KEY() { return getToken(ModuleParser.CLASS_KEY, 0); }
		public TerminalNode OPENING_CURLY() { return getToken(ModuleParser.OPENING_CURLY, 0); }
		public Class_nameContext class_name() {
			return getRuleContext(Class_nameContext.class,0);
		}
		public Base_classesContext base_classes() {
			return getRuleContext(Base_classesContext.class,0);
		}
		public Class_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterClass_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitClass_def(this);
		}
	}

	public final Class_defContext class_def() throws RecognitionException {
		Class_defContext _localctx = new Class_defContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_class_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1511);
			match(CLASS_KEY);
			setState(1513);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__39) | (1L << T__40) | (1L << T__41))) != 0) || _la==ALPHA_NUMERIC) {
				{
				setState(1512);
				class_name();
				}
			}

			setState(1516);
			_la = _input.LA(1);
			if (_la==T__13) {
				{
				setState(1515);
				base_classes();
				}
			}

			setState(1518);
			match(OPENING_CURLY);
			skipToEndOfObject(); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Class_nameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Class_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterClass_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitClass_name(this);
		}
	}

	public final Class_nameContext class_name() throws RecognitionException {
		Class_nameContext _localctx = new Class_nameContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_class_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1521);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Base_classesContext extends ParserRuleContext {
		public List<Base_classContext> base_class() {
			return getRuleContexts(Base_classContext.class);
		}
		public Base_classContext base_class(int i) {
			return getRuleContext(Base_classContext.class,i);
		}
		public Base_classesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_base_classes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterBase_classes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitBase_classes(this);
		}
	}

	public final Base_classesContext base_classes() throws RecognitionException {
		Base_classesContext _localctx = new Base_classesContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_base_classes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1523);
			match(T__13);
			setState(1524);
			base_class();
			setState(1529);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(1525);
				match(T__4);
				setState(1526);
				base_class();
				}
				}
				setState(1531);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Base_classContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode VIRTUAL() { return getToken(ModuleParser.VIRTUAL, 0); }
		public Access_specifierContext access_specifier() {
			return getRuleContext(Access_specifierContext.class,0);
		}
		public Base_classContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_base_class; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterBase_class(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitBase_class(this);
		}
	}

	public final Base_classContext base_class() throws RecognitionException {
		Base_classContext _localctx = new Base_classContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_base_class);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1533);
			_la = _input.LA(1);
			if (_la==VIRTUAL) {
				{
				setState(1532);
				match(VIRTUAL);
				}
			}

			setState(1536);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,200,_ctx) ) {
			case 1:
				{
				setState(1535);
				access_specifier();
				}
				break;
			}
			setState(1538);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Type_nameContext extends ParserRuleContext {
		public List<Base_typeContext> base_type() {
			return getRuleContexts(Base_typeContext.class);
		}
		public Base_typeContext base_type(int i) {
			return getRuleContext(Base_typeContext.class,i);
		}
		public List<TerminalNode> CV_QUALIFIER() { return getTokens(ModuleParser.CV_QUALIFIER); }
		public TerminalNode CV_QUALIFIER(int i) {
			return getToken(ModuleParser.CV_QUALIFIER, i);
		}
		public List<Template_param_listContext> template_param_list() {
			return getRuleContexts(Template_param_listContext.class);
		}
		public Template_param_listContext template_param_list(int i) {
			return getRuleContext(Template_param_listContext.class,i);
		}
		public TerminalNode CLASS_KEY() { return getToken(ModuleParser.CLASS_KEY, 0); }
		public TerminalNode UNSIGNED() { return getToken(ModuleParser.UNSIGNED, 0); }
		public TerminalNode SIGNED() { return getToken(ModuleParser.SIGNED, 0); }
		public TerminalNode SPECIAL_DATA() { return getToken(ModuleParser.SPECIAL_DATA, 0); }
		public MacroCallContext macroCall() {
			return getRuleContext(MacroCallContext.class,0);
		}
		public Type_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterType_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitType_name(this);
		}
	}

	public final Type_nameContext type_name() throws RecognitionException {
		Type_nameContext _localctx = new Type_nameContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_type_name);
		int _la;
		try {
			setState(1576);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,207,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(1543);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CV_QUALIFIER) {
					{
					{
					setState(1540);
					match(CV_QUALIFIER);
					}
					}
					setState(1545);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1547);
				_la = _input.LA(1);
				if (((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (UNSIGNED - 72)) | (1L << (SIGNED - 72)) | (1L << (SPECIAL_DATA - 72)) | (1L << (CLASS_KEY - 72)))) != 0)) {
					{
					setState(1546);
					_la = _input.LA(1);
					if ( !(((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (UNSIGNED - 72)) | (1L << (SIGNED - 72)) | (1L << (SPECIAL_DATA - 72)) | (1L << (CLASS_KEY - 72)))) != 0)) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					}
				}

				setState(1549);
				base_type();
				setState(1554);
				_la = _input.LA(1);
				if (_la==T__5) {
					{
					setState(1550);
					match(T__5);
					setState(1551);
					template_param_list();
					setState(1552);
					match(T__6);
					}
				}

				setState(1566);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__24) {
					{
					{
					setState(1556);
					match(T__24);
					setState(1557);
					base_type();
					setState(1562);
					_la = _input.LA(1);
					if (_la==T__5) {
						{
						setState(1558);
						match(T__5);
						setState(1559);
						template_param_list();
						setState(1560);
						match(T__6);
						}
					}

					}
					}
					setState(1568);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				setState(1570);
				_la = _input.LA(1);
				if (_la==CV_QUALIFIER) {
					{
					setState(1569);
					match(CV_QUALIFIER);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1572);
				macroCall();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1573);
				match(UNSIGNED);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1574);
				match(SIGNED);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1575);
				match(SPECIAL_DATA);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Base_typeContext extends ParserRuleContext {
		public List<TerminalNode> ALPHA_NUMERIC() { return getTokens(ModuleParser.ALPHA_NUMERIC); }
		public TerminalNode ALPHA_NUMERIC(int i) {
			return getToken(ModuleParser.ALPHA_NUMERIC, i);
		}
		public List<TerminalNode> VOID() { return getTokens(ModuleParser.VOID); }
		public TerminalNode VOID(int i) {
			return getToken(ModuleParser.VOID, i);
		}
		public List<TerminalNode> LONG() { return getTokens(ModuleParser.LONG); }
		public TerminalNode LONG(int i) {
			return getToken(ModuleParser.LONG, i);
		}
		public Base_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_base_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterBase_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitBase_type(this);
		}
	}

	public final Base_typeContext base_type() throws RecognitionException {
		Base_typeContext _localctx = new Base_typeContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_base_type);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1579); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1578);
					_la = _input.LA(1);
					if ( !(((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (VOID - 71)) | (1L << (LONG - 71)) | (1L << (ALPHA_NUMERIC - 71)))) != 0)) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1581); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,208,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Param_decl_specifiersContext extends ParserRuleContext {
		public Type_nameContext type_name() {
			return getRuleContext(Type_nameContext.class,0);
		}
		public TerminalNode AUTO() { return getToken(ModuleParser.AUTO, 0); }
		public TerminalNode REGISTER() { return getToken(ModuleParser.REGISTER, 0); }
		public Param_decl_specifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param_decl_specifiers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterParam_decl_specifiers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitParam_decl_specifiers(this);
		}
	}

	public final Param_decl_specifiersContext param_decl_specifiers() throws RecognitionException {
		Param_decl_specifiersContext _localctx = new Param_decl_specifiersContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_param_decl_specifiers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1584);
			_la = _input.LA(1);
			if (_la==AUTO || _la==REGISTER) {
				{
				setState(1583);
				_la = _input.LA(1);
				if ( !(_la==AUTO || _la==REGISTER) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
			}

			setState(1586);
			type_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Parameter_nameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Parameter_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterParameter_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitParameter_name(this);
		}
	}

	public final Parameter_nameContext parameter_name() throws RecognitionException {
		Parameter_nameContext _localctx = new Parameter_nameContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_parameter_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1588);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Param_type_listContext extends ParserRuleContext {
		public TerminalNode VOID() { return getToken(ModuleParser.VOID, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(ModuleParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(ModuleParser.NEWLINE, i);
		}
		public List<Param_typeContext> param_type() {
			return getRuleContexts(Param_typeContext.class);
		}
		public Param_typeContext param_type(int i) {
			return getRuleContext(Param_typeContext.class,i);
		}
		public Param_type_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param_type_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterParam_type_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitParam_type_list(this);
		}
	}

	public final Param_type_listContext param_type_list() throws RecognitionException {
		Param_type_listContext _localctx = new Param_type_listContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_param_type_list);
		int _la;
		try {
			setState(1617);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,216,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1590);
				match(T__1);
				setState(1592);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1591);
					match(NEWLINE);
					}
				}

				setState(1594);
				match(VOID);
				setState(1595);
				match(T__2);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1596);
				match(T__1);
				setState(1598);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1597);
					match(NEWLINE);
					}
				}

				setState(1614);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__39) | (1L << T__40) | (1L << T__41))) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (VOID - 71)) | (1L << (UNSIGNED - 71)) | (1L << (SIGNED - 71)) | (1L << (LONG - 71)) | (1L << (CV_QUALIFIER - 71)) | (1L << (AUTO - 71)) | (1L << (REGISTER - 71)) | (1L << (SPECIAL_DATA - 71)) | (1L << (CLASS_KEY - 71)) | (1L << (ALPHA_NUMERIC - 71)) | (1L << (HEX_LITERAL - 71)) | (1L << (DECIMAL_LITERAL - 71)) | (1L << (OCTAL_LITERAL - 71)) | (1L << (FLOATING_POINT_LITERAL - 71)) | (1L << (CHAR - 71)) | (1L << (STRING - 71)))) != 0)) {
					{
					setState(1600);
					param_type();
					setState(1602);
					_la = _input.LA(1);
					if (_la==NEWLINE) {
						{
						setState(1601);
						match(NEWLINE);
						}
					}

					setState(1611);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__4) {
						{
						{
						setState(1604);
						match(T__4);
						setState(1606);
						_la = _input.LA(1);
						if (_la==NEWLINE) {
							{
							setState(1605);
							match(NEWLINE);
							}
						}

						setState(1608);
						param_type();
						}
						}
						setState(1613);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(1616);
				match(T__2);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Param_typeContext extends ParserRuleContext {
		public Param_decl_specifiersContext param_decl_specifiers() {
			return getRuleContext(Param_decl_specifiersContext.class,0);
		}
		public Param_type_idContext param_type_id() {
			return getRuleContext(Param_type_idContext.class,0);
		}
		public Param_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterParam_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitParam_type(this);
		}
	}

	public final Param_typeContext param_type() throws RecognitionException {
		Param_typeContext _localctx = new Param_typeContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_param_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1619);
			param_decl_specifiers();
			setState(1620);
			param_type_id();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Param_type_idContext extends ParserRuleContext {
		public Param_type_idContext param_type_id() {
			return getRuleContext(Param_type_idContext.class,0);
		}
		public PtrsContext ptrs() {
			return getRuleContext(PtrsContext.class,0);
		}
		public Type_suffixContext type_suffix() {
			return getRuleContext(Type_suffixContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(ModuleParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(ModuleParser.NEWLINE, i);
		}
		public Parameter_nameContext parameter_name() {
			return getRuleContext(Parameter_nameContext.class,0);
		}
		public Param_type_idContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param_type_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterParam_type_id(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitParam_type_id(this);
		}
	}

	public final Param_type_idContext param_type_id() throws RecognitionException {
		Param_type_idContext _localctx = new Param_type_idContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_param_type_id);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1623);
			_la = _input.LA(1);
			if (_la==T__18 || _la==T__22) {
				{
				setState(1622);
				ptrs();
				}
			}

			setState(1638);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,221,_ctx) ) {
			case 1:
				{
				setState(1625);
				match(T__1);
				setState(1627);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,218,_ctx) ) {
				case 1:
					{
					setState(1626);
					match(NEWLINE);
					}
					break;
				}
				setState(1629);
				param_type_id();
				setState(1631);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1630);
					match(NEWLINE);
					}
				}

				setState(1633);
				match(T__2);
				}
				break;
			case 2:
				{
				setState(1636);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__39) | (1L << T__40) | (1L << T__41))) != 0) || _la==ALPHA_NUMERIC) {
					{
					setState(1635);
					parameter_name();
					}
				}

				}
				break;
			}
			setState(1641);
			_la = _input.LA(1);
			if (_la==T__1 || _la==T__25) {
				{
				setState(1640);
				type_suffix();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierContext extends ParserRuleContext {
		public List<TerminalNode> ALPHA_NUMERIC() { return getTokens(ModuleParser.ALPHA_NUMERIC); }
		public TerminalNode ALPHA_NUMERIC(int i) {
			return getToken(ModuleParser.ALPHA_NUMERIC, i);
		}
		public Access_specifierContext access_specifier() {
			return getRuleContext(Access_specifierContext.class,0);
		}
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitIdentifier(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 240, RULE_identifier);
		try {
			int _alt;
			setState(1652);
			switch (_input.LA(1)) {
			case ALPHA_NUMERIC:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(1643);
				match(ALPHA_NUMERIC);
				setState(1648);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,223,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1644);
						match(T__24);
						setState(1645);
						match(ALPHA_NUMERIC);
						}
						} 
					}
					setState(1650);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,223,_ctx);
				}
				}
				}
				break;
			case T__39:
			case T__40:
			case T__41:
				enterOuterAlt(_localctx, 2);
				{
				setState(1651);
				access_specifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumberContext extends ParserRuleContext {
		public TerminalNode HEX_LITERAL() { return getToken(ModuleParser.HEX_LITERAL, 0); }
		public TerminalNode DECIMAL_LITERAL() { return getToken(ModuleParser.DECIMAL_LITERAL, 0); }
		public TerminalNode OCTAL_LITERAL() { return getToken(ModuleParser.OCTAL_LITERAL, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitNumber(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 242, RULE_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1654);
			_la = _input.LA(1);
			if ( !(((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (HEX_LITERAL - 107)) | (1L << (DECIMAL_LITERAL - 107)) | (1L << (OCTAL_LITERAL - 107)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PtrsContext extends ParserRuleContext {
		public List<Ptr_operatorContext> ptr_operator() {
			return getRuleContexts(Ptr_operatorContext.class);
		}
		public Ptr_operatorContext ptr_operator(int i) {
			return getRuleContext(Ptr_operatorContext.class,i);
		}
		public PtrsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ptrs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterPtrs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitPtrs(this);
		}
	}

	public final PtrsContext ptrs() throws RecognitionException {
		PtrsContext _localctx = new PtrsContext(_ctx, getState());
		enterRule(_localctx, 244, RULE_ptrs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1660); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1656);
				ptr_operator();
				setState(1658);
				_la = _input.LA(1);
				if (_la==T__56) {
					{
					setState(1657);
					match(T__56);
					}
				}

				}
				}
				setState(1662); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__18 || _la==T__22 );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Func_ptrsContext extends ParserRuleContext {
		public PtrsContext ptrs() {
			return getRuleContext(PtrsContext.class,0);
		}
		public Func_ptrsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_ptrs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterFunc_ptrs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitFunc_ptrs(this);
		}
	}

	public final Func_ptrsContext func_ptrs() throws RecognitionException {
		Func_ptrsContext _localctx = new Func_ptrsContext(_ctx, getState());
		enterRule(_localctx, 246, RULE_func_ptrs);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1664);
			ptrs();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 53:
			return postfix_expression_sempred((Postfix_expressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean postfix_expression_sempred(Postfix_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 7);
		case 1:
			return precpred(_ctx, 6);
		case 2:
			return precpred(_ctx, 5);
		case 3:
			return precpred(_ctx, 4);
		case 4:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3x\u0685\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\4v\tv\4"+
		"w\tw\4x\tx\4y\ty\4z\tz\4{\t{\4|\t|\4}\t}\3\2\3\2\3\2\3\2\3\2\3\2\3\2\7"+
		"\2\u0102\n\2\f\2\16\2\u0105\13\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\5\4\u010e"+
		"\n\4\3\5\3\5\3\5\3\5\5\5\u0114\n\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b"+
		"\3\b\3\t\3\t\3\n\3\n\3\n\3\n\3\n\5\n\u0127\n\n\3\13\3\13\3\13\3\13\7\13"+
		"\u012d\n\13\f\13\16\13\u0130\13\13\3\13\3\13\7\13\u0134\n\13\f\13\16\13"+
		"\u0137\13\13\3\13\3\13\5\13\u013b\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\5\f\u0145\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r"+
		"\u0154\n\r\3\16\3\16\3\16\3\17\3\17\3\20\3\20\5\20\u015d\n\20\3\20\3\20"+
		"\3\20\5\20\u0162\n\20\7\20\u0164\n\20\f\20\16\20\u0167\13\20\3\21\3\21"+
		"\3\22\3\22\3\22\5\22\u016e\n\22\3\23\3\23\5\23\u0172\n\23\3\24\3\24\3"+
		"\24\3\24\3\24\3\24\5\24\u017a\n\24\3\25\3\25\3\25\3\25\3\25\3\25\5\25"+
		"\u0182\n\25\3\26\3\26\3\26\3\26\3\27\3\27\3\30\3\30\6\30\u018c\n\30\r"+
		"\30\16\30\u018d\5\30\u0190\n\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u01a0\n\31\3\32\3\32\5\32\u01a4\n"+
		"\32\3\32\3\32\3\32\3\32\3\32\5\32\u01ab\n\32\3\32\3\32\6\32\u01af\n\32"+
		"\r\32\16\32\u01b0\3\32\3\32\5\32\u01b5\n\32\3\32\3\32\3\32\5\32\u01ba"+
		"\n\32\3\33\3\33\3\33\5\33\u01bf\n\33\3\34\3\34\3\34\6\34\u01c4\n\34\r"+
		"\34\16\34\u01c5\3\35\3\35\3\35\5\35\u01cb\n\35\3\36\3\36\5\36\u01cf\n"+
		"\36\3\36\5\36\u01d2\n\36\3\36\5\36\u01d5\n\36\3\36\3\36\5\36\u01d9\n\36"+
		"\3\36\3\36\3\37\3\37\3\37\7\37\u01e0\n\37\f\37\16\37\u01e3\13\37\3\37"+
		"\7\37\u01e6\n\37\f\37\16\37\u01e9\13\37\3\37\3\37\7\37\u01ed\n\37\f\37"+
		"\16\37\u01f0\13\37\3\37\5\37\u01f3\n\37\3\37\3\37\7\37\u01f7\n\37\f\37"+
		"\16\37\u01fa\13\37\3 \3 \7 \u01fe\n \f \16 \u0201\13 \3 \3 \7 \u0205\n"+
		" \f \16 \u0208\13 \3 \3 \5 \u020c\n \3!\3!\3!\7!\u0211\n!\f!\16!\u0214"+
		"\13!\3!\3!\7!\u0218\n!\f!\16!\u021b\13!\3!\3!\7!\u021f\n!\f!\16!\u0222"+
		"\13!\3!\3!\7!\u0226\n!\f!\16!\u0229\13!\3!\3!\5!\u022d\n!\3\"\3\"\7\""+
		"\u0231\n\"\f\"\16\"\u0234\13\"\3\"\3\"\7\"\u0238\n\"\f\"\16\"\u023b\13"+
		"\"\3\"\5\"\u023e\n\"\3#\3#\7#\u0242\n#\f#\16#\u0245\13#\3#\3#\7#\u0249"+
		"\n#\f#\16#\u024c\13#\3#\5#\u024f\n#\3$\3$\7$\u0253\n$\f$\16$\u0256\13"+
		"$\3$\3$\7$\u025a\n$\f$\16$\u025d\13$\3$\5$\u0260\n$\3%\3%\7%\u0264\n%"+
		"\f%\16%\u0267\13%\3%\3%\7%\u026b\n%\f%\16%\u026e\13%\3%\5%\u0271\n%\3"+
		"&\3&\7&\u0275\n&\f&\16&\u0278\13&\3&\3&\7&\u027c\n&\f&\16&\u027f\13&\3"+
		"&\5&\u0282\n&\3\'\3\'\7\'\u0286\n\'\f\'\16\'\u0289\13\'\3\'\3\'\7\'\u028d"+
		"\n\'\f\'\16\'\u0290\13\'\3\'\3\'\5\'\u0294\n\'\3(\3(\7(\u0298\n(\f(\16"+
		"(\u029b\13(\3(\3(\7(\u029f\n(\f(\16(\u02a2\13(\3(\3(\5(\u02a6\n(\3)\3"+
		")\7)\u02aa\n)\f)\16)\u02ad\13)\3)\3)\7)\u02b1\n)\f)\16)\u02b4\13)\3)\5"+
		")\u02b7\n)\3*\3*\7*\u02bb\n*\f*\16*\u02be\13*\3*\3*\7*\u02c2\n*\f*\16"+
		"*\u02c5\13*\3*\5*\u02c8\n*\3+\3+\7+\u02cc\n+\f+\16+\u02cf\13+\3+\3+\7"+
		"+\u02d3\n+\f+\16+\u02d6\13+\3+\5+\u02d9\n+\3,\3,\3,\3,\3,\3,\5,\u02e1"+
		"\n,\3-\3-\7-\u02e5\n-\f-\16-\u02e8\13-\3-\7-\u02eb\n-\f-\16-\u02ee\13"+
		"-\3.\3.\3.\3.\3.\5.\u02f5\n.\3/\5/\u02f8\n/\3/\3/\7/\u02fc\n/\f/\16/\u02ff"+
		"\13/\3/\3/\7/\u0303\n/\f/\16/\u0306\13/\3/\3/\5/\u030a\n/\3/\3/\3/\5/"+
		"\u030f\n/\3/\3/\7/\u0313\n/\f/\16/\u0316\13/\3/\3/\7/\u031a\n/\f/\16/"+
		"\u031d\13/\3/\3/\5/\u0321\n/\3/\3/\5/\u0325\n/\3\60\3\60\7\60\u0329\n"+
		"\60\f\60\16\60\u032c\13\60\3\60\3\60\3\61\3\61\7\61\u0332\n\61\f\61\16"+
		"\61\u0335\13\61\3\61\3\61\3\61\3\61\3\61\3\61\7\61\u033d\n\61\f\61\16"+
		"\61\u0340\13\61\3\61\3\61\5\61\u0344\n\61\3\62\3\62\3\63\3\63\7\63\u034a"+
		"\n\63\f\63\16\63\u034d\13\63\3\63\3\63\3\63\3\63\3\63\3\63\7\63\u0355"+
		"\n\63\f\63\16\63\u0358\13\63\3\63\5\63\u035b\n\63\3\64\3\64\7\64\u035f"+
		"\n\64\f\64\16\64\u0362\13\64\3\64\7\64\u0365\n\64\f\64\16\64\u0368\13"+
		"\64\3\65\3\65\3\66\3\66\3\67\3\67\3\67\5\67\u0371\n\67\3\67\3\67\7\67"+
		"\u0375\n\67\f\67\16\67\u0378\13\67\3\67\5\67\u037b\n\67\3\67\3\67\5\67"+
		"\u037f\n\67\3\67\3\67\7\67\u0383\n\67\f\67\16\67\u0386\13\67\3\67\3\67"+
		"\3\67\3\67\3\67\3\67\7\67\u038e\n\67\f\67\16\67\u0391\13\67\3\67\3\67"+
		"\3\67\3\67\3\67\3\67\3\67\7\67\u039a\n\67\f\67\16\67\u039d\13\67\3\67"+
		"\5\67\u03a0\n\67\3\67\3\67\3\67\3\67\7\67\u03a6\n\67\f\67\16\67\u03a9"+
		"\13\67\3\67\5\67\u03ac\n\67\3\67\3\67\3\67\7\67\u03b1\n\67\f\67\16\67"+
		"\u03b4\13\67\3\67\7\67\u03b7\n\67\f\67\16\67\u03ba\13\67\38\38\58\u03be"+
		"\n8\38\38\58\u03c2\n8\38\58\u03c5\n8\38\58\u03c8\n8\38\68\u03cb\n8\r8"+
		"\168\u03cc\38\38\58\u03d1\n8\38\58\u03d4\n8\38\38\39\69\u03d9\n9\r9\16"+
		"9\u03da\39\39\79\u03df\n9\f9\169\u03e2\139\39\69\u03e5\n9\r9\169\u03e6"+
		"\79\u03e9\n9\f9\169\u03ec\139\59\u03ee\n9\3:\3:\7:\u03f2\n:\f:\16:\u03f5"+
		"\13:\3;\3;\3;\3;\3;\3;\5;\u03fd\n;\3<\3<\3=\3=\3>\3>\3?\3?\3@\3@\3A\3"+
		"A\3B\3B\3C\3C\3D\3D\3D\5D\u0412\nD\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3"+
		"D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3"+
		"D\3D\3D\3D\3D\3D\5D\u043c\nD\3E\3E\3F\3F\3G\3G\3G\3G\3G\3H\3H\3H\3H\3"+
		"H\3H\3H\3H\3H\6H\u0450\nH\rH\16H\u0451\3I\3I\3J\3J\3K\3K\3L\3L\3M\3M\3"+
		"N\3N\3O\3O\3P\3P\3Q\3Q\3R\3R\3S\3S\3T\5T\u046b\nT\3T\7T\u046e\nT\fT\16"+
		"T\u0471\13T\3T\5T\u0474\nT\3T\7T\u0477\nT\fT\16T\u047a\13T\3T\3T\7T\u047e"+
		"\nT\fT\16T\u0481\13T\3T\3T\5T\u0485\nT\3T\3T\3U\7U\u048a\nU\fU\16U\u048d"+
		"\13U\3U\7U\u0490\nU\fU\16U\u0493\13U\3U\3U\3U\7U\u0498\nU\fU\16U\u049b"+
		"\13U\3U\5U\u049e\nU\3V\3V\5V\u04a2\nV\3V\3V\7V\u04a6\nV\fV\16V\u04a9\13"+
		"V\3V\5V\u04ac\nV\3W\3W\3W\7W\u04b1\nW\fW\16W\u04b4\13W\3W\7W\u04b7\nW"+
		"\fW\16W\u04ba\13W\3W\3W\7W\u04be\nW\fW\16W\u04c1\13W\3W\5W\u04c4\nW\3"+
		"X\3X\3X\3X\5X\u04ca\nX\3Y\5Y\u04cd\nY\3Y\3Y\3Y\3Y\3Y\5Y\u04d4\nY\3Y\5"+
		"Y\u04d7\nY\3Z\3Z\3Z\3[\3[\3[\3[\7[\u04e0\n[\f[\16[\u04e3\13[\3\\\3\\\3"+
		"\\\3]\5]\u04e9\n]\3]\3]\3^\3^\5^\u04ef\n^\3^\3^\3_\3_\3_\3_\3_\3_\3_\5"+
		"_\u04fa\n_\3`\3`\3`\3`\3`\3a\7a\u0502\na\fa\16a\u0505\13a\3a\3a\3a\3a"+
		"\7a\u050b\na\fa\16a\u050e\13a\7a\u0510\na\fa\16a\u0513\13a\3b\3b\3b\5"+
		"b\u0518\nb\3b\3b\3b\5b\u051d\nb\3c\5c\u0520\nc\3c\3c\5c\u0524\nc\3c\5"+
		"c\u0527\nc\3c\3c\5c\u052b\nc\3c\3c\3c\3c\3c\5c\u0532\nc\3d\6d\u0535\n"+
		"d\rd\16d\u0536\3e\3e\3e\3e\3e\5e\u053e\ne\3f\7f\u0541\nf\ff\16f\u0544"+
		"\13f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\5f\u0552\nf\3f\7f\u0555\nf\f"+
		"f\16f\u0558\13f\7f\u055a\nf\ff\16f\u055d\13f\3g\7g\u0560\ng\fg\16g\u0563"+
		"\13g\3g\3g\3g\3g\3g\3g\3g\3g\3g\3g\3g\3g\5g\u0571\ng\3g\7g\u0574\ng\f"+
		"g\16g\u0577\13g\7g\u0579\ng\fg\16g\u057c\13g\3h\7h\u057f\nh\fh\16h\u0582"+
		"\13h\3h\3h\3h\3h\7h\u0588\nh\fh\16h\u058b\13h\7h\u058d\nh\fh\16h\u0590"+
		"\13h\3i\3i\3j\5j\u0595\nj\3j\5j\u0598\nj\3j\3j\5j\u059c\nj\3j\5j\u059f"+
		"\nj\3j\5j\u05a2\nj\3j\5j\u05a5\nj\3j\5j\u05a8\nj\3j\3j\5j\u05ac\nj\3j"+
		"\3j\3j\5j\u05b1\nj\3j\3j\5j\u05b5\nj\3j\5j\u05b8\nj\3j\5j\u05bb\nj\5j"+
		"\u05bd\nj\3k\3k\5k\u05c1\nk\3k\3k\3k\3k\5k\u05c7\nk\3l\3l\3l\5l\u05cc"+
		"\nl\3l\7l\u05cf\nl\fl\16l\u05d2\13l\3l\3l\3m\3m\3m\3m\3m\3m\3m\5m\u05dd"+
		"\nm\3n\3n\3n\5n\u05e2\nn\3n\7n\u05e5\nn\fn\16n\u05e8\13n\3o\3o\5o\u05ec"+
		"\no\3o\5o\u05ef\no\3o\3o\3o\3p\3p\3q\3q\3q\3q\7q\u05fa\nq\fq\16q\u05fd"+
		"\13q\3r\5r\u0600\nr\3r\5r\u0603\nr\3r\3r\3s\7s\u0608\ns\fs\16s\u060b\13"+
		"s\3s\5s\u060e\ns\3s\3s\3s\3s\3s\5s\u0615\ns\3s\3s\3s\3s\3s\3s\5s\u061d"+
		"\ns\7s\u061f\ns\fs\16s\u0622\13s\3s\5s\u0625\ns\3s\3s\3s\3s\5s\u062b\n"+
		"s\3t\6t\u062e\nt\rt\16t\u062f\3u\5u\u0633\nu\3u\3u\3v\3v\3w\3w\5w\u063b"+
		"\nw\3w\3w\3w\3w\5w\u0641\nw\3w\3w\5w\u0645\nw\3w\3w\5w\u0649\nw\3w\7w"+
		"\u064c\nw\fw\16w\u064f\13w\5w\u0651\nw\3w\5w\u0654\nw\3x\3x\3x\3y\5y\u065a"+
		"\ny\3y\3y\5y\u065e\ny\3y\3y\5y\u0662\ny\3y\3y\3y\5y\u0667\ny\5y\u0669"+
		"\ny\3y\5y\u066c\ny\3z\3z\3z\7z\u0671\nz\fz\16z\u0674\13z\3z\5z\u0677\n"+
		"z\3{\3{\3|\3|\5|\u067d\n|\6|\u067f\n|\r|\16|\u0680\3}\3}\3}\2\3l~\2\4"+
		"\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNP"+
		"RTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e"+
		"\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6"+
		"\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be"+
		"\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6"+
		"\u00d8\u00da\u00dc\u00de\u00e0\u00e2\u00e4\u00e6\u00e8\u00ea\u00ec\u00ee"+
		"\u00f0\u00f2\u00f4\u00f6\u00f8\2\35\4\2\n\fjj\3\2\26\27\4\2\13\13\30\30"+
		"\4\2\f\f\31\32\3\2 !\6\2\13\13\25\25\30\31#$\4\2\b\t%&\4\2mprs\5\2\')"+
		"HHNN\4\2\25\25\31\31\3\2*,\4\2--hh\4\2\6\6.\67\3\289\3\2\4\5\5\2\4\5\34"+
		"\35kl\3\2\3\5\4\2\4\5\b\t\3\2kl\3\2\34\35\4\2\3\3\34\35\4\2\3\3\7\7\6"+
		"\2\3\5\7\7\34\35kl\5\2JKVVii\5\2IILLjj\3\2TU\3\2mo\u0739\2\u0103\3\2\2"+
		"\2\4\u0106\3\2\2\2\6\u010d\3\2\2\2\b\u0113\3\2\2\2\n\u0115\3\2\2\2\f\u0119"+
		"\3\2\2\2\16\u011d\3\2\2\2\20\u011f\3\2\2\2\22\u0126\3\2\2\2\24\u013a\3"+
		"\2\2\2\26\u0144\3\2\2\2\30\u0153\3\2\2\2\32\u0155\3\2\2\2\34\u0158\3\2"+
		"\2\2\36\u015c\3\2\2\2 \u0168\3\2\2\2\"\u016d\3\2\2\2$\u016f\3\2\2\2&\u0179"+
		"\3\2\2\2(\u0181\3\2\2\2*\u0183\3\2\2\2,\u0187\3\2\2\2.\u018f\3\2\2\2\60"+
		"\u019f\3\2\2\2\62\u01b9\3\2\2\2\64\u01be\3\2\2\2\66\u01c3\3\2\2\28\u01c7"+
		"\3\2\2\2:\u01cc\3\2\2\2<\u01dc\3\2\2\2>\u01fb\3\2\2\2@\u022c\3\2\2\2B"+
		"\u022e\3\2\2\2D\u023f\3\2\2\2F\u0250\3\2\2\2H\u0261\3\2\2\2J\u0272\3\2"+
		"\2\2L\u0283\3\2\2\2N\u0295\3\2\2\2P\u02a7\3\2\2\2R\u02b8\3\2\2\2T\u02c9"+
		"\3\2\2\2V\u02e0\3\2\2\2X\u02e2\3\2\2\2Z\u02f4\3\2\2\2\\\u0324\3\2\2\2"+
		"^\u0326\3\2\2\2`\u0343\3\2\2\2b\u0345\3\2\2\2d\u035a\3\2\2\2f\u035c\3"+
		"\2\2\2h\u0369\3\2\2\2j\u036b\3\2\2\2l\u037e\3\2\2\2n\u03bd\3\2\2\2p\u03ed"+
		"\3\2\2\2r\u03ef\3\2\2\2t\u03fc\3\2\2\2v\u03fe\3\2\2\2x\u0400\3\2\2\2z"+
		"\u0402\3\2\2\2|\u0404\3\2\2\2~\u0406\3\2\2\2\u0080\u0408\3\2\2\2\u0082"+
		"\u040a\3\2\2\2\u0084\u040c\3\2\2\2\u0086\u043b\3\2\2\2\u0088\u043d\3\2"+
		"\2\2\u008a\u043f\3\2\2\2\u008c\u0441\3\2\2\2\u008e\u044f\3\2\2\2\u0090"+
		"\u0453\3\2\2\2\u0092\u0455\3\2\2\2\u0094\u0457\3\2\2\2\u0096\u0459\3\2"+
		"\2\2\u0098\u045b\3\2\2\2\u009a\u045d\3\2\2\2\u009c\u045f\3\2\2\2\u009e"+
		"\u0461\3\2\2\2\u00a0\u0463\3\2\2\2\u00a2\u0465\3\2\2\2\u00a4\u0467\3\2"+
		"\2\2\u00a6\u046a\3\2\2\2\u00a8\u049d\3\2\2\2\u00aa\u049f\3\2\2\2\u00ac"+
		"\u04ad\3\2\2\2\u00ae\u04c9\3\2\2\2\u00b0\u04cc\3\2\2\2\u00b2\u04d8\3\2"+
		"\2\2\u00b4\u04db\3\2\2\2\u00b6\u04e4\3\2\2\2\u00b8\u04e8\3\2\2\2\u00ba"+
		"\u04ec\3\2\2\2\u00bc\u04f9\3\2\2\2\u00be\u04fb\3\2\2\2\u00c0\u0503\3\2"+
		"\2\2\u00c2\u0514\3\2\2\2\u00c4\u0531\3\2\2\2\u00c6\u0534\3\2\2\2\u00c8"+
		"\u053d\3\2\2\2\u00ca\u0542\3\2\2\2\u00cc\u0561\3\2\2\2\u00ce\u0580\3\2"+
		"\2\2\u00d0\u0591\3\2\2\2\u00d2\u05bc\3\2\2\2\u00d4\u05c6\3\2\2\2\u00d6"+
		"\u05c8\3\2\2\2\u00d8\u05dc\3\2\2\2\u00da\u05de\3\2\2\2\u00dc\u05e9\3\2"+
		"\2\2\u00de\u05f3\3\2\2\2\u00e0\u05f5\3\2\2\2\u00e2\u05ff\3\2\2\2\u00e4"+
		"\u062a\3\2\2\2\u00e6\u062d\3\2\2\2\u00e8\u0632\3\2\2\2\u00ea\u0636\3\2"+
		"\2\2\u00ec\u0653\3\2\2\2\u00ee\u0655\3\2\2\2\u00f0\u0659\3\2\2\2\u00f2"+
		"\u0676\3\2\2\2\u00f4\u0678\3\2\2\2\u00f6\u067e\3\2\2\2\u00f8\u0682\3\2"+
		"\2\2\u00fa\u0102\5\6\4\2\u00fb\u0102\5\u00a6T\2\u00fc\u0102\5\u00d0i\2"+
		"\u00fd\u0102\5\4\3\2\u00fe\u0102\5v<\2\u00ff\u0102\5\64\33\2\u0100\u0102"+
		"\5\u00a4S\2\u0101\u00fa\3\2\2\2\u0101\u00fb\3\2\2\2\u0101\u00fc\3\2\2"+
		"\2\u0101\u00fd\3\2\2\2\u0101\u00fe\3\2\2\2\u0101\u00ff\3\2\2\2\u0101\u0100"+
		"\3\2\2\2\u0102\u0105\3\2\2\2\u0103\u0101\3\2\2\2\u0103\u0104\3\2\2\2\u0104"+
		"\3\3\2\2\2\u0105\u0103\3\2\2\2\u0106\u0107\7R\2\2\u0107\u0108\7S\2\2\u0108"+
		"\u0109\5\u00f2z\2\u0109\u010a\7\3\2\2\u010a\5\3\2\2\2\u010b\u010e\5\b"+
		"\5\2\u010c\u010e\5\26\f\2\u010d\u010b\3\2\2\2\u010d\u010c\3\2\2\2\u010e"+
		"\7\3\2\2\2\u010f\u0114\5\n\6\2\u0110\u0114\5\f\7\2\u0111\u0114\5\16\b"+
		"\2\u0112\u0114\5\20\t\2\u0113\u010f\3\2\2\2\u0113\u0110\3\2\2\2\u0113"+
		"\u0111\3\2\2\2\u0113\u0112\3\2\2\2\u0114\t\3\2\2\2\u0115\u0116\7W\2\2"+
		"\u0116\u0117\5\22\n\2\u0117\u0118\b\6\1\2\u0118\13\3\2\2\2\u0119\u011a"+
		"\7X\2\2\u011a\u011b\5\22\n\2\u011b\u011c\b\7\1\2\u011c\r\3\2\2\2\u011d"+
		"\u011e\7Y\2\2\u011e\17\3\2\2\2\u011f\u0120\7Z\2\2\u0120\21\3\2\2\2\u0121"+
		"\u0127\5\24\13\2\u0122\u0123\7\4\2\2\u0123\u0124\5\24\13\2\u0124\u0125"+
		"\7\5\2\2\u0125\u0127\3\2\2\2\u0126\u0121\3\2\2\2\u0126\u0122\3\2\2\2\u0127"+
		"\23\3\2\2\2\u0128\u013b\5<\37\2\u0129\u012a\5\u00e4s\2\u012a\u012e\5\u00c4"+
		"c\2\u012b\u012d\7t\2\2\u012c\u012b\3\2\2\2\u012d\u0130\3\2\2\2\u012e\u012c"+
		"\3\2\2\2\u012e\u012f\3\2\2\2\u012f\u0131\3\2\2\2\u0130\u012e\3\2\2\2\u0131"+
		"\u0135\7\6\2\2\u0132\u0134\7t\2\2\u0133\u0132\3\2\2\2\u0134\u0137\3\2"+
		"\2\2\u0135\u0133\3\2\2\2\u0135\u0136\3\2\2\2\u0136\u0138\3\2\2\2\u0137"+
		"\u0135\3\2\2\2\u0138\u0139\5> \2\u0139\u013b\3\2\2\2\u013a\u0128\3\2\2"+
		"\2\u013a\u0129\3\2\2\2\u013b\25\3\2\2\2\u013c\u0145\5\30\r\2\u013d\u0145"+
		"\5\32\16\2\u013e\u0145\5\"\22\2\u013f\u0145\5$\23\2\u0140\u0145\5&\24"+
		"\2\u0141\u0145\5(\25\2\u0142\u0145\5\60\31\2\u0143\u0145\5\62\32\2\u0144"+
		"\u013c\3\2\2\2\u0144\u013d\3\2\2\2\u0144\u013e\3\2\2\2\u0144\u013f\3\2"+
		"\2\2\u0144\u0140\3\2\2\2\u0144\u0141\3\2\2\2\u0144\u0142\3\2\2\2\u0144"+
		"\u0143\3\2\2\2\u0145\27\3\2\2\2\u0146\u0147\7[\2\2\u0147\u0148\5\34\17"+
		"\2\u0148\u0149\7\4\2\2\u0149\u014a\5\36\20\2\u014a\u014b\7\5\2\2\u014b"+
		"\u014c\5 \21\2\u014c\u0154\3\2\2\2\u014d\u014e\7[\2\2\u014e\u014f\5\34"+
		"\17\2\u014f\u0150\5 \21\2\u0150\u0154\3\2\2\2\u0151\u0152\7[\2\2\u0152"+
		"\u0154\5\34\17\2\u0153\u0146\3\2\2\2\u0153\u014d\3\2\2\2\u0153\u0151\3"+
		"\2\2\2\u0154\31\3\2\2\2\u0155\u0156\7\\\2\2\u0156\u0157\5\34\17\2\u0157"+
		"\33\3\2\2\2\u0158\u0159\5\u00f2z\2\u0159\35\3\2\2\2\u015a\u015d\5\u00f2"+
		"z\2\u015b\u015d\7w\2\2\u015c\u015a\3\2\2\2\u015c\u015b\3\2\2\2\u015c\u015d"+
		"\3\2\2\2\u015d\u0165\3\2\2\2\u015e\u0161\7\7\2\2\u015f\u0162\5\u00f2z"+
		"\2\u0160\u0162\7w\2\2\u0161\u015f\3\2\2\2\u0161\u0160\3\2\2\2\u0162\u0164"+
		"\3\2\2\2\u0163\u015e\3\2\2\2\u0164\u0167\3\2\2\2\u0165\u0163\3\2\2\2\u0165"+
		"\u0166\3\2\2\2\u0166\37\3\2\2\2\u0167\u0165\3\2\2\2\u0168\u0169\b\21\1"+
		"\2\u0169!\3\2\2\2\u016a\u016b\7]\2\2\u016b\u016e\7s\2\2\u016c\u016e\7"+
		"]\2\2\u016d\u016a\3\2\2\2\u016d\u016c\3\2\2\2\u016e#\3\2\2\2\u016f\u0171"+
		"\7^\2\2\u0170\u0172\7s\2\2\u0171\u0170\3\2\2\2\u0171\u0172\3\2\2\2\u0172"+
		"%\3\2\2\2\u0173\u0174\7_\2\2\u0174\u017a\5*\26\2\u0175\u0176\7_\2\2\u0176"+
		"\u017a\5\34\17\2\u0177\u0178\7_\2\2\u0178\u017a\5,\27\2\u0179\u0173\3"+
		"\2\2\2\u0179\u0175\3\2\2\2\u0179\u0177\3\2\2\2\u017a\'\3\2\2\2\u017b\u017c"+
		"\7`\2\2\u017c\u0182\5*\26\2\u017d\u017e\7`\2\2\u017e\u0182\5\34\17\2\u017f"+
		"\u0180\7`\2\2\u0180\u0182\5,\27\2\u0181\u017b\3\2\2\2\u0181\u017d\3\2"+
		"\2\2\u0181\u017f\3\2\2\2\u0182)\3\2\2\2\u0183\u0184\7\b\2\2\u0184\u0185"+
		"\5.\30\2\u0185\u0186\7\t\2\2\u0186+\3\2\2\2\u0187\u0188\5.\30\2\u0188"+
		"-\3\2\2\2\u0189\u0190\7s\2\2\u018a\u018c\t\2\2\2\u018b\u018a\3\2\2\2\u018c"+
		"\u018d\3\2\2\2\u018d\u018b\3\2\2\2\u018d\u018e\3\2\2\2\u018e\u0190\3\2"+
		"\2\2\u018f\u0189\3\2\2\2\u018f\u018b\3\2\2\2\u0190/\3\2\2\2\u0191\u0192"+
		"\7a\2\2\u0192\u0193\7n\2\2\u0193\u01a0\7s\2\2\u0194\u0195\7a\2\2\u0195"+
		"\u0196\7n\2\2\u0196\u01a0\5\34\17\2\u0197\u0198\7a\2\2\u0198\u0199\5\34"+
		"\17\2\u0199\u019a\7s\2\2\u019a\u01a0\3\2\2\2\u019b\u019c\7a\2\2\u019c"+
		"\u01a0\5\34\17\2\u019d\u019e\7a\2\2\u019e\u01a0\7n\2\2\u019f\u0191\3\2"+
		"\2\2\u019f\u0194\3\2\2\2\u019f\u0197\3\2\2\2\u019f\u019b\3\2\2\2\u019f"+
		"\u019d\3\2\2\2\u01a0\61\3\2\2\2\u01a1\u01a3\7b\2\2\u01a2\u01a4\7c\2\2"+
		"\u01a3\u01a2\3\2\2\2\u01a3\u01a4\3\2\2\2\u01a4\u01a5\3\2\2\2\u01a5\u01a6"+
		"\7d\2\2\u01a6\u01a7\7s\2\2\u01a7\u01ba\b\32\1\2\u01a8\u01aa\7b\2\2\u01a9"+
		"\u01ab\7c\2\2\u01aa\u01a9\3\2\2\2\u01aa\u01ab\3\2\2\2\u01ab\u01ac\3\2"+
		"\2\2\u01ac\u01ae\7d\2\2\u01ad\u01af\5\u00f2z\2\u01ae\u01ad\3\2\2\2\u01af"+
		"\u01b0\3\2\2\2\u01b0\u01ae\3\2\2\2\u01b0\u01b1\3\2\2\2\u01b1\u01ba\3\2"+
		"\2\2\u01b2\u01b4\7b\2\2\u01b3\u01b5\7c\2\2\u01b4\u01b3\3\2\2\2\u01b4\u01b5"+
		"\3\2\2\2\u01b5\u01b6\3\2\2\2\u01b6\u01ba\7d\2\2\u01b7\u01b8\7b\2\2\u01b8"+
		"\u01ba\b\32\1\2\u01b9\u01a1\3\2\2\2\u01b9\u01a8\3\2\2\2\u01b9\u01b2\3"+
		"\2\2\2\u01b9\u01b7\3\2\2\2\u01ba\63\3\2\2\2\u01bb\u01bf\5\66\34\2\u01bc"+
		"\u01bf\58\35\2\u01bd\u01bf\5:\36\2\u01be\u01bb\3\2\2\2\u01be\u01bc\3\2"+
		"\2\2\u01be\u01bd\3\2\2\2\u01bf\65\3\2\2\2\u01c0\u01c1\5\34\17\2\u01c1"+
		"\u01c2\7\7\2\2\u01c2\u01c4\3\2\2\2\u01c3\u01c0\3\2\2\2\u01c4\u01c5\3\2"+
		"\2\2\u01c5\u01c3\3\2\2\2\u01c5\u01c6\3\2\2\2\u01c6\67\3\2\2\2\u01c7\u01c8"+
		"\7\r\2\2\u01c8\u01ca\7\16\2\2\u01c9\u01cb\7k\2\2\u01ca\u01c9\3\2\2\2\u01ca"+
		"\u01cb\3\2\2\2\u01cb9\3\2\2\2\u01cc\u01ce\5n8\2\u01cd\u01cf\7t\2\2\u01ce"+
		"\u01cd\3\2\2\2\u01ce\u01cf\3\2\2\2\u01cf\u01d1\3\2\2\2\u01d0\u01d2\5\34"+
		"\17\2\u01d1\u01d0\3\2\2\2\u01d1\u01d2\3\2\2\2\u01d2\u01d4\3\2\2\2\u01d3"+
		"\u01d5\7t\2\2\u01d4\u01d3\3\2\2\2\u01d4\u01d5\3\2\2\2\u01d5\u01d6\3\2"+
		"\2\2\u01d6\u01d8\5n8\2\u01d7\u01d9\7t\2\2\u01d8\u01d7\3\2\2\2\u01d8\u01d9"+
		"\3\2\2\2\u01d9\u01da\3\2\2\2\u01da\u01db\5\u00d6l\2\u01db;\3\2\2\2\u01dc"+
		"\u01e1\5> \2\u01dd\u01de\7u\2\2\u01de\u01e0\7t\2\2\u01df\u01dd\3\2\2\2"+
		"\u01e0\u01e3\3\2\2\2\u01e1\u01df\3\2\2\2\u01e1\u01e2\3\2\2\2\u01e2\u01f2"+
		"\3\2\2\2\u01e3\u01e1\3\2\2\2\u01e4\u01e6\7t\2\2\u01e5\u01e4\3\2\2\2\u01e6"+
		"\u01e9\3\2\2\2\u01e7\u01e5\3\2\2\2\u01e7\u01e8\3\2\2\2\u01e8\u01ea\3\2"+
		"\2\2\u01e9\u01e7\3\2\2\2\u01ea\u01ee\7\7\2\2\u01eb\u01ed\7t\2\2\u01ec"+
		"\u01eb\3\2\2\2\u01ed\u01f0\3\2\2\2\u01ee\u01ec\3\2\2\2\u01ee\u01ef\3\2"+
		"\2\2\u01ef\u01f1\3\2\2\2\u01f0\u01ee\3\2\2\2\u01f1\u01f3\5<\37\2\u01f2"+
		"\u01e7\3\2\2\2\u01f2\u01f3\3\2\2\2\u01f3\u01f8\3\2\2\2\u01f4\u01f5\7u"+
		"\2\2\u01f5\u01f7\7t\2\2\u01f6\u01f4\3\2\2\2\u01f7\u01fa\3\2\2\2\u01f8"+
		"\u01f6\3\2\2\2\u01f8\u01f9\3\2\2\2\u01f9=\3\2\2\2\u01fa\u01f8\3\2\2\2"+
		"\u01fb\u020b\5@!\2\u01fc\u01fe\7t\2\2\u01fd\u01fc\3\2\2\2\u01fe\u0201"+
		"\3\2\2\2\u01ff\u01fd\3\2\2\2\u01ff\u0200\3\2\2\2\u0200\u0202\3\2\2\2\u0201"+
		"\u01ff\3\2\2\2\u0202\u0206\5\u0088E\2\u0203\u0205\7t\2\2\u0204\u0203\3"+
		"\2\2\2\u0205\u0208\3\2\2\2\u0206\u0204\3\2\2\2\u0206\u0207\3\2\2\2\u0207"+
		"\u0209\3\2\2\2\u0208\u0206\3\2\2\2\u0209\u020a\5> \2\u020a\u020c\3\2\2"+
		"\2\u020b\u01ff\3\2\2\2\u020b\u020c\3\2\2\2\u020c?\3\2\2\2\u020d\u022d"+
		"\5B\"\2\u020e\u0212\5B\"\2\u020f\u0211\7t\2\2\u0210\u020f\3\2\2\2\u0211"+
		"\u0214\3\2\2\2\u0212\u0210\3\2\2\2\u0212\u0213\3\2\2\2\u0213\u0215\3\2"+
		"\2\2\u0214\u0212\3\2\2\2\u0215\u0219\7\17\2\2\u0216\u0218\7t\2\2\u0217"+
		"\u0216\3\2\2\2\u0218\u021b\3\2\2\2\u0219\u0217\3\2\2\2\u0219\u021a\3\2"+
		"\2\2\u021a\u021c\3\2\2\2\u021b\u0219\3\2\2\2\u021c\u0220\5<\37\2\u021d"+
		"\u021f\7t\2\2\u021e\u021d\3\2\2\2\u021f\u0222\3\2\2\2\u0220\u021e\3\2"+
		"\2\2\u0220\u0221\3\2\2\2\u0221\u0223\3\2\2\2\u0222\u0220\3\2\2\2\u0223"+
		"\u0227\7\20\2\2\u0224\u0226\7t\2\2\u0225\u0224\3\2\2\2\u0226\u0229\3\2"+
		"\2\2\u0227\u0225\3\2\2\2\u0227\u0228\3\2\2\2\u0228\u022a\3\2\2\2\u0229"+
		"\u0227\3\2\2\2\u022a\u022b\5@!\2\u022b\u022d\3\2\2\2\u022c\u020d\3\2\2"+
		"\2\u022c\u020e\3\2\2\2\u022dA\3\2\2\2\u022e\u023d\5D#\2\u022f\u0231\7"+
		"t\2\2\u0230\u022f\3\2\2\2\u0231\u0234\3\2\2\2\u0232\u0230\3\2\2\2\u0232"+
		"\u0233\3\2\2\2\u0233\u0235\3\2\2\2\u0234\u0232\3\2\2\2\u0235\u0239\7\21"+
		"\2\2\u0236\u0238\7t\2\2\u0237\u0236\3\2\2\2\u0238\u023b\3\2\2\2\u0239"+
		"\u0237\3\2\2\2\u0239\u023a\3\2\2\2\u023a\u023c\3\2\2\2\u023b\u0239\3\2"+
		"\2\2\u023c\u023e\5B\"\2\u023d\u0232\3\2\2\2\u023d\u023e\3\2\2\2\u023e"+
		"C\3\2\2\2\u023f\u024e\5F$\2\u0240\u0242\7t\2\2\u0241\u0240\3\2\2\2\u0242"+
		"\u0245\3\2\2\2\u0243\u0241\3\2\2\2\u0243\u0244\3\2\2\2\u0244\u0246\3\2"+
		"\2\2\u0245\u0243\3\2\2\2\u0246\u024a\7\22\2\2\u0247\u0249\7t\2\2\u0248"+
		"\u0247\3\2\2\2\u0249\u024c\3\2\2\2\u024a\u0248\3\2\2\2\u024a\u024b\3\2"+
		"\2\2\u024b\u024d\3\2\2\2\u024c\u024a\3\2\2\2\u024d\u024f\5D#\2\u024e\u0243"+
		"\3\2\2\2\u024e\u024f\3\2\2\2\u024fE\3\2\2\2\u0250\u025f\5H%\2\u0251\u0253"+
		"\7t\2\2\u0252\u0251\3\2\2\2\u0253\u0256\3\2\2\2\u0254\u0252\3\2\2\2\u0254"+
		"\u0255\3\2\2\2\u0255\u0257\3\2\2\2\u0256\u0254\3\2\2\2\u0257\u025b\7\23"+
		"\2\2\u0258\u025a\7t\2\2\u0259\u0258\3\2\2\2\u025a\u025d\3\2\2\2\u025b"+
		"\u0259\3\2\2\2\u025b\u025c\3\2\2\2\u025c\u025e\3\2\2\2\u025d\u025b\3\2"+
		"\2\2\u025e\u0260\5F$\2\u025f\u0254\3\2\2\2\u025f\u0260\3\2\2\2\u0260G"+
		"\3\2\2\2\u0261\u0270\5J&\2\u0262\u0264\7t\2\2\u0263\u0262\3\2\2\2\u0264"+
		"\u0267\3\2\2\2\u0265\u0263\3\2\2\2\u0265\u0266\3\2\2\2\u0266\u0268\3\2"+
		"\2\2\u0267\u0265\3\2\2\2\u0268\u026c\7\24\2\2\u0269\u026b\7t\2\2\u026a"+
		"\u0269\3\2\2\2\u026b\u026e\3\2\2\2\u026c\u026a\3\2\2\2\u026c\u026d\3\2"+
		"\2\2\u026d\u026f\3\2\2\2\u026e\u026c\3\2\2\2\u026f\u0271\5H%\2\u0270\u0265"+
		"\3\2\2\2\u0270\u0271\3\2\2\2\u0271I\3\2\2\2\u0272\u0281\5L\'\2\u0273\u0275"+
		"\7t\2\2\u0274\u0273\3\2\2\2\u0275\u0278\3\2\2\2\u0276\u0274\3\2\2\2\u0276"+
		"\u0277\3\2\2\2\u0277\u0279\3\2\2\2\u0278\u0276\3\2\2\2\u0279\u027d\7\25"+
		"\2\2\u027a\u027c\7t\2\2\u027b\u027a\3\2\2\2\u027c\u027f\3\2\2\2\u027d"+
		"\u027b\3\2\2\2\u027d\u027e\3\2\2\2\u027e\u0280\3\2\2\2\u027f\u027d\3\2"+
		"\2\2\u0280\u0282\5J&\2\u0281\u0276\3\2\2\2\u0281\u0282\3\2\2\2\u0282K"+
		"\3\2\2\2\u0283\u0293\5N(\2\u0284\u0286\7t\2\2\u0285\u0284\3\2\2\2\u0286"+
		"\u0289\3\2\2\2\u0287\u0285\3\2\2\2\u0287\u0288\3\2\2\2\u0288\u028a\3\2"+
		"\2\2\u0289\u0287\3\2\2\2\u028a\u028e\5\u008aF\2\u028b\u028d\7t\2\2\u028c"+
		"\u028b\3\2\2\2\u028d\u0290\3\2\2\2\u028e\u028c\3\2\2\2\u028e\u028f\3\2"+
		"\2\2\u028f\u0291\3\2\2\2\u0290\u028e\3\2\2\2\u0291\u0292\5L\'\2\u0292"+
		"\u0294\3\2\2\2\u0293\u0287\3\2\2\2\u0293\u0294\3\2\2\2\u0294M\3\2\2\2"+
		"\u0295\u02a5\5P)\2\u0296\u0298\7t\2\2\u0297\u0296\3\2\2\2\u0298\u029b"+
		"\3\2\2\2\u0299\u0297\3\2\2\2\u0299\u029a\3\2\2\2\u029a\u029c\3\2\2\2\u029b"+
		"\u0299\3\2\2\2\u029c\u02a0\5|?\2\u029d\u029f\7t\2\2\u029e\u029d\3\2\2"+
		"\2\u029f\u02a2\3\2\2\2\u02a0\u029e\3\2\2\2\u02a0\u02a1\3\2\2\2\u02a1\u02a3"+
		"\3\2\2\2\u02a2\u02a0\3\2\2\2\u02a3\u02a4\5N(\2\u02a4\u02a6\3\2\2\2\u02a5"+
		"\u0299\3\2\2\2\u02a5\u02a6\3\2\2\2\u02a6O\3\2\2\2\u02a7\u02b6\5R*\2\u02a8"+
		"\u02aa\7t\2\2\u02a9\u02a8\3\2\2\2\u02aa\u02ad\3\2\2\2\u02ab\u02a9\3\2"+
		"\2\2\u02ab\u02ac\3\2\2\2\u02ac\u02ae\3\2\2\2\u02ad\u02ab\3\2\2\2\u02ae"+
		"\u02b2\t\3\2\2\u02af\u02b1\7t\2\2\u02b0\u02af\3\2\2\2\u02b1\u02b4\3\2"+
		"\2\2\u02b2\u02b0\3\2\2\2\u02b2\u02b3\3\2\2\2\u02b3\u02b5\3\2\2\2\u02b4"+
		"\u02b2\3\2\2\2\u02b5\u02b7\5P)\2\u02b6\u02ab\3\2\2\2\u02b6\u02b7\3\2\2"+
		"\2\u02b7Q\3\2\2\2\u02b8\u02c7\5T+\2\u02b9\u02bb\7t\2\2\u02ba\u02b9\3\2"+
		"\2\2\u02bb\u02be\3\2\2\2\u02bc\u02ba\3\2\2\2\u02bc\u02bd\3\2\2\2\u02bd"+
		"\u02bf\3\2\2\2\u02be\u02bc\3\2\2\2\u02bf\u02c3\t\4\2\2\u02c0\u02c2\7t"+
		"\2\2\u02c1\u02c0\3\2\2\2\u02c2\u02c5\3\2\2\2\u02c3\u02c1\3\2\2\2\u02c3"+
		"\u02c4\3\2\2\2\u02c4\u02c6\3\2\2\2\u02c5\u02c3\3\2\2\2\u02c6\u02c8\5R"+
		"*\2\u02c7\u02bc\3\2\2\2\u02c7\u02c8\3\2\2\2\u02c8S\3\2\2\2\u02c9\u02d8"+
		"\5V,\2\u02ca\u02cc\7t\2\2\u02cb\u02ca\3\2\2\2\u02cc\u02cf\3\2\2\2\u02cd"+
		"\u02cb\3\2\2\2\u02cd\u02ce\3\2\2\2\u02ce\u02d0\3\2\2\2\u02cf\u02cd\3\2"+
		"\2\2\u02d0\u02d4\t\5\2\2\u02d1\u02d3\7t\2\2\u02d2\u02d1\3\2\2\2\u02d3"+
		"\u02d6\3\2\2\2\u02d4\u02d2\3\2\2\2\u02d4\u02d5\3\2\2\2\u02d5\u02d7\3\2"+
		"\2\2\u02d6\u02d4\3\2\2\2\u02d7\u02d9\5T+\2\u02d8\u02cd\3\2\2\2\u02d8\u02d9"+
		"\3\2\2\2\u02d9U\3\2\2\2\u02da\u02db\7\4\2\2\u02db\u02dc\5X-\2\u02dc\u02dd"+
		"\7\5\2\2\u02dd\u02de\5V,\2\u02de\u02e1\3\2\2\2\u02df\u02e1\5Z.\2\u02e0"+
		"\u02da\3\2\2\2\u02e0\u02df\3\2\2\2\u02e1W\3\2\2\2\u02e2\u02ec\5\u00e4"+
		"s\2\u02e3\u02e5\7t\2\2\u02e4\u02e3\3\2\2\2\u02e5\u02e8\3\2\2\2\u02e6\u02e4"+
		"\3\2\2\2\u02e6\u02e7\3\2\2\2\u02e7\u02e9\3\2\2\2\u02e8\u02e6\3\2\2\2\u02e9"+
		"\u02eb\5\u0082B\2\u02ea\u02e6\3\2\2\2\u02eb\u02ee\3\2\2\2\u02ec\u02ea"+
		"\3\2\2\2\u02ec\u02ed\3\2\2\2\u02edY\3\2\2\2\u02ee\u02ec\3\2\2\2\u02ef"+
		"\u02f5\5^\60\2\u02f0\u02f5\5`\61\2\u02f1\u02f5\5\\/\2\u02f2\u02f5\5l\67"+
		"\2\u02f3\u02f5\5d\63\2\u02f4\u02ef\3\2\2\2\u02f4\u02f0\3\2\2\2\u02f4\u02f1"+
		"\3\2\2\2\u02f4\u02f2\3\2\2\2\u02f4\u02f3\3\2\2\2\u02f5[\3\2\2\2\u02f6"+
		"\u02f8\7\33\2\2\u02f7\u02f6\3\2\2\2\u02f7\u02f8\3\2\2\2\u02f8\u02f9\3"+
		"\2\2\2\u02f9\u02fd\7h\2\2\u02fa\u02fc\7t\2\2\u02fb\u02fa\3\2\2\2\u02fc"+
		"\u02ff\3\2\2\2\u02fd\u02fb\3\2\2\2\u02fd\u02fe\3\2\2\2\u02fe\u0300\3\2"+
		"\2\2\u02ff\u02fd\3\2\2\2\u0300\u0304\5\u00e4s\2\u0301\u0303\7t\2\2\u0302"+
		"\u0301\3\2\2\2\u0303\u0306\3\2\2\2\u0304\u0302\3\2\2\2\u0304\u0305\3\2"+
		"\2\2\u0305\u0307\3\2\2\2\u0306\u0304\3\2\2\2\u0307\u0309\7\34\2\2\u0308"+
		"\u030a\5@!\2\u0309\u0308\3\2\2\2\u0309\u030a\3\2\2\2\u030a\u030b\3\2\2"+
		"\2\u030b\u030c\7\35\2\2\u030c\u0325\3\2\2\2\u030d\u030f\7\33\2\2\u030e"+
		"\u030d\3\2\2\2\u030e\u030f\3\2\2\2\u030f\u0310\3\2\2\2\u0310\u0314\7h"+
		"\2\2\u0311\u0313\7t\2\2\u0312\u0311\3\2\2\2\u0313\u0316\3\2\2\2\u0314"+
		"\u0312\3\2\2\2\u0314\u0315\3\2\2\2\u0315\u0317\3\2\2\2\u0316\u0314\3\2"+
		"\2\2\u0317\u031b\5\u00e4s\2\u0318\u031a\7t\2\2\u0319\u0318\3\2\2\2\u031a"+
		"\u031d\3\2\2\2\u031b\u0319\3\2\2\2\u031b\u031c\3\2\2\2\u031c\u031e\3\2"+
		"\2\2\u031d\u031b\3\2\2\2\u031e\u0320\7\4\2\2\u031f\u0321\5<\37\2\u0320"+
		"\u031f\3\2\2\2\u0320\u0321\3\2\2\2\u0321\u0322\3\2\2\2\u0322\u0323\7\5"+
		"\2\2\u0323\u0325\3\2\2\2\u0324\u02f7\3\2\2\2\u0324\u030e\3\2\2\2\u0325"+
		"]\3\2\2\2\u0326\u032a\5z>\2\u0327\u0329\7t\2\2\u0328\u0327\3\2\2\2\u0329"+
		"\u032c\3\2\2\2\u032a\u0328\3\2\2\2\u032a\u032b\3\2\2\2\u032b\u032d\3\2"+
		"\2\2\u032c\u032a\3\2\2\2\u032d\u032e\5V,\2\u032e_\3\2\2\2\u032f\u0333"+
		"\5b\62\2\u0330\u0332\7t\2\2\u0331\u0330\3\2\2\2\u0332\u0335\3\2\2\2\u0333"+
		"\u0331\3\2\2\2\u0333\u0334\3\2\2\2\u0334\u0336\3\2\2\2\u0335\u0333\3\2"+
		"\2\2\u0336\u0337\7\4\2\2\u0337\u0338\5f\64\2\u0338\u0339\7\5\2\2\u0339"+
		"\u0344\3\2\2\2\u033a\u033e\5b\62\2\u033b\u033d\7t\2\2\u033c\u033b\3\2"+
		"\2\2\u033d\u0340\3\2\2\2\u033e\u033c\3\2\2\2\u033e\u033f\3\2\2\2\u033f"+
		"\u0341\3\2\2\2\u0340\u033e\3\2\2\2\u0341\u0342\5h\65\2\u0342\u0344\3\2"+
		"\2\2\u0343\u032f\3\2\2\2\u0343\u033a\3\2\2\2\u0344a\3\2\2\2\u0345\u0346"+
		"\7\36\2\2\u0346c\3\2\2\2\u0347\u034b\7\37\2\2\u0348\u034a\7t\2\2\u0349"+
		"\u0348\3\2\2\2\u034a\u034d\3\2\2\2\u034b\u0349\3\2\2\2\u034b\u034c\3\2"+
		"\2\2\u034c\u034e\3\2\2\2\u034d\u034b\3\2\2\2\u034e\u034f\7\4\2\2\u034f"+
		"\u0350\5<\37\2\u0350\u0351\7\5\2\2\u0351\u035b\3\2\2\2\u0352\u0356\7\37"+
		"\2\2\u0353\u0355\7t\2\2\u0354\u0353\3\2\2\2\u0355\u0358\3\2\2\2\u0356"+
		"\u0354\3\2\2\2\u0356\u0357\3\2\2\2\u0357\u0359\3\2\2\2\u0358\u0356\3\2"+
		"\2\2\u0359\u035b\5<\37\2\u035a\u0347\3\2\2\2\u035a\u0352\3\2\2\2\u035b"+
		"e\3\2\2\2\u035c\u0366\5\u00e4s\2\u035d\u035f\7t\2\2\u035e\u035d\3\2\2"+
		"\2\u035f\u0362\3\2\2\2\u0360\u035e\3\2\2\2\u0360\u0361\3\2\2\2\u0361\u0363"+
		"\3\2\2\2\u0362\u0360\3\2\2\2\u0363\u0365\5\u0082B\2\u0364\u0360\3\2\2"+
		"\2\u0365\u0368\3\2\2\2\u0366\u0364\3\2\2\2\u0366\u0367\3\2\2\2\u0367g"+
		"\3\2\2\2\u0368\u0366\3\2\2\2\u0369\u036a\5Z.\2\u036ai\3\2\2\2\u036b\u036c"+
		"\t\6\2\2\u036ck\3\2\2\2\u036d\u036e\b\67\1\2\u036e\u037f\5t;\2\u036f\u0371"+
		"\5\u0082B\2\u0370\u036f\3\2\2\2\u0370\u0371\3\2\2\2\u0371\u0372\3\2\2"+
		"\2\u0372\u0376\5j\66\2\u0373\u0375\7t\2\2\u0374\u0373\3\2\2\2\u0375\u0378"+
		"\3\2\2\2\u0376\u0374\3\2\2\2\u0376\u0377\3\2\2\2\u0377\u037a\3\2\2\2\u0378"+
		"\u0376\3\2\2\2\u0379\u037b\5\u0082B\2\u037a\u0379\3\2\2\2\u037a\u037b"+
		"\3\2\2\2\u037b\u037c\3\2\2\2\u037c\u037d\5t;\2\u037d\u037f\3\2\2\2\u037e"+
		"\u036d\3\2\2\2\u037e\u0370\3\2\2\2\u037f\u03b8\3\2\2\2\u0380\u0384\f\t"+
		"\2\2\u0381\u0383\7t\2\2\u0382\u0381\3\2\2\2\u0383\u0386\3\2\2\2\u0384"+
		"\u0382\3\2\2\2\u0384\u0385\3\2\2\2\u0385\u0387\3\2\2\2\u0386\u0384\3\2"+
		"\2\2\u0387\u0388\7\34\2\2\u0388\u0389\5<\37\2\u0389\u038a\7\35\2\2\u038a"+
		"\u03b7\3\2\2\2\u038b\u038f\f\b\2\2\u038c\u038e\7t\2\2\u038d\u038c\3\2"+
		"\2\2\u038e\u0391\3\2\2\2\u038f\u038d\3\2\2\2\u038f\u0390\3\2\2\2\u0390"+
		"\u0392\3\2\2\2\u0391\u038f\3\2\2\2\u0392\u0393\7\4\2\2\u0393\u0394\5p"+
		"9\2\u0394\u0395\7\5\2\2\u0395\u03b7\3\2\2\2\u0396\u0397\f\7\2\2\u0397"+
		"\u039b\7\n\2\2\u0398\u039a\7t\2\2\u0399\u0398\3\2\2\2\u039a\u039d\3\2"+
		"\2\2\u039b\u0399\3\2\2\2\u039b\u039c\3\2\2\2\u039c\u039f\3\2\2\2\u039d"+
		"\u039b\3\2\2\2\u039e\u03a0\7g\2\2\u039f\u039e\3\2\2\2\u039f\u03a0\3\2"+
		"\2\2\u03a0\u03a1\3\2\2\2\u03a1\u03b7\5\u00f2z\2\u03a2\u03a3\f\6\2\2\u03a3"+
		"\u03a7\7\"\2\2\u03a4\u03a6\7t\2\2\u03a5\u03a4\3\2\2\2\u03a6\u03a9\3\2"+
		"\2\2\u03a7\u03a5\3\2\2\2\u03a7\u03a8\3\2\2\2\u03a8\u03ab\3\2\2\2\u03a9"+
		"\u03a7\3\2\2\2\u03aa\u03ac\7g\2\2\u03ab\u03aa\3\2\2\2\u03ab\u03ac\3\2"+
		"\2\2\u03ac\u03ad\3\2\2\2\u03ad\u03b7\5\u00f2z\2\u03ae\u03b2\f\5\2\2\u03af"+
		"\u03b1\7t\2\2\u03b0\u03af\3\2\2\2\u03b1\u03b4\3\2\2\2\u03b2\u03b0\3\2"+
		"\2\2\u03b2\u03b3\3\2\2\2\u03b3\u03b5\3\2\2\2\u03b4\u03b2\3\2\2\2\u03b5"+
		"\u03b7\5j\66\2\u03b6\u0380\3\2\2\2\u03b6\u038b\3\2\2\2\u03b6\u0396\3\2"+
		"\2\2\u03b6\u03a2\3\2\2\2\u03b6\u03ae\3\2\2\2\u03b7\u03ba\3\2\2\2\u03b8"+
		"\u03b6\3\2\2\2\u03b8\u03b9\3\2\2\2\u03b9m\3\2\2\2\u03ba\u03b8\3\2\2\2"+
		"\u03bb\u03be\5\u00f2z\2\u03bc\u03be\5~@\2\u03bd\u03bb\3\2\2\2\u03bd\u03bc"+
		"\3\2\2\2\u03be\u03bf\3\2\2\2\u03bf\u03d0\7\4\2\2\u03c0\u03c2\7\7\2\2\u03c1"+
		"\u03c0\3\2\2\2\u03c1\u03c2\3\2\2\2\u03c2\u03c4\3\2\2\2\u03c3\u03c5\7M"+
		"\2\2\u03c4\u03c3\3\2\2\2\u03c4\u03c5\3\2\2\2\u03c5\u03c7\3\2\2\2\u03c6"+
		"\u03c8\5\u00e4s\2\u03c7\u03c6\3\2\2\2\u03c7\u03c8\3\2\2\2\u03c8\u03c9"+
		"\3\2\2\2\u03c9\u03cb\5\u00f2z\2\u03ca\u03c1\3\2\2\2\u03cb\u03cc\3\2\2"+
		"\2\u03cc\u03ca\3\2\2\2\u03cc\u03cd\3\2\2\2\u03cd\u03d1\3\2\2\2\u03ce\u03d1"+
		"\7I\2\2\u03cf\u03d1\5<\37\2\u03d0\u03ca\3\2\2\2\u03d0\u03ce\3\2\2\2\u03d0"+
		"\u03cf\3\2\2\2\u03d1\u03d3\3\2\2\2\u03d2\u03d4\7\31\2\2\u03d3\u03d2\3"+
		"\2\2\2\u03d3\u03d4\3\2\2\2\u03d4\u03d5\3\2\2\2\u03d5\u03d6\7\5\2\2\u03d6"+
		"o\3\2\2\2\u03d7\u03d9\5r:\2\u03d8\u03d7\3\2\2\2\u03d9\u03da\3\2\2\2\u03da"+
		"\u03d8\3\2\2\2\u03da\u03db\3\2\2\2\u03db\u03ea\3\2\2\2\u03dc\u03e0\7\7"+
		"\2\2\u03dd\u03df\7t\2\2\u03de\u03dd\3\2\2\2\u03df\u03e2\3\2\2\2\u03e0"+
		"\u03de\3\2\2\2\u03e0\u03e1\3\2\2\2\u03e1\u03e4\3\2\2\2\u03e2\u03e0\3\2"+
		"\2\2\u03e3\u03e5\5r:\2\u03e4\u03e3\3\2\2\2\u03e5\u03e6\3\2\2\2\u03e6\u03e4"+
		"\3\2\2\2\u03e6\u03e7\3\2\2\2\u03e7\u03e9\3\2\2\2\u03e8\u03dc\3\2\2\2\u03e9"+
		"\u03ec\3\2\2\2\u03ea\u03e8\3\2\2\2\u03ea\u03eb\3\2\2\2\u03eb\u03ee\3\2"+
		"\2\2\u03ec\u03ea\3\2\2\2\u03ed\u03d8\3\2\2\2\u03ed\u03ee\3\2\2\2\u03ee"+
		"q\3\2\2\2\u03ef\u03f3\5> \2\u03f0\u03f2\7t\2\2\u03f1\u03f0\3\2\2\2\u03f2"+
		"\u03f5\3\2\2\2\u03f3\u03f1\3\2\2\2\u03f3\u03f4\3\2\2\2\u03f4s\3\2\2\2"+
		"\u03f5\u03f3\3\2\2\2\u03f6\u03fd\5\u00f2z\2\u03f7\u03fd\5~@\2\u03f8\u03f9"+
		"\7\4\2\2\u03f9\u03fa\5<\37\2\u03fa\u03fb\7\5\2\2\u03fb\u03fd\3\2\2\2\u03fc"+
		"\u03f6\3\2\2\2\u03fc\u03f7\3\2\2\2\u03fc\u03f8\3\2\2\2\u03fdu\3\2\2\2"+
		"\u03fe\u03ff\7q\2\2\u03ffw\3\2\2\2\u0400\u0401\7t\2\2\u0401y\3\2\2\2\u0402"+
		"\u0403\t\7\2\2\u0403{\3\2\2\2\u0404\u0405\t\b\2\2\u0405}\3\2\2\2\u0406"+
		"\u0407\t\t\2\2\u0407\177\3\2\2\2\u0408\u0409\t\n\2\2\u0409\u0081\3\2\2"+
		"\2\u040a\u040b\t\13\2\2\u040b\u0083\3\2\2\2\u040c\u040d\t\f\2\2\u040d"+
		"\u0085\3\2\2\2\u040e\u0411\t\r\2\2\u040f\u0410\7\34\2\2\u0410\u0412\7"+
		"\35\2\2\u0411\u040f\3\2\2\2\u0411\u0412\3\2\2\2\u0412\u043c\3\2\2\2\u0413"+
		"\u043c\7\30\2\2\u0414\u043c\7\13\2\2\u0415\u043c\7\31\2\2\u0416\u043c"+
		"\7\f\2\2\u0417\u043c\7\32\2\2\u0418\u043c\7\24\2\2\u0419\u043c\7\25\2"+
		"\2\u041a\u043c\7\23\2\2\u041b\u043c\7#\2\2\u041c\u043c\7$\2\2\u041d\u043c"+
		"\7\6\2\2\u041e\u043c\7\b\2\2\u041f\u043c\7\t\2\2\u0420\u043c\7.\2\2\u0421"+
		"\u043c\7/\2\2\u0422\u043c\7\60\2\2\u0423\u043c\7\61\2\2\u0424\u043c\7"+
		"\62\2\2\u0425\u043c\7\63\2\2\u0426\u043c\7\64\2\2\u0427\u043c\7\65\2\2"+
		"\u0428\u043c\7\27\2\2\u0429\u043c\7\26\2\2\u042a\u043c\7\66\2\2\u042b"+
		"\u043c\7\67\2\2\u042c\u043c\78\2\2\u042d\u043c\79\2\2\u042e\u043c\7%\2"+
		"\2\u042f\u043c\7&\2\2\u0430\u043c\7\22\2\2\u0431\u043c\7\21\2\2\u0432"+
		"\u043c\7!\2\2\u0433\u043c\7 \2\2\u0434\u043c\7\7\2\2\u0435\u043c\7:\2"+
		"\2\u0436\u043c\7\"\2\2\u0437\u0438\7\4\2\2\u0438\u043c\7\5\2\2\u0439\u043a"+
		"\7\34\2\2\u043a\u043c\7\35\2\2\u043b\u040e\3\2\2\2\u043b\u0413\3\2\2\2"+
		"\u043b\u0414\3\2\2\2\u043b\u0415\3\2\2\2\u043b\u0416\3\2\2\2\u043b\u0417"+
		"\3\2\2\2\u043b\u0418\3\2\2\2\u043b\u0419\3\2\2\2\u043b\u041a\3\2\2\2\u043b"+
		"\u041b\3\2\2\2\u043b\u041c\3\2\2\2\u043b\u041d\3\2\2\2\u043b\u041e\3\2"+
		"\2\2\u043b\u041f\3\2\2\2\u043b\u0420\3\2\2\2\u043b\u0421\3\2\2\2\u043b"+
		"\u0422\3\2\2\2\u043b\u0423\3\2\2\2\u043b\u0424\3\2\2\2\u043b\u0425\3\2"+
		"\2\2\u043b\u0426\3\2\2\2\u043b\u0427\3\2\2\2\u043b\u0428\3\2\2\2\u043b"+
		"\u0429\3\2\2\2\u043b\u042a\3\2\2\2\u043b\u042b\3\2\2\2\u043b\u042c\3\2"+
		"\2\2\u043b\u042d\3\2\2\2\u043b\u042e\3\2\2\2\u043b\u042f\3\2\2\2\u043b"+
		"\u0430\3\2\2\2\u043b\u0431\3\2\2\2\u043b\u0432\3\2\2\2\u043b\u0433\3\2"+
		"\2\2\u043b\u0434\3\2\2\2\u043b\u0435\3\2\2\2\u043b\u0436\3\2\2\2\u043b"+
		"\u0437\3\2\2\2\u043b\u0439\3\2\2\2\u043c\u0087\3\2\2\2\u043d\u043e\t\16"+
		"\2\2\u043e\u0089\3\2\2\2\u043f\u0440\t\17\2\2\u0440\u008b\3\2\2\2\u0441"+
		"\u0442\7g\2\2\u0442\u0443\7\b\2\2\u0443\u0444\5\u008eH\2\u0444\u0445\7"+
		"\t\2\2\u0445\u008d\3\2\2\2\u0446\u0447\7\b\2\2\u0447\u0448\5\u008eH\2"+
		"\u0448\u0449\7\t\2\2\u0449\u0450\3\2\2\2\u044a\u044b\7\4\2\2\u044b\u044c"+
		"\5\u008eH\2\u044c\u044d\7\5\2\2\u044d\u0450\3\2\2\2\u044e\u0450\5\u0096"+
		"L\2\u044f\u0446\3\2\2\2\u044f\u044a\3\2\2\2\u044f\u044e\3\2\2\2\u0450"+
		"\u0451\3\2\2\2\u0451\u044f\3\2\2\2\u0451\u0452\3\2\2\2\u0452\u008f\3\2"+
		"\2\2\u0453\u0454\n\20\2\2\u0454\u0091\3\2\2\2\u0455\u0456\n\21\2\2\u0456"+
		"\u0093\3\2\2\2\u0457\u0458\n\22\2\2\u0458\u0095\3\2\2\2\u0459\u045a\n"+
		"\23\2\2\u045a\u0097\3\2\2\2\u045b\u045c\n\24\2\2\u045c\u0099\3\2\2\2\u045d"+
		"\u045e\n\25\2\2\u045e\u009b\3\2\2\2\u045f\u0460\n\26\2\2\u0460\u009d\3"+
		"\2\2\2\u0461\u0462\n\27\2\2\u0462\u009f\3\2\2\2\u0463\u0464\n\30\2\2\u0464"+
		"\u00a1\3\2\2\2\u0465\u0466\n\21\2\2\u0466\u00a3\3\2\2\2\u0467\u0468\13"+
		"\2\2\2\u0468\u00a5\3\2\2\2\u0469\u046b\5\u008cG\2\u046a\u0469\3\2\2\2"+
		"\u046a\u046b\3\2\2\2\u046b\u046f\3\2\2\2\u046c\u046e\7t\2\2\u046d\u046c"+
		"\3\2\2\2\u046e\u0471\3\2\2\2\u046f\u046d\3\2\2\2\u046f\u0470\3\2\2\2\u0470"+
		"\u0473\3\2\2\2\u0471\u046f\3\2\2\2\u0472\u0474\5\u00a8U\2\u0473\u0472"+
		"\3\2\2\2\u0473\u0474\3\2\2\2\u0474\u0478\3\2\2\2\u0475\u0477\7t\2\2\u0476"+
		"\u0475\3\2\2\2\u0477\u047a\3\2\2\2\u0478\u0476\3\2\2\2\u0478\u0479\3\2"+
		"\2\2\u0479\u047b\3\2\2\2\u047a\u0478\3\2\2\2\u047b\u047f\5\u00bc_\2\u047c"+
		"\u047e\7t\2\2\u047d\u047c\3\2\2\2\u047e\u0481\3\2\2\2\u047f\u047d\3\2"+
		"\2\2\u047f\u0480\3\2\2\2\u0480\u0482\3\2\2\2\u0481\u047f\3\2\2\2\u0482"+
		"\u0484\5\u00aaV\2\u0483\u0485\5\u00b4[\2\u0484\u0483\3\2\2\2\u0484\u0485"+
		"\3\2\2\2\u0485\u0486\3\2\2\2\u0486\u0487\5\u00b2Z\2\u0487\u00a7\3\2\2"+
		"\2\u0488\u048a\5\u0080A\2\u0489\u0488\3\2\2\2\u048a\u048d\3\2\2\2\u048b"+
		"\u0489\3\2\2\2\u048b\u048c\3\2\2\2\u048c\u0491\3\2\2\2\u048d\u048b\3\2"+
		"\2\2\u048e\u0490\7t\2\2\u048f\u048e\3\2\2\2\u0490\u0493\3\2\2\2\u0491"+
		"\u048f\3\2\2\2\u0491\u0492\3\2\2\2\u0492\u0494\3\2\2\2\u0493\u0491\3\2"+
		"\2\2\u0494\u0495\5\u00e4s\2\u0495\u0499\3\2\2\2\u0496\u0498\5\u0082B\2"+
		"\u0497\u0496\3\2\2\2\u0498\u049b\3\2\2\2\u0499\u0497\3\2\2\2\u0499\u049a"+
		"\3\2\2\2\u049a\u049e\3\2\2\2\u049b\u0499\3\2\2\2\u049c\u049e\5n8\2\u049d"+
		"\u048b\3\2\2\2\u049d\u049c\3\2\2\2\u049e\u00a9\3\2\2\2\u049f\u04a1\7\4"+
		"\2\2\u04a0\u04a2\5\u00acW\2\u04a1\u04a0\3\2\2\2\u04a1\u04a2\3\2\2\2\u04a2"+
		"\u04a3\3\2\2\2\u04a3\u04a7\7\5\2\2\u04a4\u04a6\7M\2\2\u04a5\u04a4\3\2"+
		"\2\2\u04a6\u04a9\3\2\2\2\u04a7\u04a5\3\2\2\2\u04a7\u04a8\3\2\2\2\u04a8"+
		"\u04ab\3\2\2\2\u04a9\u04a7\3\2\2\2\u04aa\u04ac\5\u00be`\2\u04ab\u04aa"+
		"\3\2\2\2\u04ab\u04ac\3\2\2\2\u04ac\u00ab\3\2\2\2\u04ad\u04b8\5\u00aeX"+
		"\2\u04ae\u04b2\7\7\2\2\u04af\u04b1\7t\2\2\u04b0\u04af\3\2\2\2\u04b1\u04b4"+
		"\3\2\2\2\u04b2\u04b0\3\2\2\2\u04b2\u04b3\3\2\2\2\u04b3\u04b5\3\2\2\2\u04b4"+
		"\u04b2\3\2\2\2\u04b5\u04b7\5\u00aeX\2\u04b6\u04ae\3\2\2\2\u04b7\u04ba"+
		"\3\2\2\2\u04b8\u04b6\3\2\2\2\u04b8\u04b9\3\2\2\2\u04b9\u04c3\3\2\2\2\u04ba"+
		"\u04b8\3\2\2\2\u04bb\u04bf\7\7\2\2\u04bc\u04be\7t\2\2\u04bd\u04bc\3\2"+
		"\2\2\u04be\u04c1\3\2\2\2\u04bf\u04bd\3\2\2\2\u04bf\u04c0\3\2\2\2\u04c0"+
		"\u04c2\3\2\2\2\u04c1\u04bf\3\2\2\2\u04c2\u04c4\7w\2\2\u04c3\u04bb\3\2"+
		"\2\2\u04c3\u04c4\3\2\2\2\u04c4\u00ad\3\2\2\2\u04c5\u04ca\7I\2\2\u04c6"+
		"\u04c7\5\u00e8u\2\u04c7\u04c8\5\u00b0Y\2\u04c8\u04ca\3\2\2\2\u04c9\u04c5"+
		"\3\2\2\2\u04c9\u04c6\3\2\2\2\u04ca\u00af\3\2\2\2\u04cb\u04cd\5\u00f6|"+
		"\2\u04cc\u04cb\3\2\2\2\u04cc\u04cd\3\2\2\2\u04cd\u04d3\3\2\2\2\u04ce\u04cf"+
		"\7\4\2\2\u04cf\u04d0\5\u00b0Y\2\u04d0\u04d1\7\5\2\2\u04d1\u04d4\3\2\2"+
		"\2\u04d2\u04d4\5\u00eav\2\u04d3\u04ce\3\2\2\2\u04d3\u04d2\3\2\2\2\u04d4"+
		"\u04d6\3\2\2\2\u04d5\u04d7\5\u00c8e\2\u04d6\u04d5\3\2\2\2\u04d6\u04d7"+
		"\3\2\2\2\u04d7\u00b1\3\2\2\2\u04d8\u04d9\7k\2\2\u04d9\u04da\bZ\1\2\u04da"+
		"\u00b3\3\2\2\2\u04db\u04dc\7\20\2\2\u04dc\u04e1\5\u00b6\\\2\u04dd\u04de"+
		"\7\7\2\2\u04de\u04e0\5\u00b6\\\2\u04df\u04dd\3\2\2\2\u04e0\u04e3\3\2\2"+
		"\2\u04e1\u04df\3\2\2\2\u04e1\u04e2\3\2\2\2\u04e2\u00b5\3\2\2\2\u04e3\u04e1"+
		"\3\2\2\2\u04e4\u04e5\5\u00b8]\2\u04e5\u04e6\5\u00ba^\2\u04e6\u00b7\3\2"+
		"\2\2\u04e7\u04e9\7\33\2\2\u04e8\u04e7\3\2\2\2\u04e8\u04e9\3\2\2\2\u04e9"+
		"\u04ea\3\2\2\2\u04ea\u04eb\5\u00f2z\2\u04eb\u00b9\3\2\2\2\u04ec\u04ee"+
		"\7\4\2\2\u04ed\u04ef\5<\37\2\u04ee\u04ed\3\2\2\2\u04ee\u04ef\3\2\2\2\u04ef"+
		"\u04f0\3\2\2\2\u04f0\u04f1\7\5\2\2\u04f1\u00bb\3\2\2\2\u04f2\u04f3\7\4"+
		"\2\2\u04f3\u04f4\5\u00bc_\2\u04f4\u04f5\7\5\2\2\u04f5\u04fa\3\2\2\2\u04f6"+
		"\u04fa\5\u00f2z\2\u04f7\u04f8\7f\2\2\u04f8\u04fa\5\u0086D\2\u04f9\u04f2"+
		"\3\2\2\2\u04f9\u04f6\3\2\2\2\u04f9\u04f7\3\2\2\2\u04fa\u00bd\3\2\2\2\u04fb"+
		"\u04fc\7Q\2\2\u04fc\u04fd\7\4\2\2\u04fd\u04fe\5\u00c0a\2\u04fe\u04ff\7"+
		"\5\2\2\u04ff\u00bf\3\2\2\2\u0500\u0502\5\u0090I\2\u0501\u0500\3\2\2\2"+
		"\u0502\u0505\3\2\2\2\u0503\u0501\3\2\2\2\u0503\u0504\3\2\2\2\u0504\u0511"+
		"\3\2\2\2\u0505\u0503\3\2\2\2\u0506\u0507\7\4\2\2\u0507\u0508\5\u00c0a"+
		"\2\u0508\u050c\7\5\2\2\u0509\u050b\5\u0090I\2\u050a\u0509\3\2\2\2\u050b"+
		"\u050e\3\2\2\2\u050c\u050a\3\2\2\2\u050c\u050d\3\2\2\2\u050d\u0510\3\2"+
		"\2\2\u050e\u050c\3\2\2\2\u050f\u0506\3\2\2\2\u0510\u0513\3\2\2\2\u0511"+
		"\u050f\3\2\2\2\u0511\u0512\3\2\2\2\u0512\u00c1\3\2\2\2\u0513\u0511\3\2"+
		"\2\2\u0514\u051c\5\u00c4c\2\u0515\u0517\7\4\2\2\u0516\u0518\5<\37\2\u0517"+
		"\u0516\3\2\2\2\u0517\u0518\3\2\2\2\u0518\u0519\3\2\2\2\u0519\u051d\7\5"+
		"\2\2\u051a\u051b\7\6\2\2\u051b\u051d\5\u00caf\2\u051c\u0515\3\2\2\2\u051c"+
		"\u051a\3\2\2\2\u051c\u051d\3\2\2\2\u051d\u00c3\3\2\2\2\u051e\u0520\5\u00f6"+
		"|\2\u051f\u051e\3\2\2\2\u051f\u0520\3\2\2\2\u0520\u0521\3\2\2\2\u0521"+
		"\u0523\5\u00f2z\2\u0522\u0524\5\u00c8e\2\u0523\u0522\3\2\2\2\u0523\u0524"+
		"\3\2\2\2\u0524\u0532\3\2\2\2\u0525\u0527\5\u00f6|\2\u0526\u0525\3\2\2"+
		"\2\u0526\u0527\3\2\2\2\u0527\u0528\3\2\2\2\u0528\u052a\7\4\2\2\u0529\u052b"+
		"\5\u00c6d\2\u052a\u0529\3\2\2\2\u052a\u052b\3\2\2\2\u052b\u052c\3\2\2"+
		"\2\u052c\u052d\5\u00f8}\2\u052d\u052e\5\u00f2z\2\u052e\u052f\7\5\2\2\u052f"+
		"\u0530\5\u00c8e\2\u0530\u0532\3\2\2\2\u0531\u051f\3\2\2\2\u0531\u0526"+
		"\3\2\2\2\u0532\u00c5\3\2\2\2\u0533\u0535\7j\2\2\u0534\u0533\3\2\2\2\u0535"+
		"\u0536\3\2\2\2\u0536\u0534\3\2\2\2\u0536\u0537\3\2\2\2\u0537\u00c7\3\2"+
		"\2\2\u0538\u0539\7\34\2\2\u0539\u053a\5\u00ceh\2\u053a\u053b\7\35\2\2"+
		"\u053b\u053e\3\2\2\2\u053c\u053e\5\u00ecw\2\u053d\u0538\3\2\2\2\u053d"+
		"\u053c\3\2\2\2\u053e\u00c9\3\2\2\2\u053f\u0541\5\u00a0Q\2\u0540\u053f"+
		"\3\2\2\2\u0541\u0544\3\2\2\2\u0542\u0540\3\2\2\2\u0542\u0543\3\2\2\2\u0543"+
		"\u055b\3\2\2\2\u0544\u0542\3\2\2\2\u0545\u0546\7k\2\2\u0546\u0547\5\u00cc"+
		"g\2\u0547\u0548\7l\2\2\u0548\u0552\3\2\2\2\u0549\u054a\7\4\2\2\u054a\u054b"+
		"\5\u00ccg\2\u054b\u054c\7\5\2\2\u054c\u0552\3\2\2\2\u054d\u054e\7\34\2"+
		"\2\u054e\u054f\5\u00ccg\2\u054f\u0550\7\35\2\2\u0550\u0552\3\2\2\2\u0551"+
		"\u0545\3\2\2\2\u0551\u0549\3\2\2\2\u0551\u054d\3\2\2\2\u0552\u0556\3\2"+
		"\2\2\u0553\u0555\5\u00a0Q\2\u0554\u0553\3\2\2\2\u0555\u0558\3\2\2\2\u0556"+
		"\u0554\3\2\2\2\u0556\u0557\3\2\2\2\u0557\u055a\3\2\2\2\u0558\u0556\3\2"+
		"\2\2\u0559\u0551\3\2\2\2\u055a\u055d\3\2\2\2\u055b\u0559\3\2\2\2\u055b"+
		"\u055c\3\2\2\2\u055c\u00cb\3\2\2\2\u055d\u055b\3\2\2\2\u055e\u0560\5\u00a2"+
		"R\2\u055f\u055e\3\2\2\2\u0560\u0563\3\2\2\2\u0561\u055f\3\2\2\2\u0561"+
		"\u0562\3\2\2\2\u0562\u057a\3\2\2\2\u0563\u0561\3\2\2\2\u0564\u0565\7k"+
		"\2\2\u0565\u0566\5\u00ccg\2\u0566\u0567\7l\2\2\u0567\u0571\3\2\2\2\u0568"+
		"\u0569\7\4\2\2\u0569\u056a\5\u00ccg\2\u056a\u056b\7\5\2\2\u056b\u0571"+
		"\3\2\2\2\u056c\u056d\7\34\2\2\u056d\u056e\5\u00ccg\2\u056e\u056f\7\35"+
		"\2\2\u056f\u0571\3\2\2\2\u0570\u0564\3\2\2\2\u0570\u0568\3\2\2\2\u0570"+
		"\u056c\3\2\2\2\u0571\u0575\3\2\2\2\u0572\u0574\5\u00a2R\2\u0573\u0572"+
		"\3\2\2\2\u0574\u0577\3\2\2\2\u0575\u0573\3\2\2\2\u0575\u0576\3\2\2\2\u0576"+
		"\u0579\3\2\2\2\u0577\u0575\3\2\2\2\u0578\u0570\3\2\2\2\u0579\u057c\3\2"+
		"\2\2\u057a\u0578\3\2\2\2\u057a\u057b\3\2\2\2\u057b\u00cd\3\2\2\2\u057c"+
		"\u057a\3\2\2\2\u057d\u057f\5\u009aN\2\u057e\u057d\3\2\2\2\u057f\u0582"+
		"\3\2\2\2\u0580\u057e\3\2\2\2\u0580\u0581\3\2\2\2\u0581\u058e\3\2\2\2\u0582"+
		"\u0580\3\2\2\2\u0583\u0584\7\34\2\2\u0584\u0585\5\u00ceh\2\u0585\u0589"+
		"\7\35\2\2\u0586\u0588\5\u009aN\2\u0587\u0586\3\2\2\2\u0588\u058b\3\2\2"+
		"\2\u0589\u0587\3\2\2\2\u0589\u058a\3\2\2\2\u058a\u058d\3\2\2\2\u058b\u0589"+
		"\3\2\2\2\u058c\u0583\3\2\2\2\u058d\u0590\3\2\2\2\u058e\u058c\3\2\2\2\u058e"+
		"\u058f\3\2\2\2\u058f\u00cf\3\2\2\2\u0590\u058e\3\2\2\2\u0591\u0592\5\u00d2"+
		"j\2\u0592\u00d1\3\2\2\2\u0593\u0595\7G\2\2\u0594\u0593\3\2\2\2\u0594\u0595"+
		"\3\2\2\2\u0595\u0597\3\2\2\2\u0596\u0598\5\u008cG\2\u0597\u0596\3\2\2"+
		"\2\u0597\u0598\3\2\2\2\u0598\u0599\3\2\2\2\u0599\u059b\5\u00dco\2\u059a"+
		"\u059c\7t\2\2\u059b\u059a\3\2\2\2\u059b\u059c\3\2\2\2\u059c\u059e\3\2"+
		"\2\2\u059d\u059f\5\u00d6l\2\u059e\u059d\3\2\2\2\u059e\u059f\3\2\2\2\u059f"+
		"\u05bd\3\2\2\2\u05a0\u05a2\7G\2\2\u05a1\u05a0\3\2\2\2\u05a1\u05a2\3\2"+
		"\2\2\u05a2\u05a4\3\2\2\2\u05a3\u05a5\5\u008cG\2\u05a4\u05a3\3\2\2\2\u05a4"+
		"\u05a5\3\2\2\2\u05a5\u05a7\3\2\2\2\u05a6\u05a8\7H\2\2\u05a7\u05a6\3\2"+
		"\2\2\u05a7\u05a8\3\2\2\2\u05a8\u05a9\3\2\2\2\u05a9\u05ab\5\u00e4s\2\u05aa"+
		"\u05ac\7t\2\2\u05ab\u05aa\3\2\2\2\u05ab\u05ac\3\2\2\2\u05ac\u05ad\3\2"+
		"\2\2\u05ad\u05ae\5\u00d6l\2\u05ae\u05bd\3\2\2\2\u05af\u05b1\7G\2\2\u05b0"+
		"\u05af\3\2\2\2\u05b0\u05b1\3\2\2\2\u05b1\u05b2\3\2\2\2\u05b2\u05b4\5\u00d4"+
		"k\2\u05b3\u05b5\7t\2\2\u05b4\u05b3\3\2\2\2\u05b4\u05b5\3\2\2\2\u05b5\u05b7"+
		"\3\2\2\2\u05b6\u05b8\5\u00d6l\2\u05b7\u05b6\3\2\2\2\u05b7\u05b8\3\2\2"+
		"\2\u05b8\u05ba\3\2\2\2\u05b9\u05bb\7\3\2\2\u05ba\u05b9\3\2\2\2\u05ba\u05bb"+
		"\3\2\2\2\u05bb\u05bd\3\2\2\2\u05bc\u0594\3\2\2\2\u05bc\u05a1\3\2\2\2\u05bc"+
		"\u05b0\3\2\2\2\u05bd\u00d3\3\2\2\2\u05be\u05c0\7V\2\2\u05bf\u05c1\5\u00f2"+
		"z\2\u05c0\u05bf\3\2\2\2\u05c0\u05c1\3\2\2\2\u05c1\u05c2\3\2\2\2\u05c2"+
		"\u05c3\7k\2\2\u05c3\u05c7\bk\1\2\u05c4\u05c5\7V\2\2\u05c5\u05c7\5\u00f2"+
		"z\2\u05c6\u05be\3\2\2\2\u05c6\u05c4\3\2\2\2\u05c7\u00d5\3\2\2\2\u05c8"+
		"\u05d0\5\u00c2b\2\u05c9\u05cb\7\7\2\2\u05ca\u05cc\7t\2\2\u05cb\u05ca\3"+
		"\2\2\2\u05cb\u05cc\3\2\2\2\u05cc\u05cd\3\2\2\2\u05cd\u05cf\5\u00c2b\2"+
		"\u05ce\u05c9\3\2\2\2\u05cf\u05d2\3\2\2\2\u05d0\u05ce\3\2\2\2\u05d0\u05d1"+
		"\3\2\2\2\u05d1\u05d3\3\2\2\2\u05d2\u05d0\3\2\2\2\u05d3\u05d4\7\3\2\2\u05d4"+
		"\u00d7\3\2\2\2\u05d5\u05dd\5> \2\u05d6\u05d7\7k\2\2\u05d7\u05d8\5\u00da"+
		"n\2\u05d8\u05d9\7l\2\2\u05d9\u05dd\3\2\2\2\u05da\u05db\7k\2\2\u05db\u05dd"+
		"\7l\2\2\u05dc\u05d5\3\2\2\2\u05dc\u05d6\3\2\2\2\u05dc\u05da\3\2\2\2\u05dd"+
		"\u00d9\3\2\2\2\u05de\u05e6\5\u00d8m\2\u05df\u05e1\7\7\2\2\u05e0\u05e2"+
		"\7t\2\2\u05e1\u05e0\3\2\2\2\u05e1\u05e2\3\2\2\2\u05e2\u05e3\3\2\2\2\u05e3"+
		"\u05e5\5\u00d8m\2\u05e4\u05df\3\2\2\2\u05e5\u05e8\3\2\2\2\u05e6\u05e4"+
		"\3\2\2\2\u05e6\u05e7\3\2\2\2\u05e7\u00db\3\2\2\2\u05e8\u05e6\3\2\2\2\u05e9"+
		"\u05eb\7i\2\2\u05ea\u05ec\5\u00dep\2\u05eb\u05ea\3\2\2\2\u05eb\u05ec\3"+
		"\2\2\2\u05ec\u05ee\3\2\2\2\u05ed\u05ef\5\u00e0q\2\u05ee\u05ed\3\2\2\2"+
		"\u05ee\u05ef\3\2\2\2\u05ef\u05f0\3\2\2\2\u05f0\u05f1\7k\2\2\u05f1\u05f2"+
		"\bo\1\2\u05f2\u00dd\3\2\2\2\u05f3\u05f4\5\u00f2z\2\u05f4\u00df\3\2\2\2"+
		"\u05f5\u05f6\7\20\2\2\u05f6\u05fb\5\u00e2r\2\u05f7\u05f8\7\7\2\2\u05f8"+
		"\u05fa\5\u00e2r\2\u05f9\u05f7\3\2\2\2\u05fa\u05fd\3\2\2\2\u05fb\u05f9"+
		"\3\2\2\2\u05fb\u05fc\3\2\2\2\u05fc\u00e1\3\2\2\2\u05fd\u05fb\3\2\2\2\u05fe"+
		"\u0600\7N\2\2\u05ff\u05fe\3\2\2\2\u05ff\u0600\3\2\2\2\u0600\u0602\3\2"+
		"\2\2\u0601\u0603\5\u0084C\2\u0602\u0601\3\2\2\2\u0602\u0603\3\2\2\2\u0603"+
		"\u0604\3\2\2\2\u0604\u0605\5\u00f2z\2\u0605\u00e3\3\2\2\2\u0606\u0608"+
		"\7M\2\2\u0607\u0606\3\2\2\2\u0608\u060b\3\2\2\2\u0609\u0607\3\2\2\2\u0609"+
		"\u060a\3\2\2\2\u060a\u060d\3\2\2\2\u060b\u0609\3\2\2\2\u060c\u060e\t\31"+
		"\2\2\u060d\u060c\3\2\2\2\u060d\u060e\3\2\2\2\u060e\u060f\3\2\2\2\u060f"+
		"\u0614\5\u00e6t\2\u0610\u0611\7\b\2\2\u0611\u0612\5\u008eH\2\u0612\u0613"+
		"\7\t\2\2\u0613\u0615\3\2\2\2\u0614\u0610\3\2\2\2\u0614\u0615\3\2\2\2\u0615"+
		"\u0620\3\2\2\2\u0616\u0617\7\33\2\2\u0617\u061c\5\u00e6t\2\u0618\u0619"+
		"\7\b\2\2\u0619\u061a\5\u008eH\2\u061a\u061b\7\t\2\2\u061b\u061d\3\2\2"+
		"\2\u061c\u0618\3\2\2\2\u061c\u061d\3\2\2\2\u061d\u061f\3\2\2\2\u061e\u0616"+
		"\3\2\2\2\u061f\u0622\3\2\2\2\u0620\u061e\3\2\2\2\u0620\u0621\3\2\2\2\u0621"+
		"\u0624\3\2\2\2\u0622\u0620\3\2\2\2\u0623\u0625\7M\2\2\u0624\u0623\3\2"+
		"\2\2\u0624\u0625\3\2\2\2\u0625\u062b\3\2\2\2\u0626\u062b\5n8\2\u0627\u062b"+
		"\7J\2\2\u0628\u062b\7K\2\2\u0629\u062b\7V\2\2\u062a\u0609\3\2\2\2\u062a"+
		"\u0626\3\2\2\2\u062a\u0627\3\2\2\2\u062a\u0628\3\2\2\2\u062a\u0629\3\2"+
		"\2\2\u062b\u00e5\3\2\2\2\u062c\u062e\t\32\2\2\u062d\u062c\3\2\2\2\u062e"+
		"\u062f\3\2\2\2\u062f\u062d\3\2\2\2\u062f\u0630\3\2\2\2\u0630\u00e7\3\2"+
		"\2\2\u0631\u0633\t\33\2\2\u0632\u0631\3\2\2\2\u0632\u0633\3\2\2\2\u0633"+
		"\u0634\3\2\2\2\u0634\u0635\5\u00e4s\2\u0635\u00e9\3\2\2\2\u0636\u0637"+
		"\5\u00f2z\2\u0637\u00eb\3\2\2\2\u0638\u063a\7\4\2\2\u0639\u063b\7t\2\2"+
		"\u063a\u0639\3\2\2\2\u063a\u063b\3\2\2\2\u063b\u063c\3\2\2\2\u063c\u063d"+
		"\7I\2\2\u063d\u0654\7\5\2\2\u063e\u0640\7\4\2\2\u063f\u0641\7t\2\2\u0640"+
		"\u063f\3\2\2\2\u0640\u0641\3\2\2\2\u0641\u0650\3\2\2\2\u0642\u0644\5\u00ee"+
		"x\2\u0643\u0645\7t\2\2\u0644\u0643\3\2\2\2\u0644\u0645\3\2\2\2\u0645\u064d"+
		"\3\2\2\2\u0646\u0648\7\7\2\2\u0647\u0649\7t\2\2\u0648\u0647\3\2\2\2\u0648"+
		"\u0649\3\2\2\2\u0649\u064a\3\2\2\2\u064a\u064c\5\u00eex\2\u064b\u0646"+
		"\3\2\2\2\u064c\u064f\3\2\2\2\u064d\u064b\3\2\2\2\u064d\u064e\3\2\2\2\u064e"+
		"\u0651\3\2\2\2\u064f\u064d\3\2\2\2\u0650\u0642\3\2\2\2\u0650\u0651\3\2"+
		"\2\2\u0651\u0652\3\2\2\2\u0652\u0654\7\5\2\2\u0653\u0638\3\2\2\2\u0653"+
		"\u063e\3\2\2\2\u0654\u00ed\3\2\2\2\u0655\u0656\5\u00e8u\2\u0656\u0657"+
		"\5\u00f0y\2\u0657\u00ef\3\2\2\2\u0658\u065a\5\u00f6|\2\u0659\u0658\3\2"+
		"\2\2\u0659\u065a\3\2\2\2\u065a\u0668\3\2\2\2\u065b\u065d\7\4\2\2\u065c"+
		"\u065e\7t\2\2\u065d\u065c\3\2\2\2\u065d\u065e\3\2\2\2\u065e\u065f\3\2"+
		"\2\2\u065f\u0661\5\u00f0y\2\u0660\u0662\7t\2\2\u0661\u0660\3\2\2\2\u0661"+
		"\u0662\3\2\2\2\u0662\u0663\3\2\2\2\u0663\u0664\7\5\2\2\u0664\u0669\3\2"+
		"\2\2\u0665\u0667\5\u00eav\2\u0666\u0665\3\2\2\2\u0666\u0667\3\2\2\2\u0667"+
		"\u0669\3\2\2\2\u0668\u065b\3\2\2\2\u0668\u0666\3\2\2\2\u0669\u066b\3\2"+
		"\2\2\u066a\u066c\5\u00c8e\2\u066b\u066a\3\2\2\2\u066b\u066c\3\2\2\2\u066c"+
		"\u00f1\3\2\2\2\u066d\u0672\7j\2\2\u066e\u066f\7\33\2\2\u066f\u0671\7j"+
		"\2\2\u0670\u066e\3\2\2\2\u0671\u0674\3\2\2\2\u0672\u0670\3\2\2\2\u0672"+
		"\u0673\3\2\2\2\u0673\u0677\3\2\2\2\u0674\u0672\3\2\2\2\u0675\u0677\5\u0084"+
		"C\2\u0676\u066d\3\2\2\2\u0676\u0675\3\2\2\2\u0677\u00f3\3\2\2\2\u0678"+
		"\u0679\t\34\2\2\u0679\u00f5\3\2\2\2\u067a\u067c\5\u0082B\2\u067b\u067d"+
		"\7;\2\2\u067c\u067b\3\2\2\2\u067c\u067d\3\2\2\2\u067d\u067f\3\2\2\2\u067e"+
		"\u067a\3\2\2\2\u067f\u0680\3\2\2\2\u0680\u067e\3\2\2\2\u0680\u0681\3\2"+
		"\2\2\u0681\u00f7\3\2\2\2\u0682\u0683\5\u00f6|\2\u0683\u00f9\3\2\2\2\u00e5"+
		"\u0101\u0103\u010d\u0113\u0126\u012e\u0135\u013a\u0144\u0153\u015c\u0161"+
		"\u0165\u016d\u0171\u0179\u0181\u018d\u018f\u019f\u01a3\u01aa\u01b0\u01b4"+
		"\u01b9\u01be\u01c5\u01ca\u01ce\u01d1\u01d4\u01d8\u01e1\u01e7\u01ee\u01f2"+
		"\u01f8\u01ff\u0206\u020b\u0212\u0219\u0220\u0227\u022c\u0232\u0239\u023d"+
		"\u0243\u024a\u024e\u0254\u025b\u025f\u0265\u026c\u0270\u0276\u027d\u0281"+
		"\u0287\u028e\u0293\u0299\u02a0\u02a5\u02ab\u02b2\u02b6\u02bc\u02c3\u02c7"+
		"\u02cd\u02d4\u02d8\u02e0\u02e6\u02ec\u02f4\u02f7\u02fd\u0304\u0309\u030e"+
		"\u0314\u031b\u0320\u0324\u032a\u0333\u033e\u0343\u034b\u0356\u035a\u0360"+
		"\u0366\u0370\u0376\u037a\u037e\u0384\u038f\u039b\u039f\u03a7\u03ab\u03b2"+
		"\u03b6\u03b8\u03bd\u03c1\u03c4\u03c7\u03cc\u03d0\u03d3\u03da\u03e0\u03e6"+
		"\u03ea\u03ed\u03f3\u03fc\u0411\u043b\u044f\u0451\u046a\u046f\u0473\u0478"+
		"\u047f\u0484\u048b\u0491\u0499\u049d\u04a1\u04a7\u04ab\u04b2\u04b8\u04bf"+
		"\u04c3\u04c9\u04cc\u04d3\u04d6\u04e1\u04e8\u04ee\u04f9\u0503\u050c\u0511"+
		"\u0517\u051c\u051f\u0523\u0526\u052a\u0531\u0536\u053d\u0542\u0551\u0556"+
		"\u055b\u0561\u0570\u0575\u057a\u0580\u0589\u058e\u0594\u0597\u059b\u059e"+
		"\u05a1\u05a4\u05a7\u05ab\u05b0\u05b4\u05b7\u05ba\u05bc\u05c0\u05c6\u05cb"+
		"\u05d0\u05dc\u05e1\u05e6\u05eb\u05ee\u05fb\u05ff\u0602\u0609\u060d\u0614"+
		"\u061c\u0620\u0624\u062a\u062f\u0632\u063a\u0640\u0644\u0648\u064d\u0650"+
		"\u0653\u0659\u065d\u0661\u0666\u0668\u066b\u0672\u0676\u067c\u0680";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}