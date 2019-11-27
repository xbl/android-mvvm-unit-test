package com.example.myapplication;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class BalancerTest {
    @Test
    public void given_empty_string_when_isBalance_result_to_be_true() {
        Balancer balancer = new Balancer();

        assertEquals(true, balancer.isBalance(""));
    }
}