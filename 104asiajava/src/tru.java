import java.util.*;
public class tru {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int a = scn.nextInt();
		int v1 = a/2;
		int v2 = a-v1;
		for (int i = 0; i < v1; i++) {
			for (int j = 0; j <= v1 - i; j++) {
				System.out.print("*");
			}
			for (int k = 0; k <= 2 * i; k++) {
				System.out.print(" ");
			}
			System.out.println("");
		}
		for (int i = 1; i <= v2; i++) {
			for (int j = 0; j < i ; j++) {
				System.out.print("*");
			}
			for (int k = 0; k < (v2 - i) * 2 + 1; k++) {
				System.out.print(" ");
			}

			System.out.println("");

		}

	}
}
