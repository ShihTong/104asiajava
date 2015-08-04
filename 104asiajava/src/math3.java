import java.util.Scanner;
public class math3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scn = new Scanner(System.in);
		 System.out.print("Please enter height.");
		 float a = scn.nextFloat();
		 System.out.print("Please enter weight.");
		    float b = scn.nextFloat();
		    if(a>165&&b<45){
		    	System.out.println("Nice girl.");
	}else{
		System.out.println("Are you serious?");
	}
}
}
