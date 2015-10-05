package 第一學期;

import java.util.Scanner;

public class Ex16 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("請輸入數字:");
		int a = scn.nextInt();
		if (a % 2 == 1) {
			System.out.print("這是奇數");
		}
		if (a % 2 == 0) {
			System.out.print("這是偶數");
		}
	}

}
