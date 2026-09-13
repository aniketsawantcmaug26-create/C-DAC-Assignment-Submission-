import java .util.*; 
public class Array {



	public static void main(String[] args) {
		
		// Question 1 :. Write a Java program to sort an numeric array. The size of the array will be taken from the user, aer
		//              he specifies the size all the elements of the array will be taken as input and the arryay will be sorted.
		System.out.println("Enter the size of the array ");
		int size=Consoleinput.getInt(); 
		int arr[]=new int[size]; 
		for(int i=0;i<size;i++) {
			arr[i]=Consoleinput.getInt(); 
		}
		Arrays.sort(arr); 
		for(int j=0;j<size;j++) {
			System.out.println(arr[j]+" ");
		}
			
		/*
		  Question 2  :Write a Java program to sum values of an array
		 */
		int sum=0; 
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i]; 
		}
		System.out.println("Sum of array element is : "+sum);
		
		/*
		  Question 3 : Write a Java program to calculate average value of an array elements
		 */
		int average=sum/5; 
		System.out.println("Average of array "+average);
		
		/*
		 * Question 4 :  Write a Java program to copy an array by itera&ng the array
		 */
		int arr2[]=new int[arr.length] ;
		for(int i=0;i<arr.length;i++) {
			arr2[i]=arr[i]; 
		}
		
		/*
		   Question 5 : Write a Java program to find the maximum and minimum value of an array.

		 */
		int largest=Integer.MIN_VALUE;
		int smallest =Integer.MAX_VALUE; 
		for(int i=0;i<arr2.length;i++) {
			if(largest<arr[i]) {
				largest=arr[i]; 
			}
			if(smallest>arr[i]) {
				smallest=arr[i]; 
			}
		}
		System.out.println("Smallest no is : "+smallest);
		System.out.println("Largest no is  : "+largest);
		
		/*
		 Question 6:  Write a Java program to reverse an array of integer value
		 */
		for(int i=arr.length-1;i>=0;i-- ) {
			System.out.println(arr[i]+" ");
		}
		/*
		 * Question 7:  Write a Java program to find the duplicate values of an array of integer values
		 */
		for(int i=1;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					System.out.println("Duplicate elementn is : "+arr[i]);
				}
			}
		}
		/*
		 * Questino 8 : Write a Java program to find the duplicate values of an array
		 */
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr2.length;j++) {
				if(arr[i]==arr[j]&&i!=j) {
					System.out.println("Duplicate element is : "+arr[i]);
				}
			}
		}
		
		/*
		  Question  9: Modify exercise 2 to accept 2 different values in 2 different arrays and find the common elements
between two arrays
		 */
		
		for(int i=1;i<arr.length;i++) {
			for(int j=1;j<arr2.length;j++) {
				if(arr[i]==arr[j]&&i!=j) {
					System.out.println("common value : "+arr[i]);
				}
			}
		}
	}
	
}
