package ups;
import java.util.Scanner;
public class method_factorial {
	int factorial(int n) {
		if (n==0 || n==1 ) {
			return 1;
		}
		return n * factorial(n-1);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter number to find its factorial: ");
		int n = sc.nextInt();
		method_factorial obj = new method_factorial();
		int a = obj.factorial(n);
		System.out.println("Factorial = " + a);
		
	}
}
