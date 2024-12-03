package ifstatements;
import java.util.Scanner;

public class ageChecker {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter age: ");
      int input = sc.nextInt();

        if (input > 18){
            System.out.println(" You are old enough");

        } else{
            System.out.println("You have to 18 and above");
        }


    }
}
