package practice_project;
public class Longest_Increasing_Subsequence {
	static int max_reference;
	static int _lis(int arr[], int n)
	{
		if (n == 1)
			return 1;
		int res, max_ending_here = 1;
		for (int i = 1; i < n; i++) {
			res = _lis(arr, i);
			if (arr[i - 1] < arr[n - 1]
				&& res + 1 > max_ending_here)
				max_ending_here = res + 1;
		}		
		if (max_reference < max_ending_here)
			max_reference = max_ending_here;
		return max_ending_here;
	}
	static int lis(int arr[], int n)
	{
		max_reference = 1;
		_lis(arr, n);
		return max_reference;
	}
	public static void main(String args[])
	{
		int arr[] = { 1,5,8,20,11,16,60,25,64,78,92,84,62,15 };
		int n = arr.length;
		System.out.println("\t");
		System.out.println("Length of long Increasing Subsequence is " + lis(arr, n)+ "\n");
	}
}