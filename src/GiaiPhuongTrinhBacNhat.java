import java.util.Scanner;

public class GiaiPhuongTrinhBacNhat {
    public static void main(String[] args) {
        System.out.println("Giai Phuong Trinh Bac Nhat");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap a:");
        double a = scanner.nextDouble();
        System.out.println("Nhap b:");
        double b = scanner.nextDouble();
        System.out.println("Nhap c:");
        double c = scanner.nextDouble();
        if (a!=0){
            double x = (c-b)/a;
            System.out.println("Phuong trinh co nghiem duy nhat la "+x);

        }else {
            if (b==c) {
                System.out.println("Phuong trinh co vo so nghiem x");
            }else {
                System.out.println("Phuong trinh vo nghiem");
            }
        }
    }
}
