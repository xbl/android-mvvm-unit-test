package com.example.myapplication;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class BalancerTest {
    @Test
    @DisplayName("Given 字符串为空, When 调用 isBalance，Then 返回 true")
    public void given_empty_string_when_isBalance_then_result_to_be_true() {
        Balancer balancer = new Balancer();

        assertEquals(true, balancer.isBalance(""));
    }
}