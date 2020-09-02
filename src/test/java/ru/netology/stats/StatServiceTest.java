package ru.netology.stats;

import org.apache.commons.beanutils.converters.IntegerArrayConverter;
import org.apache.commons.beanutils.converters.IntegerConverter;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ArgumentConverter;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.*;

class StatServiceTest {
    /* Продажи суммарно */
    @ParameterizedTest
    @CsvFileSource(resources = "/data.csv", numLinesToSkip = 1)
    void shouldCalculateSalesSum(int january, int february, int march, int april, int may, int june, int july, int august, int september, int october, int november, int december) {
        int[] salesStats = new int[12];
        salesStats[0] = january;
        salesStats[1] = february;
        salesStats[2] = march;
        salesStats[3] = april;
        salesStats[4] = may;
        salesStats[5] = june;
        salesStats[6] = july;
        salesStats[7] = august;
        salesStats[8] = september;
        salesStats[9] = october;
        salesStats[10] = november;
        salesStats[11] = december;


        StatService service = new StatService();
        int expected = 180;
        int actual = service.salesSum(salesStats);
        assertEquals(expected, actual);
    }

    /* Продажи средне */
    @ParameterizedTest
    @CsvFileSource(resources = "/data.csv", numLinesToSkip = 1)
    void shouldCalculateSalesAverage(int january, int february, int march, int april, int may, int june, int july, int august, int september, int october, int november, int december) {
        int[] salesStats = new int[12];
        salesStats[0] = january;
        salesStats[1] = february;
        salesStats[2] = march;
        salesStats[3] = april;
        salesStats[4] = may;
        salesStats[5] = june;
        salesStats[6] = july;
        salesStats[7] = august;
        salesStats[8] = september;
        salesStats[9] = october;
        salesStats[10] = november;
        salesStats[11] = december;


        StatService service = new StatService();
        float expected = 15;
        float actual = service.salesAverage(salesStats);
        assertEquals(expected, actual);
    }

    /* Месяц продажи максимум */
    @ParameterizedTest
    @CsvFileSource(resources = "/data.csv", numLinesToSkip = 1)
    void shouldSpecifyMaximumSalesMonth(int january, int february, int march, int april, int may, int june, int july, int august, int september, int october, int november, int december) {
        int[] salesStats = new int[12];
        salesStats[0] = january;
        salesStats[1] = february;
        salesStats[2] = march;
        salesStats[3] = april;
        salesStats[4] = may;
        salesStats[5] = june;
        salesStats[6] = july;
        salesStats[7] = august;
        salesStats[8] = september;
        salesStats[9] = october;
        salesStats[10] = november;
        salesStats[11] = december;


        StatService service = new StatService();
        int expected = 8;
        int actual = service.salesMaximumMonth(salesStats);
        assertEquals(expected, actual);
    }

    /* Месяц продажи минимум */
    @ParameterizedTest
    @CsvFileSource(resources = "/data.csv", numLinesToSkip = 1)
    void shouldSpecifyMinimumSalesMonth(int january, int february, int march, int april, int may, int june, int july, int august, int september, int october, int november, int december) {
        int[] salesStats = new int[12];
        salesStats[0] = january;
        salesStats[1] = february;
        salesStats[2] = march;
        salesStats[3] = april;
        salesStats[4] = may;
        salesStats[5] = june;
        salesStats[6] = july;
        salesStats[7] = august;
        salesStats[8] = september;
        salesStats[9] = october;
        salesStats[10] = november;
        salesStats[11] = december;


        StatService service = new StatService();
        int expected = 9;
        int actual = service.salesMinimumMonth(salesStats);
        assertEquals(expected, actual);
    }

    /* Количество месяцев продаж ниже среднего */
    @ParameterizedTest
    @CsvFileSource(resources = "/data.csv", numLinesToSkip = 1)
    void shouldCalculateSalesBelowAverageMonths(int january, int february, int march, int april, int may, int june, int july, int august, int september, int october, int november, int december) {
        int[] salesStats = new int[12];
        salesStats[0] = january;
        salesStats[1] = february;
        salesStats[2] = march;
        salesStats[3] = april;
        salesStats[4] = may;
        salesStats[5] = june;
        salesStats[6] = july;
        salesStats[7] = august;
        salesStats[8] = september;
        salesStats[9] = october;
        salesStats[10] = november;
        salesStats[11] = december;


        StatService service = new StatService();
        int expected = 5;
        int actual = service.salesBelowAverage(salesStats);
        assertEquals(expected, actual);
    }

