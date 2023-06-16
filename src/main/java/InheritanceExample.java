class Animal {
    protected String name;
    public Animal(String name) {
        this.name = name;
    }
    public void eat() {
        System.out.println(name + " is eating.");
    }
}

class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }
    public void bark() {
        System.out.println(name + " is barking.");
    }
}

class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }
    public void meow() {
        System.out.println(name + " is meowing.");
    }
}

public class InheritanceExample {
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy");
        dog.eat();
        dog.bark();

        Cat cat = new Cat("Lily");
        cat.meow();
        cat.eat();
    }
}

//Ingeirtance is a fundamental concept in OOP(object-oriented programming) that allows one class to ingerit properties
// and behaviors from another class. The class that inherits is called the child class or subclass, and the class being
// inherited from is called the parent class or superclass.

// In the exmaple code, we have a parent class called Animal, which has a name field and an eat() method. The child clas
// Dog extends the Animal clas, which means it inherits the name field and the eat() method from the parent class. The
// Dog class also has its own unique method called bark().
// In the main method, we create an instance of the Dog class named dog with the name "Buddy". Since the Dog class
// extends the Animal class, the dog object can access and use the eat() method inherited from the Animal superclass.
// Additionally, it can call the bark() method specific to the Dog class.

//Inheritance promoted code reuse and allows for the creation of specialized classes that inherit common attributes and
// behaviors from a more general class. It helps in organizing and modeling relationships between classes, enabling
// hierarchical structures and polymorphism. With inheritance, you can define and implement common functionality
// in parent class and then extend and customize it in the child classes as needed.
