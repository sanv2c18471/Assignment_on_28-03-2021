package demo13;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test1 {
public static void main(String[] args) throws Exception {
//String to int
	/*String s = "500";
	//int i = Integer.parseInt(s);
	int i = Integer.valueOf(s);
	System.out.println(i);*/
	
// int to String
	/*int i= 200;
	String s= String.valueOf(i);
	System.out.println(s);
	System.out.println(i+300);
	System.out.println(s+300);*/
	
//String to long	
	/*String s = "6375682811324";
	//long l = Long.parseLong(s);
	long l = Long.valueOf(s);
	System.out.println(l);*/
	
// long to String 
	/*long l =66754754383L;
	String s= String.valueOf(l);
	System.out.println(s);*/

//String to float
	/*String s = "190.64";
	//float f =Float.parseFloat(s);
	float f = Float.valueOf(s);
	System.out.println(f);*/

// Float to sting
	/*float f =99.9f;
	//String s = String.valueOf(f);
	String s = Float.toString(f);
	System.out.println(s);*/
	
//string to double
	//String s = "1976.465";
	/*String s = "1976.00";
	double d = Double.parseDouble(s);
	System.out.println(d);*/
	

//double to string
	/*double d = 15.32575;
	//String s= String.valueOf(d);
	String s = Double.toString(d);
	System.out.println(s);*/
	
//string to date
	//String sdate1 = "31/12/1998";
	 String sdate2 = "Friday, 04/03/2021, 23:37:50";
	 Date date2 =null;
	///Date date1= new SimpleDateFormat("dd/mm/yyyy").parse(sdate1);
	try{
		date2 = new SimpleDateFormat("E, dd/mm/yyy, HH:mm:ss").parse(sdate2);
	}catch(ParseException e) {
		e.printStackTrace();
	}
	
	//System.out.println(sdate1+"\t"+date1);
	System.out.println(date2);
}
}
