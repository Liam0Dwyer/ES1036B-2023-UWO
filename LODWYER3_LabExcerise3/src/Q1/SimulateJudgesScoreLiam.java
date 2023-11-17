package Q1;
import LAB3Q.MyMethod;

public class SimulateJudgesScoreLiam { // class header
    public static void populateArray(double[] arr) // method header
    {
        for (int i  = 0; i < arr.length; i++) // for loop runs arr.length times
        {
            arr[i] = (Math.random()*3 + 7); // sets arr[i] equal to a random number between 7 and 10
        }
    }
    public static void displayArray(double[] arr) // method header
    {
        System.out.printf("["); // prints message to standard output
        for (int i = 0; i<arr.length; i++) // for loop runs arr.length times
        {
            System.out.printf("%.2f,",arr[i]);// prints message to standard output
        }
        System.out.print("\b]");// prints message to standard output
    }
    public static double finalScore(double[] array) // method header
    {
        double[] arrayB = new double[array.length]; // new double array arrayB
        int minpos = 0; // int declaration
        int maxpos = 0; // int declaration
        for (int i = 0; i < array.length; i++) //for loop runs array.length
        {
            arrayB[i] = array[i]; // copies array to arrayB
            if (array[i]>array[maxpos])
                maxpos = i; // stores position of maximum value
            if (array[i]<array[minpos])
                minpos = i; // stores position of minimum value
        }
        System.out.printf("\nMax value: %.2f \nMin value: %.2f", array[maxpos], array[minpos]); // prints message to standard output
        arrayB[maxpos] = 0; // sets the highest number in array B to 0
        arrayB[minpos] = 0; // sets the lowest number in arrayB to 0
        System.out.println("\n\nAdjusted scores:"); // prints message to standard output
        displayArray(arrayB); // displayArray() call
        double score = 0; // new double variable score = 0
        for (int i = 0; i <arrayB.length; i++) // for loop, runs arrayB.length times
        {
            score += arrayB[i]; // sum of all array elements
        }

        return score/3; // returns sum / 3
    }

    public static void main(String[] args) { // main method header
        MyMethod.myHeader(3,1,"Using arrays this program calculates the average of five randomly generated numbers from 7-10, excluding the highest and lowest values");
        // myHeader() call
        double[] array = new double[5]; // new double array with 5 elements
        populateArray(array); // populateArray() call
        System.out.printf("Inital scores:\n"); // prints message to standard output
        displayArray(array); //displayArray() call
        System.out.printf("\n\nFinal Score: %.2f", finalScore(array)); // prints message to standard output
        MyMethod.myFooter(1); // myFooter call
    }
}
