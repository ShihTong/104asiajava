import java.util.Scanner;

public class Matrix {
	public static void main(String args[]) {
		int x = 1;
		while (x > 0) {
			Scanner scn = new Scanner(System.in);
			int ai, aj, bi, bj;
			System.out.print("請輸入矩陣A的行數：");
			ai = scn.nextInt();
			System.out.print("請輸入矩陣A的列數：");
			aj = scn.nextInt();
			System.out.print("請輸入矩陣B的行數：");
			bi = scn.nextInt();
			if (aj != bi) {
				System.out.println("矩陣無法完成運算");
				continue;
			}
			System.out.print("請輸入矩陣B的列數：");
			bj = scn.nextInt();
			int[][] a = new int[ai][aj];
			int[][] b = new int[bi][bj];
			for (int i = 0; i < ai; i++) {
				for (int j = 0; j < aj; j++) {
					System.out.print("請輸入矩陣A第" + (i + 1) + "行的第" + (j + 1)
							+ "個元素");
					a[i][j] = scn.nextInt();
				}
			}
			System.out.println("矩陣A：");
			for (int i = 0; i < ai; i++) {
				for (int j = 0; j < aj; j++) {
					System.out.print(a[i][j] + " ");
				}
				System.out.println();
			}
			for (int i = 0; i < bi; i++) {
				for (int j = 0; j < bj; j++) {
					System.out.print("請輸入矩陣B第" + (i + 1) + "行的第" + (j + 1)
							+ "個元素");
					b[i][j] = scn.nextInt();
				}
			}
			System.out.println("矩陣B：");
			for (int i = 0; i < bi; i++) {
				for (int j = 0; j < bj; j++) {
					System.out.print(b[i][j] + " ");
				}
				System.out.println();
			}
				System.out.println("運算結果是");	
				Arraymatrix m = new Arraymatrix();
				m.mulMatrix(a, b);
				m.display();
				break;
			}
		}

	private int[][] G;

	public void mulMatrix(int[][] a, int[][] b) {
		G = new int[a.length][b[0].length];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b[0].length; j++) {
				for (int k = 0; k < a[0].length; k++) {
					G[i][j] =G[i][j] + a[i][k]
							* b[k][j];
				}
			}
		}
	}

	public void X() {
		for (int i = 0; i < G.length; i++) {
			for (int j = 0; j < G[0].length; j++) {
				System.out.printf("%8d", G[i][j]);
			}
			System.out.println("");
			System.exit(50);
		}
	}
}