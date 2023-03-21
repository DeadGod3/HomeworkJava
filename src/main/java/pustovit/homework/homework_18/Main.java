package pustovit.homework.homework_18;

import pustovit.homework.homework_18.deadlock.First;
import pustovit.homework.homework_18.deadlock.Second;

public class Main {

    //    private static Object o = new Object();
    public static void main(String[] args) throws InterruptedException {


//        synchronized применение:
        final SyncService syncService = new SyncService();
        final Object object = new Object();
        for (int i = 0; i < 5; i++) {
            final Thread thread = new Thread(() -> syncService.checkSyncCallForSomeObject(object));
            thread.start();
        }
        System.out.println("counter result: " + syncService.getCounter());

//      Deadlock example:
        final First first = new First();
        final Second second = new Second();
        first.setSecond(second);
        second.setFirst(first);

        final Thread firstThread = new Thread(() -> System.out.println(first.getStringFromSecondClass()));
        final Thread secondThread = new Thread(() -> System.out.println(second.getStringFromFirstClass()));
        firstThread.start();
        secondThread.start();

        //wait vs notify example:
        Object o = new Object();
        Thread thread = new Thread(() -> {
            synchronized (o) {
                for (int i = 0; i < 10; i++) {
                    System.out.println("thread running: " + Thread.currentThread().getName());
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                o.notify();
            }
        });

        thread.start();
        synchronized (o) {
            o.wait();
        }
        System.out.println("Finished");
        System.out.println("Finished");
        System.out.println("Finished");
    }

}


