package Animals;

import Interfaces.Animal;

public class Dog extends Lion implements Animal {
    @Override
    public void speak() {
        System.out.println("barking...");
    }

    @Override
    public void sleep() {
        System.out.println("Zzzzz......");
    }
}
