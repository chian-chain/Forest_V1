import Interfaces.Animal;
import Interfaces.Ranger;

class ForestService_1 implements Ranger {

    @Override
    public void listenAnimalVoice(Animal animal) {
        animal.speak();
    }

    @Override
    public void callSleepCommand(Animal animal) {
        animal.sleep();
    }
}
