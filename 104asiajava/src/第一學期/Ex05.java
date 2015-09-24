package 第一學期;

import java.util.Random;

public class Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rnd = new Random();
		int data[][] = new int[10][10];
		int i = 0;
		int j = 0;
		for (i = 0; i < 10; i++) {
			for (j = 0; j < 10; j++) {
				data[i][j] = rnd.nextInt((10) + 1);
				/* System.out.print(data[i][j] + "\t");
				 if (j == 9) {
				 System.out.print("\n");
				 }
				 ------------未轉置的矩陣-----------*/
			}
		}
		System.out.print("\n");
		for (i = 0; i < 10; i++) {
			for (j = 0; j < 10; j++) {
				System.out.print(data[j][i] + "\t");
				if (j == 9) {
					System.out.print("\n");
				}
			}
		}
	}
}
