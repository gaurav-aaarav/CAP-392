public class Employee {
    private int x = 10;
    private static int y = 20;

    class Inner {
        public void m1() {
            System.out.println("Instance variable: " + x + ", Static variable: " + y);
        }
    }

    public static void main(String[] args) {
        Employee o = new Employee();
        Employee.Inner in = o.new Inner();
        in.m1();
    }
}