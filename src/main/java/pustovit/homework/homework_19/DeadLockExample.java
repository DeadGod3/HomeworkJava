package pustovit.homework.homework_19;

public class DeadLockExample implements Runnable {
    final Object paper = new Object();
    final Object scissors = new Object();


    public void doSun() {
        synchronized (scissors) { // May deadlock here
            System.out.println(Thread.currentThread().getName()
                    + " взяла ножницы для вырезания солнышка");
            synchronized (paper) {
                System.out.println(Thread.currentThread().getName()
                        + " взяла бумагу для вырезания солнышка");
                System.out.println(Thread.currentThread().getName()
                        + " вырезает солнышко");
            }
        }
    }
    public void doCloud() {
        synchronized (paper) { // May deadlock here
            System.out.println(Thread.currentThread().getName()
                    + " взяла бумагу для вырезания облачка");
            synchronized (scissors) {
                System.out.println(Thread.currentThread().getName()
                        + " взяла ножницы для вырезания облачка");
                System.out.println(Thread.currentThread().getName()
                        + " вырезает облачко");
            }
        }


    }

    @Override
    public void run() {
        doSun();
        doCloud();

    }



}
