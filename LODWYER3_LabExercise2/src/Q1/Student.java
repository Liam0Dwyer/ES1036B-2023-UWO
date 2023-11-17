package Q1;

public class Student {
    private String name; // string field declaration
    private int studentNumber; // studentNumber field declaration
    private int score; // score field declaration
    public Student() // constructor method when there is no parameters passed during creation
    {
        studentNumber = 123456789; //constructor setting the value of studentNumber to my student number if no parameter is passed to the class during creation
        name = "Liam O'Dwyer"; //constructor setting the value of name to my name if no parameter is passed to the class during creation
        score = 100; //constructor setting the value of score to 100 if no parameter is passed to the class during creation
    }
    public Student(String nm, int sn, int sc) // constructor method used when there are parameters passed t
    {
        name = nm; // Sets name equal to passed string nm
        studentNumber = sn; // Sets the studentNumber equal to passed int sn
        score = sc; // sets the score equal to passed int sc
    }
    public void printInfo() // Definition of printInfo() function
    {
        System.out.printf("%-20s %-20d %3d (letter grade: %2s)\n", name, studentNumber, score, getLetterGrade());
        //
    }
    public String getName()
    {
        return name;
    } // getname() function returns name value
    public int getScore()
    {
        return score;
    } // getscore() function returns score
    public void setName(String nm)
    {
        name = nm;
    } //setname() function sets obj.name value to passed parameter
    public void setStudentNumber(int sn)
    {
        studentNumber = sn;
    } // sets student number to passed parameter

    public void setScore(int sc)
    {
        score = sc;
    } //sets score to passed parameter

    public String getLetterGrade() // Returns letter grade for the student based on their s.score value
            //if  score is >= 90, returns A+, if score is >= 80, returns A and so on.
    {
        if (score >= 90)
        {
            return "A+";
        }
        else if (score >= 80)
        {
            return "A-";
        }
        else if (score >= 70)
        {
            return "B+";
        }
        else if (score >= 60)
        {
            return "B-";
        }
        else if (score >= 50)
        {
            return "C+";
        }
        else if (score >= 40)
        {
            return "C-";
        }
        else if (score >= 30)
        {
            return "D";
        }
        else
        {
            return "F";
        }
    }

}
