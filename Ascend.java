// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		// Replace this comment with your code
		int number = Integer.parseInt(args[0]);
		double a = Math.random() * (number + 1);
		double b = Math.random() * (number + 1);
		double c = Math.random() * (number + 1);
		// know i will find the min number
		double min1 = Math.min(a, b);
		double min2 = Math.min(min1, c);
		// know i will find the max number
		double max1 = Math.max(a, b);
		double max2 = Math.max(max1, c);
		// know i will find the middle number
		double mid1 = (a + b + c) - min2 - max2;

		System.out.println((int)a + " " + (int)b + " " + (int)c );
		System.out.println((int)min2 + " " + (int)mid1+ " " + (int)max2);






	}
}
