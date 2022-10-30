package com.riyadbusttami.advancedcalculator;
import java.util.ArrayList;
import java.util.Objects;
public class AdvancedCalculator {
	private ArrayList<Double> operands;
	private ArrayList<Character> operations;
	private boolean numNext;

	public AdvancedCalculator() {
		operands=new ArrayList<Double>();
		operations=new ArrayList<Character>();
		numNext=true;
	}
	
	public void performOperations(Double num) {
		if(this.numNext) {
			this.operands.add(num);			
		}
		else {
			System.out.println("Invalid number!");
		}
		numNext=false;
	}
	
	public void performOperations(Character character) {
		if(!this.numNext) {
			this.operations.add(character);
		}
		else {
			System.out.println("Invalid operation!");
		}
		
		numNext=true;
	}
	
	public void getResults() {
		if(!this.numNext) {
			System.out.println("Result= "+this.calculate());		
		}
		else {
			System.out.println("There's an operand missing!");
		}
	}
	
	public Double calculate() {
		for (int i=0;i<this.operations.size();i++) {
			if(this.operations.get(i).equals('*')) {
				this.operands.set(i, this.operands.get(i)*this.operands.get(i+1));
				this.operands.set(i+1, null);
				this.operations.set(i, null);
			}
			else if(this.operations.get(i).equals('/')) {
				this.operands.set(i, this.operands.get(i)/this.operands.get(i+1));
				this.operands.set(i+1, null);
				this.operations.set(i, null);
				
			}
		}
		this.operands.removeIf(Objects::isNull);
		this.operations.removeIf(Objects::isNull);
		
		
		Double result=this.operands.get(0);
		for (int i=0;i<this.operations.size();i++) {
			if(this.operations.get(i).equals('+')) {
				result+=this.operands.get(i+1);
			}
			else if(this.operations.get(i).equals('-')) {
				result-=this.operands.get(i+1);
				
			}
		}
		return result;
	}
	
}
