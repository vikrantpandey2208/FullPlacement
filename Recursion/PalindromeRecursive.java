
import RecursionClasses.FastIo;
import java.util.concurrent.TimeUnit;

class PalindromeRecursive {
	static FastIo io;
	
	static boolean check(String str, int start, int end) {
		if(start >= end ) return true;
		
		return str.charAt(start)== str.charAt(end) &&
				check(str, start + 1, end - 1);
	}
	
	// driver code
	public static void main(String args[]){
		
		io = new FastIo();
		
		io.println("enter String ");
		String str = io.next();
		long start = System.currentTimeMillis();
		
		io.println("Given string is palindrome : " + check(str, 0 , str.length() -1 ));
		
		io.println("");
		io.println("Done Code Run in : " + TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis() - start) + " s.");
	}
}