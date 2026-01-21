import Interfaces.Animal;
import Interfaces.Ranger;

class ForestService_2 implements Ranger {
    @Override
    public void listenAnimalVoice(Animal animal) {
        System.out.print("Animal is speaking: ");
        animal.speak();
    }

    @Override
    public void callSleepCommand(Animal animal) {
        System.out.println("Animal is going to sleep...");
        animal.sleep();
    }


}
