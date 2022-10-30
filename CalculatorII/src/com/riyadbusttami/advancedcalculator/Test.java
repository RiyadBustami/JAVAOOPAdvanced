package com.riyadbusttami.advancedcalculator;

public class Test {

	public static void main(String[] args) {
		AdvancedCalculator calc=new AdvancedCalculator();
		calc.performOperations(10.5);
		calc.performOperations('+');
		calc.performOperations(5.2);
		calc.performOperations('*');
		calc.performOperations(10.0);
		calc.performOperations('+');		
		calc.performOperations(10.0);
		calc.performOperations('+');
		calc.performOperations(5.2);
		calc.performOperations('*');
		calc.performOperations(10.0);
		
		calc.getResults();
		

	}

}
