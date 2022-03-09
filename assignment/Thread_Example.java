package assignment;
public class Thread_Example {
	public static void main(String[] args) {
		Example obj=new Example();
		MyThread1 t1=new MyThread1(obj);  
		MyThread2 t2=new MyThread2(obj);
		MyThread3 t3=new MyThread3(obj);
		MyThread4 t4=new MyThread4(obj);
		t2.start();  
		t4.start();
		t1.start();  
		t3.start();
	}
}
class  Example{
	synchronized void factorial(int number){
		 int i,fact=1;  
		  for(i=1;i<=number;i++){    
		      fact=fact*i;
		  }
		  System.out.println("Factorial of number: "+fact);
		  try{  
		      Thread.sleep(400);  
		     }catch(Exception e){System.out.println(e);}  
	}
	synchronized void add(int a,int b){
		int c=a+b;
		System.out.println("The addition of number: "+c);
		try{  
		      Thread.sleep(400);  
		     }catch(Exception e){System.out.println(e);}  
	}
}
class MyThread1 extends Thread{ 
	Example t1;
	MyThread1(Example t){  
		this.t1=t;  
	}  
	public void run(){  
	t1.factorial(4); 
	}  
}
class MyThread2 extends Thread{ 
	Example t2;
	MyThread2(Example t){  
		this.t2=t;  
	}  
	public void run(){  
	t2.factorial(6); 
	}  
}
class MyThread3 extends Thread{ 
	Example t3;
	MyThread3(Example t){  
		this.t3=t;  
	}  
	public void run(){  
	t3.add(4,5); 
	}  
}
class MyThread4 extends Thread{ 
	Example t4;
	MyThread4(Example t){  
		this.t4=t;  
	}  
	public void run(){  
	t4.add(20,10); 
	}  
}
