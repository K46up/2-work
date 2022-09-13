package z2;

public class Main {
    public static void main(String[] args) {
        Vet vet = new Vet();
        Animal[] animals = new Animal[3];
        animals[0] = new Dog("Барик", "Мясо", "Будка");
        animals[1] = new Cat("Тима", "Рыба", "Вольер");
        animals[2] = new Horse("Спирит", "Сено", "Конюшня");

        for (Animal animal : animals) {
            vet.treatAnimal(animal);
        }
    }
}
