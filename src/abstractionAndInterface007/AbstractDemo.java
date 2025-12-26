package abstractionAndInterface007;

public class AbstractDemo {
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
    // private void eat(){}; // abstract必定繼承
}

abstract class Mammal extends Animal {
    String type;

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

    protected void jump() {
        System.out.println("哺乳動物的跳躍");
    }

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