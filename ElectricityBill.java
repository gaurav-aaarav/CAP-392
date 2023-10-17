import java.util.Scanner;

public class ElectricityBill
 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the units consumed: ");
        int unitsConsumed = scanner.nextInt();

        double totalBill;

        if (unitsConsumed <= 100) {
            totalBill = unitsConsumed * 2;
        } else if (unitsConsumed <= 200) {
            totalBill = 100 * 2 + (unitsConsumed - 100) * 2.5;
        } else {
            totalBill = 100 *2 + 100 * 2.5 + (unitsConsumed - 200) * 4.5;
        }

        System.out.println("Total Electricity Bill: " + totalBill);

        scanner.close();
    }
}
