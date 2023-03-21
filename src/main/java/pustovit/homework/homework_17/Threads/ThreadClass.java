package pustovit.homework.homework_17.Threads;

public class ThreadClass extends Thread{
    @Override
    public void run() {
        Thread.currentThread().setName("SIMPLE THREAD 3");
        for (int i = 0; i < 1001; i++) {
            AdditionalClass.additionalClassMethode();
        }
    }
}
