package ups;
import java.util.Scanner;
class demo {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	System.out.print("Enter your name:");
    	String n = sc.next();
    	System.out.print("Enter your age:");
    	int age = sc.nextInt();
    	System.out.print("Enter your mobile number:");
    	Float mob = sc.nextFloat();
    	System.out.print("Enter your College:");
    	String college = sc.next();	
    	System.out.println("YOUR BIO DATA");
    	System.out.println("NAME " +n);
    	System.out.println("AGE " +age);
    	System.out.println("MOBILE NUMBER " +mob);
    	System.out.println("COLLEGE " +college);
        
    }
}