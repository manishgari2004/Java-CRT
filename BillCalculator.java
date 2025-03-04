public class BillCalculator {

    
    public double calculateBill(double unitPrice, int quantity) {
        return unitPrice * quantity;
    }

    
    public double calculateBill(double unitPrice, int quantity, double discount) {
        double bill = unitPrice * quantity;
        return bill - discount;
    }

    
    public double calculateBill(double unitPrice, int quantity, double discount, double taxRate) {
        double bill = unitPrice * quantity;
        bill = bill - discount;
        double tax = bill * taxRate;
        return bill + tax;
    }
    
    
    public double calculateBill(double unitPrice, short quantity) {
        int qty = (int) quantity;
        return calculateBill(unitPrice, qty);
    }
    
    public double calculateBill(double unitPrice, byte quantity, double discount) {
        int qty = (int) quantity;
        return calculateBill(unitPrice, qty, discount);
    }

    public static void main(String[] args) {
        BillCalculator calc = new BillCalculator();
        
        int intQuantity = 3;
        short shortQuantity = (short) intQuantity;
        byte byteQuantity = (byte) intQuantity;
        
        double bill1 = calc.calculateBill(20.0, intQuantity);
        System.out.println("Bill with int quantity: $" + bill1);
        
        double bill2 = calc.calculateBill(20.0, shortQuantity);
        System.out.println("Bill with short quantity: $" + bill2);
        
        double bill3 = calc.calculateBill(20.0, byteQuantity, 10.0);
        System.out.println("Bill with byte quantity and discount: $" + bill3);
        
        double bill4 = calc.calculateBill(20.0, intQuantity, 10.0, 0.08);
        System.out.println("Bill with int quantity, discount, and tax: $" + bill4);
    }
}