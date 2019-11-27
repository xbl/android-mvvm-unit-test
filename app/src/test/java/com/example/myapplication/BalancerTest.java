package com.example.myapplication;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

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

    @Test
    @DisplayName("Given 字符串为 (), When 调用 isBalance，Then 返回 true")
    public void given_string_is_parentheses__when_isBalance_then_result_to_be_true() {
        Balancer balancer = new Balancer();

        assertEquals(true, balancer.isBalance("()"));
    }

    @ParameterizedTest(name = "Given 字符串为{0}, When 调用 isBalance，Then 返回 {1}")
    @CsvSource({
            "()), false",
            "()(), true",
            "[], true",
            "[]], false",
            "{}, true"
    })
    public void given_string_is_parentheses__when_isBalance_then_result_to_be_false(String str, Boolean result) {
        Balancer balancer = new Balancer();

        assertEquals(result, balancer.isBalance(str));
    }
}