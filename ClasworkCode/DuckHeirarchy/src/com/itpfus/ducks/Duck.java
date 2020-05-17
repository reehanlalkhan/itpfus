package com.itpfus.ducks;

public abstract class Duck {

	private int age;
	private float weight;
	private String color;
	private Flyable flyer;

	public void setFlyable(Flyable flyer) {
		this.flyer = flyer;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age <= 0 || age > 30)
			age = 1;
		this.age = age;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		if (weight <= 0 || weight > 50)
			weight = 1;
		this.weight = weight;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void fly() {
		if (flyer != null) {
			flyer.fly();
		}
	}

	public void quack() {
		System.out.println("Quack, quack!");
	}

	public void display() {
		System.out.println("A white colored duck");
	}

}
