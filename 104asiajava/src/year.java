import java.util.Scanner;

public class year {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("輸入西元年");
		int year = scn.nextInt();
		if ((year % 10 == 4) || (year % 400 == 0)) {
			System.out.println("是閏年");
		} else {
			if (year > 100 && year % 100 == 0) {
				System.out.println("不是閏年");
			} else {
				System.out.println("不是閏年");
			}

		}
	}
}