package com.sleefd.money.test;

import com.sleefd.money.Franc;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by _ashao2321919 on 13-12-30.
 */
public class TestFranc {
    private Franc five;

    @Before
    public void setUp() throws Exception {
        five = new Franc(5);
    }

    @Test
    public void test_equity() {
        assertTrue(five.equals(five));
    }

    @Test
    public void test_multiplication() {
        assertEquals(new Franc(15), five.multiply(3));
    }

}

