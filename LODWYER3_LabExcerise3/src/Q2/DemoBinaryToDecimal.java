package Q2; //Package
import LAB3Q.MyMethod; // import MyMethod for header and footer

public class DemoBinaryToDecimal { // driver class header
    public static void main(String[] args) {// driver method
        MyMethod.myHeader(3,2,"Program demonstrates array manipulation and conversion of 4 and 8 bit numbers to decimal"); // myMethod Call
        int[] binArray = new int[4]; // Declaration of new 4 digit array, goes straight to heap, so it's all zeros on creation
        for (int i = 0; i< binArray.length;i++) // for loop, runs binArray.length number of times
        {
            binArray[i]=(int)(Math.random()*2); // assigns array value at i to either one or zero using Math.random
        }
        BinaryToDecimalLiam bin1 = new BinaryToDecimalLiam(binArray); // creating new BinaryToDecimalLiam object called bin1, and passing binArray to constructor
        System.out.printf("Original 4 bit number: "); // prints message to standard output
        bin1.displayArray(); // calls displayArray() method from inside bin1 object
        System.out.printf("\nCorresponding decimal value of above array: %d", bin1.getDecimalValue()); // prints message to standard output
        System.out.print("\n8 bit number after padding: ");// prints message to standard output
        bin1.doubleTheSizeZeroPadding();// calls doubleTheSizeZeroPadding() from inside bin1
        bin1.displayArray();// calls displayArray() method from inside bin1 object
        System.out.printf("\nCorresponding decimal value of above array: %d", bin1.getDecimalValue()); // prints message to standard output
        System.out.print("\n8 bit number after shuffle "); // prints message to standard output
        bin1.shuffleArray(); // calls shuffleArray() method from inside bin1 object
        bin1.displayArray();// calls displayArray() method from inside bin1 object
        System.out.printf("\nCorresponding decimal value of above array: %d", bin1.getDecimalValue()); // prints message to standard output
        BinaryToDecimalLiam bin2 = new BinaryToDecimalLiam(bin1.reverseArray()); // creates new BinaryToDecimalLiam object called bin2
        System.out.print("\nNew reversed 8 bit number: "); // prints message to standard output
        bin2.displayArray(); // calls displayArray() method from inside bin2 object
        System.out.printf("\nCorresponding decimal value of array: %d", bin2.getDecimalValue());// prints message to standard output
        System.out.print("\n8 bit number after right shift: ");// prints message to standard output
        bin2.shiftRight(); // calls shiftRight() method from inside bin2 object
        bin2.displayArray(); // calls displayArray() method from inside bin2 object
        System.out.printf("\nCorresponding decimal value of array: %d", bin2.getDecimalValue()); // prints message to standard output
        System.out.print("\n8 bit number after shuffle: ");// prints message to standard output
        bin2.shuffleArray(); // calls shuffleArray() method from inside bin2 object
        bin2.displayArray();// calls displayArray() method from inside bin2 object
        System.out.printf("\nCorresponding decimal value of array: %d", bin2.getDecimalValue()); // prints message to standard output
        MyMethod.myFooter(1); // myFooter() call


    }
}
