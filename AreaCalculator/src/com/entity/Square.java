package com.entity;

class Square extends Shapes{
	int r;
	public Square(int r) {
		this.r=r;
	}

	@Override
	void findArea() {
		area=r*r;
	}

	@Override
	void dispArea() {
		System.out.println("Area of Square : "+area);
	}
}
