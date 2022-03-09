package assisted_practice;
public class Methods {
	public int addition(int a,int b) {
		int z=a+b;
		return z;
	}
	public void area(int b,int h)
    {
         System.out.println("Area of Rectangle : "+(b*h));
    }
    public void area(int s) 
    {
         System.out.println("Area of Square : "+(s*s));
    }
	int val=150;
	int operation(int val) {
		val =val*10/100;
		return(val);
		}
	public static void main(String[] args) {
		Methods b=new Methods();
		int ans= b.addition(10,3);
		System.out.println("Addition of two numbers="+ans);
		System.out.println("The value of the operation method="+b.val);
		b.area(7,7);
		b.area(7);
	}
}