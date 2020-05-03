package problem2;

public class InvoiceTest {

    public static void main(String args[]) {
        Invoice intelCoreI7 = new Invoice("234", "IntelCoreI7",2,4.000);
        Invoice intelCoreI5= new Invoice("234", "IntelCoreI5",-6,3.500);
        Invoice intelCoreI4 = new Invoice("234", "IntelCoreI4",5,-2.789);
        System.out.println("Invoice for the  intelCoreI7 = " + intelCoreI7.getInvoiceAmount());
        System.out.println("Invoice for the  intelCoreI5 = " + intelCoreI5.getInvoiceAmount());
        System.out.println("Invoice for the  intelCoreI4 = " + intelCoreI4.getInvoiceAmount());

    }
}
