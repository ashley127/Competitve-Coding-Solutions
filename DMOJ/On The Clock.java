import java.util.*;
import java.io.*;
public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        long n = readLong(), m = readLong();
        System.out.println(n+m - gcd(n,m));
        for(int i = 1; i<=n; i++){
            long left = (i- 1)*m / n+1, right = (i*m + n-1)/n;
            for(long j = left; j<= right; j++){
                System.out.println(i+" "+ j);
            }
        }
    }
    static long gcd(long m, long n){
        return n==0 ? m:gcd(n,m%n);
    }

    static String next() throws IOException {
        while (st == null || !st.hasMoreTokens())
            st = new StringTokenizer(br.readLine().trim());
        return st.nextToken();
    }

    static long readLong() throws IOException {
        return Long.parseLong(next());
    }

    static int readInt() throws IOException {
        return Integer.parseInt(next());
    }

    static double readDouble() throws IOException {
        return Double.parseDouble(next());
    }

    static char readCharacter() throws IOException {
        return next().charAt(0);
    }

    static String readLine() throws IOException {
        return br.readLine().trim();
    }
}
