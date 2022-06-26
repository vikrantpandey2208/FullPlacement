import java.lang.*;
import java.util.*;
import java.io.*;


class balloon{
	static class FastIO{
		BufferedReader br;
		BufferedWriter bw;
		StringTokenizer st;
		
		public FastIO(){
			br = new BufferedReader(new InputStreamReader(System.in));
			bw = new BufferedWriter(new OutputStreamWriter(System.out));
		}

		public void write(String s) throws IOException{
			bw.write(s);
			bw.append("\n");
			bw.flush();
		}
		
		String nextLine(){
			 while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
		}
		int nextInt(){
			return Integer.parseInt(nextLine());
		}
		int[] takeIntArray(int size){
			int [] arr = new int[size];

			for (int i = 0; i < arr.length; i++) {
				arr[i] = nextInt();
			}
			return arr;
		}	

		public void print(Object object) throws IOException{
			bw.append("" + object);
			bw.flush();
		}
		public void println(Object object) throws IOException{
			bw.append("" + object+"\n");
			bw.flush();
		}
		public void printArr(int [] a) throws IOException{
			for (int i = 0; i < a.length; i++) {
				bw.append(a[i]+"");
			}
			bw.append("\n");
			bw.flush();
		}

	}
	public static void main(String[] args) throws java.lang.Exception {
		FastIO io = new FastIO();
		int t = io.nextInt();

		while(t-- > 0 ){
			int n = io.nextInt();

			int arr[] = io.takeIntArray(n);

			Set<Integer> set = new HashSet<Integer>();
            int i =0 ;

			while(set.size() != 7){
                if(arr[i] <= 7)
                    set.add(arr[i]);
                i++;
            }

			io.print(i+1);
		}
	}
}