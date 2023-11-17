package Q1;
import java.util.Scanner; // import Scanner class
import LAB3Q.MyMethod; // import MyMethod class

public class TwoDArrayMultiplicationLiam { // class header
    public static void main(String[] args) { // main method header
        MyMethod.myHeader(4,1,"idk"); // MyMethod Header
        Scanner input = new Scanner(System.in); // new Scanner object, initialized with System.in
        System.out.printf("Multiplying 2D Arrays:"); // prints message to standard output
        System.out.printf("\nEnter array 1 info"); // prints message to standard output
        System.out.printf("\n Enter row size: "); // prints message to standard output
        int row1 = input.nextInt(); // declares and initializes row1 int equal to next integer input
        System.out.printf(" Enter Column size: "); // prints message to standard output
        int column1 = input.nextInt(); // declares and initializes column1 int equal to next integer input
        System.out.printf("\nEnter array 2 info "); // prints message to standard output
        System.out.printf("\n Enter row size: "); // prints message to standard output
        int row2 = input.nextInt(); // declares and initializes row2 int equal to next integer input
        while (true) // infinite while loop
        {
            if (row2 == column1) // if row2 is equal to column1, exit the loop
                break; // break statement
            else // if row2 is not equal to column1, run the following:
            {
                System.out.printf(" Row size of matrix 2 must be equal to the column size of matrix 1!");// prints message to standard output
                System.out.printf("\n Please try again:"); // prints message to standard output
                row2 = input.nextInt(); // declares and initializes row2 int equal to next integer input
            }
        }
        System.out.printf(" Enter column size:"); // prints message to standard output
        int column2 = input.nextInt(); // declares and initializes column2 int equal to next integer input
        System.out.printf("\nElements of array 1: [%d x %d]\n", row1, column1); // prints message to standard output
        int[][] array1 = new int[row1][column1];
        populate2DArrays(array1);
        display2DArrays(array1);
        System.out.printf("\nElements of array 2: [%d x %d]\n", row2, column2); // prints message to standard output
        int[][] array2 = new int[row2][column2];
        populate2DArrays(array2);
        display2DArrays(array2);
        System.out.printf("\nMultipling 2D arrays:"); // prints message to standard output
        System.out.printf("\nResultant size is: [%d x %d]\n", row1, column2); // prints message to standard output
        display2DArrays(multiplyArrays(array1, array2)); // display2DArrays() method call, passing multiplyArray() method with array1 and array2 as parameters
        MyMethod.myFooter(1); // myFooter() call
    }
    public static void populate2DArrays(int[][] ma) { // method header
        for (int i = 0; i < ma.length; i++) // for loop runs ma.length times
            for (int j = 0; j < ma[i].length; j++) { // for loop runs ma[i].length times
                ma[i][j] = (int) (Math.random() * 4 + 2); // sets every element of array i to a random number between 2 and 5
            }
    }
    public static void display2DArrays(int[][] ma) { // method header
        for (int i = 0; i < ma.length; i++) { // for loop runs ma.length times
            for (int j = 0; j < ma[i].length; j++) { // for loop runs ma[i].length times
                System.out.printf("%3d ", ma[i][j]);  // prints message to standard output
            }
            System.out.print("\n"); // prints new line character to standard output
        }
        System.out.print("\n"); // prints new line character to standard output
    }
    public static int[][] multiplyArrays(int[][] a, int[][] b) {
        int[][] c = new int[a.length][b[0].length]; // new 2D int array with dimensions [a.length x b[0].length]
        for (int i = 0; i < a.length; i++) { // Changes row of matrix a
            for (int j = 0; j < b[0].length; j++) { // changes column of matrix b
                for (int k = 0; k < b.length; k++) { // iterates over all values of [i] row a and [j] column b
                    c[i][j] += a[i][k] * b[k][j]; // sums the multiple of all values in row i and column j
                }
            }
        }
    return c; // returns reference to the new array c
    }
}
