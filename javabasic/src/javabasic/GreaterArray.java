package javabasic;

import java.util.Arrays;

public class GreaterArray {
	public static void main(String[] args) {

		String str = "Apple";
		char[] ch = str.toCharArray();

		for (int i = 0; i < ch.length; i++) {

			int repeated = 0;

			char c = str.charAt(i);

			for (int j = 0; j < ch.length; j++) {

				if (c == ch[j]) {

					repeated++;
					}

			}

			if (repeated > 0)
			System.out.println(c + " repeated " + repeated + " times");
			//int[] rp = new Arrays();
			

		}

	}


}
