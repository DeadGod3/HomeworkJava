package pustovit.homework.homework_13.interfaces;
// решение проблемы имплементации несколких интерфейсов, класс-наследник стоит в приоритете
public interface Print4 extends Print3{
    default void printMethod() {
        System.out.println();
        System.out.println("Some info for print 4");
    }

    static void print4Print() {
        System.out.println();
        System.out.println("Static print 4");
    }
}
