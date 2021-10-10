import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double weight = sc.nextDouble();
        sc.nextLine();
        double height = sc.nextDouble();
        sc.nextLine();
        
        double bmi = weight/(height*height);
        if(bmi>25) System.out.println("Overweight");
        if(18.5<=bmi && bmi<=25) System.out.println("Normal weight");
        if(18.5>bmi) System.out.println("Underweight");
    }
}
