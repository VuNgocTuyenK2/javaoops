package Bai2;

public class HangDienMay extends HangHoa{
     private  String ThoiGianBaoHanh;
     private String DienAP,CongSuat;
     public void Nhap() {
    	 System.out.println("Nhập Thời gian bảo hành ,ĐIỆN ÁP ,Công Suất");
    	 ThoiGianBaoHanh=s.nextLine();
    	 DienAP=s.nextLine();
    	 CongSuat=s.nextLine();
     }
     public String toString() {
    	 return "Thời gian bảo hành : " + ThoiGianBaoHanh + "Điện áp : " + DienAP +" Công suất  : "+ CongSuat;
     }
}