package CreationalPatterns.FatoryMethod;

import CreationalPatterns.SimpleFactory.Adventurer;
import CreationalPatterns.SimpleFactory.Warrior;

public class WarriorTrainingCamp implements TrainingCamp {
    @Override
    public Adventurer trainAdventurer() {
        System.out.println("Train a warrior");
        return new Warrior();
    }
}
