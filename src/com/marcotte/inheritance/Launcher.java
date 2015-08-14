package com.marcotte.inheritance;

public class Launcher {

	public static void main(String[] args) 
	{
		// create a computer and a super computer
		Computer comp = new Computer("Custom", 3.5f);
		SuperComputer sup = new SuperComputer("IBM", 1.6f, 1568000);
		
		// display the states of the objects
		System.out.println(comp);	// toString is implied here
		System.out.println(sup);
		
		// exit gracefully
		System.exit(0);

	}

}
