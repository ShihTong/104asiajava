package 第一學期;

import java.util.Scanner;

public class Ex25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("請輸入三邊長(由小到大):");
		int a = scn.nextInt();
		int b = scn.nextInt();
		int c = scn.nextInt();
		if (a <= b && b <= c) {
			if (c * c == a * a + b * b ) {
				System.out.println("為直角三角形");
			} else {
				if (a * a + b * b < c * c ) {
					System.out.println("為鈍角三角形");
				} else {
					if (a * a + b * b > c * c ) {
						System.out.println("為銳角三角形");
					} else {
						System.out.println("無此三角形");
					}
				}
			}
		} else {
			System.out.print("請由小到大輸入");
		}
	}
}
