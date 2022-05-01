package Bai2;

public class HangSanhSu extends HangHoa {
	private String HangSanhSu;
	public void Nhap() {
		s.nextLine();
		System.out.println("Nhập Hàng Sành Sứ : ");
		HangSanhSu=s.nextLine();
	}
	public String toString() {
		return "Hàng Sành Sứ : " + HangSanhSu;
	};

}