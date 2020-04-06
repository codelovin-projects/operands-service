package com.codelovin.microservices.operandsservice;

public class OperandValues {

	private int operand1;
	private int operand2;
	
	public OperandValues() {}
	
	public OperandValues(int op1, int op2) {
		this.operand1 = op1;
		this.operand2 = op2;
	}

	public int getOperand1() {
		return operand1;
	}

	public int getOperand2() {
		return operand2;
	}


}
