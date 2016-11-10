package pers.shaofeng.example.examdemo;

public class TriangleSolid {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int  line= 6;
		for (int i = 1; i <= line; i++) {
			for (int j = 1; j <= line - i; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i * 2 - 1; k++) {
				System.out.print("*");

			}
			System.out.println();
		}

	}

}