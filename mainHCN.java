
package LABTUAN2;
import java.util.Scanner;
public class mainHCN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double dai, rong;
        System.out.print("Nhập chiều dài: ");
        dai = scanner.nextDouble();
        System.out.print("Nhập chiều rộng: ");
        rong = scanner.nextDouble();
        HinhChuNhat hcn = new HinhChuNhat(dai, rong);
        System.out.println(hcn);
}
    }