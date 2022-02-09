package com.hemebiotech.analytics;

public class Main {

    public static void main(String[] args) {

        new AnalyticsCounter()
                .start("symptoms.txt", "result.out");

    }
}
