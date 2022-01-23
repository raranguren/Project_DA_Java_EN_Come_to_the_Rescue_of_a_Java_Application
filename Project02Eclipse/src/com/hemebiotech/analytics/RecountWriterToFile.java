package com.hemebiotech.analytics;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Writes the recount of symptoms to a text file
 */
public class RecountWriterToFile implements IRecountWriter {

    private final String filePath;

    /**
     * Constructor
     * @param filePath path or partial path to use when creating the file
     */
    public RecountWriterToFile(String filePath) {
        this.filePath = filePath;
    }

    /**
     * Create or replace the file using the data from the map provided
     * @param recountMap a collection of symptom name and a number
     */
    @Override
    public void writeRecount(Map<String, Integer> recountMap) {
        if (recountMap == null) recountMap = new HashMap<>();
        if (filePath != null) {
            try {
                BufferedWriter writer = new BufferedWriter(new FileWriter(filePath));
                for (String symptom : recountMap.keySet()) {
                    writer.write(
                            symptom
                            + " = "
                            + recountMap.get(symptom)
                            + "\n"
                    );
                }
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
