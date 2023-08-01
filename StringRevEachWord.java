package LogicalPrograms;

public class StringRevEachWord {

	public static void main(String[] args) {
		
		String Str = "Hello good evening";
//		Expected result - gnineve doog olleH
//		Expected = olleH doog gnineve
		
		String[] Word =Str.split(" "); //splited string into words
		
		String RevS = "";
		
		for(String W :Word) { //outer loop
			String StringWord ="";
			
			for(int i=W.length()-1 ; i>=0; i--) { //inner loop
				
				StringWord = StringWord+W.charAt(i);
			}
			RevS =RevS+StringWord+" ";
		}
		System.out.println(RevS);

	}

}
