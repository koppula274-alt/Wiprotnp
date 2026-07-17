class ShapeBase {

    public void draw() {
        System.out.println("Drawing Shape");
    }

    public void erase() {
        System.out.println("Erasing Shape");
    }
}

class Circle extends ShapeBase {

    @Override
    public void draw() {
        System.out.println("Drawing Circle");
    }

    @Override
    public void erase() {
        System.out.println("Erasing Circle");
    }
}

class Triangle extends ShapeBase {

    @Override
    public void draw() {
        System.out.println("Drawing Triangle");
    }

    @Override
    public void erase() {
        System.out.println("Erasing Triangle");
    }
}

class Square extends ShapeBase {

    @Override
    public void draw() {
        System.out.println("Drawing Square");
    }

    @Override
    public void erase() {
        System.out.println("Erasing Square");
    }
}

public class Shape {

    public static void main(String[] args) {

        ShapeBase c = new Circle();
        ShapeBase t = new Triangle();
        ShapeBase s = new Square();

        c.draw();
        c.erase();

        System.out.println();

        t.draw();
        t.erase();

        System.out.println();

        s.draw();
        s.erase();
    }
}