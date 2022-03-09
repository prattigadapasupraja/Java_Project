package assisted_practice;
public class Data_types {
	public static void main(String[] args) {
		String s="12345";
		System.out.println("Convert String to other primitive data types");
		System.out.println("Converting Implicitly");
		int a=Integer.parseInt(s);
		System.out.println("Converting string to int="+a);
		long b=a;
		System.out.println("Converting int to long="+b);
		float c=a;
		System.out.println("Converting long to float="+c);
		double d=a;
		System.out.println("Converting float to double="+d);
		double de=576.864568765;
		System.out.println("Converting Explicitly");
		float e=(float) de;
		System.out.println("Converting double to float="+e);
		long f=(long) e;
		System.out.println("Converting float to long="+f);
		int g=(int) f;
		System.out.println("Converting long to int="+g);
		byte h=(byte) g;
		System.out.println("Converting int to byte="+h);
	}
}
