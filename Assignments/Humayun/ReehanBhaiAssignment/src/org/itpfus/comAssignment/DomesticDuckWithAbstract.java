package org.itpfus.comAssignment;

public class DomesticDuckWithAbstract extends ParentDuck {

	@Override
	public void quack() {
		System.out.println("Domestic Duck can quck!!");
		
	}

	@Override
	public void fly() {
		System.out.println("Domestic duck can Run and fly");
		
	}

	@Override
	public void display() {
		System.out.println("Domestic duck with different colored."); 
		
	}

//	@Override
//	public void quack() {
//		System.out.println("Domestic Duck can quck!!");
//
//	}
//
//	@Override
//	public void fly() {
//		System.out.println("Domestic duck can Run and fly");
//	}
//
//	@Override
//	public void display() {
//		System.out.println("Domestic duck with different colored."); 
//
//	}

}
