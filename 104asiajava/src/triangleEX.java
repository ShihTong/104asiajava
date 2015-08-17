import java.util.Scanner;

public class triangleEX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("輸入最長邊長");
		float c = scn.nextFloat();
		System.out.println("輸入a邊長");
		float a = scn.nextFloat();
		System.out.println("輸入b邊長");
		float b = scn.nextFloat();

		if (a <= b && b <= c) {
			System.out.println("是合法邊長");
		} else {
			System.out.println("非合法邊長");
		}

	}

}
