import java.util.*;

abstract class Shape{
	int a,b;
	Shape(int x, int y){
		a=x;
		b=y;
	}

	abstract double printArea();
}

class Rectangle extends Shape{
	Rectangle(int length,int breadth){
		super(length,breadth);
	}

	double printArea(){
		return a*b;
	}
}

class Triangle extends Shape{
	Triangle(int length, int height){
		super(length,height);
	}

	double printArea(){
		return 0.5*a*b;
	}
}


class Circle extends Shape{
	Circle(int r){
		super(r,r);
	}

	double printArea(){
		return Math.PI*a*b;
	}
}


class AREA{
	public static void main(String args[]){

		Rectangle R=new Rectangle(10,20);
		Triangle T=new Triangle(15,30);
		Circle C=new Circle(5);

		Shape s;

		s=R;
		System.out.println("Area of the Rectangle : " +s.printArea());

		s=T;
		System.out.println("Area of the Triangle : " +s.printArea());

		s=C;
		System.out.println("Area of the Circle : " +s.printArea());
	}
}

