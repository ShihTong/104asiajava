package 第一學期;

import java.util.Scanner;

public class Ex06 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("輸入字母:");
		String str = scn.next();
		char[] ch = str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] >= 97 && ch[i] <= 122) {
				System.out.print("小寫");
				break;
			} else {
				if (ch[i] >= 65 && ch[i] <= 90) {
					System.out.print("大寫");
					break;
				} else {
					if (ch[i] != 65 && ch[i] != 90) {
						System.out.print("其他字元");
						break;
					}
				}
			}

		}
	}

}
