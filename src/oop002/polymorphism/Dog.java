package oop002.polymorphism;

class Dog extends Animal {
    @Override
    public void speak() {
        System.out.println("Dog bark");
    }
}