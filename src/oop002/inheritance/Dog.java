package oop002.inheritance;

class Dog extends Animal {
    public String name = "Dog";  // ⚠️ 雷區：這不是覆寫，是遮蔽 (shadowing)，就是子類別定義了一個跟父類別同名的變數，導致父類別的變數被「藏起來」、被「蓋住」。

    public Dog() {
//        this(); // 可以呼叫其他建構子，與super() 都要放在第一行
        super(); // 預設，呼叫父層建構子
    }

//    覆寫
    @Override
    public void eat() {   // ✔ 正確覆寫方法
        System.out.println("Dog is eating");
    }

//    overload 多載，藉由不同變數讓 相同函數名稱，做不同事情
    public void eat(String food) {   // ✔ 正確覆寫方法
        System.out.println("Dog is eating" + food);
    }

    public void bark() {   // ✔ 子類別自己的方法
        System.out.println("Woof!");
    }

    public void test() {
        System.out.println(this.name);   // 子類別的 name
        System.out.println(super.name);  // ⚠️ 取得父類別的 name

        this.eat();   // Dog 的版本
        super.eat();  // ⚠️ 呼叫父類別的版本
    }
}
