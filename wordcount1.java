//11
class WordCount1
{
	public static void main(String[] args)
	{
	String s="Beauty lies in the eyes of beholder";
	int space=0;
	for(int i=0; i<s.length(); i++)
	{
	if(s.charAt(i)==' ')
	space++;
	}
	System.out.println("Spaces in string is : "+space);
	int wordCount=space+1;
	System.out.println("Words is : "+wordCount);

	}
}

//import java.util.Scanner;
//public class wordcount
//{
//public static void main(String[] args)
//{
//String name = new String("wordcount");
//int value = name.length();
//System.out.println(value);        
//}
//}
//2
//import java.util.Scanner;
//public class spacecount
//{
//public static void main(String[] args)
//{
//String name = new String("  spacecount");
//int value = name.length();
//System.out.println(value);        
//}
//}
