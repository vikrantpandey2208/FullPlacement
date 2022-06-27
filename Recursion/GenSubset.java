import RecursionClasses.FastIo;
import java.util.concurrent.TimeUnit;

class GenSubset{
	static FastIo io;
	
	static void generate(String str, String curr, int index){
		if( index == str.length() ){
			io.print("\"" + curr + "\"  ");
			return;
		}
		
		generate(str, curr, index + 1 );
		generate(str, curr + str.charAt(index), index + 1 );
	}
	
	// driver code
	public static void main(String args[]){
		
		io = new FastIo();
		
		io.println("enter String ");
		String str = io.next();
		long start = System.currentTimeMillis();
		generate(str, "" , 0);
		
		io.println("");
		io.println("Done Code Run in : " + TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis() - start) + " s.");
	}
}