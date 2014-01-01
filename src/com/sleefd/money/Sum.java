package com.sleefd.money;

import com.sleefd.money.Expression;
import com.sleefd.money.Money;

/**
 * Created by _ashao2321919 on 14-1-1.
 */
public class Sum implements Expression{
    public Money augend;
    public Money addend;

    public Sum(Money augend, Money added) {
        this.augend = augend;
        this.addend = added;
    }


    public Money reduce(String to) {
        int amount = augend.amount + addend.amount;
        return new Money(amount,to);
    }

}
