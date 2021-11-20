package pets_amok;

public class OrganicDog extends Dog implements OrganicInterface {
    private int hunger;
    private int thirst;
    private int cageCleanliness;


    public OrganicDog(String petName, String petType, int fatigue, int boredom) {
        super(petName, petType, fatigue, boredom);
        cageCleanliness= 20;
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

    public void cleanCage() {
        cageCleanliness = 100;
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
    public void walk(){
        super.walk();
        cageCleanliness++;
    }

    @Override
    public int tick() {
        super.tick();
        hunger++;
        thirst++;
        return cageCleanliness;
    }
    public int getCageCleanliness() {
        return cageCleanliness;
    }

}
