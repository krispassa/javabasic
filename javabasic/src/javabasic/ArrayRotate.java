package javabasic;

public class ArrayRotate {

	public static void main(String[] args) {

		
		 int [] arr = {2,4,6,12,14,17};
		 int position= 2;
		 rotate( arr , position);
		 
	}

	private static void rotate(int[] arr, int position) {

		
		for( int i=0;i<arr.length;i++)
		{
		int b = arr[i];
		arr[i-1] = arr[i];
		arr[i] = b;
	
		}
	}
	

}
