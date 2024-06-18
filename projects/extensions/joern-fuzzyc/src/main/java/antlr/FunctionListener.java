// Generated from src/main/java/antlr/Function.g4 by ANTLR 4.5.3

	package antlr;


  import java.util.Stack;
  import java.util.EmptyStackException;

import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link FunctionParser}.
 */
public interface FunctionListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code Try_statement}
	 * labeled alternative in {@link FunctionParser#selection_or_iteration}.
	 * @param ctx the parse tree
	 */
	void enterTry_statement(@NotNull FunctionParser.Try_statementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Try_statement}
	 * labeled alternative in {@link FunctionParser#selection_or_iteration}.
	 * @param ctx the parse tree
	 */
	void exitTry_statement(@NotNull FunctionParser.Try_statementContext ctx);

	/**
	 * Enter a parse tree produced by the {@code If_statement}
	 * labeled alternative in {@link FunctionParser#selection_or_iteration}.
	 * @param ctx the parse tree
	 */
	void enterIf_statement(@NotNull FunctionParser.If_statementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code If_statement}
	 * labeled alternative in {@link FunctionParser#selection_or_iteration}.
	 * @param ctx the parse tree
	 */
	void exitIf_statement(@NotNull FunctionParser.If_statementContext ctx);

	/**
	 * Enter a parse tree produced by the {@code Catch_statement}
	 * labeled alternative in {@link FunctionParser#selection_or_iteration}.
	 * @param ctx the parse tree
	 */
	void enterCatch_statement(@NotNull FunctionParser.Catch_statementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Catch_statement}
	 * labeled alternative in {@link FunctionParser#selection_or_iteration}.
	 * @param ctx the parse tree
	 */
	void exitCatch_statement(@NotNull FunctionParser.Catch_statementContext ctx);

	/**
	 * Enter a parse tree produced by the {@code For_statement}
	 * labeled alternative in {@link FunctionParser#selection_or_iteration}.
	 * @param ctx the parse tree
	 */
	void enterFor_statement(@NotNull FunctionParser.For_statementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code For_statement}
	 * labeled alternative in {@link FunctionParser#selection_or_iteration}.
	 * @param ctx the parse tree
	 */
	void exitFor_statement(@NotNull FunctionParser.For_statementContext ctx);

	/**
	 * Enter a parse tree produced by the {@code Else_statement}
	 * labeled alternative in {@link FunctionParser#selection_or_iteration}.
	 * @param ctx the parse tree
	 */
	void enterElse_statement(@NotNull FunctionParser.Else_statementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Else_statement}
	 * labeled alternative in {@link FunctionParser#selection_or_iteration}.
	 * @param ctx the parse tree
	 */
	void exitElse_statement(@NotNull FunctionParser.Else_statementContext ctx);

	/**
	 * Enter a parse tree produced by the {@code Switch_statement}
	 * labeled alternative in {@link FunctionParser#selection_or_iteration}.
	 * @param ctx the parse tree
	 */
	void enterSwitch_statement(@NotNull FunctionParser.Switch_statementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Switch_statement}
	 * labeled alternative in {@link FunctionParser#selection_or_iteration}.
	 * @param ctx the parse tree
	 */
	void exitSwitch_statement(@NotNull FunctionParser.Switch_statementContext ctx);

	/**
	 * Enter a parse tree produced by the {@code Do_statement}
	 * labeled alternative in {@link FunctionParser#selection_or_iteration}.
	 * @param ctx the parse tree
	 */
	void enterDo_statement(@NotNull FunctionParser.Do_statementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Do_statement}
	 * labeled alternative in {@link FunctionParser#selection_or_iteration}.
	 * @param ctx the parse tree
	 */
	void exitDo_statement(@NotNull FunctionParser.Do_statementContext ctx);

	/**
	 * Enter a parse tree produced by the {@code While_statement}
	 * labeled alternative in {@link FunctionParser#selection_or_iteration}.
	 * @param ctx the parse tree
	 */
	void enterWhile_statement(@NotNull FunctionParser.While_statementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code While_statement}
	 * labeled alternative in {@link FunctionParser#selection_or_iteration}.
	 * @param ctx the parse tree
	 */
	void exitWhile_statement(@NotNull FunctionParser.While_statementContext ctx);

	/**
	 * Enter a parse tree produced by the {@code memberAccess}
	 * labeled alternative in {@link FunctionParser#postfix_expression}.
	 * @param ctx the parse tree
	 */
	void enterMemberAccess(@NotNull FunctionParser.MemberAccessContext ctx);
	/**
	 * Exit a parse tree produced by the {@code memberAccess}
	 * labeled alternative in {@link FunctionParser#postfix_expression}.
	 * @param ctx the parse tree
	 */
	void exitMemberAccess(@NotNull FunctionParser.MemberAccessContext ctx);

	/**
	 * Enter a parse tree produced by the {@code incDecOp}
	 * labeled alternative in {@link FunctionParser#postfix_expression}.
	 * @param ctx the parse tree
	 */
	void enterIncDecOp(@NotNull FunctionParser.IncDecOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code incDecOp}
	 * labeled alternative in {@link FunctionParser#postfix_expression}.
	 * @param ctx the parse tree
	 */
	void exitIncDecOp(@NotNull FunctionParser.IncDecOpContext ctx);

	/**
	 * Enter a parse tree produced by the {@code arrayAssign}
	 * labeled alternative in {@link FunctionParser#postfix_expression}.
	 * @param ctx the parse tree
	 */
	void enterArrayAssign(@NotNull FunctionParser.ArrayAssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arrayAssign}
	 * labeled alternative in {@link FunctionParser#postfix_expression}.
	 * @param ctx the parse tree
	 */
	void exitArrayAssign(@NotNull FunctionParser.ArrayAssignContext ctx);

	/**
	 * Enter a parse tree produced by the {@code primaryOnly}
	 * labeled alternative in {@link FunctionParser#postfix_expression}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryOnly(@NotNull FunctionParser.PrimaryOnlyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code primaryOnly}
	 * labeled alternative in {@link FunctionParser#postfix_expression}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryOnly(@NotNull FunctionParser.PrimaryOnlyContext ctx);

	/**
	 * Enter a parse tree produced by the {@code funcCall}
	 * labeled alternative in {@link FunctionParser#postfix_expression}.
	 * @param ctx the parse tree
	 */
	void enterFuncCall(@NotNull FunctionParser.FuncCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code funcCall}
	 * labeled alternative in {@link FunctionParser#postfix_expression}.
	 * @param ctx the parse tree
	 */
	void exitFuncCall(@NotNull FunctionParser.FuncCallContext ctx);

	/**
	 * Enter a parse tree produced by the {@code arrayIndexing}
	 * labeled alternative in {@link FunctionParser#postfix_expression}.
	 * @param ctx the parse tree
	 */
	void enterArrayIndexing(@NotNull FunctionParser.ArrayIndexingContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arrayIndexing}
	 * labeled alternative in {@link FunctionParser#postfix_expression}.
	 * @param ctx the parse tree
	 */
	void exitArrayIndexing(@NotNull FunctionParser.ArrayIndexingContext ctx);

	/**
	 * Enter a parse tree produced by the {@code ptrMemberAccess}
	 * labeled alternative in {@link FunctionParser#postfix_expression}.
	 * @param ctx the parse tree
	 */
	void enterPtrMemberAccess(@NotNull FunctionParser.PtrMemberAccessContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ptrMemberAccess}
	 * labeled alternative in {@link FunctionParser#postfix_expression}.
	 * @param ctx the parse tree
	 */
	void exitPtrMemberAccess(@NotNull FunctionParser.PtrMemberAccessContext ctx);

	/**
	 * Enter a parse tree produced by the {@code declByType}
	 * labeled alternative in {@link FunctionParser#var_decl}.
	 * @param ctx the parse tree
	 */
	void enterDeclByType(@NotNull FunctionParser.DeclByTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code declByType}
	 * labeled alternative in {@link FunctionParser#var_decl}.
	 * @param ctx the parse tree
	 */
	void exitDeclByType(@NotNull FunctionParser.DeclByTypeContext ctx);

	/**
	 * Enter a parse tree produced by the {@code FunctionPointerDeclare}
	 * labeled alternative in {@link FunctionParser#var_decl}.
	 * @param ctx the parse tree
	 */
	void enterFunctionPointerDeclare(@NotNull FunctionParser.FunctionPointerDeclareContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctionPointerDeclare}
	 * labeled alternative in {@link FunctionParser#var_decl}.
	 * @param ctx the parse tree
	 */
	void exitFunctionPointerDeclare(@NotNull FunctionParser.FunctionPointerDeclareContext ctx);

	/**
	 * Enter a parse tree produced by the {@code StructUnionEnum}
	 * labeled alternative in {@link FunctionParser#var_decl}.
	 * @param ctx the parse tree
	 */
	void enterStructUnionEnum(@NotNull FunctionParser.StructUnionEnumContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StructUnionEnum}
	 * labeled alternative in {@link FunctionParser#var_decl}.
	 * @param ctx the parse tree
	 */
	void exitStructUnionEnum(@NotNull FunctionParser.StructUnionEnumContext ctx);

	/**
	 * Enter a parse tree produced by the {@code normOr}
	 * labeled alternative in {@link FunctionParser#conditional_expression}.
	 * @param ctx the parse tree
	 */
	void enterNormOr(@NotNull FunctionParser.NormOrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code normOr}
	 * labeled alternative in {@link FunctionParser#conditional_expression}.
	 * @param ctx the parse tree
	 */
	void exitNormOr(@NotNull FunctionParser.NormOrContext ctx);

	/**
	 * Enter a parse tree produced by the {@code cndExpr}
	 * labeled alternative in {@link FunctionParser#conditional_expression}.
	 * @param ctx the parse tree
	 */
	void enterCndExpr(@NotNull FunctionParser.CndExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cndExpr}
	 * labeled alternative in {@link FunctionParser#conditional_expression}.
	 * @param ctx the parse tree
	 */
	void exitCndExpr(@NotNull FunctionParser.CndExprContext ctx);

	/**
	 * Enter a parse tree produced by the {@code initDeclWithAssign}
	 * labeled alternative in {@link FunctionParser#init_declarator}.
	 * @param ctx the parse tree
	 */
	void enterInitDeclWithAssign(@NotNull FunctionParser.InitDeclWithAssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code initDeclWithAssign}
	 * labeled alternative in {@link FunctionParser#init_declarator}.
	 * @param ctx the parse tree
	 */
	void exitInitDeclWithAssign(@NotNull FunctionParser.InitDeclWithAssignContext ctx);

	/**
	 * Enter a parse tree produced by the {@code initDeclSimple}
	 * labeled alternative in {@link FunctionParser#init_declarator}.
	 * @param ctx the parse tree
	 */
	void enterInitDeclSimple(@NotNull FunctionParser.InitDeclSimpleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code initDeclSimple}
	 * labeled alternative in {@link FunctionParser#init_declarator}.
	 * @param ctx the parse tree
	 */
	void exitInitDeclSimple(@NotNull FunctionParser.InitDeclSimpleContext ctx);

	/**
	 * Enter a parse tree produced by the {@code initDeclWithCall}
	 * labeled alternative in {@link FunctionParser#init_declarator}.
	 * @param ctx the parse tree
	 */
	void enterInitDeclWithCall(@NotNull FunctionParser.InitDeclWithCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code initDeclWithCall}
	 * labeled alternative in {@link FunctionParser#init_declarator}.
	 * @param ctx the parse tree
	 */
	void exitInitDeclWithCall(@NotNull FunctionParser.InitDeclWithCallContext ctx);

	/**
	 * Enter a parse tree produced by the {@code throwStatement}
	 * labeled alternative in {@link FunctionParser#jump_statement}.
	 * @param ctx the parse tree
	 */
	void enterThrowStatement(@NotNull FunctionParser.ThrowStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code throwStatement}
	 * labeled alternative in {@link FunctionParser#jump_statement}.
	 * @param ctx the parse tree
	 */
	void exitThrowStatement(@NotNull FunctionParser.ThrowStatementContext ctx);

	/**
	 * Enter a parse tree produced by the {@code breakStatement}
	 * labeled alternative in {@link FunctionParser#jump_statement}.
	 * @param ctx the parse tree
	 */
	void enterBreakStatement(@NotNull FunctionParser.BreakStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code breakStatement}
	 * labeled alternative in {@link FunctionParser#jump_statement}.
	 * @param ctx the parse tree
	 */
	void exitBreakStatement(@NotNull FunctionParser.BreakStatementContext ctx);

	/**
	 * Enter a parse tree produced by the {@code continueStatement}
	 * labeled alternative in {@link FunctionParser#jump_statement}.
	 * @param ctx the parse tree
	 */
	void enterContinueStatement(@NotNull FunctionParser.ContinueStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code continueStatement}
	 * labeled alternative in {@link FunctionParser#jump_statement}.
	 * @param ctx the parse tree
	 */
	void exitContinueStatement(@NotNull FunctionParser.ContinueStatementContext ctx);

	/**
	 * Enter a parse tree produced by the {@code returnStatement}
	 * labeled alternative in {@link FunctionParser#jump_statement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(@NotNull FunctionParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code returnStatement}
	 * labeled alternative in {@link FunctionParser#jump_statement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(@NotNull FunctionParser.ReturnStatementContext ctx);

	/**
	 * Enter a parse tree produced by the {@code gotoStatement}
	 * labeled alternative in {@link FunctionParser#jump_statement}.
	 * @param ctx the parse tree
	 */
	void enterGotoStatement(@NotNull FunctionParser.GotoStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code gotoStatement}
	 * labeled alternative in {@link FunctionParser#jump_statement}.
	 * @param ctx the parse tree
	 */
	void exitGotoStatement(@NotNull FunctionParser.GotoStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link FunctionParser#statements}.
	 * @param ctx the parse tree
	 */
	void enterStatements(@NotNull FunctionParser.StatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionParser#statements}.
	 * @param ctx the parse tree
	 */
	void exitStatements(@NotNull FunctionParser.StatementsContext ctx);

	/**
	 * Enter a parse tree produced by {@link FunctionParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(@NotNull FunctionParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(@NotNull FunctionParser.StatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link FunctionParser#opening_curly}.
	 * @param ctx the parse tree
	 */
	void enterOpening_curly(@NotNull FunctionParser.Opening_curlyContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionParser#opening_curly}.
	 * @param ctx the parse tree
	 */
	void exitOpening_curly(@NotNull FunctionParser.Opening_curlyContext ctx);

	/**
	 * Enter a parse tree produced by {@link FunctionParser#closing_curly}.
	 * @param ctx the parse tree
	 */
	void enterClosing_curly(@NotNull FunctionParser.Closing_curlyContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionParser#closing_curly}.
	 * @param ctx the parse tree
	 */
	void exitClosing_curly(@NotNull FunctionParser.Closing_curlyContext ctx);

	/**
	 * Enter a parse tree produced by {@link FunctionParser#block_starter}.
	 * @param ctx the parse tree
	 */
	void enterBlock_starter(@NotNull FunctionParser.Block_starterContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionParser#block_starter}.
	 * @param ctx the parse tree
	 */
	void exitBlock_starter(@NotNull FunctionParser.Block_starterContext ctx);

	/**
	 * Enter a parse tree produced by {@link FunctionParser#selection_or_iteration}.
	 * @param ctx the parse tree
	 */
	void enterSelection_or_iteration(@NotNull FunctionParser.Selection_or_iterationContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionParser#selection_or_iteration}.
	 * @param ctx the parse tree
	 */
	void exitSelection_or_iteration(@NotNull FunctionParser.Selection_or_iterationContext ctx);

	/**
	 * Enter a parse tree produced by {@link FunctionParser#for_init_statement}.
	 * @param ctx the parse tree
	 */
	void enterFor_init_statement(@NotNull FunctionParser.For_init_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionParser#for_init_statement}.
	 * @param ctx the parse tree
	 */
	void exitFor_init_statement(@NotNull FunctionParser.For_init_statementContext ctx);

	/**
	 * Enter a parse tree produced by {@link FunctionParser#jump_statement}.
	 * @param ctx the parse tree
	 */
	void enterJump_statement(@NotNull FunctionParser.Jump_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionParser#jump_statement}.
	 * @param ctx the parse tree
	 */
	void exitJump_statement(@NotNull FunctionParser.Jump_statementContext ctx);

	/**
	 * Enter a parse tree produced by {@link FunctionParser#label}.
	 * @param ctx the parse tree
	 */
	void enterLabel(@NotNull FunctionParser.LabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionParser#label}.
	 * @param ctx the parse tree
	 */
	void exitLabel(@NotNull FunctionParser.LabelContext ctx);

	/**
	 * Enter a parse tree produced by {@link FunctionParser#expr_statement}.
	 * @param ctx the parse tree
	 */
	void enterExpr_statement(@NotNull FunctionParser.Expr_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionParser#expr_statement}.
	 * @param ctx the parse tree
	 */
	void exitExpr_statement(@NotNull FunctionParser.Expr_statementContext ctx);

	/**
	 * Enter a parse tree produced by {@link FunctionParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(@NotNull FunctionParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(@NotNull FunctionParser.ConditionContext ctx);

	/**
	 * Enter a parse tree produced by {@link FunctionParser#pre_statement}.
	 * @param ctx the parse tree
	 */
	void enterPre_statement(@NotNull FunctionParser.Pre_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionParser#pre_statement}.
	 * @param ctx the parse tree
	 */
	void exitPre_statement(@NotNull FunctionParser.Pre_statementContext ctx);

	/**
	 * Enter a parse tree produced by {@link FunctionParser#pre_blockstarter}.
	 * @param ctx the parse tree
	 */
	void enterPre_blockstarter(@NotNull FunctionParser.Pre_blockstarterContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionParser#pre_blockstarter}.
	 * @param ctx the parse tree
	 */
	void exitPre_blockstarter(@NotNull FunctionParser.Pre_blockstarterContext ctx);

	/**
	 * Enter a parse tree produced by {@link FunctionParser#pre_if_statement}.
	 * @param ctx the parse tree
	 */
	void enterPre_if_statement(@NotNull FunctionParser.Pre_if_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionParser#pre_if_statement}.
	 * @param ctx the parse tree
	 */
	void exitPre_if_statement(@NotNull FunctionParser.Pre_if_statementContext ctx);

	/**
	 * Enter a parse tree produced by {@link FunctionParser#pre_elif_statement}.
	 * @param ctx the parse tree
	 */
	void enterPre_elif_statement(@NotNull FunctionParser.Pre_elif_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionParser#pre_elif_statement}.
	 * @param ctx the parse tree
	 */
	void exitPre_elif_statement(@NotNull FunctionParser.Pre_elif_statementContext ctx);

	/**
	 * Enter a parse tree produced by {@link FunctionParser#pre_else_statement}.
	 * @param ctx the parse tree
	 */
	void enterPre_else_statement(@NotNull FunctionParser.Pre_else_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionParser#pre_else_statement}.
	 * @param ctx the parse tree
	 */
	void exitPre_else_statement(@NotNull FunctionParser.Pre_else_statementContext ctx);

	/**
	 * Enter a parse tree produced by {@link FunctionParser#pre_endif_statement}.
	 * @param ctx the parse tree
	 */
	void enterPre_endif_statement(@NotNull FunctionParser.Pre_endif_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionParser#pre_endif_statement}.
	 * @param ctx the parse tree
	 */
	void exitPre_endif_statement(@NotNull FunctionParser.Pre_endif_statementContext ctx);

	/**
	 * Enter a parse tree produced by {@link FunctionParser#pre_if_condition}.
	 * @param ctx the parse tree
	 */
	void enterPre_if_condition(@NotNull FunctionParser.Pre_if_conditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionParser#pre_if_condition}.
	 * @param ctx the parse tree
	 */
	void exitPre_if_condition(@NotNull FunctionParser.Pre_if_conditionContext ctx);

	/**
	 * Enter a parse tree produced by {@link FunctionParser#call_in_preStatement}.
	 * @param ctx the parse tree
	 */
	void enterCall_in_preStatement(@NotNull FunctionParser.Call_in_preStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionParser#call_in_preStatement}.
	 * @param ctx the parse tree
	 */
	void exitCall_in_preStatement(@NotNull FunctionParser.Call_in_preStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link FunctionParser#pre_command}.
	 * @param ctx the parse tree
	 */
	void enterPre_command(@NotNull FunctionParser.Pre_commandContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionParser#pre_command}.
	 * @param ctx the parse tree
	 */
	void exitPre_command(@NotNull FunctionParser.Pre_commandContext ctx);

	/**
	 * Enter a parse tree produced by {@link FunctionParser#pre_define}.
	 * @param ctx the parse tree
	 */
	void enterPre_define(@NotNull FunctionParser.Pre_defineContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionParser#pre_define}.
	 * @param ctx the parse tree
	 */
	void exitPre_define(@NotNull FunctionParser.Pre_defineContext ctx);

	/**
	 * Enter a parse tree produced by {@link FunctionParser#pre_undef}.
	 * @param ctx the parse tree
	 */
	void enterPre_undef(@NotNull FunctionParser.Pre_undefContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionParser#pre_undef}.
	 * @param ctx the parse tree
	 */
	void exitPre_undef(@NotNull FunctionParser.Pre_undefContext ctx);

	/**
	 * Enter a parse tree produced by {@link FunctionParser#pre_macro_identifier}.
	 * @param ctx the parse tree
	 */
	void enterPre_macro_identifier(@NotNull FunctionParser.Pre_macro_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionParser#pre_macro_identifier}.
	 * @param ctx the parse tree
	 */
	void exitPre_macro_identifier(@NotNull FunctionParser.Pre_macro_identifierContext ctx);

	/**
	 * Enter a parse tree produced by {@link FunctionParser#keyword}.
	 * @param ctx the parse tree
	 */
	void enterKeyword(@NotNull FunctionParser.KeywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionParser#keyword}.
	 * @param ctx the parse tree
	 */
	void exitKeyword(@NotNull FunctionParser.KeywordContext ctx);

	/**
	 * Enter a parse tree produced by {@link FunctionParser#pre_macro_parameters}.
	 * @param ctx the parse tree
	 */
	void enterPre_macro_parameters(@NotNull FunctionParser.Pre_macro_parametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionParser#pre_macro_parameters}.
	 * @param ctx the parse tree
	 */
	void exitPre_macro_parameters(@NotNull FunctionParser.Pre_macro_parametersContext ctx);

	/**
	 * Enter a parse tree produced by {@link FunctionParser#pre_macro}.
	 * @param ctx the parse tree
	 */
	void enterPre_macro(@NotNull FunctionParser.Pre_macroContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionParser#pre_macro}.
	 * @param ctx the parse tree
	 */
	void exitPre_macro(@NotNull FunctionParser.Pre_macroContext ctx);

	/**
	 * Enter a parse tree produced by {@link FunctionParser#macroCall}.
	 * @param ctx the parse tree
	 */
	void enterMacroCall(@NotNull FunctionParser.MacroCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionParser#macroCall}.
	 * @param ctx the parse tree
	 */
	void exitMacroCall(@NotNull FunctionParser.MacroCallContext ctx);

	/**
	 * Enter a parse tree produced by {@link FunctionParser#pre_diagnostic}.
	 * @param ctx the parse tree
	 */
	void enterPre_diagnostic(@NotNull FunctionParser.Pre_diagnosticContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionParser#pre_diagnostic}.
	 * @param ctx the parse tree
	 */
	void exitPre_diagnostic(@NotNull FunctionParser.Pre_diagnosticContext ctx);

	/**
	 * Enter a parse tree produced by {@link FunctionParser#pre_other}.
	 * @param ctx the parse tree
	 */
	void enterPre_other(@NotNull FunctionParser.Pre_otherContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionParser#pre_other}.
	 * @param ctx the parse tree
	 */
	void exitPre_other(@NotNull FunctionParser.Pre_otherContext ctx);

	/**
	 * Enter a parse tree produced by {@link FunctionParser#attributeList}.
	 * @param ctx the parse tree
	 */
	void enterAttributeList(@NotNull FunctionParser.AttributeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionParser#attributeList}.
	 * @param ctx the parse tree
	 */
	void exitAttributeList(@NotNull FunctionParser.AttributeListContext ctx);

	/**
	 * Enter a parse tree produced by {@link FunctionParser#attribute}.
	 * @param ctx the parse tree
	 */
	void enterAttribute(@NotNull FunctionParser.AttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionParser#attribute}.
	 * @param ctx the parse tree
	 */
	void exitAttribute(@NotNull FunctionParser.AttributeContext ctx);

	/**
	 * Enter a parse tree produced by {@link FunctionParser#pre_include}.
	 * @param ctx the parse tree
	 */
	void enterPre_include(@NotNull FunctionParser.Pre_includeContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionParser#pre_include}.
	 * @param ctx the parse tree
	 */
	void exitPre_include(@NotNull FunctionParser.Pre_includeContext ctx);

	/**
	 * Enter a parse tree produced by {@link FunctionParser#pre_include_next}.
	 * @param ctx the parse tree
	 */
	void enterPre_include_next(@NotNull FunctionParser.Pre_include_nextContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionParser#pre_include_next}.
	 * @param ctx the parse tree
	 */
	void exitPre_include_next(@NotNull FunctionParser.Pre_include_nextContext ctx);

	/**
	 * Enter a parse tree produced by {@link FunctionParser#pre_include_local_file}.
	 * @param ctx the parse tree
	 */
	void enterPre_include_local_file(@NotNull FunctionParser.Pre_include_local_fileContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionParser#pre_include_local_file}.
	 * @param ctx the parse tree
	 */
	void exitPre_include_local_file(@NotNull FunctionParser.Pre_include_local_fileContext ctx);

	/**
	 * Enter a parse tree produced by {@link FunctionParser#pre_include_filename}.
	 * @param ctx the parse tree
	 */
	void enterPre_include_filename(@NotNull FunctionParser.Pre_include_filenameContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionParser#pre_include_filename}.
	 * @param ctx the parse tree
	 */
	void exitPre_include_filename(@NotNull FunctionParser.Pre_include_filenameContext ctx);

	/**
	 * Enter a parse tree produced by {@link FunctionParser#pre_line}.
	 * @param ctx the parse tree
	 */
	void enterPre_line(@NotNull FunctionParser.Pre_lineContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionParser#pre_line}.
	 * @param ctx the parse tree
	 */
	void exitPre_line(@NotNull FunctionParser.Pre_lineContext ctx);

	/**
	 * Enter a parse tree produced by {@link FunctionParser#pre_pragma}.
	 * @param ctx the parse tree
	 */
	void enterPre_pragma(@NotNull FunctionParser.Pre_pragmaContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionParser#pre_pragma}.
	 * @param ctx the parse tree
	 */
	void exitPre_pragma(@NotNull FunctionParser.Pre_pragmaContext ctx);

	/**
	 * Enter a parse tree produced by {@link FunctionParser#comment}.
	 * @param ctx the parse tree
	 */
	void enterComment(@NotNull FunctionParser.CommentContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionParser#comment}.
	 * @param ctx the parse tree
	 */
	void exitComment(@NotNull FunctionParser.CommentContext ctx);

	/**
	 * Enter a parse tree produced by {@link FunctionParser#newline}.
	 * @param ctx the parse tree
	 */
	void enterNewline(@NotNull FunctionParser.NewlineContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionParser#newline}.
	 * @param ctx the parse tree
	 */
	void exitNewline(@NotNull FunctionParser.NewlineContext ctx);

	/**
	 * Enter a parse tree produced by {@link FunctionParser#unary_operator}.
	 * @param ctx the parse tree
	 */
	void enterUnary_operator(@NotNull FunctionParser.Unary_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionParser#unary_operator}.
	 * @param ctx the parse tree
	 */
	void exitUnary_operator(@NotNull FunctionParser.Unary_operatorContext ctx);

	/**
	 * Enter a parse tree produced by {@link FunctionParser#relational_operator}.
	 * @param ctx the parse tree
	 */
	void enterRelational_operator(@NotNull FunctionParser.Relational_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionParser#relational_operator}.
	 * @param ctx the parse tree
	 */
	void exitRelational_operator(@NotNull FunctionParser.Relational_operatorContext ctx);

	/**
	 * Enter a parse tree produced by {@link FunctionParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterConstant(@NotNull FunctionParser.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitConstant(@NotNull FunctionParser.ConstantContext ctx);

	/**
	 * Enter a parse tree produced by {@link FunctionParser#function_decl_specifiers}.
	 * @param ctx the parse tree
	 */
	void enterFunction_decl_specifiers(@NotNull FunctionParser.Function_decl_specifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionParser#function_decl_specifiers}.
	 * @param ctx the parse tree
	 */
	void exitFunction_decl_specifiers(@NotNull FunctionParser.Function_decl_specifiersContext ctx);

	/**
	 * Enter a parse tree produced by {@link FunctionParser#ptr_operator}.
	 * @param ctx the parse tree
	 */
	void enterPtr_operator(@NotNull FunctionParser.Ptr_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionParser#ptr_operator}.
	 * @param ctx the parse tree
	 */
	void exitPtr_operator(@NotNull FunctionParser.Ptr_operatorContext ctx);

	/**
	 * Enter a parse tree produced by {@link FunctionParser#access_specifier}.
	 * @param ctx the parse tree
	 */
	void enterAccess_specifier(@NotNull FunctionParser.Access_specifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionParser#access_specifier}.
	 * @param ctx the parse tree
	 */
	void exitAccess_specifier(@NotNull FunctionParser.Access_specifierContext ctx);

	/**
	 * Enter a parse tree produced by {@link FunctionParser#operator}.
	 * @param ctx the parse tree
	 */
	void enterOperator(@NotNull FunctionParser.OperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionParser#operator}.
	 * @param ctx the parse tree
	 */
	void exitOperator(@NotNull FunctionParser.OperatorContext ctx);

	/**
	 * Enter a parse tree produced by {@link FunctionParser#assignment_operator}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_operator(@NotNull FunctionParser.Assignment_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionParser#assignment_operator}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_operator(@NotNull FunctionParser.Assignment_operatorContext ctx);

	/**
	 * Enter a parse tree produced by {@link FunctionParser#equality_operator}.
	 * @param ctx the parse tree
	 */
	void enterEquality_operator(@NotNull FunctionParser.Equality_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionParser#equality_operator}.
	 * @param ctx the parse tree
	 */
	void exitEquality_operator(@NotNull FunctionParser.Equality_operatorContext ctx);

	/**
	 * Enter a parse tree produced by {@link FunctionParser#no_brackets}.
	 * @param ctx the parse tree
	 */
	void enterNo_brackets(@NotNull FunctionParser.No_bracketsContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionParser#no_brackets}.
	 * @param ctx the parse tree
	 */
	void exitNo_brackets(@NotNull FunctionParser.No_bracketsContext ctx);

	/**
	 * Enter a parse tree produced by {@link FunctionParser#no_brackets_curlies_or_squares}.
	 * @param ctx the parse tree
	 */
	void enterNo_brackets_curlies_or_squares(@NotNull FunctionParser.No_brackets_curlies_or_squaresContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionParser#no_brackets_curlies_or_squares}.
	 * @param ctx the parse tree
	 */
	void exitNo_brackets_curlies_or_squares(@NotNull FunctionParser.No_brackets_curlies_or_squaresContext ctx);

	/**
	 * Enter a parse tree produced by {@link FunctionParser#no_brackets_or_semicolon}.
	 * @param ctx the parse tree
	 */
	void enterNo_brackets_or_semicolon(@NotNull FunctionParser.No_brackets_or_semicolonContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionParser#no_brackets_or_semicolon}.
	 * @param ctx the parse tree
	 */
	void exitNo_brackets_or_semicolon(@NotNull FunctionParser.No_brackets_or_semicolonContext ctx);

	/**
	 * Enter a parse tree produced by {@link FunctionParser#no_angle_brackets_or_brackets}.
	 * @param ctx the parse tree
	 */
	void enterNo_angle_brackets_or_brackets(@NotNull FunctionParser.No_angle_brackets_or_bracketsContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionParser#no_angle_brackets_or_brackets}.
	 * @param ctx the parse tree
	 */
	void exitNo_angle_brackets_or_brackets(@NotNull FunctionParser.No_angle_brackets_or_bracketsContext ctx);

	/**
	 * Enter a parse tree produced by {@link FunctionParser#no_curlies}.
	 * @param ctx the parse tree
	 */
	void enterNo_curlies(@NotNull FunctionParser.No_curliesContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionParser#no_curlies}.
	 * @param ctx the parse tree
	 */
	void exitNo_curlies(@NotNull FunctionParser.No_curliesContext ctx);

	/**
	 * Enter a parse tree produced by {@link FunctionParser#no_squares}.
	 * @param ctx the parse tree
	 */
	void enterNo_squares(@NotNull FunctionParser.No_squaresContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionParser#no_squares}.
	 * @param ctx the parse tree
	 */
	void exitNo_squares(@NotNull FunctionParser.No_squaresContext ctx);

	/**
	 * Enter a parse tree produced by {@link FunctionParser#no_squares_or_semicolon}.
	 * @param ctx the parse tree
	 */
	void enterNo_squares_or_semicolon(@NotNull FunctionParser.No_squares_or_semicolonContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionParser#no_squares_or_semicolon}.
	 * @param ctx the parse tree
	 */
	void exitNo_squares_or_semicolon(@NotNull FunctionParser.No_squares_or_semicolonContext ctx);

	/**
	 * Enter a parse tree produced by {@link FunctionParser#no_comma_or_semicolon}.
	 * @param ctx the parse tree
	 */
	void enterNo_comma_or_semicolon(@NotNull FunctionParser.No_comma_or_semicolonContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionParser#no_comma_or_semicolon}.
	 * @param ctx the parse tree
	 */
	void exitNo_comma_or_semicolon(@NotNull FunctionParser.No_comma_or_semicolonContext ctx);

	/**
	 * Enter a parse tree produced by {@link FunctionParser#assign_water}.
	 * @param ctx the parse tree
	 */
	void enterAssign_water(@NotNull FunctionParser.Assign_waterContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionParser#assign_water}.
	 * @param ctx the parse tree
	 */
	void exitAssign_water(@NotNull FunctionParser.Assign_waterContext ctx);

	/**
	 * Enter a parse tree produced by {@link FunctionParser#assign_water_l2}.
	 * @param ctx the parse tree
	 */
	void enterAssign_water_l2(@NotNull FunctionParser.Assign_water_l2Context ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionParser#assign_water_l2}.
	 * @param ctx the parse tree
	 */
	void exitAssign_water_l2(@NotNull FunctionParser.Assign_water_l2Context ctx);

	/**
	 * Enter a parse tree produced by {@link FunctionParser#water}.
	 * @param ctx the parse tree
	 */
	void enterWater(@NotNull FunctionParser.WaterContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionParser#water}.
	 * @param ctx the parse tree
	 */
	void exitWater(@NotNull FunctionParser.WaterContext ctx);

	/**
	 * Enter a parse tree produced by {@link FunctionParser#custom}.
	 * @param ctx the parse tree
	 */
	void enterCustom(@NotNull FunctionParser.CustomContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionParser#custom}.
	 * @param ctx the parse tree
	 */
	void exitCustom(@NotNull FunctionParser.CustomContext ctx);

	/**
	 * Enter a parse tree produced by {@link FunctionParser#asciiTab}.
	 * @param ctx the parse tree
	 */
	void enterAsciiTab(@NotNull FunctionParser.AsciiTabContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionParser#asciiTab}.
	 * @param ctx the parse tree
	 */
	void exitAsciiTab(@NotNull FunctionParser.AsciiTabContext ctx);

	/**
	 * Enter a parse tree produced by {@link FunctionParser#externC}.
	 * @param ctx the parse tree
	 */
	void enterExternC(@NotNull FunctionParser.ExternCContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionParser#externC}.
	 * @param ctx the parse tree
	 */
	void exitExternC(@NotNull FunctionParser.ExternCContext ctx);

	/**
	 * Enter a parse tree produced by {@link FunctionParser#macroFunctionPointer}.
	 * @param ctx the parse tree
	 */
	void enterMacroFunctionPointer(@NotNull FunctionParser.MacroFunctionPointerContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionParser#macroFunctionPointer}.
	 * @param ctx the parse tree
	 */
	void exitMacroFunctionPointer(@NotNull FunctionParser.MacroFunctionPointerContext ctx);

	/**
	 * Enter a parse tree produced by {@link FunctionParser#testStart}.
	 * @param ctx the parse tree
	 */
	void enterTestStart(@NotNull FunctionParser.TestStartContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionParser#testStart}.
	 * @param ctx the parse tree
	 */
	void exitTestStart(@NotNull FunctionParser.TestStartContext ctx);

	/**
	 * Enter a parse tree produced by {@link FunctionParser#testEnd}.
	 * @param ctx the parse tree
	 */
	void enterTestEnd(@NotNull FunctionParser.TestEndContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionParser#testEnd}.
	 * @param ctx the parse tree
	 */
	void exitTestEnd(@NotNull FunctionParser.TestEndContext ctx);

	/**
	 * Enter a parse tree produced by {@link FunctionParser#phpErrorMessage}.
	 * @param ctx the parse tree
	 */
	void enterPhpErrorMessage(@NotNull FunctionParser.PhpErrorMessageContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionParser#phpErrorMessage}.
	 * @param ctx the parse tree
	 */
	void exitPhpErrorMessage(@NotNull FunctionParser.PhpErrorMessageContext ctx);

	/**
	 * Enter a parse tree produced by {@link FunctionParser#function_def}.
	 * @param ctx the parse tree
	 */
	void enterFunction_def(@NotNull FunctionParser.Function_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionParser#function_def}.
	 * @param ctx the parse tree
	 */
	void exitFunction_def(@NotNull FunctionParser.Function_defContext ctx);

	/**
	 * Enter a parse tree produced by {@link FunctionParser#macroCall_asFunctionHeader}.
	 * @param ctx the parse tree
	 */
	void enterMacroCall_asFunctionHeader(@NotNull FunctionParser.MacroCall_asFunctionHeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionParser#macroCall_asFunctionHeader}.
	 * @param ctx the parse tree
	 */
	void exitMacroCall_asFunctionHeader(@NotNull FunctionParser.MacroCall_asFunctionHeaderContext ctx);

	/**
	 * Enter a parse tree produced by {@link FunctionParser#return_type}.
	 * @param ctx the parse tree
	 */
	void enterReturn_type(@NotNull FunctionParser.Return_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionParser#return_type}.
	 * @param ctx the parse tree
	 */
	void exitReturn_type(@NotNull FunctionParser.Return_typeContext ctx);

	/**
	 * Enter a parse tree produced by {@link FunctionParser#function_param_list}.
	 * @param ctx the parse tree
	 */
	void enterFunction_param_list(@NotNull FunctionParser.Function_param_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionParser#function_param_list}.
	 * @param ctx the parse tree
	 */
	void exitFunction_param_list(@NotNull FunctionParser.Function_param_listContext ctx);

	/**
	 * Enter a parse tree produced by {@link FunctionParser#parameter_decl_clause}.
	 * @param ctx the parse tree
	 */
	void enterParameter_decl_clause(@NotNull FunctionParser.Parameter_decl_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionParser#parameter_decl_clause}.
	 * @param ctx the parse tree
	 */
	void exitParameter_decl_clause(@NotNull FunctionParser.Parameter_decl_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link FunctionParser#parameter_decl}.
	 * @param ctx the parse tree
	 */
	void enterParameter_decl(@NotNull FunctionParser.Parameter_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionParser#parameter_decl}.
	 * @param ctx the parse tree
	 */
	void exitParameter_decl(@NotNull FunctionParser.Parameter_declContext ctx);

	/**
	 * Enter a parse tree produced by {@link FunctionParser#parameter_id}.
	 * @param ctx the parse tree
	 */
	void enterParameter_id(@NotNull FunctionParser.Parameter_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionParser#parameter_id}.
	 * @param ctx the parse tree
	 */
	void exitParameter_id(@NotNull FunctionParser.Parameter_idContext ctx);

	/**
	 * Enter a parse tree produced by {@link FunctionParser#compound_statement}.
	 * @param ctx the parse tree
	 */
	void enterCompound_statement(@NotNull FunctionParser.Compound_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionParser#compound_statement}.
	 * @param ctx the parse tree
	 */
	void exitCompound_statement(@NotNull FunctionParser.Compound_statementContext ctx);

	/**
	 * Enter a parse tree produced by {@link FunctionParser#ctor_list}.
	 * @param ctx the parse tree
	 */
	void enterCtor_list(@NotNull FunctionParser.Ctor_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionParser#ctor_list}.
	 * @param ctx the parse tree
	 */
	void exitCtor_list(@NotNull FunctionParser.Ctor_listContext ctx);

	/**
	 * Enter a parse tree produced by {@link FunctionParser#ctor_initializer}.
	 * @param ctx the parse tree
	 */
	void enterCtor_initializer(@NotNull FunctionParser.Ctor_initializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionParser#ctor_initializer}.
	 * @param ctx the parse tree
	 */
	void exitCtor_initializer(@NotNull FunctionParser.Ctor_initializerContext ctx);

	/**
	 * Enter a parse tree produced by {@link FunctionParser#initializer_id}.
	 * @param ctx the parse tree
	 */
	void enterInitializer_id(@NotNull FunctionParser.Initializer_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionParser#initializer_id}.
	 * @param ctx the parse tree
	 */
	void exitInitializer_id(@NotNull FunctionParser.Initializer_idContext ctx);

	/**
	 * Enter a parse tree produced by {@link FunctionParser#ctor_expr}.
	 * @param ctx the parse tree
	 */
	void enterCtor_expr(@NotNull FunctionParser.Ctor_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionParser#ctor_expr}.
	 * @param ctx the parse tree
	 */
	void exitCtor_expr(@NotNull FunctionParser.Ctor_exprContext ctx);

	/**
	 * Enter a parse tree produced by {@link FunctionParser#function_name}.
	 * @param ctx the parse tree
	 */
	void enterFunction_name(@NotNull FunctionParser.Function_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionParser#function_name}.
	 * @param ctx the parse tree
	 */
	void exitFunction_name(@NotNull FunctionParser.Function_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link FunctionParser#exception_specification}.
	 * @param ctx the parse tree
	 */
	void enterException_specification(@NotNull FunctionParser.Exception_specificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionParser#exception_specification}.
	 * @param ctx the parse tree
	 */
	void exitException_specification(@NotNull FunctionParser.Exception_specificationContext ctx);

	/**
	 * Enter a parse tree produced by {@link FunctionParser#type_id_list}.
	 * @param ctx the parse tree
	 */
	void enterType_id_list(@NotNull FunctionParser.Type_id_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionParser#type_id_list}.
	 * @param ctx the parse tree
	 */
	void exitType_id_list(@NotNull FunctionParser.Type_id_listContext ctx);

	/**
	 * Enter a parse tree produced by {@link FunctionParser#simple_decl}.
	 * @param ctx the parse tree
	 */
	void enterSimple_decl(@NotNull FunctionParser.Simple_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionParser#simple_decl}.
	 * @param ctx the parse tree
	 */
	void exitSimple_decl(@NotNull FunctionParser.Simple_declContext ctx);

	/**
	 * Enter a parse tree produced by {@link FunctionParser#var_decl}.
	 * @param ctx the parse tree
	 */
	void enterVar_decl(@NotNull FunctionParser.Var_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionParser#var_decl}.
	 * @param ctx the parse tree
	 */
	void exitVar_decl(@NotNull FunctionParser.Var_declContext ctx);

	/**
	 * Enter a parse tree produced by {@link FunctionParser#callingConvention}.
	 * @param ctx the parse tree
	 */
	void enterCallingConvention(@NotNull FunctionParser.CallingConventionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionParser#callingConvention}.
	 * @param ctx the parse tree
	 */
	void exitCallingConvention(@NotNull FunctionParser.CallingConventionContext ctx);

	/**
	 * Enter a parse tree produced by {@link FunctionParser#special_datatype}.
	 * @param ctx the parse tree
	 */
	void enterSpecial_datatype(@NotNull FunctionParser.Special_datatypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionParser#special_datatype}.
	 * @param ctx the parse tree
	 */
	void exitSpecial_datatype(@NotNull FunctionParser.Special_datatypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link FunctionParser#init_declarator_list}.
	 * @param ctx the parse tree
	 */
	void enterInit_declarator_list(@NotNull FunctionParser.Init_declarator_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionParser#init_declarator_list}.
	 * @param ctx the parse tree
	 */
	void exitInit_declarator_list(@NotNull FunctionParser.Init_declarator_listContext ctx);

	/**
	 * Enter a parse tree produced by {@link FunctionParser#type_name}.
	 * @param ctx the parse tree
	 */
	void enterType_name(@NotNull FunctionParser.Type_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionParser#type_name}.
	 * @param ctx the parse tree
	 */
	void exitType_name(@NotNull FunctionParser.Type_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link FunctionParser#base_type}.
	 * @param ctx the parse tree
	 */
	void enterBase_type(@NotNull FunctionParser.Base_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionParser#base_type}.
	 * @param ctx the parse tree
	 */
	void exitBase_type(@NotNull FunctionParser.Base_typeContext ctx);

	/**
	 * Enter a parse tree produced by {@link FunctionParser#parameter_name}.
	 * @param ctx the parse tree
	 */
	void enterParameter_name(@NotNull FunctionParser.Parameter_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionParser#parameter_name}.
	 * @param ctx the parse tree
	 */
	void exitParameter_name(@NotNull FunctionParser.Parameter_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link FunctionParser#param_type_list}.
	 * @param ctx the parse tree
	 */
	void enterParam_type_list(@NotNull FunctionParser.Param_type_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionParser#param_type_list}.
	 * @param ctx the parse tree
	 */
	void exitParam_type_list(@NotNull FunctionParser.Param_type_listContext ctx);

	/**
	 * Enter a parse tree produced by {@link FunctionParser#param_type}.
	 * @param ctx the parse tree
	 */
	void enterParam_type(@NotNull FunctionParser.Param_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionParser#param_type}.
	 * @param ctx the parse tree
	 */
	void exitParam_type(@NotNull FunctionParser.Param_typeContext ctx);

	/**
	 * Enter a parse tree produced by {@link FunctionParser#param_type_id}.
	 * @param ctx the parse tree
	 */
	void enterParam_type_id(@NotNull FunctionParser.Param_type_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionParser#param_type_id}.
	 * @param ctx the parse tree
	 */
	void exitParam_type_id(@NotNull FunctionParser.Param_type_idContext ctx);

	/**
	 * Enter a parse tree produced by {@link FunctionParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(@NotNull FunctionParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(@NotNull FunctionParser.IdentifierContext ctx);

	/**
	 * Enter a parse tree produced by {@link FunctionParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(@NotNull FunctionParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(@NotNull FunctionParser.NumberContext ctx);

	/**
	 * Enter a parse tree produced by {@link FunctionParser#ptrs}.
	 * @param ctx the parse tree
	 */
	void enterPtrs(@NotNull FunctionParser.PtrsContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionParser#ptrs}.
	 * @param ctx the parse tree
	 */
	void exitPtrs(@NotNull FunctionParser.PtrsContext ctx);

	/**
	 * Enter a parse tree produced by {@link FunctionParser#func_ptrs}.
	 * @param ctx the parse tree
	 */
	void enterFunc_ptrs(@NotNull FunctionParser.Func_ptrsContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionParser#func_ptrs}.
	 * @param ctx the parse tree
	 */
	void exitFunc_ptrs(@NotNull FunctionParser.Func_ptrsContext ctx);

	/**
	 * Enter a parse tree produced by {@link FunctionParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(@NotNull FunctionParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(@NotNull FunctionParser.ExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link FunctionParser#assign_expr}.
	 * @param ctx the parse tree
	 */
	void enterAssign_expr(@NotNull FunctionParser.Assign_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionParser#assign_expr}.
	 * @param ctx the parse tree
	 */
	void exitAssign_expr(@NotNull FunctionParser.Assign_exprContext ctx);

	/**
	 * Enter a parse tree produced by {@link FunctionParser#conditional_expression}.
	 * @param ctx the parse tree
	 */
	void enterConditional_expression(@NotNull FunctionParser.Conditional_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionParser#conditional_expression}.
	 * @param ctx the parse tree
	 */
	void exitConditional_expression(@NotNull FunctionParser.Conditional_expressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link FunctionParser#or_expression}.
	 * @param ctx the parse tree
	 */
	void enterOr_expression(@NotNull FunctionParser.Or_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionParser#or_expression}.
	 * @param ctx the parse tree
	 */
	void exitOr_expression(@NotNull FunctionParser.Or_expressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link FunctionParser#and_expression}.
	 * @param ctx the parse tree
	 */
	void enterAnd_expression(@NotNull FunctionParser.And_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionParser#and_expression}.
	 * @param ctx the parse tree
	 */
	void exitAnd_expression(@NotNull FunctionParser.And_expressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link FunctionParser#inclusive_or_expression}.
	 * @param ctx the parse tree
	 */
	void enterInclusive_or_expression(@NotNull FunctionParser.Inclusive_or_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionParser#inclusive_or_expression}.
	 * @param ctx the parse tree
	 */
	void exitInclusive_or_expression(@NotNull FunctionParser.Inclusive_or_expressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link FunctionParser#exclusive_or_expression}.
	 * @param ctx the parse tree
	 */
	void enterExclusive_or_expression(@NotNull FunctionParser.Exclusive_or_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionParser#exclusive_or_expression}.
	 * @param ctx the parse tree
	 */
	void exitExclusive_or_expression(@NotNull FunctionParser.Exclusive_or_expressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link FunctionParser#bit_and_expression}.
	 * @param ctx the parse tree
	 */
	void enterBit_and_expression(@NotNull FunctionParser.Bit_and_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionParser#bit_and_expression}.
	 * @param ctx the parse tree
	 */
	void exitBit_and_expression(@NotNull FunctionParser.Bit_and_expressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link FunctionParser#equality_expression}.
	 * @param ctx the parse tree
	 */
	void enterEquality_expression(@NotNull FunctionParser.Equality_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionParser#equality_expression}.
	 * @param ctx the parse tree
	 */
	void exitEquality_expression(@NotNull FunctionParser.Equality_expressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link FunctionParser#relational_expression}.
	 * @param ctx the parse tree
	 */
	void enterRelational_expression(@NotNull FunctionParser.Relational_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionParser#relational_expression}.
	 * @param ctx the parse tree
	 */
	void exitRelational_expression(@NotNull FunctionParser.Relational_expressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link FunctionParser#shift_expression}.
	 * @param ctx the parse tree
	 */
	void enterShift_expression(@NotNull FunctionParser.Shift_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionParser#shift_expression}.
	 * @param ctx the parse tree
	 */
	void exitShift_expression(@NotNull FunctionParser.Shift_expressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link FunctionParser#additive_expression}.
	 * @param ctx the parse tree
	 */
	void enterAdditive_expression(@NotNull FunctionParser.Additive_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionParser#additive_expression}.
	 * @param ctx the parse tree
	 */
	void exitAdditive_expression(@NotNull FunctionParser.Additive_expressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link FunctionParser#multiplicative_expression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicative_expression(@NotNull FunctionParser.Multiplicative_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionParser#multiplicative_expression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicative_expression(@NotNull FunctionParser.Multiplicative_expressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link FunctionParser#function_pointer_use_expression}.
	 * @param ctx the parse tree
	 */
	void enterFunction_pointer_use_expression(@NotNull FunctionParser.Function_pointer_use_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionParser#function_pointer_use_expression}.
	 * @param ctx the parse tree
	 */
	void exitFunction_pointer_use_expression(@NotNull FunctionParser.Function_pointer_use_expressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link FunctionParser#cast_expression}.
	 * @param ctx the parse tree
	 */
	void enterCast_expression(@NotNull FunctionParser.Cast_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionParser#cast_expression}.
	 * @param ctx the parse tree
	 */
	void exitCast_expression(@NotNull FunctionParser.Cast_expressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link FunctionParser#cast_target}.
	 * @param ctx the parse tree
	 */
	void enterCast_target(@NotNull FunctionParser.Cast_targetContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionParser#cast_target}.
	 * @param ctx the parse tree
	 */
	void exitCast_target(@NotNull FunctionParser.Cast_targetContext ctx);

	/**
	 * Enter a parse tree produced by {@link FunctionParser#unary_expression}.
	 * @param ctx the parse tree
	 */
	void enterUnary_expression(@NotNull FunctionParser.Unary_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionParser#unary_expression}.
	 * @param ctx the parse tree
	 */
	void exitUnary_expression(@NotNull FunctionParser.Unary_expressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link FunctionParser#address_of_expression}.
	 * @param ctx the parse tree
	 */
	void enterAddress_of_expression(@NotNull FunctionParser.Address_of_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionParser#address_of_expression}.
	 * @param ctx the parse tree
	 */
	void exitAddress_of_expression(@NotNull FunctionParser.Address_of_expressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link FunctionParser#unary_op_and_cast_expr}.
	 * @param ctx the parse tree
	 */
	void enterUnary_op_and_cast_expr(@NotNull FunctionParser.Unary_op_and_cast_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionParser#unary_op_and_cast_expr}.
	 * @param ctx the parse tree
	 */
	void exitUnary_op_and_cast_expr(@NotNull FunctionParser.Unary_op_and_cast_exprContext ctx);

	/**
	 * Enter a parse tree produced by {@link FunctionParser#sizeof_expression}.
	 * @param ctx the parse tree
	 */
	void enterSizeof_expression(@NotNull FunctionParser.Sizeof_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionParser#sizeof_expression}.
	 * @param ctx the parse tree
	 */
	void exitSizeof_expression(@NotNull FunctionParser.Sizeof_expressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link FunctionParser#sizeof}.
	 * @param ctx the parse tree
	 */
	void enterSizeof(@NotNull FunctionParser.SizeofContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionParser#sizeof}.
	 * @param ctx the parse tree
	 */
	void exitSizeof(@NotNull FunctionParser.SizeofContext ctx);

	/**
	 * Enter a parse tree produced by {@link FunctionParser#defined_expression}.
	 * @param ctx the parse tree
	 */
	void enterDefined_expression(@NotNull FunctionParser.Defined_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionParser#defined_expression}.
	 * @param ctx the parse tree
	 */
	void exitDefined_expression(@NotNull FunctionParser.Defined_expressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link FunctionParser#sizeof_operand}.
	 * @param ctx the parse tree
	 */
	void enterSizeof_operand(@NotNull FunctionParser.Sizeof_operandContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionParser#sizeof_operand}.
	 * @param ctx the parse tree
	 */
	void exitSizeof_operand(@NotNull FunctionParser.Sizeof_operandContext ctx);

	/**
	 * Enter a parse tree produced by {@link FunctionParser#sizeof_operand2}.
	 * @param ctx the parse tree
	 */
	void enterSizeof_operand2(@NotNull FunctionParser.Sizeof_operand2Context ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionParser#sizeof_operand2}.
	 * @param ctx the parse tree
	 */
	void exitSizeof_operand2(@NotNull FunctionParser.Sizeof_operand2Context ctx);

	/**
	 * Enter a parse tree produced by {@link FunctionParser#inc_dec}.
	 * @param ctx the parse tree
	 */
	void enterInc_dec(@NotNull FunctionParser.Inc_decContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionParser#inc_dec}.
	 * @param ctx the parse tree
	 */
	void exitInc_dec(@NotNull FunctionParser.Inc_decContext ctx);

	/**
	 * Enter a parse tree produced by {@link FunctionParser#asmCall}.
	 * @param ctx the parse tree
	 */
	void enterAsmCall(@NotNull FunctionParser.AsmCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionParser#asmCall}.
	 * @param ctx the parse tree
	 */
	void exitAsmCall(@NotNull FunctionParser.AsmCallContext ctx);

	/**
	 * Enter a parse tree produced by {@link FunctionParser#postfix_expression}.
	 * @param ctx the parse tree
	 */
	void enterPostfix_expression(@NotNull FunctionParser.Postfix_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionParser#postfix_expression}.
	 * @param ctx the parse tree
	 */
	void exitPostfix_expression(@NotNull FunctionParser.Postfix_expressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link FunctionParser#initializer_expression}.
	 * @param ctx the parse tree
	 */
	void enterInitializer_expression(@NotNull FunctionParser.Initializer_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionParser#initializer_expression}.
	 * @param ctx the parse tree
	 */
	void exitInitializer_expression(@NotNull FunctionParser.Initializer_expressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link FunctionParser#argument_list}.
	 * @param ctx the parse tree
	 */
	void enterArgument_list(@NotNull FunctionParser.Argument_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionParser#argument_list}.
	 * @param ctx the parse tree
	 */
	void exitArgument_list(@NotNull FunctionParser.Argument_listContext ctx);

	/**
	 * Enter a parse tree produced by {@link FunctionParser#argument}.
	 * @param ctx the parse tree
	 */
	void enterArgument(@NotNull FunctionParser.ArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionParser#argument}.
	 * @param ctx the parse tree
	 */
	void exitArgument(@NotNull FunctionParser.ArgumentContext ctx);

	/**
	 * Enter a parse tree produced by {@link FunctionParser#primary_expression}.
	 * @param ctx the parse tree
	 */
	void enterPrimary_expression(@NotNull FunctionParser.Primary_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionParser#primary_expression}.
	 * @param ctx the parse tree
	 */
	void exitPrimary_expression(@NotNull FunctionParser.Primary_expressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link FunctionParser#null_expression}.
	 * @param ctx the parse tree
	 */
	void enterNull_expression(@NotNull FunctionParser.Null_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionParser#null_expression}.
	 * @param ctx the parse tree
	 */
	void exitNull_expression(@NotNull FunctionParser.Null_expressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link FunctionParser#preprocessor_fragment}.
	 * @param ctx the parse tree
	 */
	void enterPreprocessor_fragment(@NotNull FunctionParser.Preprocessor_fragmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionParser#preprocessor_fragment}.
	 * @param ctx the parse tree
	 */
	void exitPreprocessor_fragment(@NotNull FunctionParser.Preprocessor_fragmentContext ctx);

	/**
	 * Enter a parse tree produced by {@link FunctionParser#expression_fragment}.
	 * @param ctx the parse tree
	 */
	void enterExpression_fragment(@NotNull FunctionParser.Expression_fragmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionParser#expression_fragment}.
	 * @param ctx the parse tree
	 */
	void exitExpression_fragment(@NotNull FunctionParser.Expression_fragmentContext ctx);

	/**
	 * Enter a parse tree produced by {@link FunctionParser#init_declarator}.
	 * @param ctx the parse tree
	 */
	void enterInit_declarator(@NotNull FunctionParser.Init_declaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionParser#init_declarator}.
	 * @param ctx the parse tree
	 */
	void exitInit_declarator(@NotNull FunctionParser.Init_declaratorContext ctx);

	/**
	 * Enter a parse tree produced by {@link FunctionParser#declarator}.
	 * @param ctx the parse tree
	 */
	void enterDeclarator(@NotNull FunctionParser.DeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionParser#declarator}.
	 * @param ctx the parse tree
	 */
	void exitDeclarator(@NotNull FunctionParser.DeclaratorContext ctx);

	/**
	 * Enter a parse tree produced by {@link FunctionParser#type_suffix}.
	 * @param ctx the parse tree
	 */
	void enterType_suffix(@NotNull FunctionParser.Type_suffixContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionParser#type_suffix}.
	 * @param ctx the parse tree
	 */
	void exitType_suffix(@NotNull FunctionParser.Type_suffixContext ctx);
}