import RecursionClasses.FastIo;

class Subset{
	static FastIo io;
	
	private static int subsetSum(int arr[], int n, int sum){
		if(n == 0 )
			return (sum == 0 ) ? 1 : 0;
		
		return subsetSum(arr, n-1, sum) +
				subsetSum(arr, n-1, sum- arr[n-1]);
	}
	
	// driver code
	public static void main(String args[]){
		io = new FastIo();
		int [] arr = {5, 2, 7, 8, 3};
		io.println("enter sum v2");
		int sum = io.nextInt();
		int count = subsetSum(arr, arr.length, sum);
		
		io.println("count is : " +count);
		io.println("Done Code Run");
	}
}