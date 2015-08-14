package com.marcotte.inheritance;

import javax.swing.JOptionPane;

public class SuperComputer extends Computer 
{
	// attributes
	private int numberOfProcessors;
	
	// constructors
	public SuperComputer() 
	{
		super();
		// set the child attribute
		numberOfProcessors = 0;
	}

	public SuperComputer(String brand, float speed, int numberOfProcessors) 
	{
		super(brand, speed);
		// set the child attribute
		setNumberOfProcessors(numberOfProcessors);
	}

	// behaviors
	@Override
	public void sayHello()
	{
		JOptionPane.showMessageDialog(null, "Hello from the SuperComputer object!");
	}

	@Override
	public String toString() {
		return "SuperComputer [brand=" + brand + ", speed=" + speed
				+ ", numberOfProcessors=" + numberOfProcessors + "]";
	}

	// accessors and mutators
	public int getNumberOfProcessors() {
		return numberOfProcessors;
	}

	public void setNumberOfProcessors(int numberOfProcessors) 
	{
		if(numberOfProcessors > 0)
			this.numberOfProcessors = numberOfProcessors;
		else
			this.numberOfProcessors = 0;
	}
	
}
