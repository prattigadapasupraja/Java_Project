package assisted_practice;
import java.util.Scanner;
public class Array_Of_String {
	public static void main(String[] args) {
		boolean x=false;
		String[] str=new String[4];
		System.out.println("Enter the String");
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<4;i++){
			str[i]=sc.next();
			}
		System.out.println("Enter the string to find");
		String s=sc.next();
		for(int i=0;i<str.length;i++){
			if(s.equals(str[i])){
				x=true;
				break;
			}
		}
		if(x){
			System.out.println(s+" is a String that you want to find");
		}
		else{
			System.out.println(s+" is not found in the given string");
		}
	}
}