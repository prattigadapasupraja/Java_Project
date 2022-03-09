package accessmodifier;

public class TestB extends TestA{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestA a=new TestA();
		a.methodpublic();
		a.methodprotected();
		a.methoddefault();
		System.out.println("value oflong="+new TestA().k);
	}
	public void methodpublic(){
		System.out.println("Class TestD: Public method");
	}
	protected void methodprotected(){
		System.out.println("Class TestD: Protected method");
	}
	 void methoddefault(){
		System.out.println("Class TestD: default method");
	}
	 private void methodprivate(){
			System.out.println("Class TestD: Private method");
		}
}
