package Hamburguer;


public class Hamburguer extends Item {
    private Bread bread;
    private Meat meat = new Meat();
    public final static  float HAMBURGUER_PRICE_BASE = 9.99f;

    public Hamburguer(float price, String name, String description, Bread bread, Meat meat) {
        super(price, name, description);
        this.bread = bread;
        this.meat = meat;
    }

    public static float calculatePrice(Item[] aditions) {
        float acum = 0;
        for (int i = 0; i < aditions.length; i++) {
            acum += aditions[i].getPrice();
        }
        return acum;
    }

    public static void getFactureDetails(Item[] aditions) {
        System.out.println("=======ADDITIONS DETAIL=========");
        for (int i = 0; i < aditions.length; i++) {
            System.out.println("Name: " + aditions[i].getName() + "Price: $" + aditions[i].getPrice());
        }
        System.out.println("======================");
        System.out.println("Total Additions: $" + calculatePrice(aditions));
    }
}
