package com.ml.CSVfile;

import java.io.File;
import java.io.IOException;

public interface WriteCSVfile {
	public void InsertData(File file,String[] Line) throws IOException;
}
