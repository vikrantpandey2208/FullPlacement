import RecursionClasses.FastIo;
import java.util.concurrent.TimeUnit;

class FactorialTail {
	static FastIo io;
	
	static int fact(int n, int k ) {
		if(n <= 1 ) return k;
		
		return fact(n -1 , k * n ) ;
	}
	
	// driver code
	public static void main(String args[]){
		
		io = new FastIo();
		
		io.println("enter Number ");
		int input = io.nextInt();
		long start = System.currentTimeMillis();
		
		int res = fact(input, 1);
		io.println("Factorial of number is : " + res);
		
		io.println("");
		io.println("Done Code Run in : " + TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis() - start) + " s.");
	}
}