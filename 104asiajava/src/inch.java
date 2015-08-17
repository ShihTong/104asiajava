import java.util.Scanner;

public class inch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("Please enter your height(cm).");
		double a = scn.nextFloat();
		System.out.print("Please enter your weight(kg).");
		double b = scn.nextFloat();
		double c = a * 2.54;
		double d = b * 0.454;
		System.out.println("height:" + c + "(inch)");
		System.out.println("weight:" + d + "(pound)");

	}

}
