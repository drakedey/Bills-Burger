package Hamburguer;

public class Bread extends Item {
    String type;

    public Bread(float price, String type) {
        super(price, "Bread", "Delicious " + type + " Bread");
        this.type = type;
    }
}
