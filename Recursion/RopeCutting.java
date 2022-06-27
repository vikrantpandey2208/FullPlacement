import RecursionClasses.FastIo;
import java.util.concurrent.TimeUnit;

class RopeCutting{
	static FastIo io;
	static long start;
	
	static int cut(int n , int a, int b , int c ){
		if(n == 0 ) return 0;
		if(n < 0 ) return -1;
		
		int res = Math.max( 
					cut(n-a, a, b, c), 
					Math.max(
						cut(n-b, a, b ,c ),
						cut(n-c , a, b, c)	
					)				
				);
		
		if(res == -1 )
			return -1;
		
		return res + 1;
	}
	
	// driver code
	public static void main(String args[]){
		
		io = new FastIo();
		
		io.println("enter n , a, b, c ");
		
		start = System.currentTimeMillis();
		io.println("number of pieces are : " + cut(io.nextInt(), io.nextInt(), io.nextInt(), io.nextInt()));
		
		io.println("");
		io.println("Done Code Run in : " + TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis() - start) + " s.");
	}
}