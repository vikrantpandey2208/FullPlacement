
import RecursionClasses.FastIo;

class Toh{
	static FastIo io;
	
	static void toh(int n, char A, char B, char C){
		if(n == 1 ) {
			io.println("Move Disk 1 from " + A + " to " + C );
			return;
		}
		
		toh(n-1 , A, C, B);
		io.println("Move Disk "+ n + " from " + A + " to " + C );
		toh(n-1 , B, A, C );
	}
	
	// driver code
	public static void main(String args[]){
		io = new FastIo();
		io.println("enter number of disks");
		
		toh(io.nextInt(), 'A', 'B', 'C');
		
		io.println("");
		io.println("Done Code Run");
	}
}