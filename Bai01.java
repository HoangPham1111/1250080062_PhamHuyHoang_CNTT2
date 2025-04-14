package LABTUAN2;
import java.util.Scanner;
import java.util.Arrays;

public class Bai01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, x, max, min;
        int[] arr;
        // a. Nhập mảng
        System.out.print("Nhập số phần tử của mảng: ");
        n = scanner.nextInt();
        arr = new int[n];
        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < n; i++) {
            System.out.print("arr[" + i + "] = ");
            arr[i] = scanner.nextInt();
        }
        // b. Xuất mảng
        System.out.print("Mảng vừa nhập là: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
        // c. Tìm vị trí của một số nguyên x
        System.out.print("Nhập số nguyên x cần tìm: ");
        x = scanner.nextInt();
        System.out.print("Vị trí của " + x + " trong mảng: ");
        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        // d. Tìm giá trị lớn nhất
        max = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Giá trị lớn nhất trong mảng là: " + max);
        // e. Tìm giá trị nhỏ nhất
        min = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Giá trị nhỏ nhất trong mảng là: " + min);

        // f. Tìm vị trí phần tử có giá trị lớn nhất
        System.out.print("Vị trí của phần tử lớn nhất: ");
        for (int i = 0; i < n; i++) {
            if (arr[i] == max) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        // g. Sắp xếp mảng tăng dần
        Arrays.sort(arr);
        System.out.print("Mảng sau khi sắp xếp tăng dần: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        scanner.close();
    }
}
