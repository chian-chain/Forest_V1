import Interfaces.Animal;
import Interfaces.Ranger;

class ForestService_2 implements Ranger {
    @Override
    public void listenAnimalVoice(Animal animal) {
        System.out.print("Animal is speaking: ");
        animal.speak();
    }
}
