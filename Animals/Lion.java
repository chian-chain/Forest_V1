package Forest.Animals;

import Forest.Interfaces.Animal;

public class Lion implements Animal {

    @Override
    public void speak() {
        System.out.println("Roar....Roar...");
    }

    public void huntGoat() {
        System.out.println("goat is hunted...Yummm!");
    }
}
