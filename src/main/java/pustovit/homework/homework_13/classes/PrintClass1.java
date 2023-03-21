package pustovit.homework.homework_13.classes;

import pustovit.homework.homework_13.interfaces.Print1;
import pustovit.homework.homework_13.interfaces.Print2;

public class PrintClass1 implements Print1, Print2 {
    @Override
    public void printMethod() {
        System.out.println();
        System.out.println("This would bring a new logic");
    }

    @Override
    public void printMe() {
        System.out.println("\nPrinting you!");
    }
}
