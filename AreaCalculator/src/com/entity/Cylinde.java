package com.entity;

class Cylinder extends Shapes{
     
	double r;
	double h;
	
	public Cylinder(double r, double h) {
		this.r = r;
		this.h = h;
	}

	@Override
	void findArea() {
		area=2*pi*r*(r*h);
	}

	@Override
	void dispArea() {
		System.out.println("Surface Area of Cylinde is : "+area);
	}

}
