package com.entity;

class Trapezium extends Shapes{
	
	double l1;
	double l2;
	double h;
	double half;

	public Trapezium(double l1, double l2, double h, double half) {
		this.l1 = l1;
		this.l2 = l2;
		this.h = h;
		this.half = half;
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