package org.itpfus.comAssignment;

public abstract class ParentDuck {

	private int age;
	private float weight;
	private String color; 
	// generate Getters and Setters method by Right click on the screen, goto Source> Generate Getters & Setters
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		// now we can modify here, these function operate on the data( by age and also hidden to other)
		// they are bonding together, this call encapsulation, data is hidden and operate by Function 
		if(age<=0 || age>30) {
			age=1;
		}
		this.age = age;
	}
	public float getWeight() {
		
		return weight;
	}
	public void setWeight(float weight) {
		
		if(weight<=0 || weight>50) {
			weight=1;
		}
		this.weight = weight;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	// now create three method for public( quack, fly, display), when we're using abstract keyword, 
	//than we don't need body for the method
	public  abstract void quack();
	
	public abstract void fly();
	
	public abstract void display();
}