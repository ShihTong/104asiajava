import java.util.*;

public class tryy {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int a = scn.nextInt();
		int i =0;


		while(i < a){
			int k =0;
			while(k <= a - i - 2){			
				System.out.print(" ");
				k++;
			}		int j =0;
			while(j <= i){				
				System.out.print("*");
				j++;
				
			}
			
			System.out.println();
			i++;
		}
		
		
	}
}
