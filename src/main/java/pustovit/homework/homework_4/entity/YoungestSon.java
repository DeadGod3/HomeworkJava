package pustovit.homework.homework_4.entity;

public final class YoungestSon extends Children{
    @Override
    public void name() {
        System.out.println("Youngest son's name is Evgeniy");
    }

    @Override
    public void surname() {
        super.surname();
    }

    @Override
    public void hobby() {
        System.out.println("Youngest son's hobby is learning new languages");
        System.out.println();
    }

    @Override
    public void setAge(int age) {
        super.setAge(age);
    }

    @Override
    public int getAge() {
        return super.getAge();
    }

    @Override
    public void print() {

    }

    @Override
    public void printAll() {

    }


}
