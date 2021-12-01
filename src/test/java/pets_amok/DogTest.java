package pets_amok;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DogTest {
    OrganicDog underTest = new OrganicDog("Bob");

    @Test
    public void shouldWalkDog() {
        int oldUncleanliness = underTest.getWaste();
        int oldHappiness = underTest.getHappiness();
        underTest.walk();
        assertEquals(oldUncleanliness-10, underTest.getWaste());
        assertEquals(oldHappiness+15, underTest.getHappiness());
    }
}