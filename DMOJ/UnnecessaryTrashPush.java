/*
Brandon likes to detonate fireworks. However, fireworks leave behind a lot of trash. 
Brandon has adjusted the Trash Push to clear out arbitrary trash, but the Trash Push is extremely tiring to perform after every firework detonation. 
Brandon wonders if some of his Trash Pushes are unnecessary.

We will model how Brandon takes out the trash as follows - he has infinitely many trash cans that can store up to K units of trash. Over the course of N
days, Brandon will detonate some fireworks. On day i, Brandon will accumulate ai units of trash. When Brandon executes a Trash Push, he takes all the
trash he has and pushes it into a trash can. As before, the trash that overflows will automatically enter another trash can. A Trash Push is unnecessary 
if, after executing it, no trash can is completely full of trash. Brandon can execute a Trash Push at any time, as long as he has at least one unit of 
trash to push. After executing a Trash Push, Brandon takes all trash cans that have trash in them and takes them outside. They are emptied overnight and
Brandon brings them back in the next day.

Given the amount of trash Brandon will generate over the next N days, compute the maximum number of Trash Pushes Brandon can perform, given that
none of them are unnecessary.
*/


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