package tests.languages.c.parseTreeToAST;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import ast.Comment;
import ast.c.expressions.CallExpression;
import ast.declarations.IdentifierDecl;
import ast.expressions.AdditiveExpression;
import ast.expressions.AddressOfExpression;
import ast.expressions.AndExpression;
import ast.expressions.AssignmentExpression;
import ast.expressions.BitAndExpression;
import ast.expressions.Callee;
import ast.expressions.CastExpression;
import ast.expressions.ConditionalExpression;
import ast.expressions.EqualityExpression;
import ast.expressions.ExclusiveOrExpression;
import ast.expressions.FunctionPointerUseExpression;
import ast.expressions.InclusiveOrExpression;
import ast.expressions.MultiplicativeExpression;
import ast.expressions.OrExpression;
import ast.expressions.PreFragment;
import ast.expressions.RelationalExpression;
import ast.expressions.ShiftExpression;
import ast.logical.statements.BlockStarter;
import ast.logical.statements.CompoundStatement;
import ast.logical.statements.Condition;
import ast.logical.statements.Label;
import ast.logical.statements.Statement;
import ast.statements.ExpressionStatement;
import ast.statements.IdentifierDeclStatement;
import ast.statements.StructUnionEnum;
import ast.statements.jump.ReturnStatement;

public class ExpressionParsingTest {

	@Test
	public void testMostBasicAssignment() {
		String input = "x = y;";
		CompoundStatement contentItem = (CompoundStatement) FunctionContentTestUtil.parseAndWalk(input);
		ExpressionStatement statementItem = (ExpressionStatement) contentItem.getStatements().get(0);
		AssignmentExpression expr = (AssignmentExpression) statementItem.getExpression();

		assertEquals("x",expr.getLeft().getEscapedCodeStr());
		assertEquals("y", expr.getRight().getEscapedCodeStr());
	}

	@Test
	public void testBasicAssignmentChain() {
		String input = "x = y = z;";
		CompoundStatement contentItem = (CompoundStatement) FunctionContentTestUtil.parseAndWalk(input);
		ExpressionStatement statementItem = (ExpressionStatement) contentItem.getStatements().get(0);
		AssignmentExpression expr = (AssignmentExpression) statementItem.getExpression();
		assertEquals("x",expr.getLeft().getEscapedCodeStr());
		assertEquals("y = z",expr.getRight().getEscapedCodeStr());
	}
	
	
	@Test
	public void testComplexAssignExprWithStructAndNewlines() {
		String input = "patloc[patlocs_used++]\n" + 
				"= (struct patloc) { .lineno = n_patterns,\n" + 
				".filename = filename,\n" + 
				".fileline = fileline };";
		CompoundStatement contentItem = (CompoundStatement) FunctionContentTestUtil.parseAndWalk(input);
		ExpressionStatement statementItem = (ExpressionStatement) contentItem.getStatements().get(0);
		assertEquals("patloc [ patlocs_used ++ ] \n" + 
				" = ( struct patloc ) { . lineno = n_patterns , \n" + 
				" . filename = filename , \n" + 
				" . fileline = fileline } ;", statementItem.getEscapedCodeStr());
	}
	
	@Test
	public void testComplexAssignExprWithStaticStruct() {
		String input = "static const struct {\n" + 
				"        const char *binary;\n" + 
				"        const char *command;\n" + 
				"    }  pkg_managers[] = {\n" + 
				"        {\"apt\", \"apt install adb\"},\n" + 
				"        {\"apt-get\", \"apt-get install adb\"},\n" + 
				"        {\"brew\", \"brew cask install android-platform-tools\"},\n" + 
				"        {\"dnf\", \"dnf install android-tools\"},\n" + 
				"        {\"emerge\", \"emerge dev-util/android-tools\"},\n" + 
				"        {\"pacman\", \"pacman -S android-tools\"},\n" + 
				"    };";
		CompoundStatement contentItem = (CompoundStatement) FunctionContentTestUtil.parseAndWalk(input);
		StructUnionEnum statementItem = (StructUnionEnum) contentItem.getStatements().get(0);
		assertEquals("static const struct { \n" + 
				" const char * binary ; \n" + 
				" const char * command ; \n" + 
				" } pkg_managers [ ] = { \n" + 
				" { \"apt\" , \"apt install adb\" } , \n" + 
				" { \"apt-get\" , \"apt-get install adb\" } , \n" + 
				" { \"brew\" , \"brew cask install android-platform-tools\" } , \n" + 
				" { \"dnf\" , \"dnf install android-tools\" } , \n" + 
				" { \"emerge\" , \"emerge dev-util/android-tools\" } , \n" + 
				" { \"pacman\" , \"pacman -S android-tools\" } , \n" + 
				" } ;", statementItem.getEscapedCodeStr());
		assertEquals("pkg_managers", statementItem.getChild(0).getChild(1).getEscapedCodeStr());
	}
	
	@Test
	public void testAssignWithHexadecimalFloat() {
		String input = "uint32_t u = f * 0x1p16f;";
		CompoundStatement contentItem = (CompoundStatement) FunctionContentTestUtil.parseAndWalk(input);
		IdentifierDeclStatement statementItem = (IdentifierDeclStatement) contentItem.getStatements().get(0);
		assertEquals("uint32_t u = f * 0x1p16f ;",statementItem.getEscapedCodeStr());
	}
	
