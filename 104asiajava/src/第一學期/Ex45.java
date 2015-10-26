package 第一學期;
import java.util.*;
public class Ex45 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int a = scn.nextInt();
		for (int i = 0; i < a; i++) {
			for (int j = 0; j <= a - i - 2; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k <= 2 * i; k++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

}
