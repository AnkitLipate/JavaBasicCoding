package star;

/*
 * 
* * 
* * * 
* * * * 
* * * * * 
* * * * 
* * * 
* * 
*
 */
import java.util.Scanner;

public class MixTriangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number for * pattern: ");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for (int k = 1; k <= n - 1; k++) {
			for (int l = n - 1; l >= k; l--) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
