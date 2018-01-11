package javabasic;

public class javab {

	public static void main(String[] args) {

		araysort();
		maxmin();
	}

	private static void maxmin() {
				
	}

	private static void araysort() {
		// TODO Auto-generated method stub
		int[] a = { 1, 3, 4, 5, 6, 8, 9, 2, 30, 11, 97 };

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				int temp = 0;
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}

		}
		for (int k = 0; k < a.length; k++) {
			System.out.println(a[k]);
		}
	}

}
