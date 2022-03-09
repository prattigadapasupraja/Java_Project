package test;

import java.util.Scanner;

public class Employee {
	String name;
	int bas;
	int expn;
	double inc;
	double nbas;
	void grade_revision(){
		name="";
		bas=0;
		expn=0;
		inc=0.0;
		nbas=0.0;
	}
	void accept(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Name of the employee:");
		name=sc.next();
		System.out.println("Enter the basic salary");
		bas=sc.nextInt();
		System.out.println("Enter the Experience");
		expn=sc.nextInt();
	}
	void increment(){
		if(expn<=3){
			inc=1000+(10%bas);
			nbas=inc+bas;
		}
		else if(expn<=5){
			inc=3000+(12%bas);
			nbas=inc+bas;
		}
		else if(expn<=10){
			inc=5000+(15%bas);
			nbas=inc+bas;
		}
		else{
			inc=8000+(20%bas);
			nbas=inc+bas;
		}
	}
	void display(){
		System.out.println("The name of the employee is:"+name);
		System.out.println("The basic salary of the employee is:"+bas);
		System.out.println("The experience of the employee is:"+expn);
		System.out.println("The increment of the employee is:"+inc);
		System.out.println("The new basic salary of the employee is:"+nbas);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e=new Employee();
		e.accept();
		e.increment();
		e.display();
	}

}
