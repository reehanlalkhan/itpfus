package com.itpfus.ducks;

public class MallardDuck extends Duck implements Flyable {

	public MallardDuck() {
		setFlyable(this);
	}

	public void display() {
		System.out.println("A grey colored duck");
	}

	@Override
	public void fly() {
		System.out.println("Flap, flap!");
	}

}
