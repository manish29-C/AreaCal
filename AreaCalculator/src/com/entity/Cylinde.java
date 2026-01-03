package com.entity;

class Cylinder extends Shapes{
     
	double r;
	double h;
	double pi;
	
	public Cylinder(double r, double h,double pi) {
		this.r = r;
		this.h = h;
		this.pi=pi;
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
