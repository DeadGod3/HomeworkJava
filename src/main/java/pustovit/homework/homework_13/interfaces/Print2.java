package pustovit.homework.homework_13.interfaces;

public interface Print2 {
    // второе решение проблемы имплементации одинакового дефолт метода нескольких интерфейсов  в класс
    // переопределить этот метод - написать в нем новую логику для всех методов или
    // через супер выбрать какой конкретно метод интерфейса нужно использовать
    default void printMethod() {
        System.out.println();
        System.out.println("is this info for print 2 ?");
    }

    static void print2Print() {
        System.out.println();
        System.out.println("Static print 2");
    }
}
