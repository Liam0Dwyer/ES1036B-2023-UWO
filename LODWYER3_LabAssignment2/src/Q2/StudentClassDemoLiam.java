package Q2;
import Q1.CircleInfoLiam; // imports CircleInfoLiam from Q1 for header and footer methods

public class StudentClassDemoLiam { //driver class declaration
    public static void main(String[] args) // main method header
    {
        CircleInfoLiam.myHeader(1,2,"Program prints student name and number using classes, objects, and constructors"); // calls header method with arguments
        Student s1 = new Student(); // creates new student object s1
        System.out.printf("\nI am %s\nStudent Number: %d\nEmail Address: %s\nAge: %d\n\n", s1.getName(), s1.getStudentNumber(), s1.getEmailAddress(), s1.getAge()); // prints information of s1 object
        Student s2 = new Student(250221375, "Addie", "Slowgrave"); // creates new student object s2
        Student s3 = new Student(250309716,"Talia","Hanscom"); // creates new student object s3
        System.out.printf("Other students:\n==========================\n%d %10s\n%d %10s\n==========================\n", s2.getStudentNumber(), s2.getName(), s3.getStudentNumber(), s3.getName()); // prints information of s2 and s3 student objects
        CircleInfoLiam.myFooter(2); // calls footer method
    }
}
