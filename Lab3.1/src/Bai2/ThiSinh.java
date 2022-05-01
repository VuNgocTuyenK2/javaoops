package Bai2;

import java.util.*;

import Bai2.ThiSinh;

public class ThiSinh {
	private String Ten;
	private Double DiemToan, DiemVan, DiemNgoaiNgu;
	private Double TinhTong;
	public static Scanner s = new Scanner(System.in);

	public void NhapThiSinh() {
		s.nextLine();
		System.out.println("Tên thí sinh : ");
		Ten = s.nextLine();
		System.out.println("Điểm Toán  : ");
		DiemToan = s.nextDouble();
		System.out.println("Điểm Văn : ");
		DiemVan = s.nextDouble();
		System.out.println("Điểm Ngoại Ngữ ");
		DiemNgoaiNgu = s.nextDouble();
		TinhTong= DiemToan+ DiemVan+ DiemNgoaiNgu;
	}

	public ThiSinh() {

	}

	public ThiSinh(String ten, Double diemToan, Double diemVan, Double diemNgoaiNgu) {
		super();
		Ten = ten;
		DiemToan = diemToan;
		DiemVan = diemVan;
		DiemNgoaiNgu = diemNgoaiNgu;
	}

	public void InThongTin() {
		System.out.println(
				"Tên : " + Ten + "Điểm toán : " + DiemToan + "Điểm văn : " + DiemVan + "Điểm anh : " + DiemNgoaiNgu + "Tổng " + TinhTong);
	}
	public void KetQua() {
		if (TinhTong > 20) {
			System.out.println("ĐỖ");

		} else {
			System.out.println("Trượt! ");
		}
	}

	public static void main(String[] agrs) {
	   int n;
	   System.out.println("Nhập n thí sinh : ");
	   n=s.nextInt();
	   for(int i=0; i < n;i++) {
	   ThiSinh ts = new ThiSinh();
	   ts.NhapThiSinh();
	   ts.InThongTin();
	   ts.KetQua();
		
	}
	}
}