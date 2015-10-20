package Team;

import java.util.*;
import java.math.BigInteger;

public class you_can_say11 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		while (true) {
			String str = scn.next();
			BigInteger i = new BigInteger(str);
			int N = i.intValue();
			if(N==0){
				break;
			}
			if(N%11==0){
				System.out.println(N+" is a multiple of 11.");
			}
			if(N%11!=0){
				System.out.println(N+" is not a multiple of 11.");
			}
		}
	}
}