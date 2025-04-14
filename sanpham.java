
package LABTUAN2;
import java.util.Scanner;
public class sanpham {
    private String tenSp;
    private double donGia;
    private double giamGia;
    public sanpham() {
        this.tenSp = "";
        this.donGia = 0;
        this.giamGia = 0;
    }
    public sanpham(String tenSp, double donGia, double giamGia) {
        this.tenSp = tenSp;
        this.donGia = donGia;
        this.giamGia = giamGia;
    }

    public double getThueNhapKhau() {
        return donGia * 0.1;
    }
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tên sản phẩm: ");
        tenSp = sc.nextLine();
        System.out.print("Nhập đơn giá: ");
        donGia = sc.nextDouble();
        System.out.print("Nhập giảm giá: ");
        giamGia = sc.nextDouble();
    }
    public void xuat() {
        System.out.printf("Tên SP: %s | Đơn giá: %.2f | Giảm giá: %.2f | Thuế NK: %.2f\n",
                          tenSp, donGia, giamGia, getThueNhapKhau());
    }
}

