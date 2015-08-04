import java.util.Scanner;
public class math {

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
    if(a>b){
        System.out.println(a+">"+b);
    }else{
    	if(a<b){
    		System.out.println(a+"<"+b);
    	}else{
    		if(a==b){
    			System.out.println(a+"="+b);
    		}
    	}
    }
}
}