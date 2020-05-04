package com.itpfus.Main;

import java.math.BigDecimal;

import com.itpfus.guessinggame.GameMaster;
import com.itpfus.guessinggame.Player;

public class MainRunner {

	public static void main(String[] args) {
		/*
		 * Lecture l = new Lecture("Java Fundamentals", "James Gosling", new Date());
		 * 
		 * System.out.println("Lecture details:"); System.out.println(l.topic);
		 * System.out.println(l.speaker); System.out.println(l.date);
		 * 
		 * 
		 * 
		 */

		GameMaster gm = new GameMaster();
		gm.name = "GM";
		gm.iterations = 5;
		gm.startTheGame();

		double a = 0.03;
		double b = 0.04;
		double c = b + a;

		changeValues(a, b);

		System.out.println("Value of a:" + a);
		System.out.println("Value of b:" + b);

		String name = "John Doe";
		Player p = new Player();
		p.name = name;
		changeValues(p);
		System.out.println("Player Name:" + p.name);

		BigDecimal ba = new BigDecimal(a);
		changeValues(ba);
		System.out.println("Bigdecimal:" + ba);

		StringBuffer sb = new StringBuffer();
		sb.append("John ");
		changeValues(sb);
		System.out.println(sb);

	}

	private static void changeValues(StringBuffer sb) {
		sb.append("Doe");
	}

	private static void changeValues(BigDecimal ba) {
		ba = ba.add(BigDecimal.TEN);
		System.out.println("Bigdecimal inside function:" + ba);
	}

	private static void changeValues(Player p) {
		p.name = "Jane Doe";
	}

	private static void changeValues(double a, double b) {
		a = 0.5;
		b = 0.9;
	}

}
