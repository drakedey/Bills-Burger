package Hamburguer;

public class DeluxeHamburguer {
    private Item[] additions = { AvailableAdditions.Soda, AvailableAdditions.FrenchFries };
    private Hamburguer hamburguer;
    private Bread bread;
    private Meat meat = new Meat();
    private static String DELUXE_NAME = "deluxe hamburguer";

    public DeluxeHamburguer() {
        String hamburguerName = DELUXE_NAME;
        String hamburguerDescription = "The " + DELUXE_NAME;
        this.bread = new Bread(12, "Deluxe");
        float itemsPrice = Hamburguer.calculatePrice(this.additions) + Hamburguer.HAMBURGUER_PRICE_BASE + bread.getPrice() + meat.getPrice();
        this.hamburguer = new Hamburguer(itemsPrice, hamburguerName, hamburguerDescription, bread, meat);
    }

    public Hamburguer getHamburguer() {
        return hamburguer;
    }

    public void getAdditionDetails() {
        Hamburguer.getFactureDetails(this.additions);
    }
}
