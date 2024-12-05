package GenericLabs;

import java.util.Stack;

public class StackDriver {

    public static void main(String[] args) {

        GenericStack<Integer> intStack = new GenericStack<>();
        intStack.push(5);
        intStack.push(3);
        intStack.push(7);
        System.out.println(emptyAndGetGreatest(intStack)); // Expected: 7
        System.out.println(intStack.size()); // Expected: 0
    }

    public static <T extends Comparable<T>> T emptyAndGetGreatest (GenericStack<T> aList){
        //store top
        T greatest = aList.top();

        //pop top then store the new top in temp then compare to greaterst
        //if greatest < than top then replace temp with popped
        //keep on popping until stack empty

        while (aList.size() > 0){
            T temp = aList.top();
            aList.pop();

            if (greatest.compareTo(temp)> 0){
                greatest = temp;
            }

        }
        return greatest;
    }
}
