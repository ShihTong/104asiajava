package 第一學期;

import java.util.Random;

public class Ex23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rnd = new Random();
		int a = (rnd.nextInt(100) + 1);
		int b = (rnd.nextInt(100) + 1);
		int c = (rnd.nextInt(100) + 1);
		int t ;
		if (a < b) {
			t = a;
			a = b;
			b = t;}
			if (a < c) {
				t=a;
				a=c;
				c=t;
			}
			if (c < c) {
				t=b;
				b=c;
				c=t;
			}
		System.out.println("最大值:"+a);
		System.out.println("最小值:"+b);
	}

}
