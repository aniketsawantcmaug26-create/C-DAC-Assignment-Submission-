
public class Problem2 {
	
	static void Problem2() {
		String str=Consoleinput.getString();
		String str2=Consoleinput.getString(); 
		/*
		 * if(str.length()!=str2.length()){ return false; }else { for(int
		 * i=0;i<str.length();i++) { if(str.charAt(i)!=str2.charAt(i)) { return false; }
		 * } } return true;
		 */
		int resu=str.compareTo(str2); 
		System.out.println(resu);
		return ; 
		
	}
}
