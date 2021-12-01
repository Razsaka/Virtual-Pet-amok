package pets_amok;

public class OrganicPet extends VirtualPet {
    protected int hunger;
    protected int thirst;
    protected int fatigue;
    protected int waste;

    public OrganicPet(String petName) {
        super(petName);
        waste = 15;
        fatigue = 10;
        hunger = 30;
        thirst = 30;
    }

    public void feed() {
        hunger = 0;
    }

    public void water() {
        thirst = 0;
    }

    public void sleep() {
        fatigue = 0;
    }

    public int getFatigue() {
        return fatigue;
    }

    public int getHunger() {
        return hunger;
    }

    public int getThirst() {
        return thirst;
    }

    public int getWaste() {
        return waste;
    }

    @Override
    public String toString() {
        return super.toString() + "Waste: " + waste + "\n";
    }

    @Override
    public int tick() {
        fatigue+= 5;
        hunger += 5;
        thirst += 5;
        waste += 5;
        if (hunger >= 30 || thirst >= 30 || waste >= 30) {
            health -= 5;
        }
        return super.tick();
    }
}
