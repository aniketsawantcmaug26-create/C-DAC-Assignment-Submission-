
public class ForLoop {

	public static void main(String[] args) {
		
	   // Question 1 Using for loops write a Java Program to display all odd 
		//numbers from 1 to 1000
		
		for(int itemp=1;itemp<=1000;itemp++) {
				if(!(itemp%2==0)) {
					System.out.println("Odd no : "+itemp);
				}
		}
		//Question 2:  using for loops write a Java Program to display all even 
		//numbers from 1 to 500.
		
		for(int itemp=1;itemp<=500;itemp++) {
			if(itemp%2==0) {
				System.out.println("Even no "+itemp);
			}
		}
		/* Question 3 : using for loops write a Java Program to display every 7th 
		                number from 1 to 200                   */
		for(int itemp=1;itemp<=200;itemp++) {
			if(itemp%7==0) {
				System.out.println("7th no is : "+itemp);
			}
		}
		/*
		 .  Question 4 : Using For loops write a program to display the following 
          pattern
				*
				**
				***
				****
				*****
		 */
		for(int itemp=1;itemp<=5;itemp++) {
			for(int jtemp=1;jtemp<=itemp;jtemp++) {
				System.out.print("*");
			}
			System.out.println();
		}
		/*
		 Question  5. Using for loops write a program to display the following 
				pattern
				*****
				****
				***
				**
				*	
		 */
		System.out.println(" ");
		for(int itemp=1;itemp<=5;itemp++) {
			for(int jtemp=5;jtemp>=itemp;jtemp--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		/*
		  6. Using for loops write a program to display the following 
			pattern
			1
			2 3
			4 5 6
			7 8 9 1
		 */
		int count=1;
		for(int itemp=1;itemp<=4;itemp++){
			for(int jtemp=1;jtemp<=itemp;jtemp++) {
				System.out.print(count+" ");
				count++; 
			}
			System.out.println();
		}
		/*
		 Question 7:  Using for loops write a program to display the following 
			pattern
			1
			1 2 
			1 2 3
			1 2 3 4
			1 2 3 4 5
			1 2 3 4 5 6
		 */
		for(int itemp=1;itemp<=6;itemp++) {
			for(int jtemp=1;jtemp<=itemp;jtemp++) {
				System.out.print(jtemp+" ");
			}
			System.out.println();
		}
		
		/*
		 * . Using for loops write a program to display the following 
			pattern
			1 2 3 4 5 6
			1 2 3 4 5
			1 2 3 4
			1 2 3
			1 2 
			1
		 */
		System.out.println();
		for(int itemp=1;itemp<=6;itemp++) {
			for(int jtemp=1;jtemp<=(6-itemp+1);jtemp++) {
				System.out.print(jtemp+" ");
			}
			System.out.println();
		}
		/*
		     * 
		    * * 
		   * * * 
		  * * * * 
		 * * * * * 
		 
		 */
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5-i;j++) { // this forlloop used to print space 
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {  // this used to print star 
				System.out.print("*"+" ");
			}
			System.out.println();
		}
		
	}

}
