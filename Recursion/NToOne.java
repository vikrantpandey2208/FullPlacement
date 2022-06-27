import RecursionClasses.FastIo;
import java.util.concurrent.TimeUnit;

class NToOne {
	static FastIo io;
	
	static void printNtoOne( int n) {
		if(n == 0 ) return;
		
		io.print(n + " ");
		printNtoOne(n - 1);
	}
	
	// driver code
	public static void main(String args[]){
		
		io = new FastIo();
		io.println("enter Number ");
		int input = io.nextInt();
		long start = System.currentTimeMillis();
		
		printNtoOne(input);
		
		io.println("");
		io.println("Done Code Run in : " + TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis() - start) + " s.");
	}
}