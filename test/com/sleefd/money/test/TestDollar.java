package com.sleefd.money.test;

import com.sleefd.money.Dollar;
import com.sleefd.money.Franc;
import com.sleefd.money.Money;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by _ashao2321919 on 13-12-30.
 */
public class TestDollar {
    private Money five;

    @Before
    public void setUp() throws Exception {
        five = Money.dollar(5);


    }

    @Test
    public void test_multiplication(){
        assertEquals(Money.dollar(10), five.multiply(2));
        assertEquals(Money.dollar(15), five.multiply(3));
    }
    
    @Test
    public void test_equity(){
        assertTrue(five.equals(five));
    }


}
