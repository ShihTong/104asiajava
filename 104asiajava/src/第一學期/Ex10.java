package 第一學期;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("請輸入一字串:");
		String str = scn.nextLine();
		int len = str.length();
		boolean flag = true;
		char a[] = str.toCharArray();
		for (int i = 0; i < len; i++) {
			if (flag == true) {
				if (a[i] == a[len - i - 1]) {
					flag = true;
				} else {
					flag = false;
				}
			}
		}
		if (flag == false) {
			System.out.print("是否為迴文:");
			System.out.println("否");
		} else {
			System.out.print("是否為迴文:");
			System.out.println("是");
		}
	}

}
