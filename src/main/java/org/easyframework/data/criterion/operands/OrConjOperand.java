package org.easyframework.data.criterion.operands;

public class OrConjOperand extends AbstractOperand {

	public OrConjOperand() {
	}

	@Override
	protected String toExpression() {
		return " OR ";
	}
}
