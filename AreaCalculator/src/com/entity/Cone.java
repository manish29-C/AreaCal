package com.entity;

class Cone extends Shapes{
	
	double r; 
	double l;
	double pi;

	public Cone(double r, double l, double pi) {
		super();
		this.r = r;
		this.l = l;
		this.pi = pi;
	}

	@Override
	void findArea() {
	
		area=pi*r*(r*l);
	}

	@Override
	void dispArea() {
		System.out.println("Surface area of Cone is : "+area);
	}

}
