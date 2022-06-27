import RecursionClasses.FastIo;
import java.util.concurrent.TimeUnit;

class OneToN {
	static FastIo io;
	
	static void printOneToN(int n ) {
		if(n == 0 ) return;
		
		printOneToN(n - 1);
		io.print(n + " ");
	}
	
	// driver code
	public static void main(String args[]){
		
		io = new FastIo();
		
		io.println("enter Number ");
		int input = io.nextInt();
		long start = System.currentTimeMillis();
		
		printOneToN(input);
		
		io.println("");
		io.println("Done Code Run in : " + TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis() - start) + " s.");
	}
}