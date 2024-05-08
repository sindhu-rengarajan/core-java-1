package JavaCollectionsAdvanced;

import java.util.Arrays;
import java.util.Collections;

public class StringBuilder12 {

	@SuppressWarnings("unused")
	public static String test(String str) throws MyException {
		int n = str.length();
		int l = 0, r = n - 1;
		if (str == null) {
			throw new MyException("Null value entered");
		}
		if (str.length() == 0 || str.length() == 1) {
			return str;
		}
		StringBuilder sb = new StringBuilder(str);
		while (l <= r) {
			char temp = str.charAt(l);
			sb.setCharAt(l, str.charAt(r));
			sb.setCharAt(r, temp);
			l++;
			r--;
		}
		return sb.toString();
	}

	public static String test1(String str) {
	StringBuilder sb = new StringBuilder(str);
	sb.reverse();
	return sb.toString();
	}

	public static void main(String[] args) throws MyException {
		// TODO Auto-generated method stub

		//char[] ans = test1("Sindhu");
		//System.out.println(Arrays.toString(ans));

		System.out.println(test1("sasqwe"));

	}

}
