package Hamburguer;

public class Item {
    private float price;
    private String name;
    private String description;

    public Item(float price, String name, String description) {
        this.price = price;
        this.name = name;
        this.description = description;
    }

    public float getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}
