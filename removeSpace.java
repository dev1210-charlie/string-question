// Java program to remove
// all spaces from a string
import java.io.*;
import java.util.Scanner;
class removeSpace{
	static String removeSpace(String str)
	{
		str = str.replaceAll("\\s","");
		return str;
	}
public static void main(String args[])
	{
		String str = "g eeks for ge eeks ";
		System.out.println(removeSpace(str));
	}
}

