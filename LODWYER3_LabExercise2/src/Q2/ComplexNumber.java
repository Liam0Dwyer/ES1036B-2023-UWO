package Q2;

public class ComplexNumber {
    private double real; // the real part of the complex number
    private double imaginary; // the imaginary part of the complex number

    // Default constructor that initializes the real and imaginary parts to zero
    public ComplexNumber()
    {
        real = 0;
        imaginary = 0;
    }

    // Constructor that initializes the real and imaginary parts to the values passed in as parameters
    public ComplexNumber(double re, double im)
    {
        real = re;
        imaginary = im;
    }

    // Getter method for the real part of the complex number
    public double getReal()
    {
        return real;
    }

    // Getter method for the imaginary part of the complex number
    public double getImaginary()
    {
        return imaginary;
    }

    // Method to calculate the magnitude of the complex number
    public double getMagnitude()
    {
        return Math.sqrt((Math.pow(real,2)+Math.pow(imaginary,2)));
    }

    // Method to calculate the angle (in degrees) of the complex number
    public double getAngle()
    {
        return Math.toDegrees(Math.atan2(imaginary, real));
    }

    // Method that displays the number in rectangular form
    public void displayRecForm()
    {
        if (imaginary >= 0)
        {
            System.out.printf("\n%.2f + %.2fi", real, imaginary);
        }
        else
        {
            System.out.printf("\n%.2f - %.2fi", real, Math.abs(imaginary));
        }
    }
}