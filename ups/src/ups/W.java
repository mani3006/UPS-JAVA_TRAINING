
package ups;
import java.util.Scanner;
public class W {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter input:");
        int l = sc.nextInt();
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < 2 * l - 1; j++) {
            	if (j == i) {
            		    System.out.print("*");
            		} else {
            		    System.out.print(" ");
            		}
            }
            System.out.println();
        }

        sc.close();
    }
}
