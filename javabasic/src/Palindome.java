import java.util.Scanner;
/*
 * Palindrome check
 */
public class Palindome {

	public static void main(String[] args) {
		
		checkPalin();
		System.out.println(checkPalin());
		

		
	}

	private static boolean checkPalin() {
		
		String str = "kayak";
		char[] ch = str.toCharArray();
		int len = (str.length()/2);
		
		for(int i=0;i<len;i++)
		{
			for(int j =str.length()-1;j>=len;j--)
			{
				if(ch[i]==ch[j])
				{
					return true;
				}
				else
				{
					return false;
				}
				}
			}
		return false;
			
		}
		
		
		
		
	}

