package com.hemebiotech.analytics;

import java.util.Map;

/**
 * Anything that will get a map that uses strings as keys
 * and will return it sorted alphabetically by those keys
 */
public interface ISorter<V> {
    /**
     * If no map is provided, return an empty map
     *
     * @param original map with Strings and values
     * @return the same map but sorted alphabetically by the Strings
     */
    Map<String,V> sort(Map<String,V> original);
}
