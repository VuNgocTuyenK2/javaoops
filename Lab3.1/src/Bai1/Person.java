package Bai1;
import java.util.*;
public class Person {
	public static final  Scanner sc= new Scanner(System.in); 
       private String Ten,NgaySinh,GioiTinh, QueQuan;
       public Person() {
    	   System.out.println("Tên : ");
    	   Ten=sc.nextLine();
    	   System.out.println("Ngày Sinh");
    	   NgaySinh=sc.nextLine();
    	   System.out.println("Gioi Tinh : ");
    	   GioiTinh=sc.nextLine();
    	   System.out.println("QueQuan : ");
    	   QueQuan=sc.nextLine();
       }
       public void InThongTin() {
    	   System.out.println("Tên : " + Ten + " Ngày Sinh : " + Ten + "Giới Tính : " + GioiTinh + "Quê Quán : " + QueQuan);
    	   
       }
       public static void main(String [] agrs ) {
    	   Person pr = new Person();
    	   pr.InThongTin();
       }
}