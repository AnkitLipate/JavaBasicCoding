package star;

import java.util.Scanner;
//A 
//A B 
//A B C 
//A B C D 
//A B C D E 

public class AlphabetPattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to print Alphabet triangle: ");
		int n = sc.nextInt();// 5
		int alpha = 65;
		for (int i = 0; i <= n - 1; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print((char) (alpha + j) + " ");
			}
			System.out.println();
		}
	}

}
