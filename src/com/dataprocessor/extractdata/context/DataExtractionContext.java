package com.dataprocessor.extractdata.context;

import com.dataprocessor.extractdata.ExtractStrategy;

public class DataExtractionContext {
	private ExtractStrategy extractStrategy;

	public void setExtractStrategy(ExtractStrategy extractStrategy) {
		this.extractStrategy = extractStrategy;
	}

	public DataExtractionContext() {

	}

	public <T> T createArchive(String fileName) {
		return extractStrategy.extractFileData(fileName);
	}
}
