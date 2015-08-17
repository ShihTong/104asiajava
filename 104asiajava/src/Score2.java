import java.util.Scanner;

public class Score2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter your score.");
		int a = scn.nextInt();
		if (a > 97) {
			System.out.println("Your grade is A+.");
		} else {
			if (a <= 97 && a >= 94) {
				System.out.println("Your grade is A.");
			} else {
				if (a <= 93 && a >= 90) {
					System.out.println("Your grade is A-.");
				} else {
				}
				if (a <= 89 && a >= 86) {
					System.out.println("Your grade is B+.");
				} else {
				}
				if (a <= 86 && a > 83) {
					System.out.println("Your grade is B.");
				} else {
				}
				if (a <= 83 && a > 79) {
					System.out.println("Your grade is B-.");
				} else {
				}
				if (a <= 79 && a > 76) {
					System.out.println("Your grade is C+.");
				} else {
				}
				if (a <= 76 && a > 73) {
					System.out.println("Your grade is C.");
				} else {
				}
				if (a <= 73 && a > 69) {
					System.out.println("Your grade is C-.");
				} else {
				}
				if (a <= 69 && a > 66) {
					System.out.println("Your grade is D+.");
				} else {
				}
				if (a <= 66 && a > 63) {
					System.out.println("Your grade is D.");
				} else {
				}
				if (a <= 63 && a >= 60) {
					System.out.println("Your grade is D-.");
				} else {
				}
				if (a < 60) {
					System.out.println("Your grade is E.");
				}

			}
		}
	}
}
