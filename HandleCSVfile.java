package com.ml.CSVfile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import com.opencsv.CSVWriter;

public class HandleCSVfile extends InsertData implements ReadCSVfile ,WriteCSVfile{
	@Override
	public void ReadUsingScanner(File file) throws FileNotFoundException {
		Scanner scanner=new Scanner(file);
		scanner.delimiter();
		while (scanner.hasNext()) {
			System.out.println(scanner.nextLine());
		}
		scanner.close();
	}

	@Override
	public void ReadUsingSplit(File file) throws IOException {
		String line="";
		String splitBy=" ";
		FileReader fileReader=new FileReader(file);
		BufferedReader br=new BufferedReader(fileReader);
		
		while ((line=br.readLine())!=null) {
			String[] value = line.split(splitBy);
			for (int i = 0; i < value.length; i++) {
				System.out.print(value[i]);
			}
			System.out.println();
		}
	}


	@Override
	public void InsertData(File file,String[] Line) throws IOException {
		FileWriter fileWriter=new FileWriter(file);
		CSVWriter csvWriter=new CSVWriter(fileWriter);
		
		csvWriter.writeNext(Line);
		csvWriter.flush();
		System.out.println("Data Inserted...");
	}

}
