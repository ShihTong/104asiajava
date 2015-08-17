import java.util.Random;

public class random_cost2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rnd = new Random();
		int a, b, c, d;
		int s = rnd.nextInt((999) + 1);
		a = s / 1000;
		b = s % 1000 / 100;
		c = s % 100 / 10;
		d = s % 10 / 1;
		System.out.println(a + "¥a" + b + "¨Õ" + c + "¬B" + d + "¤¸");
	}
}
