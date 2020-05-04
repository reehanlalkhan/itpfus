package com.itpfus.guessinggame;

public class Player {

	protected String age;
	public String name;
	int number;

	public int guess() {
		number = (int) (Math.random() * 10);
		return number;
	}

}
