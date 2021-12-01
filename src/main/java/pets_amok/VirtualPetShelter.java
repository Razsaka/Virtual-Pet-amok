package pets_amok;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class VirtualPetShelter {

    Map<String, VirtualPet> shelter = new HashMap<>();

    public void addPet(VirtualPet pet1) {
        shelter.put(pet1.getPetName(), pet1);
    }

    public void adoptPet(String petName) {
        shelter.remove(petName);
    }

    public boolean isPetInShelter(String petName) {
        return shelter.containsKey(petName);
    }

    public Collection<VirtualPet> getAllPets() {
        return shelter.values();
    }

    public void allPetStatus() {
        for (VirtualPet pet : shelter.values()) {
            System.out.println(pet);
        }

    }

    public void waterAllPets() {
        for (VirtualPet pet : shelter.values()) {
            if (pet instanceof OrganicPet) {
                ((OrganicPet) pet).water();
            }
        }
    }

    public void walkAllDogs() {
        for (VirtualPet pet : shelter.values()) {
            if (pet instanceof WalkableInterface) {
                ((WalkableInterface) pet).walk();
            }
        }
    }

    public void oilAllRoboticPets() {
        for (VirtualPet pet : shelter.values()) {
            if (pet instanceof RoboticPet) {
                ((RoboticPet) pet).oil();
            }
        }
    }


    public void feedAllPets() {
        for (VirtualPet pet : shelter.values()) {
            if (pet instanceof OrganicPet) {
                ((OrganicPet) pet).feed();
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
            if(pet instanceof OrganicPet ) {
                ((OrganicPet) pet).sleep();
            }
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
        allPetStatus();
    }

    public void playWith(String pet) {
        if (shelter.containsKey(pet)) {
            shelter.get(pet).playWith();
        } else {
            System.out.println("Cannot find pet");
        }
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