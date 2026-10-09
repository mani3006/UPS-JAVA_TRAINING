package ups;
import java.util.Scanner;
public class add {
	public static void main( String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter a: ");
		int a = sc.nextInt();
		System.out.print("enter b: ");
		int b=sc.nextInt();
		System.out.print("enter c: ");
		int c = sc.nextInt();
		int add= a+b+c;
		int sub = b-c;
		int mul = a*b*c;
		System.out.println("addition " +add);
		System.out.println("subtraction " +sub);
		System.out.println("multiplication " +mul);
	}
}