	@Test
	public void testAssignWithCondition() {
		String input = "unibyte_c = (!locale\n" + 
				"                       || STREQ (locale, \"C\")\n" + 
				"                       || STREQ (locale, \"POSIX\"));";
		CompoundStatement contentItem = (CompoundStatement) FunctionContentTestUtil.parseAndWalk(input);
		ExpressionStatement statementItem = (ExpressionStatement) contentItem.getStatements().get(0);
		assertEquals("unibyte_c = ( ! locale \n" + 
				" || STREQ ( locale , \"C\" ) \n" + 
				" || STREQ ( locale , \"POSIX\" ) ) ;",statementItem.getEscapedCodeStr());
	}
	
	@Test
	public void testAssignWithCommentsAlongArguments() {
		String input = "bool supports_mipmaps =\n" + 
				"                sc_opengl_version_at_least(gl, 3, 0, /* OpenGL 3.0+ */\n" + 
				"                                               2, 0  /* OpenGL ES 2.0+ */);";
		CompoundStatement contentItem = (CompoundStatement) FunctionContentTestUtil.parseAndWalk(input);
		IdentifierDeclStatement statementItem = (IdentifierDeclStatement) contentItem.getStatements().get(0);
		assertEquals("bool supports_mipmaps = \n" + 
				" sc_opengl_version_at_least ( gl , 3 , 0 , /* OpenGL 3.0+ */ \n" + 
				" 2 , 0 /* OpenGL ES 2.0+ */ ) ;",statementItem.getEscapedCodeStr());
	}
	
	@Test
	public void testAssignWithIfDefAndDefinesInsideArguments() {
		String input = "    const char *const cmd[] = {\n" + 
				"        \"shell\",\n" + 
				"        \"CLASSPATH=\" DEVICE_SERVER_PATH,\n" + 
				"        \"app_process\",\n" + 
				"#ifdef SERVER_DEBUGGER\n" + 
				"# define SERVER_DEBUGGER_PORT \"5005\"\n" + 
				"# ifdef SERVER_DEBUGGER_METHOD_NEW\n" + 
				"        /* Android 9 and above */\n" + 
				"        \"-XjdwpProvider:internal -XjdwpOptions:transport=dt_socket,suspend=y,server=y,address=\"\n" + 
				"# else\n" + 
				"        /* Android 8 and below */\n" + 
				"        \"-agentlib:jdwp=transport=dt_socket,suspend=y,server=y,address=\"\n" + 
				"# endif\n" + 
				"            SERVER_DEBUGGER_PORT,\n" + 
				"#endif\n" + 
				"        \"/\", // unused\n" + 
				"        \"com.genymobile.scrcpy.Server\",\n" + 
				"        SCRCPY_VERSION,\n" + 
				"        log_level_to_server_string(params->log_level),\n" + 
				"        max_size_string,\n" + 
				"        bit_rate_string,\n" + 
				"        max_fps_string,\n" + 
				"        lock_video_orientation_string,\n" + 
				"        server->tunnel_forward ? \"true\" : \"false\",\n" + 
				"        params->crop ? params->crop : \"-\",\n" + 
				"        \"true\", // always send frame meta (packet boundaries + timestamp)\n" + 
				"        params->control ? \"true\" : \"false\",\n" + 
				"        display_id_string,\n" + 
				"        params->show_touches ? \"true\" : \"false\",\n" + 
				"        params->stay_awake ? \"true\" : \"false\",\n" + 
				"        params->codec_options ? params->codec_options : \"-\",\n" + 
				"        params->encoder_name ? params->encoder_name : \"-\",\n" + 
				"    };";
		CompoundStatement contentItem = (CompoundStatement) FunctionContentTestUtil.parseAndWalk(input);
		IdentifierDeclStatement statementItem = (IdentifierDeclStatement) contentItem.getStatements().get(0); 
		assertEquals("const char * const cmd [ ] = { \n" + 
				" \"shell\" , \n" + 
				" \"CLASSPATH=\" DEVICE_SERVER_PATH , \n" + 
				" \"app_process\" , \n" + 
				" #ifdef SERVER_DEBUGGER \n" + 
				" # define SERVER_DEBUGGER_PORT \"5005\" \n" + 
				" # ifdef SERVER_DEBUGGER_METHOD_NEW \n" + 
				" /* Android 9 and above */ \n" + 
				" \"-XjdwpProvider:internal -XjdwpOptions:transport=dt_socket,suspend=y,server=y,address=\" \n" + 
				" # else \n" + 
				" /* Android 8 and below */ \n" + 
				" \"-agentlib:jdwp=transport=dt_socket,suspend=y,server=y,address=\" \n" + 
				" # endif \n" + 
				" SERVER_DEBUGGER_PORT , \n" + 
				" #endif \n" + 
				" \"/\" , // unused\n" + 
				" \"com.genymobile.scrcpy.Server\" , \n" + 
				" SCRCPY_VERSION , \n" + 
				" log_level_to_server_string ( params -> log_level ) , \n" + 
				" max_size_string , \n" + 
				" bit_rate_string , \n" + 
				" max_fps_string , \n" + 
				" lock_video_orientation_string , \n" + 
				" server -> tunnel_forward ? \"true\" : \"false\" , \n" + 
				" params -> crop ? params -> crop : \"-\" , \n" + 
				" \"true\" , // always send frame meta (packet boundaries + timestamp)\n" + 
				" params -> control ? \"true\" : \"false\" , \n" + 
				" display_id_string , \n" + 
				" params -> show_touches ? \"true\" : \"false\" , \n" + 
				" params -> stay_awake ? \"true\" : \"false\" , \n" + 
				" params -> codec_options ? params -> codec_options : \"-\" , \n" + 
				" params -> encoder_name ? params -> encoder_name : \"-\" , \n" + 
				" } ;",statementItem.getEscapedCodeStr());
	}
	
