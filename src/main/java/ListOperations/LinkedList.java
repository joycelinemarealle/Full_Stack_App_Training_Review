package ListOperations;

import java.util.ArrayList;
import java.util.List;

public class LinkedList {
    public static void main (String [] args){
        List<Integer> randoms= generateNumberList(5,10);
        System.out.println(sumNumberList(randoms));

    }

    public static List<Integer> generateNumberList(int count, int max){
        List<Integer> randomNumbers = new java.util.LinkedList<>();
        for ( int i = 0; i < count; i++){
            int num = (int) ((Math.random()) * max)+1;
            randomNumbers.add(num);
        }
        return randomNumbers;

    }

    public static int sumNumberList (List<Integer> numbers){
        int init_sum = 0;
        for (int number : numbers){
            init_sum += number;
        }
        return init_sum;
    }
}
