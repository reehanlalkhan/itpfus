package org.itpfus.comAssignment;

public class DecoyDuckWithAbstractKeyword extends ParentDuck{

	@Override
	public void quack() {
	System.out.println("Decoy duck can't quck!");
		
	}

	@Override
	public void fly() {
		System.out.println("Decoy duck can't fly");
		
	}

	@Override
	public void display() {
		System.out.println("Decoy duck display with gray and Black colored");
		
	}

}
