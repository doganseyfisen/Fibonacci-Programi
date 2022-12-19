import java.util.Scanner;

/**
 * @author Doğan Seyfi Şen - 2022
 */

public class Driver {
	
	static int fibo(int number) {
		
		if (number == 1 || number == 2) {
		return 1;
		}
		return fibo(number-1) + fibo(number-2);
	  }
	
    public static void main(String[] args){
  		  
  		System.out.println(fibo(5));
    }
}
