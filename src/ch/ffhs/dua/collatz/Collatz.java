package ch.ffhs.dua.collatz;

public class Collatz {

	public static int calculateCollatze(int number)
	{
		System.out.println(number);
		if(number == 1) {
			return number;
		}
		
		if(number % 2 > 0) {
			number = 3*number + 1;
		} else {
			number = number / 2;
		}
		number = calculateCollatze(number);
		
		return number;
	}
	
	public static void main(String args[])
	{
		calculateCollatze(19);
	}
	
}