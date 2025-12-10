package oop002.inheritance;

public class Inheritance {
    public Inheritance() {
//        只有方法有多型

        Dog d = new Dog();
        d.test();
        System.out.println(d.name); // Dog

        Animal a = new Dog();  // ⭐ 多型最重要寫法
        a.eat();               // 呼叫 Dog 的 eat()
        System.out.println(a.name); // 呼叫 Animal的name，因為 變數沒有多型，只有方法有多型
    }
}
