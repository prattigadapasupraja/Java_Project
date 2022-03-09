package test;
import java.util.Scanner;
public class Strings {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String:");
		String s=sc.nextLine();
		String str=s.toUpperCase();
		int len=str.length();
		int count = 0;
		for(int i=0;i<len-1;i++){
			if(str.charAt(i)==str.charAt(i+1))
				 count++;
		}
		System.out.println("The upper case of the string is: \n"+str);
		System.out.println("double letter sequences of the string is: "+count);
	}

}
