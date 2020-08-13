package CreationalPatterns.FatoryMethod;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

import CreationalPatterns.SimpleFactory.Adventurer;

public class TrainingCampTest {
    @Test
    public void test() {
        TrainingCamp trainingCamp = new ArcherTrainingCamp();
        Adventurer memberA = trainingCamp.trainAdventurer();

        TrainingCamp otherTrainingCamp = new WarriorTrainingCamp();
        Adventurer memberB = otherTrainingCamp.trainAdventurer();

        assertEquals(memberA.getType(), "Archer");
        assertEquals(memberB.getType(), "Warrior");
    }
}
