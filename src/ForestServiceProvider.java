import Forest.Interfaces.Ranger;

public class ForestServiceProvider {

    public static Ranger getForestService() {
        return new ForestService_1();
    }

    public static Ranger getForestServiceWithMessage() {
        return new ForestService_2();
    }
}
