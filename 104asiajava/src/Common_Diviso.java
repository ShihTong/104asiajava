import java.util.Scanner;

public class Common_Diviso {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("請輸入第一個整數：");
		int m = scan.nextInt();
		System.out.print("請輸入第二個整數：");
		int n = scan.nextInt();

		System.out.println(Common_Diviso(m, n));
	}

	public static int Common_Diviso(int m, int n) {
		if (m % n == 0) {

		} else {
			return Common_Diviso(n, m % n);
		}
		return n;
	}
}