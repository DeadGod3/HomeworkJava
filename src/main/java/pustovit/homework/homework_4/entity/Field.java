package pustovit.homework.homework_4.entity;

import pustovit.homework.homework_4.interfaces.InterfaceField;
import pustovit.homework.homework_4.interfaces.InterfaceCows;

public abstract class Field extends Village implements InterfaceField {
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


    public void action() {
        System.out.println("Just a field...");
    }
}
