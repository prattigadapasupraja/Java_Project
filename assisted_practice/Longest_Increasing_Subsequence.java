package assisted_practice;
public class Longest_Increasing_Subsequence {
static int max_ref; // stores the LIS
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
		if (max_ref < max_ending_here)
			max_ref = max_ending_here;
		return max_ending_here;
	}
	static int lis(int arr[], int n)
	{
		max_ref = 1;
		_lis(arr, n);
		return max_ref;
	}
	public static void main(String args[])
	{
		int arr[] = { 1,5,8,20,11,12,13,87,95,16,60,25,64,78,92,84,62,15 };
		int n = arr.length;
		System.out.println("Length of lis is " + lis(arr, n)+ "\n");
	}
}
