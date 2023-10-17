import java.util.Scanner;

public class numarray {
    public static void main(String args[]) {
        int[] numArray = new int[5];
        int i, sum = 0;
        float average; 
        Scanner input = new Scanner(System.in);

        System.out.println("Enter 5 Subject marks =>");
        for (i = 0; i < 5; i++) {
            numArray[i] = input.nextInt();
            sum += numArray[i]; 
        }

        for (i = 0; i < numArray.length; i++) {
            System.out.println("Subject " + i + " Marks = " + numArray[i]);
        }

        average = (float) sum / numArray.length;

        System.out.println("SUM Marks = " + sum); 
        System.out.println("Average Marks = " + average);
    }
}
