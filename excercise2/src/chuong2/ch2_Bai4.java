package chuong2;

import java.util.Scanner;

public class ch2_Bai4 {
	public static void main(String[] args) {
		int month;
		Scanner scanner = new Scanner(System.in);

		System.out.println("Mời bạn nhập tháng: ");
		month = scanner.nextInt();

		switch (month) {
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
		case 6:
		case 7:
		case 8:
		case 9:
		case 10:
		case 11:
		case 12:

		{
			System.out.println("Tháng " + month);
		}
			break;
		default:
			System.out.println("Nhập tháng không hợp lệ.");
		}
	}
}
