package JavaCollectionsAdvanced;

import java.util.Arrays;

public class StringConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = " This is my code ";
		s = s.concat("-new-");
		System.out.println(s);
		System.out.println(s.indexOf("i"));
		System.out.println(s.trim());
		System.out.println(s.toLowerCase());
		System.out.println(s.toUpperCase());

		String dob = "30-09-1990";
		System.out.println(dob.replace('-', '/'));
		System.out.println(s.replace(" ", ""));

		String s1 = "hello WORLD";
		String s2 = "hello world";
		System.out.println(s1.equalsIgnoreCase(s2));

		System.out.println(s.contains("code"));
		System.out.println(s.stripLeading());
		System.out.println(s.strip());
		System.out.println(s.replace('i', 'x'));

		String lan = "JAVA,PYTHON,RUBY";
		String[] l = lan.split(",");
		System.out.println(Arrays.toString(l));
		String x = String.join(",", "sfs", "dfsdf", "dfdsf");
		System.out.println(x.isEmpty());
		System.out.println(x);

		String x1 = "as|as|gh";
		String[] ab = x1.split("\\|");
		System.out.println(Arrays.toString(ab));

		String a = "10test";
		a = a.replace("test", "");
		System.out.println(Integer.parseInt(a));

		long x11 = Long.parseLong(a);
		Double x12 = Double.parseDouble(a);
		System.out.println(x11);

		int ad = 10;
		String.valueOf(ad);

		StringBuilder sb = new StringBuilder("test");
		sb.append("pop");
		System.out.println(sb);
		
		String test ="your transaction id is 12345";
		String [] arr = test.split("is");

		System.out.println(arr[1].trim());
		System.out.println(test.substring(23));
		
		

	}

}