	@Test
	public void testReturnWithIfdef() {
		String input = "\n" + 
				"	return (php_stream_xport_register(\"tcp\", php_stream_generic_socket_factory) == SUCCESS\n" + 
				"			&&\n" + 
				"			php_stream_xport_register(\"udp\", php_stream_generic_socket_factory) == SUCCESS\n" + 
				"#if defined(AF_UNIX) && !(defined(PHP_WIN32) || defined(__riscos__)) \n" + 
				"			&&\n" + 
				"			php_stream_xport_register(\"unix\", php_stream_generic_socket_factory) == SUCCESS\n" + 
				"			&&\n" + 
				"			php_stream_xport_register(\"udg\", php_stream_generic_socket_factory) == SUCCESS\n" + 
				"#endif\n" + 
				"		) ? SUCCESS : FAILURE;";
		CompoundStatement contentItem = (CompoundStatement) FunctionContentTestUtil.parseAndWalk(input);
		ReturnStatement statementItem = (ReturnStatement) contentItem.getStatements().get(0); 
		assertEquals("PreFragment",  statementItem.getChild(0).getTypeAsString()); //PreFragments are the first childs
		assertEquals("#if defined ( AF_UNIX ) && ! ( defined ( PHP_WIN32 ) || defined ( __riscos__ ) ) \n",  statementItem.getChild(0).getEscapedCodeStr());		
		assertEquals("return ( php_stream_xport_register ( \"tcp\" , php_stream_generic_socket_factory ) == SUCCESS \n" + 
				" && \n" + 
				" php_stream_xport_register ( \"udp\" , php_stream_generic_socket_factory ) == SUCCESS \n" + 
				" #if defined ( AF_UNIX ) && ! ( defined ( PHP_WIN32 ) || defined ( __riscos__ ) ) \n" +  
				" && \n" + 
				" php_stream_xport_register ( \"unix\" , php_stream_generic_socket_factory ) == SUCCESS \n" + 
				" && \n" + 
				" php_stream_xport_register ( \"udg\" , php_stream_generic_socket_factory ) == SUCCESS \n" + 
				" #endif \n" + 
				" ) ? SUCCESS : FAILURE ;",statementItem.getEscapedCodeStr());
	}
	
	@Test
	public void testNormalCase() {
		String input = "case 'm':";
		CompoundStatement contentItem = (CompoundStatement) FunctionContentTestUtil.parseAndWalk(input);
		Label statementItem = (Label) contentItem.getStatements().get(0);
		assertEquals("case 'm' :",statementItem.getEscapedCodeStr());
	}
	
	@Test
	public void testCaseWithCast() {
		String input = "case (char) -2:";
		CompoundStatement contentItem = (CompoundStatement) FunctionContentTestUtil.parseAndWalk(input);
		Label statementItem = (Label) contentItem.getStatements().get(0);
		assertEquals("case ( char ) - 2 :",statementItem.getEscapedCodeStr());
	}
	
	@Test
	public void testWideChar() {
		String input = "wchar_t c = u'_';";
		CompoundStatement contentItem = (CompoundStatement) FunctionContentTestUtil.parseAndWalk(input);
		IdentifierDeclStatement statementItem = (IdentifierDeclStatement) contentItem.getStatements().get(0);
		assertEquals("wchar_t c = u'_' ;",statementItem.getEscapedCodeStr());
	}	
	
	@Test
	public void testDeclWithNewKeyword() {
		String input = "StructDataEntry *new;";
		CompoundStatement contentItem = (CompoundStatement) FunctionContentTestUtil.parseAndWalk(input);
		IdentifierDeclStatement statementItem = (IdentifierDeclStatement) contentItem.getStatements().get(0);
		IdentifierDecl identifierDecl = (IdentifierDecl) statementItem.getIdentifierDeclList().get(0);
		assertEquals("new", identifierDecl.getName().getEscapedCodeStr());
	}
	
	@Test
	public void testMostBasicLocalVar() {
		String input = "int x;";
		CompoundStatement contentItem = (CompoundStatement) FunctionContentTestUtil.parseAndWalk(input);
		IdentifierDeclStatement statementItem = (IdentifierDeclStatement) contentItem.getStatements().get(0);
		IdentifierDecl identifierDecl = (IdentifierDecl) statementItem.getIdentifierDeclList().get(0);
		assertEquals("x", identifierDecl.getName().getEscapedCodeStr());
	}
	
	@Test
	public void testConstPointerDecl() {
		String input = "static char const *_check_current_function = NULL;";
		CompoundStatement contentItem = (CompoundStatement) FunctionContentTestUtil.parseAndWalk(input);
		IdentifierDeclStatement statementItem = (IdentifierDeclStatement) contentItem.getStatements().get(0);
		assertEquals("static char const * _check_current_function = NULL ;", statementItem.getEscapedCodeStr());
		IdentifierDecl identifierDecl = (IdentifierDecl) statementItem.getIdentifierDeclList().get(0);
		assertEquals("_check_current_function", identifierDecl.getChild(1).getEscapedCodeStr());
		//TODO Why is this NULL and not the identifier?
//		assertEquals("_check_current_function", identifierDecl.getName().getEscapedCodeStr());
	}
	
	@Test
	public void testConstCharArrayWithLinebreak() {
		String input = "const char message[] = \"\\x00\\x01\\x02\\x03\\x04\\x05\\x06\\x07\\x08\\x09\"\n" + 
				"\"\\x0a\\x0b\\x0c\\x0d\\x0e\";";
		CompoundStatement contentItem = (CompoundStatement) FunctionContentTestUtil.parseAndWalk(input);
		IdentifierDeclStatement statementItem = (IdentifierDeclStatement) contentItem.getStatements().get(0);
		assertEquals("const char message [ ] = \"\\x00\\x01\\x02\\x03\\x04\\x05\\x06\\x07\\x08\\x09\" \n" + 
				" \"\\x0a\\x0b\\x0c\\x0d\\x0e\" ;", statementItem.getEscapedCodeStr());
		IdentifierDecl identifierDecl = (IdentifierDecl) statementItem.getIdentifierDeclList().get(0);
		assertEquals("message", identifierDecl.getName().getEscapedCodeStr());
	}
	
