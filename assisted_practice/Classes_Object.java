package assisted_practice;

import assignment.Student;

public class Classes_Object {
	String name;
	int age;
	char section,gender;
	Classes_Object(String n,int a,char sec,char gen){
		name=n;
		age=a;
		section=sec;
		gender=gen;
	}
	void display(){
		System.out.println("Name of student="+name);
		System.out.println("Age of student="+age);
		System.out.println("Section of student="+section);
		System.out.println("Gender of the student="+gender);
	}
	public static void main(String[] args) {
		Classes_Object s1=new Classes_Object("siva",20,'A','M');
		s1.display();
	}
}
