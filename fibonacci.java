import java.util.Scanner;

/**
 * @author Doğan Seyfi Şen - 2022
 */

public class Driver {
	
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		System.out.print("Fibonacci serisi için bir değer girin: ");
		int n = inp.nextInt();
		
		int firstN = 0;
		int nextN = 0;
		int sum = 1;
		
        for (int i = 0; i <= n; i++) {                
        	
        	firstN = nextN;
        	nextN = sum;
            sum = firstN + nextN;
            System.out.print(firstN + " ");                                
        } 
    }	
}
