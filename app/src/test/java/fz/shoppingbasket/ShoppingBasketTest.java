package fz.shoppingbasket;

import org.junit.Before;
import org.junit.Test;
import static junit.framework.Assert.assertEquals;

public class ShoppingBasketTest {

    Order testOrder;
    Order apples;
    Order bananas;
    Order chicken;
    ShoppingBasket testBasket;
    int intResult;
    double doubleResult;


    @Before
    public void before() {
apples = new Order(GoodsType.Apples);
        bananas = new Order(GoodsType.Bananas);
        chicken = new Order(GoodsType.Chicken);
        testBasket = new ShoppingBasket();

    }


@Test
    public void test_canAddToBasket(){
    testBasket.getContents().add(apples);
    intResult = testBasket.getContents().size();

    assertEquals(1, intResult);
}

    @Test
    public void test_canGetBasicTotal(){
        testBasket.getContents().add(apples);
        testBasket.getContents().add(bananas);
        testBasket.getContents().add(chicken);

doubleResult = testBasket.simpleTotal();
        assertEquals(22.0, doubleResult);

    }


    @Test
    public void test_b1g1freeCalc() {
        testBasket.getContents().add(apples);
        testBasket.getContents().add(bananas);
        testBasket.getContents().add(chicken);
        testBasket.getContents().add(chicken);

       intResult = testBasket.calculateB1G1FreeDiscount();

        assertEquals(12, intResult);

    }


    @Test
    public void test_largePurchaseDiscount() {
        testBasket.getContents().add(apples);
        testBasket.getContents().add(bananas);
        testBasket.getContents().add(chicken);
        testBasket.getContents().add(chicken);

       doubleResult = testBasket.finalTotal();

        assertEquals( 19.8, doubleResult);
    }

@Test
    public void test_loyaltyCard() {
    testBasket.getContents().add(apples);
    testBasket.getContents().add(bananas);
    testBasket.getContents().add(chicken);
    testBasket.getContents().add(chicken);

    testBasket.setLoyaltyCard(true);

    doubleResult = testBasket.finalTotal();

    assertEquals(19.404 , doubleResult);


}

}
