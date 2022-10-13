package pustovit.homework.homework_4.entity;

public abstract class Village {

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int quantity;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String name;

    public void village(){
        System.out.println("Just a simple village");
    }

}
