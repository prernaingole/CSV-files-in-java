package com.ml.CSVfile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public interface ReadCSVfile{
	
	
	public void ReadUsingScanner(File file) throws FileNotFoundException;
	public void ReadUsingSplit(File file) throws FileNotFoundException, IOException ;
}