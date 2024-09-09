import java.util.Random;

public class pr33{
    public static void main(String[] args) {
        NumberGenerator generator = new NumberGenerator();
        SquareCalculator squareCalculator = new SquareCalculator();
        CubeCalculator cubeCalculator = new CubeCalculator();

        Thread t1 = new Thread(generator);
        Thread t2 = new Thread(squareCalculator);
        Thread t3 = new Thread(cubeCalculator);

        t1.start();
        t2.start();
        t3.start();
    }
}

class NumberGenerator implements Runnable {
    private Random random = new Random();
    private static int generatedNumber;
    private static boolean numberAvailable = false;

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(1000);
                synchronized (this) {
                    generatedNumber = random.nextInt(100);
                    System.out.println("Generated number: " + generatedNumber);
                    numberAvailable = true;
                    notifyAll();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static synchronized int getGeneratedNumber() throws InterruptedException {
        while (!numberAvailable) {
            NumberGenerator.class.wait();
        }
        numberAvailable = false;
        return generatedNumber;
    }
}

class SquareCalculator implements Runnable {
    @Override
    public void run() {
        while (true) {
            try {
                int number = NumberGenerator.getGeneratedNumber();
                if (number % 2 == 0) {
                    int square = number * number;
                    System.out.println("Square of " + number + " is: " + square);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class CubeCalculator implements Runnable {
    @Override
    public void run() {
        while (true) {
            try {
                int number = NumberGenerator.getGeneratedNumber();
                if (number % 2 != 0) {
                    int cube = number * number * number;
                    System.out.println("Cube of " + number + " is: " + cube);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
