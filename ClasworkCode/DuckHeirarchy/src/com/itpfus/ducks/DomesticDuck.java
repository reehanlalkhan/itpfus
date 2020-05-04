package com.itpfus.ducks;

public class DomesticDuck extends Duck {

	public void display(String name) {
		super.display();
		System.out.println("Name of the duck:" + name);
	}
	
	public void someOtherMethod() {
		System.out.println("something");
	}

	@Override
	public void fly() {
		System.out.println("Run, flap, flap, fly away!");
	}
}
