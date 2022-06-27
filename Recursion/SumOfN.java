import RecursionClasses.FastIo;
import java.util.concurrent.TimeUnit;

class SumOfN {
	static FastIo io;
	
	static int getSum(int n){
		if(n == 0 ) return 0 ;
		
		return n + getSum(n - 1);
	}
	
	// driver code
	public static void main(String args[]){
		
		io = new FastIo();
		
		io.println("enter Number ");
		int input = io.nextInt();
		long start = System.currentTimeMillis();
		
		int res = getSum(input);
		io.println("Sum of n number is : " + res);
		
		io.println("");
		io.println("Done Code Run in : " + TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis() - start) + " s.");
	}
}