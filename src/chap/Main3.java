//����3
package chap;

import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {
		int a, b;
		Scanner in = new Scanner(System.in);
		System.out.print("2�ڸ� ���� �Է�(10~99)>> ");
		a = in.nextInt();
		if(a % 11 ==0) {
			System.out.print("Yes! 10�� �ڸ��� 1�� �ڸ��� �����ϴ�.");
		} else {
			System.out.print("NO! 10�� �ڸ��� 1�� �ڸ��� �ٸ��ϴ�.");
		}		

	}

}
