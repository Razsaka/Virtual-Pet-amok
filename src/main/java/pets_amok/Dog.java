package pets_amok;

public abstract class Dog extends VirtualPet {
    public Dog(String petName, String petType, int fatigue, int boredom) {
        super(petName, petType, fatigue, boredom);
    }

    public void walk () {
       happiness += 5;
       health++;
    }
}

