import Forest.Animals.Dog;
import Forest.Animals.Lion;
import Forest.Interfaces.Animal;

public class AnimalFactory {
    public static Animal getAnimal (String type) {
        if (type.equals("dangerous")) {
            return new Lion();
        } else {
            return new Dog();
        }
    }
}
