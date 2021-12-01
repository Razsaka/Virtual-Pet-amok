package pets_amok;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VirtualPetTest {
    VirtualPet underTest = new OrganicDog("Bob");

    @Test
    void shouldPlayWithAPet() {
        underTest.playWith();
        assertEquals(0, underTest.getBoredom());

    }
}







