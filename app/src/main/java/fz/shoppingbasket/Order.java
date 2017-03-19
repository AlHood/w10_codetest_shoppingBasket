package fz.shoppingbasket;



public class Order {

    GoodsType item;


    public Order(GoodsType item) {
        this.item = item;

    }


    public GoodsType getItem() {
        return item;
    }

public int getPrice() {
    return this.item.getPrice();
}

}
