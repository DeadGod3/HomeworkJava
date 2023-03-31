package pustovit.homework.homework_19;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main {
    static AtomicInteger atomicInteger = new AtomicInteger(10000);


    public static void main(String[] args) {

        /*
        ТАК МОЖНО СДЕЛАТЬ ДЛИННЫЙ КОММЕНТ В НЕСКОЛЬКО СТРОК!!!
         */

        Lock lock = new ReentrantLock();

        ExecutorService fixedThreadPool = Executors.newFixedThreadPool(2);

        fixedThreadPool.execute(() -> {
            lock.lock();
            for (int i = 0; i < 10000; i++) {
                int result = atomicInteger.decrementAndGet();
                System.out.println("Thread : " + Thread.currentThread().getName() + " ,result: " + result);

            }
            lock.unlock();
        });

        fixedThreadPool.execute(() -> {
            lock.lock();
            for (int i = 0; i < 10000; i++) {
                int result = atomicInteger.decrementAndGet();
                System.out.println("Thread : " + Thread.currentThread().getName() + " ,result: " + result);

            }
            lock.unlock();
        });
        fixedThreadPool.shutdownNow();


        LockClass lockClass = new LockClass();
        System.out.println();
        System.out.println();
        lock.lock();
        lockClass.lockExample();
        System.out.println();
        lock.unlock();
        System.out.println();


//        DEADLOCK EXAMPLE :
        DeadLockExample job = new DeadLockExample();
        Thread masha = new Thread(job, "Маша");
        Thread dasha = new Thread(job, "Даша");
        masha.start();
        dasha.start();

    }


}


