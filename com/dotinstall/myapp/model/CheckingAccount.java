public class CheckingAccount {
    private String name;
    private int balance;
    private String id;
    private double interestRate;

    public CheckingAccount(String inputName, int inputBalance, String inputId) {
        this.name = inputName;
        this.balance = inputBalance;
        this.id = inputId;
        this.interestRate = 0.02;
    }

    private void addFunds(int fundsToAdd) {
        balance += fundsToAdd;
    }

    private void getInfo() {
        System.out.println("This checking account belongs to " + name + ". It has " + balance + " dollars in it.");
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int newBalance) {
        balance = newBalance;
    }

    public void getAccountInformation() {
        System.out.println("Money in account: " + this.getBalance());
        System.out.println("Next Month's Interest: " + this.calculateNextMonthInterest());
    }

    private int getBalance() {
        return this.balance;
    }

    private double calculateNextMonthInterest() {
        return this.balance * this.interestRate;
    }

    public static void main(String[] args) {
        CheckingAccount myAccount = new CheckingAccount("anjel", 3000);
        System.out.println(myAccount.balance);
        myAccount.addFunds(5);
        System.out.println(myAccount.balance);
    }
}