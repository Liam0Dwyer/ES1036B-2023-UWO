package Q2;

import LAB3Q.MyMethod;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.io.PrintWriter;
import java.io.File;
// importing necessary classes

public class WorkingWithFilesAndArrays { // class header
    public static void main(String[] args) throws IOException { // main method header, throws IOException
        MyMethod.myHeader(4,2,"Demonstration of text file manipulation"); // myHeader call
        File salesDataFile = new File("Datafile_LabAssignment4.txt"); // new file object
        Scanner fileIn = new Scanner(salesDataFile); // new Scanner object, passed previously created file object
        double[] salesData = new double[7]; // new double array with 7 positions
        int i = 0; // int declaration and initialization
        while(fileIn.hasNext()) // while there is a next line in the file, run the loop
        {
            salesData[i++] = fileIn.nextDouble(); // set element i in salesData equal to the next double in the file
        }
        fileIn.close(); // close the file
        WeeklySaleDataLiam salesDataObj = new WeeklySaleDataLiam(salesData); // new WeeklySaleDataLiam object passed salesData
        System.out.println("Here is this week's sale data from .txt file:"); // prints message to standard output
        salesDataObj.displaySaleData(); // displaySaleData() call from salesDataObj object
        System.out.printf("\nHighest weekly sale: %.2f", salesDataObj.getHighestSale()); // prints message to standard output
        System.out.printf("\nLowest weekly sale: %.2f", salesDataObj.getLowestSale()); // prints message to standard output
        System.out.printf("\nAverage Weekly sale: %.2f", salesDataObj.getAverageSale()); // prints message to standard output
        System.out.printf("\nStandard deviation: %.2f", salesDataObj.getStandardDeviation()); // prints message to standard output
        FileWriter fw = new FileWriter("Datafile_LabAssignment4.txt", true); // new filewriter object
        PrintWriter appendFile = new PrintWriter(fw); // new printwriter object passed filewriter object
        System.out.printf("\nWriting text to file . . . "); // // prints message to standard output
        appendFile.printf("\n\nHighest weekly sale: %.2f", salesDataObj.getHighestSale()); // prints message to file
        appendFile.printf("\nLowest weekly sale: %.2f", salesDataObj.getLowestSale()); // prints message to file
        appendFile.printf("\nAverage Weekly sale: %.2f", salesDataObj.getAverageSale()); // prints message to file
        appendFile.printf("\nStandard deviation: %.2f", salesDataObj.getStandardDeviation()); // prints message to file
        appendFile.printf("\n Reported by Liam O'Dwyer"); // prints message to file
        appendFile.close(); // Close file
        System.out.printf("\nWriting to file complete, file closed"); // prints message to standard output
        MyMethod.myFooter(2); // myFooter() call
    }
}
