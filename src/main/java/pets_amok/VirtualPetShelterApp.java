package pets_amok;

import java.util.Scanner;

public class VirtualPetShelterApp {



    public static void main(String[] args) {
        VirtualPetShelter petShelter = new VirtualPetShelter();
        OrganicDog pet1 = new OrganicDog("Kidd","dog",5,4);
        OrganicCat pet2 = new OrganicCat("Sam","cat",3,5);

        petShelter.addPet(pet1);
        petShelter.addPet(pet2);

        Scanner userInput = new Scanner(System.in);
        System.out.println("Welcome to Noah's Ark Sanctuary");

        petShelter.allPetStatus();

        while (petShelter.petsAreAlive()) {
            System.out.println("What would you like to do?");
            System.out.println("1. Fed All Pets");
            System.out.println("2. Water All Pets");
            System.out.println("3. Pet a pet to sleep");
            System.out.println("4. Welcome a new pet");
            System.out.println("5. Play with a pet");
            System.out.println("6. Walk All dogs");
            System.out.println("7. Clean dog cages");
            System.out.println("8. Clean cat litter boxes");
            System.out.println("9. Oil robotic pets");
            System.out.println("10. Give up");

            int option = userInput.nextInt();
            boolean endGame = false;
            Scanner x;

            switch (option) {
                case 1:
                    petShelter.feedAllPets();
                    petShelter.allPetStatus();
                    System.out.println("Fed all the pets in the shelter");
                    break;
                case 2:
                    petShelter.waterAllPets();
                    petShelter.allPetStatus();
                    System.out.println("Watered all the Pets");
                    break;
                case 3:
                    petShelter.sleep();
                    petShelter.allPetStatus();

                    System.out.println(" Pet pet to sleep");
                    pet1.sleep();
                    break;
                case 4:
                    x = new Scanner(System.in);
                    System.out.println("Please provide the name of the new pet");
                    String petName=x.nextLine();

                    System.out.println("Please provide the type of the new pet");
                    String petType=x.nextLine();

                    VirtualPet newPet = new VirtualPet(petName, petType, 5, 5);
                    petShelter.addPet(newPet);
                    System.out.println( "You are now a member of the pet family" );
                    break;
                case 5:
                    x = new Scanner(System.in);
                    petShelter.petName();
                    String playWith = x.nextLine();
                    petShelter.playWith(playWith);
                    System.out.println( "Thank you playing with " +  playWith);
                    break;

                case 6:
                    petShelter.walkAllDogs();
                    System.out.println("All dogs are walked");
                    break;
                case 7:
                    petShelter.cleanDogCages();
                    System.out.println("All dog cages are cleaned");
                    break;
                case 8:
                    petShelter.cleanLitterBox();
                    System.out.println("All cat litter boxes are cleaned");
                    break;
                case 9:
                    petShelter.oilAllRoboticPets();
                    System.out.println("All robotic pets are oiled");
                    break;

                default:
                    System.out.println("Give up");
                    endGame = true;
                    break;
            }

            petShelter.groupTick();

            if (endGame) {
                break;
            }
        }
        System.out.println("Exit Shelter!");
        userInput.close();
    }
}
