import java.util.Scanner;

public class trapezoid {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner g = new Scanner(System.in);
		System.out.print("請輸入上底。");
		float c = g.nextFloat();
		System.out.print("請輸入下底。");
		float d = g.nextFloat();
		System.out.print("請輸入高。");
		float p = g.nextFloat();
		float x = (c + d) * p / 2;
		System.out.println("梯形面積為" + x);
	}

}
