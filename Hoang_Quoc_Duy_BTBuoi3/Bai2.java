/*
 * Bài 2:
Xây dựng 1 chương trình tính toán khi người dùng chọn phép tính thực hiện từ số nguyên
từ bàn phím, menu như sau sau:
1. Phep cong
2. Phep tru
3. Phep nhan
4. Phep chia
5. Phep luy thua
6. Khac
7. Dung chuong trinh
Nếu người dùng nhập 6, chương trình sẽ hiển thị và thực hiện lại yêu cầu từ đầu từ người
dùng.
 */
package BTBuoi3;

import java.util.Scanner;

public class Bai2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int choice;
        int a, b;

        do {
            System.out.println("----- MENU -----");
            System.out.println("1. Phep cong");
            System.out.println("2. Phep tru");
            System.out.println("3. Phep nhan");
            System.out.println("4. Phep chia");
            System.out.println("5. Phep luy thua");
            System.out.println("6. Khac");
            System.out.println("7. Dung chuong trinh");

            System.out.print("Nhap lua chon cua ban: ");
            choice = sc.nextInt();

            if (choice == 1) {
                System.out.print("Nhap so thu nhat: ");
                a = sc.nextInt();
                System.out.print("Nhap so thu hai: ");
                b = sc.nextInt();
                System.out.println("Ket qua: " + (a + b));
            } else if (choice == 2) {
                System.out.print("Nhap so thu nhat: ");
                a = sc.nextInt();
                System.out.print("Nhap so thu hai: ");
                b = sc.nextInt();
                System.out.println("Ket qua: " + (a - b));
            } else if (choice == 3) {
                System.out.print("Nhap so thu nhat: ");
                a = sc.nextInt();
                System.out.print("Nhap so thu hai: ");
                b = sc.nextInt();
                System.out.println("Ket qua: " + (a * b));
            } else if (choice == 4) {
                System.out.print("Nhap so thu nhat: ");
                a = sc.nextInt();
                System.out.print("Nhap so thu hai: ");
                b = sc.nextInt();
                if (b == 0) {
                    System.out.println("Khong the chia cho 0");
                } else {
                    System.out.println("Ket qua: " + ((double) a / b));
                }
            } else if (choice == 5) {
                System.out.print("Nhap so can tinh luy thua: ");
                a = sc.nextInt();
                System.out.print("Nhap so mu: ");
                b = sc.nextInt();
                int result = 1;
                for (int i = 0; i < b; i++) {
                    result *= a;
                }
                System.out.println("Ket qua: " + result);
            } else if (choice == 6) {
                continue;
            } else if (choice == 7) {
                break;
            } else {
                System.out.println("Lua chon khong hop le");
            }
        } while (choice != 7);

        sc.close();

	}

}
