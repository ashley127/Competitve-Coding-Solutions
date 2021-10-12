import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String key = sc.nextLine();
        String str = sc.nextLine();
        
        String cleaned = "";
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String result = "";
        for(int i = 0; i<str.length();i++){
            if(alphabet.contains(str.substring(i,i+1))) cleaned += str.substring(i,i+1);
        }

        for(int i = 0; i<cleaned.length();i++){
            int index = i % key.length();
            int s = alphabet.indexOf(key.charAt(index));
            int urmom = alphabet.indexOf(cleaned.charAt(i));
            int urfat = s+urmom;
            int urdad = urfat%26;

            result+=alphabet.charAt(urdad);
        }
        System.out.println(result);
        
    }
    static Integer shift(char key){
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        return alphabet.indexOf(key);
    }
}
