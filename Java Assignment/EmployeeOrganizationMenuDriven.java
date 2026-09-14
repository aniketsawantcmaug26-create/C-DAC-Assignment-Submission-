import java.util.Scanner;

class Employee {

    private int id;
    private String name;
    private double salary;

    // Getter and Setter for ID
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Getter and Setter for Name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter for Salary
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Display
    public void display() {

        System.out.println("ID     : " + id);
        System.out.println("Name   : " + name);
        System.out.println("Salary : " + salary);
    }
}


// ================= MANAGER =================

class Manager extends Employee {

    private String department;

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public void display() {

        System.out.println("----- Manager -----");

        System.out.println("ID         : " + getId());
        System.out.println("Name       : " + getName());
        System.out.println("Salary     : " + getSalary());
        System.out.println("Department : " + department);
    }
}


// ================= ENGINEER =================

class Engineer extends Employee {

    private String technology;

    public String getTechnology() {
        return technology;
    }

    public void setTechnology(String technology) {
        this.technology = technology;
    }

    @Override
    public void display() {

        System.out.println("----- Engineer -----");

        System.out.println("ID         : " + getId());
        System.out.println("Name       : " + getName());
        System.out.println("Salary     : " + getSalary());
        System.out.println("Technology : " + technology);
    }
}


// ================= SALES PERSON =================

class SalesPerson extends Employee {

    private double sales;

    public double getSales() {
        return sales;
    }

    public void setSales(double sales) {
        this.sales = sales;
    }

    @Override
    public void display() {

        System.out.println("----- Sales Person -----");

        System.out.println("ID     : " + getId());
        System.out.println("Name   : " + getName());
        System.out.println("Salary : " + getSalary());
        System.out.println("Sales  : " + sales);
    }
}


// ================= ENTRY / MAIN =================

public class Entry {

    static Employee[] employees = new Employee[100];

    static int count = 0;

    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {

        while (true) {

            System.out.println("\n==========================");
            System.out.println("      EMPLOYEE MENU");
            System.out.println("==========================");

            System.out.println("1. Add");
            System.out.println("2. Display");
            System.out.println("3. Exit");

            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();


            switch (choice) {

            case 1:
                addEmployee();
                break;

            case 2:
                displayEmployees();
                break;

            case 3:
                System.out.println("Program exited.");
                return;

            default:
                System.out.println("Invalid choice.");
            }
        }
    }


    // ================= ADD MENU =================

    public static void addEmployee() {

        while (true) {

            System.out.println("\n--------------------------");
            System.out.println("       ADD EMPLOYEE");
            System.out.println("--------------------------");

            System.out.println("1. Manager");
            System.out.println("2. Engineer");
            System.out.println("3. Sales Person");
            System.out.println("4. Back");

            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();


            switch (choice) {

            case 1:
                addManager();
                break;

            case 2:
                addEngineer();
                break;

            case 3:
                addSalesPerson();
                break;

            case 4:
                return;

            default:
                System.out.println("Invalid choice.");
            }
        }
    }


    // ================= ADD MANAGER =================

    public static void addManager() {

        Manager m = new Manager();

        System.out.print("Enter Manager ID: ");
        m.setId(sc.nextInt());

        System.out.print("Enter Manager Name: ");
        m.setName(sc.next());

        System.out.print("Enter Manager Salary: ");
        m.setSalary(sc.nextDouble());

        System.out.print("Enter Department: ");
        m.setDepartment(sc.next());

        employees[count] = m;

        count++;

        System.out.println("Manager added successfully.");
    }


    // ================= ADD ENGINEER =================

    public static void addEngineer() {

        Engineer e = new Engineer();

        System.out.print("Enter Engineer ID: ");
        e.setId(sc.nextInt());

        System.out.print("Enter Engineer Name: ");
        e.setName(sc.next());

        System.out.print("Enter Engineer Salary: ");
        e.setSalary(sc.nextDouble());

        System.out.print("Enter Technology: ");
        e.setTechnology(sc.next());

        employees[count] = e;

        count++;

        System.out.println("Engineer added successfully.");
    }


    // ================= ADD SALES PERSON =================

    public static void addSalesPerson() {

        SalesPerson s = new SalesPerson();

        System.out.print("Enter Sales Person ID: ");
        s.setId(sc.nextInt());

        System.out.print("Enter Sales Person Name: ");
        s.setName(sc.next());

        System.out.print("Enter Sales Person Salary: ");
        s.setSalary(sc.nextDouble());

        System.out.print("Enter Total Sales: ");
        s.setSales(sc.nextDouble());

        employees[count] = s;

        count++;

        System.out.println("Sales Person added successfully.");
    }


    // ================= DISPLAY =================

    public static void displayEmployees() {

        if (count == 0) {

            System.out.println("No employees available.");

            return;
        }

        System.out.println("\n==========================");
        System.out.println("     EMPLOYEE DETAILS");
        System.out.println("==========================");


        for (int i = 0; i < count; i++) {

            employees[i].display();

            System.out.println();
        }
    }
}
