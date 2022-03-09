package assignment;
class Product{
	int id=78;
	String name="Amul";
	void display(){
		System.out.println(id+"  "+name);
	}
}
class A extends Product{
	int  count=50;
	String category="butter";
	void display(){
		System.out.println("ID: "+id+" Name: "+name+" Count: "+count+" Category: "+category);
	}
}
class B extends Product{
	int  count=90;
	String category="milk";
	void display(){
		System.out.println("ID: "+id+" Name: "+name+" Count: "+count+" Category: "+category);
	}
}
class C extends Product{
	int  count=56;
	String category="choco";
	void display(){
		System.out.println("ID: "+id+" Name: "+name+" Count: "+count+" Category: "+category);
	}
}
class SubA extends A{
	int price=30;
	void price(){
		int totalprice=count*price;
		System.out.println("price:"+totalprice);
		System.out.println("ID: "+id+" Name: "+name+" Count: "+count+" Category: "+category);
	}
}
class SubB extends B{
	int price=10;
	void price(){
		int totalprice=count*price;
		System.out.println("price:"+totalprice);
		System.out.println("ID: "+id+" Name: "+name+" Count: "+count+" Category: "+category);
	}
}
public class Assignment {
	public static  void main(String [] args){
		SubA a=new SubA();
		SubB b=new SubB();
		C c=new C();
		a.display();
		a.price();
		b.display();
		b.price();
		c.display();
	}
}