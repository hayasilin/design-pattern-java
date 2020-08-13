package CreationalPatterns.SimpleFactory;

public class TrainingCamp {
    public static Adventurer trainAdventurer(String type) {
        switch (type) {
            case "archer": {
                System.out.println("Train a archer");
                return new Archer();
            }
            case "warrior": {
                System.out.println("Train a warrior");
                return new Warrior();
            }
            // Add more case if needed
            default:
                return null;
        }
    }
}
