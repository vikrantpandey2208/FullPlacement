package IoTesting;

import java.io.BufferedReader;
import java.util.StringTokenizer;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

class FastIo{
	BufferedReader br;
	StringTokenizer st;
	 
	public FastIo(){
		br = new BufferedReader(
			new InputStreamReader(System.in)
		);
		
	}
	
	String next(){
		while(st == null || !st.hasMoreElements()){
			try{
				st = new StringTokenizer(br.readLine());
			}
			catch(IOException e){
				e.printStackTrace();
			}
		}
		return st.nextToken();
	}
	
	int nextInt(){
		return Integer.parseInt(next());
	}
	
	long nextLong(){
		return Long.parseLong(next());
		
	}
	double nextDouble(){
		return Double.parseDouble(next());
	}
	String nextLine(){
		
		String str = "";
		try{
			if(st.hasMoreTokens()){
				str = st.nextToken("\n");
			}
			else 
				str = br.readLine();
		}catch(IOException e){
			e.printStackTrace();
		}
			
		return str;
	}
	// ---------------- Output ------------
	void print(Object o){
		BufferedWriter bw = new BufferedWriter(
			new OutputStreamWriter(System.out)
		);
		try{
			bw.write(o.toString());
			bw.flush();
		}catch(IOException e){
			e.printStackTrace();
		}
		
	}
	void println(Object o){
		BufferedWriter bw = new BufferedWriter(
			new OutputStreamWriter(System.out)
		);
		try{
			bw.write(o.toString());
			bw.write("\n");
			bw.flush();		}catch(IOException e){
			e.printStackTrace();
		}
		
	}
}