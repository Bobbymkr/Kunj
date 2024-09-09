class FirstThread extends Thread {
    public void run() {
        System.out.println("Running FIRST thread");
    }
}

class SecondThread extends Thread {
    public void run() {
        System.out.println("Running SECOND thread");
    }
}

class ThirdThread extends Thread {
    public void run() {
        System.out.println("Running THIRD thread");
    }
}

public class pr35 {
    public static void main(String[] args) {
        FirstThread first = new FirstThread();
        SecondThread second = new SecondThread();
        ThirdThread third = new ThirdThread();

        first.setPriority(3);
        third.setPriority(7);

        first.start();
        second.start();
        third.start();
    }
}