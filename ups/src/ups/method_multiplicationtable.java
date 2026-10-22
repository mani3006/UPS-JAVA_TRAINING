
package ups;

import java.util.Scanner;

public class method_multiplicationtable {
    void table(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        method_multiplicationtable obj = new method_multiplicationtable();
        obj.table(n);
        sc.close();
    }
}
