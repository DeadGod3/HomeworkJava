package pustovit.homework.homework_4.entity;

public final class Daughter extends Children {
    @Override
    public void name() {
        System.out.println("Daughter's name is Sofia");
    }

    @Override
    public void surname() {
        super.surname();
    }

    @Override
    public void hobby() {
        System.out.println("Daughter's hobby is travelling");
    }

    @Override
    public int getAge() {
        return super.getAge();
    }

    @Override
    public void setAge(int age) {
        super.setAge(age);
    }

    @Override
    public void print() {

    }

    @Override
    public void printAll() {

    }


}
