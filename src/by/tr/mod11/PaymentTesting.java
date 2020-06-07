package by.tr.mod11;

public class PaymentTesting {
    public static void main(String[] args) {
        Good good1 = new Good(15, "T-shirt");
        Good good2 = new Good(85, "Trousers");
        Good good3 = new Good(2,"Socks");
        Payment pay = new Payment();
        pay.addGood(good1);
        pay.addGood(good2);
        pay.addGood(good3);
        System.out.println(pay);
        System.out.println(pay.getPaymentPrice());
        System.out.println(good2);
        pay.deleteGood(good2);
        System.out.println(pay);
        System.out.println(pay.getPaymentPrice());
        System.out.println(pay.findByName("T-shirt"));
    }
}
