package assignment;
public abstract class MNC {
	abstract void method1();
	abstract void method2();
	public MNC(){
		System.out.println("This is constructor of MNC class and it is abstract");
	}
	void method(){System.out.println("This is MNC method");}
	abstract static class Infosys extends MNC{
		void method1() {
			System.out.println("This is method1 of the child class Infosys");
		}
	}
	static class  Hello extends Infosys {
		void method3(){
			System.out.println("This is method3 of the child class Hello");
		}
		void method1() {
			System.out.println("This is method1 from the abstract class ");
		}
		void method2() {
			System.out.println("This is method2 from the abstract class ");
		}
		}
	public static void main(String[] args) {
		MNC c=new Hello();
		Infosys i=new Hello();
		c.method();
		c.method1();
		c.method2();
		i.method();
		i.method1();
		i.method2();
	}
}
