package ups;
import java.util.Scanner;
public class eligibility_checking {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int a = sc.nextInt();
		System.out.println(a >=10 && a<=50 ? "OKAY" : "NOT OKAY");	
	}
}

