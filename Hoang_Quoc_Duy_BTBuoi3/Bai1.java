/*
 *  Yêu cầu người dùng nhập 1 số nguyên dương từ bàn phím.
Tính tổng và số lượng các số chẵn từ 1 -&gt; số đó
Tính tổng và số lượng các số chia hết cho 5 từ 1 -&gt; số đó
 */
package BTBuoi3;

import java.util.Scanner;

public class Bai1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập vào số nguyên dương: ");
		int n = sc.nextInt();

		int sumEven = 0; // tổng các số chẵn
		int countEven = 0; // số lượng các số chẵn
		int sumDivisibleBy5 = 0; // tổng các số chia hết cho 5
		int countDivisibleBy5 = 0; // số lượng các số chia hết cho 5

		for (int i = 1; i <= n; i++) {
			if (i % 2 == 0) {
				sumEven += i;
				countEven++;
			}

			if (i % 5 == 0) {
				sumDivisibleBy5 += i;
				countDivisibleBy5++;
			}
		}

		System.out.println("Tổng các số chẵn từ 1 đến " + n + " là: " + sumEven);
		System.out.println("Số lượng các số chẵn từ 1 đến " + n + " là: " + countEven);
		System.out.println("Tổng các số chia hết cho 5 từ 1 đến " + n + " là: " + sumDivisibleBy5);
		System.out.println("Số lượng các số chia hết cho 5 từ 1 đến " + n + " là: " + countDivisibleBy5);

		sc.close();

	}

}
