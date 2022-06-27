import RecursionClasses.FastIo;
import java.util.concurrent.TimeUnit;

class ToBinary {
	static FastIo io;
	
	static void toBinary(int n ){
		if(n == 0 )return;
		
		toBinary(n / 2);
		io.print(n % 2);
	}
	
	// driver code
	public static void main(String args[]){
		
		io = new FastIo();
		
		io.println("enter Number ");
		int input = io.nextInt();
		long start = System.currentTimeMillis();
				
		io.print("Binary Equivalent of number is : ");
		toBinary(input);
		
		io.println("");
		io.println("Done Code Run in : " + TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis() - start) + " s.");
	}
}