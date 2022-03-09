package assisted_practice;
public class Try_Catch
{
    public static void main(String args[]) 
    {
        int[] arr= new int[3];
        try 
        {
            arr[9] = 3;
        }
        catch (ArrayIndexOutOfBoundsException e) 
        {
            System.out.println("Array index is out of bounds!"); 
        }
        finally 
        {
            System.out.println("The array is of size " + arr.length);
        }
    }
}
