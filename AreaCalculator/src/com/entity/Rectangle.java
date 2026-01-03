package com.entity;

class Rectangle  extends Shapes{
	
	double l;
	double b;
	public Rectangle(double l,double b) {
		this.l=l;
		this.b=b;
	}

	@Override
	void findArea() {
		area=l*b;
	}

	@Override
	void dispArea() {
		System.out.println("Area of Rectangle : "+area);
	}
}
