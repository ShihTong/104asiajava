package 第一學期;

import java.util.Scanner;

public class Ex13 {
	public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	System.out.println("請輸入邊長:");
	int n = scn.nextInt();
	System.out.println("請輸入字元:");
	char c = scn.next().charAt(0);
	square(n,c);
}
	private  static  void square(int n, char c) {
		// TODO Auto-generated method stub
		for (int i = n; i > 0; i--) {
			for (int j = n; j > 1; j--) {
				System.out.print(c);
			}
			System.out.println(c);
		}
	}
}