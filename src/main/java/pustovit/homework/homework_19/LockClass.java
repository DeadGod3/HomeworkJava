package pustovit.homework.homework_19;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockClass {

    Lock lock = new ReentrantLock();

    public void print() {
        lock.lock();
        for (int i = 0; i < 10; i++) {
            System.out.println("Thread : " + Thread.currentThread().getName() + "   print,print,print,print,print");
        }
    }

    public void read(){
        for (int i = 0; i < 10; i++) {
            System.out.println("Thread : " + Thread.currentThread().getName() + "   read,read,read,read");
        }
    }

    public void write() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Thread : " + Thread.currentThread().getName() + "   write,write,write");
        }
        lock.unlock();

    }

    public void lockExample(){
        for (int i = 0; i < 3; i++) {
            Thread thread = new Thread(() -> {
                print();
                read();
                write();
            });
            thread.start();

        }
    }



}

