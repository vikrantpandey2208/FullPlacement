import java.lang.*;
import java.util.*;
import java.io.*;


class longseq{
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
            String str = null;
            try {
                str=  br.readLine();
            } catch (Exception e) {
                e.printStackTrace();    
            }
            return str;
        }

		String next(){
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
			return Integer.parseInt(next());
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
			String str = io.nextLine();
            int z = 0 , o = 0 ;
            for(char c : str.toCharArray()){
                if(c == '0')
                    z++;
                else
                    o++;
            }

            if(str.length() == 1)
                io.println("Yes");

            else if(Math.min(z, o ) == 1)
			    io.println("Yes");
            else
                io.println("No");
		}
	}
}