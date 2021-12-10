package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class SQRServiceTest {
    @Test
    void shouldCheckMiddleLineNumbersOfSquares() {
        SQRService service = new SQRService();

        int bottom = 2025;
        int upper = 2500;
        int expected = 6;

        int actual = service.findNumbersOfSquares(bottom, upper);

        assertEquals(expected, actual);
    }

    @Test
    void shouldCheckBottomLineNumbersOfSquares() {
        SQRService service = new SQRService();

        int bottom = 100;
        int upper = 200;
        int expected = 5;

        int actual = service.findNumbersOfSquares(bottom, upper);

        assertEquals(expected, actual);
    }

    @Test
    void shouldCheckUpperLineNumbersOfSquares() {
        SQRService service = new SQRService();

        int bottom = 9604;
        int upper = 9801;
        int expected = 2;

        int actual = service.findNumbersOfSquares(bottom, upper);

        assertEquals(expected, actual);
    }
}