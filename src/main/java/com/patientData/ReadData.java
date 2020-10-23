package com.patientData;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadData {

	public static void main(String[] args){

		try {
			Scanner input = new Scanner(new File("src/main/java/messages.txt"));
			while(input.hasNext()) {
				String line = input.nextLine();
				System.out.println(line);
			}
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
