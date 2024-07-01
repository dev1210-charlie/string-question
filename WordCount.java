class WordCount
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