package accessmodifier;

public class TestA {
	private int y=10;
	long k=1000;
	public void methodpublic(){
		methodprivate();
	}
	protected void methodprotected(){
		methodprivate();
	}
    void methoddefault(){
		methodprivate();
	}
    private void methodprivate(){
    	System.out.println("Class TestA :methodPrivate");
    	System.out.println("Value of private value y="+y);
    	System.out.println("Value of long k="+k);
    }

}
