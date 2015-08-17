import java.util.Scanner;

public class circle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner g = new Scanner(System.in);
		System.out.print("請輸入半徑。");
		float c = g.nextFloat();
		double b = 3.14159265;
		double x = c * c * b;
		System.out.println("圓形面積為" + x);
	}
}
