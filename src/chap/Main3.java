//문제3
package chap;

import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {
		int a, b;
		Scanner in = new Scanner(System.in);
		System.out.print("2자리 정수 입력(10~99)>> ");
		a = in.nextInt();
		if(a % 11 ==0) {
			System.out.print("Yes! 10의 자리와 1의 자리가 같습니다.");
		} else {
			System.out.print("NO! 10의 자리와 1의 자리가 다릅니다.");
		}		

	}

}
