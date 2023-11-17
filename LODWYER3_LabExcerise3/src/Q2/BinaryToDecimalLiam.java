package Q2;
import LAB3Q.MyMethod; // importing MyMethod class for myPow() method

public class BinaryToDecimalLiam { // class header
    private int[] binaryArray; // private int array declaration
    public BinaryToDecimalLiam() // Default constructor, this is in the UML diagram but never used, good to have to prevent a possible error though
    {

    }
    public BinaryToDecimalLiam(int[] myArray) // Constructor with int array argument, sets private binaryArray to passed array
    {
        binaryArray = myArray; // sets binaryArray equal to the passed array
    }
    public void displayArray() // displayArray() method header
    {
        System.out.print("["); // prints starting bracket to standard output
        for(int i=0; i<binaryArray.length;i++) // for loop runs binaryArray.length number of times
        {
            System.out.print(binaryArray[i]+" "); // prints value of array at position i and a space
            if (i==binaryArray.length-1) // if statement runs on last loop iteration
            {
                System.out.print("\b"); // prints backspace character to get rid of final space
            }
        }
        System.out.print("]"); // prints end bracket to standard output
    }
    public int getDecimalValue() //getDecimalValue method header
    {
        int sum = 0;  // sum definition - equals zero
        for (int i =0; i< binaryArray.length;i++) //for loop run the binaryArray.length times
        {
            sum += (binaryArray[i]*MyMethod.myPow(2,binaryArray.length-1-i)); // sum of binaryArray Elements
        }
        return sum; // method returns sum
    }
    public void doubleTheSizeZeroPadding() // method definition
    {
        int[] secondArray = new int[binaryArray.length*2]; // new binaryArray object secondArray in heap
        System.arraycopy(binaryArray,0, secondArray, binaryArray.length, binaryArray.length); // copies binaryArray to back half of the second array
        binaryArray = secondArray; // sets the original binArray array equal to the secondArray
    }
    public int[] reverseArray() // method definition
    {
        int[] secondArray = new int[binaryArray.length]; // new binaryArray object secondArray in heap
        for(int i = 0; i< binaryArray.length;i++) //for loop run the binaryArray.length times
        {
            secondArray[i]=binaryArray[binaryArray.length-1-i]; // reverses array
        }
        return secondArray; // return secondArray object
    }
    public void shiftRight() // method definition
    {
        {
            int[] arrayB = new int[binaryArray.length]; // new array object arrayB
            arrayB[0]= binaryArray[binaryArray.length-1]; // first element of arrayB set equal to last element of binaryArray
            for (int i=1;i<binaryArray.length;i++) // copies the rest of the array, starting at position 1 and running binaryArray.length -1 times
            {
                arrayB[i] = binaryArray[i-1]; // shifts array to left
            }
            binaryArray = arrayB; //sets original binaryArray equal to arrayB
        }
    }
    public void shuffleArray() // method header
    {
        int j = 0; // int declaration
        int k = 0; // int declaration
        for(int i = 0; i<binaryArray.length; i++) { // for loop runs binaryArray.length times
             j = (int)(Math.random() * binaryArray.length); // sets j equal to a random number between 0 - binaryArray.length
             k = binaryArray[i]; // sets k equal to value of binaryArray[i]
             binaryArray[i]=binaryArray[j];
             binaryArray[j] = k;
            // swaps binaryArray[i] and binaryArray[j]
        }
    }
}
