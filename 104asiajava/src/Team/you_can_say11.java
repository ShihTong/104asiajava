package Team;

import java.math.BigInteger;
import java.util.Scanner;

public class you_can_say11 {

	public static void main(String[] args) {
		BigInteger x;
		String y;
		Scanner scn = new Scanner(System.in);
		while (true) {
			y = scn.nextLine();
			x = new BigInteger(y);
			if (x.equals(BigInteger.ZERO))
				break;
			if (x.mod(new BigInteger("11")).equals(BigInteger.ZERO))
				System.out.println(y + " is a multiple of 11.");
			else
				System.out.println(y + " is not a multiple of 11.");
		}
	}
}