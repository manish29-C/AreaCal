package com.entity;

import java.util.Scanner;

public class ShapesApp {
	static double pi=3.14;
	static double half=0.5;

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("What type of shape to calculate area ");
		String find=sc.next();
		
		switch(find) {
		case "square":
			System.out.println("Enter side of square ");
			int a=sc.nextInt();
			display(new Square(a));
			break;
		case "traingle":
			System.out.println("Enter length and breadth");
			double l=sc.nextDouble();
			double b=sc.nextDouble();
			display(new Traingle(l,b,half));
			break;
		case "circle":
			System.out.println("Enter radius of circle");
			double r=sc.nextDouble();
			display(new Circle(r,pi));
			break;
		case "rectangle":
			System.out.println("Enter len and brea ");
			double ll=sc.nextDouble();
			double bb=sc.nextDouble();
			display(new Rectangle(ll,bb));
			break;
		case "trapezium":
			display(new Trapezium(4.2,4.9,6,half));
			break;
		case "cone":
			display(new Cone(5.2,7.8,pi));
			break;
		case "cube":
			display(new Cube(6));
			break;
		case "cylinder":
			display(new Cylinder(6.3,8.4,pi));
			break;
		case "ellipse":
			display(new Ellipse(4,5));
			break;
		case "hemisphere":
			display(new Hemisphere(4.2,pi));
			break;
		case "parallelogram":
			display(new Parallelogram(4.5,9));
		default:
			System.out.println("Invalid");
		}
	}
	
	static void display(Shapes s) {
		s.findArea();
		s.dispArea();
	}
	

}
