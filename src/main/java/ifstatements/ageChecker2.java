package ifstatements;
import java.util.Scanner;

public class ageChecker2 {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Are you still interested in palying? Type exit if not");
        String user_interest = sc.nextLine();

        //for string use equals for equality and not ==
        while (!user_interest.equalsIgnoreCase("exit")) {

            System.out.println("Enter age: ");
            int input = sc.nextInt();
            int x = 18 - input;

            if (input > 18) {
                System.out.println(" You are old enough");

            } else {
                System.out.println("You have to be " + x + "years older to enter");
            }
            if (user_interest.equalsIgnoreCase("exit")) {
                break;
            }
        }
    }}
