package pustovit.homework.homework_4.entity;

public final class Sheeps extends Field {
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
        System.out.println("Sheeps are waiting for some actions from shepherd...");
    }

    @Override
    public void printField() {

    }

    @Override
    public void printFielD() {

    }


    public void printCows() {
        System.out.println("Sheeps");

    }

    public void printCowS() {
        System.out.println("CowS");

    }
}
