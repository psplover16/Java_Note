package list006;

import list006.challenge.Bank;
import list006.challenge.Customer;

public class List006 {
    public List006() {
        // new ArrayListIntroDemo();
        // new ArrayVsArrayListDemo();
        // new LinkedListDemo();
        // new IteratorDemo();
        // new IteratorChallenge();
        // new Boxing();

        Bank bank = new Bank("MyBank");
        Customer customer1 = new Customer("Gary");
        customer1.credit(1000);
        bank.addCustomer(customer1);
        bank.addTransaction("Gary", -200);
        //
        Customer customer2 = new Customer("Alice");
        customer2.credit(500);
        bank.addCustomer(customer2);
        bank.printCustomers();
    }
}
