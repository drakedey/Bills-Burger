package Hamburguer;

public class ClasssicHealthyHamburguer {
    private Item[] additions;
    private Hamburguer hamburguer;
    private Bread bread;
    private Meat meat = new Meat();
    private static String HEALTY_NAME = "healty hamburguer";
    private static String CLASSIC_NAME = "classic hamburguer";

    public ClasssicHealthyHamburguer(Item[] additions) {
        String hamburguerName = "";
        String hamburguerDescription = "The ";
        this.additions = additions;
        if(additions.length > 4) {
            bread = new Bread(5, "Healty");
            hamburguerName = HEALTY_NAME;
            hamburguerDescription += hamburguerName;
        } else {
            bread = new Bread(2, "Classic");
            hamburguerName = CLASSIC_NAME;
            hamburguerDescription += hamburguerName;
        }
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
