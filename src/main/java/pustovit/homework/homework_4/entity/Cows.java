package pustovit.homework.homework_4.entity;

public final class Cows extends Field{
    @Override
    public void setQuantity(int quantity) {
        super.setQuantity(quantity);
    }

    @Override
    public int getQuantity() {
        return super.getQuantity();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void action() {
        System.out.println("Cows are stupidly eating a grass..");
    }

    @Override
    public void printField() {

    }

    @Override
    public void printFielD() {
        System.out.println("Cows");

    }


}
