class PrinterJob implements Runnable {
    private int jobId;
    private String studentName;

    public PrinterJob(int jobId, String studentName) {
        this.jobId = jobId;
        this.studentName = studentName;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(100);
            System.out.println("Printing job " + jobId + " by " + studentName);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class UniversityPrinting {
    public static void main(String[] args) {
        int numJobs = 3;
        System.out.println("Number of print jobs: " + numJobs);

        Thread t1 = new Thread(new PrinterJob(1, "Student A"));
        Thread t2 = new Thread(new PrinterJob(2, "Student B"));
        Thread t3 = new Thread(new PrinterJob(3, "Student C"));

        t1.start();
        t2.start();
        t3.start();
    }
}