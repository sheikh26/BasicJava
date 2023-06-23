package com.arif;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ExceptionThrowsFirstImpl {
	
	public static void main(String[] args) {
	    try{
	    	//ExceptionThrowsFirst exceptionThrowsFirstImpl = new ExceptionThrowsFirst();
	    	//exceptionThrowsFirstImpl.findFile();
	    	ExceptionThrowsFirst.findFile();
	    } catch(IOException e){
	      e.printStackTrace();
	    }
	  }

}
