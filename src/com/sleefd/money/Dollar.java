package com.sleefd.money;

/**
 * Created by _ashao2321919 on 13-12-30.
 */
public class Dollar {
    private int amount;
    public Dollar(int money) {
        this.amount = money;
    }

    public Dollar multiply(int multiplier) {
        return new Dollar(amount * multiplier);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Dollar dollar = (Dollar) o;

        if (amount != dollar.amount) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return amount;
    }
}
