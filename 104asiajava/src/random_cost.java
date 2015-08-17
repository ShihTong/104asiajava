import java.util.Scanner;
public class random_cost {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.print("物品價格:");
		int a= scn.nextInt();
		System.out.print("支付金額:");
		int b =  scn.nextInt();
		System.out.println("收您"+b+"元");
		int n= b- a;
int n1[]= {500,100,50,10,5,1};
int n2[]= new int[6];
for (int i =0;i<n1.length;i++){
	n2[i]=n/n1[i];
	n=n%n1[i];
	if(n2[i]>0){
		System.out.println("找您"+n2[i]+"個"+n1[i]+"元");
	}else{
		System.out.println("無需找零!");
		break;
	}
}
	}

}

