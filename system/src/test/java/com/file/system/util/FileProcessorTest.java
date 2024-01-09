package com.file.system.util;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

public class FileProcessorTest {
	
	File file;
	
	@Rule
	public TemporaryFolder folder = new TemporaryFolder();
	
	@Before
	public void setup() {
		
		try {
			file = folder.newFile("input.txt");
			Files.write(Paths.get(file.getPath()),"ABCDE".getBytes());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void testReader_checkIfTheStringIsReturned() {
		try {
			assertEquals(FileProcessor.reader(file.getCanonicalPath()),"ABCDE");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void testereverseString_checkIfTheStringIsreversed() {
		assertEquals(FileProcessor.reverseString("ABCDE"),"EDCBA");
	}
	
	@Test
	public void testWriter_checkIfFileExists() throws Exception {
		File file = folder.newFile("output.txt");
		System.out.println(new String(Files.readAllBytes(Paths.get(file.getPath()))));
		assertEquals(new String(Files.readAllBytes(Paths.get(file.getPath()))),"EDCBA");
	}
	
	
}
