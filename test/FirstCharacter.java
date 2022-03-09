package test;
import java.util.Scanner;
public class FirstCharacter {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the String");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		int s=str.length();
		String w="";
		for(int i=0;i<=s-1;i++){
			if(str.charAt(i)==' '){
				w=w+str.charAt(i+1);
			}
		}
		System.out.println(str.charAt(0)+w);
	}

}
