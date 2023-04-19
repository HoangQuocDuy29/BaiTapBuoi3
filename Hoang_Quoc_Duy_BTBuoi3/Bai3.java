/*
 * Bài 3:
Nhập n là 1 số nguyên dương, nếu nhập không đúng yêu cầu nhập lại.
Thực hiện và in ra kết quả của 2 phép tính:
1 + 1/2 + 1/3 + 1/4 + 1/5 +…………1/n
1/1 - 1/2 + 1/3 - 1/4 + 1/5 -... 1/n
Int n;
Float ketqua = 1;
Int pre = -1;
For(int i=1; i&lt;=n ; i++){
Pre *= -1;
Ketqua += pre * (1/i);
}
 */
package BTBuoi3;

import java.util.Scanner;

public class Bai3 {

	private static Scanner scanner;

	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		int n;
        float sum1 = 0, sum2 = 0;
        boolean validInput = false;
        
        // Nhập và kiểm tra giá trị n
        do {
            System.out.print("Nhap n: ");
            n = scanner.nextInt();
            if (n > 0) {
                validInput = true;
            } else {
                System.out.println("Nhap sai, n phai la so nguyen duong!");
            }
        } while (!validInput);
        
        // Tính tổng 1 + 1/2 + 1/3 + ... + 1/n
        for (int i = 1; i <= n; i++) {
            sum1 += 1.0 / i;
        }
        System.out.println("Tong 1 + 1/2 + 1/3 + ... + 1/n = " + sum1);
        
        // Tính tổng 1/1 - 1/2 + 1/3 - 1/4 + ... + (-1)^(n+1) * 1/n
        for (int i = 1; i <= n; i++) {
            sum2 += Math.pow(-1, i + 1) * 1.0 / i;
        }
        System.out.println("Tong 1/1 - 1/2 + 1/3 - 1/4 + ... + (-1)^(n+1) * 1/n = " + sum2);

	}

}
