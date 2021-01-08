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
		T__52=53, T__53=54, T__54=55, T__55=56, T__56=57, T__57=58, T__58=59, 
		T__59=60, T__60=61, T__61=62, T__62=63, T__63=64, NEWLINE=65, ESCAPE=66, 
		ELLIPSIS=67, IF=68, ELSE=69, FOR=70, WHILE=71, BREAK=72, CASE=73, CONTINUE=74, 
		SWITCH=75, DO=76, GOTO=77, RETURN=78, TYPEDEF=79, STATIC=80, VOID=81, 
		UNSIGNED=82, SIGNED=83, CV_QUALIFIER=84, EXTERN=85, VIRTUAL=86, TRY=87, 
		CATCH=88, THROW=89, USING=90, NAMESPACE=91, AUTO=92, REGISTER=93, SPECIAL_DATA=94, 
		OPERATOR=95, TEMPLATE=96, CLASS_KEY=97, NEW=98, PRE_IF=99, PRE_ELIF=100, 
		PRE_ELSE=101, PRE_ENDIF=102, PRE_DEFINE=103, PRE_UNDEF=104, PRE_DIAGNOSTIC=105, 
		PRE_OTHER=106, PRE_INCLUDE=107, PRE_INCLUDE_NEXT=108, PRE_LINE=109, PRE_PRAGMA=110, 
		PRE_GCC=111, PRE_PRAGMA_KEYWORDS=112, PRE_STR=113, PRE_ATTRIBUTE=114, 
		END_TEST=115, ALPHA_NUMERIC=116, OPENING_CURLY=117, CLOSING_CURLY=118, 
		HEX_LITERAL=119, DECIMAL_LITERAL=120, OCTAL_LITERAL=121, FLOATING_POINT_LITERAL=122, 
		COMMENT=123, CHAR=124, STRING=125, WHITESPACE=126, OTHER=127;
	public static final int
		RULE_code = 0, RULE_using_directive = 1, RULE_pre_statement = 2, RULE_pre_blockstarter = 3, 
		RULE_pre_if_statement = 4, RULE_pre_elif_statement = 5, RULE_pre_else_statement = 6, 
		RULE_pre_endif_statement = 7, RULE_pre_if_condition = 8, RULE_condition = 9, 
		RULE_pre_command = 10, RULE_pre_define = 11, RULE_pre_undef = 12, RULE_pre_macro_identifier = 13, 
		RULE_keyword = 14, RULE_pre_macro_parameters = 15, RULE_pre_macro = 16, 
		RULE_macroCall = 17, RULE_pre_diagnostic = 18, RULE_pre_other = 19, RULE_attributeList = 20, 
		RULE_attribute = 21, RULE_pre_include = 22, RULE_pre_include_next = 23, 
		RULE_pre_include_local_file = 24, RULE_pre_include_filename = 25, RULE_pre_line = 26, 
		RULE_pre_pragma = 27, RULE_comment = 28, RULE_newline = 29, RULE_unary_operator = 30, 
		RULE_relational_operator = 31, RULE_constant = 32, RULE_function_decl_specifiers = 33, 
		RULE_ptr_operator = 34, RULE_access_specifier = 35, RULE_operator = 36, 
		RULE_assignment_operator = 37, RULE_equality_operator = 38, RULE_template_decl_start = 39, 
		RULE_template_param_list = 40, RULE_no_brackets = 41, RULE_no_brackets_curlies_or_squares = 42, 
		RULE_no_brackets_or_semicolon = 43, RULE_no_angle_brackets_or_brackets = 44, 
		RULE_no_curlies = 45, RULE_no_squares = 46, RULE_no_squares_or_semicolon = 47, 
		RULE_no_comma_or_semicolon = 48, RULE_assign_water = 49, RULE_assign_water_l2 = 50, 
		RULE_water = 51, RULE_custom = 52, RULE_asciiTab = 53, RULE_externC = 54, 
		RULE_macroFunctionPointer = 55, RULE_testStart = 56, RULE_testEnd = 57, 
		RULE_function_def = 58, RULE_macroCall_asFunctionHeader = 59, RULE_return_type = 60, 
		RULE_function_param_list = 61, RULE_parameter_decl_clause = 62, RULE_parameter_decl = 63, 
		RULE_parameter_id = 64, RULE_compound_statement = 65, RULE_ctor_list = 66, 
		RULE_ctor_initializer = 67, RULE_initializer_id = 68, RULE_ctor_expr = 69, 
		RULE_function_name = 70, RULE_exception_specification = 71, RULE_type_id_list = 72, 
		RULE_simple_decl = 73, RULE_var_decl = 74, RULE_callingConvention = 75, 
		RULE_special_datatype = 76, RULE_init_declarator_list = 77, RULE_class_def = 78, 
		RULE_class_name = 79, RULE_base_classes = 80, RULE_base_class = 81, RULE_type_name = 82, 
		RULE_base_type = 83, RULE_param_decl_specifiers = 84, RULE_parameter_name = 85, 
		RULE_param_type_list = 86, RULE_param_type = 87, RULE_param_type_id = 88, 
		RULE_identifier = 89, RULE_number = 90, RULE_ptrs = 91, RULE_func_ptrs = 92, 
		RULE_expr = 93, RULE_assign_expr = 94, RULE_conditional_expression = 95, 
		RULE_or_expression = 96, RULE_and_expression = 97, RULE_inclusive_or_expression = 98, 
		RULE_exclusive_or_expression = 99, RULE_bit_and_expression = 100, RULE_equality_expression = 101, 
		RULE_relational_expression = 102, RULE_shift_expression = 103, RULE_additive_expression = 104, 
		RULE_multiplicative_expression = 105, RULE_function_pointer_use_expression = 106, 
		RULE_cast_expression = 107, RULE_cast_target = 108, RULE_unary_expression = 109, 
		RULE_address_of_expression = 110, RULE_new_expression = 111, RULE_unary_op_and_cast_expr = 112, 
		RULE_sizeof_expression = 113, RULE_sizeof = 114, RULE_defined_expression = 115, 
		RULE_sizeof_operand = 116, RULE_sizeof_operand2 = 117, RULE_inc_dec = 118, 
		RULE_postfix_expression = 119, RULE_initializer_expression = 120, RULE_argument_list = 121, 
		RULE_argument = 122, RULE_primary_expression = 123, RULE_null_expression = 124, 
		RULE_init_declarator = 125, RULE_declarator = 126, RULE_type_suffix = 127, 
		RULE_assign_expr_w_ = 128, RULE_assign_expr_w__l2 = 129, RULE_constant_expr_w_ = 130;
	public static final String[] ruleNames = {
		"code", "using_directive", "pre_statement", "pre_blockstarter", "pre_if_statement", 
		"pre_elif_statement", "pre_else_statement", "pre_endif_statement", "pre_if_condition", 
		"condition", "pre_command", "pre_define", "pre_undef", "pre_macro_identifier", 
		"keyword", "pre_macro_parameters", "pre_macro", "macroCall", "pre_diagnostic", 
		"pre_other", "attributeList", "attribute", "pre_include", "pre_include_next", 
		"pre_include_local_file", "pre_include_filename", "pre_line", "pre_pragma", 
		"comment", "newline", "unary_operator", "relational_operator", "constant", 
		"function_decl_specifiers", "ptr_operator", "access_specifier", "operator", 
		"assignment_operator", "equality_operator", "template_decl_start", "template_param_list", 
		"no_brackets", "no_brackets_curlies_or_squares", "no_brackets_or_semicolon", 
		"no_angle_brackets_or_brackets", "no_curlies", "no_squares", "no_squares_or_semicolon", 
		"no_comma_or_semicolon", "assign_water", "assign_water_l2", "water", "custom", 
		"asciiTab", "externC", "macroFunctionPointer", "testStart", "testEnd", 
		"function_def", "macroCall_asFunctionHeader", "return_type", "function_param_list", 
		"parameter_decl_clause", "parameter_decl", "parameter_id", "compound_statement", 
		"ctor_list", "ctor_initializer", "initializer_id", "ctor_expr", "function_name", 
		"exception_specification", "type_id_list", "simple_decl", "var_decl", 
		"callingConvention", "special_datatype", "init_declarator_list", "class_def", 
		"class_name", "base_classes", "base_class", "type_name", "base_type", 
		"param_decl_specifiers", "parameter_name", "param_type_list", "param_type", 
		"param_type_id", "identifier", "number", "ptrs", "func_ptrs", "expr", 
		"assign_expr", "conditional_expression", "or_expression", "and_expression", 
		"inclusive_or_expression", "exclusive_or_expression", "bit_and_expression", 
		"equality_expression", "relational_expression", "shift_expression", "additive_expression", 
		"multiplicative_expression", "function_pointer_use_expression", "cast_expression", 
		"cast_target", "unary_expression", "address_of_expression", "new_expression", 
		"unary_op_and_cast_expr", "sizeof_expression", "sizeof", "defined_expression", 
		"sizeof_operand", "sizeof_operand2", "inc_dec", "postfix_expression", 
		"initializer_expression", "argument_list", "argument", "primary_expression", 
		"null_expression", "init_declarator", "declarator", "type_suffix", "assign_expr_w_", 
		"assign_expr_w__l2", "constant_expr_w_"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "'('", "')'", "'='", "'START_TEST'", "'inline'", "'explicit'", 
		"'friend'", "'public'", "'private'", "'protected'", "'long'", "','", "'_GL_ATTRIBUTE_PURE'", 
		"'_GL_INLINE_HEADER_BEGIN'", "'_GL_INLINE_HEADER_END'", "'_GL_ATTRIBUTE_FORMAT_PRINTF_STANDARD'", 
		"'&'", "'*'", "'+'", "'-'", "'~'", "'!'", "'<'", "'>'", "'<='", "'>='", 
		"'delete'", "'['", "']'", "'/'", "'%'", "'^'", "'|'", "'+='", "'-='", 
		"'*='", "'/='", "'%='", "'^='", "'&='", "'|='", "'>>'", "'<<'", "'>>='", 
		"'<<='", "'=='", "'!='", "'&&'", "'||'", "'++'", "'--'", "'->*'", "'->'", 
		"'\"C\"'", "':'", "'::'", "'char'", "'int'", "'restrict'", "'?'", "'sizeof'", 
		"'defined'", "'.'", null, "'\\'", "'...'", "'if'", "'else'", "'for'", 
		"'while'", "'break'", "'case'", "'continue'", "'switch'", "'do'", "'goto'", 
		"'return'", "'typedef'", "'static'", "'void'", "'unsigned'", "'signed'", 
		null, "'extern'", "'virtual'", "'try'", "'catch'", "'throw'", "'using'", 
		"'namespace'", "'auto'", "'register'", null, "'operator'", "'template'", 
		"'class'", "'new'", null, null, null, null, null, null, null, null, null, 
		null, null, null, "'GCC'", null, null, null, "'END_TEST'", null, "'{'", 
		"'}'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, "NEWLINE", "ESCAPE", "ELLIPSIS", "IF", "ELSE", 
		"FOR", "WHILE", "BREAK", "CASE", "CONTINUE", "SWITCH", "DO", "GOTO", "RETURN", 
		"TYPEDEF", "STATIC", "VOID", "UNSIGNED", "SIGNED", "CV_QUALIFIER", "EXTERN", 
		"VIRTUAL", "TRY", "CATCH", "THROW", "USING", "NAMESPACE", "AUTO", "REGISTER", 
		"SPECIAL_DATA", "OPERATOR", "TEMPLATE", "CLASS_KEY", "NEW", "PRE_IF", 
		"PRE_ELIF", "PRE_ELSE", "PRE_ENDIF", "PRE_DEFINE", "PRE_UNDEF", "PRE_DIAGNOSTIC", 
		"PRE_OTHER", "PRE_INCLUDE", "PRE_INCLUDE_NEXT", "PRE_LINE", "PRE_PRAGMA", 
		"PRE_GCC", "PRE_PRAGMA_KEYWORDS", "PRE_STR", "PRE_ATTRIBUTE", "END_TEST", 
		"ALPHA_NUMERIC", "OPENING_CURLY", "CLOSING_CURLY", "HEX_LITERAL", "DECIMAL_LITERAL", 
		"OCTAL_LITERAL", "FLOATING_POINT_LITERAL", "COMMENT", "CHAR", "STRING", 
		"WHITESPACE", "OTHER"
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
				//Check for newline and END_TEST
				if(_input.LA(1) == NEWLINE &&  _input.LA(2) == END_TEST){
				    //Parse both
				    consume();
				    consume();
				}
			}

			return true;
		}
	            
	       // this should go into FunctionGrammar but ANTLR fails
	       // to join the parser::members-section on inclusion
	       
	       //Find the closing #endif to the opening #if (and then return true), consume everything that is in between
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
	                
	                   //Count escape and newline characters                   
	                  if(t == ESCAPE){
	                        slashStack.push(o);
	                  } else if(t == NEWLINE) {
	                        slashStack.pop();
	                  } 
	                  
	                  //Consume and return the current symbol, the consumed symbol is added to the parse tree 
	                  consume();                   
	                  //Move cursor to next symbol
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
		public List<CustomContext> custom() {
			return getRuleContexts(CustomContext.class);
		}
		public CustomContext custom(int i) {
			return getRuleContext(CustomContext.class,i);
		}
		public List<Pre_statementContext> pre_statement() {
			return getRuleContexts(Pre_statementContext.class);
		}
		public Pre_statementContext pre_statement(int i) {
			return getRuleContext(Pre_statementContext.class,i);
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
		public List<Null_expressionContext> null_expression() {
			return getRuleContexts(Null_expressionContext.class);
		}
		public Null_expressionContext null_expression(int i) {
			return getRuleContext(Null_expressionContext.class,i);
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
			setState(272);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (NEWLINE - 64)) | (1L << (ESCAPE - 64)) | (1L << (ELLIPSIS - 64)) | (1L << (IF - 64)) | (1L << (ELSE - 64)) | (1L << (FOR - 64)) | (1L << (WHILE - 64)) | (1L << (BREAK - 64)) | (1L << (CASE - 64)) | (1L << (CONTINUE - 64)) | (1L << (SWITCH - 64)) | (1L << (DO - 64)) | (1L << (GOTO - 64)) | (1L << (RETURN - 64)) | (1L << (TYPEDEF - 64)) | (1L << (STATIC - 64)) | (1L << (VOID - 64)) | (1L << (UNSIGNED - 64)) | (1L << (SIGNED - 64)) | (1L << (CV_QUALIFIER - 64)) | (1L << (EXTERN - 64)) | (1L << (VIRTUAL - 64)) | (1L << (TRY - 64)) | (1L << (CATCH - 64)) | (1L << (THROW - 64)) | (1L << (USING - 64)) | (1L << (NAMESPACE - 64)) | (1L << (AUTO - 64)) | (1L << (REGISTER - 64)) | (1L << (SPECIAL_DATA - 64)) | (1L << (OPERATOR - 64)) | (1L << (TEMPLATE - 64)) | (1L << (CLASS_KEY - 64)) | (1L << (NEW - 64)) | (1L << (PRE_IF - 64)) | (1L << (PRE_ELIF - 64)) | (1L << (PRE_ELSE - 64)) | (1L << (PRE_ENDIF - 64)) | (1L << (PRE_DEFINE - 64)) | (1L << (PRE_UNDEF - 64)) | (1L << (PRE_DIAGNOSTIC - 64)) | (1L << (PRE_OTHER - 64)) | (1L << (PRE_INCLUDE - 64)) | (1L << (PRE_INCLUDE_NEXT - 64)) | (1L << (PRE_LINE - 64)) | (1L << (PRE_PRAGMA - 64)) | (1L << (PRE_GCC - 64)) | (1L << (PRE_PRAGMA_KEYWORDS - 64)) | (1L << (PRE_STR - 64)) | (1L << (PRE_ATTRIBUTE - 64)) | (1L << (END_TEST - 64)) | (1L << (ALPHA_NUMERIC - 64)) | (1L << (OPENING_CURLY - 64)) | (1L << (CLOSING_CURLY - 64)) | (1L << (HEX_LITERAL - 64)) | (1L << (DECIMAL_LITERAL - 64)) | (1L << (OCTAL_LITERAL - 64)) | (1L << (FLOATING_POINT_LITERAL - 64)) | (1L << (COMMENT - 64)) | (1L << (CHAR - 64)) | (1L << (STRING - 64)) | (1L << (WHITESPACE - 64)) | (1L << (OTHER - 64)))) != 0)) {
				{
				setState(270);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(262);
					function_def();
					}
					break;
				case 2:
					{
					setState(263);
					simple_decl();
					}
					break;
				case 3:
					{
					setState(264);
					custom();
					}
					break;
				case 4:
					{
					setState(265);
					pre_statement();
					}
					break;
				case 5:
					{
					setState(266);
					using_directive();
					}
					break;
				case 6:
					{
					setState(267);
					comment();
					}
					break;
				case 7:
					{
					setState(268);
					null_expression();
					}
					break;
				case 8:
					{
					setState(269);
					water();
					}
					break;
				}
				}
				setState(274);
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
			setState(275);
			match(USING);
			setState(276);
			match(NAMESPACE);
			setState(277);
			identifier();
			setState(278);
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
			setState(282);
			switch (_input.LA(1)) {
			case PRE_IF:
			case PRE_ELIF:
			case PRE_ELSE:
			case PRE_ENDIF:
				enterOuterAlt(_localctx, 1);
				{
				setState(280);
				pre_blockstarter();
				}
				break;
			case T__4:
			case T__5:
			case T__6:
			case T__7:
			case T__8:
			case T__9:
			case T__10:
			case T__11:
			case T__13:
			case T__14:
			case T__15:
			case T__16:
			case STATIC:
			case UNSIGNED:
			case SIGNED:
			case VIRTUAL:
			case OPERATOR:
			case CLASS_KEY:
			case NEW:
			case PRE_DEFINE:
			case PRE_UNDEF:
			case PRE_DIAGNOSTIC:
			case PRE_OTHER:
			case PRE_INCLUDE:
			case PRE_INCLUDE_NEXT:
			case PRE_LINE:
			case PRE_PRAGMA:
			case PRE_PRAGMA_KEYWORDS:
			case PRE_ATTRIBUTE:
			case END_TEST:
			case ALPHA_NUMERIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(281);
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
			setState(288);
			switch (_input.LA(1)) {
			case PRE_IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(284);
				pre_if_statement();
				}
				break;
			case PRE_ELIF:
				enterOuterAlt(_localctx, 2);
				{
				setState(285);
				pre_elif_statement();
				}
				break;
			case PRE_ELSE:
				enterOuterAlt(_localctx, 3);
				{
				setState(286);
				pre_else_statement();
				}
				break;
			case PRE_ENDIF:
				enterOuterAlt(_localctx, 4);
				{
				setState(287);
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
			setState(290);
			match(PRE_IF);
			setState(291);
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
			setState(294);
			match(PRE_ELIF);
			setState(295);
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
			setState(298);
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
			setState(300);
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
		public KeywordContext keyword() {
			return getRuleContext(KeywordContext.class,0);
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
			setState(308);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(302);
				condition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(303);
				match(T__1);
				setState(304);
				condition();
				setState(305);
				match(T__2);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(307);
				keyword();
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
			setState(328);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(310);
				expr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(311);
				type_name();
				setState(312);
				declarator();
				setState(316);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(313);
					match(NEWLINE);
					}
					}
					setState(318);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(319);
				match(T__3);
				setState(323);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(320);
					match(NEWLINE);
					}
					}
					setState(325);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(326);
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
		public MacroCallContext macroCall() {
			return getRuleContext(MacroCallContext.class,0);
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
			setState(339);
			switch (_input.LA(1)) {
			case PRE_DEFINE:
				enterOuterAlt(_localctx, 1);
				{
				setState(330);
				pre_define();
				}
				break;
			case PRE_UNDEF:
				enterOuterAlt(_localctx, 2);
				{
				setState(331);
				pre_undef();
				}
				break;
			case PRE_DIAGNOSTIC:
				enterOuterAlt(_localctx, 3);
				{
				setState(332);
				pre_diagnostic();
				}
				break;
			case T__13:
			case T__14:
			case T__15:
			case T__16:
			case PRE_OTHER:
			case PRE_ATTRIBUTE:
				enterOuterAlt(_localctx, 4);
				{
				setState(333);
				pre_other();
				}
				break;
			case PRE_INCLUDE:
				enterOuterAlt(_localctx, 5);
				{
				setState(334);
				pre_include();
				}
				break;
			case PRE_INCLUDE_NEXT:
				enterOuterAlt(_localctx, 6);
				{
				setState(335);
				pre_include_next();
				}
				break;
			case PRE_LINE:
				enterOuterAlt(_localctx, 7);
				{
				setState(336);
				pre_line();
				}
				break;
			case PRE_PRAGMA:
				enterOuterAlt(_localctx, 8);
				{
				setState(337);
				pre_pragma();
				}
				break;
			case T__4:
			case T__5:
			case T__6:
			case T__7:
			case T__8:
			case T__9:
			case T__10:
			case T__11:
			case STATIC:
			case UNSIGNED:
			case SIGNED:
			case VIRTUAL:
			case OPERATOR:
			case CLASS_KEY:
			case NEW:
			case PRE_PRAGMA_KEYWORDS:
			case END_TEST:
			case ALPHA_NUMERIC:
				enterOuterAlt(_localctx, 9);
				{
				setState(338);
				macroCall();
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
			setState(347);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(341);
				match(PRE_DEFINE);
				setState(342);
				pre_macro_identifier();
				setState(343);
				pre_macro();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(345);
				match(PRE_DEFINE);
				setState(346);
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
			setState(349);
			match(PRE_UNDEF);
			setState(350);
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
		public Pre_macro_parametersContext pre_macro_parameters() {
			return getRuleContext(Pre_macro_parametersContext.class,0);
		}
		public KeywordContext keyword() {
			return getRuleContext(KeywordContext.class,0);
		}
		public TerminalNode END_TEST() { return getToken(ModuleParser.END_TEST, 0); }
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
			setState(368);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(352);
				identifier();
				setState(357);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(353);
					match(T__1);
					setState(354);
					pre_macro_parameters();
					setState(355);
					match(T__2);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(359);
				keyword();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(360);
				match(END_TEST);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(361);
				match(T__4);
				setState(366);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
				case 1:
					{
					setState(362);
					match(T__1);
					setState(363);
					pre_macro_parameters();
					setState(364);
					match(T__2);
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

	public static class KeywordContext extends ParserRuleContext {
		public KeywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterKeyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitKeyword(this);
		}
	}

	public final KeywordContext keyword() throws RecognitionException {
		KeywordContext _localctx = new KeywordContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_keyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(370);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11))) != 0) || ((((_la - 80)) & ~0x3f) == 0 && ((1L << (_la - 80)) & ((1L << (STATIC - 80)) | (1L << (UNSIGNED - 80)) | (1L << (SIGNED - 80)) | (1L << (VIRTUAL - 80)) | (1L << (OPERATOR - 80)) | (1L << (CLASS_KEY - 80)))) != 0)) ) {
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
		enterRule(_localctx, 30, RULE_pre_macro_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(374);
			switch (_input.LA(1)) {
			case T__8:
			case T__9:
			case T__10:
			case NEW:
			case PRE_PRAGMA_KEYWORDS:
			case ALPHA_NUMERIC:
				{
				setState(372);
				identifier();
				}
				break;
			case ELLIPSIS:
				{
				setState(373);
				match(ELLIPSIS);
				}
				break;
			case T__2:
			case T__12:
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(383);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__12) {
				{
				{
				setState(376);
				match(T__12);
				setState(379);
				switch (_input.LA(1)) {
				case T__8:
				case T__9:
				case T__10:
				case NEW:
				case PRE_PRAGMA_KEYWORDS:
				case ALPHA_NUMERIC:
					{
					setState(377);
					identifier();
					}
					break;
				case ELLIPSIS:
					{
					setState(378);
					match(ELLIPSIS);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(385);
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
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
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
		enterRule(_localctx, 32, RULE_pre_macro);
		try {
			setState(388);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(386);
				expr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class MacroCallContext extends ParserRuleContext {
		public Pre_macro_identifierContext pre_macro_identifier() {
			return getRuleContext(Pre_macro_identifierContext.class,0);
		}
		public TerminalNode VOID() { return getToken(ModuleParser.VOID, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<Type_nameContext> type_name() {
			return getRuleContexts(Type_nameContext.class);
		}
		public Type_nameContext type_name(int i) {
			return getRuleContext(Type_nameContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(ModuleParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(ModuleParser.NEWLINE, i);
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
		enterRule(_localctx, 34, RULE_macroCall);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(390);
			pre_macro_identifier();
			setState(391);
			match(T__1);
			setState(416);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				{
				setState(394);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
				case 1:
					{
					setState(392);
					expr();
					}
					break;
				case 2:
					{
					setState(393);
					type_name();
					}
					break;
				}
				setState(397);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(396);
					match(NEWLINE);
					}
				}

				}
				setState(409);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(399);
						match(T__12);
						setState(401);
						_la = _input.LA(1);
						if (_la==NEWLINE) {
							{
							setState(400);
							match(NEWLINE);
							}
						}

						setState(405);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
						case 1:
							{
							setState(403);
							expr();
							}
							break;
						case 2:
							{
							setState(404);
							type_name();
							}
							break;
						}
						}
						} 
					}
					setState(411);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
				}
				setState(413);
				_la = _input.LA(1);
				if (_la==T__12) {
					{
					setState(412);
					match(T__12);
					}
				}

				}
				break;
			case 2:
				{
				setState(415);
				match(VOID);
				}
				break;
			}
			setState(418);
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
		enterRule(_localctx, 36, RULE_pre_diagnostic);
		try {
			setState(423);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(420);
				match(PRE_DIAGNOSTIC);
				setState(421);
				match(STRING);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(422);
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
		public TerminalNode PRE_ATTRIBUTE() { return getToken(ModuleParser.PRE_ATTRIBUTE, 0); }
		public AttributeListContext attributeList() {
			return getRuleContext(AttributeListContext.class,0);
		}
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
		enterRule(_localctx, 38, RULE_pre_other);
		int _la;
		try {
			setState(446);
			switch (_input.LA(1)) {
			case PRE_OTHER:
				enterOuterAlt(_localctx, 1);
				{
				setState(425);
				match(PRE_OTHER);
				setState(427);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
				case 1:
					{
					setState(426);
					match(STRING);
					}
					break;
				}
				}
				break;
			case PRE_ATTRIBUTE:
				enterOuterAlt(_localctx, 2);
				{
				setState(429);
				match(PRE_ATTRIBUTE);
				setState(430);
				match(T__1);
				setState(431);
				match(T__1);
				setState(433);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11))) != 0) || ((((_la - 80)) & ~0x3f) == 0 && ((1L << (_la - 80)) & ((1L << (STATIC - 80)) | (1L << (UNSIGNED - 80)) | (1L << (SIGNED - 80)) | (1L << (VIRTUAL - 80)) | (1L << (OPERATOR - 80)) | (1L << (CLASS_KEY - 80)) | (1L << (NEW - 80)) | (1L << (PRE_PRAGMA_KEYWORDS - 80)) | (1L << (END_TEST - 80)) | (1L << (ALPHA_NUMERIC - 80)) | (1L << (HEX_LITERAL - 80)) | (1L << (DECIMAL_LITERAL - 80)) | (1L << (OCTAL_LITERAL - 80)) | (1L << (FLOATING_POINT_LITERAL - 80)) | (1L << (CHAR - 80)) | (1L << (STRING - 80)))) != 0)) {
					{
					setState(432);
					attributeList();
					}
				}

				setState(435);
				match(T__2);
				setState(436);
				match(T__2);
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 3);
				{
				setState(437);
				match(T__13);
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 4);
				{
				setState(438);
				match(T__14);
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 5);
				{
				setState(439);
				match(T__15);
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 6);
				{
				setState(440);
				match(T__16);
				setState(441);
				match(T__1);
				setState(443);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11))) != 0) || ((((_la - 80)) & ~0x3f) == 0 && ((1L << (_la - 80)) & ((1L << (STATIC - 80)) | (1L << (UNSIGNED - 80)) | (1L << (SIGNED - 80)) | (1L << (VIRTUAL - 80)) | (1L << (OPERATOR - 80)) | (1L << (CLASS_KEY - 80)) | (1L << (NEW - 80)) | (1L << (PRE_PRAGMA_KEYWORDS - 80)) | (1L << (END_TEST - 80)) | (1L << (ALPHA_NUMERIC - 80)) | (1L << (HEX_LITERAL - 80)) | (1L << (DECIMAL_LITERAL - 80)) | (1L << (OCTAL_LITERAL - 80)) | (1L << (FLOATING_POINT_LITERAL - 80)) | (1L << (CHAR - 80)) | (1L << (STRING - 80)))) != 0)) {
					{
					setState(442);
					attributeList();
					}
				}

				setState(445);
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

	public static class AttributeListContext extends ParserRuleContext {
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public AttributeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterAttributeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitAttributeList(this);
		}
	}

	public final AttributeListContext attributeList() throws RecognitionException {
		AttributeListContext _localctx = new AttributeListContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_attributeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(448);
			attribute();
			setState(453);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__12) {
				{
				{
				setState(449);
				match(T__12);
				setState(450);
				attribute();
				}
				}
				setState(455);
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

	public static class AttributeContext extends ParserRuleContext {
		public Pre_macro_identifierContext pre_macro_identifier() {
			return getRuleContext(Pre_macro_identifierContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public AttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitAttribute(this);
		}
	}

	public final AttributeContext attribute() throws RecognitionException {
		AttributeContext _localctx = new AttributeContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_attribute);
		int _la;
		try {
			setState(484);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(456);
				pre_macro_identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(457);
				pre_macro_identifier();
				setState(458);
				match(T__1);
				setState(459);
				identifier();
				setState(464);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__12) {
					{
					{
					setState(460);
					match(T__12);
					setState(461);
					expr();
					}
					}
					setState(466);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(467);
				match(T__2);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(469);
				pre_macro_identifier();
				setState(470);
				match(T__1);
				setState(472);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__50) | (1L << T__51) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (STATIC - 64)) | (1L << (VOID - 64)) | (1L << (UNSIGNED - 64)) | (1L << (SIGNED - 64)) | (1L << (CV_QUALIFIER - 64)) | (1L << (EXTERN - 64)) | (1L << (VIRTUAL - 64)) | (1L << (SPECIAL_DATA - 64)) | (1L << (OPERATOR - 64)) | (1L << (CLASS_KEY - 64)) | (1L << (NEW - 64)) | (1L << (PRE_PRAGMA_KEYWORDS - 64)) | (1L << (END_TEST - 64)) | (1L << (ALPHA_NUMERIC - 64)) | (1L << (OPENING_CURLY - 64)) | (1L << (HEX_LITERAL - 64)) | (1L << (DECIMAL_LITERAL - 64)) | (1L << (OCTAL_LITERAL - 64)) | (1L << (FLOATING_POINT_LITERAL - 64)) | (1L << (CHAR - 64)) | (1L << (STRING - 64)))) != 0)) {
					{
					setState(471);
					expr();
					}
				}

				setState(478);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__12) {
					{
					{
					setState(474);
					match(T__12);
					setState(475);
					expr();
					}
					}
					setState(480);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(481);
				match(T__2);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(483);
				constant();
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

	public static class Pre_includeContext extends ParserRuleContext {
		public TerminalNode PRE_INCLUDE() { return getToken(ModuleParser.PRE_INCLUDE, 0); }
		public Pre_include_local_fileContext pre_include_local_file() {
			return getRuleContext(Pre_include_local_fileContext.class,0);
		}
		public Pre_macro_identifierContext pre_macro_identifier() {
			return getRuleContext(Pre_macro_identifierContext.class,0);
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
		enterRule(_localctx, 44, RULE_pre_include);
		try {
			setState(491);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(486);
				match(PRE_INCLUDE);
				setState(487);
				pre_include_local_file();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(488);
				match(PRE_INCLUDE);
				setState(489);
				pre_macro_identifier();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(490);
				match(PRE_INCLUDE);
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
		public Pre_include_local_fileContext pre_include_local_file() {
			return getRuleContext(Pre_include_local_fileContext.class,0);
		}
		public Pre_macro_identifierContext pre_macro_identifier() {
			return getRuleContext(Pre_macro_identifierContext.class,0);
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
		enterRule(_localctx, 46, RULE_pre_include_next);
		try {
			setState(498);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(493);
				match(PRE_INCLUDE_NEXT);
				setState(494);
				pre_include_local_file();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(495);
				match(PRE_INCLUDE_NEXT);
				setState(496);
				pre_macro_identifier();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(497);
				match(PRE_INCLUDE_NEXT);
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
		enterRule(_localctx, 48, RULE_pre_include_local_file);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(500);
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
		enterRule(_localctx, 50, RULE_pre_include_filename);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(502);
			match(STRING);
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
		enterRule(_localctx, 52, RULE_pre_line);
		try {
			setState(518);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(504);
				match(PRE_LINE);
				setState(505);
				match(DECIMAL_LITERAL);
				setState(506);
				match(STRING);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(507);
				match(PRE_LINE);
				setState(508);
				match(DECIMAL_LITERAL);
				setState(509);
				pre_macro_identifier();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(510);
				match(PRE_LINE);
				setState(511);
				pre_macro_identifier();
				setState(512);
				match(STRING);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(514);
				match(PRE_LINE);
				setState(515);
				pre_macro_identifier();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(516);
				match(PRE_LINE);
				setState(517);
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
		enterRule(_localctx, 54, RULE_pre_pragma);
		int _la;
		try {
			int _alt;
			setState(540);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(520);
				match(PRE_PRAGMA);
				setState(522);
				_la = _input.LA(1);
				if (_la==PRE_GCC) {
					{
					setState(521);
					match(PRE_GCC);
					}
				}

				setState(524);
				match(PRE_PRAGMA_KEYWORDS);
				setState(525);
				match(STRING);
				 preProcFindMacroEnd(); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(527);
				match(PRE_PRAGMA);
				setState(529);
				_la = _input.LA(1);
				if (_la==PRE_GCC) {
					{
					setState(528);
					match(PRE_GCC);
					}
				}

				setState(531);
				match(PRE_PRAGMA_KEYWORDS);
				setState(535);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(532);
						identifier();
						}
						} 
					}
					setState(537);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(538);
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
		enterRule(_localctx, 56, RULE_comment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(542);
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
		enterRule(_localctx, 58, RULE_newline);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(544);
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
		enterRule(_localctx, 60, RULE_unary_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(546);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22))) != 0)) ) {
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
		enterRule(_localctx, 62, RULE_relational_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(548);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26))) != 0)) ) {
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
		public List<TerminalNode> STRING() { return getTokens(ModuleParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(ModuleParser.STRING, i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(ModuleParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(ModuleParser.NEWLINE, i);
		}
		public List<TerminalNode> COMMENT() { return getTokens(ModuleParser.COMMENT); }
		public TerminalNode COMMENT(int i) {
			return getToken(ModuleParser.COMMENT, i);
		}
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
		enterRule(_localctx, 64, RULE_constant);
		try {
			int _alt;
			setState(578);
			switch (_input.LA(1)) {
			case HEX_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(550);
				match(HEX_LITERAL);
				}
				break;
			case OCTAL_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(551);
				match(OCTAL_LITERAL);
				}
				break;
			case DECIMAL_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(552);
				match(DECIMAL_LITERAL);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 4);
				{
				setState(572); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(553);
						match(STRING);
						setState(557);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(554);
								match(NEWLINE);
								}
								} 
							}
							setState(559);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
						}
						setState(563);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(560);
								match(COMMENT);
								}
								} 
							}
							setState(565);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
						}
						setState(569);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(566);
								match(NEWLINE);
								}
								} 
							}
							setState(571);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
						}
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(574); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case CHAR:
				enterOuterAlt(_localctx, 5);
				{
				setState(576);
				match(CHAR);
				}
				break;
			case FLOATING_POINT_LITERAL:
				enterOuterAlt(_localctx, 6);
				{
				setState(577);
				match(FLOATING_POINT_LITERAL);
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
		enterRule(_localctx, 66, RULE_function_decl_specifiers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(580);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__7))) != 0) || _la==STATIC || _la==VIRTUAL) ) {
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
		enterRule(_localctx, 68, RULE_ptr_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(582);
			_la = _input.LA(1);
			if ( !(_la==T__17 || _la==T__18) ) {
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
		enterRule(_localctx, 70, RULE_access_specifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(584);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__9) | (1L << T__10))) != 0)) ) {
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
		enterRule(_localctx, 72, RULE_operator);
		int _la;
		try {
			setState(631);
			switch (_input.LA(1)) {
			case T__27:
			case NEW:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(586);
				_la = _input.LA(1);
				if ( !(_la==T__27 || _la==NEW) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(589);
				_la = _input.LA(1);
				if (_la==T__28) {
					{
					setState(587);
					match(T__28);
					setState(588);
					match(T__29);
					}
				}

				}
				}
				break;
			case T__19:
				enterOuterAlt(_localctx, 2);
				{
				setState(591);
				match(T__19);
				}
				break;
			case T__20:
				enterOuterAlt(_localctx, 3);
				{
				setState(592);
				match(T__20);
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 4);
				{
				setState(593);
				match(T__18);
				}
				break;
			case T__30:
				enterOuterAlt(_localctx, 5);
				{
				setState(594);
				match(T__30);
				}
				break;
			case T__31:
				enterOuterAlt(_localctx, 6);
				{
				setState(595);
				match(T__31);
				}
				break;
			case T__32:
				enterOuterAlt(_localctx, 7);
				{
				setState(596);
				match(T__32);
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 8);
				{
				setState(597);
				match(T__17);
				}
				break;
			case T__33:
				enterOuterAlt(_localctx, 9);
				{
				setState(598);
				match(T__33);
				}
				break;
			case T__21:
				enterOuterAlt(_localctx, 10);
				{
				setState(599);
				match(T__21);
				}
				break;
			case T__22:
				enterOuterAlt(_localctx, 11);
				{
				setState(600);
				match(T__22);
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 12);
				{
				setState(601);
				match(T__3);
				}
				break;
			case T__23:
				enterOuterAlt(_localctx, 13);
				{
				setState(602);
				match(T__23);
				}
				break;
			case T__24:
				enterOuterAlt(_localctx, 14);
				{
				setState(603);
				match(T__24);
				}
				break;
			case T__34:
				enterOuterAlt(_localctx, 15);
				{
				setState(604);
				match(T__34);
				}
				break;
			case T__35:
				enterOuterAlt(_localctx, 16);
				{
				setState(605);
				match(T__35);
				}
				break;
			case T__36:
				enterOuterAlt(_localctx, 17);
				{
				setState(606);
				match(T__36);
				}
				break;
			case T__37:
				enterOuterAlt(_localctx, 18);
				{
				setState(607);
				match(T__37);
				}
				break;
			case T__38:
				enterOuterAlt(_localctx, 19);
				{
				setState(608);
				match(T__38);
				}
				break;
			case T__39:
				enterOuterAlt(_localctx, 20);
				{
				setState(609);
				match(T__39);
				}
				break;
			case T__40:
				enterOuterAlt(_localctx, 21);
				{
				setState(610);
				match(T__40);
				}
				break;
			case T__41:
				enterOuterAlt(_localctx, 22);
				{
				setState(611);
				match(T__41);
				}
				break;
			case T__42:
				enterOuterAlt(_localctx, 23);
				{
				setState(612);
				match(T__42);
				}
				break;
			case T__43:
				enterOuterAlt(_localctx, 24);
				{
				setState(613);
				match(T__43);
				}
				break;
			case T__44:
				enterOuterAlt(_localctx, 25);
				{
				setState(614);
				match(T__44);
				}
				break;
			case T__45:
				enterOuterAlt(_localctx, 26);
				{
				setState(615);
				match(T__45);
				}
				break;
			case T__46:
				enterOuterAlt(_localctx, 27);
				{
				setState(616);
				match(T__46);
				}
				break;
			case T__47:
				enterOuterAlt(_localctx, 28);
				{
				setState(617);
				match(T__47);
				}
				break;
			case T__25:
				enterOuterAlt(_localctx, 29);
				{
				setState(618);
				match(T__25);
				}
				break;
			case T__26:
				enterOuterAlt(_localctx, 30);
				{
				setState(619);
				match(T__26);
				}
				break;
			case T__48:
				enterOuterAlt(_localctx, 31);
				{
				setState(620);
				match(T__48);
				}
				break;
			case T__49:
				enterOuterAlt(_localctx, 32);
				{
				setState(621);
				match(T__49);
				}
				break;
			case T__50:
				enterOuterAlt(_localctx, 33);
				{
				setState(622);
				match(T__50);
				}
				break;
			case T__51:
				enterOuterAlt(_localctx, 34);
				{
				setState(623);
				match(T__51);
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 35);
				{
				setState(624);
				match(T__12);
				}
				break;
			case T__52:
				enterOuterAlt(_localctx, 36);
				{
				setState(625);
				match(T__52);
				}
				break;
			case T__53:
				enterOuterAlt(_localctx, 37);
				{
				setState(626);
				match(T__53);
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 38);
				{
				setState(627);
				match(T__1);
				setState(628);
				match(T__2);
				}
				break;
			case T__28:
				enterOuterAlt(_localctx, 39);
				{
				setState(629);
				match(T__28);
				setState(630);
				match(T__29);
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
		enterRule(_localctx, 74, RULE_assignment_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(633);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__44) | (1L << T__45))) != 0)) ) {
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
		enterRule(_localctx, 76, RULE_equality_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(635);
			_la = _input.LA(1);
			if ( !(_la==T__46 || _la==T__47) ) {
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
		enterRule(_localctx, 78, RULE_template_decl_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(637);
			match(TEMPLATE);
			setState(638);
			match(T__23);
			setState(639);
			template_param_list();
			setState(640);
			match(T__24);
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
		enterRule(_localctx, 80, RULE_template_param_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(651); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(651);
				switch (_input.LA(1)) {
				case T__23:
					{
					{
					setState(642);
					match(T__23);
					setState(643);
					template_param_list();
					setState(644);
					match(T__24);
					}
					}
					break;
				case T__1:
					{
					{
					setState(646);
					match(T__1);
					setState(647);
					template_param_list();
					setState(648);
					match(T__2);
					}
					}
					break;
				case T__0:
				case T__3:
				case T__4:
				case T__5:
				case T__6:
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
				case T__57:
				case T__58:
				case T__59:
				case T__60:
				case T__61:
				case T__62:
				case T__63:
				case NEWLINE:
				case ESCAPE:
				case ELLIPSIS:
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
				case CV_QUALIFIER:
				case EXTERN:
				case VIRTUAL:
				case TRY:
				case CATCH:
				case THROW:
				case USING:
				case NAMESPACE:
				case AUTO:
				case REGISTER:
				case SPECIAL_DATA:
				case OPERATOR:
				case TEMPLATE:
				case CLASS_KEY:
				case NEW:
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
				case PRE_ATTRIBUTE:
				case END_TEST:
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
				case WHITESPACE:
				case OTHER:
					{
					setState(650);
					no_angle_brackets_or_brackets();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(653); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (NEWLINE - 64)) | (1L << (ESCAPE - 64)) | (1L << (ELLIPSIS - 64)) | (1L << (IF - 64)) | (1L << (ELSE - 64)) | (1L << (FOR - 64)) | (1L << (WHILE - 64)) | (1L << (BREAK - 64)) | (1L << (CASE - 64)) | (1L << (CONTINUE - 64)) | (1L << (SWITCH - 64)) | (1L << (DO - 64)) | (1L << (GOTO - 64)) | (1L << (RETURN - 64)) | (1L << (TYPEDEF - 64)) | (1L << (STATIC - 64)) | (1L << (VOID - 64)) | (1L << (UNSIGNED - 64)) | (1L << (SIGNED - 64)) | (1L << (CV_QUALIFIER - 64)) | (1L << (EXTERN - 64)) | (1L << (VIRTUAL - 64)) | (1L << (TRY - 64)) | (1L << (CATCH - 64)) | (1L << (THROW - 64)) | (1L << (USING - 64)) | (1L << (NAMESPACE - 64)) | (1L << (AUTO - 64)) | (1L << (REGISTER - 64)) | (1L << (SPECIAL_DATA - 64)) | (1L << (OPERATOR - 64)) | (1L << (TEMPLATE - 64)) | (1L << (CLASS_KEY - 64)) | (1L << (NEW - 64)) | (1L << (PRE_IF - 64)) | (1L << (PRE_ELIF - 64)) | (1L << (PRE_ELSE - 64)) | (1L << (PRE_ENDIF - 64)) | (1L << (PRE_DEFINE - 64)) | (1L << (PRE_UNDEF - 64)) | (1L << (PRE_DIAGNOSTIC - 64)) | (1L << (PRE_OTHER - 64)) | (1L << (PRE_INCLUDE - 64)) | (1L << (PRE_INCLUDE_NEXT - 64)) | (1L << (PRE_LINE - 64)) | (1L << (PRE_PRAGMA - 64)) | (1L << (PRE_GCC - 64)) | (1L << (PRE_PRAGMA_KEYWORDS - 64)) | (1L << (PRE_STR - 64)) | (1L << (PRE_ATTRIBUTE - 64)) | (1L << (END_TEST - 64)) | (1L << (ALPHA_NUMERIC - 64)) | (1L << (OPENING_CURLY - 64)) | (1L << (CLOSING_CURLY - 64)) | (1L << (HEX_LITERAL - 64)) | (1L << (DECIMAL_LITERAL - 64)) | (1L << (OCTAL_LITERAL - 64)) | (1L << (FLOATING_POINT_LITERAL - 64)) | (1L << (COMMENT - 64)) | (1L << (CHAR - 64)) | (1L << (STRING - 64)) | (1L << (WHITESPACE - 64)) | (1L << (OTHER - 64)))) != 0) );
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
		enterRule(_localctx, 82, RULE_no_brackets);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(655);
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
		enterRule(_localctx, 84, RULE_no_brackets_curlies_or_squares);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(657);
			_la = _input.LA(1);
			if ( _la <= 0 || ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__28) | (1L << T__29))) != 0) || _la==OPENING_CURLY || _la==CLOSING_CURLY) ) {
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
		enterRule(_localctx, 86, RULE_no_brackets_or_semicolon);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(659);
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
		enterRule(_localctx, 88, RULE_no_angle_brackets_or_brackets);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(661);
			_la = _input.LA(1);
			if ( _la <= 0 || ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__23) | (1L << T__24))) != 0)) ) {
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
		enterRule(_localctx, 90, RULE_no_curlies);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(663);
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
		enterRule(_localctx, 92, RULE_no_squares);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(665);
			_la = _input.LA(1);
			if ( _la <= 0 || (_la==T__28 || _la==T__29) ) {
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
		enterRule(_localctx, 94, RULE_no_squares_or_semicolon);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(667);
			_la = _input.LA(1);
			if ( _la <= 0 || ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__28) | (1L << T__29))) != 0)) ) {
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
		enterRule(_localctx, 96, RULE_no_comma_or_semicolon);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(669);
			_la = _input.LA(1);
			if ( _la <= 0 || (_la==T__0 || _la==T__12) ) {
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
		enterRule(_localctx, 98, RULE_assign_water);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(671);
			_la = _input.LA(1);
			if ( _la <= 0 || ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__12) | (1L << T__28) | (1L << T__29))) != 0) || _la==OPENING_CURLY || _la==CLOSING_CURLY) ) {
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
		enterRule(_localctx, 100, RULE_assign_water_l2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(673);
			_la = _input.LA(1);
			if ( _la <= 0 || ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__28) | (1L << T__29))) != 0) || _la==OPENING_CURLY || _la==CLOSING_CURLY) ) {
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
		enterRule(_localctx, 102, RULE_water);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(675);
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
		public TestEndContext testEnd() {
			return getRuleContext(TestEndContext.class,0);
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
		enterRule(_localctx, 104, RULE_custom);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(681);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				{
				setState(677);
				asciiTab();
				}
				break;
			case 2:
				{
				setState(678);
				externC();
				}
				break;
			case 3:
				{
				setState(679);
				macroFunctionPointer();
				}
				break;
			case 4:
				{
				setState(680);
				testEnd();
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
		enterRule(_localctx, 106, RULE_asciiTab);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(686); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(683);
					pre_macro_identifier();
					setState(684);
					match(T__12);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(688); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
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
		enterRule(_localctx, 108, RULE_externC);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(690);
			match(EXTERN);
			setState(691);
			match(T__54);
			setState(693);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				{
				setState(692);
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
		enterRule(_localctx, 110, RULE_macroFunctionPointer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(695);
			macroCall();
			setState(697);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				{
				setState(696);
				match(NEWLINE);
				}
				break;
			}
			setState(700);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				{
				setState(699);
				pre_macro_identifier();
				}
				break;
			}
			setState(703);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(702);
				match(NEWLINE);
				}
			}

			setState(705);
			macroCall();
			setState(707);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(706);
				match(NEWLINE);
				}
			}

			setState(709);
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

	public static class TestStartContext extends ParserRuleContext {
		public Function_nameContext function_name() {
			return getRuleContext(Function_nameContext.class,0);
		}
		public TestStartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_testStart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterTestStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitTestStart(this);
		}
	}

	public final TestStartContext testStart() throws RecognitionException {
		TestStartContext _localctx = new TestStartContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_testStart);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(711);
			match(T__4);
			setState(712);
			match(T__1);
			setState(713);
			function_name();
			setState(714);
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

	public static class TestEndContext extends ParserRuleContext {
		public TerminalNode END_TEST() { return getToken(ModuleParser.END_TEST, 0); }
		public TestEndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_testEnd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterTestEnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitTestEnd(this);
		}
	}

	public final TestEndContext testEnd() throws RecognitionException {
		TestEndContext _localctx = new TestEndContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_testEnd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(716);
			match(END_TEST);
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
		public Return_typeContext return_type() {
			return getRuleContext(Return_typeContext.class,0);
		}
		public Pre_otherContext pre_other() {
			return getRuleContext(Pre_otherContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(ModuleParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(ModuleParser.NEWLINE, i);
		}
		public Ctor_listContext ctor_list() {
			return getRuleContext(Ctor_listContext.class,0);
		}
		public TerminalNode COMMENT() { return getToken(ModuleParser.COMMENT, 0); }
		public MacroCall_asFunctionHeaderContext macroCall_asFunctionHeader() {
			return getRuleContext(MacroCall_asFunctionHeaderContext.class,0);
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
		enterRule(_localctx, 116, RULE_function_def);
		int _la;
		try {
			setState(758);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(719);
				_la = _input.LA(1);
				if (_la==TEMPLATE) {
					{
					setState(718);
					template_decl_start();
					}
				}

				setState(722);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
				case 1:
					{
					setState(721);
					return_type();
					}
					break;
				}
				setState(728);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16))) != 0) || _la==PRE_OTHER || _la==PRE_ATTRIBUTE) {
					{
					setState(724);
					pre_other();
					setState(726);
					_la = _input.LA(1);
					if (_la==NEWLINE) {
						{
						setState(725);
						match(NEWLINE);
						}
					}

					}
				}

				setState(730);
				function_name();
				setState(732);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(731);
					match(NEWLINE);
					}
				}

				setState(734);
				function_param_list();
				setState(736);
				_la = _input.LA(1);
				if (_la==T__55) {
					{
					setState(735);
					ctor_list();
					}
				}

				setState(739);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
				case 1:
					{
					setState(738);
					match(NEWLINE);
					}
					break;
				}
				setState(742);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(741);
					match(COMMENT);
					}
				}

				setState(745);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(744);
					match(NEWLINE);
					}
				}

				setState(747);
				compound_statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(750);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
				case 1:
					{
					setState(749);
					return_type();
					}
					break;
				}
				setState(752);
				macroCall_asFunctionHeader();
				setState(754);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(753);
					match(NEWLINE);
					}
				}

				setState(756);
				compound_statement();
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

	public static class MacroCall_asFunctionHeaderContext extends ParserRuleContext {
		public MacroCallContext macroCall() {
			return getRuleContext(MacroCallContext.class,0);
		}
		public MacroCall_asFunctionHeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_macroCall_asFunctionHeader; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterMacroCall_asFunctionHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitMacroCall_asFunctionHeader(this);
		}
	}

	public final MacroCall_asFunctionHeaderContext macroCall_asFunctionHeader() throws RecognitionException {
		MacroCall_asFunctionHeaderContext _localctx = new MacroCall_asFunctionHeaderContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_macroCall_asFunctionHeader);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(760);
			macroCall();
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
		enterRule(_localctx, 120, RULE_return_type);
		int _la;
		try {
			int _alt;
			setState(786);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(768);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(762);
						function_decl_specifiers();
						setState(764);
						_la = _input.LA(1);
						if (_la==NEWLINE) {
							{
							setState(763);
							match(NEWLINE);
							}
						}

						}
						} 
					}
					setState(770);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
				}
				setState(771);
				type_name();
				}
				setState(779);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__17 || _la==T__18) {
					{
					{
					setState(773);
					ptr_operator();
					setState(775);
					_la = _input.LA(1);
					if (_la==NEWLINE) {
						{
						setState(774);
						match(NEWLINE);
						}
					}

					}
					}
					setState(781);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(782);
				macroCall();
				setState(784);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(783);
					match(NEWLINE);
					}
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
		public List<TerminalNode> NEWLINE() { return getTokens(ModuleParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(ModuleParser.NEWLINE, i);
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
		enterRule(_localctx, 122, RULE_function_param_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(788);
			match(T__1);
			setState(790);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__17) | (1L << T__18) | (1L << T__23) | (1L << T__57) | (1L << T__58))) != 0) || ((((_la - 80)) & ~0x3f) == 0 && ((1L << (_la - 80)) & ((1L << (STATIC - 80)) | (1L << (VOID - 80)) | (1L << (UNSIGNED - 80)) | (1L << (SIGNED - 80)) | (1L << (CV_QUALIFIER - 80)) | (1L << (EXTERN - 80)) | (1L << (VIRTUAL - 80)) | (1L << (AUTO - 80)) | (1L << (REGISTER - 80)) | (1L << (SPECIAL_DATA - 80)) | (1L << (OPERATOR - 80)) | (1L << (CLASS_KEY - 80)) | (1L << (NEW - 80)) | (1L << (PRE_PRAGMA_KEYWORDS - 80)) | (1L << (END_TEST - 80)) | (1L << (ALPHA_NUMERIC - 80)))) != 0)) {
				{
				setState(789);
				parameter_decl_clause();
				}
			}

			setState(792);
			match(T__2);
			setState(794);
			_la = _input.LA(1);
			if (_la==T__18) {
				{
				setState(793);
				match(T__18);
				}
			}

			setState(802);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CV_QUALIFIER) {
				{
				{
				setState(796);
				match(CV_QUALIFIER);
				setState(798);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
				case 1:
					{
					setState(797);
					match(NEWLINE);
					}
					break;
				}
				}
				}
				setState(804);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(806);
			_la = _input.LA(1);
			if (_la==THROW) {
				{
				setState(805);
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
		enterRule(_localctx, 124, RULE_parameter_decl_clause);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(808);
			parameter_decl();
			setState(816);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,81,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(809);
					match(T__12);
					setState(811);
					_la = _input.LA(1);
					if (_la==NEWLINE) {
						{
						setState(810);
						match(NEWLINE);
						}
					}

					setState(813);
					parameter_decl();
					}
					} 
				}
				setState(818);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,81,_ctx);
			}
			}
			setState(824);
			_la = _input.LA(1);
			if (_la==T__12) {
				{
				setState(819);
				match(T__12);
				setState(821);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(820);
					match(NEWLINE);
					}
				}

				setState(823);
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
		enterRule(_localctx, 126, RULE_parameter_decl);
		try {
			setState(830);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(826);
				match(VOID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(827);
				param_decl_specifiers();
				setState(828);
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
		enterRule(_localctx, 128, RULE_parameter_id);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(833);
			_la = _input.LA(1);
			if (_la==T__17 || _la==T__18) {
				{
				setState(832);
				ptrs();
				}
			}

			setState(840);
			switch (_input.LA(1)) {
			case T__1:
				{
				setState(835);
				match(T__1);
				setState(836);
				parameter_id();
				setState(837);
				match(T__2);
				}
				break;
			case T__8:
			case T__9:
			case T__10:
			case NEW:
			case PRE_PRAGMA_KEYWORDS:
			case ALPHA_NUMERIC:
				{
				setState(839);
				parameter_name();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(843);
			_la = _input.LA(1);
			if (_la==T__1 || _la==T__28) {
				{
				setState(842);
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
		enterRule(_localctx, 130, RULE_compound_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(845);
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
		enterRule(_localctx, 132, RULE_ctor_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(848);
			match(T__55);
			setState(849);
			ctor_initializer();
			setState(854);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__12) {
				{
				{
				setState(850);
				match(T__12);
				setState(851);
				ctor_initializer();
				}
				}
				setState(856);
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
		enterRule(_localctx, 134, RULE_ctor_initializer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(857);
			initializer_id();
			setState(858);
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
		enterRule(_localctx, 136, RULE_initializer_id);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(861);
			_la = _input.LA(1);
			if (_la==T__56) {
				{
				setState(860);
				match(T__56);
				}
			}

			setState(863);
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
		enterRule(_localctx, 138, RULE_ctor_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(865);
			match(T__1);
			setState(867);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__50) | (1L << T__51) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (STATIC - 64)) | (1L << (VOID - 64)) | (1L << (UNSIGNED - 64)) | (1L << (SIGNED - 64)) | (1L << (CV_QUALIFIER - 64)) | (1L << (EXTERN - 64)) | (1L << (VIRTUAL - 64)) | (1L << (SPECIAL_DATA - 64)) | (1L << (OPERATOR - 64)) | (1L << (CLASS_KEY - 64)) | (1L << (NEW - 64)) | (1L << (PRE_PRAGMA_KEYWORDS - 64)) | (1L << (END_TEST - 64)) | (1L << (ALPHA_NUMERIC - 64)) | (1L << (OPENING_CURLY - 64)) | (1L << (HEX_LITERAL - 64)) | (1L << (DECIMAL_LITERAL - 64)) | (1L << (OCTAL_LITERAL - 64)) | (1L << (FLOATING_POINT_LITERAL - 64)) | (1L << (CHAR - 64)) | (1L << (STRING - 64)))) != 0)) {
				{
				setState(866);
				expr();
				}
			}

			setState(869);
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
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Function_nameContext function_name() {
			return getRuleContext(Function_nameContext.class,0);
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
		enterRule(_localctx, 140, RULE_function_name);
		try {
			setState(878);
			switch (_input.LA(1)) {
			case T__8:
			case T__9:
			case T__10:
			case NEW:
			case PRE_PRAGMA_KEYWORDS:
			case ALPHA_NUMERIC:
				enterOuterAlt(_localctx, 1);
				{
				setState(871);
				identifier();
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				setState(872);
				match(T__1);
				setState(873);
				function_name();
				setState(874);
				match(T__2);
				}
				break;
			case OPERATOR:
				enterOuterAlt(_localctx, 3);
				{
				setState(876);
				match(OPERATOR);
				setState(877);
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
		enterRule(_localctx, 142, RULE_exception_specification);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(880);
			match(THROW);
			setState(881);
			match(T__1);
			setState(882);
			type_id_list();
			setState(883);
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
		enterRule(_localctx, 144, RULE_type_id_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(888);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (NEWLINE - 64)) | (1L << (ESCAPE - 64)) | (1L << (ELLIPSIS - 64)) | (1L << (IF - 64)) | (1L << (ELSE - 64)) | (1L << (FOR - 64)) | (1L << (WHILE - 64)) | (1L << (BREAK - 64)) | (1L << (CASE - 64)) | (1L << (CONTINUE - 64)) | (1L << (SWITCH - 64)) | (1L << (DO - 64)) | (1L << (GOTO - 64)) | (1L << (RETURN - 64)) | (1L << (TYPEDEF - 64)) | (1L << (STATIC - 64)) | (1L << (VOID - 64)) | (1L << (UNSIGNED - 64)) | (1L << (SIGNED - 64)) | (1L << (CV_QUALIFIER - 64)) | (1L << (EXTERN - 64)) | (1L << (VIRTUAL - 64)) | (1L << (TRY - 64)) | (1L << (CATCH - 64)) | (1L << (THROW - 64)) | (1L << (USING - 64)) | (1L << (NAMESPACE - 64)) | (1L << (AUTO - 64)) | (1L << (REGISTER - 64)) | (1L << (SPECIAL_DATA - 64)) | (1L << (OPERATOR - 64)) | (1L << (TEMPLATE - 64)) | (1L << (CLASS_KEY - 64)) | (1L << (NEW - 64)) | (1L << (PRE_IF - 64)) | (1L << (PRE_ELIF - 64)) | (1L << (PRE_ELSE - 64)) | (1L << (PRE_ENDIF - 64)) | (1L << (PRE_DEFINE - 64)) | (1L << (PRE_UNDEF - 64)) | (1L << (PRE_DIAGNOSTIC - 64)) | (1L << (PRE_OTHER - 64)) | (1L << (PRE_INCLUDE - 64)) | (1L << (PRE_INCLUDE_NEXT - 64)) | (1L << (PRE_LINE - 64)) | (1L << (PRE_PRAGMA - 64)) | (1L << (PRE_GCC - 64)) | (1L << (PRE_PRAGMA_KEYWORDS - 64)) | (1L << (PRE_STR - 64)) | (1L << (PRE_ATTRIBUTE - 64)) | (1L << (END_TEST - 64)) | (1L << (ALPHA_NUMERIC - 64)) | (1L << (OPENING_CURLY - 64)) | (1L << (CLOSING_CURLY - 64)) | (1L << (HEX_LITERAL - 64)) | (1L << (DECIMAL_LITERAL - 64)) | (1L << (OCTAL_LITERAL - 64)) | (1L << (FLOATING_POINT_LITERAL - 64)) | (1L << (COMMENT - 64)) | (1L << (CHAR - 64)) | (1L << (STRING - 64)) | (1L << (WHITESPACE - 64)) | (1L << (OTHER - 64)))) != 0)) {
				{
				{
				setState(885);
				no_brackets();
				}
				}
				setState(890);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(902);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(891);
				match(T__1);
				setState(892);
				type_id_list();
				setState(893);
				match(T__2);
				setState(897);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (NEWLINE - 64)) | (1L << (ESCAPE - 64)) | (1L << (ELLIPSIS - 64)) | (1L << (IF - 64)) | (1L << (ELSE - 64)) | (1L << (FOR - 64)) | (1L << (WHILE - 64)) | (1L << (BREAK - 64)) | (1L << (CASE - 64)) | (1L << (CONTINUE - 64)) | (1L << (SWITCH - 64)) | (1L << (DO - 64)) | (1L << (GOTO - 64)) | (1L << (RETURN - 64)) | (1L << (TYPEDEF - 64)) | (1L << (STATIC - 64)) | (1L << (VOID - 64)) | (1L << (UNSIGNED - 64)) | (1L << (SIGNED - 64)) | (1L << (CV_QUALIFIER - 64)) | (1L << (EXTERN - 64)) | (1L << (VIRTUAL - 64)) | (1L << (TRY - 64)) | (1L << (CATCH - 64)) | (1L << (THROW - 64)) | (1L << (USING - 64)) | (1L << (NAMESPACE - 64)) | (1L << (AUTO - 64)) | (1L << (REGISTER - 64)) | (1L << (SPECIAL_DATA - 64)) | (1L << (OPERATOR - 64)) | (1L << (TEMPLATE - 64)) | (1L << (CLASS_KEY - 64)) | (1L << (NEW - 64)) | (1L << (PRE_IF - 64)) | (1L << (PRE_ELIF - 64)) | (1L << (PRE_ELSE - 64)) | (1L << (PRE_ENDIF - 64)) | (1L << (PRE_DEFINE - 64)) | (1L << (PRE_UNDEF - 64)) | (1L << (PRE_DIAGNOSTIC - 64)) | (1L << (PRE_OTHER - 64)) | (1L << (PRE_INCLUDE - 64)) | (1L << (PRE_INCLUDE_NEXT - 64)) | (1L << (PRE_LINE - 64)) | (1L << (PRE_PRAGMA - 64)) | (1L << (PRE_GCC - 64)) | (1L << (PRE_PRAGMA_KEYWORDS - 64)) | (1L << (PRE_STR - 64)) | (1L << (PRE_ATTRIBUTE - 64)) | (1L << (END_TEST - 64)) | (1L << (ALPHA_NUMERIC - 64)) | (1L << (OPENING_CURLY - 64)) | (1L << (CLOSING_CURLY - 64)) | (1L << (HEX_LITERAL - 64)) | (1L << (DECIMAL_LITERAL - 64)) | (1L << (OCTAL_LITERAL - 64)) | (1L << (FLOATING_POINT_LITERAL - 64)) | (1L << (COMMENT - 64)) | (1L << (CHAR - 64)) | (1L << (STRING - 64)) | (1L << (WHITESPACE - 64)) | (1L << (OTHER - 64)))) != 0)) {
					{
					{
					setState(894);
					no_brackets();
					}
					}
					setState(899);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(904);
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
		enterRule(_localctx, 146, RULE_simple_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(905);
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
		public Template_decl_startContext template_decl_start() {
			return getRuleContext(Template_decl_startContext.class,0);
		}
		public Init_declarator_listContext init_declarator_list() {
			return getRuleContext(Init_declarator_listContext.class,0);
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
		public TerminalNode TYPEDEF() { return getToken(ModuleParser.TYPEDEF, 0); }
		public Template_decl_startContext template_decl_start() {
			return getRuleContext(Template_decl_startContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(ModuleParser.NEWLINE, 0); }
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
	public static class FunctionPointerDeclareContext extends Var_declContext {
		public Type_nameContext type_name() {
			return getRuleContext(Type_nameContext.class,0);
		}
		public Ptr_operatorContext ptr_operator() {
			return getRuleContext(Ptr_operatorContext.class,0);
		}
		public Param_type_listContext param_type_list() {
			return getRuleContext(Param_type_listContext.class,0);
		}
		public TerminalNode TYPEDEF() { return getToken(ModuleParser.TYPEDEF, 0); }
		public CallingConventionContext callingConvention() {
			return getRuleContext(CallingConventionContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(ModuleParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(ModuleParser.NEWLINE, i);
		}
		public Pre_otherContext pre_other() {
			return getRuleContext(Pre_otherContext.class,0);
		}
		public ArgumentContext argument() {
			return getRuleContext(ArgumentContext.class,0);
		}
		public FunctionPointerDeclareContext(Var_declContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterFunctionPointerDeclare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitFunctionPointerDeclare(this);
		}
	}
	public static class StructUnionEnumContext extends Var_declContext {
		public Special_datatypeContext special_datatype() {
			return getRuleContext(Special_datatypeContext.class,0);
		}
		public TerminalNode CV_QUALIFIER() { return getToken(ModuleParser.CV_QUALIFIER, 0); }
		public Function_decl_specifiersContext function_decl_specifiers() {
			return getRuleContext(Function_decl_specifiersContext.class,0);
		}
		public TerminalNode TYPEDEF() { return getToken(ModuleParser.TYPEDEF, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(ModuleParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(ModuleParser.NEWLINE, i);
		}
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
		enterRule(_localctx, 148, RULE_var_decl);
		int _la;
		try {
			setState(986);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,117,_ctx) ) {
			case 1:
				_localctx = new DeclByClassContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(908);
				_la = _input.LA(1);
				if (_la==TEMPLATE) {
					{
					setState(907);
					template_decl_start();
					}
				}

				setState(910);
				class_def();
				setState(912);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,96,_ctx) ) {
				case 1:
					{
					setState(911);
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
				setState(918);
				_la = _input.LA(1);
				if (_la==TYPEDEF) {
					{
					setState(914);
					match(TYPEDEF);
					setState(916);
					_la = _input.LA(1);
					if (_la==NEWLINE) {
						{
						setState(915);
						match(NEWLINE);
						}
					}

					}
				}

				setState(921);
				_la = _input.LA(1);
				if (_la==TEMPLATE) {
					{
					setState(920);
					template_decl_start();
					}
				}

				setState(923);
				type_name();
				setState(924);
				init_declarator_list();
				}
				break;
			case 3:
				_localctx = new FunctionPointerDeclareContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(930);
				_la = _input.LA(1);
				if (_la==TYPEDEF) {
					{
					setState(926);
					match(TYPEDEF);
					setState(928);
					_la = _input.LA(1);
					if (_la==NEWLINE) {
						{
						setState(927);
						match(NEWLINE);
						}
					}

					}
				}

				setState(932);
				type_name();
				setState(933);
				match(T__1);
				setState(935);
				_la = _input.LA(1);
				if (_la==ALPHA_NUMERIC) {
					{
					setState(934);
					callingConvention();
					}
				}

				setState(937);
				ptr_operator();
				setState(939);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__9) | (1L << T__10))) != 0) || ((((_la - 98)) & ~0x3f) == 0 && ((1L << (_la - 98)) & ((1L << (NEW - 98)) | (1L << (PRE_PRAGMA_KEYWORDS - 98)) | (1L << (ALPHA_NUMERIC - 98)))) != 0)) {
					{
					setState(938);
					identifier();
					}
				}

				setState(941);
				match(T__2);
				setState(942);
				param_type_list();
				setState(944);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(943);
					match(NEWLINE);
					}
				}

				setState(947);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16))) != 0) || _la==PRE_OTHER || _la==PRE_ATTRIBUTE) {
					{
					setState(946);
					pre_other();
					}
				}

				setState(954);
				_la = _input.LA(1);
				if (_la==T__3) {
					{
					setState(949);
					match(T__3);
					setState(951);
					_la = _input.LA(1);
					if (_la==NEWLINE) {
						{
						setState(950);
						match(NEWLINE);
						}
					}

					setState(953);
					argument();
					}
				}

				setState(956);
				match(T__0);
				}
				break;
			case 4:
				_localctx = new StructUnionEnumContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(962);
				_la = _input.LA(1);
				if (_la==CV_QUALIFIER) {
					{
					setState(958);
					match(CV_QUALIFIER);
					setState(960);
					_la = _input.LA(1);
					if (_la==NEWLINE) {
						{
						setState(959);
						match(NEWLINE);
						}
					}

					}
				}

				setState(968);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__7))) != 0) || _la==STATIC || _la==VIRTUAL) {
					{
					setState(964);
					function_decl_specifiers();
					setState(966);
					_la = _input.LA(1);
					if (_la==NEWLINE) {
						{
						setState(965);
						match(NEWLINE);
						}
					}

					}
				}

				setState(974);
				_la = _input.LA(1);
				if (_la==TYPEDEF) {
					{
					setState(970);
					match(TYPEDEF);
					setState(972);
					_la = _input.LA(1);
					if (_la==NEWLINE) {
						{
						setState(971);
						match(NEWLINE);
						}
					}

					}
				}

				setState(976);
				special_datatype();
				setState(978);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,114,_ctx) ) {
				case 1:
					{
					setState(977);
					match(NEWLINE);
					}
					break;
				}
				setState(981);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,115,_ctx) ) {
				case 1:
					{
					setState(980);
					init_declarator_list();
					}
					break;
				}
				setState(984);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,116,_ctx) ) {
				case 1:
					{
					setState(983);
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

	public static class CallingConventionContext extends ParserRuleContext {
		public List<TerminalNode> ALPHA_NUMERIC() { return getTokens(ModuleParser.ALPHA_NUMERIC); }
		public TerminalNode ALPHA_NUMERIC(int i) {
			return getToken(ModuleParser.ALPHA_NUMERIC, i);
		}
		public CallingConventionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callingConvention; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterCallingConvention(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitCallingConvention(this);
		}
	}

	public final CallingConventionContext callingConvention() throws RecognitionException {
		CallingConventionContext _localctx = new CallingConventionContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_callingConvention);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(989); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(988);
				match(ALPHA_NUMERIC);
				}
				}
				setState(991); 
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

	public static class Special_datatypeContext extends ParserRuleContext {
		public TerminalNode SPECIAL_DATA() { return getToken(ModuleParser.SPECIAL_DATA, 0); }
		public TerminalNode OPENING_CURLY() { return getToken(ModuleParser.OPENING_CURLY, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(ModuleParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(ModuleParser.NEWLINE, i);
		}
		public List<Pre_otherContext> pre_other() {
			return getRuleContexts(Pre_otherContext.class);
		}
		public Pre_otherContext pre_other(int i) {
			return getRuleContext(Pre_otherContext.class,i);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<PtrsContext> ptrs() {
			return getRuleContexts(PtrsContext.class);
		}
		public PtrsContext ptrs(int i) {
			return getRuleContext(PtrsContext.class,i);
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
		enterRule(_localctx, 152, RULE_special_datatype);
		int _la;
		try {
			setState(1040);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,131,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(993);
				match(SPECIAL_DATA);
				setState(995);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(994);
					match(NEWLINE);
					}
				}

				setState(998);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,120,_ctx) ) {
				case 1:
					{
					setState(997);
					pre_other();
					}
					break;
				}
				setState(1004);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__9) | (1L << T__10))) != 0) || ((((_la - 98)) & ~0x3f) == 0 && ((1L << (_la - 98)) & ((1L << (NEW - 98)) | (1L << (PRE_PRAGMA_KEYWORDS - 98)) | (1L << (ALPHA_NUMERIC - 98)))) != 0)) {
					{
					setState(1000);
					identifier();
					setState(1002);
					_la = _input.LA(1);
					if (_la==NEWLINE) {
						{
						setState(1001);
						match(NEWLINE);
						}
					}

					}
				}

				setState(1007);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16))) != 0) || _la==PRE_OTHER || _la==PRE_ATTRIBUTE) {
					{
					setState(1006);
					pre_other();
					}
				}

				setState(1009);
				match(OPENING_CURLY);
				skipToEndOfObject(); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1011);
				match(SPECIAL_DATA);
				setState(1013);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1012);
					match(NEWLINE);
					}
				}

				setState(1016);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16))) != 0) || _la==PRE_OTHER || _la==PRE_ATTRIBUTE) {
					{
					setState(1015);
					pre_other();
					}
				}

				setState(1018);
				identifier();
				setState(1020);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1019);
					match(NEWLINE);
					}
				}

				setState(1023);
				_la = _input.LA(1);
				if (_la==T__17 || _la==T__18) {
					{
					setState(1022);
					ptrs();
					}
				}

				setState(1025);
				identifier();
				setState(1027);
				_la = _input.LA(1);
				if (_la==T__17 || _la==T__18) {
					{
					setState(1026);
					ptrs();
					}
				}

				setState(1029);
				match(T__3);
				skipToEndOfObject(); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1032);
				match(SPECIAL_DATA);
				setState(1034);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1033);
					match(NEWLINE);
					}
				}

				setState(1037);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16))) != 0) || _la==PRE_OTHER || _la==PRE_ATTRIBUTE) {
					{
					setState(1036);
					pre_other();
					}
				}

				setState(1039);
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
		public Pre_otherContext pre_other() {
			return getRuleContext(Pre_otherContext.class,0);
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
		enterRule(_localctx, 154, RULE_init_declarator_list);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1042);
			init_declarator();
			setState(1053);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,134,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1044);
					_la = _input.LA(1);
					if (_la==NEWLINE) {
						{
						setState(1043);
						match(NEWLINE);
						}
					}

					setState(1046);
					match(T__12);
					setState(1048);
					_la = _input.LA(1);
					if (_la==NEWLINE) {
						{
						setState(1047);
						match(NEWLINE);
						}
					}

					setState(1050);
					init_declarator();
					}
					} 
				}
				setState(1055);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,134,_ctx);
			}
			setState(1057);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(1056);
				match(NEWLINE);
				}
			}

			setState(1060);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16))) != 0) || _la==PRE_OTHER || _la==PRE_ATTRIBUTE) {
				{
				setState(1059);
				pre_other();
				}
			}

			setState(1062);
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

	public static class Class_defContext extends ParserRuleContext {
		public TerminalNode CLASS_KEY() { return getToken(ModuleParser.CLASS_KEY, 0); }
		public TerminalNode OPENING_CURLY() { return getToken(ModuleParser.OPENING_CURLY, 0); }
		public TerminalNode NEWLINE() { return getToken(ModuleParser.NEWLINE, 0); }
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
		enterRule(_localctx, 156, RULE_class_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1064);
			match(CLASS_KEY);
			setState(1066);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(1065);
				match(NEWLINE);
				}
			}

			setState(1069);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__9) | (1L << T__10))) != 0) || ((((_la - 98)) & ~0x3f) == 0 && ((1L << (_la - 98)) & ((1L << (NEW - 98)) | (1L << (PRE_PRAGMA_KEYWORDS - 98)) | (1L << (ALPHA_NUMERIC - 98)))) != 0)) {
				{
				setState(1068);
				class_name();
				}
			}

			setState(1072);
			_la = _input.LA(1);
			if (_la==T__55) {
				{
				setState(1071);
				base_classes();
				}
			}

			setState(1074);
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
		enterRule(_localctx, 158, RULE_class_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1077);
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
		enterRule(_localctx, 160, RULE_base_classes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1079);
			match(T__55);
			setState(1080);
			base_class();
			setState(1085);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__12) {
				{
				{
				setState(1081);
				match(T__12);
				setState(1082);
				base_class();
				}
				}
				setState(1087);
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
		public TerminalNode NEWLINE() { return getToken(ModuleParser.NEWLINE, 0); }
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
		enterRule(_localctx, 162, RULE_base_class);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1092);
			_la = _input.LA(1);
			if (_la==VIRTUAL) {
				{
				setState(1088);
				match(VIRTUAL);
				setState(1090);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1089);
					match(NEWLINE);
					}
				}

				}
			}

			setState(1095);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,143,_ctx) ) {
			case 1:
				{
				setState(1094);
				access_specifier();
				}
				break;
			}
			setState(1097);
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
		public List<TerminalNode> EXTERN() { return getTokens(ModuleParser.EXTERN); }
		public TerminalNode EXTERN(int i) {
			return getToken(ModuleParser.EXTERN, i);
		}
		public List<Function_decl_specifiersContext> function_decl_specifiers() {
			return getRuleContexts(Function_decl_specifiersContext.class);
		}
		public Function_decl_specifiersContext function_decl_specifiers(int i) {
			return getRuleContext(Function_decl_specifiersContext.class,i);
		}
		public List<TerminalNode> CV_QUALIFIER() { return getTokens(ModuleParser.CV_QUALIFIER); }
		public TerminalNode CV_QUALIFIER(int i) {
			return getToken(ModuleParser.CV_QUALIFIER, i);
		}
		public List<TerminalNode> UNSIGNED() { return getTokens(ModuleParser.UNSIGNED); }
		public TerminalNode UNSIGNED(int i) {
			return getToken(ModuleParser.UNSIGNED, i);
		}
		public List<TerminalNode> SIGNED() { return getTokens(ModuleParser.SIGNED); }
		public TerminalNode SIGNED(int i) {
			return getToken(ModuleParser.SIGNED, i);
		}
		public List<Ptr_operatorContext> ptr_operator() {
			return getRuleContexts(Ptr_operatorContext.class);
		}
		public Ptr_operatorContext ptr_operator(int i) {
			return getRuleContext(Ptr_operatorContext.class,i);
		}
		public List<Base_typeContext> base_type() {
			return getRuleContexts(Base_typeContext.class);
		}
		public Base_typeContext base_type(int i) {
			return getRuleContext(Base_typeContext.class,i);
		}
		public List<MacroCallContext> macroCall() {
			return getRuleContexts(MacroCallContext.class);
		}
		public MacroCallContext macroCall(int i) {
			return getRuleContext(MacroCallContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(ModuleParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(ModuleParser.NEWLINE, i);
		}
		public List<Template_param_listContext> template_param_list() {
			return getRuleContexts(Template_param_listContext.class);
		}
		public Template_param_listContext template_param_list(int i) {
			return getRuleContext(Template_param_listContext.class,i);
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
		enterRule(_localctx, 164, RULE_type_name);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1142); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(1142);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,152,_ctx) ) {
					case 1:
						{
						setState(1099);
						match(EXTERN);
						setState(1101);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,144,_ctx) ) {
						case 1:
							{
							setState(1100);
							match(NEWLINE);
							}
							break;
						}
						}
						break;
					case 2:
						{
						setState(1103);
						function_decl_specifiers();
						setState(1105);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,145,_ctx) ) {
						case 1:
							{
							setState(1104);
							match(NEWLINE);
							}
							break;
						}
						}
						break;
					case 3:
						{
						setState(1107);
						match(CV_QUALIFIER);
						setState(1109);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,146,_ctx) ) {
						case 1:
							{
							setState(1108);
							match(NEWLINE);
							}
							break;
						}
						}
						break;
					case 4:
						{
						setState(1111);
						match(UNSIGNED);
						setState(1113);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,147,_ctx) ) {
						case 1:
							{
							setState(1112);
							match(NEWLINE);
							}
							break;
						}
						}
						break;
					case 5:
						{
						setState(1115);
						match(SIGNED);
						setState(1117);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,148,_ctx) ) {
						case 1:
							{
							setState(1116);
							match(NEWLINE);
							}
							break;
						}
						}
						break;
					case 6:
						{
						setState(1119);
						ptr_operator();
						setState(1121);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,149,_ctx) ) {
						case 1:
							{
							setState(1120);
							match(NEWLINE);
							}
							break;
						}
						}
						break;
					case 7:
						{
						setState(1123);
						base_type();
						}
						break;
					case 8:
						{
						{
						{
						setState(1124);
						match(T__23);
						setState(1125);
						template_param_list();
						setState(1126);
						match(T__24);
						}
						setState(1138);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,151,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(1128);
								match(T__56);
								setState(1129);
								base_type();
								setState(1134);
								_errHandler.sync(this);
								switch ( getInterpreter().adaptivePredict(_input,150,_ctx) ) {
								case 1:
									{
									setState(1130);
									match(T__23);
									setState(1131);
									template_param_list();
									setState(1132);
									match(T__24);
									}
									break;
								}
								}
								} 
							}
							setState(1140);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,151,_ctx);
						}
						}
						}
						break;
					case 9:
						{
						setState(1141);
						macroCall();
						}
						break;
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1144); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,153,_ctx);
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

	public static class Base_typeContext extends ParserRuleContext {
		public List<TerminalNode> VOID() { return getTokens(ModuleParser.VOID); }
		public TerminalNode VOID(int i) {
			return getToken(ModuleParser.VOID, i);
		}
		public List<TerminalNode> SPECIAL_DATA() { return getTokens(ModuleParser.SPECIAL_DATA); }
		public TerminalNode SPECIAL_DATA(int i) {
			return getToken(ModuleParser.SPECIAL_DATA, i);
		}
		public List<TerminalNode> CLASS_KEY() { return getTokens(ModuleParser.CLASS_KEY); }
		public TerminalNode CLASS_KEY(int i) {
			return getToken(ModuleParser.CLASS_KEY, i);
		}
		public List<TerminalNode> ALPHA_NUMERIC() { return getTokens(ModuleParser.ALPHA_NUMERIC); }
		public TerminalNode ALPHA_NUMERIC(int i) {
			return getToken(ModuleParser.ALPHA_NUMERIC, i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(ModuleParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(ModuleParser.NEWLINE, i);
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
		enterRule(_localctx, 166, RULE_base_type);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1174); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(1174);
					switch (_input.LA(1)) {
					case VOID:
						{
						setState(1146);
						match(VOID);
						setState(1148);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,154,_ctx) ) {
						case 1:
							{
							setState(1147);
							match(NEWLINE);
							}
							break;
						}
						}
						break;
					case T__11:
						{
						setState(1150);
						match(T__11);
						setState(1152);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,155,_ctx) ) {
						case 1:
							{
							setState(1151);
							match(NEWLINE);
							}
							break;
						}
						}
						break;
					case T__57:
						{
						setState(1154);
						match(T__57);
						setState(1156);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,156,_ctx) ) {
						case 1:
							{
							setState(1155);
							match(NEWLINE);
							}
							break;
						}
						}
						break;
					case T__58:
						{
						setState(1158);
						match(T__58);
						setState(1160);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,157,_ctx) ) {
						case 1:
							{
							setState(1159);
							match(NEWLINE);
							}
							break;
						}
						}
						break;
					case SPECIAL_DATA:
						{
						setState(1162);
						match(SPECIAL_DATA);
						setState(1164);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,158,_ctx) ) {
						case 1:
							{
							setState(1163);
							match(NEWLINE);
							}
							break;
						}
						}
						break;
					case CLASS_KEY:
						{
						setState(1166);
						match(CLASS_KEY);
						setState(1168);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,159,_ctx) ) {
						case 1:
							{
							setState(1167);
							match(NEWLINE);
							}
							break;
						}
						}
						break;
					case ALPHA_NUMERIC:
						{
						setState(1170);
						match(ALPHA_NUMERIC);
						setState(1172);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,160,_ctx) ) {
						case 1:
							{
							setState(1171);
							match(NEWLINE);
							}
							break;
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1176); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,162,_ctx);
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
		public TerminalNode NEWLINE() { return getToken(ModuleParser.NEWLINE, 0); }
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
		enterRule(_localctx, 168, RULE_param_decl_specifiers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1186);
			switch (_input.LA(1)) {
			case AUTO:
				{
				setState(1178);
				match(AUTO);
				setState(1180);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1179);
					match(NEWLINE);
					}
				}

				}
				break;
			case REGISTER:
				{
				setState(1182);
				match(REGISTER);
				setState(1184);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1183);
					match(NEWLINE);
					}
				}

				}
				break;
			case T__4:
			case T__5:
			case T__6:
			case T__7:
			case T__8:
			case T__9:
			case T__10:
			case T__11:
			case T__17:
			case T__18:
			case T__23:
			case T__57:
			case T__58:
			case STATIC:
			case VOID:
			case UNSIGNED:
			case SIGNED:
			case CV_QUALIFIER:
			case EXTERN:
			case VIRTUAL:
			case SPECIAL_DATA:
			case OPERATOR:
			case CLASS_KEY:
			case NEW:
			case PRE_PRAGMA_KEYWORDS:
			case END_TEST:
			case ALPHA_NUMERIC:
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1188);
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
		public TerminalNode NEWLINE() { return getToken(ModuleParser.NEWLINE, 0); }
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
		enterRule(_localctx, 170, RULE_parameter_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1190);
			identifier();
			setState(1192);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(1191);
				match(NEWLINE);
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

	public static class Param_type_listContext extends ParserRuleContext {
		public TerminalNode VOID() { return getToken(ModuleParser.VOID, 0); }
		public List<Param_typeContext> param_type() {
			return getRuleContexts(Param_typeContext.class);
		}
		public Param_typeContext param_type(int i) {
			return getRuleContext(Param_typeContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(ModuleParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(ModuleParser.NEWLINE, i);
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
		enterRule(_localctx, 172, RULE_param_type_list);
		int _la;
		try {
			setState(1212);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,170,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1194);
				match(T__1);
				setState(1195);
				match(VOID);
				setState(1196);
				match(T__2);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1197);
				match(T__1);
				setState(1209);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__17) | (1L << T__18) | (1L << T__23) | (1L << T__57) | (1L << T__58))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (ELLIPSIS - 67)) | (1L << (STATIC - 67)) | (1L << (VOID - 67)) | (1L << (UNSIGNED - 67)) | (1L << (SIGNED - 67)) | (1L << (CV_QUALIFIER - 67)) | (1L << (EXTERN - 67)) | (1L << (VIRTUAL - 67)) | (1L << (AUTO - 67)) | (1L << (REGISTER - 67)) | (1L << (SPECIAL_DATA - 67)) | (1L << (OPERATOR - 67)) | (1L << (CLASS_KEY - 67)) | (1L << (NEW - 67)) | (1L << (PRE_PRAGMA_KEYWORDS - 67)) | (1L << (END_TEST - 67)) | (1L << (ALPHA_NUMERIC - 67)))) != 0)) {
					{
					setState(1198);
					param_type();
					setState(1206);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__12) {
						{
						{
						setState(1199);
						match(T__12);
						setState(1201);
						_la = _input.LA(1);
						if (_la==NEWLINE) {
							{
							setState(1200);
							match(NEWLINE);
							}
						}

						setState(1203);
						param_type();
						}
						}
						setState(1208);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(1211);
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
		public TerminalNode NEWLINE() { return getToken(ModuleParser.NEWLINE, 0); }
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
		enterRule(_localctx, 174, RULE_param_type);
		int _la;
		try {
			setState(1221);
			switch (_input.LA(1)) {
			case T__4:
			case T__5:
			case T__6:
			case T__7:
			case T__8:
			case T__9:
			case T__10:
			case T__11:
			case T__17:
			case T__18:
			case T__23:
			case T__57:
			case T__58:
			case STATIC:
			case VOID:
			case UNSIGNED:
			case SIGNED:
			case CV_QUALIFIER:
			case EXTERN:
			case VIRTUAL:
			case AUTO:
			case REGISTER:
			case SPECIAL_DATA:
			case OPERATOR:
			case CLASS_KEY:
			case NEW:
			case PRE_PRAGMA_KEYWORDS:
			case END_TEST:
			case ALPHA_NUMERIC:
				enterOuterAlt(_localctx, 1);
				{
				setState(1214);
				param_decl_specifiers();
				setState(1216);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1215);
					match(NEWLINE);
					}
				}

				setState(1218);
				param_type_id();
				}
				break;
			case ELLIPSIS:
				enterOuterAlt(_localctx, 2);
				{
				setState(1220);
				match(ELLIPSIS);
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
		enterRule(_localctx, 176, RULE_param_type_id);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1224);
			_la = _input.LA(1);
			if (_la==T__17 || _la==T__18) {
				{
				setState(1223);
				ptrs();
				}
			}

			setState(1233);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,175,_ctx) ) {
			case 1:
				{
				setState(1226);
				match(T__1);
				setState(1227);
				param_type_id();
				setState(1228);
				match(T__2);
				}
				break;
			case 2:
				{
				setState(1231);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__9) | (1L << T__10))) != 0) || ((((_la - 98)) & ~0x3f) == 0 && ((1L << (_la - 98)) & ((1L << (NEW - 98)) | (1L << (PRE_PRAGMA_KEYWORDS - 98)) | (1L << (ALPHA_NUMERIC - 98)))) != 0)) {
					{
					setState(1230);
					parameter_name();
					}
				}

				}
				break;
			}
			setState(1236);
			_la = _input.LA(1);
			if (_la==T__1 || _la==T__28) {
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

	public static class IdentifierContext extends ParserRuleContext {
		public List<TerminalNode> ALPHA_NUMERIC() { return getTokens(ModuleParser.ALPHA_NUMERIC); }
		public TerminalNode ALPHA_NUMERIC(int i) {
			return getToken(ModuleParser.ALPHA_NUMERIC, i);
		}
		public TerminalNode NEW() { return getToken(ModuleParser.NEW, 0); }
		public TerminalNode PRE_PRAGMA_KEYWORDS() { return getToken(ModuleParser.PRE_PRAGMA_KEYWORDS, 0); }
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
		enterRule(_localctx, 178, RULE_identifier);
		try {
			int _alt;
			setState(1249);
			switch (_input.LA(1)) {
			case ALPHA_NUMERIC:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(1238);
				match(ALPHA_NUMERIC);
				setState(1243);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,177,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1239);
						match(T__56);
						setState(1240);
						match(ALPHA_NUMERIC);
						}
						} 
					}
					setState(1245);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,177,_ctx);
				}
				}
				}
				break;
			case NEW:
				enterOuterAlt(_localctx, 2);
				{
				setState(1246);
				match(NEW);
				}
				break;
			case PRE_PRAGMA_KEYWORDS:
				enterOuterAlt(_localctx, 3);
				{
				setState(1247);
				match(PRE_PRAGMA_KEYWORDS);
				}
				break;
			case T__8:
			case T__9:
			case T__10:
				enterOuterAlt(_localctx, 4);
				{
				setState(1248);
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
		enterRule(_localctx, 180, RULE_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1251);
			_la = _input.LA(1);
			if ( !(((((_la - 119)) & ~0x3f) == 0 && ((1L << (_la - 119)) & ((1L << (HEX_LITERAL - 119)) | (1L << (DECIMAL_LITERAL - 119)) | (1L << (OCTAL_LITERAL - 119)))) != 0)) ) {
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
		enterRule(_localctx, 182, RULE_ptrs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1257); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1253);
				ptr_operator();
				setState(1255);
				_la = _input.LA(1);
				if (_la==T__59) {
					{
					setState(1254);
					match(T__59);
					}
				}

				}
				}
				setState(1259); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__17 || _la==T__18 );
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
		enterRule(_localctx, 184, RULE_func_ptrs);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1261);
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
		public List<TerminalNode> COMMENT() { return getTokens(ModuleParser.COMMENT); }
		public TerminalNode COMMENT(int i) {
			return getToken(ModuleParser.COMMENT, i);
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
		enterRule(_localctx, 186, RULE_expr);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1263);
			assign_expr();
			setState(1268);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,181,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1264);
					match(ESCAPE);
					setState(1265);
					match(NEWLINE);
					}
					} 
				}
				setState(1270);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,181,_ctx);
			}
			setState(1291);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,188,_ctx) ) {
			case 1:
				{
				setState(1272);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,182,_ctx) ) {
				case 1:
					{
					setState(1271);
					match(NEWLINE);
					}
					break;
				}
				setState(1275);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(1274);
					match(COMMENT);
					}
				}

				setState(1278);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1277);
					match(NEWLINE);
					}
				}

				setState(1280);
				match(T__12);
				setState(1282);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,185,_ctx) ) {
				case 1:
					{
					setState(1281);
					match(NEWLINE);
					}
					break;
				}
				setState(1285);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(1284);
					match(COMMENT);
					}
				}

				setState(1288);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1287);
					match(NEWLINE);
					}
				}

				setState(1290);
				expr();
				}
				break;
			}
			setState(1297);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,189,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1293);
					match(ESCAPE);
					setState(1294);
					match(NEWLINE);
					}
					} 
				}
				setState(1299);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,189,_ctx);
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
		public List<TerminalNode> COMMENT() { return getTokens(ModuleParser.COMMENT); }
		public TerminalNode COMMENT(int i) {
			return getToken(ModuleParser.COMMENT, i);
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
		enterRule(_localctx, 188, RULE_assign_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1300);
			conditional_expression();
			setState(1322);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,196,_ctx) ) {
			case 1:
				{
				setState(1302);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,190,_ctx) ) {
				case 1:
					{
					setState(1301);
					match(NEWLINE);
					}
					break;
				}
				setState(1305);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(1304);
					match(COMMENT);
					}
				}

				setState(1308);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1307);
					match(NEWLINE);
					}
				}

				setState(1310);
				assignment_operator();
				setState(1312);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,193,_ctx) ) {
				case 1:
					{
					setState(1311);
					match(NEWLINE);
					}
					break;
				}
				setState(1315);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(1314);
					match(COMMENT);
					}
				}

				setState(1318);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1317);
					match(NEWLINE);
					}
				}

				setState(1320);
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
		public List<TerminalNode> COMMENT() { return getTokens(ModuleParser.COMMENT); }
		public TerminalNode COMMENT(int i) {
			return getToken(ModuleParser.COMMENT, i);
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
		enterRule(_localctx, 190, RULE_conditional_expression);
		int _la;
		try {
			setState(1367);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,209,_ctx) ) {
			case 1:
				_localctx = new NormOrContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1324);
				or_expression();
				}
				break;
			case 2:
				_localctx = new CndExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1325);
				or_expression();
				{
				setState(1327);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,197,_ctx) ) {
				case 1:
					{
					setState(1326);
					match(NEWLINE);
					}
					break;
				}
				setState(1330);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(1329);
					match(COMMENT);
					}
				}

				setState(1333);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1332);
					match(NEWLINE);
					}
				}

				setState(1335);
				match(T__60);
				setState(1337);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,200,_ctx) ) {
				case 1:
					{
					setState(1336);
					match(NEWLINE);
					}
					break;
				}
				setState(1340);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(1339);
					match(COMMENT);
					}
				}

				setState(1343);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1342);
					match(NEWLINE);
					}
				}

				setState(1345);
				expr();
				setState(1347);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,203,_ctx) ) {
				case 1:
					{
					setState(1346);
					match(NEWLINE);
					}
					break;
				}
				setState(1350);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(1349);
					match(COMMENT);
					}
				}

				setState(1353);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1352);
					match(NEWLINE);
					}
				}

				setState(1355);
				match(T__55);
				setState(1357);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,206,_ctx) ) {
				case 1:
					{
					setState(1356);
					match(NEWLINE);
					}
					break;
				}
				setState(1360);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(1359);
					match(COMMENT);
					}
				}

				setState(1363);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1362);
					match(NEWLINE);
					}
				}

				setState(1365);
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
		public List<TerminalNode> COMMENT() { return getTokens(ModuleParser.COMMENT); }
		public TerminalNode COMMENT(int i) {
			return getToken(ModuleParser.COMMENT, i);
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
		enterRule(_localctx, 192, RULE_or_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1369);
			and_expression();
			setState(1390);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,216,_ctx) ) {
			case 1:
				{
				setState(1371);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,210,_ctx) ) {
				case 1:
					{
					setState(1370);
					match(NEWLINE);
					}
					break;
				}
				setState(1374);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(1373);
					match(COMMENT);
					}
				}

				setState(1377);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1376);
					match(NEWLINE);
					}
				}

				setState(1379);
				match(T__49);
				setState(1381);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,213,_ctx) ) {
				case 1:
					{
					setState(1380);
					match(NEWLINE);
					}
					break;
				}
				setState(1384);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(1383);
					match(COMMENT);
					}
				}

				setState(1387);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1386);
					match(NEWLINE);
					}
				}

				setState(1389);
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
		public List<TerminalNode> COMMENT() { return getTokens(ModuleParser.COMMENT); }
		public TerminalNode COMMENT(int i) {
			return getToken(ModuleParser.COMMENT, i);
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
		enterRule(_localctx, 194, RULE_and_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1392);
			inclusive_or_expression();
			setState(1413);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,223,_ctx) ) {
			case 1:
				{
				setState(1394);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,217,_ctx) ) {
				case 1:
					{
					setState(1393);
					match(NEWLINE);
					}
					break;
				}
				setState(1397);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(1396);
					match(COMMENT);
					}
				}

				setState(1400);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1399);
					match(NEWLINE);
					}
				}

				setState(1402);
				match(T__48);
				setState(1404);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,220,_ctx) ) {
				case 1:
					{
					setState(1403);
					match(NEWLINE);
					}
					break;
				}
				setState(1407);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(1406);
					match(COMMENT);
					}
				}

				setState(1410);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1409);
					match(NEWLINE);
					}
				}

				setState(1412);
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
		public List<TerminalNode> COMMENT() { return getTokens(ModuleParser.COMMENT); }
		public TerminalNode COMMENT(int i) {
			return getToken(ModuleParser.COMMENT, i);
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
		enterRule(_localctx, 196, RULE_inclusive_or_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1415);
			exclusive_or_expression();
			setState(1436);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,230,_ctx) ) {
			case 1:
				{
				setState(1417);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,224,_ctx) ) {
				case 1:
					{
					setState(1416);
					match(NEWLINE);
					}
					break;
				}
				setState(1420);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(1419);
					match(COMMENT);
					}
				}

				setState(1423);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1422);
					match(NEWLINE);
					}
				}

				setState(1425);
				match(T__33);
				setState(1427);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,227,_ctx) ) {
				case 1:
					{
					setState(1426);
					match(NEWLINE);
					}
					break;
				}
				setState(1430);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(1429);
					match(COMMENT);
					}
				}

				setState(1433);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1432);
					match(NEWLINE);
					}
				}

				setState(1435);
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
		public List<TerminalNode> COMMENT() { return getTokens(ModuleParser.COMMENT); }
		public TerminalNode COMMENT(int i) {
			return getToken(ModuleParser.COMMENT, i);
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
		enterRule(_localctx, 198, RULE_exclusive_or_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1438);
			bit_and_expression();
			setState(1459);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,237,_ctx) ) {
			case 1:
				{
				setState(1440);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,231,_ctx) ) {
				case 1:
					{
					setState(1439);
					match(NEWLINE);
					}
					break;
				}
				setState(1443);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(1442);
					match(COMMENT);
					}
				}

				setState(1446);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1445);
					match(NEWLINE);
					}
				}

				setState(1448);
				match(T__32);
				setState(1450);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,234,_ctx) ) {
				case 1:
					{
					setState(1449);
					match(NEWLINE);
					}
					break;
				}
				setState(1453);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(1452);
					match(COMMENT);
					}
				}

				setState(1456);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1455);
					match(NEWLINE);
					}
				}

				setState(1458);
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
		public List<TerminalNode> COMMENT() { return getTokens(ModuleParser.COMMENT); }
		public TerminalNode COMMENT(int i) {
			return getToken(ModuleParser.COMMENT, i);
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
		enterRule(_localctx, 200, RULE_bit_and_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1461);
			equality_expression();
			setState(1482);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,244,_ctx) ) {
			case 1:
				{
				setState(1463);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,238,_ctx) ) {
				case 1:
					{
					setState(1462);
					match(NEWLINE);
					}
					break;
				}
				setState(1466);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(1465);
					match(COMMENT);
					}
				}

				setState(1469);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1468);
					match(NEWLINE);
					}
				}

				setState(1471);
				match(T__17);
				setState(1473);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,241,_ctx) ) {
				case 1:
					{
					setState(1472);
					match(NEWLINE);
					}
					break;
				}
				setState(1476);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(1475);
					match(COMMENT);
					}
				}

				setState(1479);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1478);
					match(NEWLINE);
					}
				}

				setState(1481);
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
		public List<TerminalNode> COMMENT() { return getTokens(ModuleParser.COMMENT); }
		public TerminalNode COMMENT(int i) {
			return getToken(ModuleParser.COMMENT, i);
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
		enterRule(_localctx, 202, RULE_equality_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1484);
			relational_expression();
			setState(1506);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,251,_ctx) ) {
			case 1:
				{
				setState(1486);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,245,_ctx) ) {
				case 1:
					{
					setState(1485);
					match(NEWLINE);
					}
					break;
				}
				setState(1489);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(1488);
					match(COMMENT);
					}
				}

				setState(1492);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1491);
					match(NEWLINE);
					}
				}

				setState(1494);
				equality_operator();
				setState(1496);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,248,_ctx) ) {
				case 1:
					{
					setState(1495);
					match(NEWLINE);
					}
					break;
				}
				setState(1499);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(1498);
					match(COMMENT);
					}
				}

				setState(1502);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1501);
					match(NEWLINE);
					}
				}

				setState(1504);
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
		public List<TerminalNode> COMMENT() { return getTokens(ModuleParser.COMMENT); }
		public TerminalNode COMMENT(int i) {
			return getToken(ModuleParser.COMMENT, i);
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
		enterRule(_localctx, 204, RULE_relational_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1508);
			shift_expression();
			setState(1530);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,258,_ctx) ) {
			case 1:
				{
				setState(1510);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,252,_ctx) ) {
				case 1:
					{
					setState(1509);
					match(NEWLINE);
					}
					break;
				}
				setState(1513);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(1512);
					match(COMMENT);
					}
				}

				setState(1516);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1515);
					match(NEWLINE);
					}
				}

				setState(1518);
				relational_operator();
				setState(1520);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,255,_ctx) ) {
				case 1:
					{
					setState(1519);
					match(NEWLINE);
					}
					break;
				}
				setState(1523);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(1522);
					match(COMMENT);
					}
				}

				setState(1526);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1525);
					match(NEWLINE);
					}
				}

				setState(1528);
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
		public List<TerminalNode> COMMENT() { return getTokens(ModuleParser.COMMENT); }
		public TerminalNode COMMENT(int i) {
			return getToken(ModuleParser.COMMENT, i);
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
		enterRule(_localctx, 206, RULE_shift_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1532);
			additive_expression();
			setState(1553);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,265,_ctx) ) {
			case 1:
				{
				setState(1534);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,259,_ctx) ) {
				case 1:
					{
					setState(1533);
					match(NEWLINE);
					}
					break;
				}
				setState(1537);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(1536);
					match(COMMENT);
					}
				}

				setState(1540);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1539);
					match(NEWLINE);
					}
				}

				setState(1542);
				_la = _input.LA(1);
				if ( !(_la==T__42 || _la==T__43) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(1544);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,262,_ctx) ) {
				case 1:
					{
					setState(1543);
					match(NEWLINE);
					}
					break;
				}
				setState(1547);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(1546);
					match(COMMENT);
					}
				}

				setState(1550);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1549);
					match(NEWLINE);
					}
				}

				setState(1552);
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
		public List<TerminalNode> COMMENT() { return getTokens(ModuleParser.COMMENT); }
		public TerminalNode COMMENT(int i) {
			return getToken(ModuleParser.COMMENT, i);
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
		enterRule(_localctx, 208, RULE_additive_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1555);
			multiplicative_expression();
			setState(1576);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,272,_ctx) ) {
			case 1:
				{
				setState(1557);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,266,_ctx) ) {
				case 1:
					{
					setState(1556);
					match(NEWLINE);
					}
					break;
				}
				setState(1560);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(1559);
					match(COMMENT);
					}
				}

				setState(1563);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1562);
					match(NEWLINE);
					}
				}

				setState(1565);
				_la = _input.LA(1);
				if ( !(_la==T__19 || _la==T__20) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(1567);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,269,_ctx) ) {
				case 1:
					{
					setState(1566);
					match(NEWLINE);
					}
					break;
				}
				setState(1570);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(1569);
					match(COMMENT);
					}
				}

				setState(1573);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1572);
					match(NEWLINE);
					}
				}

				setState(1575);
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
		public Function_pointer_use_expressionContext function_pointer_use_expression() {
			return getRuleContext(Function_pointer_use_expressionContext.class,0);
		}
		public Multiplicative_expressionContext multiplicative_expression() {
			return getRuleContext(Multiplicative_expressionContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(ModuleParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(ModuleParser.NEWLINE, i);
		}
		public List<TerminalNode> COMMENT() { return getTokens(ModuleParser.COMMENT); }
		public TerminalNode COMMENT(int i) {
			return getToken(ModuleParser.COMMENT, i);
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
		enterRule(_localctx, 210, RULE_multiplicative_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1578);
			function_pointer_use_expression();
			setState(1599);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,279,_ctx) ) {
			case 1:
				{
				setState(1580);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,273,_ctx) ) {
				case 1:
					{
					setState(1579);
					match(NEWLINE);
					}
					break;
				}
				setState(1583);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(1582);
					match(COMMENT);
					}
				}

				setState(1586);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1585);
					match(NEWLINE);
					}
				}

				setState(1588);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__18) | (1L << T__30) | (1L << T__31))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(1590);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,276,_ctx) ) {
				case 1:
					{
					setState(1589);
					match(NEWLINE);
					}
					break;
				}
				setState(1593);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(1592);
					match(COMMENT);
					}
				}

				setState(1596);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1595);
					match(NEWLINE);
					}
				}

				setState(1598);
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

	public static class Function_pointer_use_expressionContext extends ParserRuleContext {
		public Ptr_operatorContext ptr_operator() {
			return getRuleContext(Ptr_operatorContext.class,0);
		}
		public Argument_listContext argument_list() {
			return getRuleContext(Argument_listContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Cast_expressionContext cast_expression() {
			return getRuleContext(Cast_expressionContext.class,0);
		}
		public Function_pointer_use_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_pointer_use_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterFunction_pointer_use_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitFunction_pointer_use_expression(this);
		}
	}

	public final Function_pointer_use_expressionContext function_pointer_use_expression() throws RecognitionException {
		Function_pointer_use_expressionContext _localctx = new Function_pointer_use_expressionContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_function_pointer_use_expression);
		int _la;
		try {
			setState(1612);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,281,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1601);
				match(T__1);
				setState(1602);
				ptr_operator();
				setState(1604);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__9) | (1L << T__10))) != 0) || ((((_la - 98)) & ~0x3f) == 0 && ((1L << (_la - 98)) & ((1L << (NEW - 98)) | (1L << (PRE_PRAGMA_KEYWORDS - 98)) | (1L << (ALPHA_NUMERIC - 98)))) != 0)) {
					{
					setState(1603);
					identifier();
					}
				}

				setState(1606);
				match(T__2);
				setState(1607);
				match(T__1);
				setState(1608);
				argument_list();
				setState(1609);
				match(T__2);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1611);
				cast_expression();
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
		enterRule(_localctx, 214, RULE_cast_expression);
		try {
			setState(1620);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,282,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(1614);
				match(T__1);
				setState(1615);
				cast_target();
				setState(1616);
				match(T__2);
				setState(1617);
				cast_expression();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1619);
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
		public Function_pointer_use_expressionContext function_pointer_use_expression() {
			return getRuleContext(Function_pointer_use_expressionContext.class,0);
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
		enterRule(_localctx, 216, RULE_cast_target);
		try {
			setState(1626);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,283,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1622);
				type_name();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1623);
				type_name();
				setState(1624);
				function_pointer_use_expression();
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

	public static class Unary_expressionContext extends ParserRuleContext {
		public Address_of_expressionContext address_of_expression() {
			return getRuleContext(Address_of_expressionContext.class,0);
		}
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
		public MacroCallContext macroCall() {
			return getRuleContext(MacroCallContext.class,0);
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
		enterRule(_localctx, 218, RULE_unary_expression);
		try {
			setState(1635);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,284,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1628);
				address_of_expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1629);
				unary_op_and_cast_expr();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1630);
				sizeof_expression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1631);
				new_expression();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1632);
				postfix_expression(0);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1633);
				defined_expression();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1634);
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

	public static class Address_of_expressionContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Address_of_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_address_of_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterAddress_of_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitAddress_of_expression(this);
		}
	}

	public final Address_of_expressionContext address_of_expression() throws RecognitionException {
		Address_of_expressionContext _localctx = new Address_of_expressionContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_address_of_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1637);
			match(T__17);
			setState(1638);
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

	public static class New_expressionContext extends ParserRuleContext {
		public TerminalNode NEW() { return getToken(ModuleParser.NEW, 0); }
		public Type_nameContext type_name() {
			return getRuleContext(Type_nameContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(ModuleParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(ModuleParser.NEWLINE, i);
		}
		public List<TerminalNode> COMMENT() { return getTokens(ModuleParser.COMMENT); }
		public TerminalNode COMMENT(int i) {
			return getToken(ModuleParser.COMMENT, i);
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
		enterRule(_localctx, 222, RULE_new_expression);
		int _la;
		try {
			setState(1698);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,301,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1641);
				_la = _input.LA(1);
				if (_la==T__56) {
					{
					setState(1640);
					match(T__56);
					}
				}

				setState(1643);
				match(NEW);
				setState(1645);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,286,_ctx) ) {
				case 1:
					{
					setState(1644);
					match(NEWLINE);
					}
					break;
				}
				setState(1648);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(1647);
					match(COMMENT);
					}
				}

				setState(1651);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1650);
					match(NEWLINE);
					}
				}

				setState(1653);
				type_name();
				setState(1655);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,289,_ctx) ) {
				case 1:
					{
					setState(1654);
					match(NEWLINE);
					}
					break;
				}
				setState(1658);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(1657);
					match(COMMENT);
					}
				}

				setState(1661);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1660);
					match(NEWLINE);
					}
				}

				setState(1663);
				match(T__28);
				setState(1665);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__50) | (1L << T__51) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (STATIC - 64)) | (1L << (VOID - 64)) | (1L << (UNSIGNED - 64)) | (1L << (SIGNED - 64)) | (1L << (CV_QUALIFIER - 64)) | (1L << (EXTERN - 64)) | (1L << (VIRTUAL - 64)) | (1L << (SPECIAL_DATA - 64)) | (1L << (OPERATOR - 64)) | (1L << (CLASS_KEY - 64)) | (1L << (NEW - 64)) | (1L << (PRE_PRAGMA_KEYWORDS - 64)) | (1L << (END_TEST - 64)) | (1L << (ALPHA_NUMERIC - 64)) | (1L << (OPENING_CURLY - 64)) | (1L << (HEX_LITERAL - 64)) | (1L << (DECIMAL_LITERAL - 64)) | (1L << (OCTAL_LITERAL - 64)) | (1L << (FLOATING_POINT_LITERAL - 64)) | (1L << (CHAR - 64)) | (1L << (STRING - 64)))) != 0)) {
					{
					setState(1664);
					conditional_expression();
					}
				}

				setState(1667);
				match(T__29);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1670);
				_la = _input.LA(1);
				if (_la==T__56) {
					{
					setState(1669);
					match(T__56);
					}
				}

				setState(1672);
				match(NEW);
				setState(1674);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,294,_ctx) ) {
				case 1:
					{
					setState(1673);
					match(NEWLINE);
					}
					break;
				}
				setState(1677);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(1676);
					match(COMMENT);
					}
				}

				setState(1680);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1679);
					match(NEWLINE);
					}
				}

				setState(1682);
				type_name();
				setState(1684);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,297,_ctx) ) {
				case 1:
					{
					setState(1683);
					match(NEWLINE);
					}
					break;
				}
				setState(1687);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(1686);
					match(COMMENT);
					}
				}

				setState(1690);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1689);
					match(NEWLINE);
					}
				}

				setState(1692);
				match(T__1);
				setState(1694);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__50) | (1L << T__51) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (STATIC - 64)) | (1L << (VOID - 64)) | (1L << (UNSIGNED - 64)) | (1L << (SIGNED - 64)) | (1L << (CV_QUALIFIER - 64)) | (1L << (EXTERN - 64)) | (1L << (VIRTUAL - 64)) | (1L << (SPECIAL_DATA - 64)) | (1L << (OPERATOR - 64)) | (1L << (CLASS_KEY - 64)) | (1L << (NEW - 64)) | (1L << (PRE_PRAGMA_KEYWORDS - 64)) | (1L << (END_TEST - 64)) | (1L << (ALPHA_NUMERIC - 64)) | (1L << (OPENING_CURLY - 64)) | (1L << (HEX_LITERAL - 64)) | (1L << (DECIMAL_LITERAL - 64)) | (1L << (OCTAL_LITERAL - 64)) | (1L << (FLOATING_POINT_LITERAL - 64)) | (1L << (CHAR - 64)) | (1L << (STRING - 64)))) != 0)) {
					{
					setState(1693);
					expr();
					}
				}

				setState(1696);
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
		public TerminalNode COMMENT() { return getToken(ModuleParser.COMMENT, 0); }
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
		enterRule(_localctx, 224, RULE_unary_op_and_cast_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1700);
			unary_operator();
			setState(1702);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,302,_ctx) ) {
			case 1:
				{
				setState(1701);
				match(NEWLINE);
				}
				break;
			}
			setState(1705);
			_la = _input.LA(1);
			if (_la==COMMENT) {
				{
				setState(1704);
				match(COMMENT);
				}
			}

			setState(1708);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(1707);
				match(NEWLINE);
				}
			}

			setState(1710);
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
		public TerminalNode COMMENT() { return getToken(ModuleParser.COMMENT, 0); }
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
		enterRule(_localctx, 226, RULE_sizeof_expression);
		int _la;
		try {
			setState(1738);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,311,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1712);
				sizeof();
				setState(1714);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,305,_ctx) ) {
				case 1:
					{
					setState(1713);
					match(NEWLINE);
					}
					break;
				}
				setState(1717);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(1716);
					match(COMMENT);
					}
				}

				setState(1720);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1719);
					match(NEWLINE);
					}
				}

				setState(1722);
				match(T__1);
				setState(1723);
				sizeof_operand();
				setState(1724);
				match(T__2);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1726);
				sizeof();
				setState(1728);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,308,_ctx) ) {
				case 1:
					{
					setState(1727);
					match(NEWLINE);
					}
					break;
				}
				setState(1731);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(1730);
					match(COMMENT);
					}
				}

				setState(1734);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1733);
					match(NEWLINE);
					}
				}

				setState(1736);
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
		enterRule(_localctx, 228, RULE_sizeof);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1740);
			match(T__61);
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
		public TerminalNode COMMENT() { return getToken(ModuleParser.COMMENT, 0); }
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
		enterRule(_localctx, 230, RULE_defined_expression);
		int _la;
		try {
			setState(1767);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,318,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1742);
				match(T__62);
				setState(1744);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,312,_ctx) ) {
				case 1:
					{
					setState(1743);
					match(NEWLINE);
					}
					break;
				}
				setState(1747);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(1746);
					match(COMMENT);
					}
				}

				setState(1750);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1749);
					match(NEWLINE);
					}
				}

				setState(1752);
				match(T__1);
				setState(1753);
				expr();
				setState(1754);
				match(T__2);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1756);
				match(T__62);
				setState(1758);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,315,_ctx) ) {
				case 1:
					{
					setState(1757);
					match(NEWLINE);
					}
					break;
				}
				setState(1761);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(1760);
					match(COMMENT);
					}
				}

				setState(1764);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1763);
					match(NEWLINE);
					}
				}

				setState(1766);
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
		public List<TerminalNode> COMMENT() { return getTokens(ModuleParser.COMMENT); }
		public TerminalNode COMMENT(int i) {
			return getToken(ModuleParser.COMMENT, i);
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
		enterRule(_localctx, 232, RULE_sizeof_operand);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1769);
			type_name();
			setState(1782);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__17 || _la==T__18 || _la==NEWLINE || _la==COMMENT) {
				{
				{
				setState(1771);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,319,_ctx) ) {
				case 1:
					{
					setState(1770);
					match(NEWLINE);
					}
					break;
				}
				setState(1774);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(1773);
					match(COMMENT);
					}
				}

				setState(1777);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1776);
					match(NEWLINE);
					}
				}

				setState(1779);
				ptr_operator();
				}
				}
				setState(1784);
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
		enterRule(_localctx, 234, RULE_sizeof_operand2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1785);
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
		enterRule(_localctx, 236, RULE_inc_dec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1787);
			_la = _input.LA(1);
			if ( !(_la==T__50 || _la==T__51) ) {
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
		public TerminalNode COMMENT() { return getToken(ModuleParser.COMMENT, 0); }
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
		public TerminalNode COMMENT() { return getToken(ModuleParser.COMMENT, 0); }
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
	public static class ArrayAssignContext extends Postfix_expressionContext {
		public Initializer_expressionContext initializer_expression() {
			return getRuleContext(Initializer_expressionContext.class,0);
		}
		public Type_nameContext type_name() {
			return getRuleContext(Type_nameContext.class,0);
		}
		public ArrayAssignContext(Postfix_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterArrayAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitArrayAssign(this);
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
		public Argument_listContext argument_list() {
			return getRuleContext(Argument_listContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(ModuleParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(ModuleParser.NEWLINE, i);
		}
		public TerminalNode COMMENT() { return getToken(ModuleParser.COMMENT, 0); }
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
		public List<TerminalNode> NEWLINE() { return getTokens(ModuleParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(ModuleParser.NEWLINE, i);
		}
		public TerminalNode COMMENT() { return getToken(ModuleParser.COMMENT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
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
		public TerminalNode COMMENT() { return getToken(ModuleParser.COMMENT, 0); }
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
		int _startState = 238;
		enterRecursionRule(_localctx, 238, RULE_postfix_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1813);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,329,_ctx) ) {
			case 1:
				{
				_localctx = new ArrayAssignContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(1791);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__17) | (1L << T__18) | (1L << T__23) | (1L << T__57) | (1L << T__58))) != 0) || ((((_la - 80)) & ~0x3f) == 0 && ((1L << (_la - 80)) & ((1L << (STATIC - 80)) | (1L << (VOID - 80)) | (1L << (UNSIGNED - 80)) | (1L << (SIGNED - 80)) | (1L << (CV_QUALIFIER - 80)) | (1L << (EXTERN - 80)) | (1L << (VIRTUAL - 80)) | (1L << (SPECIAL_DATA - 80)) | (1L << (OPERATOR - 80)) | (1L << (CLASS_KEY - 80)) | (1L << (NEW - 80)) | (1L << (PRE_PRAGMA_KEYWORDS - 80)) | (1L << (END_TEST - 80)) | (1L << (ALPHA_NUMERIC - 80)))) != 0)) {
					{
					setState(1790);
					type_name();
					}
				}

				setState(1793);
				initializer_expression();
				}
				break;
			case 2:
				{
				_localctx = new PrimaryOnlyContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1794);
				primary_expression();
				}
				break;
			case 3:
				{
				_localctx = new IncDecOpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1796);
				_la = _input.LA(1);
				if (_la==T__17 || _la==T__18) {
					{
					setState(1795);
					ptr_operator();
					}
				}

				setState(1798);
				inc_dec();
				setState(1800);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,325,_ctx) ) {
				case 1:
					{
					setState(1799);
					match(NEWLINE);
					}
					break;
				}
				setState(1803);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(1802);
					match(COMMENT);
					}
				}

				setState(1806);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1805);
					match(NEWLINE);
					}
				}

				setState(1809);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,328,_ctx) ) {
				case 1:
					{
					setState(1808);
					ptr_operator();
					}
					break;
				}
				setState(1811);
				primary_expression();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1887);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,349,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1885);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,348,_ctx) ) {
					case 1:
						{
						_localctx = new ArrayIndexingContext(new Postfix_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_expression);
						setState(1815);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(1817);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,330,_ctx) ) {
						case 1:
							{
							setState(1816);
							match(NEWLINE);
							}
							break;
						}
						setState(1820);
						_la = _input.LA(1);
						if (_la==COMMENT) {
							{
							setState(1819);
							match(COMMENT);
							}
						}

						setState(1823);
						_la = _input.LA(1);
						if (_la==NEWLINE) {
							{
							setState(1822);
							match(NEWLINE);
							}
						}

						setState(1825);
						match(T__28);
						setState(1827);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__50) | (1L << T__51) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (STATIC - 64)) | (1L << (VOID - 64)) | (1L << (UNSIGNED - 64)) | (1L << (SIGNED - 64)) | (1L << (CV_QUALIFIER - 64)) | (1L << (EXTERN - 64)) | (1L << (VIRTUAL - 64)) | (1L << (SPECIAL_DATA - 64)) | (1L << (OPERATOR - 64)) | (1L << (CLASS_KEY - 64)) | (1L << (NEW - 64)) | (1L << (PRE_PRAGMA_KEYWORDS - 64)) | (1L << (END_TEST - 64)) | (1L << (ALPHA_NUMERIC - 64)) | (1L << (OPENING_CURLY - 64)) | (1L << (HEX_LITERAL - 64)) | (1L << (DECIMAL_LITERAL - 64)) | (1L << (OCTAL_LITERAL - 64)) | (1L << (FLOATING_POINT_LITERAL - 64)) | (1L << (CHAR - 64)) | (1L << (STRING - 64)))) != 0)) {
							{
							setState(1826);
							expr();
							}
						}

						setState(1829);
						match(T__29);
						}
						break;
					case 2:
						{
						_localctx = new FuncCallContext(new Postfix_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_expression);
						setState(1830);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(1832);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,334,_ctx) ) {
						case 1:
							{
							setState(1831);
							match(NEWLINE);
							}
							break;
						}
						setState(1835);
						_la = _input.LA(1);
						if (_la==COMMENT) {
							{
							setState(1834);
							match(COMMENT);
							}
						}

						setState(1838);
						_la = _input.LA(1);
						if (_la==NEWLINE) {
							{
							setState(1837);
							match(NEWLINE);
							}
						}

						setState(1840);
						match(T__1);
						setState(1841);
						argument_list();
						setState(1842);
						match(T__2);
						}
						break;
					case 3:
						{
						_localctx = new MemberAccessContext(new Postfix_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_expression);
						setState(1844);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(1845);
						match(T__63);
						setState(1847);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,337,_ctx) ) {
						case 1:
							{
							setState(1846);
							match(NEWLINE);
							}
							break;
						}
						setState(1850);
						_la = _input.LA(1);
						if (_la==COMMENT) {
							{
							setState(1849);
							match(COMMENT);
							}
						}

						setState(1853);
						_la = _input.LA(1);
						if (_la==NEWLINE) {
							{
							setState(1852);
							match(NEWLINE);
							}
						}

						setState(1856);
						_la = _input.LA(1);
						if (_la==TEMPLATE) {
							{
							setState(1855);
							match(TEMPLATE);
							}
						}

						{
						setState(1858);
						identifier();
						}
						}
						break;
					case 4:
						{
						_localctx = new PtrMemberAccessContext(new Postfix_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_expression);
						setState(1859);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(1860);
						match(T__53);
						setState(1862);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,341,_ctx) ) {
						case 1:
							{
							setState(1861);
							match(NEWLINE);
							}
							break;
						}
						setState(1865);
						_la = _input.LA(1);
						if (_la==COMMENT) {
							{
							setState(1864);
							match(COMMENT);
							}
						}

						setState(1868);
						_la = _input.LA(1);
						if (_la==NEWLINE) {
							{
							setState(1867);
							match(NEWLINE);
							}
						}

						setState(1871);
						_la = _input.LA(1);
						if (_la==TEMPLATE) {
							{
							setState(1870);
							match(TEMPLATE);
							}
						}

						{
						setState(1873);
						identifier();
						}
						}
						break;
					case 5:
						{
						_localctx = new IncDecOpContext(new Postfix_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_expression);
						setState(1874);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(1876);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,345,_ctx) ) {
						case 1:
							{
							setState(1875);
							match(NEWLINE);
							}
							break;
						}
						setState(1879);
						_la = _input.LA(1);
						if (_la==COMMENT) {
							{
							setState(1878);
							match(COMMENT);
							}
						}

						setState(1882);
						_la = _input.LA(1);
						if (_la==NEWLINE) {
							{
							setState(1881);
							match(NEWLINE);
							}
						}

						setState(1884);
						inc_dec();
						}
						break;
					}
					} 
				}
				setState(1889);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,349,_ctx);
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

	public static class Initializer_expressionContext extends ParserRuleContext {
		public TerminalNode OPENING_CURLY() { return getToken(ModuleParser.OPENING_CURLY, 0); }
		public TerminalNode CLOSING_CURLY() { return getToken(ModuleParser.CLOSING_CURLY, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(ModuleParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(ModuleParser.NEWLINE, i);
		}
		public List<TerminalNode> COMMENT() { return getTokens(ModuleParser.COMMENT); }
		public TerminalNode COMMENT(int i) {
			return getToken(ModuleParser.COMMENT, i);
		}
		public Argument_listContext argument_list() {
			return getRuleContext(Argument_listContext.class,0);
		}
		public Initializer_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializer_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterInitializer_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitInitializer_expression(this);
		}
	}

	public final Initializer_expressionContext initializer_expression() throws RecognitionException {
		Initializer_expressionContext _localctx = new Initializer_expressionContext(_ctx, getState());
		enterRule(_localctx, 240, RULE_initializer_expression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1890);
			match(OPENING_CURLY);
			setState(1892);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,350,_ctx) ) {
			case 1:
				{
				setState(1891);
				match(NEWLINE);
				}
				break;
			}
			setState(1900);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,352,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1894);
					match(COMMENT);
					setState(1896);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,351,_ctx) ) {
					case 1:
						{
						setState(1895);
						match(NEWLINE);
						}
						break;
					}
					}
					} 
				}
				setState(1902);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,352,_ctx);
			}
			setState(1904);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,353,_ctx) ) {
			case 1:
				{
				setState(1903);
				argument_list();
				}
				break;
			}
			setState(1907);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(1906);
				match(NEWLINE);
				}
			}

			setState(1915);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMENT) {
				{
				{
				setState(1909);
				match(COMMENT);
				setState(1911);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(1910);
					match(NEWLINE);
					}
				}

				}
				}
				setState(1917);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1918);
			match(CLOSING_CURLY);
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

	public static class Argument_listContext extends ParserRuleContext {
		public List<ArgumentContext> argument() {
			return getRuleContexts(ArgumentContext.class);
		}
		public ArgumentContext argument(int i) {
			return getRuleContext(ArgumentContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(ModuleParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(ModuleParser.NEWLINE, i);
		}
		public List<TerminalNode> COMMENT() { return getTokens(ModuleParser.COMMENT); }
		public TerminalNode COMMENT(int i) {
			return getToken(ModuleParser.COMMENT, i);
		}
		public TerminalNode VOID() { return getToken(ModuleParser.VOID, 0); }
		public Ptr_operatorContext ptr_operator() {
			return getRuleContext(Ptr_operatorContext.class,0);
		}
		public Argument_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterArgument_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitArgument_list(this);
		}
	}

	public final Argument_listContext argument_list() throws RecognitionException {
		Argument_listContext _localctx = new Argument_listContext(_ctx, getState());
		enterRule(_localctx, 242, RULE_argument_list);
		int _la;
		try {
			int _alt;
			setState(1969);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,371,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1930);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,360,_ctx) ) {
				case 1:
					{
					setState(1921);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,357,_ctx) ) {
					case 1:
						{
						setState(1920);
						match(NEWLINE);
						}
						break;
					}
					setState(1924);
					_la = _input.LA(1);
					if (_la==COMMENT) {
						{
						setState(1923);
						match(COMMENT);
						}
					}

					setState(1927);
					_la = _input.LA(1);
					if (_la==NEWLINE) {
						{
						setState(1926);
						match(NEWLINE);
						}
					}

					setState(1929);
					argument();
					}
					break;
				}
				setState(1933);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,361,_ctx) ) {
				case 1:
					{
					setState(1932);
					match(NEWLINE);
					}
					break;
				}
				setState(1936);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,362,_ctx) ) {
				case 1:
					{
					setState(1935);
					match(COMMENT);
					}
					break;
				}
				setState(1939);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,363,_ctx) ) {
				case 1:
					{
					setState(1938);
					match(NEWLINE);
					}
					break;
				}
				setState(1959);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,368,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1942);
						_la = _input.LA(1);
						if (_la==T__12) {
							{
							setState(1941);
							match(T__12);
							}
						}

						setState(1945);
						_la = _input.LA(1);
						if (_la==NEWLINE) {
							{
							setState(1944);
							match(NEWLINE);
							}
						}

						setState(1953);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==COMMENT) {
							{
							{
							setState(1947);
							match(COMMENT);
							setState(1949);
							_la = _input.LA(1);
							if (_la==NEWLINE) {
								{
								setState(1948);
								match(NEWLINE);
								}
							}

							}
							}
							setState(1955);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(1956);
						argument();
						}
						} 
					}
					setState(1961);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,368,_ctx);
				}
				setState(1963);
				_la = _input.LA(1);
				if (_la==T__12) {
					{
					setState(1962);
					match(T__12);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1965);
				match(VOID);
				setState(1967);
				_la = _input.LA(1);
				if (_la==T__17 || _la==T__18) {
					{
					setState(1966);
					ptr_operator();
					}
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

	public static class ArgumentContext extends ParserRuleContext {
		public Assign_exprContext assign_expr() {
			return getRuleContext(Assign_exprContext.class,0);
		}
		public ArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitArgument(this);
		}
	}

	public final ArgumentContext argument() throws RecognitionException {
		ArgumentContext _localctx = new ArgumentContext(_ctx, getState());
		enterRule(_localctx, 244, RULE_argument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1971);
			assign_expr();
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
		public Ptr_operatorContext ptr_operator() {
			return getRuleContext(Ptr_operatorContext.class,0);
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
		enterRule(_localctx, 246, RULE_primary_expression);
		int _la;
		try {
			setState(1983);
			switch (_input.LA(1)) {
			case T__8:
			case T__9:
			case T__10:
			case T__63:
			case NEW:
			case PRE_PRAGMA_KEYWORDS:
			case ALPHA_NUMERIC:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(1974);
				_la = _input.LA(1);
				if (_la==T__63) {
					{
					setState(1973);
					match(T__63);
					}
				}

				setState(1976);
				identifier();
				}
				}
				break;
			case T__17:
			case T__18:
				enterOuterAlt(_localctx, 2);
				{
				setState(1977);
				ptr_operator();
				}
				break;
			case HEX_LITERAL:
			case DECIMAL_LITERAL:
			case OCTAL_LITERAL:
			case FLOATING_POINT_LITERAL:
			case CHAR:
			case STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(1978);
				constant();
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 4);
				{
				setState(1979);
				match(T__1);
				setState(1980);
				expr();
				setState(1981);
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

	public static class Null_expressionContext extends ParserRuleContext {
		public Null_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_null_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterNull_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitNull_expression(this);
		}
	}

	public final Null_expressionContext null_expression() throws RecognitionException {
		Null_expressionContext _localctx = new Null_expressionContext(_ctx, getState());
		enterRule(_localctx, 248, RULE_null_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1985);
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

	public static class Init_declaratorContext extends ParserRuleContext {
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(ModuleParser.NEWLINE, 0); }
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
		enterRule(_localctx, 250, RULE_init_declarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1987);
			declarator();
			setState(1989);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,374,_ctx) ) {
			case 1:
				{
				setState(1988);
				match(NEWLINE);
				}
				break;
			}
			setState(1998);
			switch (_input.LA(1)) {
			case T__1:
				{
				{
				setState(1991);
				match(T__1);
				setState(1993);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__50) | (1L << T__51) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (STATIC - 64)) | (1L << (VOID - 64)) | (1L << (UNSIGNED - 64)) | (1L << (SIGNED - 64)) | (1L << (CV_QUALIFIER - 64)) | (1L << (EXTERN - 64)) | (1L << (VIRTUAL - 64)) | (1L << (SPECIAL_DATA - 64)) | (1L << (OPERATOR - 64)) | (1L << (CLASS_KEY - 64)) | (1L << (NEW - 64)) | (1L << (PRE_PRAGMA_KEYWORDS - 64)) | (1L << (END_TEST - 64)) | (1L << (ALPHA_NUMERIC - 64)) | (1L << (OPENING_CURLY - 64)) | (1L << (HEX_LITERAL - 64)) | (1L << (DECIMAL_LITERAL - 64)) | (1L << (OCTAL_LITERAL - 64)) | (1L << (FLOATING_POINT_LITERAL - 64)) | (1L << (CHAR - 64)) | (1L << (STRING - 64)))) != 0)) {
					{
					setState(1992);
					expr();
					}
				}

				setState(1995);
				match(T__2);
				}
				}
				break;
			case T__3:
				{
				{
				setState(1996);
				match(T__3);
				setState(1997);
				assign_expr_w_();
				}
				}
				break;
			case T__0:
			case T__12:
			case T__13:
			case T__14:
			case T__15:
			case T__16:
			case NEWLINE:
			case PRE_OTHER:
			case PRE_ATTRIBUTE:
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
		enterRule(_localctx, 252, RULE_declarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2001);
			_la = _input.LA(1);
			if (_la==T__17 || _la==T__18) {
				{
				setState(2000);
				ptrs();
				}
			}

			setState(2003);
			identifier();
			setState(2005);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,378,_ctx) ) {
			case 1:
				{
				setState(2004);
				type_suffix();
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
		enterRule(_localctx, 254, RULE_type_suffix);
		try {
			setState(2012);
			switch (_input.LA(1)) {
			case T__28:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(2007);
				match(T__28);
				setState(2008);
				constant_expr_w_();
				setState(2009);
				match(T__29);
				}
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				setState(2011);
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
		enterRule(_localctx, 256, RULE_assign_expr_w_);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2017);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,380,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2014);
					assign_water();
					}
					} 
				}
				setState(2019);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,380,_ctx);
			}
			setState(2042);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1 || _la==T__28 || _la==OPENING_CURLY) {
				{
				{
				setState(2032);
				switch (_input.LA(1)) {
				case OPENING_CURLY:
					{
					setState(2020);
					match(OPENING_CURLY);
					setState(2021);
					assign_expr_w__l2();
					setState(2022);
					match(CLOSING_CURLY);
					}
					break;
				case T__1:
					{
					setState(2024);
					match(T__1);
					setState(2025);
					assign_expr_w__l2();
					setState(2026);
					match(T__2);
					}
					break;
				case T__28:
					{
					setState(2028);
					match(T__28);
					setState(2029);
					assign_expr_w__l2();
					setState(2030);
					match(T__29);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2037);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,382,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(2034);
						assign_water();
						}
						} 
					}
					setState(2039);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,382,_ctx);
				}
				}
				}
				setState(2044);
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
		enterRule(_localctx, 258, RULE_assign_expr_w__l2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2048);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (NEWLINE - 64)) | (1L << (ESCAPE - 64)) | (1L << (ELLIPSIS - 64)) | (1L << (IF - 64)) | (1L << (ELSE - 64)) | (1L << (FOR - 64)) | (1L << (WHILE - 64)) | (1L << (BREAK - 64)) | (1L << (CASE - 64)) | (1L << (CONTINUE - 64)) | (1L << (SWITCH - 64)) | (1L << (DO - 64)) | (1L << (GOTO - 64)) | (1L << (RETURN - 64)) | (1L << (TYPEDEF - 64)) | (1L << (STATIC - 64)) | (1L << (VOID - 64)) | (1L << (UNSIGNED - 64)) | (1L << (SIGNED - 64)) | (1L << (CV_QUALIFIER - 64)) | (1L << (EXTERN - 64)) | (1L << (VIRTUAL - 64)) | (1L << (TRY - 64)) | (1L << (CATCH - 64)) | (1L << (THROW - 64)) | (1L << (USING - 64)) | (1L << (NAMESPACE - 64)) | (1L << (AUTO - 64)) | (1L << (REGISTER - 64)) | (1L << (SPECIAL_DATA - 64)) | (1L << (OPERATOR - 64)) | (1L << (TEMPLATE - 64)) | (1L << (CLASS_KEY - 64)) | (1L << (NEW - 64)) | (1L << (PRE_IF - 64)) | (1L << (PRE_ELIF - 64)) | (1L << (PRE_ELSE - 64)) | (1L << (PRE_ENDIF - 64)) | (1L << (PRE_DEFINE - 64)) | (1L << (PRE_UNDEF - 64)) | (1L << (PRE_DIAGNOSTIC - 64)) | (1L << (PRE_OTHER - 64)) | (1L << (PRE_INCLUDE - 64)) | (1L << (PRE_INCLUDE_NEXT - 64)) | (1L << (PRE_LINE - 64)) | (1L << (PRE_PRAGMA - 64)) | (1L << (PRE_GCC - 64)) | (1L << (PRE_PRAGMA_KEYWORDS - 64)) | (1L << (PRE_STR - 64)) | (1L << (PRE_ATTRIBUTE - 64)) | (1L << (END_TEST - 64)) | (1L << (ALPHA_NUMERIC - 64)) | (1L << (HEX_LITERAL - 64)) | (1L << (DECIMAL_LITERAL - 64)) | (1L << (OCTAL_LITERAL - 64)) | (1L << (FLOATING_POINT_LITERAL - 64)) | (1L << (COMMENT - 64)) | (1L << (CHAR - 64)) | (1L << (STRING - 64)) | (1L << (WHITESPACE - 64)) | (1L << (OTHER - 64)))) != 0)) {
				{
				{
				setState(2045);
				assign_water_l2();
				}
				}
				setState(2050);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2073);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1 || _la==T__28 || _la==OPENING_CURLY) {
				{
				{
				setState(2063);
				switch (_input.LA(1)) {
				case OPENING_CURLY:
					{
					setState(2051);
					match(OPENING_CURLY);
					setState(2052);
					assign_expr_w__l2();
					setState(2053);
					match(CLOSING_CURLY);
					}
					break;
				case T__1:
					{
					setState(2055);
					match(T__1);
					setState(2056);
					assign_expr_w__l2();
					setState(2057);
					match(T__2);
					}
					break;
				case T__28:
					{
					setState(2059);
					match(T__28);
					setState(2060);
					assign_expr_w__l2();
					setState(2061);
					match(T__29);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2068);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (NEWLINE - 64)) | (1L << (ESCAPE - 64)) | (1L << (ELLIPSIS - 64)) | (1L << (IF - 64)) | (1L << (ELSE - 64)) | (1L << (FOR - 64)) | (1L << (WHILE - 64)) | (1L << (BREAK - 64)) | (1L << (CASE - 64)) | (1L << (CONTINUE - 64)) | (1L << (SWITCH - 64)) | (1L << (DO - 64)) | (1L << (GOTO - 64)) | (1L << (RETURN - 64)) | (1L << (TYPEDEF - 64)) | (1L << (STATIC - 64)) | (1L << (VOID - 64)) | (1L << (UNSIGNED - 64)) | (1L << (SIGNED - 64)) | (1L << (CV_QUALIFIER - 64)) | (1L << (EXTERN - 64)) | (1L << (VIRTUAL - 64)) | (1L << (TRY - 64)) | (1L << (CATCH - 64)) | (1L << (THROW - 64)) | (1L << (USING - 64)) | (1L << (NAMESPACE - 64)) | (1L << (AUTO - 64)) | (1L << (REGISTER - 64)) | (1L << (SPECIAL_DATA - 64)) | (1L << (OPERATOR - 64)) | (1L << (TEMPLATE - 64)) | (1L << (CLASS_KEY - 64)) | (1L << (NEW - 64)) | (1L << (PRE_IF - 64)) | (1L << (PRE_ELIF - 64)) | (1L << (PRE_ELSE - 64)) | (1L << (PRE_ENDIF - 64)) | (1L << (PRE_DEFINE - 64)) | (1L << (PRE_UNDEF - 64)) | (1L << (PRE_DIAGNOSTIC - 64)) | (1L << (PRE_OTHER - 64)) | (1L << (PRE_INCLUDE - 64)) | (1L << (PRE_INCLUDE_NEXT - 64)) | (1L << (PRE_LINE - 64)) | (1L << (PRE_PRAGMA - 64)) | (1L << (PRE_GCC - 64)) | (1L << (PRE_PRAGMA_KEYWORDS - 64)) | (1L << (PRE_STR - 64)) | (1L << (PRE_ATTRIBUTE - 64)) | (1L << (END_TEST - 64)) | (1L << (ALPHA_NUMERIC - 64)) | (1L << (HEX_LITERAL - 64)) | (1L << (DECIMAL_LITERAL - 64)) | (1L << (OCTAL_LITERAL - 64)) | (1L << (FLOATING_POINT_LITERAL - 64)) | (1L << (COMMENT - 64)) | (1L << (CHAR - 64)) | (1L << (STRING - 64)) | (1L << (WHITESPACE - 64)) | (1L << (OTHER - 64)))) != 0)) {
					{
					{
					setState(2065);
					assign_water_l2();
					}
					}
					setState(2070);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(2075);
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
		enterRule(_localctx, 260, RULE_constant_expr_w_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2079);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (NEWLINE - 64)) | (1L << (ESCAPE - 64)) | (1L << (ELLIPSIS - 64)) | (1L << (IF - 64)) | (1L << (ELSE - 64)) | (1L << (FOR - 64)) | (1L << (WHILE - 64)) | (1L << (BREAK - 64)) | (1L << (CASE - 64)) | (1L << (CONTINUE - 64)) | (1L << (SWITCH - 64)) | (1L << (DO - 64)) | (1L << (GOTO - 64)) | (1L << (RETURN - 64)) | (1L << (TYPEDEF - 64)) | (1L << (STATIC - 64)) | (1L << (VOID - 64)) | (1L << (UNSIGNED - 64)) | (1L << (SIGNED - 64)) | (1L << (CV_QUALIFIER - 64)) | (1L << (EXTERN - 64)) | (1L << (VIRTUAL - 64)) | (1L << (TRY - 64)) | (1L << (CATCH - 64)) | (1L << (THROW - 64)) | (1L << (USING - 64)) | (1L << (NAMESPACE - 64)) | (1L << (AUTO - 64)) | (1L << (REGISTER - 64)) | (1L << (SPECIAL_DATA - 64)) | (1L << (OPERATOR - 64)) | (1L << (TEMPLATE - 64)) | (1L << (CLASS_KEY - 64)) | (1L << (NEW - 64)) | (1L << (PRE_IF - 64)) | (1L << (PRE_ELIF - 64)) | (1L << (PRE_ELSE - 64)) | (1L << (PRE_ENDIF - 64)) | (1L << (PRE_DEFINE - 64)) | (1L << (PRE_UNDEF - 64)) | (1L << (PRE_DIAGNOSTIC - 64)) | (1L << (PRE_OTHER - 64)) | (1L << (PRE_INCLUDE - 64)) | (1L << (PRE_INCLUDE_NEXT - 64)) | (1L << (PRE_LINE - 64)) | (1L << (PRE_PRAGMA - 64)) | (1L << (PRE_GCC - 64)) | (1L << (PRE_PRAGMA_KEYWORDS - 64)) | (1L << (PRE_STR - 64)) | (1L << (PRE_ATTRIBUTE - 64)) | (1L << (END_TEST - 64)) | (1L << (ALPHA_NUMERIC - 64)) | (1L << (OPENING_CURLY - 64)) | (1L << (CLOSING_CURLY - 64)) | (1L << (HEX_LITERAL - 64)) | (1L << (DECIMAL_LITERAL - 64)) | (1L << (OCTAL_LITERAL - 64)) | (1L << (FLOATING_POINT_LITERAL - 64)) | (1L << (COMMENT - 64)) | (1L << (CHAR - 64)) | (1L << (STRING - 64)) | (1L << (WHITESPACE - 64)) | (1L << (OTHER - 64)))) != 0)) {
				{
				{
				setState(2076);
				no_squares();
				}
				}
				setState(2081);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2093);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__28) {
				{
				{
				setState(2082);
				match(T__28);
				setState(2083);
				constant_expr_w_();
				setState(2084);
				match(T__29);
				setState(2088);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (NEWLINE - 64)) | (1L << (ESCAPE - 64)) | (1L << (ELLIPSIS - 64)) | (1L << (IF - 64)) | (1L << (ELSE - 64)) | (1L << (FOR - 64)) | (1L << (WHILE - 64)) | (1L << (BREAK - 64)) | (1L << (CASE - 64)) | (1L << (CONTINUE - 64)) | (1L << (SWITCH - 64)) | (1L << (DO - 64)) | (1L << (GOTO - 64)) | (1L << (RETURN - 64)) | (1L << (TYPEDEF - 64)) | (1L << (STATIC - 64)) | (1L << (VOID - 64)) | (1L << (UNSIGNED - 64)) | (1L << (SIGNED - 64)) | (1L << (CV_QUALIFIER - 64)) | (1L << (EXTERN - 64)) | (1L << (VIRTUAL - 64)) | (1L << (TRY - 64)) | (1L << (CATCH - 64)) | (1L << (THROW - 64)) | (1L << (USING - 64)) | (1L << (NAMESPACE - 64)) | (1L << (AUTO - 64)) | (1L << (REGISTER - 64)) | (1L << (SPECIAL_DATA - 64)) | (1L << (OPERATOR - 64)) | (1L << (TEMPLATE - 64)) | (1L << (CLASS_KEY - 64)) | (1L << (NEW - 64)) | (1L << (PRE_IF - 64)) | (1L << (PRE_ELIF - 64)) | (1L << (PRE_ELSE - 64)) | (1L << (PRE_ENDIF - 64)) | (1L << (PRE_DEFINE - 64)) | (1L << (PRE_UNDEF - 64)) | (1L << (PRE_DIAGNOSTIC - 64)) | (1L << (PRE_OTHER - 64)) | (1L << (PRE_INCLUDE - 64)) | (1L << (PRE_INCLUDE_NEXT - 64)) | (1L << (PRE_LINE - 64)) | (1L << (PRE_PRAGMA - 64)) | (1L << (PRE_GCC - 64)) | (1L << (PRE_PRAGMA_KEYWORDS - 64)) | (1L << (PRE_STR - 64)) | (1L << (PRE_ATTRIBUTE - 64)) | (1L << (END_TEST - 64)) | (1L << (ALPHA_NUMERIC - 64)) | (1L << (OPENING_CURLY - 64)) | (1L << (CLOSING_CURLY - 64)) | (1L << (HEX_LITERAL - 64)) | (1L << (DECIMAL_LITERAL - 64)) | (1L << (OCTAL_LITERAL - 64)) | (1L << (FLOATING_POINT_LITERAL - 64)) | (1L << (COMMENT - 64)) | (1L << (CHAR - 64)) | (1L << (STRING - 64)) | (1L << (WHITESPACE - 64)) | (1L << (OTHER - 64)))) != 0)) {
					{
					{
					setState(2085);
					no_squares();
					}
					}
					setState(2090);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(2095);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 119:
			return postfix_expression_sempred((Postfix_expressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean postfix_expression_sempred(Postfix_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 8);
		case 1:
			return precpred(_ctx, 7);
		case 2:
			return precpred(_ctx, 6);
		case 3:
			return precpred(_ctx, 5);
		case 4:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\u0081\u0833\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
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
		"w\tw\4x\tx\4y\ty\4z\tz\4{\t{\4|\t|\4}\t}\4~\t~\4\177\t\177\4\u0080\t\u0080"+
		"\4\u0081\t\u0081\4\u0082\t\u0082\4\u0083\t\u0083\4\u0084\t\u0084\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\7\2\u0111\n\2\f\2\16\2\u0114\13\2\3\3\3\3\3"+
		"\3\3\3\3\3\3\4\3\4\5\4\u011d\n\4\3\5\3\5\3\5\3\5\5\5\u0123\n\5\3\6\3\6"+
		"\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u0137"+
		"\n\n\3\13\3\13\3\13\3\13\7\13\u013d\n\13\f\13\16\13\u0140\13\13\3\13\3"+
		"\13\7\13\u0144\n\13\f\13\16\13\u0147\13\13\3\13\3\13\5\13\u014b\n\13\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u0156\n\f\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\5\r\u015e\n\r\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\5\17\u0168\n"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u0171\n\17\5\17\u0173\n\17"+
		"\3\20\3\20\3\21\3\21\5\21\u0179\n\21\3\21\3\21\3\21\5\21\u017e\n\21\7"+
		"\21\u0180\n\21\f\21\16\21\u0183\13\21\3\22\3\22\5\22\u0187\n\22\3\23\3"+
		"\23\3\23\3\23\5\23\u018d\n\23\3\23\5\23\u0190\n\23\3\23\3\23\5\23\u0194"+
		"\n\23\3\23\3\23\5\23\u0198\n\23\7\23\u019a\n\23\f\23\16\23\u019d\13\23"+
		"\3\23\5\23\u01a0\n\23\3\23\5\23\u01a3\n\23\3\23\3\23\3\24\3\24\3\24\5"+
		"\24\u01aa\n\24\3\25\3\25\5\25\u01ae\n\25\3\25\3\25\3\25\3\25\5\25\u01b4"+
		"\n\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u01be\n\25\3\25\5\25"+
		"\u01c1\n\25\3\26\3\26\3\26\7\26\u01c6\n\26\f\26\16\26\u01c9\13\26\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\7\27\u01d1\n\27\f\27\16\27\u01d4\13\27\3\27"+
		"\3\27\3\27\3\27\3\27\5\27\u01db\n\27\3\27\3\27\7\27\u01df\n\27\f\27\16"+
		"\27\u01e2\13\27\3\27\3\27\3\27\5\27\u01e7\n\27\3\30\3\30\3\30\3\30\3\30"+
		"\5\30\u01ee\n\30\3\31\3\31\3\31\3\31\3\31\5\31\u01f5\n\31\3\32\3\32\3"+
		"\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3"+
		"\34\3\34\5\34\u0209\n\34\3\35\3\35\5\35\u020d\n\35\3\35\3\35\3\35\3\35"+
		"\3\35\5\35\u0214\n\35\3\35\3\35\7\35\u0218\n\35\f\35\16\35\u021b\13\35"+
		"\3\35\3\35\5\35\u021f\n\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3\""+
		"\3\"\3\"\7\"\u022e\n\"\f\"\16\"\u0231\13\"\3\"\7\"\u0234\n\"\f\"\16\""+
		"\u0237\13\"\3\"\7\"\u023a\n\"\f\"\16\"\u023d\13\"\6\"\u023f\n\"\r\"\16"+
		"\"\u0240\3\"\3\"\5\"\u0245\n\"\3#\3#\3$\3$\3%\3%\3&\3&\3&\5&\u0250\n&"+
		"\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&"+
		"\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\5&\u027a\n&\3\'\3"+
		"\'\3(\3(\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3*\3*\3*\3*\6*\u028e\n*\r*\16*"+
		"\u028f\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\63"+
		"\3\63\3\64\3\64\3\65\3\65\3\66\3\66\3\66\3\66\5\66\u02ac\n\66\3\67\3\67"+
		"\3\67\6\67\u02b1\n\67\r\67\16\67\u02b2\38\38\38\58\u02b8\n8\39\39\59\u02bc"+
		"\n9\39\59\u02bf\n9\39\59\u02c2\n9\39\39\59\u02c6\n9\39\39\3:\3:\3:\3:"+
		"\3:\3;\3;\3<\5<\u02d2\n<\3<\5<\u02d5\n<\3<\3<\5<\u02d9\n<\5<\u02db\n<"+
		"\3<\3<\5<\u02df\n<\3<\3<\5<\u02e3\n<\3<\5<\u02e6\n<\3<\5<\u02e9\n<\3<"+
		"\5<\u02ec\n<\3<\3<\3<\5<\u02f1\n<\3<\3<\5<\u02f5\n<\3<\3<\5<\u02f9\n<"+
		"\3=\3=\3>\3>\5>\u02ff\n>\7>\u0301\n>\f>\16>\u0304\13>\3>\3>\3>\3>\5>\u030a"+
		"\n>\7>\u030c\n>\f>\16>\u030f\13>\3>\3>\5>\u0313\n>\5>\u0315\n>\3?\3?\5"+
		"?\u0319\n?\3?\3?\5?\u031d\n?\3?\3?\5?\u0321\n?\7?\u0323\n?\f?\16?\u0326"+
		"\13?\3?\5?\u0329\n?\3@\3@\3@\5@\u032e\n@\3@\7@\u0331\n@\f@\16@\u0334\13"+
		"@\3@\3@\5@\u0338\n@\3@\5@\u033b\n@\3A\3A\3A\3A\5A\u0341\nA\3B\5B\u0344"+
		"\nB\3B\3B\3B\3B\3B\5B\u034b\nB\3B\5B\u034e\nB\3C\3C\3C\3D\3D\3D\3D\7D"+
		"\u0357\nD\fD\16D\u035a\13D\3E\3E\3E\3F\5F\u0360\nF\3F\3F\3G\3G\5G\u0366"+
		"\nG\3G\3G\3H\3H\3H\3H\3H\3H\3H\5H\u0371\nH\3I\3I\3I\3I\3I\3J\7J\u0379"+
		"\nJ\fJ\16J\u037c\13J\3J\3J\3J\3J\7J\u0382\nJ\fJ\16J\u0385\13J\7J\u0387"+
		"\nJ\fJ\16J\u038a\13J\3K\3K\3L\5L\u038f\nL\3L\3L\5L\u0393\nL\3L\3L\5L\u0397"+
		"\nL\5L\u0399\nL\3L\5L\u039c\nL\3L\3L\3L\3L\3L\5L\u03a3\nL\5L\u03a5\nL"+
		"\3L\3L\3L\5L\u03aa\nL\3L\3L\5L\u03ae\nL\3L\3L\3L\5L\u03b3\nL\3L\5L\u03b6"+
		"\nL\3L\3L\5L\u03ba\nL\3L\5L\u03bd\nL\3L\3L\3L\3L\5L\u03c3\nL\5L\u03c5"+
		"\nL\3L\3L\5L\u03c9\nL\5L\u03cb\nL\3L\3L\5L\u03cf\nL\5L\u03d1\nL\3L\3L"+
		"\5L\u03d5\nL\3L\5L\u03d8\nL\3L\5L\u03db\nL\5L\u03dd\nL\3M\6M\u03e0\nM"+
		"\rM\16M\u03e1\3N\3N\5N\u03e6\nN\3N\5N\u03e9\nN\3N\3N\5N\u03ed\nN\5N\u03ef"+
		"\nN\3N\5N\u03f2\nN\3N\3N\3N\3N\5N\u03f8\nN\3N\5N\u03fb\nN\3N\3N\5N\u03ff"+
		"\nN\3N\5N\u0402\nN\3N\3N\5N\u0406\nN\3N\3N\3N\3N\3N\5N\u040d\nN\3N\5N"+
		"\u0410\nN\3N\5N\u0413\nN\3O\3O\5O\u0417\nO\3O\3O\5O\u041b\nO\3O\7O\u041e"+
		"\nO\fO\16O\u0421\13O\3O\5O\u0424\nO\3O\5O\u0427\nO\3O\3O\3P\3P\5P\u042d"+
		"\nP\3P\5P\u0430\nP\3P\5P\u0433\nP\3P\3P\3P\3Q\3Q\3R\3R\3R\3R\7R\u043e"+
		"\nR\fR\16R\u0441\13R\3S\3S\5S\u0445\nS\5S\u0447\nS\3S\5S\u044a\nS\3S\3"+
		"S\3T\3T\5T\u0450\nT\3T\3T\5T\u0454\nT\3T\3T\5T\u0458\nT\3T\3T\5T\u045c"+
		"\nT\3T\3T\5T\u0460\nT\3T\3T\5T\u0464\nT\3T\3T\3T\3T\3T\3T\3T\3T\3T\3T"+
		"\3T\5T\u0471\nT\7T\u0473\nT\fT\16T\u0476\13T\3T\6T\u0479\nT\rT\16T\u047a"+
		"\3U\3U\5U\u047f\nU\3U\3U\5U\u0483\nU\3U\3U\5U\u0487\nU\3U\3U\5U\u048b"+
		"\nU\3U\3U\5U\u048f\nU\3U\3U\5U\u0493\nU\3U\3U\5U\u0497\nU\6U\u0499\nU"+
		"\rU\16U\u049a\3V\3V\5V\u049f\nV\3V\3V\5V\u04a3\nV\5V\u04a5\nV\3V\3V\3"+
		"W\3W\5W\u04ab\nW\3X\3X\3X\3X\3X\3X\3X\5X\u04b4\nX\3X\7X\u04b7\nX\fX\16"+
		"X\u04ba\13X\5X\u04bc\nX\3X\5X\u04bf\nX\3Y\3Y\5Y\u04c3\nY\3Y\3Y\3Y\5Y\u04c8"+
		"\nY\3Z\5Z\u04cb\nZ\3Z\3Z\3Z\3Z\3Z\5Z\u04d2\nZ\5Z\u04d4\nZ\3Z\5Z\u04d7"+
		"\nZ\3[\3[\3[\7[\u04dc\n[\f[\16[\u04df\13[\3[\3[\3[\5[\u04e4\n[\3\\\3\\"+
		"\3]\3]\5]\u04ea\n]\6]\u04ec\n]\r]\16]\u04ed\3^\3^\3_\3_\3_\7_\u04f5\n"+
		"_\f_\16_\u04f8\13_\3_\5_\u04fb\n_\3_\5_\u04fe\n_\3_\5_\u0501\n_\3_\3_"+
		"\5_\u0505\n_\3_\5_\u0508\n_\3_\5_\u050b\n_\3_\5_\u050e\n_\3_\3_\7_\u0512"+
		"\n_\f_\16_\u0515\13_\3`\3`\5`\u0519\n`\3`\5`\u051c\n`\3`\5`\u051f\n`\3"+
		"`\3`\5`\u0523\n`\3`\5`\u0526\n`\3`\5`\u0529\n`\3`\3`\5`\u052d\n`\3a\3"+
		"a\3a\5a\u0532\na\3a\5a\u0535\na\3a\5a\u0538\na\3a\3a\5a\u053c\na\3a\5"+
		"a\u053f\na\3a\5a\u0542\na\3a\3a\5a\u0546\na\3a\5a\u0549\na\3a\5a\u054c"+
		"\na\3a\3a\5a\u0550\na\3a\5a\u0553\na\3a\5a\u0556\na\3a\3a\5a\u055a\na"+
		"\3b\3b\5b\u055e\nb\3b\5b\u0561\nb\3b\5b\u0564\nb\3b\3b\5b\u0568\nb\3b"+
		"\5b\u056b\nb\3b\5b\u056e\nb\3b\5b\u0571\nb\3c\3c\5c\u0575\nc\3c\5c\u0578"+
		"\nc\3c\5c\u057b\nc\3c\3c\5c\u057f\nc\3c\5c\u0582\nc\3c\5c\u0585\nc\3c"+
		"\5c\u0588\nc\3d\3d\5d\u058c\nd\3d\5d\u058f\nd\3d\5d\u0592\nd\3d\3d\5d"+
		"\u0596\nd\3d\5d\u0599\nd\3d\5d\u059c\nd\3d\5d\u059f\nd\3e\3e\5e\u05a3"+
		"\ne\3e\5e\u05a6\ne\3e\5e\u05a9\ne\3e\3e\5e\u05ad\ne\3e\5e\u05b0\ne\3e"+
		"\5e\u05b3\ne\3e\5e\u05b6\ne\3f\3f\5f\u05ba\nf\3f\5f\u05bd\nf\3f\5f\u05c0"+
		"\nf\3f\3f\5f\u05c4\nf\3f\5f\u05c7\nf\3f\5f\u05ca\nf\3f\5f\u05cd\nf\3g"+
		"\3g\5g\u05d1\ng\3g\5g\u05d4\ng\3g\5g\u05d7\ng\3g\3g\5g\u05db\ng\3g\5g"+
		"\u05de\ng\3g\5g\u05e1\ng\3g\3g\5g\u05e5\ng\3h\3h\5h\u05e9\nh\3h\5h\u05ec"+
		"\nh\3h\5h\u05ef\nh\3h\3h\5h\u05f3\nh\3h\5h\u05f6\nh\3h\5h\u05f9\nh\3h"+
		"\3h\5h\u05fd\nh\3i\3i\5i\u0601\ni\3i\5i\u0604\ni\3i\5i\u0607\ni\3i\3i"+
		"\5i\u060b\ni\3i\5i\u060e\ni\3i\5i\u0611\ni\3i\5i\u0614\ni\3j\3j\5j\u0618"+
		"\nj\3j\5j\u061b\nj\3j\5j\u061e\nj\3j\3j\5j\u0622\nj\3j\5j\u0625\nj\3j"+
		"\5j\u0628\nj\3j\5j\u062b\nj\3k\3k\5k\u062f\nk\3k\5k\u0632\nk\3k\5k\u0635"+
		"\nk\3k\3k\5k\u0639\nk\3k\5k\u063c\nk\3k\5k\u063f\nk\3k\5k\u0642\nk\3l"+
		"\3l\3l\5l\u0647\nl\3l\3l\3l\3l\3l\3l\5l\u064f\nl\3m\3m\3m\3m\3m\3m\5m"+
		"\u0657\nm\3n\3n\3n\3n\5n\u065d\nn\3o\3o\3o\3o\3o\3o\3o\5o\u0666\no\3p"+
		"\3p\3p\3q\5q\u066c\nq\3q\3q\5q\u0670\nq\3q\5q\u0673\nq\3q\5q\u0676\nq"+
		"\3q\3q\5q\u067a\nq\3q\5q\u067d\nq\3q\5q\u0680\nq\3q\3q\5q\u0684\nq\3q"+
		"\3q\3q\5q\u0689\nq\3q\3q\5q\u068d\nq\3q\5q\u0690\nq\3q\5q\u0693\nq\3q"+
		"\3q\5q\u0697\nq\3q\5q\u069a\nq\3q\5q\u069d\nq\3q\3q\5q\u06a1\nq\3q\3q"+
		"\5q\u06a5\nq\3r\3r\5r\u06a9\nr\3r\5r\u06ac\nr\3r\5r\u06af\nr\3r\3r\3s"+
		"\3s\5s\u06b5\ns\3s\5s\u06b8\ns\3s\5s\u06bb\ns\3s\3s\3s\3s\3s\3s\5s\u06c3"+
		"\ns\3s\5s\u06c6\ns\3s\5s\u06c9\ns\3s\3s\5s\u06cd\ns\3t\3t\3u\3u\5u\u06d3"+
		"\nu\3u\5u\u06d6\nu\3u\5u\u06d9\nu\3u\3u\3u\3u\3u\3u\5u\u06e1\nu\3u\5u"+
		"\u06e4\nu\3u\5u\u06e7\nu\3u\5u\u06ea\nu\3v\3v\5v\u06ee\nv\3v\5v\u06f1"+
		"\nv\3v\5v\u06f4\nv\3v\7v\u06f7\nv\fv\16v\u06fa\13v\3w\3w\3x\3x\3y\3y\5"+
		"y\u0702\ny\3y\3y\3y\5y\u0707\ny\3y\3y\5y\u070b\ny\3y\5y\u070e\ny\3y\5"+
		"y\u0711\ny\3y\5y\u0714\ny\3y\3y\5y\u0718\ny\3y\3y\5y\u071c\ny\3y\5y\u071f"+
		"\ny\3y\5y\u0722\ny\3y\3y\5y\u0726\ny\3y\3y\3y\5y\u072b\ny\3y\5y\u072e"+
		"\ny\3y\5y\u0731\ny\3y\3y\3y\3y\3y\3y\3y\5y\u073a\ny\3y\5y\u073d\ny\3y"+
		"\5y\u0740\ny\3y\5y\u0743\ny\3y\3y\3y\3y\5y\u0749\ny\3y\5y\u074c\ny\3y"+
		"\5y\u074f\ny\3y\5y\u0752\ny\3y\3y\3y\5y\u0757\ny\3y\5y\u075a\ny\3y\5y"+
		"\u075d\ny\3y\7y\u0760\ny\fy\16y\u0763\13y\3z\3z\5z\u0767\nz\3z\3z\5z\u076b"+
		"\nz\7z\u076d\nz\fz\16z\u0770\13z\3z\5z\u0773\nz\3z\5z\u0776\nz\3z\3z\5"+
		"z\u077a\nz\7z\u077c\nz\fz\16z\u077f\13z\3z\3z\3{\5{\u0784\n{\3{\5{\u0787"+
		"\n{\3{\5{\u078a\n{\3{\5{\u078d\n{\3{\5{\u0790\n{\3{\5{\u0793\n{\3{\5{"+
		"\u0796\n{\3{\5{\u0799\n{\3{\5{\u079c\n{\3{\3{\5{\u07a0\n{\7{\u07a2\n{"+
		"\f{\16{\u07a5\13{\3{\7{\u07a8\n{\f{\16{\u07ab\13{\3{\5{\u07ae\n{\3{\3"+
		"{\5{\u07b2\n{\5{\u07b4\n{\3|\3|\3}\5}\u07b9\n}\3}\3}\3}\3}\3}\3}\3}\5"+
		"}\u07c2\n}\3~\3~\3\177\3\177\5\177\u07c8\n\177\3\177\3\177\5\177\u07cc"+
		"\n\177\3\177\3\177\3\177\5\177\u07d1\n\177\3\u0080\5\u0080\u07d4\n\u0080"+
		"\3\u0080\3\u0080\5\u0080\u07d8\n\u0080\3\u0081\3\u0081\3\u0081\3\u0081"+
		"\3\u0081\5\u0081\u07df\n\u0081\3\u0082\7\u0082\u07e2\n\u0082\f\u0082\16"+
		"\u0082\u07e5\13\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082"+
		"\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\5\u0082\u07f3\n\u0082"+
		"\3\u0082\7\u0082\u07f6\n\u0082\f\u0082\16\u0082\u07f9\13\u0082\7\u0082"+
		"\u07fb\n\u0082\f\u0082\16\u0082\u07fe\13\u0082\3\u0083\7\u0083\u0801\n"+
		"\u0083\f\u0083\16\u0083\u0804\13\u0083\3\u0083\3\u0083\3\u0083\3\u0083"+
		"\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\5\u0083"+
		"\u0812\n\u0083\3\u0083\7\u0083\u0815\n\u0083\f\u0083\16\u0083\u0818\13"+
		"\u0083\7\u0083\u081a\n\u0083\f\u0083\16\u0083\u081d\13\u0083\3\u0084\7"+
		"\u0084\u0820\n\u0084\f\u0084\16\u0084\u0823\13\u0084\3\u0084\3\u0084\3"+
		"\u0084\3\u0084\7\u0084\u0829\n\u0084\f\u0084\16\u0084\u082c\13\u0084\7"+
		"\u0084\u082e\n\u0084\f\u0084\16\u0084\u0831\13\u0084\3\u0084\2\3\u00f0"+
		"\u0085\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<"+
		">@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a"+
		"\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2"+
		"\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba"+
		"\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2"+
		"\u00d4\u00d6\u00d8\u00da\u00dc\u00de\u00e0\u00e2\u00e4\u00e6\u00e8\u00ea"+
		"\u00ec\u00ee\u00f0\u00f2\u00f4\u00f6\u00f8\u00fa\u00fc\u00fe\u0100\u0102"+
		"\u0104\u0106\2\31\b\2\b\16RRTUXXaacc\3\2\24\31\3\2\32\35\5\2\b\nRRXX\3"+
		"\2\24\25\3\2\13\r\4\2\36\36dd\5\2\6\6%,/\60\3\2\61\62\3\2\4\5\5\2\4\5"+
		"\37 wx\3\2\3\5\4\2\4\5\32\33\3\2wx\3\2\37 \4\2\3\3\37 \4\2\3\3\17\17\6"+
		"\2\3\5\17\17\37 wx\3\2y{\3\2-.\3\2\26\27\4\2\25\25!\"\3\2\65\66\u09a3"+
		"\2\u0112\3\2\2\2\4\u0115\3\2\2\2\6\u011c\3\2\2\2\b\u0122\3\2\2\2\n\u0124"+
		"\3\2\2\2\f\u0128\3\2\2\2\16\u012c\3\2\2\2\20\u012e\3\2\2\2\22\u0136\3"+
		"\2\2\2\24\u014a\3\2\2\2\26\u0155\3\2\2\2\30\u015d\3\2\2\2\32\u015f\3\2"+
		"\2\2\34\u0172\3\2\2\2\36\u0174\3\2\2\2 \u0178\3\2\2\2\"\u0186\3\2\2\2"+
		"$\u0188\3\2\2\2&\u01a9\3\2\2\2(\u01c0\3\2\2\2*\u01c2\3\2\2\2,\u01e6\3"+
		"\2\2\2.\u01ed\3\2\2\2\60\u01f4\3\2\2\2\62\u01f6\3\2\2\2\64\u01f8\3\2\2"+
		"\2\66\u0208\3\2\2\28\u021e\3\2\2\2:\u0220\3\2\2\2<\u0222\3\2\2\2>\u0224"+
		"\3\2\2\2@\u0226\3\2\2\2B\u0244\3\2\2\2D\u0246\3\2\2\2F\u0248\3\2\2\2H"+
		"\u024a\3\2\2\2J\u0279\3\2\2\2L\u027b\3\2\2\2N\u027d\3\2\2\2P\u027f\3\2"+
		"\2\2R\u028d\3\2\2\2T\u0291\3\2\2\2V\u0293\3\2\2\2X\u0295\3\2\2\2Z\u0297"+
		"\3\2\2\2\\\u0299\3\2\2\2^\u029b\3\2\2\2`\u029d\3\2\2\2b\u029f\3\2\2\2"+
		"d\u02a1\3\2\2\2f\u02a3\3\2\2\2h\u02a5\3\2\2\2j\u02ab\3\2\2\2l\u02b0\3"+
		"\2\2\2n\u02b4\3\2\2\2p\u02b9\3\2\2\2r\u02c9\3\2\2\2t\u02ce\3\2\2\2v\u02f8"+
		"\3\2\2\2x\u02fa\3\2\2\2z\u0314\3\2\2\2|\u0316\3\2\2\2~\u032a\3\2\2\2\u0080"+
		"\u0340\3\2\2\2\u0082\u0343\3\2\2\2\u0084\u034f\3\2\2\2\u0086\u0352\3\2"+
		"\2\2\u0088\u035b\3\2\2\2\u008a\u035f\3\2\2\2\u008c\u0363\3\2\2\2\u008e"+
		"\u0370\3\2\2\2\u0090\u0372\3\2\2\2\u0092\u037a\3\2\2\2\u0094\u038b\3\2"+
		"\2\2\u0096\u03dc\3\2\2\2\u0098\u03df\3\2\2\2\u009a\u0412\3\2\2\2\u009c"+
		"\u0414\3\2\2\2\u009e\u042a\3\2\2\2\u00a0\u0437\3\2\2\2\u00a2\u0439\3\2"+
		"\2\2\u00a4\u0446\3\2\2\2\u00a6\u0478\3\2\2\2\u00a8\u0498\3\2\2\2\u00aa"+
		"\u04a4\3\2\2\2\u00ac\u04a8\3\2\2\2\u00ae\u04be\3\2\2\2\u00b0\u04c7\3\2"+
		"\2\2\u00b2\u04ca\3\2\2\2\u00b4\u04e3\3\2\2\2\u00b6\u04e5\3\2\2\2\u00b8"+
		"\u04eb\3\2\2\2\u00ba\u04ef\3\2\2\2\u00bc\u04f1\3\2\2\2\u00be\u0516\3\2"+
		"\2\2\u00c0\u0559\3\2\2\2\u00c2\u055b\3\2\2\2\u00c4\u0572\3\2\2\2\u00c6"+
		"\u0589\3\2\2\2\u00c8\u05a0\3\2\2\2\u00ca\u05b7\3\2\2\2\u00cc\u05ce\3\2"+
		"\2\2\u00ce\u05e6\3\2\2\2\u00d0\u05fe\3\2\2\2\u00d2\u0615\3\2\2\2\u00d4"+
		"\u062c\3\2\2\2\u00d6\u064e\3\2\2\2\u00d8\u0656\3\2\2\2\u00da\u065c\3\2"+
		"\2\2\u00dc\u0665\3\2\2\2\u00de\u0667\3\2\2\2\u00e0\u06a4\3\2\2\2\u00e2"+
		"\u06a6\3\2\2\2\u00e4\u06cc\3\2\2\2\u00e6\u06ce\3\2\2\2\u00e8\u06e9\3\2"+
		"\2\2\u00ea\u06eb\3\2\2\2\u00ec\u06fb\3\2\2\2\u00ee\u06fd\3\2\2\2\u00f0"+
		"\u0717\3\2\2\2\u00f2\u0764\3\2\2\2\u00f4\u07b3\3\2\2\2\u00f6\u07b5\3\2"+
		"\2\2\u00f8\u07c1\3\2\2\2\u00fa\u07c3\3\2\2\2\u00fc\u07c5\3\2\2\2\u00fe"+
		"\u07d3\3\2\2\2\u0100\u07de\3\2\2\2\u0102\u07e3\3\2\2\2\u0104\u0802\3\2"+
		"\2\2\u0106\u0821\3\2\2\2\u0108\u0111\5v<\2\u0109\u0111\5\u0094K\2\u010a"+
		"\u0111\5j\66\2\u010b\u0111\5\6\4\2\u010c\u0111\5\4\3\2\u010d\u0111\5:"+
		"\36\2\u010e\u0111\5\u00fa~\2\u010f\u0111\5h\65\2\u0110\u0108\3\2\2\2\u0110"+
		"\u0109\3\2\2\2\u0110\u010a\3\2\2\2\u0110\u010b\3\2\2\2\u0110\u010c\3\2"+
		"\2\2\u0110\u010d\3\2\2\2\u0110\u010e\3\2\2\2\u0110\u010f\3\2\2\2\u0111"+
		"\u0114\3\2\2\2\u0112\u0110\3\2\2\2\u0112\u0113\3\2\2\2\u0113\3\3\2\2\2"+
		"\u0114\u0112\3\2\2\2\u0115\u0116\7\\\2\2\u0116\u0117\7]\2\2\u0117\u0118"+
		"\5\u00b4[\2\u0118\u0119\7\3\2\2\u0119\5\3\2\2\2\u011a\u011d\5\b\5\2\u011b"+
		"\u011d\5\26\f\2\u011c\u011a\3\2\2\2\u011c\u011b\3\2\2\2\u011d\7\3\2\2"+
		"\2\u011e\u0123\5\n\6\2\u011f\u0123\5\f\7\2\u0120\u0123\5\16\b\2\u0121"+
		"\u0123\5\20\t\2\u0122\u011e\3\2\2\2\u0122\u011f\3\2\2\2\u0122\u0120\3"+
		"\2\2\2\u0122\u0121\3\2\2\2\u0123\t\3\2\2\2\u0124\u0125\7e\2\2\u0125\u0126"+
		"\5\22\n\2\u0126\u0127\b\6\1\2\u0127\13\3\2\2\2\u0128\u0129\7f\2\2\u0129"+
		"\u012a\5\22\n\2\u012a\u012b\b\7\1\2\u012b\r\3\2\2\2\u012c\u012d\7g\2\2"+
		"\u012d\17\3\2\2\2\u012e\u012f\7h\2\2\u012f\21\3\2\2\2\u0130\u0137\5\24"+
		"\13\2\u0131\u0132\7\4\2\2\u0132\u0133\5\24\13\2\u0133\u0134\7\5\2\2\u0134"+
		"\u0137\3\2\2\2\u0135\u0137\5\36\20\2\u0136\u0130\3\2\2\2\u0136\u0131\3"+
		"\2\2\2\u0136\u0135\3\2\2\2\u0137\23\3\2\2\2\u0138\u014b\5\u00bc_\2\u0139"+
		"\u013a\5\u00a6T\2\u013a\u013e\5\u00fe\u0080\2\u013b\u013d\7C\2\2\u013c"+
		"\u013b\3\2\2\2\u013d\u0140\3\2\2\2\u013e\u013c\3\2\2\2\u013e\u013f\3\2"+
		"\2\2\u013f\u0141\3\2\2\2\u0140\u013e\3\2\2\2\u0141\u0145\7\6\2\2\u0142"+
		"\u0144\7C\2\2\u0143\u0142\3\2\2\2\u0144\u0147\3\2\2\2\u0145\u0143\3\2"+
		"\2\2\u0145\u0146\3\2\2\2\u0146\u0148\3\2\2\2\u0147\u0145\3\2\2\2\u0148"+
		"\u0149\5\u00be`\2\u0149\u014b\3\2\2\2\u014a\u0138\3\2\2\2\u014a\u0139"+
		"\3\2\2\2\u014b\25\3\2\2\2\u014c\u0156\5\30\r\2\u014d\u0156\5\32\16\2\u014e"+
		"\u0156\5&\24\2\u014f\u0156\5(\25\2\u0150\u0156\5.\30\2\u0151\u0156\5\60"+
		"\31\2\u0152\u0156\5\66\34\2\u0153\u0156\58\35\2\u0154\u0156\5$\23\2\u0155"+
		"\u014c\3\2\2\2\u0155\u014d\3\2\2\2\u0155\u014e\3\2\2\2\u0155\u014f\3\2"+
		"\2\2\u0155\u0150\3\2\2\2\u0155\u0151\3\2\2\2\u0155\u0152\3\2\2\2\u0155"+
		"\u0153\3\2\2\2\u0155\u0154\3\2\2\2\u0156\27\3\2\2\2\u0157\u0158\7i\2\2"+
		"\u0158\u0159\5\34\17\2\u0159\u015a\5\"\22\2\u015a\u015e\3\2\2\2\u015b"+
		"\u015c\7i\2\2\u015c\u015e\5\34\17\2\u015d\u0157\3\2\2\2\u015d\u015b\3"+
		"\2\2\2\u015e\31\3\2\2\2\u015f\u0160\7j\2\2\u0160\u0161\5\34\17\2\u0161"+
		"\33\3\2\2\2\u0162\u0167\5\u00b4[\2\u0163\u0164\7\4\2\2\u0164\u0165\5 "+
		"\21\2\u0165\u0166\7\5\2\2\u0166\u0168\3\2\2\2\u0167\u0163\3\2\2\2\u0167"+
		"\u0168\3\2\2\2\u0168\u0173\3\2\2\2\u0169\u0173\5\36\20\2\u016a\u0173\7"+
		"u\2\2\u016b\u0170\7\7\2\2\u016c\u016d\7\4\2\2\u016d\u016e\5 \21\2\u016e"+
		"\u016f\7\5\2\2\u016f\u0171\3\2\2\2\u0170\u016c\3\2\2\2\u0170\u0171\3\2"+
		"\2\2\u0171\u0173\3\2\2\2\u0172\u0162\3\2\2\2\u0172\u0169\3\2\2\2\u0172"+
		"\u016a\3\2\2\2\u0172\u016b\3\2\2\2\u0173\35\3\2\2\2\u0174\u0175\t\2\2"+
		"\2\u0175\37\3\2\2\2\u0176\u0179\5\u00b4[\2\u0177\u0179\7E\2\2\u0178\u0176"+
		"\3\2\2\2\u0178\u0177\3\2\2\2\u0178\u0179\3\2\2\2\u0179\u0181\3\2\2\2\u017a"+
		"\u017d\7\17\2\2\u017b\u017e\5\u00b4[\2\u017c\u017e\7E\2\2\u017d\u017b"+
		"\3\2\2\2\u017d\u017c\3\2\2\2\u017e\u0180\3\2\2\2\u017f\u017a\3\2\2\2\u0180"+
		"\u0183\3\2\2\2\u0181\u017f\3\2\2\2\u0181\u0182\3\2\2\2\u0182!\3\2\2\2"+
		"\u0183\u0181\3\2\2\2\u0184\u0187\5\u00bc_\2\u0185\u0187\b\22\1\2\u0186"+
		"\u0184\3\2\2\2\u0186\u0185\3\2\2\2\u0187#\3\2\2\2\u0188\u0189\5\34\17"+
		"\2\u0189\u01a2\7\4\2\2\u018a\u018d\5\u00bc_\2\u018b\u018d\5\u00a6T\2\u018c"+
		"\u018a\3\2\2\2\u018c\u018b\3\2\2\2\u018c\u018d\3\2\2\2\u018d\u018f\3\2"+
		"\2\2\u018e\u0190\7C\2\2\u018f\u018e\3\2\2\2\u018f\u0190\3\2\2\2\u0190"+
		"\u019b\3\2\2\2\u0191\u0193\7\17\2\2\u0192\u0194\7C\2\2\u0193\u0192\3\2"+
		"\2\2\u0193\u0194\3\2\2\2\u0194\u0197\3\2\2\2\u0195\u0198\5\u00bc_\2\u0196"+
		"\u0198\5\u00a6T\2\u0197\u0195\3\2\2\2\u0197\u0196\3\2\2\2\u0198\u019a"+
		"\3\2\2\2\u0199\u0191\3\2\2\2\u019a\u019d\3\2\2\2\u019b\u0199\3\2\2\2\u019b"+
		"\u019c\3\2\2\2\u019c\u019f\3\2\2\2\u019d\u019b\3\2\2\2\u019e\u01a0\7\17"+
		"\2\2\u019f\u019e\3\2\2\2\u019f\u01a0\3\2\2\2\u01a0\u01a3\3\2\2\2\u01a1"+
		"\u01a3\7S\2\2\u01a2\u018c\3\2\2\2\u01a2\u01a1\3\2\2\2\u01a3\u01a4\3\2"+
		"\2\2\u01a4\u01a5\7\5\2\2\u01a5%\3\2\2\2\u01a6\u01a7\7k\2\2\u01a7\u01aa"+
		"\7\177\2\2\u01a8\u01aa\7k\2\2\u01a9\u01a6\3\2\2\2\u01a9\u01a8\3\2\2\2"+
		"\u01aa\'\3\2\2\2\u01ab\u01ad\7l\2\2\u01ac\u01ae\7\177\2\2\u01ad\u01ac"+
		"\3\2\2\2\u01ad\u01ae\3\2\2\2\u01ae\u01c1\3\2\2\2\u01af\u01b0\7t\2\2\u01b0"+
		"\u01b1\7\4\2\2\u01b1\u01b3\7\4\2\2\u01b2\u01b4\5*\26\2\u01b3\u01b2\3\2"+
		"\2\2\u01b3\u01b4\3\2\2\2\u01b4\u01b5\3\2\2\2\u01b5\u01b6\7\5\2\2\u01b6"+
		"\u01c1\7\5\2\2\u01b7\u01c1\7\20\2\2\u01b8\u01c1\7\21\2\2\u01b9\u01c1\7"+
		"\22\2\2\u01ba\u01bb\7\23\2\2\u01bb\u01bd\7\4\2\2\u01bc\u01be\5*\26\2\u01bd"+
		"\u01bc\3\2\2\2\u01bd\u01be\3\2\2\2\u01be\u01bf\3\2\2\2\u01bf\u01c1\7\5"+
		"\2\2\u01c0\u01ab\3\2\2\2\u01c0\u01af\3\2\2\2\u01c0\u01b7\3\2\2\2\u01c0"+
		"\u01b8\3\2\2\2\u01c0\u01b9\3\2\2\2\u01c0\u01ba\3\2\2\2\u01c1)\3\2\2\2"+
		"\u01c2\u01c7\5,\27\2\u01c3\u01c4\7\17\2\2\u01c4\u01c6\5,\27\2\u01c5\u01c3"+
		"\3\2\2\2\u01c6\u01c9\3\2\2\2\u01c7\u01c5\3\2\2\2\u01c7\u01c8\3\2\2\2\u01c8"+
		"+\3\2\2\2\u01c9\u01c7\3\2\2\2\u01ca\u01e7\5\34\17\2\u01cb\u01cc\5\34\17"+
		"\2\u01cc\u01cd\7\4\2\2\u01cd\u01d2\5\u00b4[\2\u01ce\u01cf\7\17\2\2\u01cf"+
		"\u01d1\5\u00bc_\2\u01d0\u01ce\3\2\2\2\u01d1\u01d4\3\2\2\2\u01d2\u01d0"+
		"\3\2\2\2\u01d2\u01d3\3\2\2\2\u01d3\u01d5\3\2\2\2\u01d4\u01d2\3\2\2\2\u01d5"+
		"\u01d6\7\5\2\2\u01d6\u01e7\3\2\2\2\u01d7\u01d8\5\34\17\2\u01d8\u01da\7"+
		"\4\2\2\u01d9\u01db\5\u00bc_\2\u01da\u01d9\3\2\2\2\u01da\u01db\3\2\2\2"+
		"\u01db\u01e0\3\2\2\2\u01dc\u01dd\7\17\2\2\u01dd\u01df\5\u00bc_\2\u01de"+
		"\u01dc\3\2\2\2\u01df\u01e2\3\2\2\2\u01e0\u01de\3\2\2\2\u01e0\u01e1\3\2"+
		"\2\2\u01e1\u01e3\3\2\2\2\u01e2\u01e0\3\2\2\2\u01e3\u01e4\7\5\2\2\u01e4"+
		"\u01e7\3\2\2\2\u01e5\u01e7\5B\"\2\u01e6\u01ca\3\2\2\2\u01e6\u01cb\3\2"+
		"\2\2\u01e6\u01d7\3\2\2\2\u01e6\u01e5\3\2\2\2\u01e7-\3\2\2\2\u01e8\u01e9"+
		"\7m\2\2\u01e9\u01ee\5\62\32\2\u01ea\u01eb\7m\2\2\u01eb\u01ee\5\34\17\2"+
		"\u01ec\u01ee\7m\2\2\u01ed\u01e8\3\2\2\2\u01ed\u01ea\3\2\2\2\u01ed\u01ec"+
		"\3\2\2\2\u01ee/\3\2\2\2\u01ef\u01f0\7n\2\2\u01f0\u01f5\5\62\32\2\u01f1"+
		"\u01f2\7n\2\2\u01f2\u01f5\5\34\17\2\u01f3\u01f5\7n\2\2\u01f4\u01ef\3\2"+
		"\2\2\u01f4\u01f1\3\2\2\2\u01f4\u01f3\3\2\2\2\u01f5\61\3\2\2\2\u01f6\u01f7"+
		"\5\64\33\2\u01f7\63\3\2\2\2\u01f8\u01f9\7\177\2\2\u01f9\65\3\2\2\2\u01fa"+
		"\u01fb\7o\2\2\u01fb\u01fc\7z\2\2\u01fc\u0209\7\177\2\2\u01fd\u01fe\7o"+
		"\2\2\u01fe\u01ff\7z\2\2\u01ff\u0209\5\34\17\2\u0200\u0201\7o\2\2\u0201"+
		"\u0202\5\34\17\2\u0202\u0203\7\177\2\2\u0203\u0209\3\2\2\2\u0204\u0205"+
		"\7o\2\2\u0205\u0209\5\34\17\2\u0206\u0207\7o\2\2\u0207\u0209\7z\2\2\u0208"+
		"\u01fa\3\2\2\2\u0208\u01fd\3\2\2\2\u0208\u0200\3\2\2\2\u0208\u0204\3\2"+
		"\2\2\u0208\u0206\3\2\2\2\u0209\67\3\2\2\2\u020a\u020c\7p\2\2\u020b\u020d"+
		"\7q\2\2\u020c\u020b\3\2\2\2\u020c\u020d\3\2\2\2\u020d\u020e\3\2\2\2\u020e"+
		"\u020f\7r\2\2\u020f\u0210\7\177\2\2\u0210\u021f\b\35\1\2\u0211\u0213\7"+
		"p\2\2\u0212\u0214\7q\2\2\u0213\u0212\3\2\2\2\u0213\u0214\3\2\2\2\u0214"+
		"\u0215\3\2\2\2\u0215\u0219\7r\2\2\u0216\u0218\5\u00b4[\2\u0217\u0216\3"+
		"\2\2\2\u0218\u021b\3\2\2\2\u0219\u0217\3\2\2\2\u0219\u021a\3\2\2\2\u021a"+
		"\u021f\3\2\2\2\u021b\u0219\3\2\2\2\u021c\u021d\7p\2\2\u021d\u021f\b\35"+
		"\1\2\u021e\u020a\3\2\2\2\u021e\u0211\3\2\2\2\u021e\u021c\3\2\2\2\u021f"+
		"9\3\2\2\2\u0220\u0221\7}\2\2\u0221;\3\2\2\2\u0222\u0223\7C\2\2\u0223="+
		"\3\2\2\2\u0224\u0225\t\3\2\2\u0225?\3\2\2\2\u0226\u0227\t\4\2\2\u0227"+
		"A\3\2\2\2\u0228\u0245\7y\2\2\u0229\u0245\7{\2\2\u022a\u0245\7z\2\2\u022b"+
		"\u022f\7\177\2\2\u022c\u022e\7C\2\2\u022d\u022c\3\2\2\2\u022e\u0231\3"+
		"\2\2\2\u022f\u022d\3\2\2\2\u022f\u0230\3\2\2\2\u0230\u0235\3\2\2\2\u0231"+
		"\u022f\3\2\2\2\u0232\u0234\7}\2\2\u0233\u0232\3\2\2\2\u0234\u0237\3\2"+
		"\2\2\u0235\u0233\3\2\2\2\u0235\u0236\3\2\2\2\u0236\u023b\3\2\2\2\u0237"+
		"\u0235\3\2\2\2\u0238\u023a\7C\2\2\u0239\u0238\3\2\2\2\u023a\u023d\3\2"+
		"\2\2\u023b\u0239\3\2\2\2\u023b\u023c\3\2\2\2\u023c\u023f\3\2\2\2\u023d"+
		"\u023b\3\2\2\2\u023e\u022b\3\2\2\2\u023f\u0240\3\2\2\2\u0240\u023e\3\2"+
		"\2\2\u0240\u0241\3\2\2\2\u0241\u0245\3\2\2\2\u0242\u0245\7~\2\2\u0243"+
		"\u0245\7|\2\2\u0244\u0228\3\2\2\2\u0244\u0229\3\2\2\2\u0244\u022a\3\2"+
		"\2\2\u0244\u023e\3\2\2\2\u0244\u0242\3\2\2\2\u0244\u0243\3\2\2\2\u0245"+
		"C\3\2\2\2\u0246\u0247\t\5\2\2\u0247E\3\2\2\2\u0248\u0249\t\6\2\2\u0249"+
		"G\3\2\2\2\u024a\u024b\t\7\2\2\u024bI\3\2\2\2\u024c\u024f\t\b\2\2\u024d"+
		"\u024e\7\37\2\2\u024e\u0250\7 \2\2\u024f\u024d\3\2\2\2\u024f\u0250\3\2"+
		"\2\2\u0250\u027a\3\2\2\2\u0251\u027a\7\26\2\2\u0252\u027a\7\27\2\2\u0253"+
		"\u027a\7\25\2\2\u0254\u027a\7!\2\2\u0255\u027a\7\"\2\2\u0256\u027a\7#"+
		"\2\2\u0257\u027a\7\24\2\2\u0258\u027a\7$\2\2\u0259\u027a\7\30\2\2\u025a"+
		"\u027a\7\31\2\2\u025b\u027a\7\6\2\2\u025c\u027a\7\32\2\2\u025d\u027a\7"+
		"\33\2\2\u025e\u027a\7%\2\2\u025f\u027a\7&\2\2\u0260\u027a\7\'\2\2\u0261"+
		"\u027a\7(\2\2\u0262\u027a\7)\2\2\u0263\u027a\7*\2\2\u0264\u027a\7+\2\2"+
		"\u0265\u027a\7,\2\2\u0266\u027a\7-\2\2\u0267\u027a\7.\2\2\u0268\u027a"+
		"\7/\2\2\u0269\u027a\7\60\2\2\u026a\u027a\7\61\2\2\u026b\u027a\7\62\2\2"+
		"\u026c\u027a\7\34\2\2\u026d\u027a\7\35\2\2\u026e\u027a\7\63\2\2\u026f"+
		"\u027a\7\64\2\2\u0270\u027a\7\65\2\2\u0271\u027a\7\66\2\2\u0272\u027a"+
		"\7\17\2\2\u0273\u027a\7\67\2\2\u0274\u027a\78\2\2\u0275\u0276\7\4\2\2"+
		"\u0276\u027a\7\5\2\2\u0277\u0278\7\37\2\2\u0278\u027a\7 \2\2\u0279\u024c"+
		"\3\2\2\2\u0279\u0251\3\2\2\2\u0279\u0252\3\2\2\2\u0279\u0253\3\2\2\2\u0279"+
		"\u0254\3\2\2\2\u0279\u0255\3\2\2\2\u0279\u0256\3\2\2\2\u0279\u0257\3\2"+
		"\2\2\u0279\u0258\3\2\2\2\u0279\u0259\3\2\2\2\u0279\u025a\3\2\2\2\u0279"+
		"\u025b\3\2\2\2\u0279\u025c\3\2\2\2\u0279\u025d\3\2\2\2\u0279\u025e\3\2"+
		"\2\2\u0279\u025f\3\2\2\2\u0279\u0260\3\2\2\2\u0279\u0261\3\2\2\2\u0279"+
		"\u0262\3\2\2\2\u0279\u0263\3\2\2\2\u0279\u0264\3\2\2\2\u0279\u0265\3\2"+
		"\2\2\u0279\u0266\3\2\2\2\u0279\u0267\3\2\2\2\u0279\u0268\3\2\2\2\u0279"+
		"\u0269\3\2\2\2\u0279\u026a\3\2\2\2\u0279\u026b\3\2\2\2\u0279\u026c\3\2"+
		"\2\2\u0279\u026d\3\2\2\2\u0279\u026e\3\2\2\2\u0279\u026f\3\2\2\2\u0279"+
		"\u0270\3\2\2\2\u0279\u0271\3\2\2\2\u0279\u0272\3\2\2\2\u0279\u0273\3\2"+
		"\2\2\u0279\u0274\3\2\2\2\u0279\u0275\3\2\2\2\u0279\u0277\3\2\2\2\u027a"+
		"K\3\2\2\2\u027b\u027c\t\t\2\2\u027cM\3\2\2\2\u027d\u027e\t\n\2\2\u027e"+
		"O\3\2\2\2\u027f\u0280\7b\2\2\u0280\u0281\7\32\2\2\u0281\u0282\5R*\2\u0282"+
		"\u0283\7\33\2\2\u0283Q\3\2\2\2\u0284\u0285\7\32\2\2\u0285\u0286\5R*\2"+
		"\u0286\u0287\7\33\2\2\u0287\u028e\3\2\2\2\u0288\u0289\7\4\2\2\u0289\u028a"+
		"\5R*\2\u028a\u028b\7\5\2\2\u028b\u028e\3\2\2\2\u028c\u028e\5Z.\2\u028d"+
		"\u0284\3\2\2\2\u028d\u0288\3\2\2\2\u028d\u028c\3\2\2\2\u028e\u028f\3\2"+
		"\2\2\u028f\u028d\3\2\2\2\u028f\u0290\3\2\2\2\u0290S\3\2\2\2\u0291\u0292"+
		"\n\13\2\2\u0292U\3\2\2\2\u0293\u0294\n\f\2\2\u0294W\3\2\2\2\u0295\u0296"+
		"\n\r\2\2\u0296Y\3\2\2\2\u0297\u0298\n\16\2\2\u0298[\3\2\2\2\u0299\u029a"+
		"\n\17\2\2\u029a]\3\2\2\2\u029b\u029c\n\20\2\2\u029c_\3\2\2\2\u029d\u029e"+
		"\n\21\2\2\u029ea\3\2\2\2\u029f\u02a0\n\22\2\2\u02a0c\3\2\2\2\u02a1\u02a2"+
		"\n\23\2\2\u02a2e\3\2\2\2\u02a3\u02a4\n\f\2\2\u02a4g\3\2\2\2\u02a5\u02a6"+
		"\13\2\2\2\u02a6i\3\2\2\2\u02a7\u02ac\5l\67\2\u02a8\u02ac\5n8\2\u02a9\u02ac"+
		"\5p9\2\u02aa\u02ac\5t;\2\u02ab\u02a7\3\2\2\2\u02ab\u02a8\3\2\2\2\u02ab"+
		"\u02a9\3\2\2\2\u02ab\u02aa\3\2\2\2\u02ack\3\2\2\2\u02ad\u02ae\5\34\17"+
		"\2\u02ae\u02af\7\17\2\2\u02af\u02b1\3\2\2\2\u02b0\u02ad\3\2\2\2\u02b1"+
		"\u02b2\3\2\2\2\u02b2\u02b0\3\2\2\2\u02b2\u02b3\3\2\2\2\u02b3m\3\2\2\2"+
		"\u02b4\u02b5\7W\2\2\u02b5\u02b7\79\2\2\u02b6\u02b8\7w\2\2\u02b7\u02b6"+
		"\3\2\2\2\u02b7\u02b8\3\2\2\2\u02b8o\3\2\2\2\u02b9\u02bb\5$\23\2\u02ba"+
		"\u02bc\7C\2\2\u02bb\u02ba\3\2\2\2\u02bb\u02bc\3\2\2\2\u02bc\u02be\3\2"+
		"\2\2\u02bd\u02bf\5\34\17\2\u02be\u02bd\3\2\2\2\u02be\u02bf\3\2\2\2\u02bf"+
		"\u02c1\3\2\2\2\u02c0\u02c2\7C\2\2\u02c1\u02c0\3\2\2\2\u02c1\u02c2\3\2"+
		"\2\2\u02c2\u02c3\3\2\2\2\u02c3\u02c5\5$\23\2\u02c4\u02c6\7C\2\2\u02c5"+
		"\u02c4\3\2\2\2\u02c5\u02c6\3\2\2\2\u02c6\u02c7\3\2\2\2\u02c7\u02c8\5\u009c"+
		"O\2\u02c8q\3\2\2\2\u02c9\u02ca\7\7\2\2\u02ca\u02cb\7\4\2\2\u02cb\u02cc"+
		"\5\u008eH\2\u02cc\u02cd\7\5\2\2\u02cds\3\2\2\2\u02ce\u02cf\7u\2\2\u02cf"+
		"u\3\2\2\2\u02d0\u02d2\5P)\2\u02d1\u02d0\3\2\2\2\u02d1\u02d2\3\2\2\2\u02d2"+
		"\u02d4\3\2\2\2\u02d3\u02d5\5z>\2\u02d4\u02d3\3\2\2\2\u02d4\u02d5\3\2\2"+
		"\2\u02d5\u02da\3\2\2\2\u02d6\u02d8\5(\25\2\u02d7\u02d9\7C\2\2\u02d8\u02d7"+
		"\3\2\2\2\u02d8\u02d9\3\2\2\2\u02d9\u02db\3\2\2\2\u02da\u02d6\3\2\2\2\u02da"+
		"\u02db\3\2\2\2\u02db\u02dc\3\2\2\2\u02dc\u02de\5\u008eH\2\u02dd\u02df"+
		"\7C\2\2\u02de\u02dd\3\2\2\2\u02de\u02df\3\2\2\2\u02df\u02e0\3\2\2\2\u02e0"+
		"\u02e2\5|?\2\u02e1\u02e3\5\u0086D\2\u02e2\u02e1\3\2\2\2\u02e2\u02e3\3"+
		"\2\2\2\u02e3\u02e5\3\2\2\2\u02e4\u02e6\7C\2\2\u02e5\u02e4\3\2\2\2\u02e5"+
		"\u02e6\3\2\2\2\u02e6\u02e8\3\2\2\2\u02e7\u02e9\7}\2\2\u02e8\u02e7\3\2"+
		"\2\2\u02e8\u02e9\3\2\2\2\u02e9\u02eb\3\2\2\2\u02ea\u02ec\7C\2\2\u02eb"+
		"\u02ea\3\2\2\2\u02eb\u02ec\3\2\2\2\u02ec\u02ed\3\2\2\2\u02ed\u02ee\5\u0084"+
		"C\2\u02ee\u02f9\3\2\2\2\u02ef\u02f1\5z>\2\u02f0\u02ef\3\2\2\2\u02f0\u02f1"+
		"\3\2\2\2\u02f1\u02f2\3\2\2\2\u02f2\u02f4\5x=\2\u02f3\u02f5\7C\2\2\u02f4"+
		"\u02f3\3\2\2\2\u02f4\u02f5\3\2\2\2\u02f5\u02f6\3\2\2\2\u02f6\u02f7\5\u0084"+
		"C\2\u02f7\u02f9\3\2\2\2\u02f8\u02d1\3\2\2\2\u02f8\u02f0\3\2\2\2\u02f9"+
		"w\3\2\2\2\u02fa\u02fb\5$\23\2\u02fby\3\2\2\2\u02fc\u02fe\5D#\2\u02fd\u02ff"+
		"\7C\2\2\u02fe\u02fd\3\2\2\2\u02fe\u02ff\3\2\2\2\u02ff\u0301\3\2\2\2\u0300"+
		"\u02fc\3\2\2\2\u0301\u0304\3\2\2\2\u0302\u0300\3\2\2\2\u0302\u0303\3\2"+
		"\2\2\u0303\u0305\3\2\2\2\u0304\u0302\3\2\2\2\u0305\u0306\5\u00a6T\2\u0306"+
		"\u030d\3\2\2\2\u0307\u0309\5F$\2\u0308\u030a\7C\2\2\u0309\u0308\3\2\2"+
		"\2\u0309\u030a\3\2\2\2\u030a\u030c\3\2\2\2\u030b\u0307\3\2\2\2\u030c\u030f"+
		"\3\2\2\2\u030d\u030b\3\2\2\2\u030d\u030e\3\2\2\2\u030e\u0315\3\2\2\2\u030f"+
		"\u030d\3\2\2\2\u0310\u0312\5$\23\2\u0311\u0313\7C\2\2\u0312\u0311\3\2"+
		"\2\2\u0312\u0313\3\2\2\2\u0313\u0315\3\2\2\2\u0314\u0302\3\2\2\2\u0314"+
		"\u0310\3\2\2\2\u0315{\3\2\2\2\u0316\u0318\7\4\2\2\u0317\u0319\5~@\2\u0318"+
		"\u0317\3\2\2\2\u0318\u0319\3\2\2\2\u0319\u031a\3\2\2\2\u031a\u031c\7\5"+
		"\2\2\u031b\u031d\7\25\2\2\u031c\u031b\3\2\2\2\u031c\u031d\3\2\2\2\u031d"+
		"\u0324\3\2\2\2\u031e\u0320\7V\2\2\u031f\u0321\7C\2\2\u0320\u031f\3\2\2"+
		"\2\u0320\u0321\3\2\2\2\u0321\u0323\3\2\2\2\u0322\u031e\3\2\2\2\u0323\u0326"+
		"\3\2\2\2\u0324\u0322\3\2\2\2\u0324\u0325\3\2\2\2\u0325\u0328\3\2\2\2\u0326"+
		"\u0324\3\2\2\2\u0327\u0329\5\u0090I\2\u0328\u0327\3\2\2\2\u0328\u0329"+
		"\3\2\2\2\u0329}\3\2\2\2\u032a\u0332\5\u0080A\2\u032b\u032d\7\17\2\2\u032c"+
		"\u032e\7C\2\2\u032d\u032c\3\2\2\2\u032d\u032e\3\2\2\2\u032e\u032f\3\2"+
		"\2\2\u032f\u0331\5\u0080A\2\u0330\u032b\3\2\2\2\u0331\u0334\3\2\2\2\u0332"+
		"\u0330\3\2\2\2\u0332\u0333\3\2\2\2\u0333\u033a\3\2\2\2\u0334\u0332\3\2"+
		"\2\2\u0335\u0337\7\17\2\2\u0336\u0338\7C\2\2\u0337\u0336\3\2\2\2\u0337"+
		"\u0338\3\2\2\2\u0338\u0339\3\2\2\2\u0339\u033b\7E\2\2\u033a\u0335\3\2"+
		"\2\2\u033a\u033b\3\2\2\2\u033b\177\3\2\2\2\u033c\u0341\7S\2\2\u033d\u033e"+
		"\5\u00aaV\2\u033e\u033f\5\u0082B\2\u033f\u0341\3\2\2\2\u0340\u033c\3\2"+
		"\2\2\u0340\u033d\3\2\2\2\u0341\u0081\3\2\2\2\u0342\u0344\5\u00b8]\2\u0343"+
		"\u0342\3\2\2\2\u0343\u0344\3\2\2\2\u0344\u034a\3\2\2\2\u0345\u0346\7\4"+
		"\2\2\u0346\u0347\5\u0082B\2\u0347\u0348\7\5\2\2\u0348\u034b\3\2\2\2\u0349"+
		"\u034b\5\u00acW\2\u034a\u0345\3\2\2\2\u034a\u0349\3\2\2\2\u034b\u034d"+
		"\3\2\2\2\u034c\u034e\5\u0100\u0081\2\u034d\u034c\3\2\2\2\u034d\u034e\3"+
		"\2\2\2\u034e\u0083\3\2\2\2\u034f\u0350\7w\2\2\u0350\u0351\bC\1\2\u0351"+
		"\u0085\3\2\2\2\u0352\u0353\7:\2\2\u0353\u0358\5\u0088E\2\u0354\u0355\7"+
		"\17\2\2\u0355\u0357\5\u0088E\2\u0356\u0354\3\2\2\2\u0357\u035a\3\2\2\2"+
		"\u0358\u0356\3\2\2\2\u0358\u0359\3\2\2\2\u0359\u0087\3\2\2\2\u035a\u0358"+
		"\3\2\2\2\u035b\u035c\5\u008aF\2\u035c\u035d\5\u008cG\2\u035d\u0089\3\2"+
		"\2\2\u035e\u0360\7;\2\2\u035f\u035e\3\2\2\2\u035f\u0360\3\2\2\2\u0360"+
		"\u0361\3\2\2\2\u0361\u0362\5\u00b4[\2\u0362\u008b\3\2\2\2\u0363\u0365"+
		"\7\4\2\2\u0364\u0366\5\u00bc_\2\u0365\u0364\3\2\2\2\u0365\u0366\3\2\2"+
		"\2\u0366\u0367\3\2\2\2\u0367\u0368\7\5\2\2\u0368\u008d\3\2\2\2\u0369\u0371"+
		"\5\u00b4[\2\u036a\u036b\7\4\2\2\u036b\u036c\5\u008eH\2\u036c\u036d\7\5"+
		"\2\2\u036d\u0371\3\2\2\2\u036e\u036f\7a\2\2\u036f\u0371\5J&\2\u0370\u0369"+
		"\3\2\2\2\u0370\u036a\3\2\2\2\u0370\u036e\3\2\2\2\u0371\u008f\3\2\2\2\u0372"+
		"\u0373\7[\2\2\u0373\u0374\7\4\2\2\u0374\u0375\5\u0092J\2\u0375\u0376\7"+
		"\5\2\2\u0376\u0091\3\2\2\2\u0377\u0379\5T+\2\u0378\u0377\3\2\2\2\u0379"+
		"\u037c\3\2\2\2\u037a\u0378\3\2\2\2\u037a\u037b\3\2\2\2\u037b\u0388\3\2"+
		"\2\2\u037c\u037a\3\2\2\2\u037d\u037e\7\4\2\2\u037e\u037f\5\u0092J\2\u037f"+
		"\u0383\7\5\2\2\u0380\u0382\5T+\2\u0381\u0380\3\2\2\2\u0382\u0385\3\2\2"+
		"\2\u0383\u0381\3\2\2\2\u0383\u0384\3\2\2\2\u0384\u0387\3\2\2\2\u0385\u0383"+
		"\3\2\2\2\u0386\u037d\3\2\2\2\u0387\u038a\3\2\2\2\u0388\u0386\3\2\2\2\u0388"+
		"\u0389\3\2\2\2\u0389\u0093\3\2\2\2\u038a\u0388\3\2\2\2\u038b\u038c\5\u0096"+
		"L\2\u038c\u0095\3\2\2\2\u038d\u038f\5P)\2\u038e\u038d\3\2\2\2\u038e\u038f"+
		"\3\2\2\2\u038f\u0390\3\2\2\2\u0390\u0392\5\u009eP\2\u0391\u0393\5\u009c"+
		"O\2\u0392\u0391\3\2\2\2\u0392\u0393\3\2\2\2\u0393\u03dd\3\2\2\2\u0394"+
		"\u0396\7Q\2\2\u0395\u0397\7C\2\2\u0396\u0395\3\2\2\2\u0396\u0397\3\2\2"+
		"\2\u0397\u0399\3\2\2\2\u0398\u0394\3\2\2\2\u0398\u0399\3\2\2\2\u0399\u039b"+
		"\3\2\2\2\u039a\u039c\5P)\2\u039b\u039a\3\2\2\2\u039b\u039c\3\2\2\2\u039c"+
		"\u039d\3\2\2\2\u039d\u039e\5\u00a6T\2\u039e\u039f\5\u009cO\2\u039f\u03dd"+
		"\3\2\2\2\u03a0\u03a2\7Q\2\2\u03a1\u03a3\7C\2\2\u03a2\u03a1\3\2\2\2\u03a2"+
		"\u03a3\3\2\2\2\u03a3\u03a5\3\2\2\2\u03a4\u03a0\3\2\2\2\u03a4\u03a5\3\2"+
		"\2\2\u03a5\u03a6\3\2\2\2\u03a6\u03a7\5\u00a6T\2\u03a7\u03a9\7\4\2\2\u03a8"+
		"\u03aa\5\u0098M\2\u03a9\u03a8\3\2\2\2\u03a9\u03aa\3\2\2\2\u03aa\u03ab"+
		"\3\2\2\2\u03ab\u03ad\5F$\2\u03ac\u03ae\5\u00b4[\2\u03ad\u03ac\3\2\2\2"+
		"\u03ad\u03ae\3\2\2\2\u03ae\u03af\3\2\2\2\u03af\u03b0\7\5\2\2\u03b0\u03b2"+
		"\5\u00aeX\2\u03b1\u03b3\7C\2\2\u03b2\u03b1\3\2\2\2\u03b2\u03b3\3\2\2\2"+
		"\u03b3\u03b5\3\2\2\2\u03b4\u03b6\5(\25\2\u03b5\u03b4\3\2\2\2\u03b5\u03b6"+
		"\3\2\2\2\u03b6\u03bc\3\2\2\2\u03b7\u03b9\7\6\2\2\u03b8\u03ba\7C\2\2\u03b9"+
		"\u03b8\3\2\2\2\u03b9\u03ba\3\2\2\2\u03ba\u03bb\3\2\2\2\u03bb\u03bd\5\u00f6"+
		"|\2\u03bc\u03b7\3\2\2\2\u03bc\u03bd\3\2\2\2\u03bd\u03be\3\2\2\2\u03be"+
		"\u03bf\7\3\2\2\u03bf\u03dd\3\2\2\2\u03c0\u03c2\7V\2\2\u03c1\u03c3\7C\2"+
		"\2\u03c2\u03c1\3\2\2\2\u03c2\u03c3\3\2\2\2\u03c3\u03c5\3\2\2\2\u03c4\u03c0"+
		"\3\2\2\2\u03c4\u03c5\3\2\2\2\u03c5\u03ca\3\2\2\2\u03c6\u03c8\5D#\2\u03c7"+
		"\u03c9\7C\2\2\u03c8\u03c7\3\2\2\2\u03c8\u03c9\3\2\2\2\u03c9\u03cb\3\2"+
		"\2\2\u03ca\u03c6\3\2\2\2\u03ca\u03cb\3\2\2\2\u03cb\u03d0\3\2\2\2\u03cc"+
		"\u03ce\7Q\2\2\u03cd\u03cf\7C\2\2\u03ce\u03cd\3\2\2\2\u03ce\u03cf\3\2\2"+
		"\2\u03cf\u03d1\3\2\2\2\u03d0\u03cc\3\2\2\2\u03d0\u03d1\3\2\2\2\u03d1\u03d2"+
		"\3\2\2\2\u03d2\u03d4\5\u009aN\2\u03d3\u03d5\7C\2\2\u03d4\u03d3\3\2\2\2"+
		"\u03d4\u03d5\3\2\2\2\u03d5\u03d7\3\2\2\2\u03d6\u03d8\5\u009cO\2\u03d7"+
		"\u03d6\3\2\2\2\u03d7\u03d8\3\2\2\2\u03d8\u03da\3\2\2\2\u03d9\u03db\7\3"+
		"\2\2\u03da\u03d9\3\2\2\2\u03da\u03db\3\2\2\2\u03db\u03dd\3\2\2\2\u03dc"+
		"\u038e\3\2\2\2\u03dc\u0398\3\2\2\2\u03dc\u03a4\3\2\2\2\u03dc\u03c4\3\2"+
		"\2\2\u03dd\u0097\3\2\2\2\u03de\u03e0\7v\2\2\u03df\u03de\3\2\2\2\u03e0"+
		"\u03e1\3\2\2\2\u03e1\u03df\3\2\2\2\u03e1\u03e2\3\2\2\2\u03e2\u0099\3\2"+
		"\2\2\u03e3\u03e5\7`\2\2\u03e4\u03e6\7C\2\2\u03e5\u03e4\3\2\2\2\u03e5\u03e6"+
		"\3\2\2\2\u03e6\u03e8\3\2\2\2\u03e7\u03e9\5(\25\2\u03e8\u03e7\3\2\2\2\u03e8"+
		"\u03e9\3\2\2\2\u03e9\u03ee\3\2\2\2\u03ea\u03ec\5\u00b4[\2\u03eb\u03ed"+
		"\7C\2\2\u03ec\u03eb\3\2\2\2\u03ec\u03ed\3\2\2\2\u03ed\u03ef\3\2\2\2\u03ee"+
		"\u03ea\3\2\2\2\u03ee\u03ef\3\2\2\2\u03ef\u03f1\3\2\2\2\u03f0\u03f2\5("+
		"\25\2\u03f1\u03f0\3\2\2\2\u03f1\u03f2\3\2\2\2\u03f2\u03f3\3\2\2\2\u03f3"+
		"\u03f4\7w\2\2\u03f4\u0413\bN\1\2\u03f5\u03f7\7`\2\2\u03f6\u03f8\7C\2\2"+
		"\u03f7\u03f6\3\2\2\2\u03f7\u03f8\3\2\2\2\u03f8\u03fa\3\2\2\2\u03f9\u03fb"+
		"\5(\25\2\u03fa\u03f9\3\2\2\2\u03fa\u03fb\3\2\2\2\u03fb\u03fc\3\2\2\2\u03fc"+
		"\u03fe\5\u00b4[\2\u03fd\u03ff\7C\2\2\u03fe\u03fd\3\2\2\2\u03fe\u03ff\3"+
		"\2\2\2\u03ff\u0401\3\2\2\2\u0400\u0402\5\u00b8]\2\u0401\u0400\3\2\2\2"+
		"\u0401\u0402\3\2\2\2\u0402\u0403\3\2\2\2\u0403\u0405\5\u00b4[\2\u0404"+
		"\u0406\5\u00b8]\2\u0405\u0404\3\2\2\2\u0405\u0406\3\2\2\2\u0406\u0407"+
		"\3\2\2\2\u0407\u0408\7\6\2\2\u0408\u0409\bN\1\2\u0409\u0413\3\2\2\2\u040a"+
		"\u040c\7`\2\2\u040b\u040d\7C\2\2\u040c\u040b\3\2\2\2\u040c\u040d\3\2\2"+
		"\2\u040d\u040f\3\2\2\2\u040e\u0410\5(\25\2\u040f\u040e\3\2\2\2\u040f\u0410"+
		"\3\2\2\2\u0410\u0411\3\2\2\2\u0411\u0413\5\u00b4[\2\u0412\u03e3\3\2\2"+
		"\2\u0412\u03f5\3\2\2\2\u0412\u040a\3\2\2\2\u0413\u009b\3\2\2\2\u0414\u041f"+
		"\5\u00fc\177\2\u0415\u0417\7C\2\2\u0416\u0415\3\2\2\2\u0416\u0417\3\2"+
		"\2\2\u0417\u0418\3\2\2\2\u0418\u041a\7\17\2\2\u0419\u041b\7C\2\2\u041a"+
		"\u0419\3\2\2\2\u041a\u041b\3\2\2\2\u041b\u041c\3\2\2\2\u041c\u041e\5\u00fc"+
		"\177\2\u041d\u0416\3\2\2\2\u041e\u0421\3\2\2\2\u041f\u041d\3\2\2\2\u041f"+
		"\u0420\3\2\2\2\u0420\u0423\3\2\2\2\u0421\u041f\3\2\2\2\u0422\u0424\7C"+
		"\2\2\u0423\u0422\3\2\2\2\u0423\u0424\3\2\2\2\u0424\u0426\3\2\2\2\u0425"+
		"\u0427\5(\25\2\u0426\u0425\3\2\2\2\u0426\u0427\3\2\2\2\u0427\u0428\3\2"+
		"\2\2\u0428\u0429\7\3\2\2\u0429\u009d\3\2\2\2\u042a\u042c\7c\2\2\u042b"+
		"\u042d\7C\2\2\u042c\u042b\3\2\2\2\u042c\u042d\3\2\2\2\u042d\u042f\3\2"+
		"\2\2\u042e\u0430\5\u00a0Q\2\u042f\u042e\3\2\2\2\u042f\u0430\3\2\2\2\u0430"+
		"\u0432\3\2\2\2\u0431\u0433\5\u00a2R\2\u0432\u0431\3\2\2\2\u0432\u0433"+
		"\3\2\2\2\u0433\u0434\3\2\2\2\u0434\u0435\7w\2\2\u0435\u0436\bP\1\2\u0436"+
		"\u009f\3\2\2\2\u0437\u0438\5\u00b4[\2\u0438\u00a1\3\2\2\2\u0439\u043a"+
		"\7:\2\2\u043a\u043f\5\u00a4S\2\u043b\u043c\7\17\2\2\u043c\u043e\5\u00a4"+
		"S\2\u043d\u043b\3\2\2\2\u043e\u0441\3\2\2\2\u043f\u043d\3\2\2\2\u043f"+
		"\u0440\3\2\2\2\u0440\u00a3\3\2\2\2\u0441\u043f\3\2\2\2\u0442\u0444\7X"+
		"\2\2\u0443\u0445\7C\2\2\u0444\u0443\3\2\2\2\u0444\u0445\3\2\2\2\u0445"+
		"\u0447\3\2\2\2\u0446\u0442\3\2\2\2\u0446\u0447\3\2\2\2\u0447\u0449\3\2"+
		"\2\2\u0448\u044a\5H%\2\u0449\u0448\3\2\2\2\u0449\u044a\3\2\2\2\u044a\u044b"+
		"\3\2\2\2\u044b\u044c\5\u00b4[\2\u044c\u00a5\3\2\2\2\u044d\u044f\7W\2\2"+
		"\u044e\u0450\7C\2\2\u044f\u044e\3\2\2\2\u044f\u0450\3\2\2\2\u0450\u0479"+
		"\3\2\2\2\u0451\u0453\5D#\2\u0452\u0454\7C\2\2\u0453\u0452\3\2\2\2\u0453"+
		"\u0454\3\2\2\2\u0454\u0479\3\2\2\2\u0455\u0457\7V\2\2\u0456\u0458\7C\2"+
		"\2\u0457\u0456\3\2\2\2\u0457\u0458\3\2\2\2\u0458\u0479\3\2\2\2\u0459\u045b"+
		"\7T\2\2\u045a\u045c\7C\2\2\u045b\u045a\3\2\2\2\u045b\u045c\3\2\2\2\u045c"+
		"\u0479\3\2\2\2\u045d\u045f\7U\2\2\u045e\u0460\7C\2\2\u045f\u045e\3\2\2"+
		"\2\u045f\u0460\3\2\2\2\u0460\u0479\3\2\2\2\u0461\u0463\5F$\2\u0462\u0464"+
		"\7C\2\2\u0463\u0462\3\2\2\2\u0463\u0464\3\2\2\2\u0464\u0479\3\2\2\2\u0465"+
		"\u0479\5\u00a8U\2\u0466\u0467\7\32\2\2\u0467\u0468\5R*\2\u0468\u0469\7"+
		"\33\2\2\u0469\u0474\3\2\2\2\u046a\u046b\7;\2\2\u046b\u0470\5\u00a8U\2"+
		"\u046c\u046d\7\32\2\2\u046d\u046e\5R*\2\u046e\u046f\7\33\2\2\u046f\u0471"+
		"\3\2\2\2\u0470\u046c\3\2\2\2\u0470\u0471\3\2\2\2\u0471\u0473\3\2\2\2\u0472"+
		"\u046a\3\2\2\2\u0473\u0476\3\2\2\2\u0474\u0472\3\2\2\2\u0474\u0475\3\2"+
		"\2\2\u0475\u0479\3\2\2\2\u0476\u0474\3\2\2\2\u0477\u0479\5$\23\2\u0478"+
		"\u044d\3\2\2\2\u0478\u0451\3\2\2\2\u0478\u0455\3\2\2\2\u0478\u0459\3\2"+
		"\2\2\u0478\u045d\3\2\2\2\u0478\u0461\3\2\2\2\u0478\u0465\3\2\2\2\u0478"+
		"\u0466\3\2\2\2\u0478\u0477\3\2\2\2\u0479\u047a\3\2\2\2\u047a\u0478\3\2"+
		"\2\2\u047a\u047b\3\2\2\2\u047b\u00a7\3\2\2\2\u047c\u047e\7S\2\2\u047d"+
		"\u047f\7C\2\2\u047e\u047d\3\2\2\2\u047e\u047f\3\2\2\2\u047f\u0499\3\2"+
		"\2\2\u0480\u0482\7\16\2\2\u0481\u0483\7C\2\2\u0482\u0481\3\2\2\2\u0482"+
		"\u0483\3\2\2\2\u0483\u0499\3\2\2\2\u0484\u0486\7<\2\2\u0485\u0487\7C\2"+
		"\2\u0486\u0485\3\2\2\2\u0486\u0487\3\2\2\2\u0487\u0499\3\2\2\2\u0488\u048a"+
		"\7=\2\2\u0489\u048b\7C\2\2\u048a\u0489\3\2\2\2\u048a\u048b\3\2\2\2\u048b"+
		"\u0499\3\2\2\2\u048c\u048e\7`\2\2\u048d\u048f\7C\2\2\u048e\u048d\3\2\2"+
		"\2\u048e\u048f\3\2\2\2\u048f\u0499\3\2\2\2\u0490\u0492\7c\2\2\u0491\u0493"+
		"\7C\2\2\u0492\u0491\3\2\2\2\u0492\u0493\3\2\2\2\u0493\u0499\3\2\2\2\u0494"+
		"\u0496\7v\2\2\u0495\u0497\7C\2\2\u0496\u0495\3\2\2\2\u0496\u0497\3\2\2"+
		"\2\u0497\u0499\3\2\2\2\u0498\u047c\3\2\2\2\u0498\u0480\3\2\2\2\u0498\u0484"+
		"\3\2\2\2\u0498\u0488\3\2\2\2\u0498\u048c\3\2\2\2\u0498\u0490\3\2\2\2\u0498"+
		"\u0494\3\2\2\2\u0499\u049a\3\2\2\2\u049a\u0498\3\2\2\2\u049a\u049b\3\2"+
		"\2\2\u049b\u00a9\3\2\2\2\u049c\u049e\7^\2\2\u049d\u049f\7C\2\2\u049e\u049d"+
		"\3\2\2\2\u049e\u049f\3\2\2\2\u049f\u04a5\3\2\2\2\u04a0\u04a2\7_\2\2\u04a1"+
		"\u04a3\7C\2\2\u04a2\u04a1\3\2\2\2\u04a2\u04a3\3\2\2\2\u04a3\u04a5\3\2"+
		"\2\2\u04a4\u049c\3\2\2\2\u04a4\u04a0\3\2\2\2\u04a4\u04a5\3\2\2\2\u04a5"+
		"\u04a6\3\2\2\2\u04a6\u04a7\5\u00a6T\2\u04a7\u00ab\3\2\2\2\u04a8\u04aa"+
		"\5\u00b4[\2\u04a9\u04ab\7C\2\2\u04aa\u04a9\3\2\2\2\u04aa\u04ab\3\2\2\2"+
		"\u04ab\u00ad\3\2\2\2\u04ac\u04ad\7\4\2\2\u04ad\u04ae\7S\2\2\u04ae\u04bf"+
		"\7\5\2\2\u04af\u04bb\7\4\2\2\u04b0\u04b8\5\u00b0Y\2\u04b1\u04b3\7\17\2"+
		"\2\u04b2\u04b4\7C\2\2\u04b3\u04b2\3\2\2\2\u04b3\u04b4\3\2\2\2\u04b4\u04b5"+
		"\3\2\2\2\u04b5\u04b7\5\u00b0Y\2\u04b6\u04b1\3\2\2\2\u04b7\u04ba\3\2\2"+
		"\2\u04b8\u04b6\3\2\2\2\u04b8\u04b9\3\2\2\2\u04b9\u04bc\3\2\2\2\u04ba\u04b8"+
		"\3\2\2\2\u04bb\u04b0\3\2\2\2\u04bb\u04bc\3\2\2\2\u04bc\u04bd\3\2\2\2\u04bd"+
		"\u04bf\7\5\2\2\u04be\u04ac\3\2\2\2\u04be\u04af\3\2\2\2\u04bf\u00af\3\2"+
		"\2\2\u04c0\u04c2\5\u00aaV\2\u04c1\u04c3\7C\2\2\u04c2\u04c1\3\2\2\2\u04c2"+
		"\u04c3\3\2\2\2\u04c3\u04c4\3\2\2\2\u04c4\u04c5\5\u00b2Z\2\u04c5\u04c8"+
		"\3\2\2\2\u04c6\u04c8\7E\2\2\u04c7\u04c0\3\2\2\2\u04c7\u04c6\3\2\2\2\u04c8"+
		"\u00b1\3\2\2\2\u04c9\u04cb\5\u00b8]\2\u04ca\u04c9\3\2\2\2\u04ca\u04cb"+
		"\3\2\2\2\u04cb\u04d3\3\2\2\2\u04cc\u04cd\7\4\2\2\u04cd\u04ce\5\u00b2Z"+
		"\2\u04ce\u04cf\7\5\2\2\u04cf\u04d4\3\2\2\2\u04d0\u04d2\5\u00acW\2\u04d1"+
		"\u04d0\3\2\2\2\u04d1\u04d2\3\2\2\2\u04d2\u04d4\3\2\2\2\u04d3\u04cc\3\2"+
		"\2\2\u04d3\u04d1\3\2\2\2\u04d4\u04d6\3\2\2\2\u04d5\u04d7\5\u0100\u0081"+
		"\2\u04d6\u04d5\3\2\2\2\u04d6\u04d7\3\2\2\2\u04d7\u00b3\3\2\2\2\u04d8\u04dd"+
		"\7v\2\2\u04d9\u04da\7;\2\2\u04da\u04dc\7v\2\2\u04db\u04d9\3\2\2\2\u04dc"+
		"\u04df\3\2\2\2\u04dd\u04db\3\2\2\2\u04dd\u04de\3\2\2\2\u04de\u04e4\3\2"+
		"\2\2\u04df\u04dd\3\2\2\2\u04e0\u04e4\7d\2\2\u04e1\u04e4\7r\2\2\u04e2\u04e4"+
		"\5H%\2\u04e3\u04d8\3\2\2\2\u04e3\u04e0\3\2\2\2\u04e3\u04e1\3\2\2\2\u04e3"+
		"\u04e2\3\2\2\2\u04e4\u00b5\3\2\2\2\u04e5\u04e6\t\24\2\2\u04e6\u00b7\3"+
		"\2\2\2\u04e7\u04e9\5F$\2\u04e8\u04ea\7>\2\2\u04e9\u04e8\3\2\2\2\u04e9"+
		"\u04ea\3\2\2\2\u04ea\u04ec\3\2\2\2\u04eb\u04e7\3\2\2\2\u04ec\u04ed\3\2"+
		"\2\2\u04ed\u04eb\3\2\2\2\u04ed\u04ee\3\2\2\2\u04ee\u00b9\3\2\2\2\u04ef"+
		"\u04f0\5\u00b8]\2\u04f0\u00bb\3\2\2\2\u04f1\u04f6\5\u00be`\2\u04f2\u04f3"+
		"\7D\2\2\u04f3\u04f5\7C\2\2\u04f4\u04f2\3\2\2\2\u04f5\u04f8\3\2\2\2\u04f6"+
		"\u04f4\3\2\2\2\u04f6\u04f7\3\2\2\2\u04f7\u050d\3\2\2\2\u04f8\u04f6\3\2"+
		"\2\2\u04f9\u04fb\7C\2\2\u04fa\u04f9\3\2\2\2\u04fa\u04fb\3\2\2\2\u04fb"+
		"\u04fd\3\2\2\2\u04fc\u04fe\7}\2\2\u04fd\u04fc\3\2\2\2\u04fd\u04fe\3\2"+
		"\2\2\u04fe\u0500\3\2\2\2\u04ff\u0501\7C\2\2\u0500\u04ff\3\2\2\2\u0500"+
		"\u0501\3\2\2\2\u0501\u0502\3\2\2\2\u0502\u0504\7\17\2\2\u0503\u0505\7"+
		"C\2\2\u0504\u0503\3\2\2\2\u0504\u0505\3\2\2\2\u0505\u0507\3\2\2\2\u0506"+
		"\u0508\7}\2\2\u0507\u0506\3\2\2\2\u0507\u0508\3\2\2\2\u0508\u050a\3\2"+
		"\2\2\u0509\u050b\7C\2\2\u050a\u0509\3\2\2\2\u050a\u050b\3\2\2\2\u050b"+
		"\u050c\3\2\2\2\u050c\u050e\5\u00bc_\2\u050d\u04fa\3\2\2\2\u050d\u050e"+
		"\3\2\2\2\u050e\u0513\3\2\2\2\u050f\u0510\7D\2\2\u0510\u0512\7C\2\2\u0511"+
		"\u050f\3\2\2\2\u0512\u0515\3\2\2\2\u0513\u0511\3\2\2\2\u0513\u0514\3\2"+
		"\2\2\u0514\u00bd\3\2\2\2\u0515\u0513\3\2\2\2\u0516\u052c\5\u00c0a\2\u0517"+
		"\u0519\7C\2\2\u0518\u0517\3\2\2\2\u0518\u0519\3\2\2\2\u0519\u051b\3\2"+
		"\2\2\u051a\u051c\7}\2\2\u051b\u051a\3\2\2\2\u051b\u051c\3\2\2\2\u051c"+
		"\u051e\3\2\2\2\u051d\u051f\7C\2\2\u051e\u051d\3\2\2\2\u051e\u051f\3\2"+
		"\2\2\u051f\u0520\3\2\2\2\u0520\u0522\5L\'\2\u0521\u0523\7C\2\2\u0522\u0521"+
		"\3\2\2\2\u0522\u0523\3\2\2\2\u0523\u0525\3\2\2\2\u0524\u0526\7}\2\2\u0525"+
		"\u0524\3\2\2\2\u0525\u0526\3\2\2\2\u0526\u0528\3\2\2\2\u0527\u0529\7C"+
		"\2\2\u0528\u0527\3\2\2\2\u0528\u0529\3\2\2\2\u0529\u052a\3\2\2\2\u052a"+
		"\u052b\5\u00be`\2\u052b\u052d\3\2\2\2\u052c\u0518\3\2\2\2\u052c\u052d"+
		"\3\2\2\2\u052d\u00bf\3\2\2\2\u052e\u055a\5\u00c2b\2\u052f\u0531\5\u00c2"+
		"b\2\u0530\u0532\7C\2\2\u0531\u0530\3\2\2\2\u0531\u0532\3\2\2\2\u0532\u0534"+
		"\3\2\2\2\u0533\u0535\7}\2\2\u0534\u0533\3\2\2\2\u0534\u0535\3\2\2\2\u0535"+
		"\u0537\3\2\2\2\u0536\u0538\7C\2\2\u0537\u0536\3\2\2\2\u0537\u0538\3\2"+
		"\2\2\u0538\u0539\3\2\2\2\u0539\u053b\7?\2\2\u053a\u053c\7C\2\2\u053b\u053a"+
		"\3\2\2\2\u053b\u053c\3\2\2\2\u053c\u053e\3\2\2\2\u053d\u053f\7}\2\2\u053e"+
		"\u053d\3\2\2\2\u053e\u053f\3\2\2\2\u053f\u0541\3\2\2\2\u0540\u0542\7C"+
		"\2\2\u0541\u0540\3\2\2\2\u0541\u0542\3\2\2\2\u0542\u0543\3\2\2\2\u0543"+
		"\u0545\5\u00bc_\2\u0544\u0546\7C\2\2\u0545\u0544\3\2\2\2\u0545\u0546\3"+
		"\2\2\2\u0546\u0548\3\2\2\2\u0547\u0549\7}\2\2\u0548\u0547\3\2\2\2\u0548"+
		"\u0549\3\2\2\2\u0549\u054b\3\2\2\2\u054a\u054c\7C\2\2\u054b\u054a\3\2"+
		"\2\2\u054b\u054c\3\2\2\2\u054c\u054d\3\2\2\2\u054d\u054f\7:\2\2\u054e"+
		"\u0550\7C\2\2\u054f\u054e\3\2\2\2\u054f\u0550\3\2\2\2\u0550\u0552\3\2"+
		"\2\2\u0551\u0553\7}\2\2\u0552\u0551\3\2\2\2\u0552\u0553\3\2\2\2\u0553"+
		"\u0555\3\2\2\2\u0554\u0556\7C\2\2\u0555\u0554\3\2\2\2\u0555\u0556\3\2"+
		"\2\2\u0556\u0557\3\2\2\2\u0557\u0558\5\u00c0a\2\u0558\u055a\3\2\2\2\u0559"+
		"\u052e\3\2\2\2\u0559\u052f\3\2\2\2\u055a\u00c1\3\2\2\2\u055b\u0570\5\u00c4"+
		"c\2\u055c\u055e\7C\2\2\u055d\u055c\3\2\2\2\u055d\u055e\3\2\2\2\u055e\u0560"+
		"\3\2\2\2\u055f\u0561\7}\2\2\u0560\u055f\3\2\2\2\u0560\u0561\3\2\2\2\u0561"+
		"\u0563\3\2\2\2\u0562\u0564\7C\2\2\u0563\u0562\3\2\2\2\u0563\u0564\3\2"+
		"\2\2\u0564\u0565\3\2\2\2\u0565\u0567\7\64\2\2\u0566\u0568\7C\2\2\u0567"+
		"\u0566\3\2\2\2\u0567\u0568\3\2\2\2\u0568\u056a\3\2\2\2\u0569\u056b\7}"+
		"\2\2\u056a\u0569\3\2\2\2\u056a\u056b\3\2\2\2\u056b\u056d\3\2\2\2\u056c"+
		"\u056e\7C\2\2\u056d\u056c\3\2\2\2\u056d\u056e\3\2\2\2\u056e\u056f\3\2"+
		"\2\2\u056f\u0571\5\u00c2b\2\u0570\u055d\3\2\2\2\u0570\u0571\3\2\2\2\u0571"+
		"\u00c3\3\2\2\2\u0572\u0587\5\u00c6d\2\u0573\u0575\7C\2\2\u0574\u0573\3"+
		"\2\2\2\u0574\u0575\3\2\2\2\u0575\u0577\3\2\2\2\u0576\u0578\7}\2\2\u0577"+
		"\u0576\3\2\2\2\u0577\u0578\3\2\2\2\u0578\u057a\3\2\2\2\u0579\u057b\7C"+
		"\2\2\u057a\u0579\3\2\2\2\u057a\u057b\3\2\2\2\u057b\u057c\3\2\2\2\u057c"+
		"\u057e\7\63\2\2\u057d\u057f\7C\2\2\u057e\u057d\3\2\2\2\u057e\u057f\3\2"+
		"\2\2\u057f\u0581\3\2\2\2\u0580\u0582\7}\2\2\u0581\u0580\3\2\2\2\u0581"+
		"\u0582\3\2\2\2\u0582\u0584\3\2\2\2\u0583\u0585\7C\2\2\u0584\u0583\3\2"+
		"\2\2\u0584\u0585\3\2\2\2\u0585\u0586\3\2\2\2\u0586\u0588\5\u00c4c\2\u0587"+
		"\u0574\3\2\2\2\u0587\u0588\3\2\2\2\u0588\u00c5\3\2\2\2\u0589\u059e\5\u00c8"+
		"e\2\u058a\u058c\7C\2\2\u058b\u058a\3\2\2\2\u058b\u058c\3\2\2\2\u058c\u058e"+
		"\3\2\2\2\u058d\u058f\7}\2\2\u058e\u058d\3\2\2\2\u058e\u058f\3\2\2\2\u058f"+
		"\u0591\3\2\2\2\u0590\u0592\7C\2\2\u0591\u0590\3\2\2\2\u0591\u0592\3\2"+
		"\2\2\u0592\u0593\3\2\2\2\u0593\u0595\7$\2\2\u0594\u0596\7C\2\2\u0595\u0594"+
		"\3\2\2\2\u0595\u0596\3\2\2\2\u0596\u0598\3\2\2\2\u0597\u0599\7}\2\2\u0598"+
		"\u0597\3\2\2\2\u0598\u0599\3\2\2\2\u0599\u059b\3\2\2\2\u059a\u059c\7C"+
		"\2\2\u059b\u059a\3\2\2\2\u059b\u059c\3\2\2\2\u059c\u059d\3\2\2\2\u059d"+
		"\u059f\5\u00c6d\2\u059e\u058b\3\2\2\2\u059e\u059f\3\2\2\2\u059f\u00c7"+
		"\3\2\2\2\u05a0\u05b5\5\u00caf\2\u05a1\u05a3\7C\2\2\u05a2\u05a1\3\2\2\2"+
		"\u05a2\u05a3\3\2\2\2\u05a3\u05a5\3\2\2\2\u05a4\u05a6\7}\2\2\u05a5\u05a4"+
		"\3\2\2\2\u05a5\u05a6\3\2\2\2\u05a6\u05a8\3\2\2\2\u05a7\u05a9\7C\2\2\u05a8"+
		"\u05a7\3\2\2\2\u05a8\u05a9\3\2\2\2\u05a9\u05aa\3\2\2\2\u05aa\u05ac\7#"+
		"\2\2\u05ab\u05ad\7C\2\2\u05ac\u05ab\3\2\2\2\u05ac\u05ad\3\2\2\2\u05ad"+
		"\u05af\3\2\2\2\u05ae\u05b0\7}\2\2\u05af\u05ae\3\2\2\2\u05af\u05b0\3\2"+
		"\2\2\u05b0\u05b2\3\2\2\2\u05b1\u05b3\7C\2\2\u05b2\u05b1\3\2\2\2\u05b2"+
		"\u05b3\3\2\2\2\u05b3\u05b4\3\2\2\2\u05b4\u05b6\5\u00c8e\2\u05b5\u05a2"+
		"\3\2\2\2\u05b5\u05b6\3\2\2\2\u05b6\u00c9\3\2\2\2\u05b7\u05cc\5\u00ccg"+
		"\2\u05b8\u05ba\7C\2\2\u05b9\u05b8\3\2\2\2\u05b9\u05ba\3\2\2\2\u05ba\u05bc"+
		"\3\2\2\2\u05bb\u05bd\7}\2\2\u05bc\u05bb\3\2\2\2\u05bc\u05bd\3\2\2\2\u05bd"+
		"\u05bf\3\2\2\2\u05be\u05c0\7C\2\2\u05bf\u05be\3\2\2\2\u05bf\u05c0\3\2"+
		"\2\2\u05c0\u05c1\3\2\2\2\u05c1\u05c3\7\24\2\2\u05c2\u05c4\7C\2\2\u05c3"+
		"\u05c2\3\2\2\2\u05c3\u05c4\3\2\2\2\u05c4\u05c6\3\2\2\2\u05c5\u05c7\7}"+
		"\2\2\u05c6\u05c5\3\2\2\2\u05c6\u05c7\3\2\2\2\u05c7\u05c9\3\2\2\2\u05c8"+
		"\u05ca\7C\2\2\u05c9\u05c8\3\2\2\2\u05c9\u05ca\3\2\2\2\u05ca\u05cb\3\2"+
		"\2\2\u05cb\u05cd\5\u00caf\2\u05cc\u05b9\3\2\2\2\u05cc\u05cd\3\2\2\2\u05cd"+
		"\u00cb\3\2\2\2\u05ce\u05e4\5\u00ceh\2\u05cf\u05d1\7C\2\2\u05d0\u05cf\3"+
		"\2\2\2\u05d0\u05d1\3\2\2\2\u05d1\u05d3\3\2\2\2\u05d2\u05d4\7}\2\2\u05d3"+
		"\u05d2\3\2\2\2\u05d3\u05d4\3\2\2\2\u05d4\u05d6\3\2\2\2\u05d5\u05d7\7C"+
		"\2\2\u05d6\u05d5\3\2\2\2\u05d6\u05d7\3\2\2\2\u05d7\u05d8\3\2\2\2\u05d8"+
		"\u05da\5N(\2\u05d9\u05db\7C\2\2\u05da\u05d9\3\2\2\2\u05da\u05db\3\2\2"+
		"\2\u05db\u05dd\3\2\2\2\u05dc\u05de\7}\2\2\u05dd\u05dc\3\2\2\2\u05dd\u05de"+
		"\3\2\2\2\u05de\u05e0\3\2\2\2\u05df\u05e1\7C\2\2\u05e0\u05df\3\2\2\2\u05e0"+
		"\u05e1\3\2\2\2\u05e1\u05e2\3\2\2\2\u05e2\u05e3\5\u00ccg\2\u05e3\u05e5"+
		"\3\2\2\2\u05e4\u05d0\3\2\2\2\u05e4\u05e5\3\2\2\2\u05e5\u00cd\3\2\2\2\u05e6"+
		"\u05fc\5\u00d0i\2\u05e7\u05e9\7C\2\2\u05e8\u05e7\3\2\2\2\u05e8\u05e9\3"+
		"\2\2\2\u05e9\u05eb\3\2\2\2\u05ea\u05ec\7}\2\2\u05eb\u05ea\3\2\2\2\u05eb"+
		"\u05ec\3\2\2\2\u05ec\u05ee\3\2\2\2\u05ed\u05ef\7C\2\2\u05ee\u05ed\3\2"+
		"\2\2\u05ee\u05ef\3\2\2\2\u05ef\u05f0\3\2\2\2\u05f0\u05f2\5@!\2\u05f1\u05f3"+
		"\7C\2\2\u05f2\u05f1\3\2\2\2\u05f2\u05f3\3\2\2\2\u05f3\u05f5\3\2\2\2\u05f4"+
		"\u05f6\7}\2\2\u05f5\u05f4\3\2\2\2\u05f5\u05f6\3\2\2\2\u05f6\u05f8\3\2"+
		"\2\2\u05f7\u05f9\7C\2\2\u05f8\u05f7\3\2\2\2\u05f8\u05f9\3\2\2\2\u05f9"+
		"\u05fa\3\2\2\2\u05fa\u05fb\5\u00ceh\2\u05fb\u05fd\3\2\2\2\u05fc\u05e8"+
		"\3\2\2\2\u05fc\u05fd\3\2\2\2\u05fd\u00cf\3\2\2\2\u05fe\u0613\5\u00d2j"+
		"\2\u05ff\u0601\7C\2\2\u0600\u05ff\3\2\2\2\u0600\u0601\3\2\2\2\u0601\u0603"+
		"\3\2\2\2\u0602\u0604\7}\2\2\u0603\u0602\3\2\2\2\u0603\u0604\3\2\2\2\u0604"+
		"\u0606\3\2\2\2\u0605\u0607\7C\2\2\u0606\u0605\3\2\2\2\u0606\u0607\3\2"+
		"\2\2\u0607\u0608\3\2\2\2\u0608\u060a\t\25\2\2\u0609\u060b\7C\2\2\u060a"+
		"\u0609\3\2\2\2\u060a\u060b\3\2\2\2\u060b\u060d\3\2\2\2\u060c\u060e\7}"+
		"\2\2\u060d\u060c\3\2\2\2\u060d\u060e\3\2\2\2\u060e\u0610\3\2\2\2\u060f"+
		"\u0611\7C\2\2\u0610\u060f\3\2\2\2\u0610\u0611\3\2\2\2\u0611\u0612\3\2"+
		"\2\2\u0612\u0614\5\u00d0i\2\u0613\u0600\3\2\2\2\u0613\u0614\3\2\2\2\u0614"+
		"\u00d1\3\2\2\2\u0615\u062a\5\u00d4k\2\u0616\u0618\7C\2\2\u0617\u0616\3"+
		"\2\2\2\u0617\u0618\3\2\2\2\u0618\u061a\3\2\2\2\u0619\u061b\7}\2\2\u061a"+
		"\u0619\3\2\2\2\u061a\u061b\3\2\2\2\u061b\u061d\3\2\2\2\u061c\u061e\7C"+
		"\2\2\u061d\u061c\3\2\2\2\u061d\u061e\3\2\2\2\u061e\u061f\3\2\2\2\u061f"+
		"\u0621\t\26\2\2\u0620\u0622\7C\2\2\u0621\u0620\3\2\2\2\u0621\u0622\3\2"+
		"\2\2\u0622\u0624\3\2\2\2\u0623\u0625\7}\2\2\u0624\u0623\3\2\2\2\u0624"+
		"\u0625\3\2\2\2\u0625\u0627\3\2\2\2\u0626\u0628\7C\2\2\u0627\u0626\3\2"+
		"\2\2\u0627\u0628\3\2\2\2\u0628\u0629\3\2\2\2\u0629\u062b\5\u00d2j\2\u062a"+
		"\u0617\3\2\2\2\u062a\u062b\3\2\2\2\u062b\u00d3\3\2\2\2\u062c\u0641\5\u00d6"+
		"l\2\u062d\u062f\7C\2\2\u062e\u062d\3\2\2\2\u062e\u062f\3\2\2\2\u062f\u0631"+
		"\3\2\2\2\u0630\u0632\7}\2\2\u0631\u0630\3\2\2\2\u0631\u0632\3\2\2\2\u0632"+
		"\u0634\3\2\2\2\u0633\u0635\7C\2\2\u0634\u0633\3\2\2\2\u0634\u0635\3\2"+
		"\2\2\u0635\u0636\3\2\2\2\u0636\u0638\t\27\2\2\u0637\u0639\7C\2\2\u0638"+
		"\u0637\3\2\2\2\u0638\u0639\3\2\2\2\u0639\u063b\3\2\2\2\u063a\u063c\7}"+
		"\2\2\u063b\u063a\3\2\2\2\u063b\u063c\3\2\2\2\u063c\u063e\3\2\2\2\u063d"+
		"\u063f\7C\2\2\u063e\u063d\3\2\2\2\u063e\u063f\3\2\2\2\u063f\u0640\3\2"+
		"\2\2\u0640\u0642\5\u00d4k\2\u0641\u062e\3\2\2\2\u0641\u0642\3\2\2\2\u0642"+
		"\u00d5\3\2\2\2\u0643\u0644\7\4\2\2\u0644\u0646\5F$\2\u0645\u0647\5\u00b4"+
		"[\2\u0646\u0645\3\2\2\2\u0646\u0647\3\2\2\2\u0647\u0648\3\2\2\2\u0648"+
		"\u0649\7\5\2\2\u0649\u064a\7\4\2\2\u064a\u064b\5\u00f4{\2\u064b\u064c"+
		"\7\5\2\2\u064c\u064f\3\2\2\2\u064d\u064f\5\u00d8m\2\u064e\u0643\3\2\2"+
		"\2\u064e\u064d\3\2\2\2\u064f\u00d7\3\2\2\2\u0650\u0651\7\4\2\2\u0651\u0652"+
		"\5\u00dan\2\u0652\u0653\7\5\2\2\u0653\u0654\5\u00d8m\2\u0654\u0657\3\2"+
		"\2\2\u0655\u0657\5\u00dco\2\u0656\u0650\3\2\2\2\u0656\u0655\3\2\2\2\u0657"+
		"\u00d9\3\2\2\2\u0658\u065d\5\u00a6T\2\u0659\u065a\5\u00a6T\2\u065a\u065b"+
		"\5\u00d6l\2\u065b\u065d\3\2\2\2\u065c\u0658\3\2\2\2\u065c\u0659\3\2\2"+
		"\2\u065d\u00db\3\2\2\2\u065e\u0666\5\u00dep\2\u065f\u0666\5\u00e2r\2\u0660"+
		"\u0666\5\u00e4s\2\u0661\u0666\5\u00e0q\2\u0662\u0666\5\u00f0y\2\u0663"+
		"\u0666\5\u00e8u\2\u0664\u0666\5$\23\2\u0665\u065e\3\2\2\2\u0665\u065f"+
		"\3\2\2\2\u0665\u0660\3\2\2\2\u0665\u0661\3\2\2\2\u0665\u0662\3\2\2\2\u0665"+
		"\u0663\3\2\2\2\u0665\u0664\3\2\2\2\u0666\u00dd\3\2\2\2\u0667\u0668\7\24"+
		"\2\2\u0668\u0669\5\u00b4[\2\u0669\u00df\3\2\2\2\u066a\u066c\7;\2\2\u066b"+
		"\u066a\3\2\2\2\u066b\u066c\3\2\2\2\u066c\u066d\3\2\2\2\u066d\u066f\7d"+
		"\2\2\u066e\u0670\7C\2\2\u066f\u066e\3\2\2\2\u066f\u0670\3\2\2\2\u0670"+
		"\u0672\3\2\2\2\u0671\u0673\7}\2\2\u0672\u0671\3\2\2\2\u0672\u0673\3\2"+
		"\2\2\u0673\u0675\3\2\2\2\u0674\u0676\7C\2\2\u0675\u0674\3\2\2\2\u0675"+
		"\u0676\3\2\2\2\u0676\u0677\3\2\2\2\u0677\u0679\5\u00a6T\2\u0678\u067a"+
		"\7C\2\2\u0679\u0678\3\2\2\2\u0679\u067a\3\2\2\2\u067a\u067c\3\2\2\2\u067b"+
		"\u067d\7}\2\2\u067c\u067b\3\2\2\2\u067c\u067d\3\2\2\2\u067d\u067f\3\2"+
		"\2\2\u067e\u0680\7C\2\2\u067f\u067e\3\2\2\2\u067f\u0680\3\2\2\2\u0680"+
		"\u0681\3\2\2\2\u0681\u0683\7\37\2\2\u0682\u0684\5\u00c0a\2\u0683\u0682"+
		"\3\2\2\2\u0683\u0684\3\2\2\2\u0684\u0685\3\2\2\2\u0685\u0686\7 \2\2\u0686"+
		"\u06a5\3\2\2\2\u0687\u0689\7;\2\2\u0688\u0687\3\2\2\2\u0688\u0689\3\2"+
		"\2\2\u0689\u068a\3\2\2\2\u068a\u068c\7d\2\2\u068b\u068d\7C\2\2\u068c\u068b"+
		"\3\2\2\2\u068c\u068d\3\2\2\2\u068d\u068f\3\2\2\2\u068e\u0690\7}\2\2\u068f"+
		"\u068e\3\2\2\2\u068f\u0690\3\2\2\2\u0690\u0692\3\2\2\2\u0691\u0693\7C"+
		"\2\2\u0692\u0691\3\2\2\2\u0692\u0693\3\2\2\2\u0693\u0694\3\2\2\2\u0694"+
		"\u0696\5\u00a6T\2\u0695\u0697\7C\2\2\u0696\u0695\3\2\2\2\u0696\u0697\3"+
		"\2\2\2\u0697\u0699\3\2\2\2\u0698\u069a\7}\2\2\u0699\u0698\3\2\2\2\u0699"+
		"\u069a\3\2\2\2\u069a\u069c\3\2\2\2\u069b\u069d\7C\2\2\u069c\u069b\3\2"+
		"\2\2\u069c\u069d\3\2\2\2\u069d\u069e\3\2\2\2\u069e\u06a0\7\4\2\2\u069f"+
		"\u06a1\5\u00bc_\2\u06a0\u069f\3\2\2\2\u06a0\u06a1\3\2\2\2\u06a1\u06a2"+
		"\3\2\2\2\u06a2\u06a3\7\5\2\2\u06a3\u06a5\3\2\2\2\u06a4\u066b\3\2\2\2\u06a4"+
		"\u0688\3\2\2\2\u06a5\u00e1\3\2\2\2\u06a6\u06a8\5> \2\u06a7\u06a9\7C\2"+
		"\2\u06a8\u06a7\3\2\2\2\u06a8\u06a9\3\2\2\2\u06a9\u06ab\3\2\2\2\u06aa\u06ac"+
		"\7}\2\2\u06ab\u06aa\3\2\2\2\u06ab\u06ac\3\2\2\2\u06ac\u06ae\3\2\2\2\u06ad"+
		"\u06af\7C\2\2\u06ae\u06ad\3\2\2\2\u06ae\u06af\3\2\2\2\u06af\u06b0\3\2"+
		"\2\2\u06b0\u06b1\5\u00d8m\2\u06b1\u00e3\3\2\2\2\u06b2\u06b4\5\u00e6t\2"+
		"\u06b3\u06b5\7C\2\2\u06b4\u06b3\3\2\2\2\u06b4\u06b5\3\2\2\2\u06b5\u06b7"+
		"\3\2\2\2\u06b6\u06b8\7}\2\2\u06b7\u06b6\3\2\2\2\u06b7\u06b8\3\2\2\2\u06b8"+
		"\u06ba\3\2\2\2\u06b9\u06bb\7C\2\2\u06ba\u06b9\3\2\2\2\u06ba\u06bb\3\2"+
		"\2\2\u06bb\u06bc\3\2\2\2\u06bc\u06bd\7\4\2\2\u06bd\u06be\5\u00eav\2\u06be"+
		"\u06bf\7\5\2\2\u06bf\u06cd\3\2\2\2\u06c0\u06c2\5\u00e6t\2\u06c1\u06c3"+
		"\7C\2\2\u06c2\u06c1\3\2\2\2\u06c2\u06c3\3\2\2\2\u06c3\u06c5\3\2\2\2\u06c4"+
		"\u06c6\7}\2\2\u06c5\u06c4\3\2\2\2\u06c5\u06c6\3\2\2\2\u06c6\u06c8\3\2"+
		"\2\2\u06c7\u06c9\7C\2\2\u06c8\u06c7\3\2\2\2\u06c8\u06c9\3\2\2\2\u06c9"+
		"\u06ca\3\2\2\2\u06ca\u06cb\5\u00ecw\2\u06cb\u06cd\3\2\2\2\u06cc\u06b2"+
		"\3\2\2\2\u06cc\u06c0\3\2\2\2\u06cd\u00e5\3\2\2\2\u06ce\u06cf\7@\2\2\u06cf"+
		"\u00e7\3\2\2\2\u06d0\u06d2\7A\2\2\u06d1\u06d3\7C\2\2\u06d2\u06d1\3\2\2"+
		"\2\u06d2\u06d3\3\2\2\2\u06d3\u06d5\3\2\2\2\u06d4\u06d6\7}\2\2\u06d5\u06d4"+
		"\3\2\2\2\u06d5\u06d6\3\2\2\2\u06d6\u06d8\3\2\2\2\u06d7\u06d9\7C\2\2\u06d8"+
		"\u06d7\3\2\2\2\u06d8\u06d9\3\2\2\2\u06d9\u06da\3\2\2\2\u06da\u06db\7\4"+
		"\2\2\u06db\u06dc\5\u00bc_\2\u06dc\u06dd\7\5\2\2\u06dd\u06ea\3\2\2\2\u06de"+
		"\u06e0\7A\2\2\u06df\u06e1\7C\2\2\u06e0\u06df\3\2\2\2\u06e0\u06e1\3\2\2"+
		"\2\u06e1\u06e3\3\2\2\2\u06e2\u06e4\7}\2\2\u06e3\u06e2\3\2\2\2\u06e3\u06e4"+
		"\3\2\2\2\u06e4\u06e6\3\2\2\2\u06e5\u06e7\7C\2\2\u06e6\u06e5\3\2\2\2\u06e6"+
		"\u06e7\3\2\2\2\u06e7\u06e8\3\2\2\2\u06e8\u06ea\5\u00bc_\2\u06e9\u06d0"+
		"\3\2\2\2\u06e9\u06de\3\2\2\2\u06ea\u00e9\3\2\2\2\u06eb\u06f8\5\u00a6T"+
		"\2\u06ec\u06ee\7C\2\2\u06ed\u06ec\3\2\2\2\u06ed\u06ee\3\2\2\2\u06ee\u06f0"+
		"\3\2\2\2\u06ef\u06f1\7}\2\2\u06f0\u06ef\3\2\2\2\u06f0\u06f1\3\2\2\2\u06f1"+
		"\u06f3\3\2\2\2\u06f2\u06f4\7C\2\2\u06f3\u06f2\3\2\2\2\u06f3\u06f4\3\2"+
		"\2\2\u06f4\u06f5\3\2\2\2\u06f5\u06f7\5F$\2\u06f6\u06ed\3\2\2\2\u06f7\u06fa"+
		"\3\2\2\2\u06f8\u06f6\3\2\2\2\u06f8\u06f9\3\2\2\2\u06f9\u00eb\3\2\2\2\u06fa"+
		"\u06f8\3\2\2\2\u06fb\u06fc\5\u00dco\2\u06fc\u00ed\3\2\2\2\u06fd\u06fe"+
		"\t\30\2\2\u06fe\u00ef\3\2\2\2\u06ff\u0701\by\1\2\u0700\u0702\5\u00a6T"+
		"\2\u0701\u0700\3\2\2\2\u0701\u0702\3\2\2\2\u0702\u0703\3\2\2\2\u0703\u0718"+
		"\5\u00f2z\2\u0704\u0718\5\u00f8}\2\u0705\u0707\5F$\2\u0706\u0705\3\2\2"+
		"\2\u0706\u0707\3\2\2\2\u0707\u0708\3\2\2\2\u0708\u070a\5\u00eex\2\u0709"+
		"\u070b\7C\2\2\u070a\u0709\3\2\2\2\u070a\u070b\3\2\2\2\u070b\u070d\3\2"+
		"\2\2\u070c\u070e\7}\2\2\u070d\u070c\3\2\2\2\u070d\u070e\3\2\2\2\u070e"+
		"\u0710\3\2\2\2\u070f\u0711\7C\2\2\u0710\u070f\3\2\2\2\u0710\u0711\3\2"+
		"\2\2\u0711\u0713\3\2\2\2\u0712\u0714\5F$\2\u0713\u0712\3\2\2\2\u0713\u0714"+
		"\3\2\2\2\u0714\u0715\3\2\2\2\u0715\u0716\5\u00f8}\2\u0716\u0718\3\2\2"+
		"\2\u0717\u06ff\3\2\2\2\u0717\u0704\3\2\2\2\u0717\u0706\3\2\2\2\u0718\u0761"+
		"\3\2\2\2\u0719\u071b\f\n\2\2\u071a\u071c\7C\2\2\u071b\u071a\3\2\2\2\u071b"+
		"\u071c\3\2\2\2\u071c\u071e\3\2\2\2\u071d\u071f\7}\2\2\u071e\u071d\3\2"+
		"\2\2\u071e\u071f\3\2\2\2\u071f\u0721\3\2\2\2\u0720\u0722\7C\2\2\u0721"+
		"\u0720\3\2\2\2\u0721\u0722\3\2\2\2\u0722\u0723\3\2\2\2\u0723\u0725\7\37"+
		"\2\2\u0724\u0726\5\u00bc_\2\u0725\u0724\3\2\2\2\u0725\u0726\3\2\2\2\u0726"+
		"\u0727\3\2\2\2\u0727\u0760\7 \2\2\u0728\u072a\f\t\2\2\u0729\u072b\7C\2"+
		"\2\u072a\u0729\3\2\2\2\u072a\u072b\3\2\2\2\u072b\u072d\3\2\2\2\u072c\u072e"+
		"\7}\2\2\u072d\u072c\3\2\2\2\u072d\u072e\3\2\2\2\u072e\u0730\3\2\2\2\u072f"+
		"\u0731\7C\2\2\u0730\u072f\3\2\2\2\u0730\u0731\3\2\2\2\u0731\u0732\3\2"+
		"\2\2\u0732\u0733\7\4\2\2\u0733\u0734\5\u00f4{\2\u0734\u0735\7\5\2\2\u0735"+
		"\u0760\3\2\2\2\u0736\u0737\f\b\2\2\u0737\u0739\7B\2\2\u0738\u073a\7C\2"+
		"\2\u0739\u0738\3\2\2\2\u0739\u073a\3\2\2\2\u073a\u073c\3\2\2\2\u073b\u073d"+
		"\7}\2\2\u073c\u073b\3\2\2\2\u073c\u073d\3\2\2\2\u073d\u073f\3\2\2\2\u073e"+
		"\u0740\7C\2\2\u073f\u073e\3\2\2\2\u073f\u0740\3\2\2\2\u0740\u0742\3\2"+
		"\2\2\u0741\u0743\7b\2\2\u0742\u0741\3\2\2\2\u0742\u0743\3\2\2\2\u0743"+
		"\u0744\3\2\2\2\u0744\u0760\5\u00b4[\2\u0745\u0746\f\7\2\2\u0746\u0748"+
		"\78\2\2\u0747\u0749\7C\2\2\u0748\u0747\3\2\2\2\u0748\u0749\3\2\2\2\u0749"+
		"\u074b\3\2\2\2\u074a\u074c\7}\2\2\u074b\u074a\3\2\2\2\u074b\u074c\3\2"+
		"\2\2\u074c\u074e\3\2\2\2\u074d\u074f\7C\2\2\u074e\u074d\3\2\2\2\u074e"+
		"\u074f\3\2\2\2\u074f\u0751\3\2\2\2\u0750\u0752\7b\2\2\u0751\u0750\3\2"+
		"\2\2\u0751\u0752\3\2\2\2\u0752\u0753\3\2\2\2\u0753\u0760\5\u00b4[\2\u0754"+
		"\u0756\f\6\2\2\u0755\u0757\7C\2\2\u0756\u0755\3\2\2\2\u0756\u0757\3\2"+
		"\2\2\u0757\u0759\3\2\2\2\u0758\u075a\7}\2\2\u0759\u0758\3\2\2\2\u0759"+
		"\u075a\3\2\2\2\u075a\u075c\3\2\2\2\u075b\u075d\7C\2\2\u075c\u075b\3\2"+
		"\2\2\u075c\u075d\3\2\2\2\u075d\u075e\3\2\2\2\u075e\u0760\5\u00eex\2\u075f"+
		"\u0719\3\2\2\2\u075f\u0728\3\2\2\2\u075f\u0736\3\2\2\2\u075f\u0745\3\2"+
		"\2\2\u075f\u0754\3\2\2\2\u0760\u0763\3\2\2\2\u0761\u075f\3\2\2\2\u0761"+
		"\u0762\3\2\2\2\u0762\u00f1\3\2\2\2\u0763\u0761\3\2\2\2\u0764\u0766\7w"+
		"\2\2\u0765\u0767\7C\2\2\u0766\u0765\3\2\2\2\u0766\u0767\3\2\2\2\u0767"+
		"\u076e\3\2\2\2\u0768\u076a\7}\2\2\u0769\u076b\7C\2\2\u076a\u0769\3\2\2"+
		"\2\u076a\u076b\3\2\2\2\u076b\u076d\3\2\2\2\u076c\u0768\3\2\2\2\u076d\u0770"+
		"\3\2\2\2\u076e\u076c\3\2\2\2\u076e\u076f\3\2\2\2\u076f\u0772\3\2\2\2\u0770"+
		"\u076e\3\2\2\2\u0771\u0773\5\u00f4{\2\u0772\u0771\3\2\2\2\u0772\u0773"+
		"\3\2\2\2\u0773\u0775\3\2\2\2\u0774\u0776\7C\2\2\u0775\u0774\3\2\2\2\u0775"+
		"\u0776\3\2\2\2\u0776\u077d\3\2\2\2\u0777\u0779\7}\2\2\u0778\u077a\7C\2"+
		"\2\u0779\u0778\3\2\2\2\u0779\u077a\3\2\2\2\u077a\u077c\3\2\2\2\u077b\u0777"+
		"\3\2\2\2\u077c\u077f\3\2\2\2\u077d\u077b\3\2\2\2\u077d\u077e\3\2\2\2\u077e"+
		"\u0780\3\2\2\2\u077f\u077d\3\2\2\2\u0780\u0781\7x\2\2\u0781\u00f3\3\2"+
		"\2\2\u0782\u0784\7C\2\2\u0783\u0782\3\2\2\2\u0783\u0784\3\2\2\2\u0784"+
		"\u0786\3\2\2\2\u0785\u0787\7}\2\2\u0786\u0785\3\2\2\2\u0786\u0787\3\2"+
		"\2\2\u0787\u0789\3\2\2\2\u0788\u078a\7C\2\2\u0789\u0788\3\2\2\2\u0789"+
		"\u078a\3\2\2\2\u078a\u078b\3\2\2\2\u078b\u078d\5\u00f6|\2\u078c\u0783"+
		"\3\2\2\2\u078c\u078d\3\2\2\2\u078d\u078f\3\2\2\2\u078e\u0790\7C\2\2\u078f"+
		"\u078e\3\2\2\2\u078f\u0790\3\2\2\2\u0790\u0792\3\2\2\2\u0791\u0793\7}"+
		"\2\2\u0792\u0791\3\2\2\2\u0792\u0793\3\2\2\2\u0793\u0795\3\2\2\2\u0794"+
		"\u0796\7C\2\2\u0795\u0794\3\2\2\2\u0795\u0796\3\2\2\2\u0796\u07a9\3\2"+
		"\2\2\u0797\u0799\7\17\2\2\u0798\u0797\3\2\2\2\u0798\u0799\3\2\2\2\u0799"+
		"\u079b\3\2\2\2\u079a\u079c\7C\2\2\u079b\u079a\3\2\2\2\u079b\u079c\3\2"+
		"\2\2\u079c\u07a3\3\2\2\2\u079d\u079f\7}\2\2\u079e\u07a0\7C\2\2\u079f\u079e"+
		"\3\2\2\2\u079f\u07a0\3\2\2\2\u07a0\u07a2\3\2\2\2\u07a1\u079d\3\2\2\2\u07a2"+
		"\u07a5\3\2\2\2\u07a3\u07a1\3\2\2\2\u07a3\u07a4\3\2\2\2\u07a4\u07a6\3\2"+
		"\2\2\u07a5\u07a3\3\2\2\2\u07a6\u07a8\5\u00f6|\2\u07a7\u0798\3\2\2\2\u07a8"+
		"\u07ab\3\2\2\2\u07a9\u07a7\3\2\2\2\u07a9\u07aa\3\2\2\2\u07aa\u07ad\3\2"+
		"\2\2\u07ab\u07a9\3\2\2\2\u07ac\u07ae\7\17\2\2\u07ad\u07ac\3\2\2\2\u07ad"+
		"\u07ae\3\2\2\2\u07ae\u07b4\3\2\2\2\u07af\u07b1\7S\2\2\u07b0\u07b2\5F$"+
		"\2\u07b1\u07b0\3\2\2\2\u07b1\u07b2\3\2\2\2\u07b2\u07b4\3\2\2\2\u07b3\u078c"+
		"\3\2\2\2\u07b3\u07af\3\2\2\2\u07b4\u00f5\3\2\2\2\u07b5\u07b6\5\u00be`"+
		"\2\u07b6\u00f7\3\2\2\2\u07b7\u07b9\7B\2\2\u07b8\u07b7\3\2\2\2\u07b8\u07b9"+
		"\3\2\2\2\u07b9\u07ba\3\2\2\2\u07ba\u07c2\5\u00b4[\2\u07bb\u07c2\5F$\2"+
		"\u07bc\u07c2\5B\"\2\u07bd\u07be\7\4\2\2\u07be\u07bf\5\u00bc_\2\u07bf\u07c0"+
		"\7\5\2\2\u07c0\u07c2\3\2\2\2\u07c1\u07b8\3\2\2\2\u07c1\u07bb\3\2\2\2\u07c1"+
		"\u07bc\3\2\2\2\u07c1\u07bd\3\2\2\2\u07c2\u00f9\3\2\2\2\u07c3\u07c4\7\3"+
		"\2\2\u07c4\u00fb\3\2\2\2\u07c5\u07c7\5\u00fe\u0080\2\u07c6\u07c8\7C\2"+
		"\2\u07c7\u07c6\3\2\2\2\u07c7\u07c8\3\2\2\2\u07c8\u07d0\3\2\2\2\u07c9\u07cb"+
		"\7\4\2\2\u07ca\u07cc\5\u00bc_\2\u07cb\u07ca\3\2\2\2\u07cb\u07cc\3\2\2"+
		"\2\u07cc\u07cd\3\2\2\2\u07cd\u07d1\7\5\2\2\u07ce\u07cf\7\6\2\2\u07cf\u07d1"+
		"\5\u0102\u0082\2\u07d0\u07c9\3\2\2\2\u07d0\u07ce\3\2\2\2\u07d0\u07d1\3"+
		"\2\2\2\u07d1\u00fd\3\2\2\2\u07d2\u07d4\5\u00b8]\2\u07d3\u07d2\3\2\2\2"+
		"\u07d3\u07d4\3\2\2\2\u07d4\u07d5\3\2\2\2\u07d5\u07d7\5\u00b4[\2\u07d6"+
		"\u07d8\5\u0100\u0081\2\u07d7\u07d6\3\2\2\2\u07d7\u07d8\3\2\2\2\u07d8\u00ff"+
		"\3\2\2\2\u07d9\u07da\7\37\2\2\u07da\u07db\5\u0106\u0084\2\u07db\u07dc"+
		"\7 \2\2\u07dc\u07df\3\2\2\2\u07dd\u07df\5\u00aeX\2\u07de\u07d9\3\2\2\2"+
		"\u07de\u07dd\3\2\2\2\u07df\u0101\3\2\2\2\u07e0\u07e2\5d\63\2\u07e1\u07e0"+
		"\3\2\2\2\u07e2\u07e5\3\2\2\2\u07e3\u07e1\3\2\2\2\u07e3\u07e4\3\2\2\2\u07e4"+
		"\u07fc\3\2\2\2\u07e5\u07e3\3\2\2\2\u07e6\u07e7\7w\2\2\u07e7\u07e8\5\u0104"+
		"\u0083\2\u07e8\u07e9\7x\2\2\u07e9\u07f3\3\2\2\2\u07ea\u07eb\7\4\2\2\u07eb"+
		"\u07ec\5\u0104\u0083\2\u07ec\u07ed\7\5\2\2\u07ed\u07f3\3\2\2\2\u07ee\u07ef"+
		"\7\37\2\2\u07ef\u07f0\5\u0104\u0083\2\u07f0\u07f1\7 \2\2\u07f1\u07f3\3"+
		"\2\2\2\u07f2\u07e6\3\2\2\2\u07f2\u07ea\3\2\2\2\u07f2\u07ee\3\2\2\2\u07f3"+
		"\u07f7\3\2\2\2\u07f4\u07f6\5d\63\2\u07f5\u07f4\3\2\2\2\u07f6\u07f9\3\2"+
		"\2\2\u07f7\u07f5\3\2\2\2\u07f7\u07f8\3\2\2\2\u07f8\u07fb\3\2\2\2\u07f9"+
		"\u07f7\3\2\2\2\u07fa\u07f2\3\2\2\2\u07fb\u07fe\3\2\2\2\u07fc\u07fa\3\2"+
		"\2\2\u07fc\u07fd\3\2\2\2\u07fd\u0103\3\2\2\2\u07fe\u07fc\3\2\2\2\u07ff"+
		"\u0801\5f\64\2\u0800\u07ff\3\2\2\2\u0801\u0804\3\2\2\2\u0802\u0800\3\2"+
		"\2\2\u0802\u0803\3\2\2\2\u0803\u081b\3\2\2\2\u0804\u0802\3\2\2\2\u0805"+
		"\u0806\7w\2\2\u0806\u0807\5\u0104\u0083\2\u0807\u0808\7x\2\2\u0808\u0812"+
		"\3\2\2\2\u0809\u080a\7\4\2\2\u080a\u080b\5\u0104\u0083\2\u080b\u080c\7"+
		"\5\2\2\u080c\u0812\3\2\2\2\u080d\u080e\7\37\2\2\u080e\u080f\5\u0104\u0083"+
		"\2\u080f\u0810\7 \2\2\u0810\u0812\3\2\2\2\u0811\u0805\3\2\2\2\u0811\u0809"+
		"\3\2\2\2\u0811\u080d\3\2\2\2\u0812\u0816\3\2\2\2\u0813\u0815\5f\64\2\u0814"+
		"\u0813\3\2\2\2\u0815\u0818\3\2\2\2\u0816\u0814\3\2\2\2\u0816\u0817\3\2"+
		"\2\2\u0817\u081a\3\2\2\2\u0818\u0816\3\2\2\2\u0819\u0811\3\2\2\2\u081a"+
		"\u081d\3\2\2\2\u081b\u0819\3\2\2\2\u081b\u081c\3\2\2\2\u081c\u0105\3\2"+
		"\2\2\u081d\u081b\3\2\2\2\u081e\u0820\5^\60\2\u081f\u081e\3\2\2\2\u0820"+
		"\u0823\3\2\2\2\u0821\u081f\3\2\2\2\u0821\u0822\3\2\2\2\u0822\u082f\3\2"+
		"\2\2\u0823\u0821\3\2\2\2\u0824\u0825\7\37\2\2\u0825\u0826\5\u0106\u0084"+
		"\2\u0826\u082a\7 \2\2\u0827\u0829\5^\60\2\u0828\u0827\3\2\2\2\u0829\u082c"+
		"\3\2\2\2\u082a\u0828\3\2\2\2\u082a\u082b\3\2\2\2\u082b\u082e\3\2\2\2\u082c"+
		"\u082a\3\2\2\2\u082d\u0824\3\2\2\2\u082e\u0831\3\2\2\2\u082f\u082d\3\2"+
		"\2\2\u082f\u0830\3\2\2\2\u0830\u0107\3\2\2\2\u0831\u082f\3\2\2\2\u0189"+
		"\u0110\u0112\u011c\u0122\u0136\u013e\u0145\u014a\u0155\u015d\u0167\u0170"+
		"\u0172\u0178\u017d\u0181\u0186\u018c\u018f\u0193\u0197\u019b\u019f\u01a2"+
		"\u01a9\u01ad\u01b3\u01bd\u01c0\u01c7\u01d2\u01da\u01e0\u01e6\u01ed\u01f4"+
		"\u0208\u020c\u0213\u0219\u021e\u022f\u0235\u023b\u0240\u0244\u024f\u0279"+
		"\u028d\u028f\u02ab\u02b2\u02b7\u02bb\u02be\u02c1\u02c5\u02d1\u02d4\u02d8"+
		"\u02da\u02de\u02e2\u02e5\u02e8\u02eb\u02f0\u02f4\u02f8\u02fe\u0302\u0309"+
		"\u030d\u0312\u0314\u0318\u031c\u0320\u0324\u0328\u032d\u0332\u0337\u033a"+
		"\u0340\u0343\u034a\u034d\u0358\u035f\u0365\u0370\u037a\u0383\u0388\u038e"+
		"\u0392\u0396\u0398\u039b\u03a2\u03a4\u03a9\u03ad\u03b2\u03b5\u03b9\u03bc"+
		"\u03c2\u03c4\u03c8\u03ca\u03ce\u03d0\u03d4\u03d7\u03da\u03dc\u03e1\u03e5"+
		"\u03e8\u03ec\u03ee\u03f1\u03f7\u03fa\u03fe\u0401\u0405\u040c\u040f\u0412"+
		"\u0416\u041a\u041f\u0423\u0426\u042c\u042f\u0432\u043f\u0444\u0446\u0449"+
		"\u044f\u0453\u0457\u045b\u045f\u0463\u0470\u0474\u0478\u047a\u047e\u0482"+
		"\u0486\u048a\u048e\u0492\u0496\u0498\u049a\u049e\u04a2\u04a4\u04aa\u04b3"+
		"\u04b8\u04bb\u04be\u04c2\u04c7\u04ca\u04d1\u04d3\u04d6\u04dd\u04e3\u04e9"+
		"\u04ed\u04f6\u04fa\u04fd\u0500\u0504\u0507\u050a\u050d\u0513\u0518\u051b"+
		"\u051e\u0522\u0525\u0528\u052c\u0531\u0534\u0537\u053b\u053e\u0541\u0545"+
		"\u0548\u054b\u054f\u0552\u0555\u0559\u055d\u0560\u0563\u0567\u056a\u056d"+
		"\u0570\u0574\u0577\u057a\u057e\u0581\u0584\u0587\u058b\u058e\u0591\u0595"+
		"\u0598\u059b\u059e\u05a2\u05a5\u05a8\u05ac\u05af\u05b2\u05b5\u05b9\u05bc"+
		"\u05bf\u05c3\u05c6\u05c9\u05cc\u05d0\u05d3\u05d6\u05da\u05dd\u05e0\u05e4"+
		"\u05e8\u05eb\u05ee\u05f2\u05f5\u05f8\u05fc\u0600\u0603\u0606\u060a\u060d"+
		"\u0610\u0613\u0617\u061a\u061d\u0621\u0624\u0627\u062a\u062e\u0631\u0634"+
		"\u0638\u063b\u063e\u0641\u0646\u064e\u0656\u065c\u0665\u066b\u066f\u0672"+
		"\u0675\u0679\u067c\u067f\u0683\u0688\u068c\u068f\u0692\u0696\u0699\u069c"+
		"\u06a0\u06a4\u06a8\u06ab\u06ae\u06b4\u06b7\u06ba\u06c2\u06c5\u06c8\u06cc"+
		"\u06d2\u06d5\u06d8\u06e0\u06e3\u06e6\u06e9\u06ed\u06f0\u06f3\u06f8\u0701"+
		"\u0706\u070a\u070d\u0710\u0713\u0717\u071b\u071e\u0721\u0725\u072a\u072d"+
		"\u0730\u0739\u073c\u073f\u0742\u0748\u074b\u074e\u0751\u0756\u0759\u075c"+
		"\u075f\u0761\u0766\u076a\u076e\u0772\u0775\u0779\u077d\u0783\u0786\u0789"+
		"\u078c\u078f\u0792\u0795\u0798\u079b\u079f\u07a3\u07a9\u07ad\u07b1\u07b3"+
		"\u07b8\u07c1\u07c7\u07cb\u07d0\u07d3\u07d7\u07de\u07e3\u07f2\u07f7\u07fc"+
		"\u0802\u0811\u0816\u081b\u0821\u082a\u082f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}