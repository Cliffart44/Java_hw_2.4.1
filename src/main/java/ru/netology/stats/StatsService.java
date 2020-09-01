package ru.netology.stats;

class StatService<salesStats> {
    /* Продажи суммарно */
    public static int SalesSum(int[] salesStats) {
        int sum = 0;
        for (int num : salesStats) {
            sum = num + sum;
        }
        return sum;
    }

    /* Продажи средне */
    public static float SalesAverage(int[] salesStats) {
        StatService service = new StatService();
        float sum = service.SalesSum(salesStats);
        float avg = sum / salesStats.length;
        return avg;
    }

    /* Месяц продажи максимум */
    public static int SalesMaximumMonth(int[] salesStats) {
        StatService service = new StatService();
        int max = SalesMaximum(salesStats);
        for (int i = salesStats.length - 1; i > 0; i--)
            if (salesStats[i] == max)
                return i + 1;
        return -1;
    }

    /* Месяц продажи минимум */
    public static int SalesMinimumMonth(int[] salesStats) {
        StatService service = new StatService();
        int min = SalesMinimum(salesStats);
        for (int i = salesStats.length - 1; i > 0; i--)
            if (salesStats[i] == min)
                return i + 1;
        return -1;
    }

    /* Месяц продажи максимум способ 2 */
    public static int SalesMaximumMonth2(int[] salesStats) {
        StatService service = new StatService();
        int max = SalesMaximum(salesStats);
        int month = 0;
        for (int i = 0; i < salesStats.length; i++) {
            if (salesStats[i] == max) {
                month = i;
            }
        }
        return month + 1;
    }

    /* Месяц продажи минимум способ 2 */
    public static int SalesMinimumMonth2(int[] salesStats) {
        StatService service = new StatService();
        int min = SalesMinimum(salesStats);
        int month = 0;
        for (int i = 0; i < salesStats.length; i++) {
            if (salesStats[i] == min) {
                month = i;
            }
        }
        return month + 1;
    }

    /* Количество месяцев продаж ниже среднего */
    public static int SalesBelowAverage(int[] salesStats) {
        StatService service = new StatService();
        float avg = SalesAverage(salesStats);
        int months = 0;
        for (int num : salesStats) {
            if (num < avg) {
                months = months + 1;
            }
        }
        return months;
    }

    /* Количество месяцев продаж выше среднего */
    public static int SalesAboveAverage(int[] salesStats) {
        StatService service = new StatService();
        float avg = SalesAverage(salesStats);
        int months = 0;
        for (int num : salesStats) {
            if (num > avg) {
                months = months + 1;
            }
        }
        return months;
    }

    /* Вспомогательные методы */

    /* Продажа максимум */
    public static int SalesMaximum(int[] salesStats) {
        int max = salesStats[0];
        for (int num : salesStats) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    /* Продажа минимум */
    public static int SalesMinimum(int[] salesStats) {
        int min = salesStats[0];
        for (int num : salesStats) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }
}