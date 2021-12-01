package pets_amok;

public class RobotDog extends RoboticPet implements WalkableInterface {
    public RobotDog(String petName) {
        super(petName);
        this.petType = "Robot Dog";
    }

    @Override
    public void walk() {
        happiness += 15;
    }
}


