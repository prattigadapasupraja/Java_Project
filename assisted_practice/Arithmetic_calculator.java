package assisted_practice;
import java.util.Scanner;
public class Arithmetic_calculator {
	public static void main(String[] args){
		char operator;
		Scanner sc=new Scanner(System.in);
		System.out.println("Choose an operator: +, -, *, or /");
		operator = sc.next().charAt(0);
		System.out.println("Enter first number");
	    int number1 = sc.nextInt();
	    System.out.println("Enter second number");
	    int number2 = sc.nextInt();
	    if(operator=='+'){
	    	int result = number1 + number2;
	        System.out.println(number1 + " + " + number2 + " = " + result);
	    }
	    else if(operator=='-'){
	    int result = number1 - number2;
        System.out.println(number1 + " + " + number2 + " = " + result);
	    }
	    else if(operator=='*'){
	    	int result = number1 * number2;
	        System.out.println(number1 + " + " + number2 + " = " + result);
	    }
	    else if(operator=='/'){
	    	int result = number1 / number2;
	        System.out.println(number1 + " + " + number2 + " = " + result);
	    }
	    else{
	    	System.out.println("Invalid option");
	    }
	}
}