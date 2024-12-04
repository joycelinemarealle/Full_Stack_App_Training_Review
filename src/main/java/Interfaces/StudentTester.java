package Interfaces;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentTester{
    public static void main (String [] args){
        Student s1 = new Student("Joyceline", "Marealle", 1);
        Student s2= new Student("Eve", "Marealle", 2);
        Student s3 = new Student("Ine", "Aam", 3);


        List<Student > students = new ArrayList<>();
        students.add(s1);
        students.add(s2);
        students.add(s3);

        Collections.sort(students);
        System.out.println(students);
    }





}
