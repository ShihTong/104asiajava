package 第一學期;

import java.util.Scanner;

public class Ex01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("請輸入一串數字:");
		Scanner scn = new Scanner(System.in);
		String str = scn.nextLine();
		char[] ch_array = str.toCharArray();
		int sum=0;
		for (int i = 0; i < ch_array.length; i++) {
			int number = ch_array[i]-'0';
			sum=sum+number;
		}
		System.out.println(sum);
	}

}
