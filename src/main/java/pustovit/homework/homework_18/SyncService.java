package pustovit.homework.homework_18;

public class SyncService {
    private int counter = 0;

    public int getCounter() {
        return counter;
    }

    public synchronized void checkSyncCallLogic() {
        for (int i = 0; i < 100; i++) {
//            counter += 1; // 1. newVar = counter / 2. newVar = newVar + 1 / 3. counter = newVar
            System.out.println("Thread " + Thread.currentThread().getName());
        }
    }

    public void checkPartSyncCallLogic() {
        for (int i = 0; i < 10; i++) {
            System.out.println("ASYNC CALL: " + Thread.currentThread().getName());
        }
        synchronized (this) {
            for (int i = 0; i < 10; i++) {
                System.out.println("sync call: " + Thread.currentThread().getName());
            }
        }
    }

    public void checkSyncCallForSomeObject(final Object object) {
//        final Object object = new Object(); // Не работает, так как создается объект отдельный для каждого потока, а не для всех один!!!

        synchronized (object) {
            for (int i = 0; i < 100; i++) {
                System.out.println("sync call for Object: " + Thread.currentThread().getName());
            }
        }
    }

}
