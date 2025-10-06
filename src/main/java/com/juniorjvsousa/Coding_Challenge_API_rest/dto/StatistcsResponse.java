package com.juniorjvsousa.Coding_Challenge_API_rest.dto;

import java.util.DoubleSummaryStatistics;

public class StatistcsResponse {
    private long count;
    private double sum;
    private double avg;
    private double max;
    private double min;

    public StatistcsResponse(DoubleSummaryStatistics stats) {
        this.count = stats.getCount();
        this.sum = stats.getSum();
        this.avg = stats.getAverage();
        this.min = stats.getMin();
        this.max = stats.getMax();


    }

    public long getCount() {
        return count;
    }

    public double getSum() {
        return sum;
    }

    public double getAvg() {
        return avg;
    }

    public double getMax() {
        return max;
    }

    public double getMin() {
        return min;
    }
}
