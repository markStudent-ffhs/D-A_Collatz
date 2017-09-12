package ch.ffhs.dua.collatz;

public class Collatz {

	public static int calculateCollatze(int number, int counter)
	{
		System.out.println(number);
		
		if(number == 1) {
			return counter+1;
		}
		
		if(number % 2 > 0) {
			number = 3*number + 1;
		} else {
			number = number / 2;
		}
		counter = calculateCollatze(number, counter+1);
		
		return counter;
	}
	
	public static void main(String args[])
	{
		int count = calculateCollatze(7, 0);
		System.out.println("# Anzahl Folgen bis das Ergebnis 1 ist:");
		System.out.println(count);
	}
	
}