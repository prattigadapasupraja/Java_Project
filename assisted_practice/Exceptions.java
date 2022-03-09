package assisted_practice;
public class Exceptions {
	void Division() throws ArithmeticException
    {
        int a=45,b=0,c;
        c = a / b;
        System.out.println("The result is : " + c);
    }
	public static void main(String [] args){
		int a=45,b=0,c;
		Exceptions T = new Exceptions();
        try
       {
           T.Division();
       }
       catch(ArithmeticException Ex)
       {
           System.out.println("Error : " + Ex.getMessage());
       }
        try
        {
            if(b==0)        
                throw(new ArithmeticException("Can't divide by zero."));
            else
            {
                c = a / b;
                System.out.println("The result is : " + c);
            }
        }
            catch(ArithmeticException Ex)
            {
                System.out.println("Error : " + Ex.getMessage());
            }
        finally
        {
            System.out.println("This is finally block ");
        }
        try
        { 
            throw new MyException("temp"); 
        } 
        catch (MyException ex) 
        { 
            System.out.println("Caught"); 
            System.out.println(ex.getMessage()); 
        } 


	}
}
class MyException extends Exception
{ 
    public MyException(String s) 
    { 
        super(s); 
    } 
} 
