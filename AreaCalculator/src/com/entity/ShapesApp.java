package com.entity;

import java.util.Scanner;

public class ShapesApp {
	static double pi=3.14;
	static double half=0.5;

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("What type of shape to calculate area");
		System.out.println("1.Square");
		System.out.println("2.Circle");
		System.out.println("3.Cone");
		System.out.println("4.Cube");
		System.out.println("5.Cylinder");
		System.out.println("6.Ellipse");
		System.out.println("7.Hemisphere");
		System.out.println("8.Parallelogram");
		System.out.println("9.Rectangle");
		System.out.println("10.Sphere");
		System.out.println("11.Trapezium");
		System.out.println("12.Triangle");
		
		int choice=sc.nextInt();
		find(choice);
		
	}
	
	static void display(Shapes s) {
		s.findArea();
		s.dispArea();
	}
	
	static void find(int choice) {
		Scanner sc=new Scanner(System.in);
		switch(choice) {
		case 1:
			System.out.println("Enter side of square ");
			int a=sc.nextInt();
			display(new Square(a));
			break;
		case 2:
			System.out.println("Enter radius of circle");
			double r=sc.nextDouble();
			display(new Circle(r));
			break;
		case 3:
			System.out.println("Enter radius and len");
			double rad=sc.nextDouble();
			double len=sc.nextDouble();
			display(new Cone(rad,len));
			break;
		case 4:
			System.out.println("Enter side ");
			double side=sc.nextDouble();
			display(new Cube(side));
			break;
		case 5:
			System.out.println("Enter radius and height");
			double radius=sc.nextDouble();
			double height=sc.nextDouble();
			display(new Cylinder(radius, height));
			break;
		case 6:
			System.out.println("Enter a and b");
			int aa=sc.nextInt();
			int bbb=sc.nextInt();
			display(new Ellipse(aa,bbb));
			break;
		case 7:
			System.out.println("Enter radius ");
			double radius1=sc.nextDouble();
			display(new Hemisphere(radius1));
			break;
		case 8:
			System.out.println("Enter breadth and height");
			double bread=sc.nextDouble();
			double heig=sc.nextDouble();
			display(new Parallelogram(bread,heig));
			break;
		case 9:
			System.out.println("Enter len and brea ");
			double ll=sc.nextDouble();
			double bb=sc.nextDouble();
			display(new Rectangle(ll,bb));
			break;
		case 10:
			System.out.println("Enter the radius");
			double radius2=sc.nextDouble();
			display(new Sphere(radius2));
		case 11:
			System.out.println("Enter len1, len2 and height");
			double l1=sc.nextDouble();
			double l2=sc.nextDouble();
			double h=sc.nextDouble();
			display(new Trapezium(l1,l2,h));
			break;
		
		case 12:
			System.out.println("Enter length and breadth");
			double l=sc.nextDouble();
			double b=sc.nextDouble();
			display(new Traingle(l,b));
			break;
			
		default:
			System.out.println("Invalid");
		}
	}
	

}
