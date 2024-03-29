package ru.netology.stats;

public class StatsService {
    public int salesSum(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public int averageAmountMonth(int[] sales) {
        int sum = salesSum(sales) / sales.length;
        return sum;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int minAverageAmountMonth(int[] sales) {
        int minMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < averageAmountMonth(sales)) {
                minMonth = minMonth + 1;
            }
        }
        return minMonth;
    }

    public int maxAverageAmountMonth(int[] sales) {
        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > averageAmountMonth(sales)) {
                maxMonth = maxMonth + 1;
            }
        }
        return maxMonth;
    }

}

