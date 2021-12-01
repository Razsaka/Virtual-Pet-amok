package pets_amok;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OrganicPetTest {
    OrganicDog underTest = new OrganicDog("Happy");

    @Test
    public void shouldSleepPet() {
        underTest.sleep();
        assertEquals(0, underTest.getFatigue());
    }
    
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
