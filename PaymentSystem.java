class Payment {
    double amount;

    Payment(double amount) {
        this.amount = amount;
    }

    void processPayment() {
        System.out.println("Processing a generic payment of $" + amount);
    }
}  

class CreditCardPayment extends Payment {
    String cardNumber;

    CreditCardPayment(double amount, String cardNumber) {
        super(amount);
        this.cardNumber = cardNumber;
    }

    @Override
    void processPayment() {
        System.out.println("Processing Credit Card Payment of $" + amount + " using card " + cardNumber);
    }
}

class UPIPayment extends Payment {
    String upiId;

    UPIPayment(double amount, String upiId) {
        super(amount);
        this.upiId = upiId;
    }

    @Override
    void processPayment() {
        System.out.println("Processing UPI Payment of $" + amount + " using UPI ID " + upiId);
    }
}

class WalletPayment extends Payment {
    String walletName;

    WalletPayment(double amount, String walletName) {
        super(amount);
        this.walletName = walletName;
    }

    @Override
    void processPayment() {
        System.out.println("Processing Wallet Payment of $" + amount + " using " + walletName);
    }
}

public class PaymentSystem {
    public static void main(String[] args) {
        Payment p1 = new CreditCardPayment(250.75, "1234-5678-9876-5432");
        Payment p2 = new UPIPayment(120.50, "user@upi");
        Payment p3 = new WalletPayment(75.00, "PayEase Wallet");

        p1.processPayment();
        p2.processPayment();
        p3.processPayment();
    }
}
