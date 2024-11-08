// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		// Replace this comment with your code
		int years = Integer.parseInt(args [2]);
		double rate = Double.parseDouble(args [1]);
		int savings = Integer.parseInt(args [0]);
        double rateperyear = rate/100;
		double futurevalue = savings * Math.pow(1+rateperyear, years);

		System.out.println ("after " + years + " years, " + savings + " saved at " + "$" + rate + " will yield " + "$" + (int)futurevalue );



	} 
}