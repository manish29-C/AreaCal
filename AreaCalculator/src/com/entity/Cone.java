package com.entity;

class Cone extends Shapes{
	
	double r; 
	double l;
	public Cone(double r, double l) {
		super();
		this.r = r;
		this.l = l;
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
