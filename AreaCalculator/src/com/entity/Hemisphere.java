package com.entity;

class Hemisphere extends Shapes {
	
	double r;
	public Hemisphere(double r) {
		super();
		this.r = r;
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
