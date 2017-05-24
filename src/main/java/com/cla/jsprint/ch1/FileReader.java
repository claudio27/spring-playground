package com.cla.jsprint.ch1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReader {
	
	private StringBuilder builder = null;
	private Scanner scanner = null;
	
	public FileReader(String fileName) {
		
		try {
			
			scanner = new Scanner(new File(fileName));
			builder = new StringBuilder();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public String read() {
	
		while (scanner.hasNext()) {
			builder.append(scanner.next());
		}
		return builder.toString();
		
	}

}
