package com.cg.spring;

public class Vodaphone implements Sim{
	@Override
	public void calling() {
		System.out.println("Calling using vodaphone sim");
		
	}

	@Override
	public void data() {
		System.out.println("Brwosing internet  using vodaphone sim");
		
	}
}
