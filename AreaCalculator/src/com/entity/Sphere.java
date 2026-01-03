package com.entity;

class Sphere extends Shapes{
	
	double r;
	public Sphere(double r) {
		super();
		this.r = r;
	}

	@Override
	void findArea() {
		area=4*pi*r*r;
	}

	@Override
	void dispArea() {
		System.out.println("Surface area of Sphere is :"+area);
	}

}
