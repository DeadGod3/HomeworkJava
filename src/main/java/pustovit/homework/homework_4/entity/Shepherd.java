package pustovit.homework.homework_4.entity;

public  final class Shepherd extends Field{
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
        System.out.println("Shepherd is observing his animals");
    }

    @Override
    public void printField() {
        System.out.println("Shepherd");

    }

    @Override
    public void printFielD() {

    }

}
