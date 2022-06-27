import RecursionClasses.FastIo;
import java.util.concurrent.TimeUnit;

class OneToNTail {
	static FastIo io;
	
	static void printOneToN(int n , int k ) {
		if(n == 0 ) return;
		
		io.print(k + " ");
		
		printOneToN(n - 1, k + 1);		
	}
	
	// driver code
	public static void main(String args[]){
		
		io = new FastIo();
		
		io.println("enter Number ");
		int input = io.nextInt();
		long start = System.currentTimeMillis();
		
		printOneToN(input, 1);
		
		io.println("");
		io.println("Done Code Run in : " + TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis() - start) + " s.");
	}
}