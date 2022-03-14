package com.cg.spring;

public class Airtel implements Sim
{

	public Airtel()
	{
		System.out.println("Object of airtel created");
	}
	@Override
	public void calling() {
		System.out.println("Calling using airtel sim");
		
	}

	@Override
	public void data() {
		System.out.println("Brwosing internet  using airtel sim");
		
	}
}
