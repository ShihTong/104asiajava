import java.util.*;

public class Common_Diviso2 {
	public static void main(String[] args) {

		// 程そ计
		int input[] = new int[3];
		int i;
		Scanner scanner = new Scanner(System.in);
		for (int j = 0; j < 3; j++) {
			System.out.println("叫块材" + (j + 1) + "计");
			input[j] = scanner.nextInt();
		}
			for (i = input[2]; i >= 1; i--) {
				if ((input[0] % i == 0) && (input[1] % i == 0)
						&& (input[2] % i == 0)) {
					System.out.println("程そ计" + i);
					break;
				}
			}
		}
	}
