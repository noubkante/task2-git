public class SavingsInterestReport {

    private double rate;
    private String[] names;
    private int[] deposits;
    private double[] interest;
    private long[] rounded;
    private int count = 0;

    private long totalDeposit = 0;
    private double totalInterest = 0;
    private long totalRounded = 0;

    public SavingsInterestReport(int size, double rate) {
        this.rate = rate;
        names = new String[size];
        deposits = new int[size];
        interest = new double[size];
        rounded = new long[size];
    }

    public void addCustomer(String name, int deposit) {
        names[count] = name;
        deposits[count] = deposit;

        interest[count] = deposit * rate;

        rounded[count] = Math.round(interest[count]);

        totalDeposit += deposit;
        totalInterest += interest[count];
        totalRounded += rounded[count];

        count++;
    }

    public void printInternalReport() {
        System.out.println("INTERNAL REPORT (exact)");
        for (int i = 0; i < count; i++) {
            System.out.println(names[i] + " | Deposit: " + deposits[i]
                    + " | Interest: " + interest[i]);
        }
    }

    public void printManagementReport() {
        System.out.println("MANAGEMENT REPORT (rounded)");
        for (int i = 0; i < count; i++) {
            System.out.println(names[i] + " | Deposit: " + deposits[i]
                    + " | Interest: " + rounded[i]);
        }
        System.out.println("Total deposits: " + totalDeposit);
        System.out.println("Total interest (rounded): " + totalRounded);
    }

    public void showConversionDemo() {
        System.out.println("TYPE CONVERSION DEMO");


        int a = 500;
        double b = a;
        System.out.println("int to double (automatic): " + b);

        double sample = interest[0];
        int cut = (int) sample;
        long round = Math.round(sample);
        System.out.println("Exact interest:    " + sample);
        System.out.println("Cast (int) result: " + cut + "  <- decimals cut off");
        System.out.println("Math.round result: " + round + "  <- correct rounding");


        System.out.println("Average (wrong): " + (totalDeposit / count));
        System.out.println("Average (right): " + ((double) totalDeposit / count));


        System.out.println("Exact total interest:   " + totalInterest);
        System.out.println("Rounded total interest: " + totalRounded);
        System.out.println("Difference caused by rounding: "
                + (totalInterest - totalRounded));
    }
}