package z2;

public class Horse extends Animal{
    String name;
    public Horse(String name, String food, String location) {
        super(food, location);
        this.name = name;
    }

    public void makeNoise() {
        System.out.println("make noise");
    }

    public void eat() {
        System.out.println("Horse eat");
    }
}
