package abstractionAndInterface007;

public class AbstractDemo {
//    abstract
//    可以有
//      instance 欄位（非 static、非 final）
//      建構子
//      concrete method（有實作）
//      abstract method（沒實作）
//      強迫子類實作（override）
//
//    不可以被直接實例化
//    abstract 的方法，default / protected / public可以這三個，private不行。override存取權限只能更大。private>default>protected>public

//    常用於：模板、規範
//    抽象類別不一定要實作抽象方法，具有一定的彈性，可以只實作其中部分抽象方法甚至完全不實作任何抽象方法。也可以包含額外的抽象方法

    public AbstractDemo() {
        // 編譯期決定「你能不能這樣寫」，看左邊宣告型別，防止寫出不合法的程式
        // 執行期決定「實際跑的是哪個實作」，看右邊，真正跑哪個版本（多型）
        // 編譯時，用Animal的角度去檢查；但用dog去往繼承鍊查找方法。
        Animal yellowDog = new Dog("yellowDog");
        System.out.println(yellowDog); // 類別完整名稱 + "@" + 物件hashCode的16進位表示
        yellowDog.animalScared();
        yellowDog.move(); // 實際執行Dog的move，type是Dog
        yellowDog.sound();
        yellowDog.bark();

        // yellowDog.jump();
        // yellowDog.eat();
    }

}

abstract class Animal {
    protected void animalScared() {
        System.out.println("Animal Scared");
    }

    protected abstract void move();

    abstract void sound();

    protected void bark() {
        System.out.println("Bark");
    }
    // private void eat(){}; // abstract子類別必須必定繼承
}

abstract class Mammal extends Animal {
    //    可以有instance欄位
    String type;

    //    可以有建構子
    public Mammal(String type) {
        this.type = type;
        this.animalScared();
    }

    @Override
    protected void move() {
        System.out.println("哺乳動物的移動，型別是: " + getClass().getSimpleName());
    }

    @Override
    void sound() {
        System.out.println("哺乳動物的叫喊");
    }

    @Override
    protected void bark() {
        // super.bark();
        System.out.println("狗在狂吠");
    }

    //    可以有有實作方法
    protected void jump() {
        System.out.println("哺乳動物的跳躍");
    }

    //    可以有沒實作方法
    abstract void eat();
}

class Dog extends Mammal {
    public Dog(String type) {
        super(type);
    }

    @Override
    void eat() {
        System.out.println("狗狗吃肉肉");
    }
}