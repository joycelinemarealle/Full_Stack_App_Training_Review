package Interfaces;

public class Student implements Comparable <Student>{
    String firstName;
    String lastName;
    int id;

    public Student(String firstName, String lastName, int id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

//    @Override
//    public int compareTo(Student o) {
//        return Integer.compare(this.id, o.id);
//    }

    @Override
    public int compareTo(Student o){
        int lastNameComparision = this.lastName.compareTo(o.lastName);
        if (lastNameComparision != 0){
            return lastNameComparision;
        }else{
            //compare by first name
            return this.firstName.compareTo(o.firstName);
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", id=" + id +
                '}';
    }
}
