package com.itpfus.ducks;

public class DomesticDuck extends Duck {

	public DomesticDuck() {
		Flyable fly = new FlyWithWings();
		setFlyable(fly);
		/*QuackLikeADuck is a class that implements Quacker interface
		 * Quacker quack = new QuackLikeADuck();
		setQuackable(quack);*/
	}

	public void display(String name) {
		super.display();
		System.out.println("Name of the duck:" + name);
	}
	
	public void someOtherMethod() {
		System.out.println("something");
	}
}
