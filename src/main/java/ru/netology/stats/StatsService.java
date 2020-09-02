package ru.netology.stats;

public class StatsService {
    /* Продажи суммарно */
    public static int salesSum() {
        int[] salesStats = salesStats();
        int sum = 0;
        for (int num : salesStats) {
            sum = num + sum;
        }
        return sum;
    }

    /* Продажи средне */
    public static float salesAverage() {
        int[] salesStats = salesStats();
        float sum = salesSum();
        float avg = sum / salesStats.length;
        return avg;
    }

    /* Месяц продажи максимум */
    public static int salesMaximumMonth() {
        int[] salesStats = salesStats();
        int max = salesMaximum();
        int month = 0;
        for (int i = 0; i < salesStats.length; i++) {
            if (salesStats[i] == max) {
                month = i;
            }
        }
        return month + 1;
    }

    /* Месяц продажи минимум*/
    public static int salesMinimumMonth() {
        int[] salesStats = salesStats();
        int min = salesMinimum();
        int month = 0;
        for (int i = 0; i < salesStats.length; i++) {
            if (salesStats[i] == min) {
                month = i;
            }
        }
        return month + 1;
    }

    /* Количество месяцев продаж ниже среднего */
    public static int salesBelowAverage() {
        int[] salesStats = salesStats();
        float avg = salesAverage();
        int months = 0;
        for (int num : salesStats) {
            if (num < avg) {
                months = months + 1;
            }
        }
        return months;
    }

    /* Количество месяцев продаж выше среднего */
    public static int salesAboveAverage() {
        int[] salesStats = salesStats();
        float avg = salesAverage();
        int months = 0;
        for (int num : salesStats) {
            if (num > avg) {
                months = months + 1;
            }
        }
        return months;
    }

    /* --------------------------------------- */

    /* Вспомогательные и дополнительные методы */

    /* Данные продаж */
    public static int[] salesStats() {
        int[] salesStats = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        return salesStats;
    }

    /* Продажа максимум */
    public static int salesMaximum() {
        int[] salesStats = salesStats();
        int max = salesStats[0];
        for (int num : salesStats) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    /* Продажа минимум */
    public static int salesMinimum() {
        int[] salesStats = salesStats();
        int min = salesStats[0];
        for (int num : salesStats) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    /* Месяц продажи минимум способ 2 */
    public static int salesMinimumMonthWay2() {
        int[] salesStats = salesStats();
        int min = salesMinimum();
        for (int i = salesStats.length - 1; i > 0; i--)
            if (salesStats[i] == min)
                return i + 1;
        return 1;
    }

    /* Месяц продажи максимум способ 2 */
    public static int salesMaximumMonthWay2() {
        int[] salesStats = salesStats();
        int max = salesMaximum();
        for (int i = salesStats.length - 1; i > 0; i--)
            if (salesStats[i] == max)
                return i + 1;
        return 1;
    }
}