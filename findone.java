import java.util.Scanner;

class findone {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter a float: ");
        float num2 = scanner.nextFloat();

        DisplayValues display = new DisplayValues();
        display.displayInteger(num1);
        display.displayFloat(num2);

        scanner.close();
    }
}

class DisplayValues {
    public void displayInteger(int num) {
        System.out.println("The entered integer is: " + num);
    }

    public void displayFloat(float num) {
        System.out.println("The entered float is: " + num);
    }
}