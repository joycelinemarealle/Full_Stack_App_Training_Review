package GenericLabs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Generics {
    public static void main (String [] args){

       List<Integer> intList = Arrays.asList(1,5,7,2,3);
       List<String> strsList = Arrays.asList("Java", "World", "Hello");
        System.out.println(reverse(intList));
        System.out.println(reverse(strsList));
    }

    public static <T> List<T> reverse (List<T> a_list){
        List <T> reverse_list = new ArrayList<>();
        for (int i = a_list.size()-1; i >=0; i --){
           reverse_list.add(a_list.get(i));
        }
        return reverse_list;
    }
}
