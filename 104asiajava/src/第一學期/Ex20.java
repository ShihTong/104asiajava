package 第一學期;

import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		String n = scn.nextLine();
		decomp(n);
	}
	private  static  void decomp(String n){
		char[] ch_array = n.toCharArray();
		for (int i = 0; i < ch_array.length; i++) {
			int number = ch_array[i] - '0';
			System.out.print(number+" ");
			}
	}

}
