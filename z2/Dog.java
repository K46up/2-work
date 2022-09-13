package z2;

public class Dog extends Animal {
    String name;
    public Dog(String name, String food, String location) {
        super(food, location);
        this.name = name;
    }

    public void makeNoise() {
        System.out.println("Woof");
    }

    public void eat() {
        System.out.println("Dog eat");
    }
}
