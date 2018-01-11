
public class ReverseString {
/*
 * Reverse string
 */
	public static void main(String[] args) {

		String str = "Apple";
		char[] ch = new char[str.length()];
		
		for(int i = str.length()-1;i>=0;i--)
		{
			System.out.println(str.charAt(i));
		}
		
		
	}

}
