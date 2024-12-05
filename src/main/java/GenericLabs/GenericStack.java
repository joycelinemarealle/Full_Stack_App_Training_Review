package GenericLabs;

import java.util.ArrayList;
import java.util.List;

public class GenericStack <T>  {


    List<T> aList = new ArrayList<>();
    
    void push (T item) {
        aList.add(item);
    }
    
    T top (){
        return aList.get(aList.size()-1);
    }
    
    void pop(){
        aList.remove(top());
    }

    int size(){
        return aList.size();
    }
}
