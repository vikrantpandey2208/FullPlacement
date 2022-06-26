package RecursionClasses;

import RecursionClasses.FastIo;

class Permutation{
	static FastIo io;
	
	private static void permute(String str, int i){
		if (i == str.length() -1){
			io.print(str + " ");
			return;
		}
		
		for(int j = i; j < str.length(); j++){
			str = swap(str, i, j );
			permute(str, i+ 1);
			str = swap(str, i , j );
		}
		
	}
	private static String swap(String str , int i , int j){
		char arr[] = str.toCharArray();
		char temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		return new String(arr);
	}
	
	// driver code
	public static void main(String args[]){
		io = new FastIo();
		io.println("enter string v2");
		String str = io.next();
		permute(str, 0);
		io.println("");
		io.println("Done printing permutations");
	}
}