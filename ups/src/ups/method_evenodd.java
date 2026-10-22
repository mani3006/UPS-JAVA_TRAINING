package ups;
import java.util.Scanner;
public class method_evenodd {
	void evenodd(int a){
		if (a%2==0) {
			System.out.println("even");
		}
		else {
			System.out.println("Odd");
		}
	}
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		int a = sc.nextInt();
		method_evenodd obj = new method_evenodd();
	    obj.evenodd(a);
		
	}
}
