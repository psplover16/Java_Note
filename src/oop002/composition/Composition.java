package oop002.composition;

public class Composition {

//    Composition（組合）＝物件由其他物件組成（Has-A），不是 Is-A。
//    組合比繼承更安全、更靈活，是現代 OOP 最推薦的設計方式。

    private Engine engine = new Engine();

    public Composition() {
        Car car = new Car();
        car.start();
    }
}
