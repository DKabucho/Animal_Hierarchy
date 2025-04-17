public class Dog extends Mammal {
    private String breed;

    public Dog() {}

    public Dog(String name, int age, double weight, String breed) {
        super(name, age, weight);
        this.breed = breed;
    }

    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public void eat() {
        System.out.println("Dog is eating");
    }

    @Override
    public void getVoice() {
        System.out.println("Dog is barking");
    }

    public void fetch() {
        System.out.println("Dog is fetching");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "breed='" + breed + '\'' +
                "} " + super.toString();
    }
}
