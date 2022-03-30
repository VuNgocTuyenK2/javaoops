package bai3_2;

public class TamGiac extends Diem {
	public Double a, b, c;

	TamGiac() {
		System.out.println("Nhập vào A : ");
		a = sc.nextDouble();
		System.out.println("Nhập vào B : ");
		b = sc.nextDouble();
		System.out.println("Nhập vào C : ");
		c = sc.nextDouble();
	}

	public void KiemTra() {
		// kiểm tra xem ba cạnh có phải là ba cạnh của một tam giác hay không
		if (a < b + c && b < a + c && c < a + b) {
			if (a * a == b * b + c * c || b * b == a * a + c * c || c * c == a * a + b * b)
				System.out.println("Đây là tam giác vuông");
			// điều kiện tam giác đều là 3 cạnh bằng nhau
			else if (a == b && b == c)
				System.out.println("Đây là tam giác đều");
			// điều kiện tam giác cân là 2 cạnh bằng nhau
			else if (a == b || a == c || b == c)
				System.out.println("Đây là tam giác cân");
			// điều kiện tam giác tù là có một góc lơn hơn 90 độ
			else if (a * a > b * b + c * c || b * b > a * a + c * c || c * c > a * a + b * b)
				System.out.println("Đây là tam giác tù");
			// và trường hợp còn lại là tam giác nhọn
			else
				System.out.println("Đây là tam giác nhọn");
		}
		// điều kiện ba cạnh nhập vào không phải là ba cạnh của một tam giác
		else
			System.out.println("Ba cạnh a, b, c không phải là ba cạnh của một tam giác");
	}
	public void TinhChuVi() {
		double chuVi=0;
		if ((a + b > c) && (a + c > b) 
	            && (b + c > a)) {
	            chuVi = a + b + c;
	            System.out.println("Chu vi của tam giác bằng = " + chuVi);
	        } else {
	            System.out.println("Không tồn tại tam giác");
	        }
	    }
    public void TinhDienTich() {
    	double Dientich=0;
    	if ((a + b > c) && (a + c > b) 
	            && (b + c > a)) {
	            Dientich =Math.sqrt(a + b + c);
	            System.out.println("Diện tích  của tam giác bằng = " + Dientich);
	        } else {
	            System.out.println("Không tồn tại tam giác");
	        }
	    }
    }