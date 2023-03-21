package pustovit.homework.homework_17.Threads;

public class AdditionalClass {

    static int counter = 0;


    public static int additionalClassMethode() {
        counter++;
        System.out.println("Thread name is: " + Thread.currentThread().getName() + "\nand counter value :  " + counter +"\n");
        return counter;

    }
}
