package assignment;

public class Stringbuffer {

	public static void main(String[] args) {
		StringBuffer b=new StringBuffer("started java ");
		b.append("Phase1");
		System.out.println(b);
		b.delete(2, 5);
		System.out.println(b);
		b.replace(5, 9, "python");
		System.out.println(b);
		b.insert(11, "language");
		System.out.println(b);
		b.reverse();
		System.out.println(b);
		System.out.println(b.charAt(7));
	}

}
