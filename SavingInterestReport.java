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

}