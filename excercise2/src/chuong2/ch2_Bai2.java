package chuong2;

import java.util.Scanner;

public class ch2_Bai2 {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.println("Kiểm tra chẵn lẻ");
		System.out.print("Nhập n =  ");
		int n = input.nextInt();
		if (n % 2 == 0) {
			System.out.println("N = " + n + " Là số chẵn");
		} else {
			System.out.println("N = " + n + " Là số lẻ");
		}
	}
}
