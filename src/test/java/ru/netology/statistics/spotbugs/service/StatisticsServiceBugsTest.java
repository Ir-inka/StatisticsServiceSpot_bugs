package ru.netology.statistics.spotbugs.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StatisticsServiceBugsTest {
    @Test
    void findMax() {
        StatisticsServiceBugs service = new StatisticsServiceBugs();

        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 12;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }

    @Test
    void findMaxTwo() {
        StatisticsServiceBugs service = new StatisticsServiceBugs();

        long[] incomesInBillions = {102, 55, 65, 78, 35, 45, 56, 43, 145, 147, 122};
        long expected = 147;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }
    @Test
    void findMaxThree() {
        StatisticsServiceBugs service = new StatisticsServiceBugs();

        long[] incomesInBillions = {-10, -100, -65, -8, -6, 0, -25, -154, -36, -5, -20};
        long expected = 0;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }

}

