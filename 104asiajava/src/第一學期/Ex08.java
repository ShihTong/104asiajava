package 第一學期;
import java.util.Scanner;
public class Ex08 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("請輸入攝氏溫度:");
		float degree = scn.nextFloat();
		System.out.print("華式溫度="+(degree*9/5+32));
		
	}
}
