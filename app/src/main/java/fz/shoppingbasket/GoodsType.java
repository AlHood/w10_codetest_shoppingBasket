package fz.shoppingbasket;


public enum GoodsType {Apples (4),
    Bananas (6),
    Chicken (12);

    private final int price;

    GoodsType(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }


}




