package programtest;

public class TypeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=100;
		System.out.println("This is integer value a="+a);
		long b=a;
		System.out.println("convert int to long using implicit b="+b);
		int c=(int)b;
		System.out.println("convert long to int using explicit c="+c);
		int e=259;
		System.out.println("New integer value is e="+e);
		byte d=(byte)e;
		System.out.println("convert int to byte using explicit d="+d);
		char f=(char)a;
		System.out.println("convert int to char using explicit f="+f);
		float g=b;
		System.out.println("convert long to float using implicit g="+g);
		float h=78.67f;
		long i=(long)h;
		System.out.println("convert long to float using explicit i="+i);
		double j=18.99992828227;
		float k=(float)j;
		System.out.println("convert double to float using explicit k="+k);
		
		
	}

}
