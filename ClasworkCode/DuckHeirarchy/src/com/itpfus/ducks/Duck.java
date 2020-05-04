package com.itpfus.ducks;

public abstract class Duck {

	private int age;
	private float weight;
	private String color;

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
	
	public void quack() {
		System.out.println("Quack, quack!");
	}
	
	public abstract void fly();
	
	public void display() {
		System.out.println("A white colored duck");
	}

}
