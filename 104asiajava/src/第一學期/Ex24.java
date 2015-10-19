package 第一學期;

import java.util.*;

public class Ex24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("請輸入三邊長(由小到大):");
		int a = scn.nextInt();
		int b = scn.nextInt();
		int c = scn.nextInt();
		if (a <= b && b <= c) {
			if (a + b >= c && a + c >= b && b + c >= a) {
				System.out.print("是合法邊長");
			} else {
				System.out.print("非合法邊長");
			}

		}else{
			System.out.print("請由小到大輸入");
		}
	}
}