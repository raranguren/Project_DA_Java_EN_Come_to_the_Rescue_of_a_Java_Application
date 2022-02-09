package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;

/**
 * An instance of this object can read symptoms, analyse them, and write the results.
 */
public class AnalyticsCounter {

	private List<String> symptoms;
	private Map<String,Integer> recount;

	/**
	 * Read symptoms from a file, do the analysis, and write the results in another file
	 * @param inputFilePath Path to a text file containing a symptom per line
	 * @param outputFilePath Path to the file that needs to be generated with the results
	 */
	public void start(String inputFilePath, String outputFilePath) {
		readSymptomsFromFile(inputFilePath);
		countSymptoms();
		sortResults();
		writeResultsToFile(outputFilePath);
	}

	private void readSymptomsFromFile(String filePath) {
		symptoms = new SymptomReaderFromFile(filePath).readSymptoms();
	}

	private void countSymptoms() {
		recount = new SymptomCounter().count(symptoms);
	}

	private void sortResults() {
		recount = new RecountSorter().sort(recount);
	}

	private void writeResultsToFile(String filePath) {
		new RecountWriterToFile(filePath).writeRecount(recount);
	}


}
