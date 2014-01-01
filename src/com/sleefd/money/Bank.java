package com.sleefd.money;

/**
 * Created by _ashao2321919 on 14-1-1.
 */
public class Bank {

    public Money reduce(Expression source, String to) {
        Sum sum = (Sum)source;
        return sum.reduce(to);
    }
}
