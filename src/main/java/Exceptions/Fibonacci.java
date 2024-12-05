package Exceptions;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci {

    public static void main(String[] args) {
        List<Integer> list = List.of(4, 3, 2, -1, 0);
        System.out.print(fibList(list));

    }

    public static int fibonacci(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        if (n < 0) {
//            throw new ArithmeticException();
            throw new FibonacciException(n);
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    };

    public static List<Integer> fibList(List<Integer> n_list) {
        List<Integer> results = new ArrayList<>();
        for (Integer i : n_list) {

            try {
                results.add(fibonacci(i));

            } catch (FibonacciException e) {

            }
        }
        return results;
    }
}
