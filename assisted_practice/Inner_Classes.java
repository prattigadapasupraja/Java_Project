package assisted_practice;
public class Inner_Classes {
	private String msg="Welcome to Java"; 
	 class Inner{  
	  void hello(){System.out.println(msg+", Let us start learning Inner Classes");}
	 } 
	 private String msg1="Inner Classes";
	 void display1(){
		 class Inner{
			 void msg(){
				 System.out.println(msg);
			 }
		 }
		  Inner l=new Inner();  
		  l.msg();  
	 } 
public static void main (String [] args){
	Inner_Classes obj=new Inner_Classes();
	Inner_Classes.Inner ic=obj.new Inner();  
	ic.hello();
	obj.display1();
	AnonymousInnerClass aic=new AnonymousInnerClass(){
		public void display() {
			System.out.println("Anonymous Inner Class");
		}};
		aic.display();
}
}
abstract class AnonymousInnerClass {
	 public abstract void display();
}