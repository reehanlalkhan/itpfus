package com.itpfus.guessinggame;

public class GameMaster extends Player {

	public int iterations;

	public GameMaster() {
		this.guess();
	}

	public void startTheGame() {
		Player p1 = new Player();
		Player p2 = new Player();
		Player p3 = new Player();

		System.out.println("Game Master age:" + age);
		for (int iCount = 0; iCount < iterations; iCount++) {
			System.out.println("Starting iteration number:" + (iCount + 1));
			int guess = p1.guess();
			if (guess == number) {
				System.out.println("Guess by Player-1:" + guess);
				System.out.println("Player-1 is the winner");
				break;
			}
			guess = p2.guess();
			if (guess == number) {
				System.out.println("Guess by Player-2:" + guess);
				System.out.println("Player-2 is the winner");
				break;
			}
			guess = p3.guess();
			if (guess == number) {
				System.out.println("Guess by Player-3:" + guess);
				System.out.println("Player-3 is the winner");
				break;
			}
		}
	}

}
