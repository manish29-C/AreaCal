package com.entity;

class Sphere extends Shapes{
	
	double r;
	double pi;

	public Sphere(double r, double pi) {
		super();
		this.r = r;
		this.pi = pi;
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
