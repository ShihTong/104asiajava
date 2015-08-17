import java.util.Scanner;

public class length {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		long i=scn.nextLong();
		long length=String.valueOf(i).length();
		System.out.print(length);
	}
}