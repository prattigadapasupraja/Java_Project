package assignment;

public class Functionoverloading {
	static int cal(int a, int b){return a+b;}  
	static long cal(double b, double h){return (long) (b*h);}
	public float cal(int r){return (float) (3.14*r*r);}
	public static void main(String[] args){
		Functionoverloading a=new Functionoverloading();
		int sum=a.cal(4,5 );
		float circle=a.cal(7);
		long rectangle=a.cal(4.3,5.4);
		System.out.println("Addition ="+sum);
		System.out.println("Area of circle="+circle);
		System.out.println("Area of rectangle="+rectangle);
		
	}

}
