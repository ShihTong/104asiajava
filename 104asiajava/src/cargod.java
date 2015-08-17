import java.util.Scanner;

public class cargod {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("輸入傾角.");
		float a = scn.nextFloat();
		System.out.print("輸入兩輪軸心.");
		float b = scn.nextFloat();
		System.out.print("輸入輪胎尺寸.");
		float c = scn.nextFloat();
		if (a > 43 && b >= 130 && c == 12) {
			System.out.print("買了");
		} else {
			System.out.print("免了");
		}
	}
}
