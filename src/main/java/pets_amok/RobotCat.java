package pets_amok;

public class RobotCat extends Cat implements RobotInterface {
    private int oilLevel;

    public RobotCat(String petName, String petType, int fatigue, int boredom) {
        super(petName, petType, fatigue, boredom);
        oilLevel= 15;
    }

    @Override
    public void oil() {
        oilLevel = 0;
        health++;
    }

    @Override
    public int getOilLevel() {
        return oilLevel;
    }
}
