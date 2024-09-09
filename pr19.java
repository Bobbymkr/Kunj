public class pr19 {
    public static void main(String[] args) {
        Shape shape = new Shape();
        Rectangle rectangle = new Rectangle();
        Square square = new Square();

        shape.printMessage();
        rectangle.printMessage();
        square.printMessage();
    }
}

class Shape {
    public void printMessage() {
        System.out.println("This is shape");
    }
}

class Rectangle extends Shape {
    public void printMessage() {
        System.out.println("This is rectangular shape");
    }
}

class Square extends Rectangle {
    public void printMessage() {
        System.out.println("Square is a rectangle");
    }
}