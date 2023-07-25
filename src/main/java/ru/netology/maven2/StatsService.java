package ru.netology.maven2;

public class StatsService {
    public long sum(long[] sales) {
        long totalSale = 0;
        for (long sale : sales) {
            totalSale += sale;
        }
        return totalSale;
    }
    public long average(long[] sales) {
        long totalSale = sum(sales);
        long averageSale = totalSale / 12;
        return averageSale;
    }
    public long monthMax(long[] sales){
        int month = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[month]) {
                month = i;
            }
        }
        return month + 1;
    }
    public long monthMin(long[] sales){
        int SalesMin = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[SalesMin]) {
                SalesMin = i;
            }
        }
        return SalesMin + 1;
    }
    public int monthBellowAverage (long[] sales) {
        int counter = 0;
        for (long sale : sales) {
            if (sale< average(sales)){
                counter++;
            }
        }
        return counter;
    }
    public int monthAboveAverage (long[] sales) {
        int counter = 0;
        for (long sale : sales) {
            if (sale> average(sales)){
                counter++;
            }
        }
        return counter;
    }

}

