
package project;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.io.IOException;
public class supermarket {
    static void displayMenu() {
        System.out.println("\n===== VEGETABLE SHOP =====");
        System.out.println("Available Vegetables:");
        String[] vegetables = {"Onion", "Tomato", "Brinjal", "Carrot"};
        double[] prices = {40.0, 30.0, 35.0, 25.0};
        for (int i = 0; i < vegetables.length; i++) {
            System.out.println((i + 1) + ". " + vegetables[i]
                    + " - Rs." + prices[i] + "/kg");
        }
        System.out.println("5. Exit");
    }
    static void saveBill(double onionQty, double tomatoQty,
                         double brinjalQty, double carrotQty,
                         double onionAmount, double tomatoAmount,
                         double brinjalAmount, double carrotAmount,
                         double total) {
        try (PrintWriter writer =
                     new PrintWriter(new FileWriter("supermarket_bill.txt"))) {

            writer.println("========== FINAL BILL ==========");
            writer.printf("Onion   : %.2f kg x Rs.40 = Rs.%.2f%n",
                    onionQty, onionAmount);
            writer.printf("Tomato  : %.2f kg x Rs.30 = Rs.%.2f%n",
                    tomatoQty, tomatoAmount);
            writer.printf("Brinjal : %.2f kg x Rs.35 = Rs.%.2f%n",
                    brinjalQty, brinjalAmount);
            writer.printf("Carrot  : %.2f kg x Rs.25 = Rs.%.2f%n",
                    carrotQty, carrotAmount);

            writer.println("--------------------------------");
            writer.printf("TOTAL AMOUNT: Rs.%.2f%n", total);
            writer.println("Thank you for shopping!");

            System.out.println("Bill saved successfully!");

        } catch (IOException e) {
            System.out.println("Error saving bill: " + e.getMessage());
        }
    }
    static void readBill() {
        System.out.println("\n===== SAVED BILL =====");

        try (BufferedReader reader =
                     new BufferedReader(new FileReader("supermarket_bill.txt"))) {

            String line;

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            System.out.println("Error reading bill: " + e.getMessage());
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double onionQty = 0;
        double tomatoQty = 0;
        double brinjalQty = 0;
        double carrotQty = 0;

        int choice;

        do {
            displayMenu();

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter onion quantity in kg: ");
                    double oq = sc.nextDouble();

                    if (oq > 0) {
                        onionQty += oq;
                        System.out.println("Onion added to cart.");
                    } else {
                        System.out.println("Invalid quantity.");
                    }
                    break;

                case 2:
                    System.out.print("Enter tomato quantity in kg: ");
                    double tq = sc.nextDouble();

                    if (tq > 0) {
                        tomatoQty += tq;
                        System.out.println("Tomato added to cart.");
                    } else {
                        System.out.println("Invalid quantity.");
                    }
                    break;

                case 3:
                    System.out.print("Enter brinjal quantity in kg: ");
                    double bq = sc.nextDouble();

                    if (bq > 0) {
                        brinjalQty += bq;
                        System.out.println("Brinjal added to cart.");
                    } else {
                        System.out.println("Invalid quantity.");
                    }
                    break;

                case 4:
                    System.out.print("Enter carrot quantity in kg: ");
                    double cq = sc.nextDouble();

                    if (cq > 0) {
                        carrotQty += cq;
                        System.out.println("Carrot added to cart.");
                    } else {
                        System.out.println("Invalid quantity.");
                    }
                    break;

                case 5:
                    System.out.println("Generating final bill...");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }

        } while (choice != 5);

        double onionAmount = onionQty * 40.0;
        double tomatoAmount = tomatoQty * 30.0;
        double brinjalAmount = brinjalQty * 35.0;
        double carrotAmount = carrotQty * 25.0;

        double total = onionAmount + tomatoAmount
                + brinjalAmount + carrotAmount;
        System.out.println("\n========== FINAL BILL ==========");

        System.out.printf("Onion   : %.2f kg x Rs.40 = Rs.%.2f%n",
                onionQty, onionAmount);
        System.out.printf("Tomato  : %.2f kg x Rs.30 = Rs.%.2f%n",
                tomatoQty, tomatoAmount);
        System.out.printf("Brinjal : %.2f kg x Rs.35 = Rs.%.2f%n",
                brinjalQty, brinjalAmount);
        System.out.printf("Carrot  : %.2f kg x Rs.25 = Rs.%.2f%n",
                carrotQty, carrotAmount);
        System.out.println("--------------------------------");
        System.out.printf("TOTAL AMOUNT: Rs.%.2f%n", total);
        System.out.println("Thank you for shopping!");
        saveBill(onionQty, tomatoQty, brinjalQty, carrotQty,
                onionAmount, tomatoAmount, brinjalAmount,
                carrotAmount, total);
        readBill();

        sc.close();
    }
}
