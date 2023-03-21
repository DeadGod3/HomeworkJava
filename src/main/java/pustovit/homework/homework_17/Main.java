package pustovit.homework.homework_17;

import pustovit.homework.homework_17.Threads.CallableClass;
import pustovit.homework.homework_17.Threads.RunnableClass;
import pustovit.homework.homework_17.Threads.ThreadClass;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class    Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        //Creating Thread
        ThreadClass threadClass = new ThreadClass();
        threadClass.start();

        // Creating Runnable class/interface
        RunnableClass runnableClass = new RunnableClass();
        Thread runnableThread = new Thread(runnableClass);
        runnableThread.start();

        //Creating Callable class/interface
        CallableClass callableClass = new CallableClass();
        final FutureTask<Integer> stringFutureTask = new FutureTask<>(callableClass);
        final Thread thread = new Thread(stringFutureTask);
        thread.start();
        final Integer result = stringFutureTask.get();
        System.out.println(result);






    }
}
