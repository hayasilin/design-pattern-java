package CreationalPatterns.FatoryMethod;

import CreationalPatterns.SimpleFactory.Adventurer;
import CreationalPatterns.SimpleFactory.Archer;

public class ArcherTrainingCamp implements TrainingCamp {

    @Override
    public Adventurer trainAdventurer() {
        System.out.println("Train an archer");
        return new Archer();
    }
}
