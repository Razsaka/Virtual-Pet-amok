package pets_amok;


public class OrganicCat extends Cat implements OrganicInterface{
    private int hunger;
    private int thirst;
    private int litterCleanliness;

    public OrganicCat(String petName, String petType, int fatigue, int boredom) {
        super(petName, petType, fatigue, boredom);
        litterCleanliness= 15;
        hunger = 30;
        thirst = 30;
    }

    @Override
    public void feed() {
        hunger = hunger - hunger;
        thirst++;
        fatigue++;
        health++;
    }

    @Override
    public void water() {
        thirst = thirst - thirst;
        hunger++;
        fatigue++;
        health++;
    }

    public int getHunger() {
        return hunger;
    }

    public int getThirst() {
        return thirst;
    }

    public void cleanLitterBox() {
        litterCleanliness = 100;
    }

    @Override
    public void sleep() {
        super.sleep();
        hunger++;
        thirst++;
    }

    @Override
    public void playWith() {
        super.playWith();
        hunger++;
        thirst++;
    }

    @Override
    public int tick() {
        super.tick();
        hunger++;
        thirst++;
        return litterCleanliness;
    }
    public int getLitterCleanliness() {
        return litterCleanliness;
    }
}
