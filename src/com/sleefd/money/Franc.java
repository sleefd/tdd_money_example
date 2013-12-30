package com.sleefd.money;

/**
 * Created by _ashao2321919 on 13-12-30.
 */
public class Franc extends Money {
    public Franc(int money) {
        this.amount = money;
    }

    public Money multiply(int multiplier) {
        return new Franc(amount * multiplier);
    }


    @Override
    public int hashCode() {
        return amount;
    }
}

