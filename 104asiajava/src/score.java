import java.util.Scanner;
public class score {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("enter a Chinese score.");
		float a = scn.nextFloat();
		System.out.println("enter a English score.");
		float b = scn.nextFloat();
		System.out.println("enter a Math score.");
		float c = scn.nextFloat();
		float d = a+b+c;
		float e =d/3;
		System.out.println("Your total score is"+d);
		System.out.println("Your average score is"+e);
	}

}
