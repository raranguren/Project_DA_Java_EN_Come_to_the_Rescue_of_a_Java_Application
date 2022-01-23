package com.hemebiotech.analytics;

import java.util.Map;

/**
 * Anything that will get a list of objects and return a summary
 * in the form of a map, with the key being the objects
 * and the values as Integer
 *
 */
public interface ICounter<K> {
    /**
     * If no data is available, return an empty Map
     * @param listToCount an iterable collection that may have duplicates
     * @return a Map of unique objects and the number of times they appear
     */
    Map<K,Integer> count(Iterable<K> listToCount);
}
