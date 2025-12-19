package list006.challenge;

import java.util.ArrayList;

public class Customer {
    private String name;
    private ArrayList<Double> containing;

    public Customer(String name) {
        this.name = name.toUpperCase();
        this.containing = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void credit(double amount) {
        // 手動裝箱
        // Double boxedAmount = Double.valueOf(amount);
        // containing.add(boxedAmount);
        containing.add(amount);
    }

    public void debit(double amount) {
        containing.add(-amount);
    }

    public ArrayList<Double> getContaining() {
        return containing;
    }

}
