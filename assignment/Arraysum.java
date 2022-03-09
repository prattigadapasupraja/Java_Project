package assignment;
public class Arraysum {
	public static void main(String args[]) {
		int a[]={7,6,3,4};
		int b[]={4,9,7,2};
		int c[]=new int[4];
		for(int i=0;i<c.length;i++){
			c[i]=a[i]+b[i];
			 System.out.println(c[i]);
	    }
	}
}
