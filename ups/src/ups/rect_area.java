package ups;
import java.util.Scanner;
public class rect_area {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("ENTER THE LENGTH OF THE RECTANGLE: ");
		int a = sc.nextInt();
		System.out.print("ENTER THE BREADTH OF THE RECTANGLE: ");
		int b = sc.nextInt();
		int area = a*b;
		System.out.println("Area of the rectangle is " +area);
	}
}
