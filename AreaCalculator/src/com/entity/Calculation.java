package com.entity;

public class Calculation  implements BasicCalculation{
	
	double a;
	double b;
	double c;
	public Calculation(double a, double b) {
		this.a=a;
		this.b=b;
	}

	@Override
	public void add() {
		c=a+b;
		System.out.println("Addition is "+c);
		
	}

	@Override
	public void sub() {
		c=a-b;
		System.out.println("Sub is "+c);
		
	}

	@Override
	public void mul() {
		c=a*b;
		System.out.println("Mul is "+c);
		
	}

	@Override
	public void div() {
		c=a/b;
		System.out.println("div is "+c);
		
	}

	@Override
	public void mod() {
		c=a%b;
		System.out.println("Mod is "+c);
		
	}

}
