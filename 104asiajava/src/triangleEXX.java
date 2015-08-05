import java.util.Scanner;
public class triangleEXX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner scn = new Scanner(System.in);
			System.out.println("輸入最長邊長");
			float c = scn.nextFloat();
			System.out.println("輸入a邊長");
			float a = scn.nextFloat();
			System.out.println("輸入b邊長");
			float b = scn.nextFloat();
			if(c*c==a*a+b*b&&(a<=b&&b<=c)){
				System.out.println("為直角三角形");
			}else{
				if(a*a+b*b < c*c&&(a<=b&&b<=c)){
					System.out.println("為鈍角三角形");
				}else{
					if(a*a+b*b > c*c&&(a<=b&&b<=c)){
						System.out.println("為銳角三角形");
					}else{
						System.out.println("無此三角形");
					}
				}
	}
	}
}