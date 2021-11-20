package pets_amok;

import org.junit.jupiter.api.Test;

import javax.print.attribute.standard.SheetCollate;

import static org.junit.jupiter.api.Assertions.*;


public class VirtualPetShelterTest {

    @Test
    public void shouldAddPet() {
        VirtualPet newPet = new VirtualPet("Sam", "dog", 5, 4);
        VirtualPetShelter shelter = new VirtualPetShelter();
        shelter.addPet(newPet);
        assertTrue(shelter.getAllPets().contains(newPet));
    }

    @Test
    public void shouldFeedAllPets() {
        OrganicCat newPet2 = new OrganicCat("Gaf", "cat", 5, 3);
        VirtualPetShelter shelter = new VirtualPetShelter();
        shelter.addPet(newPet2);
        shelter.feedAllPets();
        assertEquals(0, newPet2.getHunger());
    }

    @Test
    public void shouldWaterAllPets() {
        OrganicCat newPet2 = new OrganicCat("Gaf", "cat", 5, 3);
        VirtualPetShelter shelter = new VirtualPetShelter();
        shelter.addPet(newPet2);
        shelter.waterAllPets();
        assertEquals(0, newPet2.getThirst());
    }

    @Test
    public void petsAreAlive() {
        VirtualPet newPet2 = new VirtualPet("Gaf", "cat", 20, 25);
        VirtualPetShelter shelter = new VirtualPetShelter();
        shelter.addPet(newPet2);
        assertFalse(shelter.petsAreAlive());
    }

    @Test
    public void shouldSleepAllPets() {
        VirtualPet newPet2 = new VirtualPet("Next", "cat", 5, 3);
        VirtualPetShelter shelter = new VirtualPetShelter();
        shelter.addPet(newPet2);
        shelter.sleep();
        assertEquals(0, newPet2.getFatigue());
    }

    @Test
    public void shouldWalkAllDogs() {
        OrganicDog newPet2 = new OrganicDog("Gaf", "dog", 5, 3);
        int oldCageCleanliness = newPet2.getCageCleanliness();
        int oldHappiness = newPet2.getHappiness();
        int oldHealth = newPet2.getHealth();
        VirtualPetShelter shelter = new VirtualPetShelter();
        shelter.addPet(newPet2);
        shelter.walkAllDogs();
        assertTrue(newPet2.getCageCleanliness() > oldCageCleanliness);
        assertTrue(newPet2.getHappiness() > oldHappiness);
        assertTrue(newPet2.getHealth() > oldHealth);
    }

    @Test
    public void shouldCleanAllDogCages() {
        OrganicDog newPet2 = new OrganicDog("Jog", "dog", 7, 2);
        VirtualPetShelter shelter = new VirtualPetShelter();
        shelter.addPet(newPet2);
        shelter.cleanDogCages();

        assertEquals(100, newPet2.getCageCleanliness());
    }

    @Test
    public void shouldCleanAllCatLitterBoxes() {
        OrganicCat newPet2 = new OrganicCat("Mag", "cat", 5, 6);
        VirtualPetShelter shelter = new VirtualPetShelter();
        shelter.addPet(newPet2);
        shelter.cleanLitterBox();
        assertEquals(100, newPet2.getLitterCleanliness());
    }

    @Test
    public void shouldOilAllRoboticPets() {
        RobotDog newPet2 = new RobotDog( "Mag", "dog", 5, 6);
        RobotCat newPet3 = new RobotCat( "Moot", "cat", 5, 6);
        VirtualPetShelter shelter= new VirtualPetShelter();
        shelter.addPet(newPet2);
        shelter.addPet(newPet3);
        shelter.oilAllRoboticPets();
        assertEquals(0,newPet2.getOilLevel());
        assertEquals(0,newPet3.getOilLevel());
    }
}



