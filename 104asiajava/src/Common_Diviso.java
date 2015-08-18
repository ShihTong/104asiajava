import java.util.Scanner;

public class Common_Diviso {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		System.out.print("請輸入第一個整數：");
		int m = scn.nextInt();
		System.out.print("請輸入第二個整數：");
		int n = scn.nextInt();

		System.out.println(GCD(m, n));
	}

	public static int GCD(int m, int n) {
		if (m % n == 0) {
			return n;
		} else {
			return GCD(n, m % n);
		}
	}
}