package chuong2;

import java.util.Scanner;

public class ch2_bai5 {
	public static void main(String[] args) {
		float sum = 0, number;
		Scanner scanner = new Scanner(System.in);

		do {
			System.out.print("Nhập vào số: ");
			number = scanner.nextFloat();
			sum += number;

			// nếu tổng lớn hơn 100 thì dừng
			if (sum > 100)
				break;
		} while (number > 0);

		System.out.print("Tổng = " + sum);
	}
}
