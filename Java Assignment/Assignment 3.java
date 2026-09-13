/*Question 1 : create a class called ComplexNumber having 2 data members as number1 and number2. Create a pair
of ge-er and se-er for the above. Create a method called computeComplexNumber that will mul&ply
the values of the 2 data members and return it in the form of int. For the above create an array of
ComplexNumber having 5 elements and in a loop ask the user to enter number1 and number2 5 &mes
each such that each object of the ComplexNumber hold appropriate values. Finally call the
computeComplexNumber on each object of the array to display the result.*/


=====================================================================
import java .util.*; 
public class Array {



	public static void main(String[] args) {
		
		ComplexNumber []obj=new ComplexNumber[5]; 
		for(int i=0;i<5;i++) {
			obj[i] = new ComplexNumber();
			obj[i].setnum1(Consoleinput.getInt());
			obj[i].setnum2(Consoleinput.getInt());
		}
		for(int i=0;i<5;i++) {
			System.out.println("Object "+i+"=>"+obj[i].getnum1()+"*"+obj[i].getnum2()+"==>"+obj[i].computeComplexNumber());
		}
	}
}
 class ComplexNumber {
		int num1; 
		int num2; 
		void setnum1(int no) {
			num1=no;
		}
		void setnum2(int no) {
				num2=no;
		}
		int  getnum1() {
			return num1; 
		}
		int getnum2() {
			return num2; 
		}
		float computeComplexNumber() {
			return num1*num2; 
		}
}
/*
 Write a program to print the area and perimeter of a triangle having sides of 3, 4 
and 5 units by creating a class named 'Triangle' with constructor having the three 
sides as its parameters.*/
class Triangle {

    int side1;
    int side2;
    int side3;

    Triangle(int side1, int side2, int side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    int perimeter() {
        return side1 + side2 + side3;
    }

    double area() {

        double s = perimeter() / 2.0;

        return Math.sqrt(
            s * (s - side1) *
            (s - side2) *
            (s - side3)
        );
    }
}

public class Program {

    public static void main(String[] args) {

        Triangle t = new Triangle(3, 4, 5);

        System.out.println("Perimeter = " + t.perimeter());
        System.out.println("Area = " + t.area());
    }
}

/*
 Write a program to print the area of two rectangles having sides (4,5) and (5,8) 
respectively by creating a class named 'Rectangle' with a method named 'area' 
which returns the area and length and breadth passed as parameters to its 
constructor.*/
class Rectangle {

    int length;
    int breadth;

    Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    int area() {
        return length * breadth;
    }
}

public class Program {

    public static void main(String[] args) {

        Rectangle r1 = new Rectangle(4, 5);
        Rectangle r2 = new Rectangle(5, 8);

        System.out.println("Area of Rectangle 1 = " + r1.area());
        System.out.println("Area of Rectangle 2 = " + r2.area());
    }
}

/*
 Print the sum, difference and product of two complex numbers by creating a 
class named 'Complex' with separate methods for each operation whose real and 
imaginary parts are entered by user*/
import java.util.Scanner;

class Complex {

    int real;
    int imaginary;

    Complex(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    void sum(Complex c) {

        int r = real + c.real;
        int i = imaginary + c.imaginary;

        System.out.println("Sum = " + r + " + " + i + "i");
    }

    void difference(Complex c) {

        int r = real - c.real;
        int i = imaginary - c.imaginary;

        System.out.println("Difference = " + r + " + " + i + "i");
    }

    void product(Complex c) {

        int r = (real * c.real) -
                (imaginary * c.imaginary);

        int i = (real * c.imaginary) +
                (imaginary * c.real);

        System.out.println("Product = " + r + " + " + i + "i");
    }
}

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter real part of first number: ");
        int r1 = sc.nextInt();

        System.out.print("Enter imaginary part of first number: ");
        int i1 = sc.nextInt();

        System.out.print("Enter real part of second number: ");
        int r2 = sc.nextInt();

        System.out.print("Enter imaginary part of second number: ");
        int i2 = sc.nextInt();

        Complex c1 = new Complex(r1, i1);
        Complex c2 = new Complex(r2, i2);

        c1.sum(c2);
        c1.difference(c2);
        c1.product(c2);

        sc.close();
    }
}

/*
Write a program that would print the information (name, year of joining, salary, 
address) of three employees by creating a class named 'Employee'. The output 
should be as follows:
Name      
Robert
Sam  
John        
  Year of joining        Address
            1994                64C- WallsStreat
              2000                68D- WallsStreat
        1999    
            26B- WallsStrea

	*/
class Employee {

    String name;
    int yearOfJoining;
    double salary;
    String address;

    Employee(String name, int yearOfJoining,
             double salary, String address) {

        this.name = name;
        this.yearOfJoining = yearOfJoining;
        this.salary = salary;
        this.address = address;
    }

    void display() {

        System.out.println(
            name + "\t\t" +
            yearOfJoining + "\t\t" +
            address
        );
    }
}

public class Program {

    public static void main(String[] args) {

        Employee e1 = new Employee(
            "Robert", 1994, 50000,
            "64C- WallsStreat"
        );

        Employee e2 = new Employee(
            "Sam", 2000, 55000,
            "68D- WallsStreat"
        );

        Employee e3 = new Employee(
            "John", 1999, 60000,
            "26B- WallsStreat"
        );

        System.out.println(
            "Name\t\tYear of joining\t\tAddress"
        );

        e1.display();
        e2.display();
        e3.display();
    }
}

/* Question 6
	Write a program by creating an 'Employee' class having the following methods 
and print the final salary.
1 - 'getInfo()' which takes the salary, number of hours of work per day of employee
as parameter
2 - 'addSal()' which adds $10 to salary of the employee if it is less than $500.
3 - 'addWork()' which adds $5 to salary of employee if the number of hours of 
work per day is more than 6 hours*/

class Employee {

    double salary;
    int hours;

    void getInfo(double salary, int hours) {

        this.salary = salary;
        this.hours = hours;
    }

    void addSal() {

        if (salary < 500) {
            salary = salary + 10;
        }
    }

    void addWork() {

        if (hours > 6) {
            salary = salary + 5;
        }
    }

    void displaySalary() {

        System.out.println("Final Salary = $" + salary);
    }
}

public class Program {

    public static void main(String[] args) {

        Employee e = new Employee();

        e.getInfo(450, 8);

        e.addSal();
        e.addWork();

        e.displaySalary();
    }
}
