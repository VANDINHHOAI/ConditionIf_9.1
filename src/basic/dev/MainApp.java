package basic.dev;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap vao n: ");
		int n = sc.nextInt();
		if (n == 0) {
			System.out.println("n bang 0");
		}else if (n > 0) {
			System.out.println("n la so nguyen duong");
		}else {
			System.out.println("n la so nguyen am");
		}
	}

}
