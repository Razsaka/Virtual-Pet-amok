package pets_amok;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class RobotPetTest {
    RobotDog underTest = new RobotDog("Lucky");

    @Test
    public void shouldOilPet() {
        underTest.oil();
        assertEquals(0, underTest.getOilLevel());
    }
}