package pustovit.homework.homework_17.Threads;

public class RunnableClass implements Runnable{
    @Override
    public void run() {
        Thread.currentThread().setName("RUNNABLE THREAD 2");
        for (int i = 0; i < 1001; i++) {
            AdditionalClass.additionalClassMethode();
        }

    }
}
