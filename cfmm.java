import java.lang.*;
import java.util.*;
import java.io.*;


class cfmm{
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
			String str1 = "codechef";
			Vector<Integer> f1 = new Vector<Integer>(26);
			Vector<Integer> f2 = new Vector<Integer>(26);


			for (int i = 0; i < 26; i++) {
				f1.add(i, 0);
				f2.add(i, 0);
			}

			for(char c : str1.toCharArray()){
				f1.set(c - 'a', f1.get(c - 'a') + 1);
			}

			int n = io.nextInt();

			while(n-- > 0){
				String str = io.nextLine();
				
				for(char c : str.toCharArray()){
					f2.set(c - 'a', f2.get(c - 'a') + 1);
				}
           
			}

			int ans = Integer.MAX_VALUE ;
			for (int i = 0; i < 26; i++) {
				if(f1.get(i) != 0)
					ans = Math.min(ans, f2.get(i) / f1.get(i));
			}
			io.println(ans);
		}
	}
}