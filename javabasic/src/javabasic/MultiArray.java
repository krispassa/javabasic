package javabasic;

public class MultiArray {

	public static void main(String[] args) {

		int[][] arr = {{200,300,400,500},
						{600,700,800,900}
						};
		
		for(int i = 0;i<arr.length;i++)
		{
			for(int j=0; j<arr.length;j++)
			{
				System.out.println(arr[1][1]);
			}
		}
		
	}

}