	@Test
	public void testConstPointerWithLinebreak() {
		String input = "const XML_Char *expected\n" + 
				"= XCS(\"J\\x00f8rgen \\x00e6\\x00f8\\x00e5\\x00c6\\x00d8\\x00c5\");";
		CompoundStatement contentItem = (CompoundStatement) FunctionContentTestUtil.parseAndWalk(input);
		IdentifierDeclStatement statementItem = (IdentifierDeclStatement) contentItem.getStatements().get(0);
		assertEquals("const XML_Char * expected \n" + 
				" = XCS ( \"J\\x00f8rgen \\x00e6\\x00f8\\x00e5\\x00c6\\x00d8\\x00c5\" ) ;", statementItem.getEscapedCodeStr());
		IdentifierDecl identifierDecl = (IdentifierDecl) statementItem.getIdentifierDeclList().get(0);
		assertEquals("expected", identifierDecl.getName().getEscapedCodeStr());
	}
	
	@Test
	public void testConditionalExpr() {
		String input = "foo = cond ? x : y;";
		CompoundStatement contentItem = (CompoundStatement) FunctionContentTestUtil.parseAndWalk(input);
		ExpressionStatement statementItem = (ExpressionStatement) contentItem.getStatements().get(0);
		AssignmentExpression expr = (AssignmentExpression) statementItem.getExpression();
		ConditionalExpression right = (ConditionalExpression) expr.getRight();
		assertEquals("cond",right.getChild(0).getEscapedCodeStr());
	}
	

	@Test
	public void testOrExpr() {
		String input = "x || y;";
		CompoundStatement contentItem = (CompoundStatement) FunctionContentTestUtil.parseAndWalk(input);
		ExpressionStatement statementItem = (ExpressionStatement) contentItem.getStatements().get(0);
		OrExpression expr = (OrExpression) statementItem.getExpression();
		assertEquals("x",expr.getLeft().getEscapedCodeStr());
	}

	@Test
	public void testAndExpr() {
		String input = "x && y;";
		CompoundStatement contentItem = (CompoundStatement) FunctionContentTestUtil.parseAndWalk(input);
		ExpressionStatement statementItem = (ExpressionStatement) contentItem.getStatements().get(0);
		AndExpression expr = (AndExpression) statementItem.getExpression();
		assertEquals("x",expr.getLeft().getEscapedCodeStr());
	}
	
	@Test
	public void testAddressOfExpr() {
		String input = "address = &func;";
		CompoundStatement contentItem = (CompoundStatement) FunctionContentTestUtil.parseAndWalk(input);
		ExpressionStatement statementItem = (ExpressionStatement) contentItem.getStatements().get(0);
		AddressOfExpression expr = (AddressOfExpression) statementItem.getExpression().getChild(1);
		assertEquals("func", expr.getEscapedCodeStr());
	}

	@Test
	public void testInclusiveOrExpr() {
		String input = "x | y;";
		CompoundStatement contentItem = (CompoundStatement) FunctionContentTestUtil.parseAndWalk(input);
		ExpressionStatement statementItem = (ExpressionStatement) contentItem.getStatements().get(0);
		InclusiveOrExpression expr = (InclusiveOrExpression) statementItem.getExpression();
		assertEquals("x",expr.getLeft().getEscapedCodeStr());
	}

	@Test
	public void testExclusiveOrExpr() {
		String input = "x ^ y;";
		CompoundStatement contentItem = (CompoundStatement) FunctionContentTestUtil.parseAndWalk(input);
		ExpressionStatement statementItem = (ExpressionStatement) contentItem.getStatements().get(0);
		ExclusiveOrExpression expr = (ExclusiveOrExpression) statementItem.getExpression();
		assertEquals("x",expr.getLeft().getEscapedCodeStr());
	}

	@Test
	public void testBitAndExpr() {
		String input = "if(x & y){}";
		CompoundStatement contentItem = (CompoundStatement) FunctionContentTestUtil.parseAndWalk(input);
		BlockStarter starter = (BlockStarter) contentItem.getStatements().get(0);
		BitAndExpression expr = (BitAndExpression) ((Condition) starter.getCondition()).getExpression();
		assertEquals("x",expr.getLeft().getEscapedCodeStr());
	}

	@Test
	public void EqualityExpr() {
		String input = "if(x == y){}";
		CompoundStatement contentItem = (CompoundStatement) FunctionContentTestUtil.parseAndWalk(input);
		BlockStarter starter = (BlockStarter) contentItem.getStatements().get(0);
		EqualityExpression expr = (EqualityExpression) ((Condition) starter.getCondition()).getExpression();
		assertEquals("x",expr.getLeft().getEscapedCodeStr());
	}

	@Test
	public void RelationalExpr() {
		String input = "if(x < y){}";
		CompoundStatement contentItem = (CompoundStatement) FunctionContentTestUtil.parseAndWalk(input);
		BlockStarter starter = (BlockStarter) contentItem.getStatements().get(0);
		RelationalExpression expr = (RelationalExpression) ((Condition) starter.getCondition()).getExpression();
		assertEquals("x",expr.getLeft().getEscapedCodeStr());
	}

