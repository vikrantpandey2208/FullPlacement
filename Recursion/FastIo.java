package RecursionClasses;

import java.io.BufferedReader;
import java.util.StringTokenizer;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class FastIo{
	BufferedReader br;
	StringTokenizer st;
	 
	public FastIo(){
		br = new BufferedReader(
			new InputStreamReader(System.in)
		);
		
	}
	
	public String next(){
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
	
	public int nextInt(){
		return Integer.parseInt(next());
	}
	
	public long nextLong(){
		return Long.parseLong(next());
		
	}
	public double nextDouble(){
		return Double.parseDouble(next());
	}
	public String nextLine(){
		
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
	public ArrayList<Integer> takeIntArray(){
		ArrayList<Integer> li= new ArrayList<Integer>();
		FastIo io = new FastIo();
		io.println("enter 's' to STOP ");
		while(true){
			String in = io.next();
			if(in.equals("s")) break;
			
			li.add(Integer.parseInt(in));
		}
		return li;
	}
	
	// ---------------- Output ------------
	public void print(Object o){
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
	public void println(Object o){
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