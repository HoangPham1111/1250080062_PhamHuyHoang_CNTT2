
package LABTUAN2;
public class mainbai05 {
    public static void main(String[] args) {
        student sv = new student("SV01", "Nguyen Van A", "CTK45");
        System.out.println(sv);
        book bk = new book("B001", "Lap Trinh Java", "Nguyen Van B");
        System.out.println(bk);
        sanpham sp = new sanpham();
        sp.nhap();
        sp.xuat();
    }
}

