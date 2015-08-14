package com.marcotte.inheritance;

import javax.swing.JOptionPane;

public class Computer 
{
	// attributes
	protected String brand;
	protected float speed;
	
	// constructors
	public Computer() 
	{
		super();
		brand = "unknown";
		speed = 0;
	}

	public Computer(String brand, float speed) 
	{
		super();
		this.setBrand( brand );
		this.setSpeed( speed );
	}
	
	// behaviors
	public void sayHello()
	{
		JOptionPane.showMessageDialog(null, "Hello from the Computer object!");
	}
	
	@Override
	public String toString() {
		return "Computer [brand=" + brand + ", speed=" + speed + "]";
	}

	// accessors and mutators
	public String getBrand() 
	{
		return brand;
	}


	public void setBrand(String brand) 
	{
		if(brand.length() > 0)
			this.brand = brand;
		else
			this.brand = "unknown";
	}

	public float getSpeed() 
	{
		return speed;
	}


	public void setSpeed(float speed) 
	{
		if(speed>0)
			this.speed = speed;
		else
			this.speed = 0.0f;
	}
	
}
