import java.util.*;
import java.io.*;
public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int n = readInt(); 
        String s = readLine().toLowerCase();
        int characters[] = new int[26];

        for(int i = 0; i < n; i++) {
            characters[s.charAt(i)-'a']++;
        }

        int odd_chars = 0;
        for(int i:characters) {
            if(i % 2 == 1) {
                odd_chars++;
            }
        }

        System.out.println(Math.max(1,odd_chars));
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
