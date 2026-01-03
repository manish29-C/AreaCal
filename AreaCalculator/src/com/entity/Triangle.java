package com.entity;

class Traingle extends Shapes{
	double length;
	double  breadth;
	public Traingle(double length, double breadth) {
		this.length=length;
		this.breadth=breadth;
	}

	@Override
	void findArea() {
		area=half*length*breadth;
	}

	@Override
	void dispArea() {
		System.out.println("Area of Traingle is : "+area);
	}
}