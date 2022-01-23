package com.hemebiotech.analytics;

import java.util.Map;
import java.util.TreeMap;

/**
 * Sorts a recount of symptoms in alphabetical order
 */
public class RecountSorter implements ISorter<Integer>{

    /**
     * Sorts a map by the key values
     * @param original map with Strings and numbers
     * @return the same entries but sorted alphabetically
     */
    @Override
    public Map<String, Integer> sort(Map<String, Integer> original) {
        return new TreeMap<>(original);
    }
}
