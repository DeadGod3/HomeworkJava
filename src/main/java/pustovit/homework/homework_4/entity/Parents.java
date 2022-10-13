package pustovit.homework.homework_4.entity;

public abstract class Parents {
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int age;
    public void name(){
        System.out.println("Father's name is Oleksandr\nMother's name is Viktoriya");
        System.out.println();
    }
    public void surname(){
        System.out.println("Parents surname is Yevtushenko");
        System.out.println();
    }
    public void hobby(){
        System.out.println("Mother's hobby is sewing\nFather's hobby is boxing");
        System.out.println();

    }

}

