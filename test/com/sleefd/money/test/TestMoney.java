package com.sleefd.money.test;

import com.sleefd.money.Bank;
import com.sleefd.money.Expression;
import com.sleefd.money.Money;
import com.sleefd.money.Sum;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by _ashao2321919 on 13-12-30.
 */
public class TestMoney {
    private Money five;

    @Before
    public void setUp() throws Exception {
        five = Money.franc(5);
    }

    @Test
    public void test_equity() {
        assertTrue(five.equals(five));
        assertFalse(five.equals(Money.dollar(5)));
        assertFalse(five.equals(Money.franc(6)));
    }

    @Test
    public void test_multiplication() {
        assertEquals(Money.franc(15), five.multiply(3));
    }

    @Test
    public void test_reduce_sum() {
        Expression sum = new Sum(five, five);
        Bank bank = new Bank();
        Money reduced = bank.reduce(sum, "CHF");
        assertEquals(Money.franc(10), reduced);
    }

    @Test
    public void test_plus_return_sum() {
        Expression result = five.plus(five);
        Sum sum = (Sum) result;
        assertEquals(five, sum.augend);
        assertEquals(five, sum.addend);
    }
    
    @Test
    public void test_money_reduce_diff_currency(){
        Bank bank = new Bank();
//        bank.addRate("CHF", "USD", 2);
        Money result = bank.reduce(Money.franc(2) , "USD");
        assertEquals(Money.dollar(1), result);
    }

}

