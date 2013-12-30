package com.sleefd.money.test;

import com.sleefd.money.Dollar;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by _ashao2321919 on 13-12-30.
 */
public class TestDollar {
    @Test
    public void test_multiplication(){
        Dollar five = new Dollar(5);
        assertEquals(new Dollar(10), five.multiply(2));
        assertEquals(new Dollar(15), five.multiply(3));

    }
}
