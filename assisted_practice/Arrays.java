package assisted_practice;
public class Arrays {
	public static void main(String[] args){
	int a[]={7,6,3,4};
	int b[]={4,9,7,2};
	int c[]=new int[4];
	for(int i=0;i<c.length;i++){
		c[i]=a[i]+b[i];
		 System.out.print(c[i]+" ");
    }
	System.out.println("");
	int d[][]={{1,2,3,4},{5,6,7,8}};
	int e[][]={{2,1,3,5},{9,4,7,3}};
	int f[][]=new int[2][2];
	for(int i=0;i<f.length;i++){
		for(int j=0;j<f.length;j++){
			f[i][j]=d[i][j]*e[i][j];
		System.out.print(f[i][j]+" ");
		}
	}
	}
}