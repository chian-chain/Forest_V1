package Animals;

import Interfaces.Animal;

public class Lion implements Animal {

    @Override
    public void speak() {
        System.out.println("Roar....Roar...");
    }

    @Override
    public void sleep() {
        System.out.println("Zzzzz......");
    }

    public void huntGoat() {
        System.out.println("goat is hunted...Yummm!");
    }
}
