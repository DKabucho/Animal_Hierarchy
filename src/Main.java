
public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[6];
        animals[0] = new Dog("Buddy", 3, 20.5, "Golden Retriever");
        animals[1] = new Pigeon("Sky", 1, 0.5, "Gray", "Rock Pigeon");
        animals[2] = new Blowfish("Puffy", 2, 1.2, "Saltwater", true);
        animals[3] = new Mammal("Elephant", 10, 5000);
        animals[4] = new Bird("Parrot", 2, 0.3, "Green");
        animals[5] = new Fish("Goldfish", 1, 0.1, "Freshwater");

        for (Animal animal : animals) {
            System.out.println(animal);
            animal.eat();
            animal.getVoice();
        }

        AnimalBehavior [] behaviors = new AnimalBehavior[3];
        behaviors[0] = new Dog("Buddy", 3, 20.5, "Golden Retriever");
        behaviors[1] = new Pigeon("Sky", 1, 0.5, "Gray", "Rock Pigeon");
        behaviors[2] = new Blowfish("Puffy", 2, 1.2, "Saltwater", true);

        for (AnimalBehavior behavior : behaviors) {
            behavior.sleep();
        }
    }
}