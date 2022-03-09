package assisted_practice;
public class Diamond_Problem  implements Interfacedemo1, Interfacedemo2 {
	public void show() 
    {  
        Interfacedemo1.super.show(); 
        Interfacedemo2.super.show(); 
    } 
    public static void main(String args[]) 
    { 
    	Diamond_Problem ob = new Diamond_Problem(); 
        ob.show(); 
    } 
}
interface Interfacedemo1 {
	default void show() 
    { 
		System.out.println("Default Interface demo 1 method"); 
    } 
}
interface Interfacedemo2 {
	default void show() 
    { 
        System.out.println("Default Interface demo 2 method"); 
    } 
}