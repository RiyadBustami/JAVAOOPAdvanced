package com.riyadbusttami.calculator;

public class Calculator {
	private double operandOne;
	private double operandTwo;
	private String operation;
	private double results;
	
	

	public Calculator(double opOne, String operation, double opTwo) {
		this.operandOne=opOne;
		this.operation=operation;
		this.operandTwo=opTwo;
		this.results=-999999999;
	}



	public double getOperandOne() {
		return operandOne;
	}



	public void setOperandOne(double operandOne) {
		this.operandOne = operandOne;
	}



	public double getOperandTwo() {
		return operandTwo;
	}



	public void setOperandTwo(double operandTwo) {
		this.operandTwo = operandTwo;
	}



	public String getOperation() {
		return operation;
	}



	public void setOperation(String operation) {
		this.operation = operation;
	}
	
	public void performOperation() {if(this.operation.equals("+")) {
		this.results= this.operandOne+this.operandTwo;
	}
	else if(this.operation.equals("-")) {
		this.results= this.operandOne-this.operandTwo;
	}
	else {
		this.results=-999999999;
	}
		
	}
	
	public double getResults() {
		return this.results;
	}

}
