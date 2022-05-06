package com.ml.CSVfile;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.opencsv.CSVWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		File file=new File("C:\\Selenium Software\\SampleCSVfile.csv");
		
		HandleCSVfile CSVfile=new HandleCSVfile();
		CSVfile.ReadUsingScanner(file);
		
		System.out.println("---------------------------------");
		Scanner scanner=new Scanner(System.in);	
		System.out.println("Enter--> id,address,city,state ,postal_code,country");
		InsertData insertData=new InsertData(scanner.next(), scanner.next(), scanner.next(), scanner.next(), scanner.next(), scanner.next());
		CSVfile.InsertData(file, insertData.getLine());
		
		System.out.println("---------------------------------");
		CSVfile.ReadUsingSplit(file);
		

	}
}
