package 第一學期;

import java.util.Random;

public class Ex04 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rnd = new Random();
		int data[] = new int[6];
		int i = 0;
		boolean flag = false;
		while (i < 6) {
			data[i] = (rnd.nextInt(41) + 1);
			flag = false;
			for (int j = 0; j < i; j++) {
				if (data[i] == data[j]) {
					flag = true;

				}
			}
			if (flag == false) {
				i++;
			}
		}
		for (i = 0; i < 6; i++) {
			System.out.println(data[i]);
		}
	}
}
