
public class Learnstring {
	public static void main(String[] args) {
		String str1 = "String is not";
		String str2 = " a primitive type!";
		
		System.out.println(str1+str2);
		System.out.println(str1.length());
		System.out.println(str1.indexOf('i'));
		System.out.println(str1.indexOf(" is"));
		System.out.println(str1.toUpperCase());
		System.out.println(str1.split(" ")[1]);
		System.out.println(str1.endsWith("not"));
		
		int x = 123;
		System.out.println("A string and a " + x);
	}
}
