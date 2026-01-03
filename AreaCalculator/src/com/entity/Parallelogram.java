package com.entity;

class Parallelogram extends Shapes{
	double b;
	double h;
	
	public Parallelogram(double b, double h) {
		this.b=b;
		this.h=h;
	}

	@Override
	void findArea() {
		area=b*h;
	}

	@Override
	void dispArea() {
		System.out.println("Area of Parallelogram is : "+area);
	}
}
