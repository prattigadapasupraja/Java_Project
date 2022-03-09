package package1;
public class N {
	protected  long d=3145;
	public  int e=12;
	double f=56.7865;
	public void methodpublic(){
		System.out.println("protected value of long d="+d);
		System.out.println("public  value of int e="+e);
		System.out.println("default value of double f="+f);
	}
	public void publicmethodN(){
		System.out.println("This is package1 N class public method");
	}
	protected void protectedmethodN(){
		System.out.println("This is package1 N class protected method");
	}
    void defaultmethodN(){
    	System.out.println("This is package1 N class default method");
	}
    private void privatemethodN(){
    	System.out.println("This is package1 N class private method");
    }
}
