package forstatements;

public class Factorial2 {
    public static void main (String [] args) {
        int product = 1;
        int toFind = 5;

        while (toFind != 0) {
            if(toFind < 0){
                System.out.println("positive number");
                break;
            }
            product *= toFind;
            toFind--;
        }
        System.out.println(product);




    }
}
