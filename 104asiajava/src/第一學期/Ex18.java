package 第一學期;
import java.util.Scanner;
public class Ex18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn = new Scanner(System.in);
System.out.print("請輸入數字m:");
float m = scn.nextInt();
System.out.print("請輸入數字n:");
float n = scn.nextInt();
C(m,n);
	}
	private static void C(float m, float n) {
		// TODO Auto-generated method stub
		float sum = 1;
		for(int i=1;i<=m;i++){
			sum*=i;
		}
		float sum1 = 1;
		for(int i=1;i<=m;i++){
			sum1*=i;
	}float sum2 = 1;
	for(int i=1;i<=(m-n);i++){
		sum2*=i;
}
		System.out.print(sum/(sum1*sum2));
	}

}
