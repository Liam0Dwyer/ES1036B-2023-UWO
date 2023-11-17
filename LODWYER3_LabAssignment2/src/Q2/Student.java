package Q2;

public class Student // declaration of class
{
    private int studentNumber; // initialization of studentNumber integer
    private String firstName; // initialization of firstName String
    private String lastName; // initialization of lastName String
    private String emailAddress; // initialization of emailAddress String
    private int yearOfBirth; // initialization of yearOfBirth integer
    public Student(){ // constructor method
        studentNumber = 123456789; //constructor setting the value of studentNumber to my student number if no parameter is passed to the class during creation
        firstName ="Liam"; //constructor setting the value of firstName to my name if no parameter is passed to the class during creation
        lastName = "O'Dwyer"; //constructor setting the value of lastName to my last name if no parameter is passed to the class during creation
        emailAddress = "EMAIL@uwo.ca"; //constructor setting the value of emailAddress to my email if no parameter is passed to the class during creation
        yearOfBirth = 2004; //constructor setting the value of year of birth to my year if no parameter is passed to the class during creation
    }
    public Student(int studentNumber, String firstName, String lastName){ //constructor method
        this.studentNumber = studentNumber; //using the 'this' keyword, this constructor sets the objectName.studentNumber variable equal to the reference variable studentNumber passed to the object during creation
        this.firstName = firstName; //same story as above, constructor uses 'this' keyword to set variable equal to the reference variable passed a value on creation
        this.lastName = lastName; //same as above, constructor uses 'this' keyword to set variable equal to the reference variable passed a value on creation

    }
    public int getStudentNumber() //getter method returns the (private) studentNumber Variable when called
    {
        return studentNumber;
    }
    public String getName() //getter method returns the private variables firstName and lastName in a string  when called
    {
        return firstName + " " + lastName;
    }

    public String getEmailAddress() { // getter method returns the emailAddress string
        return emailAddress;
    }
    public int getAge() //getter method returns the difference of 2023 and the yearOfBirth integer
    {
        return 2023-yearOfBirth;
    }
}