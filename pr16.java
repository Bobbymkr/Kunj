public class pr16 {
    public static void main(String[] args) {
        Parent parent = new Parent();
        Child child = new Child();

        parent.printMessage();
        child.printMessage();
        child.printChildMessage();
        parent.printMessage();
    }
}

class Parent {
    public void printMessage() {
        System.out.println("This is parent class");
    }
}

class Child extends Parent {
    public void printChildMessage() {
        System.out.println("This is child class");
    }
}