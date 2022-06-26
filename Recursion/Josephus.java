import RecursionClasses.FastIo;

class Josephus{
	static FastIo io;
	
	static int jos(int n , int k){
		if(n == 1 ) return 0;
		
		return (jos(n-1, k ) + k ) % n;
	}
	
	// driver code
	public static void main(String args[]){
		io = new FastIo();
		io.println("enter N and k ");
		int n = io.nextInt();
		int k = io.nextInt();
		
		io.println("The surviver is " + jos(n, k));
		
		io.println("");
		io.println("Done Code Run");
	}
}