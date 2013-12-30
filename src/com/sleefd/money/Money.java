package com.sleefd.money;

/**
 * Created by _ashao2321919 on 13-12-30.
 */
public class Money {
    protected int amount;
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Money money = (Money) o;

        if (amount != money.amount) return false;

        return true;
    }
}
