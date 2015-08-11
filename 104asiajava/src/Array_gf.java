import java.util.Random;
import java.util.Scanner;
public class Array_gf {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		Random rnd = new Random();
		int data[] = new int[10];
		int c = 10;
		int d = 0;
		int b;
		int guess = 0;

		for (int i = 0; i < c; i = i + 1) {
			data[i] = (rnd.nextInt(99) + 1);
			if (data[i] % 2 == 0) {
				d++;
			}
		}
		while ( guess <= 2){
			System.out.println("請猜");
			b = scn.nextInt();
			if (d == b) {
				System.out.println("你贏了");
				break;
			} else {
				System.out.println("錯了");
				guess++;
			}
			if(guess==3){
				System.out.println("你輸了");
			}
		}
		for(int i=0 ; i<10 ; i++){
			System.out.print("亂數("+(i+1)+")"+":");
			System.out.println(data[i]);
		}

	}

	}


