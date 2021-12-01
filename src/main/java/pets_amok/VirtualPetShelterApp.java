package pets_amok;

import java.util.Scanner;

public class VirtualPetShelterApp {



    public static void main(String[] args) {
        VirtualPetShelter petShelter = new VirtualPetShelter();
        OrganicDog pet1 = new OrganicDog("Kidd");
        OrganicCat pet2 = new OrganicCat("Sam");

        petShelter.addPet(pet1);
        petShelter.addPet(pet2);

        Scanner userInput = new Scanner(System.in);
        System.out.println("Welcome to Noah's Ark Sanctuary");

        petShelter.allPetStatus();

        while (petShelter.petsAreAlive()) {
            System.out.println("What would you like to do?");
            System.out.println("1. Feed All Pets");
            System.out.println("2. Water All Pets");
            System.out.println("3. Cradle all organic pets to sleep");
            System.out.println("4. Welcome a new pet");
            System.out.println("5. Play with a pet");
            System.out.println("6. Walk All dogs");
            System.out.println("7. Clean dog cages");
            System.out.println("8. Clean cat litter boxes");
            System.out.println("9. Oil robotic pets");
            System.out.println("10. Adopt a pet");
            System.out.println("11. Give up");

            int option = userInput.nextInt();
            boolean endGame = false;
            Scanner scanner;

            switch (option) {
                case 1:
                    petShelter.feedAllPets();

                    System.out.println("Fed all the pets in the shelter");
                    break;
                case 2:
                    petShelter.waterAllPets();
                    System.out.println("Watered all the Pets");
                    break;
                case 3:
                    petShelter.sleep();
                    System.out.println("Cradled all organic pets to sleep");
                    pet1.sleep();
                    break;
                case 4:
                    scanner = new Scanner(System.in);
                    System.out.println("Please provide the name of the new pet");
                    String petName=scanner.nextLine();

                    System.out.println("Please provide the type of the new pet");
                    String petType = scanner.nextLine();

                    VirtualPet newPet;
                    if (petType.equalsIgnoreCase("Cat")) {
                        newPet = new OrganicCat(petName);
                    } else if (petType.equalsIgnoreCase("Dog")) {
                        newPet = new OrganicDog(petName);
                    } else if (petType.equalsIgnoreCase("Robot Cat") || petType.equalsIgnoreCase("Robotic Cat")) {
                        newPet = new RobotCat(petName);
                    } else if (petType.equalsIgnoreCase("Robot Dog") || petType.equalsIgnoreCase("Robotic Dog")) {
                        newPet = new RobotDog(petName);
                    } else {
                        System.out.println("Invalid pet type.");
                        break;
                    }
                    petShelter.addPet(newPet);
                    System.out.println( "You are now a member of the pet family" );
                    break;
                case 5:
                    scanner = new Scanner(System.in);
                    petShelter.petName();
                    String playWith = scanner.nextLine();
                    petShelter.playWith(playWith);
                    if (petShelter.isPetInShelter(playWith)) {
                        System.out.println("Thank you playing with " + playWith);
                    }
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
                case 10:
                    scanner = new Scanner(System.in);
                    System.out.println("Please provide the name of the pet to adopt");
                    String adoptedPet = scanner.nextLine();
                    petShelter.adoptPet(adoptedPet);
                    System.out.println("Thank you for the adoption");
                    break;

                default:
                    System.out.println("Give up");
                    endGame = true;
//                    break;
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
