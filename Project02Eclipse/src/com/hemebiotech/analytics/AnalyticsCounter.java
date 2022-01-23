package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;

public class AnalyticsCounter {

	private List<String> symptoms;
	private Map<String,Integer> recount;

	public AnalyticsCounter readSymptomsFromFile(String filePath) {
		symptoms = new SymptomReaderFromFile(filePath).readSymptoms();
		return this;
	}

	public AnalyticsCounter countSymptoms() {
		recount = new SymptomCounter().count(symptoms);
		return this;
	}

	public AnalyticsCounter sortResults() {
		recount = new RecountSorter().sort(recount);
		return this;
	}

	public void writeResultsToFile(String filePath) {
		new RecountWriterToFile(filePath).writeRecount(recount);
	}

}