    /* Количество месяцев продаж выше среднего */
    @ParameterizedTest
    @CsvFileSource(resources = "/data.csv", numLinesToSkip = 1)
    void shouldCalculateSalesAboveAverageMonths(int january, int february, int march, int april, int may, int june, int july, int august, int september, int october, int november, int december) {
        int[] salesStats = new int[12];
        salesStats[0] = january;
        salesStats[1] = february;
        salesStats[2] = march;
        salesStats[3] = april;
        salesStats[4] = may;
        salesStats[5] = june;
        salesStats[6] = july;
        salesStats[7] = august;
        salesStats[8] = september;
        salesStats[9] = october;
        salesStats[10] = november;
        salesStats[11] = december;


        StatService service = new StatService();
        int expected = 5;
        int actual = service.salesAboveAverage(salesStats);
        assertEquals(expected, actual);
    }

    /* --------------------------------------- */

    /* Вспомогательные и дополнительные тесты */

    /* Продажа максимум */
    @ParameterizedTest
    @CsvFileSource(resources = "/data.csv", numLinesToSkip = 1)
    void shouldCalculateMaximumSaleValue(int january, int february, int march, int april, int may, int june, int july, int august, int september, int october, int november, int december) {
        int[] salesStats = new int[12];
        salesStats[0] = january;
        salesStats[1] = february;
        salesStats[2] = march;
        salesStats[3] = april;
        salesStats[4] = may;
        salesStats[5] = june;
        salesStats[6] = july;
        salesStats[7] = august;
        salesStats[8] = september;
        salesStats[9] = october;
        salesStats[10] = november;
        salesStats[11] = december;


        StatService service = new StatService();
        int expected = 20;
        int actual = service.salesMaximum(salesStats);
        assertEquals(expected, actual);
    }

    /* Продажа минимум */
    @ParameterizedTest
    @CsvFileSource(resources = "/data.csv", numLinesToSkip = 1)
    void shouldCalculateMinimumSaleValue(int january, int february, int march, int april, int may, int june, int july, int august, int september, int october, int november, int december) {
        int[] salesStats = new int[12];
        salesStats[0] = january;
        salesStats[1] = february;
        salesStats[2] = march;
        salesStats[3] = april;
        salesStats[4] = may;
        salesStats[5] = june;
        salesStats[6] = july;
        salesStats[7] = august;
        salesStats[8] = september;
        salesStats[9] = october;
        salesStats[10] = november;
        salesStats[11] = december;


        StatService service = new StatService();
        int expected = 7;
        int actual = service.salesMinimum(salesStats);
        assertEquals(expected, actual);
    }

    /* Месяц продажи минимум способ 2 */
    @ParameterizedTest
    @CsvFileSource(resources = "/data.csv", numLinesToSkip = 1)
    void shouldSpecifyMinimumSalesMonthWay2(int january, int february, int march, int april, int may, int june, int july, int august, int september, int october, int november, int december) {
        int[] salesStats = new int[12];
        salesStats[0] = january;
        salesStats[1] = february;
        salesStats[2] = march;
        salesStats[3] = april;
        salesStats[4] = may;
        salesStats[5] = june;
        salesStats[6] = july;
        salesStats[7] = august;
        salesStats[8] = september;
        salesStats[9] = october;
        salesStats[10] = november;
        salesStats[11] = december;


        StatService service = new StatService();
        int expected = 9;
        int actual = service.salesMinimumMonthWay2(salesStats);
        assertEquals(expected, actual);
    }

    /* Месяц продажи максимум способ 2 */
    @ParameterizedTest
    @CsvFileSource(resources = "/data.csv", numLinesToSkip = 1)
    void shouldSpecifyMaximumSalesMonthWay2(int january, int february, int march, int april, int may, int june, int july, int august, int september, int october, int november, int december) {
        int[] salesStats = new int[12];
        salesStats[0] = january;
        salesStats[1] = february;
        salesStats[2] = march;
        salesStats[3] = april;
        salesStats[4] = may;
        salesStats[5] = june;
        salesStats[6] = july;
        salesStats[7] = august;
        salesStats[8] = september;
        salesStats[9] = october;
        salesStats[10] = november;
        salesStats[11] = december;

        StatService service = new StatService();
        int expected = 8;
        int actual = service.salesMaximumMonthWay2(salesStats);
        assertEquals(expected, actual);
    }

}