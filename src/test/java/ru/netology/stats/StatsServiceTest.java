package ru.netology.stats;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.*;

public class StatsServiceTest {

    StatsService service = new StatsService();
    int[] salesStats = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    /* Продажи суммарно */
    @Test
    void shouldCalculateSalesSum() {
        int expected = 180;
        int actual = service.salesSum(salesStats);
        assertEquals(expected, actual);
    }

    /* Продажи средне */
    @Test
    void shouldCalculateSalesAverage() {
        float expected = 15;
        float actual = service.salesAverage(salesStats);
        assertEquals(expected, actual);
    }

    /* Месяц продажи максимум */
    @Test
    void shouldSpecifyMaximumSalesMonth() {
        int expected = 8;
        int actual = service.salesMaximumMonth(salesStats);
        assertEquals(expected, actual);
    }

    /* Месяц продажи минимум */
    @Test
    void shouldSpecifyMinimumSalesMonth() {
        int expected = 9;
        int actual = service.salesMinimumMonth(salesStats);
        assertEquals(expected, actual);
    }

    /* Количество месяцев продаж ниже среднего */
    @Test
    void shouldCalculateSalesBelowAverageMonths() {
        int expected = 5;
        int actual = service.salesBelowAverage(salesStats);
        assertEquals(expected, actual);
    }

    /* Количество месяцев продаж выше среднего */
    @Test
    void shouldCalculateSalesAboveAverageMonths() {
        int expected = 5;
        int actual = service.salesAboveAverage(salesStats);
        assertEquals(expected, actual);
    }

    /* --------------------------------------- */

    /* Вспомогательные и дополнительные тесты */

    /* Продажа максимум */
    @Test
    void shouldCalculateMaximumSaleValue() {
        int expected = 20;
        int actual = service.salesMaximum(salesStats);
        assertEquals(expected, actual);
    }

    /* Продажа минимум */
    @Test
    void shouldCalculateMinimumSaleValue() {
        int expected = 7;
        int actual = service.salesMinimum(salesStats);
        assertEquals(expected, actual);
    }

    /* Месяц продажи минимум способ 2 */
    @Test
    void shouldSpecifyMinimumSalesMonthWay2() {
        int expected = 9;
        int actual = service.salesMinimumMonthWay2(salesStats);
        assertEquals(expected, actual);
    }

    /* Месяц продажи максимум способ 2 */
    @Test
    void shouldSpecifyMaximumSalesMonthWay2() {
        int expected = 8;
        int actual = service.salesMaximumMonthWay2(salesStats);
        assertEquals(expected, actual);
    }

}