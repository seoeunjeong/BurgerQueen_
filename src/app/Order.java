package app;

import app.discount.Discount;
import app.discount.discountCondition.CozDiscountCondition;
import app.discount.discountCondition.DiscountCondition;
import app.discount.discountCondition.KidDiscountCondition;
import app.discount.discountPoicy.FixedAmountDiscountPolicy;
import app.discount.discountPoicy.FixedRateDiscountPolicy;

public class Order {
    private Cart cart;
    private Discount discount;

    public Order(Cart cart, Discount discount) {
        this.cart = cart;
        this.discount = discount;
    }

    public void makeOrder(){
//        CozDiscountCondition cozDiscountCondition = new CozDiscountCondition(new FixedRateDiscountPolicy(10));
//        KidDiscountCondition kidDiscountCondition = new KidDiscountCondition(new FixedAmountDiscountPolicy(500));
//
//        cozDiscountCondition.checkDiscountCondition();
//        kidDiscountCondition.checkDiscountCondition();
//
        int totalPrice = cart.calculateTotalPrice();
        int finalPrice = discount.discount(totalPrice);
//        for(DiscountCondition discountCondition: discountConditions) {
//            discountCondition.checkDiscountCondition();
//            if (discountCondition.isSatisfied()) finalPrice = discountCondition.applyDiscount(finalPrice);
//        }
//        int finalPrice = totalPrice;
//
//        if (cozDiscountCondition.isSatisfied()) finalPrice = cozDiscountCondition.applyDiscount(finalPrice);
//        if (kidDiscountCondition.isSatisfied()) finalPrice = kidDiscountCondition.applyDiscount(finalPrice);
//

        System.out.println("[ð£] ì£¼ë¬¸ì´ ìë£ëììµëë¤. ");
        System.out.println("[ð£] ì£¼ë¬¸ ë´ì­ì ë¤ìê³¼ ê°ìµëë¤. ");
        System.out.println("-".repeat(60));

        cart.printCartItemDetails();

        System.out.println("-".repeat(60));
        System.out.printf("ê¸ì¡ í©ê³      : %dì\n",totalPrice);
        System.out.printf("í ì¸ ì ì© ê¸ì¡ : %dì\n", finalPrice);

    }

}
