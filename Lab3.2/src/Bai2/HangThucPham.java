package Bai2;

public class HangThucPham extends HangHoa {
	//NSX Ngaysanxuat NHH ngay het han 
      private String NSX;
      private int NHH;
      public void Nhap() {
    	  s.nextLine();
    	  System.out.println("Nhập vào NSX : ");
    	  NSX=s.nextLine();
    	  System.out.println("Nhập vào NHH : ");
    	  NHH=s.nextInt();
      }
      public String toString(){
    	  return "Ngày Sản Xuất : "+ NSX + " Ngày Hết Hạn :" + NHH;
      }
}
