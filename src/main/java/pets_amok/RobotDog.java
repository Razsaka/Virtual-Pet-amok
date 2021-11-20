package pets_amok;

public class RobotDog extends Dog implements RobotInterface {
    private int oilLevel;
    public RobotDog(String petName, String petType, int fatigue, int boredom) {
        super(petName, petType, fatigue, boredom);
        oilLevel = 50;
    }

    public void oil() {
       oilLevel = 0;
       health++;
    }

    @Override
    public int getOilLevel() {
        return oilLevel;
    }
}


