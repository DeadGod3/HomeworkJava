package pustovit.homework.homework_2;

public class Final {
    final int variable1;
    final int variable2;
    final int variable3;

    //    public Final(){   Конструктор класса может вызваться только из другого конструктора этого же класса.
    //     }

    public Final(int variable1, int variable2, int variable3) {
        this.variable1 = variable1;
        this.variable2 = variable2;
        this.variable3 = variable3;
    }

    public int getVariable1() {
        return variable1;
    }
    public int getVariable2() {
        return variable2;
    }
    public int getVariable3() {
        return variable3;
    }

    //    public void setVariable1(int variable1){     setter не создаётся для final, выдаёт ошибку :(
    //        this.variable1 = variable1;
    //    }
}