	@Test
	public void ShiftExpr() {
		String input = "if(x >> y){}";
		CompoundStatement contentItem = (CompoundStatement) FunctionContentTestUtil.parseAndWalk(input);
		BlockStarter starter = (BlockStarter) contentItem.getStatements().get(0);
		ShiftExpression expr = (ShiftExpression) ((Condition) starter.getCondition()).getExpression();
		assertEquals("x",expr.getLeft().getEscapedCodeStr());
	}

	@Test
	public void AdditiveExpr() {
		String input = "if(x + y){}";
		CompoundStatement contentItem = (CompoundStatement) FunctionContentTestUtil.parseAndWalk(input);
		BlockStarter starter = (BlockStarter) contentItem.getStatements().get(0);
		AdditiveExpression expr = (AdditiveExpression) ((Condition) starter.getCondition()).getExpression();
		assertEquals("x",expr.getLeft().getEscapedCodeStr());
	}

	@Test
	public void MultiplicativeExpr() {
		String input = "if(x * y){}";
		CompoundStatement contentItem = (CompoundStatement) FunctionContentTestUtil.parseAndWalk(input);
		BlockStarter starter = (BlockStarter) contentItem.getStatements().get(0);
		MultiplicativeExpression expr = (MultiplicativeExpression) ((Condition) starter.getCondition()).getExpression();
		assertEquals("x",expr.getLeft().getEscapedCodeStr());
	}

	@Test
	public void CastExpr() {
		String input = "if((some_type) y){}";
		CompoundStatement contentItem = (CompoundStatement) FunctionContentTestUtil.parseAndWalk(input);
		BlockStarter starter = (BlockStarter) contentItem.getStatements().get(0);
		CastExpression expr = (CastExpression) ((Condition) starter.getCondition()).getExpression();
		assertEquals("some_type", expr.getCastTarget().getEscapedCodeStr());
	}
	
	@Test
	public void CastExprWithUnsigned() {
		String input = "(unsigned long) y;";
		CompoundStatement contentItem = (CompoundStatement) FunctionContentTestUtil.parseAndWalk(input);
		ExpressionStatement  exprS = (ExpressionStatement) contentItem.getStatements().get(0);
		CastExpression expr = (CastExpression) exprS.getExpression();
		assertEquals("unsigned long", expr.getCastTarget().getEscapedCodeStr());
	}
	
	@Test
	public void FunktionPointerUse() {
		String input = "( * filter ) ( dirname , entry , baton ) ;";
		CompoundStatement contentItem = (CompoundStatement) FunctionContentTestUtil.parseAndWalk(input);
		ExpressionStatement  exprS = (ExpressionStatement) contentItem.getStatements().get(0);
		FunctionPointerUseExpression expr = (FunctionPointerUseExpression) exprS.getExpression();
		assertEquals("( * filter ) ( dirname , entry , baton )", expr.getEscapedCodeStr());
		assertEquals("filter", expr.getChild(0).getEscapedCodeStr());
	}
	
	@Test
	public void ptrInc() {
		String input = "++*p;";
		CompoundStatement contentItem = (CompoundStatement) FunctionContentTestUtil.parseAndWalk(input);
		ExpressionStatement expr = (ExpressionStatement) contentItem.getStatements().get(0);
		assertEquals("++ * p ;", expr.getEscapedCodeStr());
	}
	
	@Test
	public void volatilePtr() {
		String input = "TCase *volatile tc;";
		CompoundStatement contentItem = (CompoundStatement) FunctionContentTestUtil.parseAndWalk(input);
		IdentifierDeclStatement stmt = (IdentifierDeclStatement) contentItem.getStatements().get(0);
		assertEquals("TCase * volatile tc ;", stmt.getEscapedCodeStr());
	}
	
	@Test
	public void ptrDeclAndInit() {
		String input = "void (*post_reader_func)(void) = NULL;";
		CompoundStatement contentItem = (CompoundStatement) FunctionContentTestUtil.parseAndWalk(input);
		Statement expr = (Statement) contentItem.getStatements().get(0);
		assertEquals("void ( * post_reader_func ) ( void ) = NULL ;", expr.getEscapedCodeStr());
	}
	

	@Test
	public void funCall() {
		String input = "if(foo()){}";
		CompoundStatement contentItem = (CompoundStatement) FunctionContentTestUtil.parseAndWalk(input);
		BlockStarter starter = (BlockStarter) contentItem.getStatements().get(0);
		Callee expr = (Callee) ((Condition) starter.getCondition()).getExpression();
		assertEquals("foo", expr.getEscapedCodeStr());
	}
	
	@Test
	public void funCallExpression() {
		String input = "foo();";
		CompoundStatement contentItem = (CompoundStatement) FunctionContentTestUtil.parseAndWalk(input);
		ExpressionStatement expr = (ExpressionStatement) contentItem.getStatements().get(0);
		assertEquals("foo ( ) ;", expr.getEscapedCodeStr());
		Callee callEx = (Callee) expr.getChild(0);
		assertEquals("foo", callEx.getEscapedCodeStr());
	}
	
	@Test
	public void funCallWithLinebreak() {
		String input = "if(foo(x,\n y)){}";
		CompoundStatement contentItem = (CompoundStatement) FunctionContentTestUtil.parseAndWalk(input);
		BlockStarter starter = (BlockStarter) contentItem.getStatements().get(0);
		CallExpression expr = (CallExpression) ((Condition) starter.getCondition()).getExpression();
		assertEquals("foo", expr.getTargetFunc().getEscapedCodeStr());
		assertEquals("x", expr.getArgumentList().getChild(0).getEscapedCodeStr());
		assertEquals("y", expr.getArgumentList().getChild(1).getEscapedCodeStr());
	}
	
