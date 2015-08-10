import java.util.Scanner;
public class stars_for3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn =new Scanner(System.in);
		int c = scn.nextInt();
		double v1=Math.ceil(c/2);
		double v2=c-v1;
		for(int i=0;i<v1;i++){
			for(int j=0;j<=v1-i-1;j++){
				System.out.print(" ");
			}
			for(int k=0;k<=2*i;k++){
				System.out.print("*");
			}
			
				
			
			System.out.println(" ");
			
		}
		for(int i=1;i<=v2;i++){
			for(int j=0;j<i-1;j++){
				System.out.print(" ");
			}
			for(int k=0;k<(v2-i)*2+1;k++){
				System.out.print("*");
			}
			
				
			
			System.out.println(" ");
			
		}

	}

}