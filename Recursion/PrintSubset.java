import RecursionClasses.FastIo;
import java.util.ArrayList;

class PrintSubset{
	static FastIo io;
	
	private static void printSubset(ArrayList<Integer> arr){
		io.println(arr);
	}
	
	// driver code
	public static void main(String args[]){
		io = new FastIo();
		io.println("enter elements of set array");
		ArrayList<Integer> li = io.takeIntArray();
		printSubset(li);
		
		io.println("");
		io.println("Done Code Run");
	}
}