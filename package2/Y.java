package package2;
import package1.N;
import package2.X;
import package1.M;

public class Y extends N{
	public static void main(String []args){
		M a=new M();
		Y b=new Y();
		X c=new X();
		a.methodpublic();
		a.publicmethodM();
		b.methodpublic();
		b.protectedmethodN();
		b.publicmethodN();
		c.method1();
		System.out.println("End of method of X class, Now started of caling variables");
		System.out.println("protected float r="+c.r);
		System.out.println("long u="+c.u);
		System.out.println("public char q="+c.q);
	}
}
