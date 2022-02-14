package ru.netology.sqr;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @ParameterizedTest
    @CsvSource(value = {"first test,200,300,3", "second test,199,299,3", "third test,201,301,3", "fourth test,199,301,3", "fifth test,201,299,3", "sixth test,400,1000,12"})
    void calculateSqr(String testName, int firstLimit, int lastLimit, int expected) {
        SQRService service = new SQRService();
        int actual = service.calculateSqr(firstLimit, lastLimit);
        assertEquals(expected, actual);
    }
}