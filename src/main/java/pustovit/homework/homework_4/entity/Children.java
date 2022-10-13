package pustovit.homework.homework_4.entity;

import pustovit.homework.homework_4.interfaces.InterfaceAll;
import pustovit.homework.homework_4.interfaces.InterfaceChildren;

public abstract class Children extends Parents implements InterfaceChildren, InterfaceAll {
    @Override
    public int getAge() {
        return super.getAge();
    }

    @Override
    public void setAge(int age) {
        super.setAge(age);
    }

    @Override
    public void name() {
        System.out.println("Children names will be given in next classes :)");
        System.out.println();
    }

    @Override
    public void surname() {
        System.out.println("Children surnames are the same as their parents(Yevtushenko)");
    }

    @Override
    public void hobby() {
        System.out.println("Children hobbies will be also given in their mother-classes :) ");
        System.out.println();
    }


    @Override
    public void printChildren() {
        System.out.println("Children");

    }
    @Override
    public void printChild() {
        System.out.println("All children names");
    }


}
