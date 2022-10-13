package pustovit.homework.homework_4.entity;

public final class ElderSon extends Children{
    @Override
    public void name() {
        System.out.println("Elder Son's name is Pavel");
    }

    @Override
    public void surname() {
        super.surname();
    }

    @Override
    public void hobby() {
        System.out.println("Elder son's hobby is skating");
        System.out.println();
    }

    @Override
    public int getAge() {
        return super.getAge();
    }

    @Override
    public void setAge(int age) {
        super.setAge(age);
    }



    public void printDaughter() {
        System.out.println("..");
    }


    public void printInfo() {
        System.out.println("...");

    }

    @Override
    public void print() {

    }

    @Override
    public void printAll() {

    }
}
