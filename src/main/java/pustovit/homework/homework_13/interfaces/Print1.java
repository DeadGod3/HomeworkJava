package pustovit.homework.homework_13.interfaces;

public interface Print1 {

    default String printMethod(final String stringForPrint) {
        final String result = "Result of print: ".concat(stringForPrint);
        System.out.println(result);
        return result;

    }

    static void print1Print() {
        System.out.println();
        System.out.println("Static print 1");
    }
    void printMe(); // метод-контракт
}
