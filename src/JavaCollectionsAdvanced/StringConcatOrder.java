package JavaCollectionsAdvanced;

import java.util.Arrays;


//Word1 = "ABC"
//Word2 = "PQRST"

//Output = "APBQCRST"

public class StringConcatOrder {

	public static void test(String str1, String str2) {
		int m = str1.length();
		int n = str2.length();
		int x = Math.min(m, n);
		char[] op = new char[m + n];
		int j = 0;
		int i = 0;

		while (i < x) {
			op[j++] = str1.charAt(i);
			op[j++] = str2.charAt(i);
			i++;
		}

		while (x < n) {
			op[j++] = str2.charAt(x++);
		}

		while (x < m) {
			op[j++] = str1.charAt(x++);
		}

		System.out.println(String.valueOf(op));

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test("ABC", "PQRST");

	}

}
