//We can check palindrome string by reversing string and checking whether it is equal to original string or not
import java.io.*;
import java.util.Scanner;
class Palindrome{
	public static boolean Palindrome(String str)
	{
		String rev = "";
		boolean ans = false;
        for (int i = str.length() - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}
        if (str.equals(rev)) {
			ans = true;
		}
		return ans;
	}
	public static void main(String[] args)
	{
		String str = "geeks";
		str = str.toLowerCase();
		boolean A = Palindrome(str);
		System.out.println(A);
	}
}
