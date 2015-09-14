package 第一學期;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("請輸入身性別:");
		String str = scn.next();
		System.out.print("請輸入身高:");
		double a = scn.nextFloat();
		if (str.equals("男")) {
			double b = (a - 170) * 0.6 + 62;
			System.out.print("你的理想體重是:" + b);
		} else {
			if (str.equals("女")) {
				double b = (a - 158) * 0.5 + 52;
				System.out.print("你的理想體重是:" + b);
			}
		}
	}

}
