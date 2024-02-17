package missingNumber;

public class Number {

	public static void main(String[] args) {
		//    
		int arr[] = {1,2,3,4,6,7};
		int sum = 0;
		
		for(int i=0; i<arr.length; i++) {
			sum = sum + arr[i];
		}
		System.out.println(sum);
		
		int sum1=0;
		for(int j=0; j<=7; j++) {
			sum1 = sum1 + j;
		}
		System.out.println(sum1);
		
		System.out.println("Missing Number: "+(sum1-sum));
	}

}
