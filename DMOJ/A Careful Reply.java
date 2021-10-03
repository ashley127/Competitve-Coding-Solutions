import java.util.*;
import java.io.*;
public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	public static void main(String[] args) throws IOException{
       	int total = readInt();
		for(int i = 0; i<total; i++){
			String text = readLine();
			int count = 1;
			for(int j = 0; j<text.length()-1;j++){
				if(text.substring(j,j+2).equals("<3")) count ++;
			}
			for(int a = 0; a<count;a++){
				System.out.print("<3"+" ");
			}
			System.out.println();
		}
	}
    
	static String next () throws IOException {
		while (st == null || !st.hasMoreTokens())
			st = new StringTokenizer(br.readLine().trim());
		return st.nextToken();
	}
	static long readLong () throws IOException {
		return Long.parseLong(next());
	}
	static int readInt () throws IOException {
		return Integer.parseInt(next());
	}
	static double readDouble () throws IOException {
		return Double.parseDouble(next());
	}
	static char readCharacter () throws IOException {
		return next().charAt(0);
	}
	static String readLine () throws IOException {
		return br.readLine().trim();
	}
}
