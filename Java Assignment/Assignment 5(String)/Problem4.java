public class Problem4 {
	
	static void Problem4() {
		String str=Consoleinput.getString(); 
		for(int i=0;i<str.length();i++) {
			
			char ch=str.charAt(i);  
			
			if(ch>='a'&&ch<='z'||ch>='A'&&ch<='Z') {
				System.out.println(ch+" : "+i);
			}
		}
	}
	
}
