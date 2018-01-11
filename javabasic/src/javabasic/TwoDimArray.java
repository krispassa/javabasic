package javabasic;

public class TwoDimArray {

	public static void main(String[] args) {
		int[][] ar = new int[3][4];
		ar[0][1] = 4;
		twoArray(ar);
		

	}

	private static void twoArray(int[][] ar) {
		
		System.out.println(ar[0][1]);
		
	}



}
