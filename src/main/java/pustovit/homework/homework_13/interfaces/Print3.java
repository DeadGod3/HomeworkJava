package pustovit.homework.homework_13.interfaces;

public interface Print3 {
    default void printMethod() {
        System.out.println();
        System.out.println("any info for print 3");
    }

    static void print3Print() {
        System.out.println();
        System.out.println("Static print 3");
    }
}
