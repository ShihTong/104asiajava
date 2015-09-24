package 第一學期;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("請輸入國文成績:");
		int chinese = scn.nextInt();
		System.out.print("請輸入英文成績:");
		int english = scn.nextInt();
		System.out.print("請輸入數學成績:");
		int math = scn.nextInt();
		System.out.println("總成績:" + (chinese + english + math));
		System.out.println("平均成績:" + ((chinese + english + math)/3));
	}

}
