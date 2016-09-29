
public class Learnconditional {
	public static void main(String[] args) {
		int c1 = 20;
		if (c1 < 15) {
			System.out.println("It is smaller!");
		}
		else if (c1 < 30) {
			System.out.println("Now it is smaller!");
		}
		else {
			System.out.println("It is larger!");
		}
		
		int c2 = 0;
		while (c2<5) {
			System.out.println("The value of c2 is:" + c2);
			c2++;
			if (c2 == 3) {
				continue;
			}
			System.out.println("Now c2 is: " + c2);
		}
  
	}
}
