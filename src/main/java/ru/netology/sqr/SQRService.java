package ru.netology.sqr;

public class SQRService {
    public int findNumbersOfSquares(int bottom, int upper) {

        int result = 0;
        for (int i = 10; i <= 99; i++) {
            if (i * i >= bottom & i * i <= upper) {
                result++;
            }
        }
        return result;
    }
}
