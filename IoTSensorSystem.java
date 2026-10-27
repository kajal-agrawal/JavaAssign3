class SquareCalculator extends Thread {
    private int number;

    public SquareCalculator(int number) {
        this.number = number;
    }

    public void run() {
        System.out.println("Square: " + (number * number));
    }
}

class CubeCalculator extends Thread {
    private int number;

    public CubeCalculator(int number) {
        this.number = number;
    }

    public void run() {
        System.out.println("Cube: " + (number * number * number));
    }
}

public class IoTSensorSystem {
    public static void main(String[] args) {
        System.out.println("1. Start Simulation");
        int[] simulatedNumbers = {4, 7, 10};

        for (int num : simulatedNumbers) {
            System.out.println("Generated: " + num);
            if (num % 2 == 0) {
                SquareCalculator sq = new SquareCalculator(num);
                sq.start();
                try { sq.join(); } catch (InterruptedException e) {}
            } else {
                CubeCalculator cb = new CubeCalculator(num);
                cb.start();
                try { cb.join(); } catch (InterruptedException e) {}
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {}
        }
    }
}