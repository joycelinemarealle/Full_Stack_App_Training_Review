package typesandvariables;

public class Variables {

    public static void main (String [] args){
        Integer number = 5;
        Integer result = number +3;
        System.out.println(result);

    String toPrint = "Your result is";
    System.out.println(toPrint);

    float decResult = number  +5.32f;
    double decResult2= number  +5.32;

        System.out.println(toPrint + " "+ number +  " and " + decResult);

        boolean word = true;
        System.out.println(word);

        Double d = 5.2;
        int i = d.intValue();
        System.out.println(i);

        double d1 = 5.2;
        int i1 = (int)Math.round(d1);
        System.out.println(i1);

//
//        if (!(x ==2 )){}
//        if (a> 5 || a < 0){}
//        if (a>0 ^ a % == 0){}
//        if (a > 0 && a < 0){}


}}
