import RecursionClasses.FastIo;
import java.util.concurrent.TimeUnit;

class Factorial {
	static FastIo io;
	
	static int fact(int n ) {
		if(n <= 1 ) return 1;
		
		return n * fact(n - 1 );
	}
	
	// driver code
	public static void main(String args[]){
		
		io = new FastIo();
		
		io.println("enter Number ");
		int input = io.nextInt();
		long start = System.currentTimeMillis();
		
		int res = fact(input);
		io.println("Factorial of number is : " + res);
		
		io.println("");
		io.println("Done Code Run in : " + TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis() - start) + " s.");
	}
}