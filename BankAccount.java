class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited cash: ₹" + amount);
    }

    public void deposit(double amount, String checkNumber) {
        balance += amount;
        System.out.println("Deposited check of ₹" + amount + " (Check No: " + checkNumber + ")");
    }

    public void deposit(double amount, String referenceNumber, boolean isOnlineTransfer) {
        balance += amount;
        System.out.println("Deposited online transfer of ₹" + amount + " (Ref No: " + referenceNumber + ")");
    }

    public void displayBalance() {
        System.out.println("Current Balance: ₹" + balance);
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000.00); 

        account.deposit(500);                      
        account.deposit(1000, "CHK12345");          
        account.deposit(2000, "TXN987654", true); 

        account.displayBalance(); 
    }
}
