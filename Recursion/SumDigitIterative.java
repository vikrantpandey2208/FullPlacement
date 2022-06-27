import RecursionClasses.FastIo;
import java.util.concurrent.TimeUnit;

class SumDigitIterative {
	static FastIo io;
	
	static int digitSum(int n){
		int res = 0;
		while (n > 0 ){
			res += n %10;
			n /= 10;
		}
		return res;
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