class Bank {
    double getInterestRate() {
        return 5.0;
    }
}

class HomeLoan extends Bank {
    @Override
    double getInterestRate() {
        return 6.5;
    }
}

class CarLoan extends Bank {
    @Override
    double getInterestRate() {
        return 7.0;
    }
}

class EducationLoan extends Bank {
    @Override
    double getInterestRate() {
        return 4.5;
    }
}

public class Overriding {
    public static void main(String[] args) {
        Bank b1 = new HomeLoan();
        Bank b2 = new CarLoan();
        Bank b3 = new EducationLoan();

        System.out.println("Home Loan Interest Rate: " + b1.getInterestRate() + "%");
        System.out.println("Car Loan Interest Rate: " + b2.getInterestRate() + "%");
        System.out.println("Education Loan Interest Rate: " + b3.getInterestRate() + "%");
    }
}
