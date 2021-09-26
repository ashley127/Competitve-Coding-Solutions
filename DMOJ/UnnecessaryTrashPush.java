package DMOJ;
import java.util.*;
public class UnnecessaryTrashPush
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        sc.nextLine();
        for(int i = 0; i < test; i++)
        {
            int days = sc.nextInt();
            int storage = sc.nextInt();
            sc.nextLine();

            int push = 0;
            int trash = 0;
            for(int j = 0; j < days; j++)
            {
                trash += sc.nextInt();
                if(trash >= storage){
                    push ++;
                    trash = 0;
                } 
            }
            System.out.println(push);
        }
    }
}