package com.arif;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Compile_Checked_Exception_FilenotFound {
	
	public static void main(String args[]) {      
	      File file = new File("E://file.txt");
	      try {
			FileReader fr = new FileReader(file);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}    
	   }
}
