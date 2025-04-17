public class Bird extends Animal{
    private String featherColor;

    public Bird() {}

    public Bird(String name, int age, double weight, String featherColor) {
        super(name, age, weight);
        this.featherColor = featherColor;
    }

    public Bird(String name, int age, String featherColor) {
        super(name, age);
        this.featherColor = featherColor;
    }

    public String getFeatherColor() {
        return featherColor;
    }

    public void setFeatherColor(String featherColor) {
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

    public void fly() {
        System.out.println("Bird is flying");
    }

    @Override
    public String toString() {
        return "Bird{" +
                "featherColor='" + featherColor + '\'' +
                "} " + super.toString();
    }
}
