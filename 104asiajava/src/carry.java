import java.util.Scanner;

public class carry {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int c = scn.nextInt();
		int d = scn.nextInt();
		int a, b;
		String ans = "";
		if (c < d && c >= 0) {
			a = c % d;
			ans = a + ans;
		} else {
			a = c % d;
			ans = a + ans;
			while (c / d != 0) {
				c = c / d;
				b = c % d;
				ans = b + ans;
			}
		}
		System.out.println(ans);
	}
}