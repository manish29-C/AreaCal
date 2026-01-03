package com.entity;

class Circle extends Shapes{
	
	double r;
	public Circle(double r) {
		this.r=r;
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