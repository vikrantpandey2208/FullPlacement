package IoTesting;

import IoTesting.FastIo;

public class UsesFastIo{
	public static void main(String args[]){
		FastIo io = new FastIo();
		int n = io.nextInt();
		
		while(n-- > 0){
			String k = io.nextLine();
			io.print("Given input is ");
			io.println(k);
		}
	}
}