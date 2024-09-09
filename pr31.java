// A. by extending Thread class
class Mythread1 extends Thread {
    public void run() {
        System.out.println("Hello World");
    }
}

// B. by using Runnable interface
class Mythread2 implements Runnable {
    public void run() {
        System.out.println("Hello World");
    }
}

public class pr31 {
    public static void main(String[] args) {
        Mythread1 thread1 = new Mythread1();
        thread1.start();

        Thread thread2 = new Thread(new Mythread2());
        thread2.start();
    }
}
