package com.itpfus.Main;

import com.itpfus.ducks.DomesticDuck;
import com.itpfus.ducks.Duck;
import com.itpfus.ducks.RubberDuck;

public class MainRunner {

	public static void main(String[] args) {
		int x = (int) 10.7869; // Downcasting

		Duck d = new DomesticDuck(); // Upcasting

		d.quack();
		d.display();
		d.fly();
	}

}
