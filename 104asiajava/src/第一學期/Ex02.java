package 第一學期;
import java.util.*;
public class Ex02 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner scn = new Scanner(System.in);
     System.out.print("請輸入一串數字:");
	    String str = scn.nextLine();
	    StringBuffer strb = new StringBuffer();
	    strb.append(str);
	    strb.reverse();
	    System.out.println(strb);
	}

}
