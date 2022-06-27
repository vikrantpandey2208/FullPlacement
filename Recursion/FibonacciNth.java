import RecursionClasses.FastIo;
import java.util.concurrent.TimeUnit;

class FibonacciNth {
	static FastIo io;
	
	static int fibonacci(int n ) {
		if( n <= 1 ) return n;
		
		return fibonacci(n - 1 ) + fibonacci( n - 2 ) ;
	}
	
	// driver code
	public static void main(String args[]){
		
		io = new FastIo();
		
		io.println("enter Number ");
		int input = io.nextInt();
		long start = System.currentTimeMillis();
		
		int res = fibonacci(input);
		io.println("Nth fibonacci number is : " + res);
		
		io.println("");
		io.println("Done Code Run in : " + TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis() - start) + " s.");
	}
}