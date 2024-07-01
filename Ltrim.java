//he trim() method in Java string checks this Unicode value before and after the string,
//if it exists then the method removes the spaces and returns the omitted string.
import java.io.*;
import java.util.Scanner;
class Ltrim {
	public static void main (String[] args) {
	String s1 = " Geeks For Geeks ";
	//System.out.println("Before Trim() - ");
	System.out.println("String - "+s1);
	//System.out.println("Length - "+s1.length());
	s1=s1.trim();
	//System.out.println("\nAfter Trim() - ");
	System.out.println("String - "+s1);
	//System.out.println("Length - "+s1.length());
	}
}
