import java.util.Scanner;

class ElectricityBillCalculator {
    private int units;
    private double totalBill;

    public void setUnits(int units) {
        this.units = units;
    }

    public double getTotalBill() {
        return totalBill;
    }

    public void calculateBill() {
        if (units <= 50) {
            totalBill = units * 0.5;
        } else if (units <= 100) {
            totalBill = 50 * 0.5 + (units - 50) * 0.75;
        } else if (units <= 200) {
            totalBill = 50 * 0.5 + 50 * 0.75 + (units - 100) * 1.2;
        } else {
            totalBill = 50 * 0.5 + 50 * 0.75 + 100 * 1.2 + (units - 200) * 1.5;
        }
    }
}
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of units consumed: ");
        int unitsConsumed = scanner.nextInt();

        ElectricityBillCalculator calculator = new ElectricityBillCalculator();
        calculator.setUnits(unitsConsumed);
        calculator.calculateBill();

        System.out.println("Total electricity bill: $" + calculator.getTotalBill());

        scanner.close();
    }
}
