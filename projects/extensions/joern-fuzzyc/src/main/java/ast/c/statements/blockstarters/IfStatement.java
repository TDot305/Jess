package ast.c.statements.blockstarters;

import ast.ASTNode;
import ast.statements.blockstarters.IfStatementBase;
import ast.walking.ASTNodeVisitor;

public class IfStatement extends IfStatementBase {
	private ElseStatement elseNode = null;

	public int getChildCount() {
		int childCount = super.getChildCount();

		if (getElseNode() != null)
			childCount++;
		return childCount;
	}


	public ElseStatement getElseNode() {
		return elseNode;
	}

	public void setElseNode(ElseStatement elseNode) {
		this.elseNode = elseNode;
	}

	public void accept(ASTNodeVisitor visitor) {
		visitor.visit(this);
	}
}
