package 第一學期;

import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("請輸入正整數(1):");
		int a = scn.nextInt();
		System.out.print("請輸入正整數(2):");
		int b = scn.nextInt();
		System.out.print("請輸入正整數(3):");
		int c = scn.nextInt();
		int max = 1;
		for (int i = b; i >= 1; i--) {
			if (a % i == 0 && b % i == 0) {
				max = i;
				int min = (a * b / max);
				for (int j = c; j >= 1; j--) {
					if (c % j == 0 && min % j == 0) {
						max = j;
						System.out.print("最小公倍數:"+(min * c / max));
						break;
					}
				}
			}
		}
	}
}