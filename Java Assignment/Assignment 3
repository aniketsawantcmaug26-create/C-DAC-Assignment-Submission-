Question 1 : create a class called ComplexNumber having 2 data members as number1 and number2. Create a pair
of ge-er and se-er for the above. Create a method called computeComplexNumber that will mul&ply
the values of the 2 data members and return it in the form of int. For the above create an array of
ComplexNumber having 5 elements and in a loop ask the user to enter number1 and number2 5 &mes
each such that each object of the ComplexNumber hold appropriate values. Finally call the
computeComplexNumber on each object of the array to display the result.


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
