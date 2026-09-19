
public class Problem7 {
	
	static void Problem7() {
		System.out.println("Enter a Strint to reverse order : ");
		String str=Consoleinput.getString(); 
		char arr[]=str.toCharArray();
		for(int i=arr.length-1;i>=0;i--) {
			System.out.print(arr[i]);
		}
	}
}
