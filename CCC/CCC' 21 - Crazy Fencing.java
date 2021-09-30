import java.util.*;
import java.io.*;
public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int n = readInt(); 
        int[] height = new int[n+1];
        int[] width = new int[n];
        double sum = 0;
        for(int i = 0; i < n+1; i++){
            height[i] = readInt();
        }
        for(int i = 0; i < n; i++){
            width[i] = readInt();
            sum += (double)width[i] * ((double)(height[i]+height[i+1])/2.0);
            
        }
        System.out.print(sum);
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
