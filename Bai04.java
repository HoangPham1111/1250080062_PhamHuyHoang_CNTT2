package LABTUAN2;

class Vehicle {
    private String tenChuXe;
    private String loaiXe;
    private int dungTich;
    private double triGia;
    public Vehicle(String tenChuXe, String loaiXe, int dungTich, double triGia) {
        this.tenChuXe = tenChuXe;
        this.loaiXe = loaiXe;
        this.dungTich = dungTich;
        this.triGia = triGia;
    }
    public double tinhThue() {
        if (dungTich < 100) {
            return triGia * 0.01;
        } else if (dungTich <= 200) {
            return triGia * 0.03;
        } else {
            return triGia * 0.05;
        }
    }
    public String toString() {
        return String.format("%-20s %-15s %10d %15.2f %15.2f",
                tenChuXe, loaiXe, dungTich, triGia, tinhThue());
    }
}
public class Bai04 {
    public static void main(String[] args) {
        Vehicle[] danhSachXe = new Vehicle[3];
        danhSachXe[0] = new Vehicle("Nguyễn Thu Loan", "Future Neo", 100, 35000000);
        danhSachXe[1] = new Vehicle("Lê Minh Tính", "Ford Ranger", 3000, 250000000);
        danhSachXe[2] = new Vehicle("Nguyễn Minh Triết", "Landscape", 1500, 1000000000);
        System.out.println("\nBảng kê khai tiền thuế trước bạ:");
        System.out.printf("%-20s %-15s %10s %15s %15s\n",
                "Tên chủ xe", "Loại xe", "Dung tích", "Trị giá", "Thuế phải nộp");
        System.out.println("-------------------------------------------------------------------------------------------");
        for (Vehicle xe : danhSachXe) {
            System.out.println(xe);
        }
    }
}
