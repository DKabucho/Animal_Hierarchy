public class Pigeon extends Bird {
    private String species;

    public Pigeon() {}

    public Pigeon(String name, int age, double weight, String featherColor, String species) {
        super(name, age, weight, featherColor);
        this.species = species;
    }

    public Pigeon(String name, int age, String featherColor, String species) {
        super(name, age, featherColor);
        this.species = species;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
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

    public void deliverMessage() {
        System.out.println("Pigeon is delivering a message");
    }

    @Override
    public String toString() {
        return "Pigeon{" +
                "species='" + species + '\'' +
                "} " + super.toString();
    }
}
