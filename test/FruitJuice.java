package test;
import java.util.*;
public class FruitJuice {
	int product_code;
	String flavour;
	String pack_type;
	int pack_size;
	int product_price;
	FruitJuice(){
		product_code=0;
		flavour="";
		pack_type="";
		pack_size=0;
		product_price=0;
	}
	void input(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Product code= ");
		product_code=sc.nextInt();
		System.out.println("Enter the flavour= ");
		flavour=sc.next();
		System.out.println("Enter the pack type= ");
		pack_type=sc.next();
		System.out.println("Enter the pack size= ");
		pack_size=sc.nextInt();
		System.out.println("Enter product price= ");
		product_price=sc.nextInt();
	}
	void discount(){
		product_price=product_price-10;
	}
	void display(){
		System.out.println("The value of product code is="+product_code);
		System.out.println("The value of flavour is="+flavour);
		System.out.println("The value of pack type is="+pack_type);
		System.out.println("The value of pack size is="+pack_size);
		System.out.println("The value of product price is="+product_price);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FruitJuice fj=new FruitJuice();
		fj.input();
		fj.discount();
		fj.display();
	}

}
