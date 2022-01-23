package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class AnalyticsCounter {

	private int headacheCount;
	private int rashCount;
	private int pupilCount;

	public AnalyticsCounter readSymptomsFromFile() {

		try {
			BufferedReader reader = new BufferedReader (new FileReader("symptoms.txt"));
			String line;
			line = reader.readLine();
			while (line != null) {
				System.out.println("symptom from file: " + line);
				if (line.equals("headache")) {
					headacheCount++;
				}
				else if (line.equals("rash")) {
					rashCount++;
				}
				else if (line.contains("pupils")) {
					pupilCount++;
				}

				line = reader.readLine();	// get another symptom
			}
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return this;
	}

	public AnalyticsCounter countSymptoms() {
		// TODO split reader into read+count
		return this;
	}

	public AnalyticsCounter sortResults() {
		// TODO sort results
		return this;
	}

	public void writeResultsToFile() {
		try {
			FileWriter writer = new FileWriter ("result.out");
			writer.write("headache: " + headacheCount + "\n");
			writer.write("rash: " + rashCount + "\n");
			writer.write("~ pupils: " + pupilCount + "\n");
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
