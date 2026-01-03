package com.entity;

class Traingle extends Shapes{
	double length;
	double  breadth;
	double half;
	public Traingle(double length, double breadth,double half ) {
		this.length=length;
		this.breadth=breadth;
		this.half=half;
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