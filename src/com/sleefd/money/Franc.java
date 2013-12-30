package com.sleefd.money;

/**
 * Created by _ashao2321919 on 13-12-30.
 */
public class Franc {
    private int amount;
    public Franc(int money) {
        this.amount = money;
    }

    public Franc multiply(int multiplier) {
        return new Franc(amount * multiplier);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Franc franc = (Franc) o;

        if (amount != franc.amount) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return amount;
    }
}

