import java.util.Scanner;

public class Array2D2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, j = 0;
		Scanner scn = new Scanner(System.in);
		System.out.print("有幾個學生:");
		int n = scn.nextInt();
		float data[][] = new float[n][4];
		String name[] = new String[4];
		int lose = 0;
		for (i = 0; i < n; i++) {
			System.out.print("請輸入第" + (i + 1) + "位同學的名子:");
			name[i] = scn.next();
			System.out.println("請輸入3科成績:");
			data[i][0] = scn.nextFloat();
			data[i][1] = scn.nextFloat();
			data[i][2] = scn.nextFloat();
			data[i][3] = ((data[i][0] + data[i][1] + data[i][2]) / 3);
		}
		System.out.println("全班成績如下:");
		for (i = 0; i < n; i++) {
			System.out.println(name[i] + " " + data[i][0] + " " + data[i][1]
					+ " " + data[i][2] + " " + data[i][3]);
			if (data[i][3] < 60) {
				lose = lose + 1;
			}
		}
		System.out.println("不及格人數如下:" + lose + "人");
		for (i = 0; i < n; i++) {
			for (j = i + 1; j < n; j++) {
				if (data[i][3] < data[j][3]) {
					int v1 = (int) data[i][3];
					data[i][3] = data[j][3];
					data[j][3] = v1;
				}
			}
		}
		System.out.println("全班分數由高至低為:");
		for (i = 0; i < n; i++) {
			System.out.println(data[i][3]);
		}
		System.out.println("最高分數為:");
		System.out.println(data[0][3]);
		System.out.println("最低分數為:");
		System.out.println(data[n - 1][3]);
	}
}