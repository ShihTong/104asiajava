import java.util.Scanner;
public class math2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scn = new Scanner(System.in);
		    System.out.print("Please enter a number.");
		    float a = scn.nextFloat();
		    System.out.print("Please enter another number.");
		    float b = scn.nextFloat();
		    System.out.print("Please  press + or - or * or /. ");
		    String str = scn.next();
		    if(str.equals("+")){
		    float c=a+b;
		    System.out.println(a+"+"+b+"="+c);
	}else{
		if(str.equals("-")){
			float c=a-b;
			System.out.println(a+"-"+b+"="+c);
		}else{
				if(str.equals("*")){
					float c=a*b;
					System.out.println(a+"*"+b+"="+c);
				}else{
					if(str.equals("/")){
						float c=a/b;
						System.out.println(a+"/"+b+"="+c);
}
	}
		    }
}
}
}