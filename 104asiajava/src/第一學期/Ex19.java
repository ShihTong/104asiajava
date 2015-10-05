package 第一學期;

import java.util.Scanner;

public class Ex19 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("請輸入:");
		char ch = scn.next().charAt(0);
		if (ch >= 97 && ch <= 122) {
			System.out.print("小寫");
		} else {
			if (ch >= 65 && ch <= 90) {
				System.out.print("大寫");
			} else {
					System.out.print("其他字元");
				
			}
		}
	}
}
