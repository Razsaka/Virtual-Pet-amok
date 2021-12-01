package pets_amok;


public class OrganicCat extends OrganicPet {
    public OrganicCat(String petName) {
        super(petName);
        this.petType = "Cat";
    }

    public void cleanLitterBox() {
        waste = 0;
    }
}
