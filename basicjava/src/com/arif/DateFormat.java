package com.arif;
import java.text.SimpleDateFormat;
import java.util.*;

public class DateFormat
{
    public static void main(String[] args)
    {
    	SimpleDateFormat date = new SimpleDateFormat("dd/MM/yyyy");

    	String dat = date.format(new Date());
        System.out.println("Date is " + dat);
        
    }
}