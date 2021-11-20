package pets_amok;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class VirtualPetShelter {

    Map<String, VirtualPet> shelter = new HashMap<>();

    public void addPet(VirtualPet pet1) {
        shelter.put(pet1.getPetName(), pet1);
    }

    public void adoptPet(VirtualPet pet) {
        shelter.remove(pet.getPetName(), pet);
    }


    public Collection<VirtualPet> getAllPets() {
        return shelter.values();
    }

    public void allPetStatus() {
        for (VirtualPet pet : shelter.values()) {
            if (pet instanceof OrganicInterface) {
                System.out.println(pet.getPetName() + "'s hunger level is " + ((OrganicInterface) pet).getHunger());
                System.out.println(pet.getPetName() + "'s thirst level is " + ((OrganicInterface) pet).getThirst());
                if (pet instanceof OrganicDog) {
                    System.out.println(pet.getPetName() + "'s cage cleanliness level is " + ((OrganicDog) pet).getCageCleanliness());
                }
                if (pet instanceof OrganicCat) {
                    System.out.println(pet.getPetName() + "'s litter cleanliness level is " + ((OrganicCat) pet).getLitterCleanliness());
                }
            }
            System.out.println(pet.getPetName() + "'s fatigue level is " + pet.getFatigue());
            System.out.println(pet.getPetName() + "'s fatigue level is " + pet.getBoredom());
            if (pet instanceof RobotInterface) {
                System.out.println(pet.getPetName() + "'s oil level is " + ((RobotInterface) pet).getOilLevel());
            }

        }

    }

    public void waterAllPets() {
        for (VirtualPet pet : shelter.values()) {
            if (pet instanceof OrganicInterface) {
                ((OrganicInterface) pet).water();
            }
        }
    }

    public void walkAllDogs() {
        for (VirtualPet pet : shelter.values()) {
            if (pet instanceof Dog) {
                ((Dog) pet).walk();
            }
        }
    }

    public void oilAllRoboticPets() {
        for (VirtualPet pet : shelter.values()) {
            if (pet instanceof RobotInterface) {
                ((RobotInterface) pet).oil();
            }
        }
    }


    public void feedAllPets() {
        for (VirtualPet pet : shelter.values()) {
            if (pet instanceof OrganicInterface) {
                ((OrganicInterface) pet).feed();
            }
        }
    }

    public boolean petsAreAlive() {
        for (VirtualPet pet : shelter.values()) {
            if (pet.getHealth() <= 0) {
                return false;
            }
        }
        return true;
    }

    public void sleep() {
        for (VirtualPet pet : shelter.values()) {
            pet.sleep();
        }

    }

    public void petName() {
        System.out.println("Choose a pet:");
        for (VirtualPet pet : shelter.values()) {
            System.out.println(pet.getPetName());
        }
    }

    public void groupTick() {
        for (VirtualPet pet : shelter.values()) {
            pet.tick();
        }
    }

    public void playWith(String x) {
        shelter.get(x).playWith();
    }

    public void cleanLitterBox() {
        for (VirtualPet pet : shelter.values()) {
            if (pet instanceof OrganicCat) {
                ((OrganicCat) pet).cleanLitterBox();
            }
        }
    }
    
    public void cleanDogCages() {
        for (VirtualPet pet : shelter.values()) {
            if (pet instanceof OrganicDog) {
                ((OrganicDog) pet).cleanCage();
            }
        }
    }
}

