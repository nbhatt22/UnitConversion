
public class UnitConversion 
{

	public static void main(String[] args) 
	{
		System.out.println("5 feet is " + feetToInches(5) + " inches.");
		System.out.println("3 miles is " + milesToFeet(3) + " feet.");
		System.out.println("25 yards is " + yardsToMeters(25) + " meters.");
		System.out.println("205 pounds is " + poundsToKilograms(205) + " kilograms.");
		
		
	}
	
	
	public static double feetToInches(double startFeet) 
	{
		double endInches = 12 * startFeet;
		return endInches;
	}
	public static double milesToFeet(double startMiles)
	{
		double endFeet = 5280 * startMiles;
		return endFeet;
	}
	public static double yardsToMeters(double startYards)
	{
		double endMeters = startYards/1.094;
		return endMeters;
	}
	public static double poundsToKilograms(double startPounds)
	{
		double endKilograms = startPounds/2.205;
		return endKilograms;
	}
}
