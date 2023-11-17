package LAB3Q;
// This is review for quiz 1, don't waste time commenting this shit - Liam
public class QuizReview {
        public static void main(String[] args) {
            int r = random();
            if (r==0)
            {
                r = 1;
            }
            int[] array = new int[r];
            populateArray(array);
            System.out.printf("\nArray forewards: ");
            printArray(array);
            System.out.printf("\nArray Backwards: ");
            printArrayBackwards(array);
            System.out.printf("\nForewards Shift left: ");
            printArray(shiftLeft(array));
            System.out.printf("\nBackwards shift left: ");
            printArrayBackwards(shiftLeft(array));
            System.out.printf("\nForwards shift right: ");
            printArray(shiftRight(array));
            System.out.printf("\nBackwards shift right: ");
            printArrayBackwards(shiftRight(array));
            int highest = array[0];
            int lowest = array[0];
            int sum = 0;
            for (int i=0; i<array.length; i++)
            {
                sum +=array[i];
                if (array[i]>highest)
                {
                    highest = array[i];
                }
                if (array[i]<lowest)
                {
                    lowest = array[i];
                }
            }
            System.out.printf("\nHighest: %d \nLowest: %d", highest, lowest);
            System.out.printf(" \nSum: %d\nAverage: %.2f",  sum, (double)sum/r);


        }
        public static int random()
        {
            return (int)(10*Math.random());
        }
        public static int[] shiftLeft(int[] anyArray)
        {
            int[] arrayB = new int[anyArray.length];
            arrayB[anyArray.length-1] = anyArray[0];
            for (int i =0; i<anyArray.length-1;i++)
            {
                arrayB[i]=anyArray[i+1];
            }
            return arrayB;
        }
        public static int[] shiftRight(int[] anyArray)
        {
            int[] arrayB = new int[anyArray.length];
            arrayB[0]=anyArray[anyArray.length-1];
            for (int i=1;i<anyArray.length;i++)
            {
                arrayB[i] = anyArray[i-1];
            }
            return arrayB;
        }
        public static void printArray(int[] anyArray)
        {
            System.out.print("[");
            for (int i = 0; i<anyArray.length; i++)
            {
              if (i!=0)
                  System.out.print(',');
                System.out.print(anyArray[i]);
            }
            System.out.print("]");
        }
        public static void printArrayBackwards(int[] anyArray)
        {
            System.out.print("[");
            for (int i = anyArray.length-1; i>=0; i--)
            {
                if (i!=anyArray.length-1)
                    System.out.print(',');
                System.out.print(anyArray[i]);
            }
            System.out.print("]");
        }
        public static void populateArray(int[] anyArray)
        {
            for(int i=0; i<anyArray.length;i++)
            {
                anyArray[i]=random();
            }
        }
}
