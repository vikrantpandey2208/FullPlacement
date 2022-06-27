import RecursionClasses.FastIo;
import java.util.concurrent.TimeUnit;

class SumDigitRecursive {
	static FastIo io;
	
	static int digitSum(int n ){
		if(n == 0 ) return 0;
		
		return n % 10 + digitSum(n / 10 );
	}
	
	// driver code
	public static void main(String args[]){
		
		io = new FastIo();
		
		io.println("enter Number ");
		int input = io.nextInt();
		long start = System.currentTimeMillis();
		
		int res = digitSum(input);
		io.println("Sum of digits is : " + res);
		
		io.println("");
		io.println("Done Code Run in : " + TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis() - start) + " s.");
	}
}