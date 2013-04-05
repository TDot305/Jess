package main.codeitems.functionContent;

import main.codeitems.CodeItem;
import main.codeitems.expressions.Expression;


public class BlockStarterItem extends CodeItem
{
	CodeItem statement = null;
	Condition condition = null;
	
	public Condition getCondition()
	{
		return condition;
	}
	
	public void setStatement(CodeItem aStatement)
	{
		statement = aStatement;
	}

	public void setCondition(Condition expression)
	{
		condition = expression;
	}

	@Override
	public void addChild(CodeItem expression){}
	
	public int getChildCount()
	{
		if(condition == null || statement == null)
			throw new RuntimeException("Invalid Blockstarter");
		
		return 2;
	}
	
	public CodeItem getChild(int i)
	{
		if(i == 0) return condition;
		return statement;
	}
	
}
