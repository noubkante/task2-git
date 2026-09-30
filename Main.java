import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("How many customers? ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Please enter at least one customer.");
            return;

            SavingsInterestReport report = new SavingsInterestReport(n, 0.075);

            for (int i = 0; i < n; i++) {
                System.out.print("Name of customer " + (i + 1) + ": ");
                String name = sc.next();
                System.out.print("Deposit (whole number): ");
                int deposit = sc.nextInt();

                report.addCustomer(name, deposit);
            }
        }
    }
}