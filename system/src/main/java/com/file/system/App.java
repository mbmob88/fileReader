package com.file.system;

import com.file.system.util.FileProcessor;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        String path = "C:\\files\\input.txt";
        String readerOutput = FileProcessor.reader(path);
        String reversedString = FileProcessor.reverseString(readerOutput);
        FileProcessor.fileWriter("C:\\files\\output.txt", reversedString );
    }
}
