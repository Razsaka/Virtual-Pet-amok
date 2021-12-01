package pets_amok;

public class RoboticPet extends VirtualPet {
    private int oilLevel;
    public RoboticPet(String petName) {
        super(petName);
        oilLevel = 20;
    }

    public void oil() {
        oilLevel = 0;
    }

    public int getOilLevel() {
        return oilLevel;
    }

    @Override
    public String toString() {
        return super.toString() + "Oil level: " + oilLevel + "\n";
    }

    @Override
    public int tick() {
        oilLevel += 10;
        if (oilLevel >= 50) {
            health -= 5;
        }
        return super.tick();
    }
}
