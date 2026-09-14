/*
 * Qustion 1 :  Create a class with a method that prints "This is parent class" and its subclass 
		with another method that prints "This is child class". Now, create an object for 
		each of the class and call
		1 - method of parent class by object of parent class
		2 - method of child class by object of child class
		3 - method of parent class by object of child class
 */


public class Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		parent p=new parent(); 
		Child c=new Child(); 
		p.prints();
		c.child();
		c.prints();
		

	}
}
class parent{
	void prints() {
		System.out.println("method of parent class by object of parent class  ");
	}
	
}
class Child extends parent{
	void child() {
		System.out.println("method of child class by object of child class ");
	}
}
