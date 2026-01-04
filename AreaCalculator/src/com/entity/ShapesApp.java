package com.entity;

import java.util.Scanner;



public class ShapesApp {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("what type of calculation is calculate");
		System.out.println("1.Basic Calculation");
		System.out.println("2.2D Area Calculation");
		System.out.println("3.3D Area Calculation");
		int cal=sc.nextInt();
		
		if(cal==1) {
			System.out.println("Enter a and b");
		     double a=sc.nextDouble();
		     double b=sc.nextDouble();
			System.out.println("Enter operator");
			char op=sc.next().charAt(0);
			disp(new Calculation(a,b),op);
			
		}else if(cal==2) {
			System.out.println("What type of shape to calculate area");
			System.out.println("1.Square");
			System.out.println("2.Circle");
			System.out.println("3.Ellipse");
			System.out.println("4.Parallelogram");
			System.out.println("5.Rectangle");
			System.out.println("6.Trapezium");
			System.out.println("7.Triangle");
			int choice=sc.nextInt();
			twoDArea(choice);
		}else if(cal==3) {
			System.out.println("What type of shape to calculate area");
			System.out.println("1.Cone");
			System.out.println("2.Cube");
			System.out.println("3.Cylinder");
			System.out.println("4.Sphere");
			System.out.println("5.Hemisphere");
			int choice=sc.nextInt();
			threeDArea(choice);
		}else {
			System.out.println("Please enter correct number");
		}
	}
	static void display(Shapes s) {
		s.findArea();
		s.dispArea();
	}
	static void twoDArea(int choice) {
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
			System.out.println("Enter a and b");
			int aa=sc.nextInt();
			int bbb=sc.nextInt();
			display(new Ellipse(aa,bbb));
			break;
		
		case 4:
			System.out.println("Enter breadth and height");
			double bread=sc.nextDouble();
			double heig=sc.nextDouble();
			display(new Parallelogram(bread,heig));
			break;
		case 5:
			System.out.println("Enter len and brea ");
			double ll=sc.nextDouble();
			double bb=sc.nextDouble();
			display(new Rectangle(ll,bb));
			break;
		
		case 6:
			System.out.println("Enter len1, len2 and height");
			double l1=sc.nextDouble();
			double l2=sc.nextDouble();
			double h=sc.nextDouble();
			display(new Trapezium(l1,l2,h));
			break;
		
		case 7:
			System.out.println("Enter length and breadth");
			double l=sc.nextDouble();
			double b=sc.nextDouble();
			display(new Traingle(l,b));
			break;
			
		default:
			System.out.println("Invalid");
		}
	}
	
	static void threeDArea(int choice) {
		Scanner sc=new Scanner(System.in);
		switch(choice) {
		case 1:
			System.out.println("Enter radius and len");
			double rad=sc.nextDouble();
			double len=sc.nextDouble();
			display(new Cone(rad,len));
			break;
		case 2:
			System.out.println("Enter side ");
			double side=sc.nextDouble();
			display(new Cube(side));
			break;
		case 3:
			System.out.println("Enter radius and height");
			double radius=sc.nextDouble();
			double height=sc.nextDouble();
			display(new Cylinder(radius, height));
			break;
		case 4:
			System.out.println("Enter the radius");
			double radius2=sc.nextDouble();
			display(new Sphere(radius2));
			break;
		case 5:
			System.out.println("Enter radius ");
			double radius1=sc.nextDouble();
			display(new Hemisphere(radius1));
			break;
		default:
			System.out.println("Invalid");
		
		}
	}
	static void disp(BasicCalculation c, char op) {
  	  switch(op) {
  	  case '+':
  		  c.add();
  		  break;
  	  case '-':
  		  c.sub();
  		  break;
  	  case '*':
  		  c.mul();
  		  break;
  	  case '/':
  		  c.div();
  		  break;
  	   default:
  		   System.out.println("Invalid");
  	  }
    }
}
