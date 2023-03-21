package pustovit.homework.homework_13;

import pustovit.homework.homework_13.classes.ClassHelper;
import pustovit.homework.homework_13.classes.PrintClass1;
import pustovit.homework.homework_13.classes.PrintClass2;
import pustovit.homework.homework_13.interfaces.Print1;
import pustovit.homework.homework_13.interfaces.Print2;
import pustovit.homework.homework_13.interfaces.Print3;
import pustovit.homework.homework_13.interfaces.Print4;

public class Main {
    public static void main(String[] args) {
        PrintClass1 printClass1 = new PrintClass1();
        PrintClass2 printClass2 = new PrintClass2();

        Print1.print1Print();
        Print2.print2Print();
        Print3.print3Print();
        Print4.print4Print();

        printClass1.printMethod();
        printClass1.printMe();
        printClass2.printMethod();

        ClassHelper classHelper = new ClassHelper();
        System.out.println();
        classHelper.optional("1");
        classHelper.optional("1").get();


    }
}
