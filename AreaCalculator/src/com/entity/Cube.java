package com.entity;

class Cube extends Shapes {
	double a;
	public Cube(double a) {
		this.a=a;
	}

	@Override
	void findArea() {
		area=6*a*a;
	}

	@Override
	void dispArea() {
		System.out.println("Surface Area of Cube is : "+area);

	}

}
