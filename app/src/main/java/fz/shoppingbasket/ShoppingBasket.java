package fz.shoppingbasket;


import java.util.ArrayList;

public class ShoppingBasket {
    ArrayList<Order> contents;
    boolean loyaltyCard;
double total;
int i;

    public ShoppingBasket() {
    this.loyaltyCard = false;
   this.contents = new ArrayList<Order>();
    }

    public boolean isLoyaltyCard() {
        return loyaltyCard;
    }

    public void setLoyaltyCard(boolean loyaltyCard) {
        this.loyaltyCard = loyaltyCard;
    }

    public ArrayList<Order> getContents() {
        return contents;
    }


    public double simpleTotal() {
        total = 0;
        for (Order order : contents) {
            total += order.getPrice();
        }

        return total;
    }


    public int calculateB1G1FreeDiscount(){

        ArrayList<GoodsType> stock = new ArrayList<GoodsType>();

        stock.add(GoodsType.Apples);
        stock.add(GoodsType.Bananas);
        stock.add(GoodsType.Chicken);

        int i;

        int totalDiscount;
        totalDiscount = 0;

        for (GoodsType item : stock) {
            i = 0;
            for (Order order : this.contents) {
                if (order.getItem() == item) {
                    i += 1;
                }
            }
            totalDiscount += (item.getPrice() * (i/2));

        }

        return totalDiscount;
    }


    public double finalTotal() {
        total = 0;
        for (Order order : contents) {
            total += order.getPrice();
        }

        total -= this.calculateB1G1FreeDiscount();

        if (total > 20) {
            total = (total * 0.9);
        }

        if (this.isLoyaltyCard()) {
            total = (total * 0.98);
        }

return total;
    }



}
