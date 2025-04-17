public class Fish extends Animal {
    private String waterType;

    public Fish() {}

    public Fish(String name, int age, double weight, String waterType) {
        super(name, age, weight);
        this.waterType = waterType;
    }

    public Fish(String name, int age, String waterType) {
        super(name, age);
        this.waterType = waterType;
    }

    public String getWaterType() {
        return waterType;
    }

    public void setWaterType(String waterType) {
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

    public void swim() {
        System.out.println("Fish is swimming");
    }

    @Override
    public String toString() {
        return "Fish{" +
                "waterType='" + waterType + '\'' +
                "} " + super.toString();
    }
}
