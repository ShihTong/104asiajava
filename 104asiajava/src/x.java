import java.util.Scanner;

public class x {
	  
	  /**
	   * constructor
	   * 
	   * */
	  public x() {
	    
	  }
	  public String [] retArray() {
	    String [] str = new String[3];
	    str[0] = "Welcome";
	    str[1] = " To ";
	    str[2] = " java";
	    return str;
	  }
	  /**
	   * 主程式
	   * @param args 由控制台傳入的參數。
	   * */
	  public static void main(String[] args) {
	    
	    x test = new x();
	    String [] str = test.retArray();
	    for(int i=0;i < 3;i++) {
	      System.out.print(str[i]);
	    }
	  }
	}