package assignment;
public class Student {
	String name;
	int age,subject1=0,subject2,subject3;
	char section,gender;
	Student(String name1,int age1,char sec,char gen,int s1,int s2,int s3){
		name=name1;
		age=age1;
		section=sec;
		gender=gen;
		subject1=s1;
		subject2=s2;
		subject3=s3;
	}
	Student(String name1,int age1,char sec,char gen,int s2,int s3){
		name=name1;
		age=age1;
		section=sec;
		gender=gen;
		subject2=s2;
		subject3=s3;
	}
	void display(){
		System.out.println("Name of student="+name);
		System.out.println("Age of student="+age);
		System.out.println("Section of student="+section);
		System.out.println("Gender of the student="+gender);
		System.out.println("Subject1 marks of the student="+subject1);
		System.out.println("Subject2 marks of the student="+subject2);
		System.out.println("Subject3 marks of the student="+subject3);
	}
	int add(int a,int b,int c){
		return a+b+c;
	}
	float avg(int a,int b,int c){
		return (a+b+c)/3;
	}
	public static void main(String[]args){
		Student s1=new Student("siva",20,'A','M',87,96,87);
		s1.display();
		System.out.println("Total marks of student="+s1.add(80, 90, 88));
		System.out.println("Average marks of student="+s1.avg(80, 90, 88));
		Student s2=new Student("ram",20,'A','M',50,40);
		s2.display();
		System.out.println("Total marks of student="+s2.add(0,50,40));
		System.out.println("Average marks of student="+s2.avg(0,50,40));
		Student s3=new Student("krishna",20,'A','M',60,50);
		s3.display();
		System.out.println("Total marks of student="+s3.add(0,60,50));
		System.out.println("Average marks of student="+s3.avg(0,60,50));
		Student s4=new Student("vishnu",20,'A','M',89,90,80);
		s4.display();
		System.out.println("Total marks of student="+s2.add(70, 80, 90));
		System.out.println("Average marks of student="+s2.avg(70, 80, 90));
	}
}