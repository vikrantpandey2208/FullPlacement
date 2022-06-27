import RecursionClasses.FastIo;
import java.util.concurrent.TimeUnit;

class {
	static FastIo io;
	
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