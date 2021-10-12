import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        sc.nextLine();
        int future = sc.nextInt();
        for(int i =year; i <=future;i+=60) {
		    System.out.println("All positions change in year "+i);
        }
    }
}
