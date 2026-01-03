package com.entity;

class Trapezium extends Shapes{
	
	double l1;
	double l2;
	double h;

	public Trapezium(double l1, double l2, double h) {
		this.l1 = l1;
		this.l2 = l2;
		this.h = h;
	}

	@Override
	void findArea() {
		area=half*(l1*l2)*h;
	}

	@Override
	void dispArea() {
		System.out.println("Area of Trapezium is : "+area);
	}
}