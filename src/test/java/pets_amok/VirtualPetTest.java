package pets_amok;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VirtualPetTest {
    VirtualPet underTest = new VirtualPet("Bob", "Rabbit", 5, 5);

    @Test
    public void shouldPetToSleep() {
        underTest.sleep();
        assertEquals(0, underTest.getFatigue());

    }

    @Test
    void shouldPlayWithAPet() {
        underTest.playWith();
        assertEquals(0, underTest.getBoredom());

    }
}







