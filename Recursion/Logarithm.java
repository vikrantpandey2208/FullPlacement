import RecursionClasses.FastIo;
import java.util.concurrent.TimeUnit;

class Logarithm {
	static FastIo io;
	
	static int log( int n ,int base ) {
		if(n == 1 ) return 0;
		
		return  1 + log(n / base, base);
	}
	
	// driver code
	public static void main(String args[]){
		
		io = new FastIo();
		
		io.println("enter Number and base ");
		int input = io.nextInt();
		long start = System.currentTimeMillis();
		
		int res = log(input, io.nextInt());
		io.println("Log of number is : " + res);
		
		io.println("");
		io.println("Done Code Run in : " + TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis() - start) + " s.");
	}
}