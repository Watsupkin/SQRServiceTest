package ru.netology.sqr;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SQRServiceTest {

    @ParameterizedTest
    @CsvSource(value = {"values from the task,200,300,3", "low limit values,199,299,3", "top limit values,201,301,3", "first low and last top limit values,199,301,3", "first top and last low limit values,201,299,3", "another values,400,1000,12"})
    void calculateSqr(String testName, int firstLimit, int lastLimit, int expected) {
        SQRService service = new SQRService();
        int actual = service.calculateSqr(firstLimit, lastLimit);
        assertEquals(expected, actual);
    }
}