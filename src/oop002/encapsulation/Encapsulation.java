package oop002.encapsulation;

public class Encapsulation {
    public Encapsulation() {
        BankAccount b = new BankAccount();
        b.deposit(100);
        b.withdraw(50);
        System.out.println(b.getBalance());  // 50
    }
}
