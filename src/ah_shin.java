import java.util.Scanner;
public class ah_shin {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner g = new Scanner(System.in);
    System.out.print("阿勳買了幾平方公尺農地。");
   float c = g.nextFloat();
   double x = c*0.3025*18000;
		   System.out.println("阿勳花了"+x+"元");
	}

}
