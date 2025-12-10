package oop002.polymorphism;

public class Polymorphism {
    public Polymorphism() {
//        看左邊（型別）決定能不能呼叫方法 → 編譯期
//        看右邊（物件）決定呼叫哪個方法版本 → 執行期

//        多型靠的是「方法覆寫」，不是方法多載（overload）
//        static 方法沒有多型
//        private 方法不能 override，因此沒有多型

//        工廠模式製造動物
        Animal a1 = AnimalFactory.createAnimal("Dog");
        Animal a2 = AnimalFactory.createAnimal("Cat");

//        Animal a1 = new Dog();
//        Animal a2 = new Cat();

        a1.speak(); // Dog bark
        a2.speak(); // Cat meow


//        Animal a = AnimalFactory.create("dog");

    }
}
