package com.sleefd.money.test;

import com.sleefd.money.Money;
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

}

