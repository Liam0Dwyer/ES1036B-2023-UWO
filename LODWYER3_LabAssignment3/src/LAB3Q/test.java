package LAB3Q;
import
import java.util.Scanner;


public class test {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int counter = 0;
        char choice;
        boolean running = true;
        int x = input.nextInt();
        int[] arrA = new int[100];
        while(running) {
            System.out.printf("please enter number %d", ++counter);
            arrA[counter] = input.nextInt();
            System.out.println("would you like to enter another number?");
            choice = input.next().charAt(0);
            while (true) {
                if (choice == 'n' || choice == 'N') {
                    running = false;
                    break;
                } else if (choice == 'Y' || choice == 'y')
                    break;
                else
                    System.out.println("please enter Y or N");
            }
        }
        int highestNumber = arrA[0];
        int lowestNumber = arrA[0];
        for (int i = 0; i<=counter;i++)
        {
            System.out.printf("Array[%d]=%d", i, arrA[i]);
            if (arrA[i]<lowestNumber)
                lowestNumber = arrA[i];
            if (arrA[i]>highestNumber)
                highestNumber = arrA[i];
            }
        System.out.printf("Highest number: %d\nLowest number: %d", highestNumber, lowestNumber);
    }
}
