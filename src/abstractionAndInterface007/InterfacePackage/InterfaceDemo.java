//package abstractionAndInterface007.InterfacePackage;

public class InterfaceDemo {
    public InterfaceDemo() {
        Animal a = new Eagle("Golden Eagle");
        a.move();          // Bird 的實作

        Bird b = (Bird) a;
        b.testSuper(); // 多個 implements 的 super

        Flyable f = (Flyable) a; // 將a當成Flyable看待(並非轉成另一個物件，而是換一個角度來看)，然後用f存起來
        f.fly(); // Eagle的實作
        f.getFlyable();

// //       安全作法
//        if (a instanceof Flyable f) {
//            f.fly();
//        }

        AirVehicle newJet = new Jet();
        newJet.fly();
        System.out.println(AirVehicle.MAX_ALTITUDE);
        System.out.println(newJet.MAX_ALTITUDE); // 不建議
        newJet.doSomething();
    }
}

// interface：能飛
// 許多介面名稱會以 able結尾
interface Flyable {
    //    public abstract void fly();
//    abstract void fly();
    void fly(); // 任何在介面中宣告、且沒有方法本體的方法，都會被隱含宣告為 public 且 abstract。 三者皆相同等效

    default void getFlyable() {
        System.out.println("Flyable getFlyable");
    }
}

// 追蹤
interface Trackable {
    void track();
}

abstract class Animal {
    protected String name;
    private final String color = "red";
    public String age;

    public Animal(String name) {
        this.name = name;
    }

    protected abstract void move(); // 交給子類
}

// 一個class可以extends一個class 但可以 implements多個interface
abstract class Bird extends Animal implements Flyable, Trackable {

    public Bird(String name) {
        super(name);
    }

    @Override
    protected void move() {
        System.out.println("Bird is moving");
    }

    // fly()、track() 由於Bird本身是abstract，所以 fly()、track() 不實作沒關係。 但是下層的類別需要實作

    void testSuper() {
        System.out.println(super.name); // 此處與this.name相同
        Flyable.super.getFlyable();
    }
}

class Eagle extends Bird {
    public Eagle(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println("Eagle is flying");
    }

    @Override
    public void track() {
        System.out.println("Tracking eagle");
    }

    void eat() {
        System.out.println("Eating eagle");
    }
}

interface AirVehicle extends Flyable, Trackable {
    //    public static final int MAX_ALTITUDE = 10000;
    public static final int MAX_ALTITUDE = 10000; // public static final

//    在 class 裡，如果方法或欄位 沒寫存取修飾詞，預設是 package-private。
//    在 interface 裡，只要是成員（方法或欄位），沒寫修飾詞，一律是 public。

    default void doSomething() {
        helper();   // 呼叫 private 方法
    }

//  private 方法 只能被 interface 自己用
//  不能被實作類別看到
//  不能 override
    private void helper() {
        System.out.println("helper");
    }

}

class Jet implements AirVehicle {

    @Override
    public void fly() {
        System.out.println("Jet flying");
    }

    @Override
    public void track() {
        System.out.println("Jet tracking");
    }
}

//
//
//
//1. interface， protected / package-private 皆不允許，預設是public
//欄位，
//int x = 10; // 等同於 public static final int x = 10; ，值都不可以更改
//方法，
//1-A. 抽象方法 (沒有方法本體)，此為預設方法，只能是 public abstract，但可以不寫，隱式自動表達
//interface具有方法本體一定要是 default / static / private，不可以不加
//1-B. default方法 (表示有實作方法本體)，若要用default，則一定要寫default，一定是public，但public可以不寫，允許被override
//1-C. static方法，一定是public，但public可以不寫， 不能被override，與interface綁定
//1-D. private方法，只能在interface內部使用，不能被實作類別看到，常用來給default方法共用邏輯
//
//2. abstract
//abstract class A {
//    //   private void m1(); // 不可能有此類，因為abstract要實作
//    abstract void m1();        // package-private abstract
//    protected abstract void m2();
//    public abstract void m3();
//
//    void m4() {}               // package-private concrete，此為class的default，與interface的default不同
//    protected void m5() {}
//    public void m6() {}
//    private void m7() {}       // class 可以 private
//}
//3. InterfaceName.super vs super
//類別 可能實作多個介面，多個介面 可能有同名 default 方法，InterfaceName.super 只能抓取default
//
//4. 若兩個 interface有相同的 方法名稱，會發生啥事情?? interface的方法類型是否會影響??
//4-A. 兩個 interface都是抽象方法>>>>完全沒問題，只要實作一次，同時滿足兩者
//4-B. 兩個 interface都是default方法 >>>> 會跳出錯誤，解法有2
// 4-B-1. override 一個新方法
// 4-B-2. interfaceName.super 去抓哪個interface的方法
//4-C. 一個default，一個抽象，
//4-D. static 方法，不會被繼承，綁訂在interfaceName，所以不會有衝突
//4-E. private，只能在interface內部作用，所以也不會有衝突
//
// 
// 5. interface中的 default方法  vs   一般class的default方法
// 5-A. interface 的 default 方法表示：所有實作該 interface 的 class，會「自動擁有」這個方法的預設實作，且可選擇是否 override。
// 若 沒有 override → 使用 interface 的預設實作 若 有 override → 使用 class 自己的實作 若 多個 interface 有相同 default 方法 → 強制 override（解衝突）
// 5-B. class 裡的 default 方法只是表示：該方法是 package-private（僅同一 package 可用）

//幫我詳細介紹一下 interface的default方法，包含怎麼用?? 以及常見的問題?? 什麼時候需要用 interfaceName.super ?


