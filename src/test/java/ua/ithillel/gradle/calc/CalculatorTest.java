package ua.ithillel.gradle.calc;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    private Calculator calculator;

    @BeforeEach
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void add_test() {
        double a = 10;
        double b = 20;

        double expected = 30;

        double actual = calculator.add(a, b);

        assert expected == actual;
    }

    @Test
    public void subtract_test() {
        double a = 10;
        double b = 20;

        double expected = -10;

        double actual = calculator.subtract(a, b);

        assert expected == actual;
    }


    @Test
    public void multiply_test() {
        double a = 10;
        double b = 20;

        double expected = 200;

        double actual = calculator.multiply(a, b);

        assert expected == actual;
    }


    @Test
    public void divide_test() {
        double a = 10;
        double b = 20;

        double expected = 0.5;

        double actual = calculator.dividy(a, b);

        assert expected == actual;
    }
}
