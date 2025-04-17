public class Fish extends Animal {
    private final String waterType;


    public Fish(String name, int age, double weight, String waterType) {
        super(name, age, weight);
        this.waterType = waterType;
    }

    @Override
    public void eat() {
        System.out.println("Fish is eating");
    }

    @Override
    public void getVoice() {
        System.out.println("Fish is making a sound");
    }

    @Override
    public String toString() {
        return "Fish{" +
                "waterType='" + waterType + '\'' +
                "} " + super.toString();
    }
}
