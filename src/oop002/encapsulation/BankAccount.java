package oop002.encapsulation;

class BankAccount {

    private double balance; // 把重要欄位設成 private

//    用 public 方法（getter/setter）管理資料
    public void deposit(double amount) {
        if (amount > 0) balance += amount;
    }

//    在 setter 中進行驗證（validation）
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) balance -= amount;
    }

//    用 public 方法（getter/setter）管理資料
    public double getBalance() {
        return balance; // 回傳簡單型別沒問題
    }
}