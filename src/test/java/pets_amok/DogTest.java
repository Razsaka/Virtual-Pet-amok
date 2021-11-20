package pets_amok;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DogTest {
    OrganicDog underTest = new OrganicDog("Bob", "Dog", 5, 5);

    @Test
    public void shouldWalkDog() {
        int oldCageCleanliness = underTest.getCageCleanliness();
        int oldHappiness = underTest.getHappiness();
        int oldHealth = underTest.getHealth();
        underTest.walk();
        assertEquals(oldCageCleanliness+1, underTest.getCageCleanliness());
        assertEquals(oldHappiness+5, underTest.getHappiness());
        assertEquals(oldHealth+1, underTest.getHealth());
    }
}