public class Blowfish extends Fish {
    private boolean isInflated;

    public Blowfish() {}

    public Blowfish(String name, int age, double weight, String waterType, boolean isInflated) {
        super(name, age, weight, waterType);
        this.isInflated = isInflated;
    }

    public Blowfish(String name, int age, String waterType, boolean isInflated) {
        super(name, age, waterType);
        this.isInflated = isInflated;
    }

    public boolean isInflated() {
        return isInflated;
    }

    public void setInflated(boolean inflated) {
        isInflated = inflated;
    }

    @Override
    public void eat() {
        System.out.println("Blowfish is eating");
    }

    @Override
    public void getVoice() {
        System.out.println("Blowfish is making a sound");
    }

    public void inflate() {
        System.out.println("Blowfish is inflating");
    }

    @Override
    public String toString() {
        return "Blowfish{" +
                "isInflated=" + isInflated +
                "} " + super.toString();
    }
}
