package forstatements;

public class Loops {
    public static void main (String [] args) {

        System.out.println(sumTo());

         int cumulative_sum = 0;
        for ( int j = 1; j < 10; j++){
            //compare using the formula t
           int formula_sum = (j*(j+1))/2;

           for (int k = 1; k<=j; k++){
               cumulative_sum +=k;

           }
           if (formula_sum != cumulative_sum){
                 System.out.println("formual and cumulative sum not equal");
           }
           else {System.out.println("n =" +j+ "/n foruma"
                   + formula_sum + "/n num "+ cumulative_sum);}
        }





    }
    public static int sumTo(){
        int initial_sum = 0;
        int i = 1;

        while ( i < 21 ){
            initial_sum +=i;
            i++;
        }
        return initial_sum;

    }



}
