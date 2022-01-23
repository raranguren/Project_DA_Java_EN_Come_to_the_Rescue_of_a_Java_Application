package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Allows reading a list of symptoms from a text file
 */
public class SymptomReaderFromFile implements ISymptomReader {

	private final String filePath;
	
	/**
	 * Constructor
	 * @param filePath a full or partial path to file with symptom strings in it, one per line
	 */
	public SymptomReaderFromFile(String filePath) {
		this.filePath = filePath;
	}

	/**
	 * Reads all the symptoms in the text file into a list
	 * If the file is not found, it returns an empty list
	 * @return a list of symptoms as strings, unsorted and with duplicates
	 */
	@Override
	public List<String> readSymptoms() {
		ArrayList<String> allSymptoms = new ArrayList<>();
		
		if (filePath != null) {
			try {
				BufferedReader reader = new BufferedReader (new FileReader(filePath));
				String line = reader.readLine();
				
				while (line != null) {
					allSymptoms.add(line);
					line = reader.readLine();
				}
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		return allSymptoms;
	}

}
