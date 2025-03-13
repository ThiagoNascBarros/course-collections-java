package list.basicOperations.shoppingCart;

import java.util.List;

public class Item {

    private String name;
    private double value;
    private int qntd;

    public Item(String name, double value, int qntd) {
        this.name = name;
        this.value = value;
        this.qntd = qntd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public int getQntd() {
        return qntd;
    }

    public void setQntd(int qntd) {
        this.qntd = qntd;
    }

    @Override
    public String toString() {
        return "Item " +
                "nome " + name +
                ", valor " + value +
                ", qntd " + qntd;
    }
}
