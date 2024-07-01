import java.io.*;
import java.util.ArrayList;
class frequencycount {
	public static void main(String[] args)
	{
		String s1 = "GFG";
		System.out.println("For " + s1);
		frequency(s1);

		String s2 = "aaabccccffgfghc";
		System.out.println("For " + s2);
		frequency(s2);
	}
	private static void frequency(String s)
	{
		if (s.length() == 0) {
			System.out.println("Empty string");
			return;
		}
		ArrayList<CharOccur> occurrences = new ArrayList<CharOccur>();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			int flag = 0;
			for (CharOccur o : occurrences) {
				if (o.character == c) {
					o.occurrence += 1;
					flag = 1;
				}
			}
			if (flag == 0) {
				CharOccur grp = new CharOccur(c, 1);
				occurrences.add(grp);
			}
		}
		for (CharOccur o : occurrences) {
			System.out.println(o.character + " "
							+ o.occurrence);
		}
	}
}
class CharOccur {
	char character;
	int occurrence = 0;
	CharOccur(char character, int occurrence)
	{
		this.character = character;
		this.occurrence = occurrence;
	}
}
