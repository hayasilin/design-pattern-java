package CreationalPatterns.SimpleFactory;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class VillageTest {
    @Test
    public void test() {
        Adventurer memberA = TrainingCamp.trainAdventurer("archer");
        Adventurer memberB = TrainingCamp.trainAdventurer("warrior");

        assertEquals(memberA.getType(), "Archer");
        assertEquals(memberB.getType(), "Warrior");
    }
}
