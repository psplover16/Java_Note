package oop002.polymorphism;

public class AnimalFactory {

    public static Animal createAnimal(String type) {
        return switch (type.toLowerCase()) {
            case "dog" -> new Dog();
            case "cat" -> new Cat();
            default -> null;
        };
    }

}
