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
		char[] arry1 = { 0, 1, 2, 7, 2, 6, 3, 6 };
		char[] arry2 = { 3, 9, 4, 1, 2, 2, 0, 1 };
		char[] arry3 = { 9, 4, 5, 8, 6, 3, 5, 6 };
		String str = scn.nextLine();
		char[] ch_array = str.toCharArray();
		for (int i = 0; i < 8; i++) {
			if ((ch_array[0] == '0' && ch_array[1] == '1' && ch_array[2] == '2' && ch_array[3] == '7'
					&& ch_array[4] == '2' && ch_array[5] == '6' && ch_array[6] == '3' && ch_array[7] == '6')
					|| (ch_array[0] == '3' && ch_array[1] == '9' && ch_array[2] == '4' && ch_array[3] == '1'
							&& ch_array[4] == '2' && ch_array[5] == '2' && ch_array[6] == '0' && ch_array[7] == '1')
					|| (ch_array[0] == '9' && ch_array[1] == '4' && ch_array[2] == '5' && ch_array[3] == '8'
							&& ch_array[4] == '6' && ch_array[5] == '3' && ch_array[6] == '5' && ch_array[7] == '6')) {
				System.out.print("你贏了200000元");
				break;
			}
			if ((ch_array[1] == '1' && ch_array[2] == '2' && ch_array[3] == '7' && ch_array[4] == '2'
					&& ch_array[5] == '6' && ch_array[6] == '3' && ch_array[7] == '6')
					|| (ch_array[1] == '9' && ch_array[2] == '4' && ch_array[3] == '1' && ch_array[4] == '2'
							&& ch_array[5] == '2' && ch_array[6] == '0' && ch_array[7] == '1')
					|| (ch_array[1] == '4' && ch_array[2] == '5' && ch_array[3] == '8' && ch_array[4] == '6'
							&& ch_array[5] == '3' && ch_array[6] == '5' && ch_array[7] == '6')) {
				System.out.print("你贏了40000元");
				break;
			}
			if ((ch_array[2] == '2' && ch_array[3] == '7' && ch_array[4] == '2' && ch_array[5] == '6'
					&& ch_array[6] == '3' && ch_array[7] == '6')
					|| (ch_array[2] == '4' && ch_array[3] == '1' && ch_array[4] == '2' && ch_array[5] == '2'
							&& ch_array[6] == '0' && ch_array[7] == '1')
					|| (ch_array[2] == '5' && ch_array[3] == '8' && ch_array[4] == '6' && ch_array[5] == '3'
							&& ch_array[6] == '5' && ch_array[7] == '6')) {
				System.out.print("你贏了10000元");
				break;
			}
			if ((ch_array[3] == '7' && ch_array[4] == '2' && ch_array[5] == '6' && ch_array[6] == '3'
					&& ch_array[7] == '6')
					|| (ch_array[3] == '1' && ch_array[4] == '2' && ch_array[5] == '2' && ch_array[6] == '0'
							&& ch_array[7] == '1')
					|| (ch_array[3] == '8' && ch_array[4] == '6' && ch_array[5] == '3' && ch_array[6] == '5'
							&& ch_array[7] == '6')) {
				System.out.print("你贏了4000元");
				break;
			}
			if ((ch_array[4] == '2' && ch_array[5] == '6' && ch_array[6] == '3' && ch_array[7] == '6')
					|| (ch_array[4] == '2' && ch_array[5] == '2' && ch_array[6] == '0' && ch_array[7] == '1')
					|| (ch_array[4] == '6' && ch_array[5] == '3' && ch_array[6] == '5' && ch_array[7] == '6')) {
				System.out.print("你贏了1000元");
				break;

			}
			if ((ch_array[5] == '6' && ch_array[6] == '3' && ch_array[7] == '6')
					|| (ch_array[5] == '2' && ch_array[6] == '0' && ch_array[7] == '1')
					|| (ch_array[5] == '3' && ch_array[6] == '5' && ch_array[7] == '6')) {
				System.out.print("你贏了200元");
				break;
			}
		}
	}
}
