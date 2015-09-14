package 第一學期;

import java.util.Scanner;

public class Ex03 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("請輸入發票號碼:");
		int[] arry1 = { 0, 1, 2, 7, 2, 6, 3, 6 };
		int[] arry2 = { 3, 9, 4, 1, 2, 2, 0, 1 };
		int[] arry3 = { 9, 4, 5, 8, 6, 3, 5, 6 };
		String str = scn.nextLine();
		int len = str.length();
		char[] ch_array = str.toCharArray();
		for (int i = 0; i < 8; i++) {
			int number = ch_array[i] - '0';
			if (ch_array[7] == 6 && ch_array[6] == 3 && ch_array[5] == 6) {
				System.out.print("你贏了");

			} else {
			}
		}
	}

}
