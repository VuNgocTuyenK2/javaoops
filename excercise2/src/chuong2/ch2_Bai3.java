package chuong2;

import java.util.Scanner;

public class ch2_Bai3 {
	public static void main(String[] args) {
        int age, year;
        String name, ageGroup;
        Scanner scanner = new Scanner(System.in);
         
        System.out.print("Nhập vào tên: ");
        name = scanner.nextLine();
        System.out.print("Nhập vào năm sinh: ");
        year = scanner.nextInt();
         
        // Xác định độ tuổi tương ứng
        age = 2017 - year;  // 2017 là năm hiện tại
        if (age < 16) {
            ageGroup = "tuổi vị thành niên.";
        } else if (age >= 16 || age < 18) {
            ageGroup = "tuổi trưởng thành.";
        } else {
            ageGroup = "già rồi!";
        }
         
        System.out.println("Bạn " + name + " thuộc nhóm " + ageGroup);
    }
}
