package list006.challenge;

import java.util.ArrayList;

public class Bank {
    String name;
    private ArrayList<Customer> customers;

    public Bank(String name) {
        this.name = name;
        this.customers = new ArrayList<>();
    }

    public void addCustomer(Customer customer) {
        if (getCustomer(customer.name()) != null) {
            System.out.println("Customer " + customer.name() + " already exists.");
            return;
        }
        customers.add(customer);
    }

    Customer getCustomer(String name) {
        for (Customer c : customers) {
            if (c.name().equals(name)) {
                return c;
            }
        }
        return null;
    }

    public void addTransaction(String customerName, double amount) {
        Customer customer = getCustomer(customerName);
        if (customer != null) {
            if (amount >= 0) {
                customer.credit(amount);
            } else {
                customer.debit(-amount);
            }
        } else {
            System.out.println("Customer " + customerName + " not found.");
        }
    }

    public void printCustomers() {
        System.out.println("Customers of Bank: " + name);
        for (Customer c : customers) {
            System.out.println("name: " + c.name());

            for (var amount : c.containing()) {
                // 手動拆箱
                // double aa = amount.doubleValue();
                // System.out.printf(" transaction: %.2f\n", aa);
                System.out.printf("  transaction: %.2f\n", amount);
            }

        }
    }

}
