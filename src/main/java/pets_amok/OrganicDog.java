package pets_amok;

public class OrganicDog extends OrganicPet implements WalkableInterface {
    public OrganicDog(String petName) {
        super(petName);
        this.petType = "Dog";
    }

    public void cleanCage() {
        waste = 0;
    }

    public void walk () {
        happiness += 15;
        waste -= 10;
    }
}
