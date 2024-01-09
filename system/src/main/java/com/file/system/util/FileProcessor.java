package com.file.system.util;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileProcessor {
	
	public static String reader(String inputFile) {
		try {
			Path path = Paths.get(inputFile);
			if (Files.exists(path)) 
				return new String(Files.readAllBytes(Paths.get(inputFile)));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
	
	public static String reverseString(String input) {
		if(null!=input && !input.isEmpty() ) {
			return new StringBuilder(input).reverse().toString();
		}
		
		return input;
	}
	
	public static void fileWriter(String fileName, String output) {
		if(fileName !=null && output!=null) {
			Path path = Paths.get(fileName);
			try {
				Files.write(path, output.getBytes());
			} catch (IOException e) {				
				e.printStackTrace();
			}
		}
	}

}
