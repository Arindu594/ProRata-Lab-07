import java.util.Scanner;

public class SunsetSupermarket {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        for (int i = 1; i <= 5; i++) {

            System.out.println("Customer " + i);

            // Enter bill amount
            System.out.print("Enter total bill amount: ");
            double bill = input.nextDouble();

            // Enter payment mode
            System.out.print("Enter payment mode (C/O): ");
            char mode = input.next().charAt(0);

            // Check payment mode
            while (mode != 'C' && mode != 'c' &&
                   mode != 'O' && mode != 'o') {

                System.out.println("Payment Mode is Not Valid");
                System.out.print("Enter payment mode (C/O): ");
                mode = input.next().charAt(0);
            }

            double discount = 0;
            double amountToPay;

            // Calculate discount only for cash payments
            if (mode == 'C' || mode == 'c') {
                discount = bill * 5 / 100;
            }

            amountToPay = bill - discount;

            // Display results
            System.out.println("Discount: " + discount);
            System.out.println("Amount to be paid: " + amountToPay);
            System.out.println();
        }

        input.close();
    }
}