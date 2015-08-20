import java.util.Scanner;
public class carry {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn = new Scanner(System.in);
int count=0;
int n=scn.nextInt();
int b=scn.nextInt();
while(n>=b){
if(n%2==1){
	count++;
}
n=n/b;
	}
if(n==1){
	count ++;
}
System.out.print(count);
}
}
