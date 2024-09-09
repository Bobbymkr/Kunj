public class pr34 extends Thread {
    private int value;

    public pr34(int value) {
        this.value = value;
    }

    public void run() {
        try {
            Thread.sleep(1000); // Sleep for 1 second
            value++;
            System.out.println("Incremented value: " + value);
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted");
        }
    }

    public static void main(String[] args) {
        int initialValue = 5;
        pr34 thread = new pr34(initialValue);
        thread.start();
    }
}