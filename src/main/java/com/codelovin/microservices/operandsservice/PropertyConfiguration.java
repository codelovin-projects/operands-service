package com.codelovin.microservices.operandsservice;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("operands-service")
public class PropertyConfiguration {

	private int operand1;
	private int operand2;
	
	public int getOperand1() {
		return operand1;
	}
	
	public void setOperand1(int operand1) {
		this.operand1 = operand1;
	}
	
	public int getOperand2() {
		return operand2;
	}
	
	public void setOperand2(int operand2) {
		this.operand2 = operand2;
	}
}
