package pets_amok;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class VirtualPetShelterTest {

    @Test
    public void shouldAddPet() {
        VirtualPet newPet = new OrganicDog("Sam");
        VirtualPetShelter shelter = new VirtualPetShelter();
        shelter.addPet(newPet);
        assertTrue(shelter.getAllPets().contains (newPet));
    }

    @Test
    public void shouldAdoptANewPet() {
        VirtualPet newPet= new OrganicDog("Yanny");
        VirtualPetShelter shelter=new VirtualPetShelter();
        shelter.adoptPet(newPet.getPetName());
        assertTrue(!shelter.getAllPets().contains(newPet));
    }

    @Test
    public void shouldFeedAllPets() {
        OrganicCat newPet2 = new OrganicCat("Gaf");
        VirtualPetShelter shelter = new VirtualPetShelter();
        shelter.addPet(newPet2);
        shelter.feedAllPets();
        assertEquals(0, newPet2.getHunger());
    }

    @Test
    public void shouldWaterAllPets() {
        OrganicCat newPet2 = new OrganicCat("Gaf");
        VirtualPetShelter shelter = new VirtualPetShelter();
        shelter.addPet(newPet2);
        shelter.waterAllPets();
        assertEquals(0, newPet2.getThirst());
    }

    @Test
    public void petsAreAlive() {
        VirtualPet newPet2 = new OrganicDog("Gaf");
        VirtualPetShelter shelter = new VirtualPetShelter();
        shelter.addPet(newPet2);
        assertTrue(shelter.petsAreAlive());
    }

    @Test
    public void shouldSleepAllOrganicPets() {
        OrganicPet newPet2 = new OrganicDog("Next");
        VirtualPetShelter shelter = new VirtualPetShelter();
        shelter.addPet(newPet2);
        shelter.sleep();
        assertEquals(0, newPet2.getFatigue());
    }

    @Test
    public void shouldWalkAllDogs() {
        OrganicDog newPet2 = new OrganicDog("Gaf");
        int oldCageCleanliness = newPet2.getWaste();
        int oldHappiness = newPet2.getHappiness();
        VirtualPetShelter shelter = new VirtualPetShelter();
        shelter.addPet(newPet2);
        shelter.walkAllDogs();
        assertTrue(newPet2.getWaste() < oldCageCleanliness);
        assertTrue(newPet2.getHappiness() > oldHappiness);
    }

    @Test
    public void shouldCleanAllDogCages() {
        OrganicDog newPet2 = new OrganicDog("Jog");
        VirtualPetShelter shelter = new VirtualPetShelter();
        shelter.addPet(newPet2);
        shelter.cleanDogCages();

        assertEquals(0, newPet2.getWaste());
    }

    @Test
    public void shouldCleanAllCatLitterBoxes() {
        OrganicCat newPet2 = new OrganicCat("Mag");
        VirtualPetShelter shelter = new VirtualPetShelter();
        shelter.addPet(newPet2);
        shelter.cleanLitterBox();
        assertEquals(0, newPet2.getWaste());
    }

    @Test
    public void shouldOilAllRoboticPets() {
        RobotDog newPet2 = new RobotDog( "Mag");
        RobotCat newPet3 = new RobotCat( "Moot");
        VirtualPetShelter shelter= new VirtualPetShelter();
        shelter.addPet(newPet2);
        shelter.addPet(newPet3);
        shelter.oilAllRoboticPets();
        assertEquals(0,newPet2.getOilLevel());
        assertEquals(0,newPet3.getOilLevel());
    }
}



