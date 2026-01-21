import Forest.Interfaces.Animal;
import Forest.Interfaces.Ranger;

class ForestService_1 implements Ranger {

    @Override
    public void listenAnimalVoice(Animal animal) {
        animal.speak();
    }
}
