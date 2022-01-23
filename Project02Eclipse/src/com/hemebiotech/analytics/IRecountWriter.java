package com.hemebiotech.analytics;

import java.util.Map;

/**
 * Anything that will write the results from analysing symptoms
 * to a destination.
 * The data expected is a collection of pairs that are a String and a number
 *
 */
public interface IRecountWriter {
    /**
     * If no data is available, still produce an empty output
     *
     * @param recountMap a collection of symptom name and a number
     */
    void writeRecount(Map<String,Number> recountMap);
}
