package Bai2;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		    List<HangHoa> List = new ArrayList<HangHoa>();
			System.out.println("Nhập Hàng ::: ");
			HangHoa h = new HangHoa();h.Nhap();
			HangHoa h1 = new NgayThang();h1.Nhap();
			HangHoa h2 = new HangThucPham();h2.Nhap();
			HangHoa h3 = new HangSanhSu();h3.Nhap();
			HangHoa h4 = new HangDienMay();
			h4.Nhap();
			List.add(h);List.add(h1);List.add(h2);List.add(h3);List.add(h4);
			List<HangHoa> List1 = new ArrayList<HangHoa>();
			System.out.println("Nhập Hàng ::: ");
			HangHoa hh = new HangHoa();hh.Nhap();
			HangHoa hh1 = new NgayThang();hh1.Nhap();
			HangHoa hh2 = new HangThucPham();hh2.Nhap();
			HangHoa hh3 = new HangSanhSu();hh3.Nhap();
			HangHoa hh4 = new HangDienMay();
			hh4.Nhap();
			List1.add(hh);List1.add(hh1);
			List1.add(hh2);
			List1.add(hh3);List1.add(hh4);
			System.out.println(List1);
			System.out.println(List);
			
				}
}
