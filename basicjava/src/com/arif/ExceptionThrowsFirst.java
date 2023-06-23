package com.arif;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ExceptionThrowsFirst {
	
	public static void findFile() throws IOException {
	    // code that may produce IOException
	    File newFile=new File("test.txt");
	    FileInputStream stream=new FileInputStream(newFile);
	  }

}
