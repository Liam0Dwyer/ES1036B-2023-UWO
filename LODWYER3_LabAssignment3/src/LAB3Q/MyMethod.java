package LAB3Q;


public class MyMethod { // class header
    final public static double PI = 3.141592653589793; // declaration of final double PI
    public static double myPow(double x, int y) // public static method definition, returns double and takes a double and an int
    {
        double z = x; // declares double z that is equal to initial value of x
        if (y>0) // if y>0, execute following code
        {
            for(int i = 1; i<(y); i++) // for loop, executes y-1 times
            {
                x = x*z; // set x equal to x times the initial value of x which us stored in z
            }
            return x; // returns the final value of x
        }
        else if (y<0) // if y<0, execute following code:
        {
            for(int i = 1; i<(Math.abs(y)); i++) // for loop, executes |y|-1 times
            {
                x = x*z; // set x equal to x times initial value of x which is stored in z
            }
            return 1/x; // returns the value 1/x
        }
        else // if the previous statements aren't true, execute the following code instead:
        {
            return 1; //returns the value of 1. (only executed if x=0
        }
    }
    public static double factorial(int x) // public static method header, returns double takes int
    {
        double y = (double)x; // declares a new reference variable to store the value for the factorial, integers will cap out at 12!
        if (x==0) // if x = 0, method returns 1. This is necessary for the sin and cos function to work
        {
            return 1; // return statement (will always return the double 1.0)
        }
        else // if the above conditions are not met, run the following code
        {
            for (int i = x - 1; i > 0; i--) //for loop runs i-1 times
            {
                y = y * (i); // sets y equal to y*(y-1)
            }
            return y; //returns final value of y
        }
    }
    public static double mySin(double x) // public static method header, takes double and returns double
    {
        double y=0; // declaring new double variable to store answer value
        for(int n = 0; n<15; n++) // for loop runs 15 times NOTE: SOME WIERD STUFF STARTS TO HAPPEN AT N=20 AND IT ALWAYS RETURNS NaN SO IM USING 15
        {
           y += (myPow((-1), n)*myPow(x,2*n+1)/factorial(2*n+1)); // y = y + taylor series approximation of sine
        } // NOTE: this taylor series approximation of the value of sine is only accurate between -1 and 1, this is a limitation of the approximation itself, and not my program
        return y; // returns the final value of y
    }
    public static double myCos(double x) // public static double method header, takes double returns double
    {
        double y=0; //declaring new double variable to store answer value
        for(int n = 0; n<15; n++) // lop runs 15 times (same as above)
        {
            y += ((Math.pow(-1,n))/(factorial((2*n))))*(Math.pow(x,(n*2))); // sets y equal to the taylor series approximation of cosine
        }
        return y; // returns the final value of y
    }
    public static double myDegreeToRadian(double degree) // method definition header, public, static, takes double, returns double
    {
        return degree*PI/180; // returns the degree value times pi divided by 180
    }
    public static char myCharToLowercase(char c) // method definition header, public, static, takes char and returns char
    {
        return (char)(c+32); // takes the int value of the passed char, then adds 32 to it then casts it back to a char
    }
    public static void myHeader(int labNum, int questionNum, String description) // defines myHeader method, which takes two ints and a string as input
    {
        System.out.printf("************************%nFull Name: Liam O'Dwyer%nLab Number: %d, Question: %d %nProgram Description: %s%n************************%n", labNum, questionNum, description);
        //above line prints a message to the console which includes the values it was passed
    }

    public static void myFooter(int questionNum) //defines myFooter method, which takes an int as input
    {
        System.out.printf("%n********** Signing off from question %d -Liam **********", questionNum); //prints a message with the passed value
    }
}