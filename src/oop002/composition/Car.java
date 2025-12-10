package oop002.composition;

class Car {
    private Engine engine = new Engine();  // ← 這就是 Composition（組合）

    public void start() {
        engine.start();
        System.out.println("Car is running!");
    }
}


