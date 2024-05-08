package StringConcept;

public class StringConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "i like this program very much";
		String s[] = s1.split(" ");
		String s2 = "";
		for(int i = s.length-1;i>=0;i--) {
		s2 = s2+s[i]+" ";	
		}
		System.out.println(s2);
		
		
		String s3= "Hello";
		String s4 = "hello";
		System.out.println(s3.equals(s4));
		
		String st1 = new String("Hello");
		String st2 = new String("Hello");
		
		String test = new String("Selenium");
		String t1= test.intern();
		System.out.println(t1);

	}

}
