package assisted_practice;
public class Exception_Handling {
	public static void main(String[] args){
		try{
			System.out.println("Starting of try block");
			throw new MyException1("This is My error Message");
		}
		catch(MyException1 exp){
			System.out.println("Catch Block") ;
			System.out.println(exp) ;
		}

	}
}
class MyException1 extends Exception{
	   String str1;
	   MyException1(String str2) {
		str1=str2;
	   }
	   public String toString(){ 
		return ("MyException Occurred: "+str1) ;
	   }
	}
