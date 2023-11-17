package Q2;

public class WeeklySaleDataLiam { // class header
    private double[] sale; // declaration of private sale variable
    public WeeklySaleDataLiam()
    {
        this.sale = null;
    } // default constructor
    public WeeklySaleDataLiam(double[] arr)
    {
        this.sale = arr;
    } // constructor with double array argument
    public double getAverageSale() // method header
    {
        double total = 0; // declaration and initialization of double total
        for (int i = 0; i < sale.length ; i++) // for loop runs sale.length times
        {
            total += sale[i]; // sums all the elements of sale array
        }
        return total/sale.length; // returns the total sum of all elements divided by the length of the array

    }
    public double getHighestSale() // method header
    {
        int maxpos = 0; // int declaration and initialization
        for (int i = 0; i < sale.length ; i++) // for loop runs sale.length times
        {
            if (sale[i]>sale[maxpos]) // if at the current position, the value of sale is greater than the value of sale at the previous max position
                maxpos = i; // set maxpos equal to the current position
        }
        return sale[maxpos]; // return the value of sale at position maxpos
    }
    public double getLowestSale() // method header
    {
        int minpos = 0; // int declaration and initialization
        for (int i = 0; i < sale.length ; i++) // for loop runs sale.length times
        {
            if (sale[i]<sale[minpos]) // if value of sale at current position is less than the value of sale at the previous minimum position
                minpos = i; // set minpos equal to current position
        }
        return sale[minpos]; // return value of sale at minpos
    }
    public void displaySaleData() // method header
    {
        System.out.printf("["); // prints message to standard output
        for (int i = 0; i < sale.length ; i++) // for loop runs sale.length times
        {
            System.out.printf("%.2f ",sale[i]); // prints message to standard output
            if (i == sale.length-1) // if i is in the last position of array sale do the following
                System.out.print("\b"); // prints backspace character
        }
        System.out.print("]"); // prints message to standard output
    }
    public double getStandardDeviation() // method header
    {
        double mean = getAverageSale(); // double declaration and initialization
        double res=0; // double declaration and initialization
        for (int i=0; i<sale.length; i++) // for loop runs sale.length times
        {
            res += Math.pow((sale[i]-mean),2); // res is the sum of the value of sale at i, minus the mean, squared
        }
        return Math.sqrt(res/sale.length); // returns the square root of result over sale.length
    }

}
