package StringConcept;

public class StringManipulation {
	
	public static String revString(String x) {
		String rev ="";
		
		if(x==null) {
			return "Nothing";
		}
		if(x.length()==1){
			return x;
		}
		
		for(int i=x.length()-1;i>=0;i--) {
			
			rev+=x.charAt(i);
		}
		return rev;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(revString(""));
		
		String c1= "ssdfdsf12";
		StringBuilder x = new StringBuilder(c1);
		System.out.println(x.reverse());
	}

}
