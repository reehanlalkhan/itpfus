package org.itpfus.comAssignment;

public class MallardDuckWithAbstractClass extends ParentDuck {

	@Override
	public void quack() {
		System.out.println("Male Duck can't quck, but can noise like kreep..");
		
	}

	@Override
	public void fly() {
		System.out.println("Mallard Duck can fly 40-60 miles/hr");
		
	}

	@Override
	public void display() {
		System.out.println("Display with gray colored with Green head( specially Male one");
		
	}

}