	@Test
	public void funCallWithLinebreakAndMultipleArgumentParts() {
		String input = "fprintf(stderr,\n" + 
				"                \"error '%\" XML_FMT_STR \"' at line %\" XML_FMT_INT_MOD\n" + 
				"                \"u character %\" XML_FMT_INT_MOD \"u\\n\");";
		CompoundStatement contentItem = (CompoundStatement) FunctionContentTestUtil.parseAndWalk(input);
		CallExpression expr = (CallExpression) contentItem.getChild(0).getChild(0);
		assertEquals("fprintf", expr.getTargetFunc().getEscapedCodeStr());
		assertEquals("stderr", expr.getArgumentList().getChild(0).getEscapedCodeStr());
		assertEquals("\"error '%\"", expr.getArgumentList().getChild(1).getEscapedCodeStr());
		assertEquals("XML_FMT_STR", expr.getArgumentList().getChild(2).getEscapedCodeStr());
		assertEquals("\"' at line %\"", expr.getArgumentList().getChild(3).getEscapedCodeStr());
		//The linebreak after this may cause problems
		assertEquals("XML_FMT_INT_MOD", expr.getArgumentList().getChild(4).getEscapedCodeStr());
		assertEquals("\"u character %\"", expr.getArgumentList().getChild(5).getEscapedCodeStr());
		assertEquals("XML_FMT_INT_MOD", expr.getArgumentList().getChild(6).getEscapedCodeStr());
		assertEquals("\"u\\n\"", expr.getArgumentList().getChild(7).getEscapedCodeStr());
	}

	
	@Test
	public void funCallWithoutLinebreakAndWithMultipleArgumentParts() {
		String input = "fprintf(\"error '%\" "
				+ "XML_FMT_STR "
				+ "\"' at line %\""
				+ " XML_FMT_INT_MOD"
				+ "\"u character %\" "
				+ "XML_FMT_INT_MOD "
				+ " \"u\\n\""
				+ ");";
		CompoundStatement contentItem = (CompoundStatement) FunctionContentTestUtil.parseAndWalk(input);
		CallExpression expr = (CallExpression) contentItem.getChild(0).getChild(0);
		assertEquals("fprintf", expr.getTargetFunc().getEscapedCodeStr());
		assertEquals("\"error '%\"", expr.getArgumentList().getChild(0).getEscapedCodeStr());
		assertEquals("XML_FMT_STR", expr.getArgumentList().getChild(1).getEscapedCodeStr());
		assertEquals("\"' at line %\"", expr.getArgumentList().getChild(2).getEscapedCodeStr());
		assertEquals("XML_FMT_INT_MOD", expr.getArgumentList().getChild(3).getEscapedCodeStr());
		assertEquals("\"u character %\"", expr.getArgumentList().getChild(4).getEscapedCodeStr());
		assertEquals("XML_FMT_INT_MOD", expr.getArgumentList().getChild(5).getEscapedCodeStr());
		assertEquals("\"u\\n\"", expr.getArgumentList().getChild(6).getEscapedCodeStr());
	}
	
	@Test
	public void funCallWithLinebreakAndMultipleArguments() {
		String input = "fprintf(stderr,\n" +
				"                XML_ErrorString(XML_GetErrorCode(parser)),\n" + 
				"                XML_GetCurrentLineNumber(parser),\n" + 
				"                XML_GetCurrentColumnNumber(parser));";
		CompoundStatement contentItem = (CompoundStatement) FunctionContentTestUtil.parseAndWalk(input);
		CallExpression expr = (CallExpression) contentItem.getChild(0).getChild(0);
		assertEquals("fprintf", expr.getTargetFunc().getEscapedCodeStr());
		assertEquals("stderr", expr.getArgumentList().getChild(0).getEscapedCodeStr());
		assertEquals("XML_ErrorString ( XML_GetErrorCode ( parser ) )", expr.getArgumentList().getChild(1).getEscapedCodeStr());
		assertEquals("XML_GetCurrentLineNumber ( parser )", expr.getArgumentList().getChild(2).getEscapedCodeStr());
		assertEquals("XML_GetCurrentColumnNumber ( parser )", expr.getArgumentList().getChild(3).getEscapedCodeStr());
	}
	
	@Test
	public void funCallWithComplexArguments() {
		String input = "zend_llist_init(&SG(sapi_headers).headers, sizeof(sapi_header_struct),\n" + 
				"			(void (*)(void *)) sapi_free_header, 0);";
		CompoundStatement contentItem = (CompoundStatement) FunctionContentTestUtil.parseAndWalk(input);
		CallExpression expr = (CallExpression) contentItem.getChild(0).getChild(0);
		assertEquals("zend_llist_init", expr.getTargetFunc().getEscapedCodeStr());
		assertEquals("SG", expr.getArgumentList().getChild(0).getEscapedCodeStr());
		assertEquals("( sapi_headers ) . headers", expr.getArgumentList().getChild(1).getEscapedCodeStr()); //This is a little strange
		assertEquals("sizeof ( sapi_header_struct )", expr.getArgumentList().getChild(2).getEscapedCodeStr());
		assertEquals("( void ( * ) ( void * ) ) sapi_free_header", expr.getArgumentList().getChild(3).getEscapedCodeStr());
		assertEquals("0", expr.getArgumentList().getChild(4).getEscapedCodeStr());
	}
	
