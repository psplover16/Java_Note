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
        if (getCustomer(customer.getName()) != null) {
            System.out.println("Customer " + customer.getName() + " already exists.");
            return;
        }
        customers.add(customer);
    }

    Customer getCustomer(String name) {
        for (Customer c : customers) {
            if (c.getName().equals(name)) {
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
            System.out.println("name: " + c.getName());

            for (var amount : c.getContaining()) {
                // 手動拆箱
                // double aa = amount.doubleValue();
                // System.out.printf(" transaction: %.2f\n", aa);
                System.out.printf("  transaction: %.2f\n", amount);
            }

        }
    }

}
