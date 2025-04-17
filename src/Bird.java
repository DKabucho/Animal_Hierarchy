public class Bird extends Animal{
    private final String featherColor;


    public Bird(String name, int age, double weight, String featherColor) {
        super(name, age, weight);
        this.featherColor = featherColor;
    }

    @Override
    public void eat() {
        System.out.println("Bird is eating");
    }

    @Override
    public void getVoice() {
        System.out.println("Bird is chirping");
    }

    @Override
    public String toString() {
        return "Bird{" +
                "featherColor='" + featherColor + '\'' +
                "} " + super.toString();
    }
}
