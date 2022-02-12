package com.company.test_unit;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class AddingTest extends Adding {

    @Test
    public void testSum() {
        int expected=0;
        int actual=new Adding().sum(2,3);
        Assert.assertEquals(expected,actual);
    }
}