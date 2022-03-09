package assisted_practice;
public class Matrices {
	public static void main(String[] args) {
		int r1 = 2, c1 = 3;
		int r2 = 3, c2 = 2;
		int[][] m1= { {3, -2, 5}, {3, 0, 4} };
		int[][] m2= { {2, 3}, {-9, 0}, {0, 4} };
		int[][] addition = addmatrices(m1, m2, r1, c1, c2);
		displayAddition(addition);

	}
	public static int[][] addmatrices(int[][] m1, int[][] m2, int r1, int c1, int c2) {
		int[][] addition = new int[r1][c2];
		for(int i = 0; i < r1; i++) 
		{
		   for (int j = 0; j < c2; j++) 
		{
		        addition[i][j]=m1[i][j]+m2[i][j];
		}
		}
		return addition;
	}
	public static void displayAddition(int[][] addition) {
		System.out.println("Addition of two matrices is: ");
		for(int[] row : addition) 
{
    			for (int column : row) 
{
        			System.out.print(column + "    ");
    			}
    			System.out.println();
		}

	}
}
