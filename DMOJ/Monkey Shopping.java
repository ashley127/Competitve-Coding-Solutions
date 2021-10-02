import java.util.*;
import java.io.*;
public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int sugarHave = readInt(), sugarNeed = readInt(),toothpasteHave = readInt(), toothpasteNeed = readInt();
        if(sugarHave<sugarNeed && toothpasteHave<toothpasteNeed) System.out.println("Go to the department store");
        else if(sugarHave>=sugarNeed && toothpasteHave>=toothpasteNeed) System.out.println("Stay home");
        else if(sugarHave<sugarNeed) System.out.println("Go to the grocery store");
        else System.out.println("Go to the pharmacy");
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
