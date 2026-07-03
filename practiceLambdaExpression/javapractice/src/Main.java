// Base Class
class Animal {
    public void makeSound() {
        System.out.println("Some generic animal sound");
    }
}

// Subclass 1
class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Bark!");
    }
    
    public void fetch() {
        System.out.println("Dog is fetching the ball!");
    }
}

// Subclass 2
class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Meow!");
    }
}

public class Main {
    public static void main(String[] args) {
        // Declaring a polymorphic array
        Animal[] myZoo = new Animal[3];
        
        // Storing different subclass objects in the same array
        myZoo[0] = new Dog(); 
        myZoo[1] = new Cat();
        myZoo[2] = new Animal(); 

        // Uniform processing via Runtime Polymorphism (Dynamic Method Dispatch)
        for (Animal animal : myZoo) {
            animal.makeSound(); 
        }
    }
}
