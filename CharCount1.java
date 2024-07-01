class CharCount1
{
	public static void main(String[] args)
	{
	int code = 0x9000;
	//int space=0;
	//for(int i=0; i<s.length(); i++)
	//{
	//if(s.charAt(i)==' ')
	//space++;
	//}
	//System.out.println("Spaces in string is : "+space);
	int CharCount = Character.charCount(code);
	System.out.println(CharCount);

	}
}
//3
//import java.util.Scanner;
//public class charcount
//{
//public static void main(String[] args)
//{
//String name = "dev";
//int value = name.length();
//System.out.println(value);
//System.out.println(name.charAt(1));        
//}
//}