	@Test
	public void returnWithBitfilter() {
		String input = "return (\n" + 
				"		OG(flags)\n" + 
				"		|	(OG(active) ? PHP_OUTPUT_ACTIVE : 0)\n" + 
				"		|	(OG(running)? PHP_OUTPUT_LOCKED : 0)\n" + 
				"	) & 0xff;";
		CompoundStatement contentItem = (CompoundStatement) FunctionContentTestUtil.parseAndWalk(input);
		ReturnStatement statementItem = (ReturnStatement) contentItem.getStatements().get(0);
		assertEquals("return ( \n" + 
				" OG ( flags ) \n" + 
				" | ( OG ( active ) ? PHP_OUTPUT_ACTIVE : 0 ) \n" + 
				" | ( OG ( running ) ? PHP_OUTPUT_LOCKED : 0 ) \n" + 
				" ) & 0xff ;", statementItem.getEscapedCodeStr());
	}
	
	@Test
	public void funcCallWithFunctionPointerCastArgument() {
		String input = "qsort (*namelist, nfiles, sizeof(struct dirent *), (int (*) (const void *, const void *)) compare);";
		CompoundStatement contentItem = (CompoundStatement) FunctionContentTestUtil.parseAndWalk(input);
		ExpressionStatement statementItem = (ExpressionStatement) contentItem.getStatements().get(0);
		assertEquals("qsort ( * namelist , nfiles , sizeof ( struct dirent * ) , ( int ( * ) ( const void * , const void * ) ) compare ) ;", statementItem.getEscapedCodeStr());
	}
	
	
	@Test
	public void commentInSameLineAsStatement() {
		String input = "x = 5; /*x is set to 5*/";
		CompoundStatement contentItem = (CompoundStatement) FunctionContentTestUtil.parseAndWalk(input);
		ExpressionStatement statementItem = (ExpressionStatement) contentItem.getStatements().get(0);
		Comment comment = (Comment) contentItem.getStatements().get(1);
		assertEquals("x = 5 ;", statementItem.getEscapedCodeStr());
		assertEquals("/*x is set to 5*/", comment.getEscapedCodeStr());
		assertEquals("ExpressionStatement", comment.getCommentee().getTypeAsString());
	}
	
	@Test
	public void commentBeforeSemicolon() {
		String input = "vlen = (semi ? (size_t)(semi - sep) : (mlen - plen)) - 1 /* '=' */;";
		CompoundStatement contentItem = (CompoundStatement) FunctionContentTestUtil.parseAndWalk(input);
		ExpressionStatement statementItem = (ExpressionStatement) contentItem.getStatements().get(0);
		assertEquals("vlen = ( semi ? ( size_t ) ( semi - sep ) : ( mlen - plen ) ) - 1 /* '=' */ ;", statementItem.getEscapedCodeStr());
	}
	
	@Test
	public void commentBeforeIdentifierInDeclaration() {
		String input = "PHPAPI extern /*const*/ php_stream_wrapper php_plain_files_wrapper;";
		CompoundStatement contentItem = (CompoundStatement) FunctionContentTestUtil.parseAndWalk(input);
		IdentifierDeclStatement statementItem = (IdentifierDeclStatement) contentItem.getStatements().get(0);
		assertEquals("PHPAPI extern /*const*/ php_stream_wrapper php_plain_files_wrapper ;", statementItem.getEscapedCodeStr());
	}
	
	@Test
	public void commentInSameLineAsStatement2() {
		String input = "char text[] = \"\\xFF\\xFE\"  /* BOM */\n" + 
				"\"<\\000e\\000/\\000>\\000\"  /* document element */\n" + 
				"\"\\r\\000\\n\\000\\r\\000\\n\\000\"; /* epilog */";
		CompoundStatement contentItem = (CompoundStatement) FunctionContentTestUtil.parseAndWalk(input);
		IdentifierDeclStatement statementItem = (IdentifierDeclStatement) contentItem.getStatements().get(0);
		assertEquals("char text [ ] = \"\\xFF\\xFE\" /* BOM */ \n" + 
				" \"<\\000e\\000/\\000>\\000\" /* document element */ \n" + 
				" \"\\r\\000\\n\\000\\r\\000\\n\\000\" ;", statementItem.getEscapedCodeStr());
	}
	
	@Test
	public void commentInSameLineAsStatement3() {
		String input = "  const char *text\n" + 
				"      = \"<?xml version='1.0' encoding='utf-8'?>\\n\"\n" + 
				"        /* 0xf0 0x90 0x80 0x80 = U+10000, the first Linear B character */\n" + 
				"        \"<do\\xf0\\x90\\x80\\x80/>\";";
		CompoundStatement contentItem = (CompoundStatement) FunctionContentTestUtil.parseAndWalk(input);
		IdentifierDeclStatement statementItem = (IdentifierDeclStatement) contentItem.getStatements().get(0);
		assertEquals("const char * text \n" + 
				" = \"<?xml version='1.0' encoding='utf-8'?>\\n\" \n" + 
				" /* 0xf0 0x90 0x80 0x80 = U+10000, the first Linear B character */ \n" + 
				" \"<do\\xf0\\x90\\x80\\x80/>\" ;", statementItem.getEscapedCodeStr());
	}
	
	
	@Test
	public void commentInSameLineAsStatement5() {
		String input = "  ExtTest test_data\n" + 
				" = {/* This text says it's an unsupported encoding, but it's really\n" + 
				" UTF-8, which we tell Expat using XML_SetEncoding().\n" + 
				" */\n" + 
				" \"<?xml encoding='iso-8859-3'?>\\xC3\\xA9\", XCS(\"utf-8\"), NULL};";
		CompoundStatement contentItem = (CompoundStatement) FunctionContentTestUtil.parseAndWalk(input);
		IdentifierDeclStatement statementItem = (IdentifierDeclStatement) contentItem.getStatements().get(0);
		assertEquals("ExtTest test_data \n" + 
				" = { /* This text says it's an unsupported encoding, but it's really\n" + 
				" UTF-8, which we tell Expat using XML_SetEncoding().\n" + 
				" */ \n" + 
				" \"<?xml encoding='iso-8859-3'?>\\xC3\\xA9\" , XCS ( \"utf-8\" ) , NULL } ;", statementItem.getEscapedCodeStr());
	}
	
