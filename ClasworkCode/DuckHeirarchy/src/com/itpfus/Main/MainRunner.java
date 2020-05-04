package com.itpfus.Main;

import com.itpfus.ducks.Duck;
import com.itpfus.ducks.RubberDuck;

public class MainRunner {

	public static void main(String[] args) {
		Duck d = new RubberDuck(); // Upcasting
		int x = (int)10.7869; // Downcasting

		d.quack();
		d.fly();
		d.display();
	}

}
