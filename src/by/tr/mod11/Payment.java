package by.tr.mod11;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Payment {
    private List<Good> GoodList= new ArrayList<Good>();
    public Payment(){
    }
    public void addGood(Good good){
        GoodList.add(good);
    }
    public boolean deleteGood(Good good)
    {
        return GoodList.remove(good);
    }

    public List<Good> getGoodList() {
        return GoodList;
    }
    public Good findByName(String name){
        for (Good good : GoodList){
            if (good.getName().toLowerCase().equals(name.toLowerCase())) {
                return good;
            }
        }
        return null;
    }
    public int getPaymentPrice(){
        int fullPrice = 0;
        for (Good good :GoodList){
            fullPrice += good.getPrice();
        }
        return fullPrice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Payment payment = (Payment) o;
        return Objects.equals(GoodList, payment.GoodList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(GoodList);
    }

    @Override
    public String toString() {
        return "Payment{" +
                "GoodList=" + GoodList +
                '}';
    }
}
