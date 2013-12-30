package com.sleefd.money.test;

import com.sleefd.money.Dollar;
import com.sleefd.money.Franc;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by _ashao2321919 on 13-12-30.
 */
public class TestDollar {
    private Dollar five;

    @Before
    public void setUp() throws Exception {
        five = new Dollar(5);


    }

    @Test
    public void test_multiplication(){
        assertEquals(new Dollar(10), five.multiply(2));
        assertEquals(new Dollar(15), five.multiply(3));
    }
    
    @Test
    public void test_equity(){
        assertTrue(five.equals(five));
    }


}
