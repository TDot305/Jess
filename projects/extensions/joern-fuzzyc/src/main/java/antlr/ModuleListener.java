// Generated from src/main/java/antlr/Module.g4 by ANTLR 4.5.3

	package antlr;


  import java.util.Stack;
  import java.util.EmptyStackException;

import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ModuleParser}.
 */
public interface ModuleListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code memberAccess}
	 * labeled alternative in {@link ModuleParser#postfix_expression}.
	 * @param ctx the parse tree
	 */
	void enterMemberAccess(@NotNull ModuleParser.MemberAccessContext ctx);
	/**
	 * Exit a parse tree produced by the {@code memberAccess}
	 * labeled alternative in {@link ModuleParser#postfix_expression}.
	 * @param ctx the parse tree
	 */
	void exitMemberAccess(@NotNull ModuleParser.MemberAccessContext ctx);

	/**
	 * Enter a parse tree produced by the {@code incDecOp}
	 * labeled alternative in {@link ModuleParser#postfix_expression}.
	 * @param ctx the parse tree
	 */
	void enterIncDecOp(@NotNull ModuleParser.IncDecOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code incDecOp}
	 * labeled alternative in {@link ModuleParser#postfix_expression}.
	 * @param ctx the parse tree
	 */
	void exitIncDecOp(@NotNull ModuleParser.IncDecOpContext ctx);

	/**
	 * Enter a parse tree produced by the {@code arrayAssign}
	 * labeled alternative in {@link ModuleParser#postfix_expression}.
	 * @param ctx the parse tree
	 */
	void enterArrayAssign(@NotNull ModuleParser.ArrayAssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arrayAssign}
	 * labeled alternative in {@link ModuleParser#postfix_expression}.
	 * @param ctx the parse tree
	 */
	void exitArrayAssign(@NotNull ModuleParser.ArrayAssignContext ctx);

	/**
	 * Enter a parse tree produced by the {@code primaryOnly}
	 * labeled alternative in {@link ModuleParser#postfix_expression}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryOnly(@NotNull ModuleParser.PrimaryOnlyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code primaryOnly}
	 * labeled alternative in {@link ModuleParser#postfix_expression}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryOnly(@NotNull ModuleParser.PrimaryOnlyContext ctx);

	/**
	 * Enter a parse tree produced by the {@code funcCall}
	 * labeled alternative in {@link ModuleParser#postfix_expression}.
	 * @param ctx the parse tree
	 */
	void enterFuncCall(@NotNull ModuleParser.FuncCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code funcCall}
	 * labeled alternative in {@link ModuleParser#postfix_expression}.
	 * @param ctx the parse tree
	 */
	void exitFuncCall(@NotNull ModuleParser.FuncCallContext ctx);

	/**
	 * Enter a parse tree produced by the {@code arrayIndexing}
	 * labeled alternative in {@link ModuleParser#postfix_expression}.
	 * @param ctx the parse tree
	 */
	void enterArrayIndexing(@NotNull ModuleParser.ArrayIndexingContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arrayIndexing}
	 * labeled alternative in {@link ModuleParser#postfix_expression}.
	 * @param ctx the parse tree
	 */
	void exitArrayIndexing(@NotNull ModuleParser.ArrayIndexingContext ctx);

	/**
	 * Enter a parse tree produced by the {@code ptrMemberAccess}
	 * labeled alternative in {@link ModuleParser#postfix_expression}.
	 * @param ctx the parse tree
	 */
	void enterPtrMemberAccess(@NotNull ModuleParser.PtrMemberAccessContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ptrMemberAccess}
	 * labeled alternative in {@link ModuleParser#postfix_expression}.
	 * @param ctx the parse tree
	 */
	void exitPtrMemberAccess(@NotNull ModuleParser.PtrMemberAccessContext ctx);

	/**
	 * Enter a parse tree produced by the {@code declByType}
	 * labeled alternative in {@link ModuleParser#var_decl}.
	 * @param ctx the parse tree
	 */
	void enterDeclByType(@NotNull ModuleParser.DeclByTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code declByType}
	 * labeled alternative in {@link ModuleParser#var_decl}.
	 * @param ctx the parse tree
	 */
	void exitDeclByType(@NotNull ModuleParser.DeclByTypeContext ctx);

	/**
	 * Enter a parse tree produced by the {@code FunctionPointerDeclare}
	 * labeled alternative in {@link ModuleParser#var_decl}.
	 * @param ctx the parse tree
	 */
	void enterFunctionPointerDeclare(@NotNull ModuleParser.FunctionPointerDeclareContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctionPointerDeclare}
	 * labeled alternative in {@link ModuleParser#var_decl}.
	 * @param ctx the parse tree
	 */
	void exitFunctionPointerDeclare(@NotNull ModuleParser.FunctionPointerDeclareContext ctx);

	/**
	 * Enter a parse tree produced by the {@code StructUnionEnum}
	 * labeled alternative in {@link ModuleParser#var_decl}.
	 * @param ctx the parse tree
	 */
	void enterStructUnionEnum(@NotNull ModuleParser.StructUnionEnumContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StructUnionEnum}
	 * labeled alternative in {@link ModuleParser#var_decl}.
	 * @param ctx the parse tree
	 */
	void exitStructUnionEnum(@NotNull ModuleParser.StructUnionEnumContext ctx);

	/**
	 * Enter a parse tree produced by the {@code normOr}
	 * labeled alternative in {@link ModuleParser#conditional_expression}.
	 * @param ctx the parse tree
	 */
	void enterNormOr(@NotNull ModuleParser.NormOrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code normOr}
	 * labeled alternative in {@link ModuleParser#conditional_expression}.
	 * @param ctx the parse tree
	 */
	void exitNormOr(@NotNull ModuleParser.NormOrContext ctx);

	/**
	 * Enter a parse tree produced by the {@code cndExpr}
	 * labeled alternative in {@link ModuleParser#conditional_expression}.
	 * @param ctx the parse tree
	 */
	void enterCndExpr(@NotNull ModuleParser.CndExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cndExpr}
	 * labeled alternative in {@link ModuleParser#conditional_expression}.
	 * @param ctx the parse tree
	 */
	void exitCndExpr(@NotNull ModuleParser.CndExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link ModuleParser#code}.
	 * @param ctx the parse tree
	 */
	void enterCode(@NotNull ModuleParser.CodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModuleParser#code}.
	 * @param ctx the parse tree
	 */
	void exitCode(@NotNull ModuleParser.CodeContext ctx);

	/**
	 * Enter a parse tree produced by {@link ModuleParser#pre_statement}.
	 * @param ctx the parse tree
	 */
	void enterPre_statement(@NotNull ModuleParser.Pre_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModuleParser#pre_statement}.
	 * @param ctx the parse tree
	 */
	void exitPre_statement(@NotNull ModuleParser.Pre_statementContext ctx);

	/**
	 * Enter a parse tree produced by {@link ModuleParser#pre_blockstarter}.
	 * @param ctx the parse tree
	 */
	void enterPre_blockstarter(@NotNull ModuleParser.Pre_blockstarterContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModuleParser#pre_blockstarter}.
	 * @param ctx the parse tree
	 */
	void exitPre_blockstarter(@NotNull ModuleParser.Pre_blockstarterContext ctx);

	/**
	 * Enter a parse tree produced by {@link ModuleParser#pre_if_statement}.
	 * @param ctx the parse tree
	 */
	void enterPre_if_statement(@NotNull ModuleParser.Pre_if_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModuleParser#pre_if_statement}.
	 * @param ctx the parse tree
	 */
	void exitPre_if_statement(@NotNull ModuleParser.Pre_if_statementContext ctx);

	/**
	 * Enter a parse tree produced by {@link ModuleParser#pre_elif_statement}.
	 * @param ctx the parse tree
	 */
	void enterPre_elif_statement(@NotNull ModuleParser.Pre_elif_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModuleParser#pre_elif_statement}.
	 * @param ctx the parse tree
	 */
	void exitPre_elif_statement(@NotNull ModuleParser.Pre_elif_statementContext ctx);

	/**
	 * Enter a parse tree produced by {@link ModuleParser#pre_else_statement}.
	 * @param ctx the parse tree
	 */
	void enterPre_else_statement(@NotNull ModuleParser.Pre_else_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModuleParser#pre_else_statement}.
	 * @param ctx the parse tree
	 */
	void exitPre_else_statement(@NotNull ModuleParser.Pre_else_statementContext ctx);

	/**
	 * Enter a parse tree produced by {@link ModuleParser#pre_endif_statement}.
	 * @param ctx the parse tree
	 */
	void enterPre_endif_statement(@NotNull ModuleParser.Pre_endif_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModuleParser#pre_endif_statement}.
	 * @param ctx the parse tree
	 */
	void exitPre_endif_statement(@NotNull ModuleParser.Pre_endif_statementContext ctx);

	/**
	 * Enter a parse tree produced by {@link ModuleParser#pre_if_condition}.
	 * @param ctx the parse tree
	 */
	void enterPre_if_condition(@NotNull ModuleParser.Pre_if_conditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModuleParser#pre_if_condition}.
	 * @param ctx the parse tree
	 */
	void exitPre_if_condition(@NotNull ModuleParser.Pre_if_conditionContext ctx);

	/**
	 * Enter a parse tree produced by {@link ModuleParser#call_in_preStatement}.
	 * @param ctx the parse tree
	 */
	void enterCall_in_preStatement(@NotNull ModuleParser.Call_in_preStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModuleParser#call_in_preStatement}.
	 * @param ctx the parse tree
	 */
	void exitCall_in_preStatement(@NotNull ModuleParser.Call_in_preStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link ModuleParser#pre_command}.
	 * @param ctx the parse tree
	 */
	void enterPre_command(@NotNull ModuleParser.Pre_commandContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModuleParser#pre_command}.
	 * @param ctx the parse tree
	 */
	void exitPre_command(@NotNull ModuleParser.Pre_commandContext ctx);

	/**
	 * Enter a parse tree produced by {@link ModuleParser#pre_define}.
	 * @param ctx the parse tree
	 */
	void enterPre_define(@NotNull ModuleParser.Pre_defineContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModuleParser#pre_define}.
	 * @param ctx the parse tree
	 */
	void exitPre_define(@NotNull ModuleParser.Pre_defineContext ctx);

	/**
	 * Enter a parse tree produced by {@link ModuleParser#pre_undef}.
	 * @param ctx the parse tree
	 */
	void enterPre_undef(@NotNull ModuleParser.Pre_undefContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModuleParser#pre_undef}.
	 * @param ctx the parse tree
	 */
	void exitPre_undef(@NotNull ModuleParser.Pre_undefContext ctx);

	/**
	 * Enter a parse tree produced by {@link ModuleParser#pre_macro_identifier}.
	 * @param ctx the parse tree
	 */
	void enterPre_macro_identifier(@NotNull ModuleParser.Pre_macro_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModuleParser#pre_macro_identifier}.
	 * @param ctx the parse tree
	 */
	void exitPre_macro_identifier(@NotNull ModuleParser.Pre_macro_identifierContext ctx);

	/**
	 * Enter a parse tree produced by {@link ModuleParser#keyword}.
	 * @param ctx the parse tree
	 */
	void enterKeyword(@NotNull ModuleParser.KeywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModuleParser#keyword}.
	 * @param ctx the parse tree
	 */
	void exitKeyword(@NotNull ModuleParser.KeywordContext ctx);

	/**
	 * Enter a parse tree produced by {@link ModuleParser#pre_macro_parameters}.
	 * @param ctx the parse tree
	 */
	void enterPre_macro_parameters(@NotNull ModuleParser.Pre_macro_parametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModuleParser#pre_macro_parameters}.
	 * @param ctx the parse tree
	 */
	void exitPre_macro_parameters(@NotNull ModuleParser.Pre_macro_parametersContext ctx);

	/**
	 * Enter a parse tree produced by {@link ModuleParser#pre_macro}.
	 * @param ctx the parse tree
	 */
	void enterPre_macro(@NotNull ModuleParser.Pre_macroContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModuleParser#pre_macro}.
	 * @param ctx the parse tree
	 */
	void exitPre_macro(@NotNull ModuleParser.Pre_macroContext ctx);

	/**
	 * Enter a parse tree produced by {@link ModuleParser#macroCall}.
	 * @param ctx the parse tree
	 */
	void enterMacroCall(@NotNull ModuleParser.MacroCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModuleParser#macroCall}.
	 * @param ctx the parse tree
	 */
	void exitMacroCall(@NotNull ModuleParser.MacroCallContext ctx);

	/**
	 * Enter a parse tree produced by {@link ModuleParser#pre_diagnostic}.
	 * @param ctx the parse tree
	 */
	void enterPre_diagnostic(@NotNull ModuleParser.Pre_diagnosticContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModuleParser#pre_diagnostic}.
	 * @param ctx the parse tree
	 */
	void exitPre_diagnostic(@NotNull ModuleParser.Pre_diagnosticContext ctx);

	/**
	 * Enter a parse tree produced by {@link ModuleParser#pre_other}.
	 * @param ctx the parse tree
	 */
	void enterPre_other(@NotNull ModuleParser.Pre_otherContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModuleParser#pre_other}.
	 * @param ctx the parse tree
	 */
	void exitPre_other(@NotNull ModuleParser.Pre_otherContext ctx);

	/**
	 * Enter a parse tree produced by {@link ModuleParser#attributeList}.
	 * @param ctx the parse tree
	 */
	void enterAttributeList(@NotNull ModuleParser.AttributeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModuleParser#attributeList}.
	 * @param ctx the parse tree
	 */
	void exitAttributeList(@NotNull ModuleParser.AttributeListContext ctx);

	/**
	 * Enter a parse tree produced by {@link ModuleParser#attribute}.
	 * @param ctx the parse tree
	 */
	void enterAttribute(@NotNull ModuleParser.AttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModuleParser#attribute}.
	 * @param ctx the parse tree
	 */
	void exitAttribute(@NotNull ModuleParser.AttributeContext ctx);

	/**
	 * Enter a parse tree produced by {@link ModuleParser#pre_include}.
	 * @param ctx the parse tree
	 */
	void enterPre_include(@NotNull ModuleParser.Pre_includeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModuleParser#pre_include}.
	 * @param ctx the parse tree
	 */
	void exitPre_include(@NotNull ModuleParser.Pre_includeContext ctx);

	/**
	 * Enter a parse tree produced by {@link ModuleParser#pre_include_next}.
	 * @param ctx the parse tree
	 */
	void enterPre_include_next(@NotNull ModuleParser.Pre_include_nextContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModuleParser#pre_include_next}.
	 * @param ctx the parse tree
	 */
	void exitPre_include_next(@NotNull ModuleParser.Pre_include_nextContext ctx);

	/**
	 * Enter a parse tree produced by {@link ModuleParser#pre_include_local_file}.
	 * @param ctx the parse tree
	 */
	void enterPre_include_local_file(@NotNull ModuleParser.Pre_include_local_fileContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModuleParser#pre_include_local_file}.
	 * @param ctx the parse tree
	 */
	void exitPre_include_local_file(@NotNull ModuleParser.Pre_include_local_fileContext ctx);

	/**
	 * Enter a parse tree produced by {@link ModuleParser#pre_include_filename}.
	 * @param ctx the parse tree
	 */
	void enterPre_include_filename(@NotNull ModuleParser.Pre_include_filenameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModuleParser#pre_include_filename}.
	 * @param ctx the parse tree
	 */
	void exitPre_include_filename(@NotNull ModuleParser.Pre_include_filenameContext ctx);

	/**
	 * Enter a parse tree produced by {@link ModuleParser#pre_line}.
	 * @param ctx the parse tree
	 */
	void enterPre_line(@NotNull ModuleParser.Pre_lineContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModuleParser#pre_line}.
	 * @param ctx the parse tree
	 */
	void exitPre_line(@NotNull ModuleParser.Pre_lineContext ctx);

	/**
	 * Enter a parse tree produced by {@link ModuleParser#pre_pragma}.
	 * @param ctx the parse tree
	 */
	void enterPre_pragma(@NotNull ModuleParser.Pre_pragmaContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModuleParser#pre_pragma}.
	 * @param ctx the parse tree
	 */
	void exitPre_pragma(@NotNull ModuleParser.Pre_pragmaContext ctx);

	/**
	 * Enter a parse tree produced by {@link ModuleParser#comment}.
	 * @param ctx the parse tree
	 */
	void enterComment(@NotNull ModuleParser.CommentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModuleParser#comment}.
	 * @param ctx the parse tree
	 */
	void exitComment(@NotNull ModuleParser.CommentContext ctx);

	/**
	 * Enter a parse tree produced by {@link ModuleParser#newline}.
	 * @param ctx the parse tree
	 */
	void enterNewline(@NotNull ModuleParser.NewlineContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModuleParser#newline}.
	 * @param ctx the parse tree
	 */
	void exitNewline(@NotNull ModuleParser.NewlineContext ctx);

	/**
	 * Enter a parse tree produced by {@link ModuleParser#unary_operator}.
	 * @param ctx the parse tree
	 */
	void enterUnary_operator(@NotNull ModuleParser.Unary_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModuleParser#unary_operator}.
	 * @param ctx the parse tree
	 */
	void exitUnary_operator(@NotNull ModuleParser.Unary_operatorContext ctx);

	/**
	 * Enter a parse tree produced by {@link ModuleParser#relational_operator}.
	 * @param ctx the parse tree
	 */
	void enterRelational_operator(@NotNull ModuleParser.Relational_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModuleParser#relational_operator}.
	 * @param ctx the parse tree
	 */
	void exitRelational_operator(@NotNull ModuleParser.Relational_operatorContext ctx);

	/**
	 * Enter a parse tree produced by {@link ModuleParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterConstant(@NotNull ModuleParser.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModuleParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitConstant(@NotNull ModuleParser.ConstantContext ctx);

	/**
	 * Enter a parse tree produced by {@link ModuleParser#function_decl_specifiers}.
	 * @param ctx the parse tree
	 */
	void enterFunction_decl_specifiers(@NotNull ModuleParser.Function_decl_specifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModuleParser#function_decl_specifiers}.
	 * @param ctx the parse tree
	 */
	void exitFunction_decl_specifiers(@NotNull ModuleParser.Function_decl_specifiersContext ctx);

	/**
	 * Enter a parse tree produced by {@link ModuleParser#ptr_operator}.
	 * @param ctx the parse tree
	 */
	void enterPtr_operator(@NotNull ModuleParser.Ptr_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModuleParser#ptr_operator}.
	 * @param ctx the parse tree
	 */
	void exitPtr_operator(@NotNull ModuleParser.Ptr_operatorContext ctx);

	/**
	 * Enter a parse tree produced by {@link ModuleParser#access_specifier}.
	 * @param ctx the parse tree
	 */
	void enterAccess_specifier(@NotNull ModuleParser.Access_specifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModuleParser#access_specifier}.
	 * @param ctx the parse tree
	 */
	void exitAccess_specifier(@NotNull ModuleParser.Access_specifierContext ctx);

	/**
	 * Enter a parse tree produced by {@link ModuleParser#operator}.
	 * @param ctx the parse tree
	 */
	void enterOperator(@NotNull ModuleParser.OperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModuleParser#operator}.
	 * @param ctx the parse tree
	 */
	void exitOperator(@NotNull ModuleParser.OperatorContext ctx);

	/**
	 * Enter a parse tree produced by {@link ModuleParser#assignment_operator}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_operator(@NotNull ModuleParser.Assignment_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModuleParser#assignment_operator}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_operator(@NotNull ModuleParser.Assignment_operatorContext ctx);

	/**
	 * Enter a parse tree produced by {@link ModuleParser#equality_operator}.
	 * @param ctx the parse tree
	 */
	void enterEquality_operator(@NotNull ModuleParser.Equality_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModuleParser#equality_operator}.
	 * @param ctx the parse tree
	 */
	void exitEquality_operator(@NotNull ModuleParser.Equality_operatorContext ctx);

	/**
	 * Enter a parse tree produced by {@link ModuleParser#no_brackets}.
	 * @param ctx the parse tree
	 */
	void enterNo_brackets(@NotNull ModuleParser.No_bracketsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModuleParser#no_brackets}.
	 * @param ctx the parse tree
	 */
	void exitNo_brackets(@NotNull ModuleParser.No_bracketsContext ctx);

	/**
	 * Enter a parse tree produced by {@link ModuleParser#no_brackets_curlies_or_squares}.
	 * @param ctx the parse tree
	 */
	void enterNo_brackets_curlies_or_squares(@NotNull ModuleParser.No_brackets_curlies_or_squaresContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModuleParser#no_brackets_curlies_or_squares}.
	 * @param ctx the parse tree
	 */
	void exitNo_brackets_curlies_or_squares(@NotNull ModuleParser.No_brackets_curlies_or_squaresContext ctx);

	/**
	 * Enter a parse tree produced by {@link ModuleParser#no_brackets_or_semicolon}.
	 * @param ctx the parse tree
	 */
	void enterNo_brackets_or_semicolon(@NotNull ModuleParser.No_brackets_or_semicolonContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModuleParser#no_brackets_or_semicolon}.
	 * @param ctx the parse tree
	 */
	void exitNo_brackets_or_semicolon(@NotNull ModuleParser.No_brackets_or_semicolonContext ctx);

	/**
	 * Enter a parse tree produced by {@link ModuleParser#no_angle_brackets_or_brackets}.
	 * @param ctx the parse tree
	 */
	void enterNo_angle_brackets_or_brackets(@NotNull ModuleParser.No_angle_brackets_or_bracketsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModuleParser#no_angle_brackets_or_brackets}.
	 * @param ctx the parse tree
	 */
	void exitNo_angle_brackets_or_brackets(@NotNull ModuleParser.No_angle_brackets_or_bracketsContext ctx);

	/**
	 * Enter a parse tree produced by {@link ModuleParser#no_curlies}.
	 * @param ctx the parse tree
	 */
	void enterNo_curlies(@NotNull ModuleParser.No_curliesContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModuleParser#no_curlies}.
	 * @param ctx the parse tree
	 */
	void exitNo_curlies(@NotNull ModuleParser.No_curliesContext ctx);

	/**
	 * Enter a parse tree produced by {@link ModuleParser#no_squares}.
	 * @param ctx the parse tree
	 */
	void enterNo_squares(@NotNull ModuleParser.No_squaresContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModuleParser#no_squares}.
	 * @param ctx the parse tree
	 */
	void exitNo_squares(@NotNull ModuleParser.No_squaresContext ctx);

	/**
	 * Enter a parse tree produced by {@link ModuleParser#no_squares_or_semicolon}.
	 * @param ctx the parse tree
	 */
	void enterNo_squares_or_semicolon(@NotNull ModuleParser.No_squares_or_semicolonContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModuleParser#no_squares_or_semicolon}.
	 * @param ctx the parse tree
	 */
	void exitNo_squares_or_semicolon(@NotNull ModuleParser.No_squares_or_semicolonContext ctx);

	/**
	 * Enter a parse tree produced by {@link ModuleParser#no_comma_or_semicolon}.
	 * @param ctx the parse tree
	 */
	void enterNo_comma_or_semicolon(@NotNull ModuleParser.No_comma_or_semicolonContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModuleParser#no_comma_or_semicolon}.
	 * @param ctx the parse tree
	 */
	void exitNo_comma_or_semicolon(@NotNull ModuleParser.No_comma_or_semicolonContext ctx);

	/**
	 * Enter a parse tree produced by {@link ModuleParser#assign_water}.
	 * @param ctx the parse tree
	 */
	void enterAssign_water(@NotNull ModuleParser.Assign_waterContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModuleParser#assign_water}.
	 * @param ctx the parse tree
	 */
	void exitAssign_water(@NotNull ModuleParser.Assign_waterContext ctx);

	/**
	 * Enter a parse tree produced by {@link ModuleParser#assign_water_l2}.
	 * @param ctx the parse tree
	 */
	void enterAssign_water_l2(@NotNull ModuleParser.Assign_water_l2Context ctx);
	/**
	 * Exit a parse tree produced by {@link ModuleParser#assign_water_l2}.
	 * @param ctx the parse tree
	 */
	void exitAssign_water_l2(@NotNull ModuleParser.Assign_water_l2Context ctx);

	/**
	 * Enter a parse tree produced by {@link ModuleParser#water}.
	 * @param ctx the parse tree
	 */
	void enterWater(@NotNull ModuleParser.WaterContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModuleParser#water}.
	 * @param ctx the parse tree
	 */
	void exitWater(@NotNull ModuleParser.WaterContext ctx);

	/**
	 * Enter a parse tree produced by {@link ModuleParser#custom}.
	 * @param ctx the parse tree
	 */
	void enterCustom(@NotNull ModuleParser.CustomContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModuleParser#custom}.
	 * @param ctx the parse tree
	 */
	void exitCustom(@NotNull ModuleParser.CustomContext ctx);

	/**
	 * Enter a parse tree produced by {@link ModuleParser#asciiTab}.
	 * @param ctx the parse tree
	 */
	void enterAsciiTab(@NotNull ModuleParser.AsciiTabContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModuleParser#asciiTab}.
	 * @param ctx the parse tree
	 */
	void exitAsciiTab(@NotNull ModuleParser.AsciiTabContext ctx);

	/**
	 * Enter a parse tree produced by {@link ModuleParser#externC}.
	 * @param ctx the parse tree
	 */
	void enterExternC(@NotNull ModuleParser.ExternCContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModuleParser#externC}.
	 * @param ctx the parse tree
	 */
	void exitExternC(@NotNull ModuleParser.ExternCContext ctx);

	/**
	 * Enter a parse tree produced by {@link ModuleParser#macroFunctionPointer}.
	 * @param ctx the parse tree
	 */
	void enterMacroFunctionPointer(@NotNull ModuleParser.MacroFunctionPointerContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModuleParser#macroFunctionPointer}.
	 * @param ctx the parse tree
	 */
	void exitMacroFunctionPointer(@NotNull ModuleParser.MacroFunctionPointerContext ctx);

	/**
	 * Enter a parse tree produced by {@link ModuleParser#testStart}.
	 * @param ctx the parse tree
	 */
	void enterTestStart(@NotNull ModuleParser.TestStartContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModuleParser#testStart}.
	 * @param ctx the parse tree
	 */
	void exitTestStart(@NotNull ModuleParser.TestStartContext ctx);

	/**
	 * Enter a parse tree produced by {@link ModuleParser#testEnd}.
	 * @param ctx the parse tree
	 */
	void enterTestEnd(@NotNull ModuleParser.TestEndContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModuleParser#testEnd}.
	 * @param ctx the parse tree
	 */
	void exitTestEnd(@NotNull ModuleParser.TestEndContext ctx);

	/**
	 * Enter a parse tree produced by {@link ModuleParser#phpErrorMessage}.
	 * @param ctx the parse tree
	 */
	void enterPhpErrorMessage(@NotNull ModuleParser.PhpErrorMessageContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModuleParser#phpErrorMessage}.
	 * @param ctx the parse tree
	 */
	void exitPhpErrorMessage(@NotNull ModuleParser.PhpErrorMessageContext ctx);

	/**
	 * Enter a parse tree produced by {@link ModuleParser#function_def}.
	 * @param ctx the parse tree
	 */
	void enterFunction_def(@NotNull ModuleParser.Function_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModuleParser#function_def}.
	 * @param ctx the parse tree
	 */
	void exitFunction_def(@NotNull ModuleParser.Function_defContext ctx);

	/**
	 * Enter a parse tree produced by {@link ModuleParser#macroCall_asFunctionHeader}.
	 * @param ctx the parse tree
	 */
	void enterMacroCall_asFunctionHeader(@NotNull ModuleParser.MacroCall_asFunctionHeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModuleParser#macroCall_asFunctionHeader}.
	 * @param ctx the parse tree
	 */
	void exitMacroCall_asFunctionHeader(@NotNull ModuleParser.MacroCall_asFunctionHeaderContext ctx);

	/**
	 * Enter a parse tree produced by {@link ModuleParser#return_type}.
	 * @param ctx the parse tree
	 */
	void enterReturn_type(@NotNull ModuleParser.Return_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModuleParser#return_type}.
	 * @param ctx the parse tree
	 */
	void exitReturn_type(@NotNull ModuleParser.Return_typeContext ctx);

	/**
	 * Enter a parse tree produced by {@link ModuleParser#function_param_list}.
	 * @param ctx the parse tree
	 */
	void enterFunction_param_list(@NotNull ModuleParser.Function_param_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModuleParser#function_param_list}.
	 * @param ctx the parse tree
	 */
	void exitFunction_param_list(@NotNull ModuleParser.Function_param_listContext ctx);

	/**
	 * Enter a parse tree produced by {@link ModuleParser#parameter_decl_clause}.
	 * @param ctx the parse tree
	 */
	void enterParameter_decl_clause(@NotNull ModuleParser.Parameter_decl_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModuleParser#parameter_decl_clause}.
	 * @param ctx the parse tree
	 */
	void exitParameter_decl_clause(@NotNull ModuleParser.Parameter_decl_clauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link ModuleParser#parameter_decl}.
	 * @param ctx the parse tree
	 */
	void enterParameter_decl(@NotNull ModuleParser.Parameter_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModuleParser#parameter_decl}.
	 * @param ctx the parse tree
	 */
	void exitParameter_decl(@NotNull ModuleParser.Parameter_declContext ctx);

	/**
	 * Enter a parse tree produced by {@link ModuleParser#parameter_id}.
	 * @param ctx the parse tree
	 */
	void enterParameter_id(@NotNull ModuleParser.Parameter_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModuleParser#parameter_id}.
	 * @param ctx the parse tree
	 */
	void exitParameter_id(@NotNull ModuleParser.Parameter_idContext ctx);

	/**
	 * Enter a parse tree produced by {@link ModuleParser#compound_statement}.
	 * @param ctx the parse tree
	 */
	void enterCompound_statement(@NotNull ModuleParser.Compound_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModuleParser#compound_statement}.
	 * @param ctx the parse tree
	 */
	void exitCompound_statement(@NotNull ModuleParser.Compound_statementContext ctx);

	/**
	 * Enter a parse tree produced by {@link ModuleParser#ctor_list}.
	 * @param ctx the parse tree
	 */
	void enterCtor_list(@NotNull ModuleParser.Ctor_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModuleParser#ctor_list}.
	 * @param ctx the parse tree
	 */
	void exitCtor_list(@NotNull ModuleParser.Ctor_listContext ctx);

	/**
	 * Enter a parse tree produced by {@link ModuleParser#ctor_initializer}.
	 * @param ctx the parse tree
	 */
	void enterCtor_initializer(@NotNull ModuleParser.Ctor_initializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModuleParser#ctor_initializer}.
	 * @param ctx the parse tree
	 */
	void exitCtor_initializer(@NotNull ModuleParser.Ctor_initializerContext ctx);

	/**
	 * Enter a parse tree produced by {@link ModuleParser#initializer_id}.
	 * @param ctx the parse tree
	 */
	void enterInitializer_id(@NotNull ModuleParser.Initializer_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModuleParser#initializer_id}.
	 * @param ctx the parse tree
	 */
	void exitInitializer_id(@NotNull ModuleParser.Initializer_idContext ctx);

	/**
	 * Enter a parse tree produced by {@link ModuleParser#ctor_expr}.
	 * @param ctx the parse tree
	 */
	void enterCtor_expr(@NotNull ModuleParser.Ctor_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModuleParser#ctor_expr}.
	 * @param ctx the parse tree
	 */
	void exitCtor_expr(@NotNull ModuleParser.Ctor_exprContext ctx);

	/**
	 * Enter a parse tree produced by {@link ModuleParser#function_name}.
	 * @param ctx the parse tree
	 */
	void enterFunction_name(@NotNull ModuleParser.Function_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModuleParser#function_name}.
	 * @param ctx the parse tree
	 */
	void exitFunction_name(@NotNull ModuleParser.Function_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link ModuleParser#exception_specification}.
	 * @param ctx the parse tree
	 */
	void enterException_specification(@NotNull ModuleParser.Exception_specificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModuleParser#exception_specification}.
	 * @param ctx the parse tree
	 */
	void exitException_specification(@NotNull ModuleParser.Exception_specificationContext ctx);

	/**
	 * Enter a parse tree produced by {@link ModuleParser#type_id_list}.
	 * @param ctx the parse tree
	 */
	void enterType_id_list(@NotNull ModuleParser.Type_id_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModuleParser#type_id_list}.
	 * @param ctx the parse tree
	 */
	void exitType_id_list(@NotNull ModuleParser.Type_id_listContext ctx);

	/**
	 * Enter a parse tree produced by {@link ModuleParser#simple_decl}.
	 * @param ctx the parse tree
	 */
	void enterSimple_decl(@NotNull ModuleParser.Simple_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModuleParser#simple_decl}.
	 * @param ctx the parse tree
	 */
	void exitSimple_decl(@NotNull ModuleParser.Simple_declContext ctx);

	/**
	 * Enter a parse tree produced by {@link ModuleParser#var_decl}.
	 * @param ctx the parse tree
	 */
	void enterVar_decl(@NotNull ModuleParser.Var_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModuleParser#var_decl}.
	 * @param ctx the parse tree
	 */
	void exitVar_decl(@NotNull ModuleParser.Var_declContext ctx);

	/**
	 * Enter a parse tree produced by {@link ModuleParser#callingConvention}.
	 * @param ctx the parse tree
	 */
	void enterCallingConvention(@NotNull ModuleParser.CallingConventionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModuleParser#callingConvention}.
	 * @param ctx the parse tree
	 */
	void exitCallingConvention(@NotNull ModuleParser.CallingConventionContext ctx);

	/**
	 * Enter a parse tree produced by {@link ModuleParser#special_datatype}.
	 * @param ctx the parse tree
	 */
	void enterSpecial_datatype(@NotNull ModuleParser.Special_datatypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModuleParser#special_datatype}.
	 * @param ctx the parse tree
	 */
	void exitSpecial_datatype(@NotNull ModuleParser.Special_datatypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link ModuleParser#init_declarator_list}.
	 * @param ctx the parse tree
	 */
	void enterInit_declarator_list(@NotNull ModuleParser.Init_declarator_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModuleParser#init_declarator_list}.
	 * @param ctx the parse tree
	 */
	void exitInit_declarator_list(@NotNull ModuleParser.Init_declarator_listContext ctx);

	/**
	 * Enter a parse tree produced by {@link ModuleParser#type_name}.
	 * @param ctx the parse tree
	 */
	void enterType_name(@NotNull ModuleParser.Type_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModuleParser#type_name}.
	 * @param ctx the parse tree
	 */
	void exitType_name(@NotNull ModuleParser.Type_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link ModuleParser#base_type}.
	 * @param ctx the parse tree
	 */
	void enterBase_type(@NotNull ModuleParser.Base_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModuleParser#base_type}.
	 * @param ctx the parse tree
	 */
	void exitBase_type(@NotNull ModuleParser.Base_typeContext ctx);

	/**
	 * Enter a parse tree produced by {@link ModuleParser#parameter_name}.
	 * @param ctx the parse tree
	 */
	void enterParameter_name(@NotNull ModuleParser.Parameter_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModuleParser#parameter_name}.
	 * @param ctx the parse tree
	 */
	void exitParameter_name(@NotNull ModuleParser.Parameter_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link ModuleParser#param_type_list}.
	 * @param ctx the parse tree
	 */
	void enterParam_type_list(@NotNull ModuleParser.Param_type_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModuleParser#param_type_list}.
	 * @param ctx the parse tree
	 */
	void exitParam_type_list(@NotNull ModuleParser.Param_type_listContext ctx);

	/**
	 * Enter a parse tree produced by {@link ModuleParser#param_type}.
	 * @param ctx the parse tree
	 */
	void enterParam_type(@NotNull ModuleParser.Param_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModuleParser#param_type}.
	 * @param ctx the parse tree
	 */
	void exitParam_type(@NotNull ModuleParser.Param_typeContext ctx);

	/**
	 * Enter a parse tree produced by {@link ModuleParser#param_type_id}.
	 * @param ctx the parse tree
	 */
	void enterParam_type_id(@NotNull ModuleParser.Param_type_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModuleParser#param_type_id}.
	 * @param ctx the parse tree
	 */
	void exitParam_type_id(@NotNull ModuleParser.Param_type_idContext ctx);

	/**
	 * Enter a parse tree produced by {@link ModuleParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(@NotNull ModuleParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModuleParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(@NotNull ModuleParser.IdentifierContext ctx);

	/**
	 * Enter a parse tree produced by {@link ModuleParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(@NotNull ModuleParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModuleParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(@NotNull ModuleParser.NumberContext ctx);

	/**
	 * Enter a parse tree produced by {@link ModuleParser#ptrs}.
	 * @param ctx the parse tree
	 */
	void enterPtrs(@NotNull ModuleParser.PtrsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModuleParser#ptrs}.
	 * @param ctx the parse tree
	 */
	void exitPtrs(@NotNull ModuleParser.PtrsContext ctx);

	/**
	 * Enter a parse tree produced by {@link ModuleParser#func_ptrs}.
	 * @param ctx the parse tree
	 */
	void enterFunc_ptrs(@NotNull ModuleParser.Func_ptrsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModuleParser#func_ptrs}.
	 * @param ctx the parse tree
	 */
	void exitFunc_ptrs(@NotNull ModuleParser.Func_ptrsContext ctx);

	/**
	 * Enter a parse tree produced by {@link ModuleParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(@NotNull ModuleParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModuleParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(@NotNull ModuleParser.ExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link ModuleParser#assign_expr}.
	 * @param ctx the parse tree
	 */
	void enterAssign_expr(@NotNull ModuleParser.Assign_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModuleParser#assign_expr}.
	 * @param ctx the parse tree
	 */
	void exitAssign_expr(@NotNull ModuleParser.Assign_exprContext ctx);

	/**
	 * Enter a parse tree produced by {@link ModuleParser#conditional_expression}.
	 * @param ctx the parse tree
	 */
	void enterConditional_expression(@NotNull ModuleParser.Conditional_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModuleParser#conditional_expression}.
	 * @param ctx the parse tree
	 */
	void exitConditional_expression(@NotNull ModuleParser.Conditional_expressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link ModuleParser#or_expression}.
	 * @param ctx the parse tree
	 */
	void enterOr_expression(@NotNull ModuleParser.Or_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModuleParser#or_expression}.
	 * @param ctx the parse tree
	 */
	void exitOr_expression(@NotNull ModuleParser.Or_expressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link ModuleParser#and_expression}.
	 * @param ctx the parse tree
	 */
	void enterAnd_expression(@NotNull ModuleParser.And_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModuleParser#and_expression}.
	 * @param ctx the parse tree
	 */
	void exitAnd_expression(@NotNull ModuleParser.And_expressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link ModuleParser#inclusive_or_expression}.
	 * @param ctx the parse tree
	 */
	void enterInclusive_or_expression(@NotNull ModuleParser.Inclusive_or_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModuleParser#inclusive_or_expression}.
	 * @param ctx the parse tree
	 */
	void exitInclusive_or_expression(@NotNull ModuleParser.Inclusive_or_expressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link ModuleParser#exclusive_or_expression}.
	 * @param ctx the parse tree
	 */
	void enterExclusive_or_expression(@NotNull ModuleParser.Exclusive_or_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModuleParser#exclusive_or_expression}.
	 * @param ctx the parse tree
	 */
	void exitExclusive_or_expression(@NotNull ModuleParser.Exclusive_or_expressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link ModuleParser#bit_and_expression}.
	 * @param ctx the parse tree
	 */
	void enterBit_and_expression(@NotNull ModuleParser.Bit_and_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModuleParser#bit_and_expression}.
	 * @param ctx the parse tree
	 */
	void exitBit_and_expression(@NotNull ModuleParser.Bit_and_expressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link ModuleParser#equality_expression}.
	 * @param ctx the parse tree
	 */
	void enterEquality_expression(@NotNull ModuleParser.Equality_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModuleParser#equality_expression}.
	 * @param ctx the parse tree
	 */
	void exitEquality_expression(@NotNull ModuleParser.Equality_expressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link ModuleParser#relational_expression}.
	 * @param ctx the parse tree
	 */
	void enterRelational_expression(@NotNull ModuleParser.Relational_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModuleParser#relational_expression}.
	 * @param ctx the parse tree
	 */
	void exitRelational_expression(@NotNull ModuleParser.Relational_expressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link ModuleParser#shift_expression}.
	 * @param ctx the parse tree
	 */
	void enterShift_expression(@NotNull ModuleParser.Shift_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModuleParser#shift_expression}.
	 * @param ctx the parse tree
	 */
	void exitShift_expression(@NotNull ModuleParser.Shift_expressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link ModuleParser#additive_expression}.
	 * @param ctx the parse tree
	 */
	void enterAdditive_expression(@NotNull ModuleParser.Additive_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModuleParser#additive_expression}.
	 * @param ctx the parse tree
	 */
	void exitAdditive_expression(@NotNull ModuleParser.Additive_expressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link ModuleParser#multiplicative_expression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicative_expression(@NotNull ModuleParser.Multiplicative_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModuleParser#multiplicative_expression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicative_expression(@NotNull ModuleParser.Multiplicative_expressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link ModuleParser#function_pointer_use_expression}.
	 * @param ctx the parse tree
	 */
	void enterFunction_pointer_use_expression(@NotNull ModuleParser.Function_pointer_use_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModuleParser#function_pointer_use_expression}.
	 * @param ctx the parse tree
	 */
	void exitFunction_pointer_use_expression(@NotNull ModuleParser.Function_pointer_use_expressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link ModuleParser#cast_expression}.
	 * @param ctx the parse tree
	 */
	void enterCast_expression(@NotNull ModuleParser.Cast_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModuleParser#cast_expression}.
	 * @param ctx the parse tree
	 */
	void exitCast_expression(@NotNull ModuleParser.Cast_expressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link ModuleParser#cast_target}.
	 * @param ctx the parse tree
	 */
	void enterCast_target(@NotNull ModuleParser.Cast_targetContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModuleParser#cast_target}.
	 * @param ctx the parse tree
	 */
	void exitCast_target(@NotNull ModuleParser.Cast_targetContext ctx);

	/**
	 * Enter a parse tree produced by {@link ModuleParser#unary_expression}.
	 * @param ctx the parse tree
	 */
	void enterUnary_expression(@NotNull ModuleParser.Unary_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModuleParser#unary_expression}.
	 * @param ctx the parse tree
	 */
	void exitUnary_expression(@NotNull ModuleParser.Unary_expressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link ModuleParser#address_of_expression}.
	 * @param ctx the parse tree
	 */
	void enterAddress_of_expression(@NotNull ModuleParser.Address_of_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModuleParser#address_of_expression}.
	 * @param ctx the parse tree
	 */
	void exitAddress_of_expression(@NotNull ModuleParser.Address_of_expressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link ModuleParser#unary_op_and_cast_expr}.
	 * @param ctx the parse tree
	 */
	void enterUnary_op_and_cast_expr(@NotNull ModuleParser.Unary_op_and_cast_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModuleParser#unary_op_and_cast_expr}.
	 * @param ctx the parse tree
	 */
	void exitUnary_op_and_cast_expr(@NotNull ModuleParser.Unary_op_and_cast_exprContext ctx);

	/**
	 * Enter a parse tree produced by {@link ModuleParser#sizeof_expression}.
	 * @param ctx the parse tree
	 */
	void enterSizeof_expression(@NotNull ModuleParser.Sizeof_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModuleParser#sizeof_expression}.
	 * @param ctx the parse tree
	 */
	void exitSizeof_expression(@NotNull ModuleParser.Sizeof_expressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link ModuleParser#sizeof}.
	 * @param ctx the parse tree
	 */
	void enterSizeof(@NotNull ModuleParser.SizeofContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModuleParser#sizeof}.
	 * @param ctx the parse tree
	 */
	void exitSizeof(@NotNull ModuleParser.SizeofContext ctx);

	/**
	 * Enter a parse tree produced by {@link ModuleParser#defined_expression}.
	 * @param ctx the parse tree
	 */
	void enterDefined_expression(@NotNull ModuleParser.Defined_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModuleParser#defined_expression}.
	 * @param ctx the parse tree
	 */
	void exitDefined_expression(@NotNull ModuleParser.Defined_expressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link ModuleParser#sizeof_operand}.
	 * @param ctx the parse tree
	 */
	void enterSizeof_operand(@NotNull ModuleParser.Sizeof_operandContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModuleParser#sizeof_operand}.
	 * @param ctx the parse tree
	 */
	void exitSizeof_operand(@NotNull ModuleParser.Sizeof_operandContext ctx);

	/**
	 * Enter a parse tree produced by {@link ModuleParser#sizeof_operand2}.
	 * @param ctx the parse tree
	 */
	void enterSizeof_operand2(@NotNull ModuleParser.Sizeof_operand2Context ctx);
	/**
	 * Exit a parse tree produced by {@link ModuleParser#sizeof_operand2}.
	 * @param ctx the parse tree
	 */
	void exitSizeof_operand2(@NotNull ModuleParser.Sizeof_operand2Context ctx);

	/**
	 * Enter a parse tree produced by {@link ModuleParser#inc_dec}.
	 * @param ctx the parse tree
	 */
	void enterInc_dec(@NotNull ModuleParser.Inc_decContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModuleParser#inc_dec}.
	 * @param ctx the parse tree
	 */
	void exitInc_dec(@NotNull ModuleParser.Inc_decContext ctx);

	/**
	 * Enter a parse tree produced by {@link ModuleParser#asmCall}.
	 * @param ctx the parse tree
	 */
	void enterAsmCall(@NotNull ModuleParser.AsmCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModuleParser#asmCall}.
	 * @param ctx the parse tree
	 */
	void exitAsmCall(@NotNull ModuleParser.AsmCallContext ctx);

	/**
	 * Enter a parse tree produced by {@link ModuleParser#postfix_expression}.
	 * @param ctx the parse tree
	 */
	void enterPostfix_expression(@NotNull ModuleParser.Postfix_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModuleParser#postfix_expression}.
	 * @param ctx the parse tree
	 */
	void exitPostfix_expression(@NotNull ModuleParser.Postfix_expressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link ModuleParser#initializer_expression}.
	 * @param ctx the parse tree
	 */
	void enterInitializer_expression(@NotNull ModuleParser.Initializer_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModuleParser#initializer_expression}.
	 * @param ctx the parse tree
	 */
	void exitInitializer_expression(@NotNull ModuleParser.Initializer_expressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link ModuleParser#argument_list}.
	 * @param ctx the parse tree
	 */
	void enterArgument_list(@NotNull ModuleParser.Argument_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModuleParser#argument_list}.
	 * @param ctx the parse tree
	 */
	void exitArgument_list(@NotNull ModuleParser.Argument_listContext ctx);

	/**
	 * Enter a parse tree produced by {@link ModuleParser#argument}.
	 * @param ctx the parse tree
	 */
	void enterArgument(@NotNull ModuleParser.ArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModuleParser#argument}.
	 * @param ctx the parse tree
	 */
	void exitArgument(@NotNull ModuleParser.ArgumentContext ctx);

	/**
	 * Enter a parse tree produced by {@link ModuleParser#primary_expression}.
	 * @param ctx the parse tree
	 */
	void enterPrimary_expression(@NotNull ModuleParser.Primary_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModuleParser#primary_expression}.
	 * @param ctx the parse tree
	 */
	void exitPrimary_expression(@NotNull ModuleParser.Primary_expressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link ModuleParser#null_expression}.
	 * @param ctx the parse tree
	 */
	void enterNull_expression(@NotNull ModuleParser.Null_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModuleParser#null_expression}.
	 * @param ctx the parse tree
	 */
	void exitNull_expression(@NotNull ModuleParser.Null_expressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link ModuleParser#preprocessor_fragment}.
	 * @param ctx the parse tree
	 */
	void enterPreprocessor_fragment(@NotNull ModuleParser.Preprocessor_fragmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModuleParser#preprocessor_fragment}.
	 * @param ctx the parse tree
	 */
	void exitPreprocessor_fragment(@NotNull ModuleParser.Preprocessor_fragmentContext ctx);

	/**
	 * Enter a parse tree produced by {@link ModuleParser#expression_fragment}.
	 * @param ctx the parse tree
	 */
	void enterExpression_fragment(@NotNull ModuleParser.Expression_fragmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModuleParser#expression_fragment}.
	 * @param ctx the parse tree
	 */
	void exitExpression_fragment(@NotNull ModuleParser.Expression_fragmentContext ctx);

	/**
	 * Enter a parse tree produced by {@link ModuleParser#init_declarator}.
	 * @param ctx the parse tree
	 */
	void enterInit_declarator(@NotNull ModuleParser.Init_declaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModuleParser#init_declarator}.
	 * @param ctx the parse tree
	 */
	void exitInit_declarator(@NotNull ModuleParser.Init_declaratorContext ctx);

	/**
	 * Enter a parse tree produced by {@link ModuleParser#declarator}.
	 * @param ctx the parse tree
	 */
	void enterDeclarator(@NotNull ModuleParser.DeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModuleParser#declarator}.
	 * @param ctx the parse tree
	 */
	void exitDeclarator(@NotNull ModuleParser.DeclaratorContext ctx);

	/**
	 * Enter a parse tree produced by {@link ModuleParser#type_suffix}.
	 * @param ctx the parse tree
	 */
	void enterType_suffix(@NotNull ModuleParser.Type_suffixContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModuleParser#type_suffix}.
	 * @param ctx the parse tree
	 */
	void exitType_suffix(@NotNull ModuleParser.Type_suffixContext ctx);

	/**
	 * Enter a parse tree produced by {@link ModuleParser#assign_expr_w_}.
	 * @param ctx the parse tree
	 */
	void enterAssign_expr_w_(@NotNull ModuleParser.Assign_expr_w_Context ctx);
	/**
	 * Exit a parse tree produced by {@link ModuleParser#assign_expr_w_}.
	 * @param ctx the parse tree
	 */
	void exitAssign_expr_w_(@NotNull ModuleParser.Assign_expr_w_Context ctx);

	/**
	 * Enter a parse tree produced by {@link ModuleParser#assign_expr_w__l2}.
	 * @param ctx the parse tree
	 */
	void enterAssign_expr_w__l2(@NotNull ModuleParser.Assign_expr_w__l2Context ctx);
	/**
	 * Exit a parse tree produced by {@link ModuleParser#assign_expr_w__l2}.
	 * @param ctx the parse tree
	 */
	void exitAssign_expr_w__l2(@NotNull ModuleParser.Assign_expr_w__l2Context ctx);

	/**
	 * Enter a parse tree produced by {@link ModuleParser#constant_expr_w_}.
	 * @param ctx the parse tree
	 */
	void enterConstant_expr_w_(@NotNull ModuleParser.Constant_expr_w_Context ctx);
	/**
	 * Exit a parse tree produced by {@link ModuleParser#constant_expr_w_}.
	 * @param ctx the parse tree
	 */
	void exitConstant_expr_w_(@NotNull ModuleParser.Constant_expr_w_Context ctx);
}