package com.itpfus.ducks;

public class FlyWithWings implements Flyable {

	@Override
	public void fly() {
		System.out.println("Fly with wings: speed=" + SPEED);
	}

}
