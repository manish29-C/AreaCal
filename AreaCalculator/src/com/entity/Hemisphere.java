package com.entity;

class Hemisphere extends Shapes {
	
	double r;
	double pi;
	

	public Hemisphere(double r, double pi) {
		super();
		this.r = r;
		this.pi = pi;
	}

	@Override
	void findArea() {
		area=3*pi*r*r;
		
	}

	@Override
	void dispArea() {
		System.out.println("Surface area of Hemisphere is : "+area);
	}

}
