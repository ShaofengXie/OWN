package pers.shaofeng.example.examdemo;

import java.util.Scanner;

public class SanJiaoXingDayin {

	private static Scanner input;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		input = new Scanner(System.in);

		System.out.print("请输入要打印等腰三角形的行数：");
		int row = input.nextInt();
		System.out.println("正等腰三角形");
		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= row - i; j++) {
				System.out.print(" ");
			}
			
			for (int k = 1; k <= (2 * i) - 1; k++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		System.out.println("倒等腰三角形");
		for (int i = row; i > 0; i--) {
			for (int j = 1; j <= row - i; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= (2 * i) - 1; k++) {
				System.out.print("*");
			}
			System.out.println("");
		}

		System.out.println("空白正等腰三角形");
		if (row < 3) {
			System.out.println("打印空白等要么三角形需要 x>=3!");
		} else {
			for (int i = 1; i <= row; i++) {
				for (int j = row - 1; j >= i; j--) {
					System.out.print(" ");
				}
				for (int k = 1; k <= (2 * i) - 1; k++) {
					if (i == row || k == 1 || k == (2 * i - 1)) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				}
				System.out.println("");
			}

			System.out.println("空白倒等腰三角形：");
			if (row < 3) {
				System.out.println("打印空白等腰三角形 需要 x>=3!");
			} else {
				for (int i = row; i > 0; i--) {
					for (int j = 1; j <= row - i; j++) {
						System.out.print(" ");
					}
					for (int k = 1; k <= 2 * i - 1; k++) {
						if (i == row || k == 1 || k == (2 * i - 1)) {
							System.out.print("*");
						} else {
							System.out.print(" ");
						}
					}
					System.out.println("");
				}
			}
		}
	}
}
