package Bai2;
import java.util.*;
public class NgayThang extends HangThucPham{
      public String Ngay,Thang,Nam;
      public static Scanner s= new Scanner(System.in);
      public void Nhap() {
    	  System.out.println("Nhập ngày  : ");
    	  Ngay=s.nextLine();
    	  System.out.println("Nhập tháng : ");
    	  Thang=s.nextLine();
    	  System.out.println("Nhập năm : ");
    	  Nam=s.nextLine();
      }
      public String toString() {
    	  return Ngay+"/" + Thang +"/"+ Nam;
      }
}