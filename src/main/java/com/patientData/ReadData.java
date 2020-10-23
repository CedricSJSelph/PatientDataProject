package com.patientData;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadData{

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

	//ArrayList of PatientObjects
	public static void writeFile(ArrayList<Patient> information) throws FileNotFoundException {
		int count = 0;

		File file = new File("src\\main\\java\\PatientInformation");
		PrintWriter output = new PrintWriter(file);

		output.print("    | Patient ID |   DOB   |   Name   |   Alt. Name   |   Sex   |   Race   |   Home Address   | Phone Number |Primary Language| Ethnic Group |\n");

		for(Patient in:information){
			System.out.printf("%03d%n", count++);
			System.out.print("|");
			System.out.print(in.toString());
			System.out.println();
		}
	}


}
