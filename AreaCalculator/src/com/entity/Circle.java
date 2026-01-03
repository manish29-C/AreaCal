package com.entity;

class Circle extends Shapes{
	
	double r;
	double pi;
	public Circle(double r, double pi) {
		this.r=r;
		this.pi=pi;
	}

	@Override
	void findArea() {
		area=pi*r*r;
	}

	@Override
	void dispArea() {
		System.out.println("Area of circle is : "+area);
	}
}