import java.util.*;
import java.io.*;
public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int rockX = readInt(), rockY = readInt(), wallX_1 = readInt(), wallY_1 = readInt(), wallX_2 = readInt(), wallY_2 = readInt();
        System.out.println(wallX_1<rockX && rockX<wallX_2 && wallY_1<rockY && rockY<wallY_2 ? "Yes" : "No");
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
