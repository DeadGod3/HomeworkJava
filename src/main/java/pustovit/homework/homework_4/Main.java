package pustovit.homework.homework_4;


import pustovit.homework.homework_4.entity.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("   --- 1-rst line of classes --- ");
        System.out.println();
        Shepherd shepherd = new Shepherd();
        Cows cows = new Cows();
        Sheeps sheeps = new Sheeps();

        shepherd.setName("Vasil");
        shepherd.setQuantity(1);
        System.out.println("Shepherd's name is " + shepherd.getName());
        System.out.println("Shepherd's quantity is " + shepherd.getQuantity());
        shepherd.action();
        System.out.println();

        sheeps.setName("no names");
        sheeps.setQuantity(101);
        System.out.println("Sheeps have " + sheeps.getName());
        System.out.println("Sheeps quantity is " + sheeps.getQuantity());
        sheeps.action();
        System.out.println();

        cows.setName("no names");
        cows.setQuantity(96);
        System.out.println("Cows have " + cows.getName());
        System.out.println("Cows quantity is " + cows.getQuantity());
        cows.action();


        System.out.println();
        System.out.println("   --- 2-nd line of classes --- ");
        Daughter daughter = new Daughter();
        ElderSon elderSon = new ElderSon();
        YoungestSon youngestSon = new YoungestSon();
        elderSon.name();
        elderSon.surname();
        elderSon.setAge(25);
        System.out.println("Elder's son age is " + elderSon.getAge());
        elderSon.hobby();

        youngestSon.name();
        youngestSon.surname();
        youngestSon.setAge(15);
        System.out.println("Youngest son age is " + youngestSon.getAge());
        youngestSon.hobby();

        daughter.name();
        daughter.surname();
        daughter.setAge(18);
        System.out.println("Daughter's age is " + daughter.getAge());
        daughter.hobby();


        System.out.println();
        System.out.println("With interfaces: ");
        daughter.printChild();
        daughter.printChildren();
        elderSon.printDaughter();
        elderSon.printInfo();
        youngestSon.printAll();
        youngestSon.print();
        System.out.println();
        shepherd.printField();
        cows.printFielD();
        sheeps.printCows();
        sheeps.printCowS();





    }
}