	@Test
	public void commentInSameLineAsStatement6() {
		String input = "  const ExtFaults faults[]\n" + 
				"= {{\"<\", \"Incomplete element declaration not faulted\", NULL,\n" + 
				"XML_ERROR_UNCLOSED_TOKEN},\n" + 
				"{\"<\\xe2\\x82\", /* First two bytes of a three-byte char */\n" + 
				"\"Incomplete character not faulted\", NULL, XML_ERROR_PARTIAL_CHAR},\n" + 
				"{\"<tag>\\xe2\\x82\", \"Incomplete character in CDATA not faulted\", NULL,\n" + 
				"XML_ERROR_PARTIAL_CHAR},\n" + 
				"{NULL, NULL, NULL, XML_ERROR_NONE}};";
		CompoundStatement contentItem = (CompoundStatement) FunctionContentTestUtil.parseAndWalk(input);
		IdentifierDeclStatement statementItem = (IdentifierDeclStatement) contentItem.getStatements().get(0);
		assertEquals("const ExtFaults faults [ ] \n" + 
				" = { { \"<\" , \"Incomplete element declaration not faulted\" , NULL , \n" + 
				" XML_ERROR_UNCLOSED_TOKEN } , \n" + 
				" { \"<\\xe2\\x82\" , /* First two bytes of a three-byte char */ \n" + 
				" \"Incomplete character not faulted\" , NULL , XML_ERROR_PARTIAL_CHAR } , \n" + 
				" { \"<tag>\\xe2\\x82\" , \"Incomplete character in CDATA not faulted\" , NULL , \n" + 
				" XML_ERROR_PARTIAL_CHAR } , \n" + 
				" { NULL , NULL , NULL , XML_ERROR_NONE } } ;", statementItem.getEscapedCodeStr());
	}
	
	@Test
	public void onelineCommentInSameLineAsStatement() {
		String input = "char multilineString[] =\n" + 
				"    \"This is a\"\n" + 
				"    \" multiline\" //comment\n" + 
				"    \"definition\";";
		CompoundStatement contentItem = (CompoundStatement) FunctionContentTestUtil.parseAndWalk(input);
		IdentifierDeclStatement statementItem = (IdentifierDeclStatement) contentItem.getStatements().get(0);
		assertEquals("char multilineString [ ] = \n" + 
				" \"This is a\" \n" + 
				" \" multiline\" //comment\n" + 
				" \"definition\" ;", statementItem.getEscapedCodeStr());
	}
	
	@Test
	public void onelineCommentAndIfdefInSameLineAsStatement() {
		String input = "char multilineString[] =\n" + 
				"    \"This is a\"\n" + 
				"    #ifdef A\n" + 
				"    \" variant A\"\n" + 
				"    #endif\n" + 
				"    \" multiline\" //comment\n" + 
				"    \"definition\";";
		CompoundStatement contentItem = (CompoundStatement) FunctionContentTestUtil.parseAndWalk(input);
		IdentifierDeclStatement statementItem = (IdentifierDeclStatement) contentItem.getStatements().get(0);
		PreFragment statementPreIf = (PreFragment) statementItem.getChild(0);
		PreFragment statementEndif = (PreFragment) statementItem.getChild(1);
		assertEquals("char multilineString [ ] = \n" + 
				" \"This is a\" \n" + 
				" #ifdef A \n" + 
				" \" variant A\" \n" + 
				" #endif \n" + 
				" \" multiline\" //comment\n" + 
				" \"definition\" ;", statementItem.getEscapedCodeStr());
		assertEquals("#ifdef A \n", statementPreIf.getEscapedCodeStr());
		assertEquals("#endif", statementEndif.getEscapedCodeStr());
		
	}
	
	@Test
	public void strangeComment() {
		String input = "/* skip remaining characters if truncation width exceeded, needs to be done\n" + 
				" * before highlight opening */\n" + 
				"i++;";
		CompoundStatement contentItem = (CompoundStatement) FunctionContentTestUtil.parseAndWalk(input);
		ExpressionStatement statementItem = (ExpressionStatement) contentItem.getStatements().get(0);
		Comment comment = (Comment) contentItem.getStatements().get(1);
		assertEquals("i ++ ;", statementItem.getEscapedCodeStr());
		assertEquals("/* skip remaining characters if truncation width exceeded, needs to be done\n" + 
				" * before highlight opening */", comment.getEscapedCodeStr());
	}
	
	@Test
	public void nullExpression() {
		String input = ";";
		CompoundStatement contentItem = (CompoundStatement) FunctionContentTestUtil.parseAndWalk(input);
		ExpressionStatement statementItem = (ExpressionStatement) contentItem.getStatements().get(0);
		assertEquals(";", statementItem.getEscapedCodeStr());
	}
	
	@Test
	public void asmExpression() {
		String input = "asm __volatile__(\"\" :: \"r\"(dst) : \"memory\");";
		CompoundStatement contentItem = (CompoundStatement) FunctionContentTestUtil.parseAndWalk(input);
		ExpressionStatement statementItem = (ExpressionStatement) contentItem.getStatements().get(0);
		assertEquals("asm __volatile__ ( \"\" :: \"r\" ( dst ) : \"memory\" ) ;", statementItem.getEscapedCodeStr());
	}

}
