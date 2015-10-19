package 第一學期;
import java.util.Random;
public class Ex28 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rnd = new Random();
		int a, b, c, d,e,f;
		int cost = rnd.nextInt((1000) + 1);
		int cost2 = 1000-cost;
		a = cost2 / 500;
		b = cost2%500 / 100;
		c = cost2 % 100/50;
		d=  cost2 % 50 / 10;
		e = cost2 % 10 / 5;
		f = cost2 % 5 / 1;
		System.out.println(a+"個500 "+b+"個100 "+c+"個50 "+d+"個10 "+e+"個5 "+f+"個1");
	}

}
