package ups;
import java.util.Scanner;
public class V {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter input");
		int l=sc.nextInt();
		for (int i=0; i<l;i++) {
			for (int j=0; j<2*l;j++) {
				if(i==j || j==(2*l-2-i)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
	}
}
