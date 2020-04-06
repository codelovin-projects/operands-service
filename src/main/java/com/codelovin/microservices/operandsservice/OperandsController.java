package com.codelovin.microservices.operandsservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OperandsController {

	@Autowired
	private PropertyConfiguration propertyConfiguration;
	
	@GetMapping("/operands")
	public OperandValues getOperandsFromConfigurations() {
		OperandValues ops = new OperandValues(propertyConfiguration.getOperand1(), propertyConfiguration.getOperand2());
		return ops;
	}
}
