import java.util.Scanner;

public class Array2D1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		float data[][] = new float[4][4];
		String name[] = new String[4];
		for (int i = 0; i < 4; i++) {
			System.out.print("請輸入第" + (i + 1) + "位同學的名子:");
			name[i] = scn.next();
			System.out.println("請輸入3科成績:");
			data[i][0] = scn.nextFloat();
			data[i][1] = scn.nextFloat();
			data[i][2] = scn.nextFloat();
			data[i][3] = ((data[i][0] + data[i][1] + data[i][2])/3);
		}
		System.out.println("全班成績如下:");
		for (int i = 0; i < 4; i++) {
			System.out.println(name[i] + " " + data[i][0] + " " + data[i][1]
					+ " " + data[i][2] + " " + data[i][3]);
		}
	}
}

