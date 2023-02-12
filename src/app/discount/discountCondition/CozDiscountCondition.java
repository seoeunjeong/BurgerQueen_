package app.discount.discountCondition;

import app.discount.discountPoicy.DiscountPolicy;
import app.discount.discountPoicy.FixedRateDiscountPolicy;

import java.util.Scanner;

public class CozDiscountCondition implements DiscountCondition {
    private boolean isSatisfied;

    public boolean isSatisfied() {
        return isSatisfied;
    }

    private void setSatisfied(boolean satisfied) {
        isSatisfied = satisfied;
    }

    private DiscountPolicy discountPolicy;

    public CozDiscountCondition(DiscountPolicy discountPolicy) {
        this.discountPolicy = discountPolicy;
    }

    //private FixedRateDiscountPolicy fixedRateDiscountPolicy = new FixedRateDiscountPolicy(10);


    public void checkDiscountCondition() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("코드스테이츠 수강생이십니까? (1)_예 (2)_아니오");
        String input = scanner.nextLine();

        if (input.equals("1")) setSatisfied(true);
        else if (input.equals("2")) setSatisfied(false);
    }


    public int applyDiscount(int price) {
        return discountPolicy.calculateDiscountedPrice(price);
    }

}

