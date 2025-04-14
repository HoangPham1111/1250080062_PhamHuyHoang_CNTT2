package LABTUAN2;
import java.util.Scanner;
public class mainSVien {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SinhVien sv1 = new SinhVien(1250080062, "Phạm Huy Hoàng", 9.00f, 9.00f);
        SinhVien sv2 = new SinhVien(1250080021, "Trương Tuấn Tú ", 7.00f, 3.00f);
        SinhVien sv3 = new SinhVien();
        System.out.print("Nhập mã số của sinh viên sv3: ");
        sv3.setMaSV(scanner.nextInt());
        scanner.nextLine();
        System.out.print("Nhập họ và tên của sinh viên sv3: ");
        sv3.setHoTen(scanner.nextLine());
        System.out.print("Nhập điểm lý thuyết của sinh viên sv3: ");
        sv3.setDiemLT(scanner.nextFloat());
        System.out.print("Nhập điểm thực hành của sinh viên sv3: ");
        sv3.setDiemTH(scanner.nextFloat());
        System.out.printf("%-6s %-20s %-7s %-7s %-7s\n", "masv", "hoten", "diemlt", "diemth", "diemtb");
        System.out.println(sv1);
        System.out.println(sv2);
        System.out.println(sv3);

        scanner.close();
}
}
