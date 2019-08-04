package com.dataprocessor.extractdata;

public interface ExtractStrategy {
	public <T> T extractFileData(String fileName);
}
