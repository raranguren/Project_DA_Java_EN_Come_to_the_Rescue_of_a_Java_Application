package com.hemebiotech.analytics;

import java.util.HashMap;
import java.util.Map;

/**
 * Recount of symptoms using a for loop (not streams or collectors)
 */
public class SymptomCounter implements ICounter<String> {

    /**
     * counts the occurrences of the symptoms
     * @param allSymptoms a list of strings with the symptom name
     * @return a map with symptom names and the number of times they appear
     */
    @Override
    public Map<String, Integer> count(Iterable<String> allSymptoms) {
        Map<String, Integer> recount = new HashMap<>();
        for (String symptom : allSymptoms) {
            recount.put(
                    symptom,
                    1 + recount.getOrDefault(symptom,0)
            );
        }
        return recount;
    }
}
