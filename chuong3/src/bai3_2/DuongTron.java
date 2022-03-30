package bai3_2;

public class DuongTron extends Diem {
	public double r;
	final double pi=3.14;
	DuongTron(){
		System.out.println("Bán kính của đường tròn  : ");
		r=sc.nextDouble();
	}
	public double TinhChuVi() {
		return r * 2 *pi;
	}
	public double TinhDienTich() {
		return r *r ;
	}
	public void InThongTin() {
		System.out.println("Chu vi của hình tròn là : " + TinhChuVi());
		System.out.println("Diện tích của hình tròn là : " + TinhDienTich());
	}

}