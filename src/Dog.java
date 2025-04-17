public class Dog extends Mammal implements AnimalBehavior, AnimalMove {
    private final String breed;


    public Dog(String name, int age, double weight, String breed) {
        super(name, age, weight);
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

    @Override
    public void move() {
        System.out.println("Dog is running");
    }
    @Override
    public void sleep() {
        System.out.println("Dog is sleeping");

    }
    @Override
    public String toString() {
        return "Dog{" +
                "breed='" + breed + '\'' +
                "} " + super.toString();
    }


}
