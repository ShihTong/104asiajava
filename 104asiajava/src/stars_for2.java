import java.util.Scanner;

public class stars_for2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int c = scn.nextInt();
		for (int i = 0; i < c; i++) {
			for (int j = 0; j <= c - i - 1; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k <= 2 * i; k++) {
				System.out.print("*");
			}

			System.out.println(" ");

		}

	}

}
