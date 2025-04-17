public class Pigeon extends Bird implements AnimalBehavior, AnimalMove {
    private final String species;

    public Pigeon(String name, int age, double weight, String featherColor, String species) {
        super(name, age, weight, featherColor);
        this.species = species;
    }

    @Override
    public void eat() {
        System.out.println("Pigeon is eating");
    }

    @Override
    public void getVoice() {
        System.out.println("Pigeon is cooing");
    }

    @Override
    public void move() {
        System.out.println("Pigeon is flying");
    }

    @Override
    public void sleep() {
        System.out.println("Pigeon is sleeping");
    }
    @Override
    public String toString() {
        return "Pigeon{" +
                "species='" + species + '\'' +
                "} " + super.toString();
    }


}
