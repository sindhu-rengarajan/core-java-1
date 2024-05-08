package JavaCollectionsAdvanced;

//Input - A#G&T*J$W&
//Output - W#J&T*G$A&
//W#J&T*G$A&
public class StringReverse {

	public static String approach1(String str) {
		StringBuilder sb = new StringBuilder(str);
		int n = str.length();
		int l = 0, r = n - 1;
		while (l <= r) {

			while (!(str.charAt(l) >= 65 && str.charAt(l) <= 90)) {
				l++;
			}

			while (!(str.charAt(r) >= 65 && str.charAt(r) <= 90)) {
				r--;
			}

			char temp = str.charAt(l);
			sb.setCharAt(l, str.charAt(r));
			sb.setCharAt(r, temp);
			l++;
			r--;

		}
		return sb.toString();

	}

	public static String reverse(String str) {
		int n = str.length();
		int l = 0;
		int r = n - 1;
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

	public static void swap(char ch1, char ch2) {
		char temp = ch1;
		ch1 = ch2;
		ch2 = temp;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "Sindhu";
		String str = "AA#G&T*J$WO&";

		System.out.println(approach1(str));

	}

}
