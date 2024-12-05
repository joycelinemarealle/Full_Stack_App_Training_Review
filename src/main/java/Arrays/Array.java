package Arrays;

public class Array {

    public static void main (String [] args){

int [] new_array  =  new int[3];
    new_array[0] =1;
    new_array[1]= 2;
    new_array[2] = 3;


    int [] myArray = {1,2,3,4,5};

    for ( int number : myArray){
        System.out.println(number + " ");
    }

    for ( int i = 0; i < myArray.length; i ++){
        System.out.println(myArray[i] + " ");
    }
}
}
