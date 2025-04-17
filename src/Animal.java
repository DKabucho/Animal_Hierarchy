
public abstract class Animal {
    private final String name;
    private final int age;
    private final double weight;


    public Animal(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }


    public abstract void eat();
    public abstract void getVoice();





    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }
}
