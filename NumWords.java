// Prints a given number using a hundreds, tens, and units notation.
public class NumWords {
	public static void main(String args[]) {
	    // Replace this comment with your code
		int number = Integer.parseInt(args[0]);
		int hundreds = (number/100);
		int tens = (number - (hundreds*100))/10;
		int ones = (number - (hundreds*100)-(tens*10));

		System.out.println(hundreds + " hundreds, " + tens + " tens, and " + ones + " ones.");

	}
}
