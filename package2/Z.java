package package2;

import package1.M;
import package1.N;
import package1.P;
import package2.X;

public class Z extends M {

	public static void main(String[] args) {
		Z e=new Z();
		N b=new N();
		P c=new P();
		X d=new X();
		e.protectedmethodM();
		e.publicmethodM();
		b.publicmethodN();
		P.publicmethodP();
		d.method1();
	}

}
