package pets_amok;

public class VirtualPet {

    protected String petName;
    protected String petType;
    protected int fatigue;
    protected int boredom;
    protected int health;
    protected int happiness;


    public VirtualPet(String petName, String petType, int fatigue, int boredom) {
        this.health = 100;
        this.petName = petName;
        this.petType = petType;
        this.fatigue = fatigue;
        this.boredom = boredom;
        this.happiness= 100;

    }

    public String getPetName() {
        return petName;
    }

    public String getPetType() {
        return petType;
    }

    public int getFatigue() {
        return fatigue;
    }

    public int getBoredom() {
        return boredom;
    }

    public int getHealth() { return  health;}

    public int getHappiness() {
        return happiness;
    }

    public int tick() {
        fatigue++;
        boredom++;
        health--;
        return 0;
    }

    public void sleep() {
        fatigue = 0;
        boredom++;
        health++;
    }

    public void playWith() {
        boredom = 0;
        health++;
    }
}