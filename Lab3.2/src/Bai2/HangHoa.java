package Bai2;
import java.util.*;
public class HangHoa {
     private int MaHang;
     private String TenHang,NSX;
     private double Gia;
     public static Scanner s= new Scanner (System.in);
     public void Nhap() {
    	 System.out.println("Nhập Mã Hàng : ");
    	 MaHang=s.nextInt();s.nextLine();
    	 System.out.println("Tên Hàng : ");
    	 TenHang=s.nextLine();
    	 System.out.println("Nhà Sản Xuất : ");
    	 NSX=s.nextLine();
    	 System.out.println("Giá : ");
    	 Gia=s.nextDouble();
     }
     public String toString() {
    	 return "Mã Hàng : " + MaHang + " Tên Hàng : " +TenHang+ " Nhà Sản Xuất : " + NSX + " Giá : " + Gia;
     }
}
