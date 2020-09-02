package org.pg4200.ex01;
import org.junit.jupiter.api.Test;
import org.pg4200.ex01.TriangleClassification.Classification;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.pg4200.ex01.TriangleClassification.Classification.*;
import static org.pg4200.ex01.TriangleClassification.classify;

public class TriangleClassificationTest {
    @Test
    public void testNegativeValue() {
        Classification res = classify(-2, 4, 4);
        assertEquals(NOT_A_TRIANGLE, res);
    }

    @Test
    public void testEquilateralTriangle() {
        Classification res = classify(5, 5, 5);
        assertEquals(EQUILATERAL, res);
    }

    @Test
    public void testNotATriangle() {
        Classification res = classify(8, 2, 2);
        assertEquals(NOT_A_TRIANGLE, res);
    }

    @Test
    public void testIsosceles() {
        Classification res = classify(8, 8, 5);
        assertEquals(ISOSCELES, res);
    }

    @Test
    public void testScalene() {
        Classification res = classify(8, 5, 7);
        assertEquals(SCALENE, res);
    }
}
