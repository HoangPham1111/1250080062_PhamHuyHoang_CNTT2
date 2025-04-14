package LABTUAN2;
import java.util.Scanner;
class SinhVien {
    private int maSV;
    private String hoTen;
    private float diemLT;
    private float diemTH;
    public SinhVien() {
        this.maSV = 0;
        this.hoTen = "";
        this.diemLT = 0;
        this.diemTH = 0;
    }
    public SinhVien(int maSV, String hoTen, float diemLT, float diemTH) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.diemLT = diemLT;
        this.diemTH = diemTH;
    }
    public int getMaSV() {
        return maSV;
    }
    public void setMaSV(int maSV) {
        this.maSV = maSV;
    }
    public String getHoTen() {
        return hoTen;
    }
    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }
    public float getDiemLT() {
        return diemLT;
    }
    public void setDiemLT(float diemLT) {
        this.diemLT = diemLT;
    }
    public float getDiemTH() {
        return diemTH;
    }
    public void setDiemTH(float diemTH) {
        this.diemTH = diemTH;
    }
    public float tinhDiemTB() {
        return (diemLT + diemTH) / 2;
    }
    public String toString() {
        return String.format("%-6d %-20s %-7.2f %-7.2f %-7.2f", maSV, hoTen, diemLT, diemTH, tinhDiemTB());
    } 
    }

