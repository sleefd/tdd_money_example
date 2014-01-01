package com.sleefd.money;

/**
 * Created by _ashao2321919 on 13-12-30.
 */
public  class Money {
    protected int amount;
    protected String currency;
    public Money(int money, String currency) {
        amount = money;
        this.currency = currency;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Money money = (Money) o;

        if (amount != money.amount )  return false;
        if (currency != money.currency ) return false;
        return true;
    }

    public static Money dollar(int money) {
        return new Money(money,"USD");
    }

    public Money multiply(int multiplier) {
        return new Money(amount * multiplier , currency);
    }

    public static Money franc(int money) {
        return new Money(money, "CHF");
    }
}
