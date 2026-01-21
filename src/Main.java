import Interfaces.Animal;
import Interfaces.Ranger;

public class Main {
    public static void main(String[] args) {

        Ranger ranger = ForestServiceProvider.getForestService();
        Animal animal = AnimalFactory.getAnimal("");

        ranger.listenAnimalVoice(animal);
    }
}