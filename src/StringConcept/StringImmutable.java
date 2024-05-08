package StringConcept;

import java.util.Arrays;

public class StringImmutable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuilder sb = new  StringBuilder();
		sb.append("Automation");
		System.out.println(sb);
		
		String s = "This is my java code i am so happy";
		System.out.println(s.indexOf('i'));//2
		System.out.println(s.indexOf('i', (s.indexOf('i')+1)));//5
		int x=s.indexOf('i', (s.indexOf('i')+1));
		System.out.println(x);//5
		System.out.println(s.indexOf('i', x+1));//21
		System.out.println(s.indexOf("testing"));
		
		String dob = "12-12-1990";
		String x1 = dob.replace('-', '/');
		System.out.println(x1);
		
		String browser = "CHROME ";
		if(browser.trim().equalsIgnoreCase("chrome")) {
			System.out.println("true");
		}
		
		String lang = "JAVA_PYTHON_RUBY";
		String l1[] = lang.split("_");
		System.out.println(Arrays.toString(l1));
		String x3="";
		for(int i=0;i<l1.length;i++) {
			x3+=l1[i];
		}
		System.out.println(x3);
		
		String st5 = "madhave|pune|Mumbai|6300";
		String c[] = st5.split("\\|");
		for(String e:c) {
			System.out.println(e);
		}
		
		
		
		
		
		

	}

}
