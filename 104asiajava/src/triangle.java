import java.util.Scanner;

public class triangle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner g = new Scanner(System.in);
		System.out.print("請輸入底。");
		float c = g.nextFloat();
		System.out.print("請輸入高。");
		float d = g.nextFloat();
		float x = c * d / 2;
		System.out.println("三角形面積為" + x);
	}

}
