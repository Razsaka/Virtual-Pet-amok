package pets_amok;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OrganicPetTest {
    OrganicDog underTest = new OrganicDog("Happy", "Dog", 5, 5);

    @Test
    public void shouldFeedPet() {
        underTest.feed();
        assertEquals(0, underTest.getHunger());
    }

    @Test
    public void shouldGiveWater() {
        underTest.water();
        assertEquals(0, underTest.getThirst());
    }
}
