package package1;

import package1.M;
import package1.N;

public class P {
	public static void publicmethodP(){
		System.out.println("This package 1 public method of P class");
	}
	private static void privatemethodP(){
		System.out.println("This package 1 private method of P class");
	}
	 static void defaultmethodP() {
		 System.out.println("This package 1 default method of P class");
			
		}
		protected static void protectedmethodP() {
			System.out.println("This package 1 protected method of P class");
		}
	public static void main(String []args){
		M a=new M();
		N b=new N();
		a.methodpublic();
		b.methodpublic();
		
		
	}
   
}
