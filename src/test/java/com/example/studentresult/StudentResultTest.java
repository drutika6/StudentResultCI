package com.example.studentresult;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StudentResultTest {

    StudentResult studentResult = new StudentResult();

    @Test
    void testCalculateTotal() {
        int result = studentResult.calculateTotal(80, 75, 90);

        assertEquals(245, result);
    }

    @Test
    void testCalculateAverage() {
        double result = studentResult.calculateAverage(80, 75, 90);

        assertEquals(81.666, result, 0.001);
    }

    @Test
    void testCalculateGrade() {
        String result = studentResult.calculateGrade(81.666);

        assertEquals("B", result);
    }
}