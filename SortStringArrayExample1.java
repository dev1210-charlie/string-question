import java.util.Arrays;  
public class SortStringArrayExample1  
{  
public static void main(String args[])   
{  
//defining an array of type String  
String[] countries = {"Zimbabwe", "South-Africa", "India", "America", "Yugoslavia", " Australia", "Denmark", "France", "Netherlands", "Italy", "Germany"};  
int size = countries.length;  
//logic for sorting   
for(int i = 0; i<size-1; i++)   
{  
for (int j = i+1; j<countries.length; j++)   
{  
//compares each elements of the array to all the remaining elements  
if(countries[i].compareTo(countries[j])>0)   
{  
//swapping array elements  
String temp = countries[i];  
countries[i] = countries[j];  
countries[j] = temp;  
}  
}  
}  
//prints the sorted array in ascending order  
System.out.println(Arrays.toString(countries));  
}  
}  
/*Creating a String
//There are two ways to create a string in Java:
//1-String literal
//2-Using new keyword
import java.io.*;
import java.util.Scanner;
public class sortedorder
{  
public static void main(String args[])   
{  
String[] countries = {"Zimbabwe", "South-Africa", "India", "America", "Yugoslavia", " Australia", "Denmark", "France", "Netherlands", "Italy", "Germany"};  
int size = countries.length;  
for(int i = 0; i<size-1; i++)   
{  
for (int j = i+1; j<countries.length; j++)   
{  
if(countries[i].compareTo(countries[j])>0)   
{  
String temp = countries[i];  
countries[i] = countries[j];  
countries[j] = temp;  
}  
}  
}  
System.out.println(countries);  
}  
} 


 