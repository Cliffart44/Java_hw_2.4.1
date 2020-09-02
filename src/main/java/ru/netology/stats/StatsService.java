package ru.netology.stats;

class StatService {
    /* Продажи суммарно */
    public static int salesSum(int[] salesStats) {
        int sum = 0;
        for (int num : salesStats) {
            sum = num + sum;
        }
        return sum;
    }

    /* Продажи средне */
    public static float salesAverage(int[] salesStats) {
        float sum = salesSum(salesStats);
        float avg = sum / salesStats.length;
        return avg;
    }

    /* Месяц продажи максимум */
    public static int salesMaximumMonth(int[] salesStats) {
        int max = salesMaximum(salesStats);
        int month = 0;
        for (int i = 0; i < salesStats.length; i++) {
            if (salesStats[i] == max) {
                month = i;
            }
        }
        return month + 1;
    }

    /* Месяц продажи минимум*/
    public static int salesMinimumMonth(int[] salesStats) {
        int min = salesMinimum(salesStats);
        int month = 0;
        for (int i = 0; i < salesStats.length; i++) {
            if (salesStats[i] == min) {
                month = i;
            }
        }
        return month + 1;
    }

    /* Количество месяцев продаж ниже среднего */
    public static int salesBelowAverage(int[] salesStats) {
        float avg = salesAverage(salesStats);
        int months = 0;
        for (int num : salesStats) {
            if (num < avg) {
                months = months + 1;
            }
        }
        return months;
    }

    /* Количество месяцев продаж выше среднего */
    public static int salesAboveAverage(int[] salesStats) {
        float avg = salesAverage(salesStats);
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

    /* Продажа максимум */
    public static int salesMaximum(int[] salesStats) {
        int max = salesStats[0];
        for (int num : salesStats) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    /* Продажа минимум */
    public static int salesMinimum(int[] salesStats) {
        int min = salesStats[0];
        for (int num : salesStats) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    /* Месяц продажи минимум способ 2 */
    public static int salesMinimumMonthWay2(int[] salesStats) {
        int min = salesMinimum(salesStats);
        for (int i = salesStats.length - 1; i > 0; i--)
            if (salesStats[i] == min)
                return i + 1;
        return 1;
    }

    /* Месяц продажи максимум способ 2 */
    public static int salesMaximumMonthWay2(int[] salesStats) {
        int max = salesMaximum(salesStats);
        for (int i = salesStats.length - 1; i > 0; i--)
            if (salesStats[i] == max)
                return i + 1;
        return 1;
    }
}