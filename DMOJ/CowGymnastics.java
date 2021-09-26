package DMOJ;
import java.util.*;
import java.io.*;

public class CowGymnastics {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;

	public static void main(String[] args) throws IOException{
        int cow = readInt();
        int sessions = readInt();

        int[][] scores = new int[sessions][cow];
        for(int i = 0; i < sessions; i++)
        {
            for(int j = 0; j <= sessions; j++){
                scores[i][j] = readInt();
            }
        }

        int ans = 0;
        for(int i = 1; i <= sessions; i++){
            for (int j = 1; j <= sessions; j++)
            {
                int count = 0;
                for(int s = 0; s < cow; s++){
                    
                }
            }
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
    static long quickPow(int x, int n, int mod) {
        if(n == 0) return 1;
        long t = quickPow(x, n/2, mod);
        if(n % 2 == 0) return t*t%mod;
        return t*t%mod*x%mod;
    }
    static int gcd(int n, int m) {
        if(m == 0) return n;
        return gcd(m, n % m);
    }
}
