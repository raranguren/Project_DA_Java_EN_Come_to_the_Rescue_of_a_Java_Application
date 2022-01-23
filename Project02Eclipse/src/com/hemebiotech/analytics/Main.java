package com.hemebiotech.analytics;

public class Main {

    public static void main(String[] args) {

        new AnalyticsCounter()
                .readSymptomsFromFile("symptoms.txt")
                .countSymptoms()
                .sortResults()
                .writeResultsToFile("result.out");
    }
}
