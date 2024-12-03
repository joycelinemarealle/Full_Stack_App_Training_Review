package algothinking;

import java.util.Arrays;

public class Algorithms {
    public static void main (String [] args){
        boolean resultOfTarget= search(new int []{1,3,5,7,9}, 4);
        boolean resultOfTarget2 = search (new int[]{1,3,1,5,3},3);
        boolean resultOfTarget3 = search(new int [5],0);

    System.out.println(resultOfTarget);
        System.out.println(resultOfTarget2);
        System.out.println(resultOfTarget3);
        System.out.println(sort(new int []{1,3,5}));
    }

    public static boolean search (int[] toSearch, int target){
       //loop through array and check if target present
        for ( int i = 0; i < toSearch.length; i ++){
            if (toSearch [i]== target){
                return true;
            }
        }
        return false;
    }

    public static String sort(int [] toSort){
        // Bubble sort
        boolean swapped;
        int n = toSort.length;
        for (int i= 0 ; i < n-1; i ++ ){
          swapped = false;

          for (int j = 0; j < n-1-i; j++){
              if (toSort[j] > toSort[j+1]){
                  int temp = toSort[j];
                  toSort[j] = toSort[j+1];
                  toSort[j+1] = temp;
                  swapped = true;
              }
              if (!swapped){
                  break;
              }
          }

        }
        return Arrays.toString(toSort);
//        for (int i = 0; i <=2; i++){
//            System.out.println(toSort[i] + " ");
       // }
    }
}


