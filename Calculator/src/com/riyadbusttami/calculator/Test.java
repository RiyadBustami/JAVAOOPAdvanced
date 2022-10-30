package com.riyadbusttami.calculator;

public class Test {

	public static void main(String[] args) {
		Calculator calc=new Calculator(102.3, "+", 16.7);
		calc.performOperation();
		System.out.println(calc.getResults());

	}

}
