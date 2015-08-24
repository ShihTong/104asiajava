import java.util.Scanner;

public class for_small_fresh_meat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入正方形.菱形.三角形:");
		String str = scn.nextLine();
		System.out.println("請輸入高度:");
		int c = scn.nextInt();
		System.out.println("請輸入字元:");
		String str1 = scn.next();
		char[] ch = str1.toCharArray();
		if (str.equals("菱形")) {
			double v1 = Math.ceil(c / 2);
			double v2 = c - v1;
			if (c % 2 == 0) {
				System.out.println("請輸入奇數");
			} else {
				for (int i = 0; i < v1; i++) {
					for (int j = 0; j <= v1 - i - 1; j++) {
						System.out.print(" ");
					}
					for (int k = 0; k <= 2 * i; k++) {
						System.out.print(ch);
					}
					System.out.println("");
				}
				for (int i = 1; i <= v2; i++) {
					for (int j = 0; j < i - 1; j++) {
						System.out.print(" ");
					}
					for (int k = 0; k < (v2 - i) * 2 + 1; k++) {
						System.out.print(ch);
					}

					System.out.println("");

				}

			}
		} else {
			if (str.equals("三角形")) {
				for (int i = 0; i < c; i++) {
					for (int j = 0; j <= c - i - 1; j++) {
						System.out.print(" ");
					}
					for (int k = 0; k <= 2 * i; k++) {
						System.out.print(ch);
					}

					System.out.println(" ");

				}

			} else {
				if (str.equals("正方形")) {
					for (int i = c; i > 0; i--) {
						for (int j = c; j > 0; j--) {
							System.out.print(ch);
						}
						System.out.println(ch);
					}

				}
			}

		}
	}
}
