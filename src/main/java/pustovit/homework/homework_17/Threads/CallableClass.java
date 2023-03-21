package pustovit.homework.homework_17.Threads;

import java.util.concurrent.Callable;

public class CallableClass implements Callable<Integer> {
    @Override
    public Integer call() {
        Thread.currentThread().setName("CALLABLE THREAD 1");

        for (int i = 0; i < 1001; i++) {
            AdditionalClass.additionalClassMethode();
        }
        return AdditionalClass.additionalClassMethode();
    }
}
