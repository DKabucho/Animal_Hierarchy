public class Mammal extends  Animal {
    public Mammal() {}

    public Mammal(String name, int age, double weight) {
        super(name, age, weight);
    }

    public Mammal(String name, int age) {
        super(name, age);
    }
    @Override
    public void eat() {
        System.out.println("Mammal is eating");
    }

    @Override
    public void getVoice() {
        System.out.println("Mammal is making a sound");
    }
}
