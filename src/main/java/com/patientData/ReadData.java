package com.patientData;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class ReadData{

	public static void main(String[] args){

		try {
			Scanner input = new Scanner(new File("src/main/java/messages.txt"));
			while(input.hasNext()) {
				String line = input.nextLine();

				if(!line.equals("") && line.charAt(0) == 'P' && line.charAt(1) == 'I' && line.charAt(2) == 'D'){
					Patient newPatient = new Patient();

					String[] data = line.split("\\|");

					//ID Field splitting
					String[] idFieldArray = data[3].split("\\^");
					data[3] = idFieldArray[0];
					newPatient.setId(data[3]);

					//Name field splitting
					String[] nameFieldArray = data[5].split("\\^");
					data[5] = nameFieldArray[1] + " " + nameFieldArray[0];
					newPatient.setName(data[5]);

					//Date of Birth formatting
					//String doBField = data[7];
					//String[] nameFieldArray = nameField.split("\\^");
					//data[7] = nameFieldArray[1] + " " + nameFieldArray[0];
					//newPatient.setDoB(data[7]);

					// Sex formatting
					boolean isMale = false;
					if(data[8].equals("M")) isMale = true;
					newPatient.setSex(isMale);

					// Race formatting
					if (data[10].equals("1") || data[10].equals("2106-3")) {
						data[10] = "N/A";
					}
					else{
						String[] raceFieldArray = data[10].split("\\^");
						data[10] = raceFieldArray[1];
					}
					newPatient.setRace(data[10]);

//					// Alt Name formatting
//					if (data[9].equals("1") || data[9].equals("")) {
//						data[9] = "N/A";
//					}
//					else {
//						String[] altNameFieldArray = data[9].split("\\^");
//						data[9] = altNameFieldArray[1] + " " + nameFieldArray[0];
//						newPatient.setName(data[9]);
//					}
//
//
//					System.out.println("id: " + newPatient.getId() + "\tName: " + newPatient.getName() + "\tSex: " + newPatient.getSex() + "\tRace: " + newPatient.getRace() + "\tAlt Name: " + newPatient.getAltName());
//					System.out.println();
//					newPatient.setAltName(data[2]);
//					newPatient.setRace(data[2]);
//					newPatient.setAddress(data[2]);
//					newPatient.setPhoneNumber(data[2]);
//					newPatient.setLanguage(data[2]);
//					newPatient.setEthnicGroup(data[2]);


//					for(int i = 0; i < data.length; i++){
//						if(i == 0){
//
//						}
//					}
//					for (int i =0; i < data.length-1; i++){
//						System.out.println(data[i] + "\t");
//					}
//
//					System.out.println(line);
//					System.out.println("break");
//					System.out.println("name index: " + data[5]);
//					System.out.println("end");
				}
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
