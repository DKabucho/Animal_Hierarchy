public class Blowfish extends Fish implements AnimalBehavior, AnimalMove {
    private final boolean isInflated;


    public Blowfish(String name, int age, double weight, String waterType, boolean isInflated) {
        super(name, age, weight, waterType);
        this.isInflated = isInflated;
    }

    @Override
    public void eat() {
        System.out.println("Blowfish is eating");
    }

    @Override
    public void getVoice() {
        System.out.println("Blowfish is making a sound");
    }

    @Override
    public void move() {
        System.out.println("Blowfish is swimming");
    }

    @Override
    public void sleep() {
        System.out.println("Blowfish is sleeping");
    }
    @Override
    public String toString() {
        return "Blowfish{" +
                "isInflated=" + isInflated +
                "} " + super.toString();
    }


}
