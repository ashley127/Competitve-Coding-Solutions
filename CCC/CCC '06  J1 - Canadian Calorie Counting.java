import java.util.*;
import java.io.*;
public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	public static void main(String[] args) throws IOException{
       	int burger = readInt();
		int side = readInt();
		int drink = readInt();
		int dessert = readInt();
		int total = 0;
		if(burger == 1) total += 461;
		else if (burger == 2) total += 431;
		else if (burger == 3) total += 420;
		
		if(drink ==1 ) total += 130;
		else if (drink == 2) total += 160;
		else if (drink == 3) total += 118;

		if(side ==1 ) total += 100;
		else if (side == 2) total += 57;
		else if (side == 3) total += 70;

		if(dessert ==1 ) total += 167;
		else if (dessert == 2) total += 266;
		else if (dessert == 3) total += 75;

		System.out.println("Your total Calorie count is "+total + ".");
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
