                                                   /* single inheritence */
class Animal {
	
    void eat() {
        System.out.println("Eating.");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Barking.");
    }
}

public class Simple {
    public static void main(String[] args) {
      System.out.println("Dog is ");
        Dog myDog = new Dog();
        myDog.eat(); 
        myDog.bark();
    }
}
