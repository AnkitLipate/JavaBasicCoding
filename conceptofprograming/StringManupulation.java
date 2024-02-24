package conceptofprograming;

public class StringManupulation {

	public static void main(String[] args) {
		
		String str = "The rains have started here";
		String str1 = "The rains have started here";
		
		System.out.println(str.length());
		System.out.println(str.charAt(5));
		System.out.println(str.indexOf('s'));
		System.out.println(str.indexOf('s', str.indexOf('s')+1));
		System.out.println(str.indexOf("have"));
		System.out.println(str.indexOf("hello"));
		
		//String comparision
		System.out.println(str.equals(str1));
		System.out.println(str.equalsIgnoreCase(str1));
		
		//subString
		System.out.println(str.substring(0, 8));
		
		//trim
		 
	}

}
