class Employee {
    private String name;
    private int employeeId;
    private double salary;

    public Employee(String name, int employeeId, double salary) {
        this.name = name;
        this.employeeId = employeeId;
        this.salary = salary;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Salary: $" + salary);
    }
}

class Worker extends Employee {
    private String role;

    public Worker(String name, int employeeId, double salary, String role) {
        super(name, employeeId, salary);
        this.role = role;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Role: " + role);
    }
}

class Clerk extends Employee {
    private String department;

    public Clerk(String name, int employeeId, double salary, String department) {
        super(name, employeeId, salary);
        this.department = department;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Department: " + department);
    }
}

class Manager extends Employee {
    private String team;

    public Manager(String name, int employeeId, double salary, String team) {
        super(name, employeeId, salary);
        this.team = team;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Team: " + team);
    }
}

public class main {
    public static void main(String[] args) {
        Worker worker = new Worker("John Doe", 
