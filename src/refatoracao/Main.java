package refatoracao;

import java.util.Scanner;

public class Main {

	static Scanner console = new Scanner(System.in);
	
	//--------------------------------------------------------------------
	static private int readIntInto(String msg, int min, int max)
	{
		int number;
		do 
		{
		   System.out.println(msg);
		   number = console.nextInt();	   
		} while(number > max || number < min);
		
		return number;
	}
	
	//--------------------------------------------------------------------
	static public int readNumberOfTerms()
	{
		String msg = "Digite o número de termos da PA:";
		
		return readIntInto(msg, 2, Integer.MAX_VALUE);
	}

	//--------------------------------------------------------------------
	static public int readFirstTerm()
	{
		String msg = "Digite o primeiro termo da PA:";
		
		return readIntInto(msg, 1, Integer.MAX_VALUE);
	}
	
	//--------------------------------------------------------------------
	static public int readCommonDifference()
	{
		String msg = "Digite a razão da PA:";
		
		return readIntInto(msg, 1, Integer.MAX_VALUE);
	}
	
	//--------------------------------------------------------------------
	static public int termOfIndex(int firstTerm, int commonDifference, int index)
	{
		return firstTerm + (index-1) * commonDifference;
	}
	
	//--------------------------------------------------------------------
	static public int sumOfAllTerms(int firstTerm, int commonDifference, int numberOfTerms)
	{
		int lastTerm = termOfIndex(firstTerm, commonDifference, numberOfTerms);
		
		return ( ((firstTerm + lastTerm) * numberOfTerms) / 2);
	}
	
	//--------------------------------------------------------------------
	static public void printAllTerms(int firstTerm, int commonDifference, int numberOfTerms)
	{
		for(int i=1; i<=numberOfTerms; i++)
		{
			int ithTerm = termOfIndex(firstTerm, commonDifference, i);
			
			System.out.printf("a%d=%d\n",i, ithTerm);
		}
	}
	
	//--------------------------------------------------------------------
	static public void main(String[] args)
	{
		int firstTerm, reason, numberOfTerms;
		
		firstTerm = readFirstTerm();
		reason = readCommonDifference();
		numberOfTerms = readNumberOfTerms();
		
		printAllTerms(firstTerm, reason, numberOfTerms);
		
		int sum = sumOfAllTerms(firstTerm, reason, numberOfTerms);
		System.out.println("A soma é: " + sum);
		
		console.close();
	}
}
