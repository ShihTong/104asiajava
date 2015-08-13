import java.util.Random;
public class Array_gf2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rnd = new Random();
		int data[] = new int[10];
		int n= 10;
		int i=0;
		boolean flag=false;
		while(i<10){
			data[i]=(rnd.nextInt(99)+1);
			flag=false;
			for(int j =0;j<i;j++){
				if(data[i]==data[j]){
					flag=true;
					
				}
			}
			if(flag==false){
				i++;
			}
		}
				for(i=0;i<n;i++){
					System.out.println(data[i]);
				}
		}
	}
		