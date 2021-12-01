package pets_amok;

public abstract class VirtualPet {

    protected String petName;
    protected String petType;
    protected int boredom;
    protected int health;
    protected int happiness;


    public VirtualPet(String petName) {
        this.health = 100;
        this.petName = petName;
        this.petType = "Pet";
        this.boredom = 10;
        this.happiness= 100;

    }

    public String toString() {
       return "Name   | Type    | Health   | Happiness\n" +
        this.petName + "   | " + this.petType + "   | " + this.health + "   | " + this.happiness + "\n";
    }

    public String getPetName() {
        return petName;
    }

    public String getPetType() {
        return petType;
    }

    public int getBoredom() {
        return boredom;
    }

    public int getHealth() { return  health;}

    public int getHappiness() {
        return happiness;
    }

    public int tick() {
        boredom+= 5;
        happiness -= 10;
        if (happiness <= 50) {
            health -= 10;
        }
        return 0;
    }



    public void playWith() {
        boredom = 0;
        health++;
        happiness += 20;
    }
}