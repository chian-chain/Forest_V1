package Animals;

import Forest.Interfaces.Animal;

public class Dog extends Lion implements Animal {
    @Override
    public void speak() {
        System.out.println("barking...");
    }
}
