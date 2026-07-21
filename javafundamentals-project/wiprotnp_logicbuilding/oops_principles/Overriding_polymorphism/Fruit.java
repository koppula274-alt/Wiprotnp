class FruitBase {

    String name;
    String taste;
    String size;

    FruitBase(String name, String taste, String size) {
        this.name = name;
        this.taste = taste;
        this.size = size;
    }

    public void eat() {
        System.out.println("Fruit Name : " + name);
        System.out.println("Taste : " + taste);
    }
}

class Apple extends FruitBase {

    Apple() {
        super("Apple", "Sweet", "Medium");
    }

    @Override
    public void eat() {
        System.out.println("Fruit Name : " + name);
        System.out.println("Taste : Sweet");
    }
}

class Orange extends FruitBase {

    Orange() {
        super("Orange", "Sour", "Medium");
    }

    @Override
    public void eat() {
        System.out.println("Fruit Name : " + name);
        System.out.println("Taste : Sour");
    }
}

public class Fruit {

    public static void main(String[] args) {

        FruitBase apple = new Apple();
        FruitBase orange = new Orange();

        apple.eat();
        System.out.println();

        orange.eat();
    }
}