package assignment;
public class Shape {
	int side;
	double height,breadth;
	float radius;
	Shape(){
		System.out.println("This is Default Constructor");
	}
	Shape(int s){
		side=s;
	}
	Shape(double b,double h){
		breadth=b;
		height=h;
	}
	Shape(float r){
		radius=r;
	}
	int area(int s){return s*s;}
	long area(double b, double h){return (long) (b*h);}
	float area(double r){return (float) (3.14*r*r);}
	double area(float b,float h){return (0.5*b*h);}
	long area(long d1,long d2){return (long) (0.5*d1*d2);}
	public static void main(String[] args){
		Shape a=new Shape();
		System.out.println("Area of Square ="+a.area(4));
		System.out.println("Area of Circle="+a.area(7.2));
		System.out.println("Area of Rectangle="+a.area(4.3,5.4));
		System.out.println("Area of Triangle="+a.area(5.67,6.78));
		System.out.println("Area of Rhombus="+a.area(5.67,6.78));
	}
}