package oop002.polymorphism;

class Cat extends Animal {
    @Override
    public void speak() {
        System.out.println("Cat meow");
    }
}