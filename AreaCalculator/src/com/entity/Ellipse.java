package com.entity;

class Ellipse extends Shapes{

	int a;
	int b;
	
	public Ellipse(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}

	@Override
	void findArea() {
		area=a*b;
	}

	@Override
	void dispArea() {
		System.out.println("Area of Ellipse is "+area);
	}
}