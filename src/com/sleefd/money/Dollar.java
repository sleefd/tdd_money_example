package com.sleefd.money;

/**
 * Created by _ashao2321919 on 13-12-30.
 */
public class Dollar extends Money {

    public Dollar(int money) {
        this.amount = money;
    }

    public Dollar multiply(int multiplier) {
        return new Dollar(amount * multiplier);
    }



    @Override
    public int hashCode() {
        return amount;
    }
}
